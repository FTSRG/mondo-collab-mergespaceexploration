package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.AddToListMatch;
import patterns.AddToListMatcher;

public class AddToList implements IMatchProcessor<AddToListMatch> {

	@Override
	public void process(AddToListMatch match) {

		String list = match.getAddToListOp().getList();
		String refID = match.getAddToListOp().getRefID();
		String targetID = match.getAddToListOp().getTargetId();
		
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
						EStructuralFeature esf = eObjectTarget.eClass().getEStructuralFeature(list);
						if (esf instanceof EList<?>) {
							EList<EObject> elist = (EList<EObject>) esf;
							elist.add(newRef);
							eObjectTarget.eSet(eObjectTarget.eClass().getEStructuralFeature(list), elist);
						}
						
						break;
					}
				}
				
				break;
			}
		}
		
		EcoreUtil.delete(match.getAddToListOp());
	}
	
	public static TransformationRule<AddToListMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<AddToListMatch> addToList = new TransformationRule<AddToListMatch>(
				AddToListMatcher.querySpecification(), new AddToList());

		return addToList;
	}

}
