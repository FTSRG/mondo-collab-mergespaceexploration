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
import patterns.SetReferenceMatch;
import patterns.SetReferenceMatcher;
import patterns.util.SetReferenceProcessor;

public class SetReference extends SetReferenceProcessor {

	@Override
	public void process(DiffModel.SetReference pSetRefOp,
			IdentifiableWTElement pTarget, IdentifiableWTElement pRef) {

		String ref = pSetRefOp.getReference();
		
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(ref);
		
		if (esf.getUpperBound() == 1) {
			pTarget.eSet(esf, pRef);
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
				SetReferenceMatcher.querySpecification(), new SetReference());

		return setReference;
	}

}
