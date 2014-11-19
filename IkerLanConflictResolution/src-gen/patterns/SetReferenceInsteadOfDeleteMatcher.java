package patterns;

import DseMergeDiffModel.Delete;
import DseMergeDiffModel.SetReference;
import org.apache.log4j.Logger;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
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
  
  public SetReferenceInsteadOfDeleteMatcher() {
  }
  
  public SetReferenceInsteadOfDeleteMatcher() {
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return matches represented as a SetReferenceInsteadOfDeleteMatch object.
   * 
   */
  public java.util.Collection getAllMatches(final Delete pDeleteOp, final SetReference pSetRefOp) {
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
  public void forEachMatch(final Delete pDeleteOp, final SetReference pSetRefOp, final /* IMatchProcessor<? super SetReferenceInsteadOfDeleteMatch> */Object processor) {
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
  public boolean forOneArbitraryMatch(final Delete pDeleteOp, final SetReference pSetRefOp, final /* IMatchProcessor<? super SetReferenceInsteadOfDeleteMatch> */Object processor) {
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
  public DeltaMonitor<SetReferenceInsteadOfDeleteMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Delete pDeleteOp, final SetReference pSetRefOp);
  
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
  protected java.util.Set rawAccumulateAllValuesOfdeleteOp(final /* type is 'null' */ parameters) {
    java.util.Set results = new java.util.HashSet();
    rawAccumulateAllValues(POSITION_DELETEOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public java.util.Set getAllValuesOfdeleteOp() {
    return rawAccumulateAllValuesOfdeleteOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public java.util.Set getAllValuesOfdeleteOp(final SetReferenceInsteadOfDeleteMatch partialMatch) {
    return rawAccumulateAllValuesOfdeleteOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deleteOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public java.util.Set getAllValuesOfdeleteOp(final SetReference pSetRefOp) {
    return rawAccumulateAllValuesOfdeleteOp(new Object[]{null, pSetRefOp});
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected java.util.Set rawAccumulateAllValuesOfsetRefOp(final /* type is 'null' */ parameters) {
    java.util.Set results = new java.util.HashSet();
    rawAccumulateAllValues(POSITION_SETREFOP, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public java.util.Set getAllValuesOfsetRefOp() {
    return rawAccumulateAllValuesOfsetRefOp(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public java.util.Set getAllValuesOfsetRefOp(final SetReferenceInsteadOfDeleteMatch partialMatch) {
    return rawAccumulateAllValuesOfsetRefOp(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for setRefOp.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public java.util.Set getAllValuesOfsetRefOp(final Delete pDeleteOp) {
    return rawAccumulateAllValuesOfsetRefOp(new Object[]{pDeleteOp, null});
  }
  
  public SetReferenceInsteadOfDeleteMatch tupleToMatch() {
    try {
      return SetReferenceInsteadOfDeleteMatch.newMatch((DseMergeDiffModel.Delete) t.get(POSITION_DELETEOP), (DseMergeDiffModel.SetReference) t.get(POSITION_SETREFOP));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  public SetReferenceInsteadOfDeleteMatch arrayToMatch() {
    try {
      return SetReferenceInsteadOfDeleteMatch.newMatch((DseMergeDiffModel.Delete) match[POSITION_DELETEOP], (DseMergeDiffModel.SetReference) match[POSITION_SETREFOP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  public SetReferenceInsteadOfDeleteMatch arrayToMatchMutable() {
    try {
      return SetReferenceInsteadOfDeleteMatch.newMutableMatch((DseMergeDiffModel.Delete) match[POSITION_DELETEOP], (DseMergeDiffModel.SetReference) match[POSITION_SETREFOP]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}
