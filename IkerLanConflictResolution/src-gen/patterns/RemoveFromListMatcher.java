package patterns;

import DiffModel.RemoveFromList;
import WTSpecID.IdentifiableWTElement;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;
import patterns.RemoveFromListMatch;
import patterns.util.RemoveFromListQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.removeFromList pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RemoveFromListMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern removeFromList(removeFromListOp : RemoveFromList, target : IdentifiableWTElement, ref : IdentifiableWTElement) {
 * 	IdentifiableWTElement.ID(target, id);
 * 	RemoveFromList.targetId(removeFromListOp, id);
 * 	IdentifiableWTElement.ID(ref, id2);
 * 	RemoveFromList.refID(removeFromListOp, id2);
 * }
 * </pre></code>
 * 
 * @see RemoveFromListMatch
 * @see RemoveFromListProcessor
 * @see RemoveFromListQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RemoveFromListMatcher extends BaseMatcher<RemoveFromListMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<RemoveFromListMatcher> querySpecification() throws IncQueryException {
    return RemoveFromListQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RemoveFromListMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RemoveFromListMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RemoveFromListMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REMOVEFROMLISTOP = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static int POSITION_REF = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RemoveFromListMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public RemoveFromListMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public RemoveFromListMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return matches represented as a RemoveFromListMatch object.
   * 
   */
  public Collection<RemoveFromListMatch> getAllMatches(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawGetAllMatches(new Object[]{pRemoveFromListOp, pTarget, pRef});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return a match represented as a RemoveFromListMatch object, or null if no match is found.
   * 
   */
  public RemoveFromListMatch getOneArbitraryMatch(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawGetOneArbitraryMatch(new Object[]{pRemoveFromListOp, pTarget, pRef});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawHasMatch(new Object[]{pRemoveFromListOp, pTarget, pRef});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawCountMatches(new Object[]{pRemoveFromListOp, pTarget, pRef});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef, final IMatchProcessor<? super RemoveFromListMatch> processor) {
    rawForEachMatch(new Object[]{pRemoveFromListOp, pTarget, pRef}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef, final IMatchProcessor<? super RemoveFromListMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRemoveFromListOp, pTarget, pRef}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<RemoveFromListMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pRemoveFromListOp, pTarget, pRef});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRemoveFromListOp the fixed value of pattern parameter removeFromListOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RemoveFromListMatch newMatch(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return RemoveFromListMatch.newMatch(pRemoveFromListOp, pTarget, pRef);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for removeFromListOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RemoveFromList> rawAccumulateAllValuesOfremoveFromListOp(final Object[] parameters) {
    Set<RemoveFromList> results = new HashSet<RemoveFromList>();
    rawAccumulateAllValues(POSITION_REMOVEFROMLISTOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for removeFromListOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RemoveFromList> getAllValuesOfremoveFromListOp() {
    return rawAccumulateAllValuesOfremoveFromListOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for removeFromListOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RemoveFromList> getAllValuesOfremoveFromListOp(final RemoveFromListMatch partialMatch) {
    return rawAccumulateAllValuesOfremoveFromListOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for removeFromListOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RemoveFromList> getAllValuesOfremoveFromListOp(final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawAccumulateAllValuesOfremoveFromListOp(new Object[]{null, pTarget, pRef});
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<IdentifiableWTElement> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<IdentifiableWTElement> results = new HashSet<IdentifiableWTElement>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOftarget(final RemoveFromListMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOftarget(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pRef) {
    return rawAccumulateAllValuesOftarget(new Object[]{pRemoveFromListOp, null, pRef});
  }
  
  /**
   * Retrieve the set of values that occur in matches for ref.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<IdentifiableWTElement> rawAccumulateAllValuesOfref(final Object[] parameters) {
    Set<IdentifiableWTElement> results = new HashSet<IdentifiableWTElement>();
    rawAccumulateAllValues(POSITION_REF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ref.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOfref() {
    return rawAccumulateAllValuesOfref(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ref.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOfref(final RemoveFromListMatch partialMatch) {
    return rawAccumulateAllValuesOfref(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ref.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOfref(final RemoveFromList pRemoveFromListOp, final IdentifiableWTElement pTarget) {
    return rawAccumulateAllValuesOfref(new Object[]{pRemoveFromListOp, pTarget, null});
  }
  
  @Override
  protected RemoveFromListMatch tupleToMatch(final Tuple t) {
    try {
      return RemoveFromListMatch.newMatch((DiffModel.RemoveFromList) t.get(POSITION_REMOVEFROMLISTOP), (WTSpecID.IdentifiableWTElement) t.get(POSITION_TARGET), (WTSpecID.IdentifiableWTElement) t.get(POSITION_REF));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected RemoveFromListMatch arrayToMatch(final Object[] match) {
    try {
      return RemoveFromListMatch.newMatch((DiffModel.RemoveFromList) match[POSITION_REMOVEFROMLISTOP], (WTSpecID.IdentifiableWTElement) match[POSITION_TARGET], (WTSpecID.IdentifiableWTElement) match[POSITION_REF]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected RemoveFromListMatch arrayToMatchMutable(final Object[] match) {
    try {
      return RemoveFromListMatch.newMutableMatch((DiffModel.RemoveFromList) match[POSITION_REMOVEFROMLISTOP], (WTSpecID.IdentifiableWTElement) match[POSITION_TARGET], (WTSpecID.IdentifiableWTElement) match[POSITION_REF]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
