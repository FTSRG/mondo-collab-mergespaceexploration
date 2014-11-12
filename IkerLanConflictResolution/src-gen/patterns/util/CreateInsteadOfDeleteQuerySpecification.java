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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
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
  
  @Override
  protected CreateInsteadOfDeleteMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CreateInsteadOfDeleteMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.createInsteadOfDelete";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("deleteOp","createOp");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("deleteOp", "DiffModel.Delete"),new PParameter("createOp", "DiffModel.Create"));
  }
  
  @Override
  public CreateInsteadOfDeleteMatch newEmptyMatch() {
    return CreateInsteadOfDeleteMatch.newEmptyMatch();
  }
  
  @Override
  public CreateInsteadOfDeleteMatch newMatch(final Object... parameters) {
    return CreateInsteadOfDeleteMatch.newMatch((DiffModel.Delete) parameters[0], (DiffModel.Create) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_deleteOp = body.getOrCreateVariableByName("deleteOp");
      PVariable var_createOp = body.getOrCreateVariableByName("createOp");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_deleteOp, "deleteOp"), 
        new ExportedParameter(body, var_createOp, "createOp")
      ));
      
      new TypeUnary(body, var_deleteOp, getClassifierLiteral("http://diffmodel/1.0", "Delete"), "http://diffmodel/1.0/Delete");
      
      new TypeBinary(body, CONTEXT, var_deleteOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      new TypeBinary(body, CONTEXT, var_createOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Create", "containerTargetID"), "http://diffmodel/1.0/Create.containerTargetID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static CreateInsteadOfDeleteQuerySpecification INSTANCE = make();
    
    public static CreateInsteadOfDeleteQuerySpecification make() {
      return new CreateInsteadOfDeleteQuerySpecification();					
      
    }
  }
}
