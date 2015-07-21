package org.eclipse.viatra.dse.merge.iq.util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.dse.merge.iq.SetAttributeMatch;
import org.eclipse.viatra.dse.merge.iq.SetAttributeMatcher;

import com.google.common.collect.Sets;

/**
 * A pattern-specific query specification that can instantiate
 * SetAttributeMatcher in a type-safe way.
 * 
 * @see SetAttributeMatcher
 * @see SetAttributeMatch
 * 
 */
@SuppressWarnings("all")
public final class SetAttributeQuerySpecification extends
		BaseGeneratedEMFQuerySpecification<SetAttributeMatcher> {
	private SetAttributeQuerySpecification(PQuery id2object) {
		super(new GeneratedPQuery(id2object));
	}

	/**
	 * @return the singleton instance of the query specification
	 * @throws IncQueryException
	 *             if the pattern definition could not be loaded
	 * 
	 */
	
	public static SetAttributeQuerySpecification instance()
			throws IncQueryException {
		return LazyHolder.INSTANCE;
	}
	
	public static SetAttributeQuerySpecification instance(
			PQuery id2object) throws IncQueryException {
		try {
			return LazyHolder.make(id2object);
		} catch (ExceptionInInitializerError err) {
			throw processInitializerError(err);
		}
	}

	@Override
	protected SetAttributeMatcher instantiate(final IncQueryEngine engine)
			throws IncQueryException {
		return SetAttributeMatcher.on(engine);
	}

	@Override
	public SetAttributeMatch newEmptyMatch() {
		return SetAttributeMatch.newEmptyMatch();
	}

	@Override
	public SetAttributeMatch newMatch(final Object... parameters) {
		return SetAttributeMatch.newMatch(
				(org.eclipse.emf.ecore.EObject) parameters[0],
				(org.eclipse.viatra.dse.merge.model.Attribute) parameters[1]);
	}

	private static class LazyHolder {

		private static SetAttributeQuerySpecification INSTANCE;

		public static SetAttributeQuerySpecification make(
				PQuery id2object) {
			return INSTANCE = new SetAttributeQuerySpecification(id2object);
		}
	}

	private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
		private PQuery id2object;

		public GeneratedPQuery(PQuery id2object) {
			this.id2object = id2object;
		}

		@Override
		public String getFullyQualifiedName() {
			return "org.eclipse.viatra.dse.merge.iq.setAttribute";
		}

		@Override
		public List<String> getParameterNames() {
			return Arrays.asList("src", "change");
		}

		@Override
		public List<PParameter> getParameters() {
			return Arrays.asList(new PParameter("src",
					"org.eclipse.emf.ecore.EObject"), new PParameter("change",
					"org.eclipse.viatra.dse.merge.model.Attribute"));
		}

		@Override
		public Set<PBody> doGetContainedBodies()
				throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			try {
				{
					PBody body = new PBody(this);
					PVariable var_src = body.getOrCreateVariableByName("src");
					PVariable var_change = body
							.getOrCreateVariableByName("change");
					PVariable var_src_id = body
							.getOrCreateVariableByName("src_id");
					PVariable var__virtual_0_ = body
							.getOrCreateVariableByName(".virtual{0}");
					PVariable var__virtual_1_ = body
							.getOrCreateVariableByName(".virtual{1}");
					PVariable var__virtual_2_ = body
							.getOrCreateVariableByName(".virtual{2}");
					PVariable var__virtual_3_ = body
							.getOrCreateVariableByName(".virtual{3}");
					PVariable var__virtual_4_ = body
							.getOrCreateVariableByName(".virtual{4}");
					PVariable var__virtual_5_ = body
							.getOrCreateVariableByName(".virtual{5}");
					PVariable var__virtual_6_ = body
							.getOrCreateVariableByName(".virtual{6}");
					body.setExportedParameters(Arrays
							.<ExportedParameter> asList(new ExportedParameter(
									body, var_src, "src"),

							new ExportedParameter(body, var_change, "change")));
					new TypeConstraint(
							body,
							new FlatTuple(var_src),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://www.eclipse.org/emf/2002/Ecore",
											"EObject")));
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Attribute")));
					new TypeConstraint(
							body,
							new FlatTuple(var_src),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://www.eclipse.org/emf/2002/Ecore",
											"EObject")));
					new PositivePatternCall(body, new FlatTuple(var_src,
							var_src_id), id2object);
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Attribute")));
					new TypeConstraint(
							body,
							new FlatTuple(var_change, var__virtual_1_),
							new EStructuralFeatureInstancesKey(
									getFeatureLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Change", "src")));
					new TypeConstraint(
							body,
							new FlatTuple(var__virtual_1_, var__virtual_2_),
							new EStructuralFeatureInstancesKey(
									getFeatureLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Id", "eString")));
					new Equality(body, var__virtual_2_, var_src_id);
					new ConstantValue(body, var__virtual_3_, getEnumLiteral(
							"http://org.eclipse.viatra.dse.merge/model",
							"Kind", "set").getInstance());
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Attribute")));
					new TypeConstraint(
							body,
							new FlatTuple(var_change, var__virtual_4_),
							new EStructuralFeatureInstancesKey(
									getFeatureLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Feature", "kind")));
					new Equality(body, var__virtual_4_, var__virtual_3_);
					new ConstantValue(body, var__virtual_5_, true);
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Change")));
					new TypeConstraint(
							body,
							new FlatTuple(var_change, var__virtual_6_),
							new EStructuralFeatureInstancesKey(
									getFeatureLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Change", "executable")));
					new Equality(body, var__virtual_6_, var__virtual_5_);
					new NegativePatternCall(body, new FlatTuple(var_src),
							InCemeteryQuerySpecification.instance()
									.getInternalQueryRepresentation());
					bodies.add(body);
				}
				// to silence compiler error
				if (false)
					throw new IncQueryException("Never", "happens");
			} catch (IncQueryException ex) {
				throw processDependencyException(ex);
			}
			return bodies;
		}
	}
}
