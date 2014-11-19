package patterns;

import DseMergeDiffModel.SetReference;
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
import patterns.SetReferenceMatch;
import patterns.util.SetReferenceQuerySpecification;
import wtspecid.IdentifiableWTElement;

/**
 * Generated pattern matcher API of the patterns.setReference pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SetReferenceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern setReference(setRefOp : SetReference, target : IdentifiableWTElement, ref : IdentifiableWTElement) {
 * 	IdentifiableWTElement.ID(target, id);
 * 	SetReference.targetID(setRefOp, id);
 * 	IdentifiableWTElement.ID(ref, id2);
 * 	SetReference.refID(setRefOp, id2);
 * }
 * </pre></code>
 * 
 * @see SetReferenceMatch
 * @see SetReferenceProcessor
 * @see SetReferenceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SetReferenceMatcher extends BaseMatcher<SetReferenceMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SetReferenceMatcher> querySpecification() throws IncQueryException {
    return SetReferenceQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SetReferenceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SetReferenceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SetReferenceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SETREFOP = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static int POSITION_REF = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SetReferenceMatcher.class);
  
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
  public SetReferenceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SetReferenceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return matches represented as a SetReferenceMatch object.
   * 
   */
  public Collection<SetReferenceMatch> getAllMatches(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawGetAllMatches(new Object[]{pSetRefOp, pTarget, pRef});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return a match represented as a SetReferenceMatch object, or null if no match is found.
   * 
   */
  public SetReferenceMatch getOneArbitraryMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawGetOneArbitraryMatch(new Object[]{pSetRefOp, pTarget, pRef});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawHasMatch(new Object[]{pSetRefOp, pTarget, pRef});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawCountMatches(new Object[]{pSetRefOp, pTarget, pRef});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef, final IMatchProcessor<? super SetReferenceMatch> processor) {
    rawForEachMatch(new Object[]{pSetRefOp, pTarget, pRef}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef, final IMatchProcessor<? super SetReferenceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSetRefOp, pTarget, pRef}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SetReferenceMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSetRefOp, pTarget, pRef});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SetReferenceMatch newMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return SetReferenceMatch.newMatch(pSetRefOp, pTarget, pRef);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SetReference> rawAccumulateAllValuesOfsetRefOp(final Object[] parameters) {
    Set<SetReference> results = new HashSet<SetReference>();
    rawAccumulateAllValues(POSITION_SETREFOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetReference> getAllValuesOfsetRefOp() {
    return rawAccumulateAllValuesOfsetRefOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetReference> getAllValuesOfsetRefOp(final SetReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfsetRefOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetReference> getAllValuesOfsetRefOp(final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return rawAccumulateAllValuesOfsetRefOp(new Object[]{null, pTarget, pRef});
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
  public Set<IdentifiableWTElement> getAllValuesOftarget(final SetReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOftarget(final SetReference pSetRefOp, final IdentifiableWTElement pRef) {
    return rawAccumulateAllValuesOftarget(new Object[]{pSetRefOp, null, pRef});
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
  public Set<IdentifiableWTElement> getAllValuesOfref(final SetReferenceMatch partialMatch) {
    return rawAccumulateAllValuesOfref(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ref.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOfref(final SetReference pSetRefOp, final IdentifiableWTElement pTarget) {
    return rawAccumulateAllValuesOfref(new Object[]{pSetRefOp, pTarget, null});
  }
  
  @Override
  protected SetReferenceMatch tupleToMatch(final Tuple t) {
    try {
      return SetReferenceMatch.newMatch((DseMergeDiffModel.SetReference) t.get(POSITION_SETREFOP), (wtspecid.IdentifiableWTElement) t.get(POSITION_TARGET), (wtspecid.IdentifiableWTElement) t.get(POSITION_REF));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SetReferenceMatch arrayToMatch(final Object[] match) {
    try {
      return SetReferenceMatch.newMatch((DseMergeDiffModel.SetReference) match[POSITION_SETREFOP], (wtspecid.IdentifiableWTElement) match[POSITION_TARGET], (wtspecid.IdentifiableWTElement) match[POSITION_REF]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SetReferenceMatch arrayToMatchMutable(final Object[] match) {
    try {
      return SetReferenceMatch.newMutableMatch((DseMergeDiffModel.SetReference) match[POSITION_SETREFOP], (wtspecid.IdentifiableWTElement) match[POSITION_TARGET], (wtspecid.IdentifiableWTElement) match[POSITION_REF]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
