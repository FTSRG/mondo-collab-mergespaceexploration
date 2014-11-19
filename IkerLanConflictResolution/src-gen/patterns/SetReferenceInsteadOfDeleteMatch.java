package patterns;

import DseMergeDiffModel.Delete;
import DseMergeDiffModel.SetReference;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import patterns.util.SetReferenceInsteadOfDeleteQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.setReferenceInsteadOfDelete pattern,
 * to be used in conjunction with {@link SetReferenceInsteadOfDeleteMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SetReferenceInsteadOfDeleteMatcher
 * @see SetReferenceInsteadOfDeleteProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SetReferenceInsteadOfDeleteMatch extends BasePatternMatch {
  private Delete fDeleteOp;
  
  private SetReference fSetRefOp;
  
  private static java.util.List parameterNames = makeImmutableList("deleteOp", "setRefOp");
  
  private SetReferenceInsteadOfDeleteMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    this.fDeleteOp = pDeleteOp;
    this.fSetRefOp = pSetRefOp;
    
  }
  
  public java.lang.Object get();
  
  public Delete getDeleteOp() {
    return this.fDeleteOp;
    
  }
  
  public SetReference getSetRefOp() {
    return this.fSetRefOp;
    
  }
  
  public boolean set();
  
  public void setDeleteOp(final Delete pDeleteOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeleteOp = pDeleteOp;
    
  }
  
  public void setSetRefOp(final SetReference pSetRefOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSetRefOp = pSetRefOp;
    
  }
  
  public java.lang.String patternName();
  
  public java.util.List parameterNames();
  
  public /* type is 'null' */ toArray();
  
  public SetReferenceInsteadOfDeleteMatch toImmutable();
  
  public java.lang.String prettyPrint();
  
  public int hashCode();
  
  public boolean equals();
  
  public SetReferenceInsteadOfDeleteQuerySpecification specification();
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static SetReferenceInsteadOfDeleteMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SetReferenceInsteadOfDeleteMatch newMutableMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return new Mutable(pDeleteOp, pSetRefOp);
    
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
  public static SetReferenceInsteadOfDeleteMatch newMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return new Immutable(pDeleteOp, pSetRefOp);
    
  }
  
  private static final class Mutable extends SetReferenceInsteadOfDeleteMatch {
    Mutable(final Delete pDeleteOp, final SetReference pSetRefOp) {
      super(pDeleteOp, pSetRefOp);
      
    }
    
    public boolean isMutable();
  }
  
  private static final class Immutable extends SetReferenceInsteadOfDeleteMatch {
    Immutable(final Delete pDeleteOp, final SetReference pSetRefOp) {
      super(pDeleteOp, pSetRefOp);
      
    }
    
    public boolean isMutable();
  }
}
