package patterns.util;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.CreateInsteadOfDeleteMatch;
import patterns.CreateInsteadOfDeleteMatcher;

/**
 * A pattern-specific query specification that can instantiate CreateInsteadOfDeleteMatcher in a type-safe way.
 * 
 * @see CreateInsteadOfDeleteMatcher
 * @see CreateInsteadOfDeleteMatch
 * 
 */
@SuppressWarnings("all")
public final class CreateInsteadOfDeleteQuerySpecification extends BaseGeneratedQuerySpecification<CreateInsteadOfDeleteMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CreateInsteadOfDeleteQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  protected CreateInsteadOfDeleteMatcher instantiate();
  
  public java.lang.String getFullyQualifiedName();
  
  public java.util.List getParameterNames();
  
  public java.util.List getParameters();
  
  public CreateInsteadOfDeleteMatch newEmptyMatch();
  
  public CreateInsteadOfDeleteMatch newMatch();
  
  public java.util.Set doGetContainedBodies();
  
  private static class LazyHolder {
    private final static CreateInsteadOfDeleteQuerySpecification INSTANCE = make();
    
    public static CreateInsteadOfDeleteQuerySpecification make() {
      return new CreateInsteadOfDeleteQuerySpecification();					
      
    }
  }
}
