package patterns;

import DseMergeDiffModel.Create;
import DseMergeDiffModel.Delete;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import patterns.util.CreateInsteadOfDeleteQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.createInsteadOfDelete pattern,
 * to be used in conjunction with {@link CreateInsteadOfDeleteMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CreateInsteadOfDeleteMatcher
 * @see CreateInsteadOfDeleteProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CreateInsteadOfDeleteMatch extends BasePatternMatch {
  private Delete fDeleteOp;
  
  private Create fCreateOp;
  
  private static java.util.List parameterNames = makeImmutableList("deleteOp", "createOp");
  
  private CreateInsteadOfDeleteMatch(final Delete pDeleteOp, final Create pCreateOp) {
    this.fDeleteOp = pDeleteOp;
    this.fCreateOp = pCreateOp;
    
  }
  
  public java.lang.Object get();
  
  public Delete getDeleteOp() {
    return this.fDeleteOp;
    
  }
  
  public Create getCreateOp() {
    return this.fCreateOp;
    
  }
  
  public boolean set();
  
  public void setDeleteOp(final Delete pDeleteOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeleteOp = pDeleteOp;
    
  }
  
  public void setCreateOp(final Create pCreateOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCreateOp = pCreateOp;
    
  }
  
  public java.lang.String patternName();
  
  public java.util.List parameterNames();
  
  public /* type is 'null' */ toArray();
  
  public CreateInsteadOfDeleteMatch toImmutable();
  
  public java.lang.String prettyPrint();
  
  public int hashCode();
  
  public boolean equals();
  
  public CreateInsteadOfDeleteQuerySpecification specification();
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static CreateInsteadOfDeleteMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CreateInsteadOfDeleteMatch newMutableMatch(final Delete pDeleteOp, final Create pCreateOp) {
    return new Mutable(pDeleteOp, pCreateOp);
    
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
  public static CreateInsteadOfDeleteMatch newMatch(final Delete pDeleteOp, final Create pCreateOp) {
    return new Immutable(pDeleteOp, pCreateOp);
    
  }
  
  private static final class Mutable extends CreateInsteadOfDeleteMatch {
    Mutable(final Delete pDeleteOp, final Create pCreateOp) {
      super(pDeleteOp, pCreateOp);
      
    }
    
    public boolean isMutable();
  }
  
  private static final class Immutable extends CreateInsteadOfDeleteMatch {
    Immutable(final Delete pDeleteOp, final Create pCreateOp) {
      super(pDeleteOp, pCreateOp);
      
    }
    
    public boolean isMutable();
  }
}
