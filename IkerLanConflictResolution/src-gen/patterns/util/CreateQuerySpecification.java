package patterns.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import patterns.CreateMatch;
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
    return LazyHolder.INSTANCE;
    
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
    return Arrays.asList("createOp","mainRoot");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("createOp", "DiffModel.Create"),new PParameter("mainRoot", "ModelContainer.MainRoot"));
  }
  
  @Override
  public CreateMatch newEmptyMatch() {
    return CreateMatch.newEmptyMatch();
  }
  
  @Override
  public CreateMatch newMatch(final Object... parameters) {
    return CreateMatch.newMatch((DiffModel.Create) parameters[0], (ModelContainer.MainRoot) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_createOp = body.getOrCreateVariableByName("createOp");
      PVariable var_mainRoot = body.getOrCreateVariableByName("mainRoot");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_createOp, "createOp"), 
        new ExportedParameter(body, var_mainRoot, "mainRoot")
      ));
      
      new TypeUnary(body, var_createOp, getClassifierLiteral("http://diffmodel/1.0", "Create"), "http://diffmodel/1.0/Create");
      
      new TypeUnary(body, var_mainRoot, getClassifierLiteral("http://modelcontainer/1.0", "MainRoot"), "http://modelcontainer/1.0/MainRoot");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static CreateQuerySpecification INSTANCE = make();
    
    public static CreateQuerySpecification make() {
      return new CreateQuerySpecification();					
      
    }
  }
}
