package patterns;

import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import patterns.AddToListMatcher;
import patterns.CreateMatcher;
import patterns.DeleteMatcher;
import patterns.RemoveFromListMatcher;
import patterns.ResetAttributeMatcher;
import patterns.ResetReferenceMatcher;
import patterns.SetAttributeMatcher;
import patterns.SetReferenceMatcher;
import patterns.util.AddToListQuerySpecification;
import patterns.util.CreateQuerySpecification;
import patterns.util.DeleteQuerySpecification;
import patterns.util.RemoveFromListQuerySpecification;
import patterns.util.ResetAttributeQuerySpecification;
import patterns.util.ResetReferenceQuerySpecification;
import patterns.util.SetAttributeQuerySpecification;
import patterns.util.SetReferenceQuerySpecification;

/**
 * A pattern group formed of all patterns defined in patterns.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file patterns.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package patterns, the group contains the definition of the following patterns: <ul>
 * <li>create</li>
 * <li>delete</li>
 * <li>setAttribute</li>
 * <li>setReference</li>
 * <li>resetAttribute</li>
 * <li>resetReference</li>
 * <li>addToList</li>
 * <li>removeFromList</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Patterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Patterns instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Patterns();
    }
    return INSTANCE;
    
  }
  
  private static Patterns INSTANCE;
  
  private Patterns() throws IncQueryException {
    querySpecifications.add(CreateQuerySpecification.instance());
    querySpecifications.add(DeleteQuerySpecification.instance());
    querySpecifications.add(SetAttributeQuerySpecification.instance());
    querySpecifications.add(SetReferenceQuerySpecification.instance());
    querySpecifications.add(ResetAttributeQuerySpecification.instance());
    querySpecifications.add(ResetReferenceQuerySpecification.instance());
    querySpecifications.add(AddToListQuerySpecification.instance());
    querySpecifications.add(RemoveFromListQuerySpecification.instance());
    
  }
  
  public CreateQuerySpecification getCreate() throws IncQueryException {
    return CreateQuerySpecification.instance();
  }
  
  public CreateMatcher getCreate(final IncQueryEngine engine) throws IncQueryException {
    return CreateMatcher.on(engine);
  }
  
  public DeleteQuerySpecification getDelete() throws IncQueryException {
    return DeleteQuerySpecification.instance();
  }
  
  public DeleteMatcher getDelete(final IncQueryEngine engine) throws IncQueryException {
    return DeleteMatcher.on(engine);
  }
  
  public SetAttributeQuerySpecification getSetAttribute() throws IncQueryException {
    return SetAttributeQuerySpecification.instance();
  }
  
  public SetAttributeMatcher getSetAttribute(final IncQueryEngine engine) throws IncQueryException {
    return SetAttributeMatcher.on(engine);
  }
  
  public SetReferenceQuerySpecification getSetReference() throws IncQueryException {
    return SetReferenceQuerySpecification.instance();
  }
  
  public SetReferenceMatcher getSetReference(final IncQueryEngine engine) throws IncQueryException {
    return SetReferenceMatcher.on(engine);
  }
  
  public ResetAttributeQuerySpecification getResetAttribute() throws IncQueryException {
    return ResetAttributeQuerySpecification.instance();
  }
  
  public ResetAttributeMatcher getResetAttribute(final IncQueryEngine engine) throws IncQueryException {
    return ResetAttributeMatcher.on(engine);
  }
  
  public ResetReferenceQuerySpecification getResetReference() throws IncQueryException {
    return ResetReferenceQuerySpecification.instance();
  }
  
  public ResetReferenceMatcher getResetReference(final IncQueryEngine engine) throws IncQueryException {
    return ResetReferenceMatcher.on(engine);
  }
  
  public AddToListQuerySpecification getAddToList() throws IncQueryException {
    return AddToListQuerySpecification.instance();
  }
  
  public AddToListMatcher getAddToList(final IncQueryEngine engine) throws IncQueryException {
    return AddToListMatcher.on(engine);
  }
  
  public RemoveFromListQuerySpecification getRemoveFromList() throws IncQueryException {
    return RemoveFromListQuerySpecification.instance();
  }
  
  public RemoveFromListMatcher getRemoveFromList(final IncQueryEngine engine) throws IncQueryException {
    return RemoveFromListMatcher.on(engine);
  }
}
