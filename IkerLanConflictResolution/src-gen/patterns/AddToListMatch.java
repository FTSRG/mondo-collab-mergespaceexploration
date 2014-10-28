package patterns;

import DiffModel.AddToList;
import WTSpecID.IdentifiableWTElement;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.AddToListQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.addToList pattern,
 * to be used in conjunction with {@link AddToListMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AddToListMatcher
 * @see AddToListProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AddToListMatch extends BasePatternMatch {
  private AddToList fAddToListOp;
  
  private IdentifiableWTElement fTarget;
  
  private IdentifiableWTElement fRef;
  
  private static List<String> parameterNames = makeImmutableList("addToListOp", "target", "ref");
  
  private AddToListMatch(final AddToList pAddToListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
    this.fAddToListOp = pAddToListOp;
    this.fTarget = pTarget;
    this.fRef = pRef;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("addToListOp".equals(parameterName)) return this.fAddToListOp;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("ref".equals(parameterName)) return this.fRef;
    return null;
    
  }
  
  public AddToList getAddToListOp() {
    return this.fAddToListOp;
    
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
    if ("addToListOp".equals(parameterName) ) {
    	this.fAddToListOp = (DiffModel.AddToList) newValue;
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
  
  public void setAddToListOp(final AddToList pAddToListOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAddToListOp = pAddToListOp;
    
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
    return "patterns.addToList";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return AddToListMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAddToListOp, fTarget, fRef};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"addToListOp\"=" + prettyPrintValue(fAddToListOp) + ", ");
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    result.append("\"ref\"=" + prettyPrintValue(fRef));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAddToListOp == null) ? 0 : fAddToListOp.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fRef == null) ? 0 : fRef.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AddToListMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    AddToListMatch other = (AddToListMatch) obj;
    if (fAddToListOp == null) {if (other.fAddToListOp != null) return false;}
    else if (!fAddToListOp.equals(other.fAddToListOp)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    if (fRef == null) {if (other.fRef != null) return false;}
    else if (!fRef.equals(other.fRef)) return false;
    return true;
  }
  
  @Override
  public AddToListQuerySpecification specification() {
    try {
    	return AddToListQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends AddToListMatch {
    Mutable(final AddToList pAddToListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
      super(pAddToListOp, pTarget, pRef);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends AddToListMatch {
    Immutable(final AddToList pAddToListOp, final IdentifiableWTElement pTarget, final IdentifiableWTElement pRef) {
      super(pAddToListOp, pTarget, pRef);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
