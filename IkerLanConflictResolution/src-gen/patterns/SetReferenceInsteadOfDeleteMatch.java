package patterns;

import DiffModel.Delete;
import DiffModel.SetReference;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.SetReferenceInsteadOfDeleteQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.setReferenceInsteadOfDelete pattern,
 * to be used in conjunction with {@link SetReferenceInsteadOfDeleteMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SetReferenceInsteadOfDeleteMatcher
 * @see SetReferenceInsteadOfDeleteProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SetReferenceInsteadOfDeleteMatch extends BasePatternMatch {
  private Delete fDeleteOp;
  
  private SetReference fSetRefOp;
  
  private static List<String> parameterNames = makeImmutableList("deleteOp", "setRefOp");
  
  private SetReferenceInsteadOfDeleteMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    this.fDeleteOp = pDeleteOp;
    this.fSetRefOp = pSetRefOp;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deleteOp".equals(parameterName)) return this.fDeleteOp;
    if ("setRefOp".equals(parameterName)) return this.fSetRefOp;
    return null;
    
  }
  
  public Delete getDeleteOp() {
    return this.fDeleteOp;
    
  }
  
  public SetReference getSetRefOp() {
    return this.fSetRefOp;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deleteOp".equals(parameterName) ) {
    	this.fDeleteOp = (DiffModel.Delete) newValue;
    	return true;
    }
    if ("setRefOp".equals(parameterName) ) {
    	this.fSetRefOp = (DiffModel.SetReference) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setDeleteOp(final Delete pDeleteOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeleteOp = pDeleteOp;
    
  }
  
  public void setSetRefOp(final SetReference pSetRefOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSetRefOp = pSetRefOp;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.setReferenceInsteadOfDelete";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return SetReferenceInsteadOfDeleteMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeleteOp, fSetRefOp};
    
  }
  
  @Override
  public SetReferenceInsteadOfDeleteMatch toImmutable() {
    return isMutable() ? newMatch(fDeleteOp, fSetRefOp) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deleteOp\"=" + prettyPrintValue(fDeleteOp) + ", ");
    result.append("\"setRefOp\"=" + prettyPrintValue(fSetRefOp));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeleteOp == null) ? 0 : fDeleteOp.hashCode());
    result = prime * result + ((fSetRefOp == null) ? 0 : fSetRefOp.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SetReferenceInsteadOfDeleteMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    SetReferenceInsteadOfDeleteMatch other = (SetReferenceInsteadOfDeleteMatch) obj;
    if (fDeleteOp == null) {if (other.fDeleteOp != null) return false;}
    else if (!fDeleteOp.equals(other.fDeleteOp)) return false;
    if (fSetRefOp == null) {if (other.fSetRefOp != null) return false;}
    else if (!fSetRefOp.equals(other.fSetRefOp)) return false;
    return true;
  }
  
  @Override
  public SetReferenceInsteadOfDeleteQuerySpecification specification() {
    try {
    	return SetReferenceInsteadOfDeleteQuerySpecification.instance();
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
  public static SetReferenceInsteadOfDeleteMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SetReferenceInsteadOfDeleteMatch newMutableMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return new Mutable(pDeleteOp, pSetRefOp);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDeleteOp the fixed value of pattern parameter deleteOp, or null if not bound.
   * @param pSetRefOp the fixed value of pattern parameter setRefOp, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SetReferenceInsteadOfDeleteMatch newMatch(final Delete pDeleteOp, final SetReference pSetRefOp) {
    return new Immutable(pDeleteOp, pSetRefOp);
    
  }
  
  private static final class Mutable extends SetReferenceInsteadOfDeleteMatch {
    Mutable(final Delete pDeleteOp, final SetReference pSetRefOp) {
      super(pDeleteOp, pSetRefOp);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SetReferenceInsteadOfDeleteMatch {
    Immutable(final Delete pDeleteOp, final SetReference pSetRefOp) {
      super(pDeleteOp, pSetRefOp);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
