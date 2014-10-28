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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import patterns.ResetReferenceMatcher;

/**
 * A pattern-specific query specification that can instantiate ResetReferenceMatcher in a type-safe way.
 * 
 * @see ResetReferenceMatcher
 * @see ResetReferenceMatch
 * 
 */
@SuppressWarnings("all")
public final class ResetReferenceQuerySpecification extends BaseGeneratedQuerySpecification<ResetReferenceMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ResetReferenceQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected ResetReferenceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ResetReferenceMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.resetReference";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("resetRefOp","target");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("resetRefOp", "DiffModel.ResetReference"),new PParameter("target", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_resetRefOp = body.getOrCreateVariableByName("resetRefOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_resetRefOp, "resetRefOp"), 
        new ExportedParameter(body, var_target, "target")
      ));
      
      new TypeUnary(body, var_resetRefOp, getClassifierLiteral("http://diffmodel/1.0", "ResetReference"), "http://diffmodel/1.0/ResetReference");
      
      new TypeBinary(body, context, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, context, var_resetRefOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetId"), "http://diffmodel/1.0/Identifiable.targetId");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private ResetReferenceQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<ResetReferenceQuerySpecification> {
    @Override
    public ResetReferenceQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static ResetReferenceQuerySpecification INSTANCE = make();
    
    public static ResetReferenceQuerySpecification make() {
      try {
      	return new ResetReferenceQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
