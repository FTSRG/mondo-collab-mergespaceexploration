package patterns.util;

import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.SetReferenceInsteadOfDeleteMatch;
import patterns.SetReferenceInsteadOfDeleteMatcher;

/**
 * A pattern-specific query specification that can instantiate SetReferenceInsteadOfDeleteMatcher in a type-safe way.
 * 
 * @see SetReferenceInsteadOfDeleteMatcher
 * @see SetReferenceInsteadOfDeleteMatch
 * 
 */
@SuppressWarnings("all")
public final class SetReferenceInsteadOfDeleteQuerySpecification extends BaseGeneratedQuerySpecification<SetReferenceInsteadOfDeleteMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SetReferenceInsteadOfDeleteQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  protected SetReferenceInsteadOfDeleteMatcher instantiate();
  
  public java.lang.String getFullyQualifiedName();
  
  public java.util.List getParameterNames();
  
  public java.util.List getParameters();
  
  public SetReferenceInsteadOfDeleteMatch newEmptyMatch();
  
  public SetReferenceInsteadOfDeleteMatch newMatch();
  
  public java.util.Set doGetContainedBodies();
  
  private static class LazyHolder {
    private final static SetReferenceInsteadOfDeleteQuerySpecification INSTANCE = make();
    
    public static SetReferenceInsteadOfDeleteQuerySpecification make() {
      return new SetReferenceInsteadOfDeleteQuerySpecification();					
      
    }
  }
}
