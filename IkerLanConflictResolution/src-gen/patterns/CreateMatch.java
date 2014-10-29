package patterns;

import DiffModel.Create;
import WTSpecID.WT;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.util.CreateQuerySpecification;

/**
 * Pattern-specific match representation of the patterns.create pattern,
 * to be used in conjunction with {@link CreateMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CreateMatcher
 * @see CreateProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CreateMatch extends BasePatternMatch {
  private Create fCreateOp;
  
  private WT fWt;
  
  private static List<String> parameterNames = makeImmutableList("createOp", "wt");
  
  private CreateMatch(final Create pCreateOp, final WT pWt) {
    this.fCreateOp = pCreateOp;
    this.fWt = pWt;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("createOp".equals(parameterName)) return this.fCreateOp;
    if ("wt".equals(parameterName)) return this.fWt;
    return null;
    
  }
  
  public Create getCreateOp() {
    return this.fCreateOp;
    
  }
  
  public WT getWt() {
    return this.fWt;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("createOp".equals(parameterName) ) {
    	this.fCreateOp = (DiffModel.Create) newValue;
    	return true;
    }
    if ("wt".equals(parameterName) ) {
    	this.fWt = (WTSpecID.WT) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setCreateOp(final Create pCreateOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCreateOp = pCreateOp;
    
  }
  
  public void setWt(final WT pWt) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fWt = pWt;
    
  }
  
  @Override
  public String patternName() {
    return "patterns.create";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return CreateMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fCreateOp, fWt};
    
  }
  
  @Override
  public CreateMatch toImmutable() {
    return isMutable() ? newMatch(fCreateOp, fWt) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"createOp\"=" + prettyPrintValue(fCreateOp) + ", ");
    result.append("\"wt\"=" + prettyPrintValue(fWt));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCreateOp == null) ? 0 : fCreateOp.hashCode());
    result = prime * result + ((fWt == null) ? 0 : fWt.hashCode());
    return result;
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CreateMatch)) { // this should be infrequent
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    CreateMatch other = (CreateMatch) obj;
    if (fCreateOp == null) {if (other.fCreateOp != null) return false;}
    else if (!fCreateOp.equals(other.fCreateOp)) return false;
    if (fWt == null) {if (other.fWt != null) return false;}
    else if (!fWt.equals(other.fWt)) return false;
    return true;
  }
  
  @Override
  public CreateQuerySpecification specification() {
    try {
    	return CreateQuerySpecification.instance();
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
  public static CreateMatch newEmptyMatch() {
    return new Mutable(null, null);
    
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CreateMatch newMutableMatch(final Create pCreateOp, final WT pWt) {
    return new Mutable(pCreateOp, pWt);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pWt the fixed value of pattern parameter wt, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CreateMatch newMatch(final Create pCreateOp, final WT pWt) {
    return new Immutable(pCreateOp, pWt);
    
  }
  
  private static final class Mutable extends CreateMatch {
    Mutable(final Create pCreateOp, final WT pWt) {
      super(pCreateOp, pWt);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CreateMatch {
    Immutable(final Create pCreateOp, final WT pWt) {
      super(pCreateOp, pWt);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
