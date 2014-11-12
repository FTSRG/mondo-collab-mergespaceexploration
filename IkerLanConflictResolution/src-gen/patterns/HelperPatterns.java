package patterns;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.CreateInsteadOfDeleteMatcher;
import patterns.SetReferenceInsteadOfDeleteMatcher;
import patterns.util.CreateInsteadOfDeleteQuerySpecification;
import patterns.util.SetReferenceInsteadOfDeleteQuerySpecification;

/**
 * A pattern group formed of all patterns defined in helperPatterns.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file helperPatterns.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package patterns, the group contains the definition of the following patterns: <ul>
 * <li>createInsteadOfDelete</li>
 * <li>setReferenceInsteadOfDelete</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class HelperPatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static HelperPatterns instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new HelperPatterns();
    }
    return INSTANCE;
    
  }
  
  private static HelperPatterns INSTANCE;
  
  private HelperPatterns() throws IncQueryException {
    querySpecifications.add(CreateInsteadOfDeleteQuerySpecification.instance());
    querySpecifications.add(SetReferenceInsteadOfDeleteQuerySpecification.instance());
    
  }
  
  public CreateInsteadOfDeleteQuerySpecification getCreateInsteadOfDelete() throws IncQueryException {
    return CreateInsteadOfDeleteQuerySpecification.instance();
  }
  
  public CreateInsteadOfDeleteMatcher getCreateInsteadOfDelete(final IncQueryEngine engine) throws IncQueryException {
    return CreateInsteadOfDeleteMatcher.on(engine);
  }
  
  public SetReferenceInsteadOfDeleteQuerySpecification getSetReferenceInsteadOfDelete() throws IncQueryException {
    return SetReferenceInsteadOfDeleteQuerySpecification.instance();
  }
  
  public SetReferenceInsteadOfDeleteMatcher getSetReferenceInsteadOfDelete(final IncQueryEngine engine) throws IncQueryException {
    return SetReferenceInsteadOfDeleteMatcher.on(engine);
  }
}
