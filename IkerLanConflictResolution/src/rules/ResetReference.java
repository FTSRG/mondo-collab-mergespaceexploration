package rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import WTSpecID.IdentifiableWTElement;
import patterns.ResetReferenceMatch;
import patterns.ResetReferenceMatcher;
import patterns.util.ResetReferenceProcessor;

public class ResetReference extends ResetReferenceProcessor {

	@Override
	public void process(DiffModel.ResetReference pResetRefOp,
			IdentifiableWTElement pTarget, IdentifiableWTElement pRef) {
		
		String ref = pResetRefOp.getReference();
		
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(ref);
		
		if (esf.getUpperBound() == 1) {
			pTarget.eUnset(esf);
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
			
			newList.remove(pRef);

			pTarget.eSet(esf, newList);
		}
		
		EcoreUtil.delete(pResetRefOp);
		
	}

	public static TransformationRule<ResetReferenceMatch> createRule()
			throws IncQueryException {

		TransformationRule<ResetReferenceMatch> resetReference = new TransformationRule<ResetReferenceMatch>(
				ResetReferenceMatcher.querySpecification(),
				new ResetReference());

		return resetReference;
	}

}
