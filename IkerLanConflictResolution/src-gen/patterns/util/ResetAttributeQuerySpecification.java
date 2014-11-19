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
    return Arrays.asList(new PParameter("resetAttrOp", "DseMergeDiffModel.ResetAttribute"),new PParameter("target", "wtspecid.IdentifiableWTElement"));
  }
  
  @Override
  public ResetAttributeMatch newEmptyMatch() {
    return ResetAttributeMatch.newEmptyMatch();
  }
  
  @Override
  public ResetAttributeMatch newMatch(final Object... parameters) {
    return ResetAttributeMatch.newMatch((DseMergeDiffModel.ResetAttribute) parameters[0], (wtspecid.IdentifiableWTElement) parameters[1]);
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
      
      new TypeUnary(body, var_resetAttrOp, getClassifierLiteral("http://dsemerge.diffmodel/1.0", "ResetAttribute"), "http://dsemerge.diffmodel/1.0/ResetAttribute");
      
      new TypeBinary(body, CONTEXT, var_target, var_id, getFeatureLiteral("http://dsemergewtspecid/1.0", "IdentifiableWTElement", "ID"), "http://dsemergewtspecid/1.0/IdentifiableWTElement.ID");
      new TypeBinary(body, CONTEXT, var_resetAttrOp, var_id, getFeatureLiteral("http://dsemerge.diffmodel/1.0", "Identifiable", "targetID"), "http://dsemerge.diffmodel/1.0/Identifiable.targetID");
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
