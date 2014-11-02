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
  
  private IdentifiableWTElement fRef;
  
  private static List<String> parameterNames = makeImmutableList("resetRefOp", "target", "ref");
  
  private ResetReferenceMatch(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    this.fResetRefOp = pResetRefOp;
    this.fTarget = pTarget;
    this.fRef = pRef;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("resetRefOp".equals(parameterName)) return this.fResetRefOp;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("ref".equals(parameterName)) return this.fRef;
    return null;
    
  }
  
  public ResetReference getResetRefOp() {
    return this.fResetRefOp;
    
  }
  
  public IdentifiableWTElement getTarget() {
    return this.fTarget;
    
  }
  
  public IdentifiableWTElement getRef() {
    return this.fRef;
    
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
    if ("ref".equals(parameterName) ) {
    	this.fRef = (WTSpecID.IdentifiableWTElement) newValue;
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
  
  public void setRef(final IdentifiableWTElement pRef) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRef = pRef;
    
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
    return new Object[]{fResetRefOp, fTarget, fRef};
    
  }
  
  @Override
  public ResetReferenceMatch toImmutable() {
    return isMutable() ? newMatch(fResetRefOp, fTarget, fRef) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"resetRefOp\"=" + prettyPrintValue(fResetRefOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    result.append("\"ref\"=" + prettyPrintValue(fRef));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fResetRefOp == null) ? 0 : fResetRefOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fRef == null) ? 0 : fRef.hashCode());
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
    if (fRef == null) {if (other.fRef != null) return false;}
    else if (!fRef.equals(other.fRef)) return false;
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
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static ResetReferenceMatch newEmptyMatch() {
    return new Mutable(null, null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pResetRefOp the fixed value of pattern parameter resetRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ResetReferenceMatch newMutableMatch(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return new Mutable(pResetRefOp, pTarget, pRef);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pResetRefOp the fixed value of pattern parameter resetRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ResetReferenceMatch newMatch(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return new Immutable(pResetRefOp, pTarget, pRef);
    
  }
  
  private static final class Mutable extends ResetReferenceMatch {
    Mutable(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
      super(pResetRefOp, pTarget, pRef);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ResetReferenceMatch {
    Immutable(final ResetReference pResetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
      super(pResetRefOp, pTarget, pRef);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
