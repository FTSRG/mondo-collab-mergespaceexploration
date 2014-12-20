package eu.mondo.collaboration.dsemerge.rules.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import wtspecid.IdentifiableWTElement;
import DiffModel.SetReference;
import eu.mondo.collaboration.dsemerge.patterns.SetReferenceMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetReferenceMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.SetReferenceProcessor;

public class SetReferenceOnElement extends SetReferenceProcessor {

	@Override
	public void process(SetReference pSetRefOp, IdentifiableWTElement pTarget,
			IdentifiableWTElement pRef, SetReference pSetRefOp2,
			IdentifiableWTElement pTarget2, IdentifiableWTElement pRef2) {
		
		String ref = pSetRefOp.getReference();
		
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(ref);
		EObject oldRef = (EObject) pTarget.eGet(esf);
		
		// Setting referenced element based on the cardinality of its container
		if (esf.getUpperBound() == 1) {
			pTarget.eSet(esf, pRef);
			EObject newRef = (EObject) pTarget.eGet(pTarget.eClass().getEStructuralFeature(ref));
			
			if(newRef.equals(oldRef)) {
				pTarget.eUnset(esf);
			}
			
		}
		else {
			
			List<EObject> newList = new ArrayList<EObject>();
			
			Object obj = pTarget.eGet(esf);
			if (obj instanceof Collection<?>) {
				for (Object element : (Collection<?>) obj) {
					if (element instanceof EObject) {
						newList.add((EObject) element);
					}
				}
			}
			
			newList.add(pRef);

			pTarget.eSet(esf, newList);
		}

		EcoreUtil.delete(pSetRefOp);
		
	}

	public static TransformationRule<SetReferenceMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetReferenceMatch> setReference = new TransformationRule<SetReferenceMatch>(
				SetReferenceMatcher.querySpecification(), new SetReferenceOnElement());

		return setReference;
	}
	
}
