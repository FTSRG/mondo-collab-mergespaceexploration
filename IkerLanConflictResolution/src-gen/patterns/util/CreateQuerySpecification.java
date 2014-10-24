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
import patterns.CreateMatcher;

/**
 * A pattern-specific query specification that can instantiate CreateMatcher in a type-safe way.
 * 
 * @see CreateMatcher
 * @see CreateMatch
 * 
 */
@SuppressWarnings("all")
public final class CreateQuerySpecification extends BaseGeneratedQuerySpecification<CreateMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CreateQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected CreateMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CreateMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.create";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("createOp");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("createOp", "DiffModel.Create"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_createOp = body.getOrCreateVariableByName("createOp");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_createOp, "createOp")
      ));
      
      new TypeUnary(body, var_createOp, getClassifierLiteral("http://diffmodel/1.0", "Create"), "http://diffmodel/1.0/Create");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private CreateQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<CreateQuerySpecification> {
    @Override
    public CreateQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static CreateQuerySpecification INSTANCE = make();
    
    public static CreateQuerySpecification make() {
      try {
      	return new CreateQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
