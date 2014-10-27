package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.ResetReferenceMatch;
import patterns.ResetReferenceMatcher;

public class ResetReference implements IMatchProcessor<ResetReferenceMatch> {

	@Override
	public void process(ResetReferenceMatch match) {

		String ref = match.getResetRefOp().getReference();
		String targetId = match.getResetRefOp().getTargetId();
		
		EList<EObject> elements = match.getWt().eResource().getContents();

		for (EObject eObject : elements) {
			if (eObject.eGet(eObject.eClass().getEStructuralFeature("ID"))
					.equals(targetId)) {
				
				eObject.eUnset(eObject.eClass().getEStructuralFeature(ref));
				
				break;
			}
		}
		
		EcoreUtil.delete(match.getResetRefOp());
	}
	
	public static TransformationRule<ResetReferenceMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<ResetReferenceMatch> resetReference = new TransformationRule<ResetReferenceMatch>(
				ResetReferenceMatcher.querySpecification(), new ResetReference());

		return resetReference;
	}

}
