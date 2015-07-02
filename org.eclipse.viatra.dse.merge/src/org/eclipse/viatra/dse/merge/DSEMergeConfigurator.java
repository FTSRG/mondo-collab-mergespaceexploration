package org.eclipse.viatra.dse.merge;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.DSETransformationRule;

public interface DSEMergeConfigurator {

	EPackage getMetamodel();
	
	IQuerySpecification<?> getId2EObject() throws IncQueryException;
	
	Collection<IQuerySpecification<?>> getObjectives() throws IncQueryException;
	
	Collection<DSETransformationRule<?, ?>> getRules() throws IncQueryException;
	
}
