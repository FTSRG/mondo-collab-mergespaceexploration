package patterns;

import DiffModel.Create;
import ModelContainer.MainRoot;
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
import patterns.CreateMatch;
import patterns.util.CreateQuerySpecification;

/**
 * Generated pattern matcher API of the patterns.create pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CreateMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //pattern allIdentifiable(target : IdentifiableWTElement) {
 * //	IdentifiableWTElement.ID(target, _id);
 * //}
 * 
 * //pattern operations(op : Identifiable) {
 * //	Identifiable(op);
 * //}
 * //
 * //pattern countOperations() {
 * //	N == count find operations(_op);
 * //	check (N == 0);
 * //}
 * 
 * pattern create(createOp : Create, mainRoot : MainRoot) {
 * 	MainRoot(mainRoot);
 * 	Create(createOp);
 * }
 * </pre></code>
 * 
 * @see CreateMatch
 * @see CreateProcessor
 * @see CreateQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CreateMatcher extends BaseMatcher<CreateMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CreateMatcher> querySpecification() throws IncQueryException {
    return CreateQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CreateMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CreateMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CreateMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CREATEOP = 0;
  
  private final static int POSITION_MAINROOT = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CreateMatcher.class);
  
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
  public CreateMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CreateMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return matches represented as a CreateMatch object.
   * 
   */
  public Collection<CreateMatch> getAllMatches(final Create pCreateOp, final MainRoot pMainRoot) {
    return rawGetAllMatches(new Object[]{pCreateOp, pMainRoot});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return a match represented as a CreateMatch object, or null if no match is found.
   * 
   */
  public CreateMatch getOneArbitraryMatch(final Create pCreateOp, final MainRoot pMainRoot) {
    return rawGetOneArbitraryMatch(new Object[]{pCreateOp, pMainRoot});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Create pCreateOp, final MainRoot pMainRoot) {
    return rawHasMatch(new Object[]{pCreateOp, pMainRoot});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Create pCreateOp, final MainRoot pMainRoot) {
    return rawCountMatches(new Object[]{pCreateOp, pMainRoot});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Create pCreateOp, final MainRoot pMainRoot, final IMatchProcessor<? super CreateMatch> processor) {
    rawForEachMatch(new Object[]{pCreateOp, pMainRoot}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Create pCreateOp, final MainRoot pMainRoot, final IMatchProcessor<? super CreateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pCreateOp, pMainRoot}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<CreateMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Create pCreateOp, final MainRoot pMainRoot) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pCreateOp, pMainRoot});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CreateMatch newMatch(final Create pCreateOp, final MainRoot pMainRoot) {
    return CreateMatch.newMatch(pCreateOp, pMainRoot);
    
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
  public Set<Create> getAllValuesOfcreateOp(final CreateMatch partialMatch) {
    return rawAccumulateAllValuesOfcreateOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for createOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Create> getAllValuesOfcreateOp(final MainRoot pMainRoot) {
    return rawAccumulateAllValuesOfcreateOp(new Object[]{null, pMainRoot});
  }
  
  /**
   * Retrieve the set of values that occur in matches for mainRoot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MainRoot> rawAccumulateAllValuesOfmainRoot(final Object[] parameters) {
    Set<MainRoot> results = new HashSet<MainRoot>();
    rawAccumulateAllValues(POSITION_MAINROOT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for mainRoot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MainRoot> getAllValuesOfmainRoot() {
    return rawAccumulateAllValuesOfmainRoot(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mainRoot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MainRoot> getAllValuesOfmainRoot(final CreateMatch partialMatch) {
    return rawAccumulateAllValuesOfmainRoot(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for mainRoot.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MainRoot> getAllValuesOfmainRoot(final Create pCreateOp) {
    return rawAccumulateAllValuesOfmainRoot(new Object[]{pCreateOp, null});
  }
  
  @Override
  protected CreateMatch tupleToMatch(final Tuple t) {
    try {
      return CreateMatch.newMatch((DiffModel.Create) t.get(POSITION_CREATEOP), (ModelContainer.MainRoot) t.get(POSITION_MAINROOT));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CreateMatch arrayToMatch(final Object[] match) {
    try {
      return CreateMatch.newMatch((DiffModel.Create) match[POSITION_CREATEOP], (ModelContainer.MainRoot) match[POSITION_MAINROOT]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected CreateMatch arrayToMatchMutable(final Object[] match) {
    try {
      return CreateMatch.newMutableMatch((DiffModel.Create) match[POSITION_CREATEOP], (ModelContainer.MainRoot) match[POSITION_MAINROOT]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
