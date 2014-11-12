package patterns;

import DiffModel.Delete;
import DiffModel.SetReference;
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
import patterns.SetReferenceInsteadOfDeleteMatch;
import patterns.util.SetReferenceInsteadOfDeleteQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.setReferenceInsteadOfDelete pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SetReferenceInsteadOfDeleteMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern setReferenceInsteadOfDelete(deleteOp : Delete, setRefOp : SetReference) {
 * 	Delete.targetID(deleteOp, id);
 * 	SetReference.targetID(setRefOp, id);
 * }
 * or {
 * 	Delete.targetID(deleteOp, id);
 * 	SetReference.refID(setRefOp, id);
 * }
 * </pre></code>
 * 
 * @see SetReferenceInsteadOfDeleteMatch
 * @see SetReferenceInsteadOfDeleteProcessor
 * @see SetReferenceInsteadOfDeleteQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SetReferenceInsteadOfDeleteMatcher extends BaseMatcher<SetReferenceInsteadOfDeleteMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<SetReferenceInsteadOfDeleteMatcher> querySpecification() throws IncQueryException {
    return SetReferenceInsteadOfDeleteQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SetReferenceInsteadOfDeleteMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SetReferenceInsteadOfDeleteMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SetReferenceInsteadOfDeleteMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DELETEOP = 0;
  
  private final static int POSITION_SETREFOP = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SetReferenceInsteadOfDeleteMatcher.class);
  
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
  public SetReferenceInsteadOfDeleteMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SetReferenceInsteadOfDeleteMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return matches represented as a SetReferenceInsteadOfDeleteMatch object.
   * 
   */
  public Collection<SetReferenceInsteadOfDeleteMatch> getAllMatches(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return rawGetAllMatches(new Object[]{pDeleteOp, pSetRefOp});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return a match represented as a SetReferenceInsteadOfDeleteMatch object, or null if no match is found.
   * 
   */
  public SetReferenceInsteadOfDeleteMatch getOneArbitraryMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return rawGetOneArbitraryMatch(new Object[]{pDeleteOp, pSetRefOp});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return rawHasMatch(new Object[]{pDeleteOp, pSetRefOp});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return rawCountMatches(new Object[]{pDeleteOp, pSetRefOp});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Delete pDeleteOp, final SetReference pSetRefOp, final IMatchProcessor<? super SetReferenceInsteadOfDeleteMatch> processor) {
    rawForEachMatch(new Object[]{pDeleteOp, pSetRefOp}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Delete pDeleteOp, final SetReference pSetRefOp, final IMatchProcessor<? super SetReferenceInsteadOfDeleteMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDeleteOp, pSetRefOp}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SetReferenceInsteadOfDeleteMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Delete pDeleteOp, final SetReference pSetRefOp) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pDeleteOp, pSetRefOp});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SetReferenceInsteadOfDeleteMatch newMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return SetReferenceInsteadOfDeleteMatch.newMatch(pDeleteOp, pSetRefOp);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Delete> rawAccumulateAllValuesOfdeleteOp(final Object[] parameters) {
    Set<Delete> results = new HashSet<Delete>();
    rawAccumulateAllValues(POSITION_DELETEOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Delete> getAllValuesOfdeleteOp() {
    return rawAccumulateAllValuesOfdeleteOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Delete> getAllValuesOfdeleteOp(final SetReferenceInsteadOfDeleteMatch partialMatch) {
    return rawAccumulateAllValuesOfdeleteOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Delete> getAllValuesOfdeleteOp(final SetReference pSetRefOp) {
    return rawAccumulateAllValuesOfdeleteOp(new Object[]{null, pSetRefOp});
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
  public Set<SetReference> getAllValuesOfsetRefOp(final SetReferenceInsteadOfDeleteMatch partialMatch) {
    return rawAccumulateAllValuesOfsetRefOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SetReference> getAllValuesOfsetRefOp(final Delete pDeleteOp) {
    return rawAccumulateAllValuesOfsetRefOp(new Object[]{pDeleteOp, null});
  }
  
  @Override
  protected SetReferenceInsteadOfDeleteMatch tupleToMatch(final Tuple t) {
    try {
      return SetReferenceInsteadOfDeleteMatch.newMatch((DiffModel.Delete) t.get(POSITION_DELETEOP), (DiffModel.SetReference) t.get(POSITION_SETREFOP));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SetReferenceInsteadOfDeleteMatch arrayToMatch(final Object[] match) {
    try {
      return SetReferenceInsteadOfDeleteMatch.newMatch((DiffModel.Delete) match[POSITION_DELETEOP], (DiffModel.SetReference) match[POSITION_SETREFOP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected SetReferenceInsteadOfDeleteMatch arrayToMatchMutable(final Object[] match) {
    try {
      return SetReferenceInsteadOfDeleteMatch.newMutableMatch((DiffModel.Delete) match[POSITION_DELETEOP], (DiffModel.SetReference) match[POSITION_SETREFOP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
