package org.eclipse.viatra.dse.merge;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DSETransformationRule;
import org.eclipse.viatra.dse.merge.iq.AddAttributeMatch;
import org.eclipse.viatra.dse.merge.iq.AddAttributeMatcher;
import org.eclipse.viatra.dse.merge.iq.AddReferenceMatch;
import org.eclipse.viatra.dse.merge.iq.AddReferenceMatcher;
import org.eclipse.viatra.dse.merge.iq.CreateMatch;
import org.eclipse.viatra.dse.merge.iq.CreateMatcher;
import org.eclipse.viatra.dse.merge.iq.DeleteMatch;
import org.eclipse.viatra.dse.merge.iq.DeleteMatcher;
import org.eclipse.viatra.dse.merge.iq.RemoveAttributeMatch;
import org.eclipse.viatra.dse.merge.iq.RemoveAttributeMatcher;
import org.eclipse.viatra.dse.merge.iq.RemoveReferenceMatch;
import org.eclipse.viatra.dse.merge.iq.RemoveReferenceMatcher;
import org.eclipse.viatra.dse.merge.iq.SetAttributeMatch;
import org.eclipse.viatra.dse.merge.iq.SetAttributeMatcher;
import org.eclipse.viatra.dse.merge.iq.SetReferenceMatch;
import org.eclipse.viatra.dse.merge.iq.SetReferenceMatcher;
import org.eclipse.viatra.dse.merge.iq.UnsetReferenceMatch;
import org.eclipse.viatra.dse.merge.iq.UnsetReferenceMatcher;
import org.eclipse.viatra.dse.merge.iq.util.AddAttributeQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.AddReferenceQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.CreateQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.DeleteQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.GoalPatternQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.RemoveAttributeQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.RemoveReferenceQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.SetAttributeQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.SetReferenceQuerySpecification;
import org.eclipse.viatra.dse.merge.iq.util.UnsetReferenceQuerySpecification;
import org.eclipse.viatra.dse.merge.operations.DefaultAddAttributeOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultAddReferenceOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultCreateOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultDeleteOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultRemoveAttributeOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultRemoveReferenceOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultSetAttributeOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultSetReferenceOperation;
import org.eclipse.viatra.dse.merge.operations.DefaultUnsetReferenceOperation;

import com.google.common.collect.Sets;

public abstract class DSEMergeConfigurator {

	private DSETransformationRule<UnsetReferenceMatch, UnsetReferenceMatcher> unsetReference;
	private DSETransformationRule<SetReferenceMatch, SetReferenceMatcher> setReference;
	private DSETransformationRule<SetAttributeMatch, SetAttributeMatcher> setAttribute;
	private DSETransformationRule<RemoveReferenceMatch, RemoveReferenceMatcher> removeReference;
	private DSETransformationRule<RemoveAttributeMatch, RemoveAttributeMatcher> removeAttribute;
	private DSETransformationRule<AddReferenceMatch, AddReferenceMatcher> addReference;
	private DSETransformationRule<AddAttributeMatch, AddAttributeMatcher> addAttribute;
	private DSETransformationRule<CreateMatch, CreateMatcher> create;
	private DSETransformationRule<DeleteMatch, DeleteMatcher> delete;

	public abstract EPackage getMetamodel();
	
	public abstract IQuerySpecification<?> getId2EObject() throws IncQueryException;
	
	public Collection<IQuerySpecification<?>> getObjectives() throws IncQueryException {
		return Sets.union(defaultObjectives(), additionalObjectives());
	}
	
	public Set<IQuerySpecification<?>> additionalObjectives() throws IncQueryException {
		return Collections.emptySet();
	} 
	
	public Set<DSETransformationRule<?, ?>> getRules() throws IncQueryException {
		return Sets.union(defaultRules(), additionalRules());
	}
	
	public Set<DSETransformationRule<?, ?>> additionalRules() throws IncQueryException {
		return Collections.emptySet();
	}
	
	public final Set<IQuerySpecification<?>> defaultObjectives() throws IncQueryException {
		return Sets.<IQuerySpecification<?>>newHashSet(GoalPatternQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()));
	}
	
	public final Set<DSETransformationRule<?, ?>> defaultRules() throws IncQueryException { 
		return Sets.<DSETransformationRule<?, ?>>newHashSet(
			defaultCreate(), defaultDelete(),
			defaultAddAttribute(), defaultRemoveAttribute(), defaultSetAttribute(),
			defaultAddReference(),defaultRemoveReference(), defaultSetReference(), defaultUnsetReference());
	}

	public final DSETransformationRule<UnsetReferenceMatch, UnsetReferenceMatcher> defaultUnsetReference()
			throws IncQueryException {
		return unsetReference == null ? 
				unsetReference = new DSETransformationRule<UnsetReferenceMatch, UnsetReferenceMatcher>(UnsetReferenceQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultUnsetReferenceOperation())
				: unsetReference;
	}

	public final DSETransformationRule<SetReferenceMatch, SetReferenceMatcher> defaultSetReference()
			throws IncQueryException {
		return setReference == null ? setReference = new DSETransformationRule<SetReferenceMatch, SetReferenceMatcher>(SetReferenceQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultSetReferenceOperation())
				: setReference;
	}

	public final DSETransformationRule<SetAttributeMatch, SetAttributeMatcher> defaultSetAttribute()
			throws IncQueryException {
		return setAttribute == null ? setAttribute =  new DSETransformationRule<SetAttributeMatch, SetAttributeMatcher>(SetAttributeQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultSetAttributeOperation())
				: setAttribute;
	}
	
	public final DSETransformationRule<RemoveReferenceMatch, RemoveReferenceMatcher> defaultRemoveReference()
			throws IncQueryException {
		return removeReference == null ? removeReference =   new DSETransformationRule<RemoveReferenceMatch, RemoveReferenceMatcher>(RemoveReferenceQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultRemoveReferenceOperation())
				: removeReference;
	}

	public final DSETransformationRule<RemoveAttributeMatch, RemoveAttributeMatcher> defaultRemoveAttribute()
			throws IncQueryException {
		return removeAttribute == null ? removeAttribute =    new DSETransformationRule<RemoveAttributeMatch, RemoveAttributeMatcher>(RemoveAttributeQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultRemoveAttributeOperation())
				: removeAttribute;
	}

	public final DSETransformationRule<DeleteMatch, DeleteMatcher> defaultDelete()
			throws IncQueryException {
		return delete == null ? delete =   new DSETransformationRule<DeleteMatch, DeleteMatcher>(DeleteQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultDeleteOperation())
				: delete;
	}

	public final DSETransformationRule<CreateMatch, CreateMatcher> defaultCreate()
			throws IncQueryException {
		return create == null ? create =   new DSETransformationRule<CreateMatch, CreateMatcher>(CreateQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultCreateOperation())
				: create;
	}

	public final DSETransformationRule<AddReferenceMatch, AddReferenceMatcher> defaultAddReference()	throws IncQueryException {
		return addReference == null ? addReference =   new DSETransformationRule<AddReferenceMatch, AddReferenceMatcher>(AddReferenceQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultAddReferenceOperation())
				: addReference;
	}

	public final DSETransformationRule<AddAttributeMatch, AddAttributeMatcher> defaultAddAttribute()	throws IncQueryException {
		return addAttribute == null ? addAttribute =   new DSETransformationRule<AddAttributeMatch, AddAttributeMatcher>(AddAttributeQuerySpecification.instance(getId2EObject().getInternalQueryRepresentation()), new DefaultAddAttributeOperation())
				: addAttribute;
	}
}
