package patterns;

import DiffModel.ResetAttribute;
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
import patterns.ResetAttributeMatch;
import patterns.util.ResetAttributeQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.resetAttribute pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ResetAttributeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern resetAttribute(resetAttrOp : ResetAttribute, target : IdentifiableWTElement) {
 * 	IdentifiableWTElement.ID(target, id);
 * 	ResetAttribute.id(resetAttrOp, id);
 * }
 * </pre></code>
 * 
 * @see ResetAttributeMatch
 * @see ResetAttributeProcessor
 * @see ResetAttributeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ResetAttributeMatcher extends BaseMatcher<ResetAttributeMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<ResetAttributeMatcher> querySpecification() throws IncQueryException {
    return ResetAttributeQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ResetAttributeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ResetAttributeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ResetAttributeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_RESETATTROP = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ResetAttributeMatcher.class);
  
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
  public ResetAttributeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ResetAttributeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return matches represented as a ResetAttributeMatch object.
   * 
   */
  public Collection<ResetAttributeMatch> getAllMatches(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return rawGetAllMatches(new Object[]{pResetAttrOp, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return a match represented as a ResetAttributeMatch object, or null if no match is found.
   * 
   */
  public ResetAttributeMatch getOneArbitraryMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pResetAttrOp, pTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return rawHasMatch(new Object[]{pResetAttrOp, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return rawCountMatches(new Object[]{pResetAttrOp, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget, final IMatchProcessor<? super ResetAttributeMatch> processor) {
    rawForEachMatch(new Object[]{pResetAttrOp, pTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget, final IMatchProcessor<? super ResetAttributeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pResetAttrOp, pTarget}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<ResetAttributeMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pResetAttrOp, pTarget});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ResetAttributeMatch newMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return new ResetAttributeMatch.Immutable(pResetAttrOp, pTarget);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for resetAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ResetAttribute> rawAccumulateAllValuesOfresetAttrOp(final Object[] parameters) {
    Set<ResetAttribute> results = new HashSet<ResetAttribute>();
    rawAccumulateAllValues(POSITION_RESETATTROP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for resetAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResetAttribute> getAllValuesOfresetAttrOp() {
    return rawAccumulateAllValuesOfresetAttrOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for resetAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResetAttribute> getAllValuesOfresetAttrOp(final ResetAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfresetAttrOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for resetAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ResetAttribute> getAllValuesOfresetAttrOp(final IdentifiableWTElement pTarget) {
    return rawAccumulateAllValuesOfresetAttrOp(new Object[]{null, pTarget});
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
  public Set<IdentifiableWTElement> getAllValuesOftarget(final ResetAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOftarget(final ResetAttribute pResetAttrOp) {
    return rawAccumulateAllValuesOftarget(new Object[]{pResetAttrOp, null});
  }
  
  @Override
  protected ResetAttributeMatch tupleToMatch(final Tuple t) {
    try {
      return new ResetAttributeMatch.Immutable((DiffModel.ResetAttribute) t.get(POSITION_RESETATTROP), (WTSpecID.IdentifiableWTElement) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected ResetAttributeMatch arrayToMatch(final Object[] match) {
    try {
      return new ResetAttributeMatch.Immutable((DiffModel.ResetAttribute) match[POSITION_RESETATTROP], (WTSpecID.IdentifiableWTElement) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected ResetAttributeMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new ResetAttributeMatch.Mutable((DiffModel.ResetAttribute) match[POSITION_RESETATTROP], (WTSpecID.IdentifiableWTElement) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
