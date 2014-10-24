package patterns;

import DiffModel.SetAttribute;
import WTSpecID.IdentifiableWTElement;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.SetAttributeQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.setAttribute pattern,
 * to be used in conjunction with {@link SetAttributeMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SetAttributeMatcher
 * @see SetAttributeProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SetAttributeMatch extends BasePatternMatch {
  private SetAttribute fSetAttrOp;
  
  private IdentifiableWTElement fTarget;
  
  private static List<String> parameterNames = makeImmutableList("setAttrOp", "target");
  
  private SetAttributeMatch(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget) {
    this.fSetAttrOp = pSetAttrOp;
    this.fTarget = pTarget;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("setAttrOp".equals(parameterName)) return this.fSetAttrOp;
    if ("target".equals(parameterName)) return this.fTarget;
    return null;
    
  }
  
  public SetAttribute getSetAttrOp() {
    return this.fSetAttrOp;
    
  }
  
  public IdentifiableWTElement getTarget() {
    return this.fTarget;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("setAttrOp".equals(parameterName) ) {
    	this.fSetAttrOp = (DiffModel.SetAttribute) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (WTSpecID.IdentifiableWTElement) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setSetAttrOp(final SetAttribute pSetAttrOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSetAttrOp = pSetAttrOp;
    
  }
  
  public void setTarget(final IdentifiableWTElement pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.setAttribute";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SetAttributeMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSetAttrOp, fTarget};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"setAttrOp\"=" + prettyPrintValue(fSetAttrOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSetAttrOp == null) ? 0 : fSetAttrOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SetAttributeMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SetAttributeMatch other = (SetAttributeMatch) obj;
    if (fSetAttrOp == null) {if (other.fSetAttrOp != null) return false;}
    else if (!fSetAttrOp.equals(other.fSetAttrOp)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public SetAttributeQuerySpecification specification() {
    try {
    	return SetAttributeQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends SetAttributeMatch {
    Mutable(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget) {
      super(pSetAttrOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends SetAttributeMatch {
    Immutable(final SetAttribute pSetAttrOp, final IdentifiableWTElement pTarget) {
      super(pSetAttrOp, pTarget);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
