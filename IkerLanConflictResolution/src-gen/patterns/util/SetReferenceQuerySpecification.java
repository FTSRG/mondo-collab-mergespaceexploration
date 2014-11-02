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
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import patterns.SetReferenceMatch;
import patterns.SetReferenceMatcher;

/**
 * A pattern-specific query specification that can instantiate SetReferenceMatcher in a type-safe way.
 * 
 * @see SetReferenceMatcher
 * @see SetReferenceMatch
 * 
 */
@SuppressWarnings("all")
public final class SetReferenceQuerySpecification extends BaseGeneratedQuerySpecification<SetReferenceMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SetReferenceQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected SetReferenceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SetReferenceMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.setReference";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("setRefOp","target","ref");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("setRefOp", "DiffModel.SetReference"),new PParameter("target", "WTSpecID.IdentifiableWTElement"),new PParameter("ref", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public SetReferenceMatch newEmptyMatch() {
    return SetReferenceMatch.newEmptyMatch();
  }
  
  @Override
  public SetReferenceMatch newMatch(final Object... parameters) {
    return SetReferenceMatch.newMatch((DiffModel.SetReference) parameters[0], (WTSpecID.IdentifiableWTElement) parameters[1], (WTSpecID.IdentifiableWTElement) parameters[2]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_setRefOp = body.getOrCreateVariableByName("setRefOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_ref = body.getOrCreateVariableByName("ref");
      PVariable var_id = body.getOrCreateVariableByName("id");
      PVariable var_id2 = body.getOrCreateVariableByName("id2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_setRefOp, "setRefOp"), 
        new ExportedParameter(body, var_target, "target"), 
        new ExportedParameter(body, var_ref, "ref")
      ));
      
      
      
      new TypeBinary(body, CONTEXT, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, CONTEXT, var_setRefOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      new TypeBinary(body, CONTEXT, var_ref, var_id2, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, CONTEXT, var_setRefOp, var_id2, getFeatureLiteral("http://diffmodel/1.0", "SetReference", "refID"), "http://diffmodel/1.0/SetReference.refID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SetReferenceQuerySpecification INSTANCE = make();
    
    public static SetReferenceQuerySpecification make() {
      return new SetReferenceQuerySpecification();					
      
    }
  }
}
