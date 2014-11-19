package patterns;

import DseMergeDiffModel.SetReference;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.SetReferenceQuerySpecification;
import wtspecid.IdentifiableWTElement;

/**
 * Pattern-specific match representation of the patterns.setReference pattern,
 * to be used in conjunction with {@link SetReferenceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SetReferenceMatcher
 * @see SetReferenceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SetReferenceMatch extends BasePatternMatch {
  private SetReference fSetRefOp;
  
  private IdentifiableWTElement fTarget;
  
  private IdentifiableWTElement fRef;
  
  private static List<String> parameterNames = makeImmutableList("setRefOp", "target", "ref");
  
  private SetReferenceMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    this.fSetRefOp = pSetRefOp;
    this.fTarget = pTarget;
    this.fRef = pRef;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("setRefOp".equals(parameterName)) return this.fSetRefOp;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("ref".equals(parameterName)) return this.fRef;
    return null;
    
  }
  
  public SetReference getSetRefOp() {
    return this.fSetRefOp;
    
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
    if ("setRefOp".equals(parameterName) ) {
    	this.fSetRefOp = (DseMergeDiffModel.SetReference) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (wtspecid.IdentifiableWTElement) newValue;
    	return true;
    }
    if ("ref".equals(parameterName) ) {
    	this.fRef = (wtspecid.IdentifiableWTElement) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSetRefOp(final SetReference pSetRefOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSetRefOp = pSetRefOp;
    
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
    return "patterns.setReference";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SetReferenceMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSetRefOp, fTarget, fRef};
    
  }
  
  @Override
  public SetReferenceMatch toImmutable() {
    return isMutable() ? newMatch(fSetRefOp, fTarget, fRef) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"setRefOp\"=" + prettyPrintValue(fSetRefOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    result.append("\"ref\"=" + prettyPrintValue(fRef));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSetRefOp == null) ? 0 : fSetRefOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fRef == null) ? 0 : fRef.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SetReferenceMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SetReferenceMatch other = (SetReferenceMatch) obj;
    if (fSetRefOp == null) {if (other.fSetRefOp != null) return false;}
    else if (!fSetRefOp.equals(other.fSetRefOp)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    if (fRef == null) {if (other.fRef != null) return false;}
    else if (!fRef.equals(other.fRef)) return false;
    return true;
  }
  
  @Override
  public SetReferenceQuerySpecification specification() {
    try {
    	return SetReferenceQuerySpecification.instance();
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
  public static SetReferenceMatch newEmptyMatch() {
    return new Mutable(null, null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SetReferenceMatch newMutableMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return new Mutable(pSetRefOp, pTarget, pRef);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pRef the fixed value of pattern parameter ref, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SetReferenceMatch newMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    return new Immutable(pSetRefOp, pTarget, pRef);
    
  }
  
  private static final class Mutable extends SetReferenceMatch {
    Mutable(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
      super(pSetRefOp, pTarget, pRef);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SetReferenceMatch {
    Immutable(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
      super(pSetRefOp, pTarget, pRef);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
