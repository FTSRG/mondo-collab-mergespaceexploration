package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.SetReferenceMatch;
import patterns.SetReferenceMatcher;

public class SetReference implements IMatchProcessor<SetReferenceMatch> {

	@Override
	public void process(SetReferenceMatch match) {
		
		String ref = match.getSetRefOp().getReference();
		String refID = match.getSetRefOp().getRefID();
		String targetID = match.getSetRefOp().getTargetId();
		
		EList<EObject> elements = match.getWt().eResource().getContents();

		for (EObject eObjectTarget : elements) {
			if (eObjectTarget.eGet(eObjectTarget.eClass().getEStructuralFeature("ID"))
					.equals(targetID)) {
				
				EObject newRef;
				for (EObject eObjectRef : elements) {
					if (eObjectRef.eGet(eObjectRef.eClass().getEStructuralFeature("ID"))
							.equals(refID)) {
						
						newRef = eObjectRef;
						// TODO cast new reference to the right type?
						eObjectTarget.eSet(eObjectTarget.eClass().getEStructuralFeature(ref), newRef);
						break;
					}
				}
				
				break;
			}
		}
		
		EcoreUtil.delete(match.getSetRefOp());
	}

	public static TransformationRule<SetReferenceMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<SetReferenceMatch> setReference = new TransformationRule<SetReferenceMatch>(
				SetReferenceMatcher.querySpecification(), new SetReference());

		return setReference;
	}
}
