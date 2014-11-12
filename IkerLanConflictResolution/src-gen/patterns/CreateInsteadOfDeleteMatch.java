package patterns;

import DiffModel.Create;
import DiffModel.Delete;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
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
  
  private static List<String> parameterNames = makeImmutableList("deleteOp", "createOp");
  
  private CreateInsteadOfDeleteMatch(final Delete pDeleteOp, final Create pCreateOp) {
    this.fDeleteOp = pDeleteOp;
    this.fCreateOp = pCreateOp;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deleteOp".equals(parameterName)) return this.fDeleteOp;
    if ("createOp".equals(parameterName)) return this.fCreateOp;
    return null;
    
  }
  
  public Delete getDeleteOp() {
    return this.fDeleteOp;
    
  }
  
  public Create getCreateOp() {
    return this.fCreateOp;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deleteOp".equals(parameterName) ) {
    	this.fDeleteOp = (DiffModel.Delete) newValue;
    	return true;
    }
    if ("createOp".equals(parameterName) ) {
    	this.fCreateOp = (DiffModel.Create) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setDeleteOp(final Delete pDeleteOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeleteOp = pDeleteOp;
    
  }
  
  public void setCreateOp(final Create pCreateOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCreateOp = pCreateOp;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.createInsteadOfDelete";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CreateInsteadOfDeleteMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeleteOp, fCreateOp};
    
  }
  
  @Override
  public CreateInsteadOfDeleteMatch toImmutable() {
    return isMutable() ? newMatch(fDeleteOp, fCreateOp) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deleteOp\"=" + prettyPrintValue(fDeleteOp) + ", ");
    result.append("\"createOp\"=" + prettyPrintValue(fCreateOp));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeleteOp == null) ? 0 : fDeleteOp.hashCode());
    result = prime * result + ((fCreateOp == null) ? 0 : fCreateOp.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CreateInsteadOfDeleteMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CreateInsteadOfDeleteMatch other = (CreateInsteadOfDeleteMatch) obj;
    if (fDeleteOp == null) {if (other.fDeleteOp != null) return false;}
    else if (!fDeleteOp.equals(other.fDeleteOp)) return false;
    if (fCreateOp == null) {if (other.fCreateOp != null) return false;}
    else if (!fCreateOp.equals(other.fCreateOp)) return false;
    return true;
  }
  
  @Override
  public CreateInsteadOfDeleteQuerySpecification specification() {
    try {
    	return CreateInsteadOfDeleteQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
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
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CreateInsteadOfDeleteMatch {
    Immutable(final Delete pDeleteOp, final Create pCreateOp) {
      super(pDeleteOp, pCreateOp);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
