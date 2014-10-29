package patterns;

import DiffModel.ResetAttribute;
import WTSpecID.IdentifiableWTElement;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.ResetAttributeQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.resetAttribute pattern,
 * to be used in conjunction with {@link ResetAttributeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ResetAttributeMatcher
 * @see ResetAttributeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ResetAttributeMatch extends BasePatternMatch {
  private ResetAttribute fResetAttrOp;
  
  private IdentifiableWTElement fTarget;
  
  private static List<String> parameterNames = makeImmutableList("resetAttrOp", "target");
  
  private ResetAttributeMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    this.fResetAttrOp = pResetAttrOp;
    this.fTarget = pTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("resetAttrOp".equals(parameterName)) return this.fResetAttrOp;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
    
  }
  
  public ResetAttribute getResetAttrOp() {
    return this.fResetAttrOp;
    
  }
  
  public IdentifiableWTElement getTarget() {
    return this.fTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("resetAttrOp".equals(parameterName) ) {
    	this.fResetAttrOp = (DiffModel.ResetAttribute) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (WTSpecID.IdentifiableWTElement) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setResetAttrOp(final ResetAttribute pResetAttrOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fResetAttrOp = pResetAttrOp;
    
  }
  
  public void setTarget(final IdentifiableWTElement pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.resetAttribute";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return ResetAttributeMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fResetAttrOp, fTarget};
    
  }
  
  @Override
  public ResetAttributeMatch toImmutable() {
    return isMutable() ? newMatch(fResetAttrOp, fTarget) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"resetAttrOp\"=" + prettyPrintValue(fResetAttrOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fResetAttrOp == null) ? 0 : fResetAttrOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ResetAttributeMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ResetAttributeMatch other = (ResetAttributeMatch) obj;
    if (fResetAttrOp == null) {if (other.fResetAttrOp != null) return false;}
    else if (!fResetAttrOp.equals(other.fResetAttrOp)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public ResetAttributeQuerySpecification specification() {
    try {
    	return ResetAttributeQuerySpecification.instance();
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
  public static ResetAttributeMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ResetAttributeMatch newMutableMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return new Mutable(pResetAttrOp, pTarget);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pResetAttrOp the fixed value of pattern parameter resetAttrOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ResetAttributeMatch newMatch(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
    return new Immutable(pResetAttrOp, pTarget);
    
  }
  
  private static final class Mutable extends ResetAttributeMatch {
    Mutable(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
      super(pResetAttrOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ResetAttributeMatch {
    Immutable(final ResetAttribute pResetAttrOp, final IdentifiableWTElement pTarget) {
      super(pResetAttrOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
