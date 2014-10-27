package patterns;

import DiffModel.SetAttribute;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.WT;
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
import patterns.SetAttributeMatch;
import patterns.util.SetAttributeQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.setAttribute pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SetAttributeMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern setAttribute(setAttrOp : SetAttribute, target : IdentifiableWTElement, wt : WT) {
 * 	WT(wt);
 * 	IdentifiableWTElement.ID(target, id);
 * 	SetAttribute.targetId(setAttrOp, id);
 * }
 * </pre></code>
 * 
 * @see SetAttributeMatch
 * @see SetAttributeProcessor
 * @see SetAttributeQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SetAttributeMatcher extends BaseMatcher<SetAttributeMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SetAttributeMatcher> querySpecification() throws IncQueryException {
    return SetAttributeQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SetAttributeMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SetAttributeMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SetAttributeMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_SETATTROP = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static int POSITION_WT = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SetAttributeMatcher.class);
  
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
  public SetAttributeMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SetAttributeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return matches represented as a SetAttributeMatch object.
   * 
   */
  public Collection<SetAttributeMatch> getAllMatches(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt) {
    return rawGetAllMatches(new Object[]{pSetAttrOp, pTarget, pWt});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return a match represented as a SetAttributeMatch object, or null if no match is found.
   * 
   */
  public SetAttributeMatch getOneArbitraryMatch(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt) {
    return rawGetOneArbitraryMatch(new Object[]{pSetAttrOp, pTarget, pWt});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt) {
    return rawHasMatch(new Object[]{pSetAttrOp, pTarget, pWt});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt) {
    return rawCountMatches(new Object[]{pSetAttrOp, pTarget, pWt});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt, final IMatchProcessor<? super SetAttributeMatch> processor) {
    rawForEachMatch(new Object[]{pSetAttrOp, pTarget, pWt}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt, final IMatchProcessor<? super SetAttributeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSetAttrOp, pTarget, pWt}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SetAttributeMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pSetAttrOp, pTarget, pWt});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSetAttrOp the fixed value of pattern parameter setAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SetAttributeMatch newMatch(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget, final WT pWt) {
    return new SetAttributeMatch.Immutable(pSetAttrOp, pTarget, pWt);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for setAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SetAttribute> rawAccumulateAllValuesOfsetAttrOp(final Object[] parameters) {
    Set<SetAttribute> results = new HashSet<SetAttribute>();
    rawAccumulateAllValues(POSITION_SETATTROP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for setAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetAttribute> getAllValuesOfsetAttrOp() {
    return rawAccumulateAllValuesOfsetAttrOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetAttribute> getAllValuesOfsetAttrOp(final SetAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfsetAttrOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setAttrOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetAttribute> getAllValuesOfsetAttrOp(final IdentifiableWTElement pTarget, final WT pWt) {
    return rawAccumulateAllValuesOfsetAttrOp(new Object[]{null, pTarget, pWt});
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
  public Set<IdentifiableWTElement> getAllValuesOftarget(final SetAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<IdentifiableWTElement> getAllValuesOftarget(final SetAttribute pSetAttrOp, final WT pWt) {
    return rawAccumulateAllValuesOftarget(new Object[]{pSetAttrOp, null, pWt});
  }
  
  /**
   * Retrieve the set of values that occur in matches for wt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<WT> rawAccumulateAllValuesOfwt(final Object[] parameters) {
    Set<WT> results = new HashSet<WT>();
    rawAccumulateAllValues(POSITION_WT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for wt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfwt() {
    return rawAccumulateAllValuesOfwt(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfwt(final SetAttributeMatch partialMatch) {
    return rawAccumulateAllValuesOfwt(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for wt.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<WT> getAllValuesOfwt(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget) {
    return rawAccumulateAllValuesOfwt(new Object[]{pSetAttrOp, pTarget, null});
  }
  
  @Override
  protected SetAttributeMatch tupleToMatch(final Tuple t) {
    try {
      return new SetAttributeMatch.Immutable((DiffModel.SetAttribute) t.get(POSITION_SETATTROP), (WTSpecID.IdentifiableWTElement) t.get(POSITION_TARGET), (WTSpecID.WT) t.get(POSITION_WT));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SetAttributeMatch arrayToMatch(final Object[] match) {
    try {
      return new SetAttributeMatch.Immutable((DiffModel.SetAttribute) match[POSITION_SETATTROP], (WTSpecID.IdentifiableWTElement) match[POSITION_TARGET], (WTSpecID.WT) match[POSITION_WT]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SetAttributeMatch arrayToMatchMutable(final Object[] match) {
    try {
      return new SetAttributeMatch.Mutable((DiffModel.SetAttribute) match[POSITION_SETATTROP], (WTSpecID.IdentifiableWTElement) match[POSITION_TARGET], (WTSpecID.WT) match[POSITION_WT]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
