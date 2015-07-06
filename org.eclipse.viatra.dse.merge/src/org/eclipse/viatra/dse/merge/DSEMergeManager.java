package org.eclipse.viatra.dse.merge;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.dse.api.SolutionTrajectory;
import org.eclipse.viatra.dse.base.DesignSpaceManager;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.ModelPackage;
import org.eclipse.viatra.dse.merge.queries.ExecutableDeleteChangeMatch;
import org.eclipse.viatra.dse.merge.queries.ExecutableDeleteChangeMatcher;
import org.eclipse.viatra.dse.merge.queries.util.ExecutableDeleteChangeQuerySpecification;
import org.eclipse.viatra.dse.merge.scope.DSEMergeScope;
import org.eclipse.viatra.dse.merge.scope.ScopeFactory;
import org.eclipse.viatra.dse.merge.scope.ScopePackage;
import org.eclipse.viatra.dse.objectives.impl.ModelQueriesHardObjective;
import org.eclipse.viatra.dse.objectives.impl.ModelQueryType;
import org.eclipse.viatra.dse.util.EMFHelper;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class DSEMergeManager {

	private static Map<String,DSEMergeConfigurator> configuratorMapping;
	public static String CONFIGURATION_POINT = "org.eclipse.viatra.dse.merge.configuration";
	public static String URI_ATTRIBUTE = "epackageURI";
	public static String CLASS_ATTRIBUTE = "class";
	
	private ChangeSet local;
	private ChangeSet remote;
	private EObject original; 
	private DSEMergeScope scope;
	private DesignSpaceExplorer dse;
	private EPackage metamodel;
	
	private Collection<DSETransformationRule<?,?>> rules;
	private Collection<IQuerySpecification<?>> objectives;
	
	static Logger logger = Logger.getLogger(DSEMergeManager.class);
	
	private IQuerySpecification<IncQueryMatcher<IPatternMatch>> id2eobject;
	
	public ChangeSet getLocal() {
		return local;
	}
	public ChangeSet getRemote() {
		return remote;
	}
	public EObject getOriginal() {
		return original;
	}
	
	private void setMetamodel(EPackage metamodel) {
		this.metamodel = metamodel;
	}
	
	private void setRules(Collection<DSETransformationRule<?,?>> rules) {
		this.rules = rules;
	}
	
	private void setObjectives(Collection<IQuerySpecification<?>> objectives) {
		this.objectives = objectives;
	}
	
	@SuppressWarnings("unchecked")
	public void setId2EObject(IQuerySpecification<?> querySpecification) {
		this.id2eobject = (IQuerySpecification<IncQueryMatcher<IPatternMatch>>) querySpecification;
	}
	
	private DSEMergeManager(EObject original, ChangeSet local, ChangeSet remote) {
		this.original = original;
		this.local = local;
		this.remote = remote;
		
		scope = ScopeFactory.eINSTANCE.createDSEMergeScope();
		scope.setRemote(remote);
		scope.setLocal(local);
		scope.setOrigin(EMFHelper.clone(original));	
		scope.setCemetery(ScopeFactory.eINSTANCE.createCemetery());
		
		DSEMergeConfigurator configurator = configuratorMapping.get(original.eClass().getEPackage().getNsURI());
		if(configurator != null) {
			this.setMetamodel(configurator.getMetamodel());
			try {
				this.setId2EObject(configurator.getId2EObject());
				this.setObjectives(configurator.getObjectives());
				this.setRules(configurator.getRules());
			} catch (IncQueryException e) {
				logger.error(e.getMessage());
			}			
		}
		
		dse = new DesignSpaceExplorer();
	}
	
	public static DSEMergeManager create(EObject original, ChangeSet local, ChangeSet remote) {
		if(configuratorMapping == null)
			initializeConfiguration();
		return new DSEMergeManager(original, local, remote);
	}
	
	private static void initializeConfiguration() {
		try {
			configuratorMapping = Maps.newHashMap();
			IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(CONFIGURATION_POINT);
			for (IExtension ext : extensionPoint.getExtensions()) {
				
				for(IConfigurationElement conf : ext.getConfigurationElements()) {
					String uri = conf.getAttribute(URI_ATTRIBUTE);
					DSEMergeConfigurator configurator;
						configurator = (DSEMergeConfigurator) conf.createExecutableExtension(CLASS_ATTRIBUTE);
					if(uri != null && configurator != null)
						configuratorMapping.put(uri, configurator);
				}
			}
		} catch (InvalidRegistryObjectException | CoreException e) {
			logger.error(e.getMessage());
		}
	}
	public Collection<Solution> start() {
		dse.addMetaModelPackage(metamodel);
		dse.addMetaModelPackage(ScopePackage.eINSTANCE);
		dse.addMetaModelPackage(ModelPackage.eINSTANCE);
		
		dse.setInitialModel(scope);
		dse.setStateCoderFactory(new DSEMergeSerializerFactory());
		
		ModelQueriesHardObjective modelQueriesHardObjective = new ModelQueriesHardObjective();
		for (IQuerySpecification<?> objective : objectives) {
			modelQueriesHardObjective.withConstraint(objective);
		}
		dse.addObjective(modelQueriesHardObjective.withType(ModelQueryType.NO_MATCH));
		
		for (DSETransformationRule<?,?> rule : rules) {
			dse.addTransformationRule(rule);
		}
		
		try {
			dse.addTransformationRule(new DSETransformationRule<ExecutableDeleteChangeMatch, ExecutableDeleteChangeMatcher>(ExecutableDeleteChangeQuerySpecification.instance(), new DefaultMatchProcessor<ExecutableDeleteChangeMatch>()));
			dse.addTransformationRule(new DSETransformationRule<IPatternMatch, IncQueryMatcher<IPatternMatch>>(id2eobject, new DefaultMatchProcessor<IPatternMatch>()));
		} catch (IncQueryException e) {
			e.printStackTrace();
		}
		
		DSEMergeStrategy strategy = new DSEMergeStrategy();
		strategy.setId2EObject(id2eobject);
		dse.setMaxNumberOfThreads(4);
		dse.startExploration(strategy);
		
		return buildSolutions(dse.getSolutions());
	}
	
	private Collection<Solution> buildSolutions(Collection<org.eclipse.viatra.dse.api.Solution> solutions) {
		Collection<Solution> s = Lists.newArrayList();
		for (org.eclipse.viatra.dse.api.Solution solution : solutions) {
			s.add(new Solution(scope, solution));
		}
		return s;
	}
	
	private class DefaultMatchProcessor<T extends IPatternMatch> implements IMatchProcessor<T> {

		@Override
		public void process(T match) {
		}
		
	}
	
	public class Solution {
		
		private org.eclipse.viatra.dse.api.Solution solution;
		private DSEMergeScope scope;
		private boolean applied = false;
		
		public Solution(DSEMergeScope scope, org.eclipse.viatra.dse.api.Solution solution) {
			this.scope = (DSEMergeScope) EMFHelper.clone(scope);
			this.solution = solution;
		}
		
		public DSEMergeScope getScope() {
			if(!applied)
				applyMerge();
			return scope;
		}
		
		private void applyMerge() {
			try {
				SolutionTrajectory trajectory = solution.getShortestTrajectory();
				trajectory.setModel(this.scope);		
				trajectory.doTransformation();
				applied = true;
			} catch (IncQueryException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Solution:\n");
			SolutionTrajectory trajectory = solution.getShortestTrajectory();
			List<Object> list = trajectory.getActivationCodes();
			for (Object l : list) {
				sb.append(l);
			}
			return sb.toString();
		}
	}
}
