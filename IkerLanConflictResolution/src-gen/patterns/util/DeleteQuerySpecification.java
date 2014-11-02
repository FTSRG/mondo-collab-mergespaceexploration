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
import patterns.DeleteMatch;
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
    return LazyHolder.INSTANCE;
    
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
    return Arrays.asList("deleteOp","target");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("deleteOp", "DiffModel.Delete"),new PParameter("target", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public DeleteMatch newEmptyMatch() {
    return DeleteMatch.newEmptyMatch();
  }
  
  @Override
  public DeleteMatch newMatch(final Object... parameters) {
    return DeleteMatch.newMatch((DiffModel.Delete) parameters[0], (WTSpecID.IdentifiableWTElement) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_deleteOp = body.getOrCreateVariableByName("deleteOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_deleteOp, "deleteOp"), 
        new ExportedParameter(body, var_target, "target")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeUnary(body, var_deleteOp, getClassifierLiteral("http://diffmodel/1.0", "Delete"), "http://diffmodel/1.0/Delete");
      new TypeBinary(body, CONTEXT, var_deleteOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static DeleteQuerySpecification INSTANCE = make();
    
    public static DeleteQuerySpecification make() {
      return new DeleteQuerySpecification();					
      
    }
  }
}
