package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.RemoveFromListMatch;
import patterns.RemoveFromListMatcher;

public class RemoveFromList implements IMatchProcessor<RemoveFromListMatch> {

	@Override
	public void process(RemoveFromListMatch match) {
		
		String list = match.getRemoveFromListOp().getList();
		String refID = match.getRemoveFromListOp().getRefID();
		String targetID = match.getRemoveFromListOp().getTargetId();
		
		EList<EObject> elements = match.getWt().eResource().getContents();

		for (EObject eObjectTarget : elements) {
			if (eObjectTarget.eGet(eObjectTarget.eClass().getEStructuralFeature("ID"))
					.equals(targetID)) {
				
				EObject ref;
				for (EObject eObjectRef : elements) {
					if (eObjectRef.eGet(eObjectRef.eClass().getEStructuralFeature("ID"))
							.equals(refID)) {
						
						ref = eObjectRef;
						// TODO cast reference to the right type?
						EStructuralFeature esf = eObjectTarget.eClass().getEStructuralFeature(list);
						if (esf instanceof EList<?>) {
							EList<EObject> elist = (EList<EObject>) esf;
							elist.remove(ref);
							eObjectTarget.eSet(eObjectTarget.eClass().getEStructuralFeature(list), elist);
						}
						
						break;
					}
				}
				
				break;
			}
		}
		
		EcoreUtil.delete(match.getRemoveFromListOp());
		
	}
	
	public static TransformationRule<RemoveFromListMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<RemoveFromListMatch> removeFromList = new TransformationRule<RemoveFromListMatch>(
				RemoveFromListMatcher.querySpecification(), new RemoveFromList());

		return removeFromList;
	}

}
