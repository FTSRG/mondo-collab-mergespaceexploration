package patterns;

import DiffModel.ResetReference;
import WTSpecID.IdentifiableWTElement;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.ResetReferenceQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.resetReference pattern,
 * to be used in conjunction with {@link ResetReferenceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ResetReferenceMatcher
 * @see ResetReferenceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ResetReferenceMatch extends BasePatternMatch {
  private ResetReference fResetRefOp;
  
  private IdentifiableWTElement fTarget;
  
  private static List<String> parameterNames = makeImmutableList("resetRefOp", "target");
  
  private ResetReferenceMatch(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget) {
    this.fResetRefOp = pResetRefOp;
    this.fTarget = pTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("resetRefOp".equals(parameterName)) return this.fResetRefOp;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
    
  }
  
  public ResetReference getResetRefOp() {
    return this.fResetRefOp;
    
  }
  
  public IdentifiableWTElement getTarget() {
    return this.fTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("resetRefOp".equals(parameterName) ) {
    	this.fResetRefOp = (DiffModel.ResetReference) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (WTSpecID.IdentifiableWTElement) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setResetRefOp(final ResetReference pResetRefOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fResetRefOp = pResetRefOp;
    
  }
  
  public void setTarget(final IdentifiableWTElement pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.resetReference";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return ResetReferenceMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fResetRefOp, fTarget};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"resetRefOp\"=" + prettyPrintValue(fResetRefOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fResetRefOp == null) ? 0 : fResetRefOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ResetReferenceMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    ResetReferenceMatch other = (ResetReferenceMatch) obj;
    if (fResetRefOp == null) {if (other.fResetRefOp != null) return false;}
    else if (!fResetRefOp.equals(other.fResetRefOp)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public ResetReferenceQuerySpecification specification() {
    try {
    	return ResetReferenceQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends ResetReferenceMatch {
    Mutable(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget) {
      super(pResetRefOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends ResetReferenceMatch {
    Immutable(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget) {
      super(pResetRefOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
