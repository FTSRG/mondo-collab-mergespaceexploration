package patterns;

import DiffModel.Create;
import DiffModel.Delete;
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
import patterns.CreateInsteadOfDeleteMatch;
import patterns.util.CreateInsteadOfDeleteQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.createInsteadOfDelete pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CreateInsteadOfDeleteMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern createInsteadOfDelete(deleteOp : Delete, createOp : Create) {
 * 	Delete.targetID(deleteOp, id);
 * 	Create.containerTargetID(createOp, id);
 * }
 * </pre></code>
 * 
 * @see CreateInsteadOfDeleteMatch
 * @see CreateInsteadOfDeleteProcessor
 * @see CreateInsteadOfDeleteQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CreateInsteadOfDeleteMatcher extends BaseMatcher<CreateInsteadOfDeleteMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CreateInsteadOfDeleteMatcher> querySpecification() throws IncQueryException {
    return CreateInsteadOfDeleteQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CreateInsteadOfDeleteMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CreateInsteadOfDeleteMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CreateInsteadOfDeleteMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DELETEOP = 0;
  
  private final static int POSITION_CREATEOP = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CreateInsteadOfDeleteMatcher.class);
  
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
  public CreateInsteadOfDeleteMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CreateInsteadOfDeleteMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return matches represented as a CreateInsteadOfDeleteMatch object.
   * 
   */
  public Collection<CreateInsteadOfDeleteMatch> getAllMatches(final Delete pDeleteOp, final Create pCreateOp) {
    return rawGetAllMatches(new Object[]{pDeleteOp, pCreateOp});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return a match represented as a CreateInsteadOfDeleteMatch object, or null if no match is found.
   * 
   */
  public CreateInsteadOfDeleteMatch getOneArbitraryMatch(final Delete pDeleteOp, final Create pCreateOp) {
    return rawGetOneArbitraryMatch(new Object[]{pDeleteOp, pCreateOp});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Delete pDeleteOp, final Create pCreateOp) {
    return rawHasMatch(new Object[]{pDeleteOp, pCreateOp});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Delete pDeleteOp, final Create pCreateOp) {
    return rawCountMatches(new Object[]{pDeleteOp, pCreateOp});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Delete pDeleteOp, final Create pCreateOp, final IMatchProcessor<? super CreateInsteadOfDeleteMatch> processor) {
    rawForEachMatch(new Object[]{pDeleteOp, pCreateOp}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Delete pDeleteOp, final Create pCreateOp, final IMatchProcessor<? super CreateInsteadOfDeleteMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDeleteOp, pCreateOp}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<CreateInsteadOfDeleteMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Delete pDeleteOp, final Create pCreateOp) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pDeleteOp, pCreateOp});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CreateInsteadOfDeleteMatch newMatch(final Delete pDeleteOp, final Create pCreateOp) {
    return CreateInsteadOfDeleteMatch.newMatch(pDeleteOp, pCreateOp);
    
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
  public Set<Delete> getAllValuesOfdeleteOp(final CreateInsteadOfDeleteMatch partialMatch) {
    return rawAccumulateAllValuesOfdeleteOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Delete> getAllValuesOfdeleteOp(final Create pCreateOp) {
    return rawAccumulateAllValuesOfdeleteOp(new Object[]{null, pCreateOp});
  }
  
  /**
   * Retrieve the set of values that occur in matches for createOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Create> rawAccumulateAllValuesOfcreateOp(final Object[] parameters) {
    Set<Create> results = new HashSet<Create>();
    rawAccumulateAllValues(POSITION_CREATEOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for createOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Create> getAllValuesOfcreateOp() {
    return rawAccumulateAllValuesOfcreateOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for createOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Create> getAllValuesOfcreateOp(final CreateInsteadOfDeleteMatch partialMatch) {
    return rawAccumulateAllValuesOfcreateOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for createOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Create> getAllValuesOfcreateOp(final Delete pDeleteOp) {
    return rawAccumulateAllValuesOfcreateOp(new Object[]{pDeleteOp, null});
  }
  
  @Override
  protected CreateInsteadOfDeleteMatch tupleToMatch(final Tuple t) {
    try {
      return CreateInsteadOfDeleteMatch.newMatch((DiffModel.Delete) t.get(POSITION_DELETEOP), (DiffModel.Create) t.get(POSITION_CREATEOP));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CreateInsteadOfDeleteMatch arrayToMatch(final Object[] match) {
    try {
      return CreateInsteadOfDeleteMatch.newMatch((DiffModel.Delete) match[POSITION_DELETEOP], (DiffModel.Create) match[POSITION_CREATEOP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CreateInsteadOfDeleteMatch arrayToMatchMutable(final Object[] match) {
    try {
      return CreateInsteadOfDeleteMatch.newMutableMatch((DiffModel.Delete) match[POSITION_DELETEOP], (DiffModel.Create) match[POSITION_CREATEOP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
