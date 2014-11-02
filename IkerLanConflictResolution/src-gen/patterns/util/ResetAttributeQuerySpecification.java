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
import patterns.ResetAttributeMatch;
import patterns.ResetAttributeMatcher;

/**
 * A pattern-specific query specification that can instantiate ResetAttributeMatcher in a type-safe way.
 * 
 * @see ResetAttributeMatcher
 * @see ResetAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class ResetAttributeQuerySpecification extends BaseGeneratedQuerySpecification<ResetAttributeMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ResetAttributeQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected ResetAttributeMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ResetAttributeMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.resetAttribute";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("resetAttrOp","target");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("resetAttrOp", "DiffModel.ResetAttribute"),new PParameter("target", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public ResetAttributeMatch newEmptyMatch() {
    return ResetAttributeMatch.newEmptyMatch();
  }
  
  @Override
  public ResetAttributeMatch newMatch(final Object... parameters) {
    return ResetAttributeMatch.newMatch((DiffModel.ResetAttribute) parameters[0], (WTSpecID.IdentifiableWTElement) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_resetAttrOp = body.getOrCreateVariableByName("resetAttrOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_resetAttrOp, "resetAttrOp"), 
        new ExportedParameter(body, var_target, "target")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeUnary(body, var_resetAttrOp, getClassifierLiteral("http://diffmodel/1.0", "ResetAttribute"), "http://diffmodel/1.0/ResetAttribute");
      new TypeBinary(body, CONTEXT, var_resetAttrOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetID"), "http://diffmodel/1.0/Identifiable.targetID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static ResetAttributeQuerySpecification INSTANCE = make();
    
    public static ResetAttributeQuerySpecification make() {
      return new ResetAttributeQuerySpecification();					
      
    }
  }
}
