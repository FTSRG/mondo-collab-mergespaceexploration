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
    return Arrays.asList("addToListOp","target","wt");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("addToListOp", "DiffModel.AddToList"),new PParameter("target", "WTSpecID.IdentifiableWTElement"),new PParameter("wt", "WTSpecID.WT"));
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    EMFPatternMatcherContext context = new EMFPatternMatcherContext();
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_addToListOp = body.getOrCreateVariableByName("addToListOp");
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var_wt = body.getOrCreateVariableByName("wt");
      PVariable var_id = body.getOrCreateVariableByName("id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_addToListOp, "addToListOp"), 
        new ExportedParameter(body, var_target, "target"), 
        new ExportedParameter(body, var_wt, "wt")
      ));
      
      new TypeUnary(body, var_addToListOp, getClassifierLiteral("http://diffmodel/1.0", "AddToList"), "http://diffmodel/1.0/AddToList");
      
      
      new TypeUnary(body, var_wt, getClassifierLiteral("http://WTSpec/2.01", "WT"), "http://WTSpec/2.01/WT");
      new TypeBinary(body, context, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, context, var_addToListOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetId"), "http://diffmodel/1.0/Identifiable.targetId");
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
