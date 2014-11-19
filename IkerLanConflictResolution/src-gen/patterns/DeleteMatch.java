package patterns;

import DseMergeDiffModel.Delete;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.DeleteQuerySpecification;
import wtspecid.IdentifiableWTElement;

/**
 * Pattern-specific match representation of the patterns.delete pattern,
 * to be used in conjunction with {@link DeleteMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DeleteMatcher
 * @see DeleteProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DeleteMatch extends BasePatternMatch {
  private Delete fDeleteOp;
  
  private IdentifiableWTElement fTarget;
  
  private static List<String> parameterNames = makeImmutableList("deleteOp", "target");
  
  private DeleteMatch(final Delete pDeleteOp, final IdentifiableWTElement pTarget) {
    this.fDeleteOp = pDeleteOp;
    this.fTarget = pTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deleteOp".equals(parameterName)) return this.fDeleteOp;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
    
  }
  
  public Delete getDeleteOp() {
    return this.fDeleteOp;
    
  }
  
  public IdentifiableWTElement getTarget() {
    return this.fTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deleteOp".equals(parameterName) ) {
    	this.fDeleteOp = (DseMergeDiffModel.Delete) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (wtspecid.IdentifiableWTElement) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setDeleteOp(final Delete pDeleteOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeleteOp = pDeleteOp;
    
  }
  
  public void setTarget(final IdentifiableWTElement pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.delete";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return DeleteMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeleteOp, fTarget};
    
  }
  
  @Override
  public DeleteMatch toImmutable() {
    return isMutable() ? newMatch(fDeleteOp, fTarget) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deleteOp\"=" + prettyPrintValue(fDeleteOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeleteOp == null) ? 0 : fDeleteOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DeleteMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    DeleteMatch other = (DeleteMatch) obj;
    if (fDeleteOp == null) {if (other.fDeleteOp != null) return false;}
    else if (!fDeleteOp.equals(other.fDeleteOp)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public DeleteQuerySpecification specification() {
    try {
    	return DeleteQuerySpecification.instance();
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
  public static DeleteMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DeleteMatch newMutableMatch(final Delete pDeleteOp, final IdentifiableWTElement pTarget) {
    return new Mutable(pDeleteOp, pTarget);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DeleteMatch newMatch(final Delete pDeleteOp, final IdentifiableWTElement pTarget) {
    return new Immutable(pDeleteOp, pTarget);
    
  }
  
  private static final class Mutable extends DeleteMatch {
    Mutable(final Delete pDeleteOp, final IdentifiableWTElement pTarget) {
      super(pDeleteOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DeleteMatch {
    Immutable(final Delete pDeleteOp, final IdentifiableWTElement pTarget) {
      super(pDeleteOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
