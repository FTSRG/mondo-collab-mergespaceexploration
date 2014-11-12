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
import patterns.SetAttributeMatch;
import patterns.SetAttributeMatcher;

/**
 * A pattern-specific query specification that can instantiate SetAttributeMatcher in a type-safe way.
 * 
 * @see SetAttributeMatcher
 * @see SetAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class SetAttributeQuerySpecification extends BaseGeneratedQuerySpecification<SetAttributeMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SetAttributeQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected SetAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SetAttributeMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.setAttribute";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("setAttrOp","target");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("setAttrOp", "DiffModel.SetAttribute"),new PParameter("target", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public SetAttributeMatch newEmptyMatch() {
    return SetAttributeMatch.newEmptyMatch();
  }
  
  @Override
  public SetAttributeMatch newMatch(final Object... parameters) {
    return SetAttributeMatch.newMatch((DiffModel.SetAttribute) parameters[0], (WTSpecID.IdentifiableWTElement) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_setAttrOp = body.getOrCreateVariableByName("setAttrOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_setAttrOp, "setAttrOp"), 
        new ExportedParameter(body, var_target, "target")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeUnary(body, var_setAttrOp, getClassifierLiteral("http://diffmodel/1.0", "SetAttribute"), "http://diffmodel/1.0/SetAttribute");
      new TypeBinary(body, CONTEXT, var_setAttrOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SetAttributeQuerySpecification INSTANCE = make();
    
    public static SetAttributeQuerySpecification make() {
      return new SetAttributeQuerySpecification();					
      
    }
  }
}
