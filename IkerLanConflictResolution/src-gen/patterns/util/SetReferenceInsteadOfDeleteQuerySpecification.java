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
  
  @Override
  protected SetReferenceInsteadOfDeleteMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SetReferenceInsteadOfDeleteMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.setReferenceInsteadOfDelete";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("deleteOp","setRefOp");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("deleteOp", "DiffModel.Delete"),new PParameter("setRefOp", "DiffModel.SetReference"));
  }
  
  @Override
  public SetReferenceInsteadOfDeleteMatch newEmptyMatch() {
    return SetReferenceInsteadOfDeleteMatch.newEmptyMatch();
  }
  
  @Override
  public SetReferenceInsteadOfDeleteMatch newMatch(final Object... parameters) {
    return SetReferenceInsteadOfDeleteMatch.newMatch((DiffModel.Delete) parameters[0], (DiffModel.SetReference) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_deleteOp = body.getOrCreateVariableByName("deleteOp");
      PVariable var_setRefOp = body.getOrCreateVariableByName("setRefOp");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_deleteOp, "deleteOp"), 
        new ExportedParameter(body, var_setRefOp, "setRefOp")
      ));
      
      
      new TypeUnary(body, var_deleteOp, getClassifierLiteral("http://diffmodel/1.0", "Delete"), "http://diffmodel/1.0/Delete");
      new TypeBinary(body, CONTEXT, var_deleteOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      new TypeUnary(body, var_setRefOp, getClassifierLiteral("http://diffmodel/1.0", "SetReference"), "http://diffmodel/1.0/SetReference");
      new TypeBinary(body, CONTEXT, var_setRefOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      bodies.add(body);
    }
    {
      PBody body = new PBody(this);
      PVariable var_deleteOp = body.getOrCreateVariableByName("deleteOp");
      PVariable var_setRefOp = body.getOrCreateVariableByName("setRefOp");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_deleteOp, "deleteOp"), 
        new ExportedParameter(body, var_setRefOp, "setRefOp")
      ));
      
      
      new TypeUnary(body, var_deleteOp, getClassifierLiteral("http://diffmodel/1.0", "Delete"), "http://diffmodel/1.0/Delete");
      new TypeBinary(body, CONTEXT, var_deleteOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      new TypeBinary(body, CONTEXT, var_setRefOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "SetReference", "refID"), "http://diffmodel/1.0/SetReference.refID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SetReferenceInsteadOfDeleteQuerySpecification INSTANCE = make();
    
    public static SetReferenceInsteadOfDeleteQuerySpecification make() {
      return new SetReferenceInsteadOfDeleteQuerySpecification();					
      
    }
  }
}
