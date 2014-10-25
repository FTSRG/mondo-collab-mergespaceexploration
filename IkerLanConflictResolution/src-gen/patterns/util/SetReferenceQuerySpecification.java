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
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
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
    return Arrays.asList("setRefOp","target");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("setRefOp", "DiffModel.SetReference"),new PParameter("target", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_setRefOp = body.getOrCreateVariableByName("setRefOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_setRefOp, "setRefOp"), 
        new ExportedParameter(body, var_target, "target")
      ));
      
      
      new TypeBinary(body, context, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeUnary(body, var_setRefOp, getClassifierLiteral("http://diffmodel/1.0", "SetReference"), "http://diffmodel/1.0/SetReference");
      new TypeBinary(body, context, var_setRefOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "id"), "http://diffmodel/1.0/Identifiable.id");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private SetReferenceQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<SetReferenceQuerySpecification> {
    @Override
    public SetReferenceQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static SetReferenceQuerySpecification INSTANCE = make();
    
    public static SetReferenceQuerySpecification make() {
      try {
      	return new SetReferenceQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
