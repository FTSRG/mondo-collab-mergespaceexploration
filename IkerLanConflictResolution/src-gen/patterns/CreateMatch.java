package patterns;

import DiffModel.Create;
import ModelContainer.MainRoot;
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
  
  private MainRoot fMainRoot;
  
  private static List<String> parameterNames = makeImmutableList("createOp", "mainRoot");
  
  private CreateMatch(final Create pCreateOp, final MainRoot pMainRoot) {
    this.fCreateOp = pCreateOp;
    this.fMainRoot = pMainRoot;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("createOp".equals(parameterName)) return this.fCreateOp;
    if ("mainRoot".equals(parameterName)) return this.fMainRoot;
    return null;
    
  }
  
  public Create getCreateOp() {
    return this.fCreateOp;
    
  }
  
  public MainRoot getMainRoot() {
    return this.fMainRoot;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("createOp".equals(parameterName) ) {
    	this.fCreateOp = (DiffModel.Create) newValue;
    	return true;
    }
    if ("mainRoot".equals(parameterName) ) {
    	this.fMainRoot = (ModelContainer.MainRoot) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setCreateOp(final Create pCreateOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCreateOp = pCreateOp;
    
  }
  
  public void setMainRoot(final MainRoot pMainRoot) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMainRoot = pMainRoot;
    
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
    return new Object[]{fCreateOp, fMainRoot};
    
  }
  
  @Override
  public CreateMatch toImmutable() {
    return isMutable() ? newMatch(fCreateOp, fMainRoot) : this;
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"createOp\"=" + prettyPrintValue(fCreateOp) + ", ");
    result.append("\"mainRoot\"=" + prettyPrintValue(fMainRoot));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCreateOp == null) ? 0 : fCreateOp.hashCode());
    result = prime * result + ((fMainRoot == null) ? 0 : fMainRoot.hashCode());
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
    if (fMainRoot == null) {if (other.fMainRoot != null) return false;}
    else if (!fMainRoot.equals(other.fMainRoot)) return false;
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
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CreateMatch newMutableMatch(final Create pCreateOp, final MainRoot pMainRoot) {
    return new Mutable(pCreateOp, pMainRoot);
    
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pCreateOp the fixed value of pattern parameter createOp, or null if not bound.
   * @param pMainRoot the fixed value of pattern parameter mainRoot, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CreateMatch newMatch(final Create pCreateOp, final MainRoot pMainRoot) {
    return new Immutable(pCreateOp, pMainRoot);
    
  }
  
  private static final class Mutable extends CreateMatch {
    Mutable(final Create pCreateOp, final MainRoot pMainRoot) {
      super(pCreateOp, pMainRoot);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CreateMatch {
    Immutable(final Create pCreateOp, final MainRoot pMainRoot) {
      super(pCreateOp, pMainRoot);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
