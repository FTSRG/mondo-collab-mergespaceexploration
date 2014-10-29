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
import patterns.AddToListMatch;
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
    return LazyHolder.INSTANCE;
    
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
  public AddToListMatch newEmptyMatch() {
    return AddToListMatch.newEmptyMatch();
  }
  
  @Override
  public AddToListMatch newMatch(final Object... parameters) {
    return AddToListMatch.newMatch((DiffModel.AddToList) parameters[0], (WTSpecID.IdentifiableWTElement) parameters[1], (WTSpecID.IdentifiableWTElement) parameters[2]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
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
      
      
      
      new TypeBinary(body, CONTEXT, var_target, var_id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, CONTEXT, var_addToListOp, var_id, getFeatureLiteral("http://diffmodel/1.0", "Identifiable", "targetId"), "http://diffmodel/1.0/Identifiable.targetId");
      new TypeBinary(body, CONTEXT, var_ref, var_id2, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      new TypeBinary(body, CONTEXT, var_addToListOp, var_id2, getFeatureLiteral("http://diffmodel/1.0", "AddToList", "refID"), "http://diffmodel/1.0/AddToList.refID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static AddToListQuerySpecification INSTANCE = make();
    
    public static AddToListQuerySpecification make() {
      return new AddToListQuerySpecification();					
      
    }
  }
}
