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
import patterns.AllIdentifiableMatch;
import patterns.AllIdentifiableMatcher;

/**
 * A pattern-specific query specification that can instantiate AllIdentifiableMatcher in a type-safe way.
 * 
 * @see AllIdentifiableMatcher
 * @see AllIdentifiableMatch
 * 
 */
@SuppressWarnings("all")
public final class AllIdentifiableQuerySpecification extends BaseGeneratedQuerySpecification<AllIdentifiableMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllIdentifiableQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected AllIdentifiableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllIdentifiableMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "patterns.allIdentifiable";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("target");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("target", "WTSpecID.IdentifiableWTElement"));
  }
  
  @Override
  public AllIdentifiableMatch newEmptyMatch() {
    return AllIdentifiableMatch.newEmptyMatch();
  }
  
  @Override
  public AllIdentifiableMatch newMatch(final Object... parameters) {
    return AllIdentifiableMatch.newMatch((WTSpecID.IdentifiableWTElement) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_target = body.getOrCreateVariableByName("target");
      PVariable var__id = body.getOrCreateVariableByName("_id");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_target, "target")
      ));
      
      new TypeBinary(body, CONTEXT, var_target, var__id, getFeatureLiteral("http://WTSpec/2.01", "IdentifiableWTElement", "ID"), "http://WTSpec/2.01/IdentifiableWTElement.ID");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static AllIdentifiableQuerySpecification INSTANCE = make();
    
    public static AllIdentifiableQuerySpecification make() {
      return new AllIdentifiableQuerySpecification();					
      
    }
  }
}
