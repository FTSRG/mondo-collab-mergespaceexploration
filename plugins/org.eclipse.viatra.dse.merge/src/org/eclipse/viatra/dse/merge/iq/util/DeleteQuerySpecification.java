/*******************************************************************************
 * Copyright (c) 2010-2015, Csaba Debreceni, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Csaba Debreceni - initial API and implementation
 *******************************************************************************/
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
import org.eclipse.viatra.dse.merge.iq.DeleteMatch;
import org.eclipse.viatra.dse.merge.iq.DeleteMatcher;

import com.google.common.collect.Sets;

/**
 * A pattern-specific query specification that can instantiate DeleteMatcher in
 * a type-safe way.
 * 
 * @see DeleteMatcher
 * @see DeleteMatch
 * 
 */
@SuppressWarnings("all")
public final class DeleteQuerySpecification extends
		BaseGeneratedEMFQuerySpecification<DeleteMatcher> {
	private DeleteQuerySpecification(PQuery id2object, PQuery containment) {
		super(new GeneratedPQuery(id2object, containment));
	}

	/**
	 * @return the singleton instance of the query specification
	 * @throws IncQueryException
	 *             if the pattern definition could not be loaded
	 * 
	 */
	
	public static DeleteQuerySpecification instance()
			throws IncQueryException {
		return LazyHolder.INSTANCE;
	}
	
	public static DeleteQuerySpecification instance(PQuery id2object, PQuery containment) throws IncQueryException {
		try {
			return LazyHolder.make(id2object, containment);
		} catch (ExceptionInInitializerError err) {
			throw processInitializerError(err);
		}
	}

	@Override
	protected DeleteMatcher instantiate(final IncQueryEngine engine)
			throws IncQueryException {
		return DeleteMatcher.on(engine);
	}

	@Override
	public DeleteMatch newEmptyMatch() {
		return DeleteMatch.newEmptyMatch();
	}

	@Override
	public DeleteMatch newMatch(final Object... parameters) {
		return DeleteMatch.newMatch(
				(org.eclipse.emf.ecore.EObject) parameters[0],
				(org.eclipse.viatra.dse.merge.model.Delete) parameters[1]);
	}

	private static class LazyHolder {

		private static DeleteQuerySpecification INSTANCE;

		public static DeleteQuerySpecification make(PQuery id2object, PQuery containment) {
			return INSTANCE = new DeleteQuerySpecification(id2object, containment);
		}
	}

	private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
		private PQuery id2object;
        private PQuery containment;

		public GeneratedPQuery(PQuery id2object, PQuery containment) {
			this.id2object = id2object;
			this.containment = containment;
		}

		@Override
		public String getFullyQualifiedName() {
			return "org.eclipse.viatra.dse.merge.iq.delete";
		}

		@Override
		public List<String> getParameterNames() {
			return Arrays.asList("src", "change");
		}

		@Override
		public List<PParameter> getParameters() {
			return Arrays.asList(new PParameter("src",
					"org.eclipse.emf.ecore.EObject"), new PParameter("change",
					"org.eclipse.viatra.dse.merge.model.Delete"));
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
					PVariable var_c_id = body.getOrCreateVariableByName("c_id");
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
                    body.setSymbolicParameters(Arrays.<ExportedParameter> asList(
					        new ExportedParameter(body, var_src, "src"),
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
											"Delete")));
					new TypeConstraint(
							body,
							new FlatTuple(var_src),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://www.eclipse.org/emf/2002/Ecore",
											"EObject")));
					new NegativePatternCall(body, new FlatTuple(var_src,
                            var__virtual_5_), containment);
                    new PositivePatternCall(body, new FlatTuple(var_src,
							var_c_id), id2object);
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Delete")));
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
					new Equality(body, var__virtual_2_, var_c_id);
					new ConstantValue(body, var__virtual_3_, true);
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Change")));
					new TypeConstraint(
							body,
							new FlatTuple(var_change, var__virtual_4_),
							new EStructuralFeatureInstancesKey(
									getFeatureLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Change", "executable")));
					new Equality(body, var__virtual_4_, var__virtual_3_);
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
