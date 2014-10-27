package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.ResetAttributeMatch;
import patterns.ResetAttributeMatcher;

public class ResetAttribute implements IMatchProcessor<ResetAttributeMatch> {

	@Override
	public void process(ResetAttributeMatch match) {

		String attr = match.getResetAttrOp().getAttribute();
		String targetId = match.getResetAttrOp().getTargetId();
		
		EList<EObject> elements = match.getWt().eResource().getContents();

		for (EObject eObject : elements) {
			if (eObject.eGet(eObject.eClass().getEStructuralFeature("ID"))
					.equals(targetId)) {
				
				eObject.eUnset(eObject.eClass().getEStructuralFeature(attr));
				
				break;
			}
		}
		
		EcoreUtil.delete(match.getResetAttrOp());
		
	}
	
	public static TransformationRule<ResetAttributeMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<ResetAttributeMatch> resetAttribute = new TransformationRule<ResetAttributeMatch>(
				ResetAttributeMatcher.querySpecification(), new ResetAttribute());

		return resetAttribute;
	}

}
