package patterns;

import DiffModel.SetReference;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.WT;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.SetReferenceQuerySpecification;

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
  
  private WT fWt;
  
  private static List<String> parameterNames = makeImmutableList("setRefOp", "target", "wt");
  
  private SetReferenceMatch(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final WT pWt) {
    this.fSetRefOp = pSetRefOp;
    this.fTarget = pTarget;
    this.fWt = pWt;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("setRefOp".equals(parameterName)) return this.fSetRefOp;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("wt".equals(parameterName)) return this.fWt;
    return null;
    
  }
  
  public SetReference getSetRefOp() {
    return this.fSetRefOp;
    
  }
  
  public IdentifiableWTElement getTarget() {
    return this.fTarget;
    
  }
  
  public WT getWt() {
    return this.fWt;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("setRefOp".equals(parameterName) ) {
    	this.fSetRefOp = (DiffModel.SetReference) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (WTSpecID.IdentifiableWTElement) newValue;
    	return true;
    }
    if ("wt".equals(parameterName) ) {
    	this.fWt = (WTSpecID.WT) newValue;
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
  
  public void setWt(final WT pWt) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fWt = pWt;
    
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
    return new Object[]{fSetRefOp, fTarget, fWt};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"setRefOp\"=" + prettyPrintValue(fSetRefOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    result.append("\"wt\"=" + prettyPrintValue(fWt));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSetRefOp == null) ? 0 : fSetRefOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fWt == null) ? 0 : fWt.hashCode());
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
    if (fWt == null) {if (other.fWt != null) return false;}
    else if (!fWt.equals(other.fWt)) return false;
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
  
  @SuppressWarnings("all")
  static final class Mutable extends SetReferenceMatch {
    Mutable(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final WT pWt) {
      super(pSetRefOp, pTarget, pWt);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends SetReferenceMatch {
    Immutable(final SetReference pSetRefOp, final IdentifiableWTElement pTarget, final WT pWt) {
      super(pSetRefOp, pTarget, pWt);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
