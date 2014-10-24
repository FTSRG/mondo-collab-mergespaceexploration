package patterns;

import DiffModel.Create;
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
  
  private static List<String> parameterNames = makeImmutableList("createOp");
  
  private CreateMatch(final Create pCreateOp) {
    this.fCreateOp = pCreateOp;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("createOp".equals(parameterName)) return this.fCreateOp;
    return null;
    
  }
  
  public Create getCreateOp() {
    return this.fCreateOp;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("createOp".equals(parameterName) ) {
    	this.fCreateOp = (DiffModel.Create) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setCreateOp(final Create pCreateOp) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCreateOp = pCreateOp;
    
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
    return new Object[]{fCreateOp};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"createOp\"=" + prettyPrintValue(fCreateOp));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fCreateOp == null) ? 0 : fCreateOp.hashCode());
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
  
  @SuppressWarnings("all")
  static final class Mutable extends CreateMatch {
    Mutable(final Create pCreateOp) {
      super(pCreateOp);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends CreateMatch {
    Immutable(final Create pCreateOp) {
      super(pCreateOp);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
