/*******************************************************************************
 * Copyright (c) 2010-2015, Csaba Debreceni, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Csaba Debreceni - initial API and implementation
 *******************************************************************************/
package org.eclipse.viatra.dse.merge;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra.dse.api.strategy.interfaces.LocalSearchStrategyBase;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.base.ThreadContext;
import org.eclipse.viatra.dse.designspace.api.ITransition;
import org.eclipse.viatra.dse.merge.model.Attribute;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.Create;
import org.eclipse.viatra.dse.merge.model.Delete;
import org.eclipse.viatra.dse.merge.model.Feature;
import org.eclipse.viatra.dse.merge.model.Kind;
import org.eclipse.viatra.dse.merge.model.Reference;
import org.eclipse.viatra.dse.merge.scope.DSEMergeScope;
import org.eclipse.viatra.dse.merge.util.DSEMergeUtil;
import org.eclipse.viatra.dse.merge.util.FilterHelper;
import org.eclipse.viatra.dse.objectives.Fitness;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class DSEMergeStrategy extends LocalSearchStrategyBase {

    private ThreadContext context;
    private boolean isInterrupted = false;
    public static String MUST_PREFIX = "MUST_";
    public static String MAY_PREFIX = "MAY_";
    private Logger logger = Logger.getLogger(DSEMergeStrategy.class);
    private Random random = new Random();
    private DesignSpaceManager.FilterOptions filterOptions;
    private boolean onlyNewMust = false;
    private IQuerySpecification<IncQueryMatcher<IPatternMatch>> id2eobject;

    public static Multimap<Object, Delete> deleteDependencies = HashMultimap.create();
    private Set<String> usedMustTransitions = Sets.newHashSet();
    private Set<String> tempLiberateMustTransitions = Sets.newHashSet();
    private Set<String> liberateMustTransitions = Sets.newHashSet();
    private boolean forceToFinish;
    private boolean fromBacktracking;

    @Override
    public void init(ThreadContext context) {
        this.context = context;
        filterOptions = new DesignSpaceManager.FilterOptions();
        filterOptions.nothingIfCut().nothingIfGoal().untraversedOnly();
        try {
            initializeDeleteDependencies();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Building up the delete dependencies based on the scope
     * 
     * @throws Exception
     */
    private void initializeDeleteDependencies() throws Exception {
        DSEMergeScope scope = (DSEMergeScope) context.getEditingDomain().getResourceSet().getResources().get(0)
                .getContents().get(0);
        buildDeleteDependencies(scope.getLocal(), scope.getRemote());
        buildDeleteDependencies(scope.getRemote(), scope.getLocal());
    }

    /**
     * Constructs the dependencies: upon removing an operation from {@link from}, selects which delete operations are
     * not allowed to execute from {@link to}
     * 
     * @param from
     * @param to
     * @throws Exception
     */
    private void buildDeleteDependencies(ChangeSet from, ChangeSet to) throws Exception {
        // This multi-map will store all the identifiers that depends on each other
        Multimap<Object, Object> dependencyGraph = ArrayListMultimap.create();

        // Iterates over all the changes in the "from" set
        for (Change change : from.getChanges()) {
            if (change instanceof Create) {
                createDependency(DSEMergeUtil.getId(((Create) change).getContainer()),
                        DSEMergeUtil.getId(((Create) change).getContainer()), dependencyGraph);
            } else if (change instanceof Attribute) {
                createDependency(DSEMergeUtil.getId(((Attribute) change).getSrc()),
                        DSEMergeUtil.getId(((Attribute) change).getSrc()), dependencyGraph);
            } else if (change instanceof Reference && ((Feature) change).getKind() != Kind.UNSET) {
                createDependency(DSEMergeUtil.getId(((Reference) change).getSrc()),
                        DSEMergeUtil.getId(((Reference) change).getSrc()), dependencyGraph);
                createDependency(DSEMergeUtil.getId(((Reference) change).getTrg()),
                        DSEMergeUtil.getId(((Reference) change).getTrg()), dependencyGraph);
            }
        }

        for (Change change : to.getChanges()) {
            if (change instanceof Delete) {
                Object toDeleteObject = DSEMergeUtil.getId(change.getSrc());
                for (Object id : dependencyGraph.get(toDeleteObject)) {
                    deleteDependencies.put(id, (Delete) change);
                }
            }
        }
    }

    /**
     * Put the dependency to the dependency graph then search for the parent of the "current" and recursively calls
     * itself. Recursivity finishes when the operations is "Create"-related, there is no "id" feature or there is no
     * more container object.
     * 
     * @param current
     * @param original
     * @param dependencyGraph
     * @throws Exception
     */
    private void createDependency(Object current, Object original, Multimap<Object, Object> dependencyGraph)
            throws Exception {
        dependencyGraph.put(current, original);

        IncQueryEngine engine = context.getIncqueryEngine();
        IncQueryMatcher<IPatternMatch> matcherForCurrent = id2eobject.getMatcher(engine);
        IPatternMatch partialMatchForCurrent = matcherForCurrent.newMatch(null, current);
        Collection<IPatternMatch> matchesForCurrent = matcherForCurrent.getAllMatches(partialMatchForCurrent);

        if (matchesForCurrent.isEmpty()) {
            return; // may create related...
        }

        if (matchesForCurrent.size() > 1) {
            throw new Exception(); // id has to be unique or not found
        }
        EObject eobject = (EObject) matchesForCurrent.iterator().next().get("eobject");
        if (eobject.eContainer() == null) {
            return; // no more parent...
        }
        EObject parent = eobject.eContainer();
        EStructuralFeature feature = parent.eClass().getEStructuralFeature("id");
        if (feature == null)
            return;
        createDependency(parent.eGet(feature), original, dependencyGraph);
    }

    @Override
    public ITransition getNextTransition(boolean lastWasSuccessful) {
        if (isInterrupted || forceToFinish) {
            return null;
        }

        DesignSpaceManager dsm = context.getDesignSpaceManager();

        // Query available transitions
        Iterable<? extends ITransition> transitions = null;
        transitions = FilterHelper.filterEmptyTransitions(dsm
                .getTransitionsFromCurrentState(filterOptions));
        transitions = restrictTransitions(transitions);

        if (fromBacktracking) {
            proccessFromBacktracking();
        }

        if (dsm.getTrajectoryInfo().getDepthFromRoot() == 0) {
            boolean needMust = FilterHelper.hasMustTransition(dsm.getCurrentState().getOutgoingTransitions());
            boolean hasMust = FilterHelper.hasMustTransition(transitions);
            if (needMust && !hasMust)
                return null;
        }

        // Backtrack if there is no transitions
        while (transitions == null || !transitions.iterator().hasNext()) {
            boolean didUndo = dsm.undoLastTransformation();
            if (!didUndo) {
                return null;
            }

            logger.debug("Backtracking as there aren't anymore transitions from this state:\n"
                    + dsm.getCurrentState().getId());

            // Update transitions
            transitions = FilterHelper.filterEmptyTransitions(dsm.getTransitionsFromCurrentState(filterOptions));
            transitions = restrictTransitions(transitions);

            logTransitionList(transitions, "After the backtracking, we found the following transitions");

        }

        // TODO: parallel execution
        // if (hasMust && transitions.size() > 1 && context.getGlobalContext().canStartNewThread()) {
        // context.getGlobalContext().tryStartNewThread(context, new DSEMergeStrategy());
        // }

        // Get a random transition from the available ones
        int index = random.nextInt(Iterables.size(transitions));
        Iterator<? extends ITransition> iterator = transitions.iterator();
        while (iterator.hasNext() && index != 0) {
            index--;
            iterator.next();
        }
        ITransition transition = iterator.next();

        logger.debug("Executing:");
        logger.debug(transition);
        logger.debug("From state:\n" + dsm.getCurrentState().getId());

        return transition;
    }

    private void proccessFromBacktracking() {
        logger.debug("We are from backtracking... (Don't forget it!)");
        usedMustTransitions.removeAll(liberateMustTransitions);
        liberateMustTransitions.clear();
        fromBacktracking = false;
    }

    private void logTransitionList(Iterable<? extends ITransition> transitions, String header) {
        logger.debug(header);
        logger.debug("Number of transitions " + Iterables.size(transitions));

        for (ITransition iTransition : transitions) {
            logger.debug(iTransition);
        }
    }

    private Iterable<? extends ITransition> restrictTransitions(Iterable<? extends ITransition> transitions) {
        logTransitionList(transitions, "All transaction");
        boolean hasMust = FilterHelper.hasMustTransition(transitions);
        if (hasMust || onlyNewMust)
            transitions = FilterHelper.filterMustTransitions(transitions);
        if (onlyNewMust)
            transitions = FilterHelper.filterAlreadyUsedTransitions(transitions, usedMustTransitions);
        logTransitionList(transitions, "Restricted transaction");
        return transitions;
    }

    @Override
    public void newStateIsProcessed(boolean isAlreadyTraversed, Fitness fitness, boolean constraintsNotSatisfied) {
        if (isAlreadyTraversed) {
            DesignSpaceManager dsm = context.getDesignSpaceManager();
            boolean isMust = dsm.getTrajectoryInfo().getLastTransition().getId().toString().startsWith(MUST_PREFIX);
            if (isMust) {
                undoUntilMust(isAlreadyTraversed, fitness, constraintsNotSatisfied, dsm);
            } else {
                if (!dsm.undoLastTransformation())
                    return;
            }
            return;
        }

        if (fitness.isSatisifiesHardObjectives()) {

            DesignSpaceManager dsm = context.getDesignSpaceManager();
            processNotTraversed(isAlreadyTraversed);
            onlyNewMust = true; // we found a solution
            undoUntilMust(isAlreadyTraversed, fitness, constraintsNotSatisfied, dsm);
            return;
        }

        processNotTraversed(isAlreadyTraversed);
    }

    private void processNotTraversed(boolean isAlreadyTraversed) {
        if (!isAlreadyTraversed && context.getDesignSpaceManager().getTrajectoryInfo().getLastTransition() != null) {

            DesignSpaceManager dsm = context.getDesignSpaceManager();
            boolean isMust = dsm.getTrajectoryInfo().getLastTransition().getId().toString().startsWith(MUST_PREFIX);
            if (isMust && !usedMustTransitions.contains(dsm.getTrajectoryInfo().getLastTransition().getId().toString())) {
                if (!usedMustTransitions.isEmpty() && dsm.getTrajectoryInfo().getFullTransitionTrajectory().size() == 1)
                    usedMustTransitions.clear();
                usedMustTransitions.add(dsm.getTrajectoryInfo().getLastTransition().getId().toString());
                onlyNewMust = false;
            }
        }
    }

    private void undoUntilMust(boolean isAlreadyTraversed, Fitness fitness, boolean constraintsNotSatisfied,
            DesignSpaceManager dsm) {
        boolean hasMust;
        logBacktrackReason(isAlreadyTraversed, fitness, constraintsNotSatisfied);
        do {
            if (!dsm.undoLastTransformation())
                return;

            logger.debug("Backtracked to the following state:\n" + dsm.getCurrentState().getId());

            liberateMustTransitions.addAll(tempLiberateMustTransitions);
            tempLiberateMustTransitions.clear();
            Iterable<? extends ITransition> transitions = FilterHelper.filterEmptyTransitions(dsm.getCurrentState()
                    .getOutgoingTransitions());
            tempLiberateMustTransitions.addAll(FilterHelper.selectTempLiberateMustTransitions(transitions,
                    usedMustTransitions));
            transitions = FilterHelper.filterEmptyTransitions(dsm.getTransitionsFromCurrentState(filterOptions));
            transitions = restrictTransitions(transitions);
            logTransitionList(transitions, "Executable operations in the backtracked state:");

            hasMust = FilterHelper.hasMustTransition(transitions);
            if (!hasMust && dsm.getTrajectoryInfo().getDepthFromRoot() == 0) {
                forceToFinish = true;
                logger.debug("We are the top and there is no more executable MUST operation... So we finished");
            }
        } while (!hasMust && dsm.getTrajectoryInfo().getDepthFromRoot() > 0);
        fromBacktracking = true;
    }

    /**
     * Logging the reason the backtrack
     * @param isAlreadyTraversed
     * @param fitness
     * @param constraintsNotSatisfied
     */
    private void logBacktrackReason(boolean isAlreadyTraversed, Fitness fitness, boolean constraintsNotSatisfied) {
        logger.debug("We have to backtrack from a state where:" 
                + "\nAlready traversed: " + isAlreadyTraversed
                + "\nGoal state: " + (fitness.isSatisifiesHardObjectives()) 
                + "\nConstraints not satisfied: " + constraintsNotSatisfied);
    }

    @Override
    public void interrupted() {
        isInterrupted = true;
    }

    /**
     * Sets the mapping query specification between identifiers and objects
     * 
     * @param querySpecification
     */
    public void setId2EObject(IQuerySpecification<IncQueryMatcher<IPatternMatch>> querySpecification) {
        this.id2eobject = querySpecification;
    }
}
