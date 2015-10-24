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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.viatra.dse.merge.iq.CreateMatch;
import org.eclipse.viatra.dse.merge.iq.CreateMatcher;

import com.google.common.collect.Sets;

/**
 * A pattern-specific query specification that can instantiate CreateMatcher in
 * a type-safe way.
 * 
 * @see CreateMatcher
 * @see CreateMatch
 * 
 */
@SuppressWarnings("all")
public final class CreateQuerySpecification extends
		BaseGeneratedEMFQuerySpecification<CreateMatcher> {
	private CreateQuerySpecification(PQuery id2object) {
		super(new GeneratedPQuery(id2object));
	}

	/**
	 * @return the singleton instance of the query specification
	 * @throws IncQueryException
	 *             if the pattern definition could not be loaded
	 * 
	 */
	
	public static CreateQuerySpecification instance()
			throws IncQueryException {
		return LazyHolder.INSTANCE;
	}
	
	public static CreateQuerySpecification instance(
			PQuery id2object) throws IncQueryException {
		try {
			return LazyHolder.make(id2object);
		} catch (ExceptionInInitializerError err) {
			throw processInitializerError(err);
		}
	}

	@Override
	protected CreateMatcher instantiate(final IncQueryEngine engine)
			throws IncQueryException {
		return CreateMatcher.on(engine);
	}

	@Override
	public CreateMatch newEmptyMatch() {
		return CreateMatch.newEmptyMatch();
	}

	@Override
	public CreateMatch newMatch(final Object... parameters) {
		return CreateMatch.newMatch(
				(org.eclipse.emf.ecore.EObject) parameters[0],
				(org.eclipse.viatra.dse.merge.model.Create) parameters[1]);
	}

	private static class LazyHolder {

		private static CreateQuerySpecification INSTANCE;

		public static CreateQuerySpecification make(
				PQuery id2object) {
			return INSTANCE = new CreateQuerySpecification(id2object);
		}
	}

	private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
		private PQuery id2object;

		public GeneratedPQuery(PQuery id2object) {
			this.id2object = id2object;
		}

		@Override
		public String getFullyQualifiedName() {
			return "org.eclipse.viatra.dse.merge.iq.create";
		}

		@Override
		public List<String> getParameterNames() {
			return Arrays.asList("container", "change");
		}

		@Override
		public List<PParameter> getParameters() {
			return Arrays.asList(new PParameter("container",
					"org.eclipse.emf.ecore.EObject"), new PParameter("change",
					"org.eclipse.viatra.dse.merge.model.Create"));
		}

		@Override
		public Set<PBody> doGetContainedBodies()
				throws QueryInitializationException {
			Set<PBody> bodies = Sets.newLinkedHashSet();
			try {
				{
					PBody body = new PBody(this);
					PVariable var_container = body
							.getOrCreateVariableByName("container");
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
					body.setExportedParameters(Arrays
							.<ExportedParameter> asList(new ExportedParameter(
									body, var_container, "container"),

							new ExportedParameter(body, var_change, "change")));
					new TypeConstraint(
							body,
							new FlatTuple(var_container),
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
											"Create")));
					new TypeConstraint(
							body,
							new FlatTuple(var_container),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://www.eclipse.org/emf/2002/Ecore",
											"EObject")));
					new PositivePatternCall(body, new FlatTuple(var_container,
							var_c_id), id2object);
					new TypeConstraint(
							body,
							new FlatTuple(var_change),
							new EClassTransitiveInstancesKey(
									(EClass) getClassifierLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Create")));
					new TypeConstraint(
							body,
							new FlatTuple(var_change, var__virtual_1_),
							new EStructuralFeatureInstancesKey(
									getFeatureLiteral(
											"http://org.eclipse.viatra.dse.merge/model",
											"Create", "container")));
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
