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
import patterns.AddToListMatcher;

/**
 * A pattern-specific query specification that can instantiate AddToListMatcher in a type-safe way.
 * 
 * @see AddToListMatcher
 * @see AddToListMatch
 * 
 */
@SuppressWarnings("all")
public final class AddToListQuerySpecification extends BaseGeneratedQuerySpecification<AddToListMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AddToListQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected AddToListMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AddToListMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.addToList";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("addToListOp","target","ref");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("addToListOp", "DiffModel.AddToList"),new PParameter("target", "WTSpecID.IdentifiableWTElement"),new PParameter("ref", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_addToListOp = body.getOrCreateVariableByName("addToListOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_ref = body.getOrCreateVariableByName("ref");
      PVariable var_id = body.getOrCreateVariableByName("id");
      PVariable var_id2 = body.getOrCreateVariableByName("id2");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_addToListOp, "addToListOp"), 
        new ExportedParameter(body, var_target, "target"), 
        new ExportedParameter(body, var_ref, "ref")
      ));
      
      
      
      new TypeBinary(body, context, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, context, var_addToListOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetId"), "http://diffmodel/1.0/Identifiable.targetId");
      new TypeBinary(body, context, var_ref, var_id2, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, context, var_addToListOp, var_id2, getFeatureLiteral("http://diffmodel/1.0", "AddToList", "refID"), "http://diffmodel/1.0/AddToList.refID");
      bodies.add(body);
    }setStatus(PQueryStatus.OK);
    return bodies;
  }
  
  private AddToListQuerySpecification() throws IncQueryException {
    super();
    setStatus(PQueryStatus.UNINITIALIZED);
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<AddToListQuerySpecification> {
    @Override
    public AddToListQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static AddToListQuerySpecification INSTANCE = make();
    
    public static AddToListQuerySpecification make() {
      try {
      	return new AddToListQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
