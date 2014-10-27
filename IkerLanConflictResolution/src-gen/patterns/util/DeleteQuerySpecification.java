package patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.context.EMFPatternMatcherContext;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.PQuery.PQueryStatus;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import patterns.DeleteMatcher;

/**
 * A pattern-specific query specification that can instantiate DeleteMatcher in a type-safe way.
 * 
 * @see DeleteMatcher
 * @see DeleteMatch
 * 
 */
@SuppressWarnings("all")
public final class DeleteQuerySpecification extends BaseGeneratedQuerySpecification<DeleteMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DeleteQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected DeleteMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DeleteMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.delete";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("deleteOp","wt");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("deleteOp", "DiffModel.Delete"),new PParameter("wt", "WTSpecID.WT"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_deleteOp = body.getOrCreateVariableByName("deleteOp");
      PVariable var_wt = body.getOrCreateVariableByName("wt");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_deleteOp, "deleteOp"), 
        new ExportedParameter(body, var_wt, "wt")
      ));
      
      
      new TypeUnary(body, var_wt, getClassifierLiteral("http://WTSpec/2.01", "WT"), "http://WTSpec/2.01/WT");
      new TypeUnary(body, var_deleteOp, getClassifierLiteral("http://diffmodel/1.0", "Delete"), "http://diffmodel/1.0/Delete");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private DeleteQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<DeleteQuerySpecification> {
    @Override
    public DeleteQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static DeleteQuerySpecification INSTANCE = make();
    
    public static DeleteQuerySpecification make() {
      try {
      	return new DeleteQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
