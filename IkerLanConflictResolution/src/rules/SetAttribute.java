package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.SetAttributeMatch;
import patterns.SetAttributeMatcher;

public class SetAttribute implements IMatchProcessor<SetAttributeMatch> {

	@Override
	public void process(SetAttributeMatch match) {
		
		String attr = match.getSetAttrOp().getAttribute();
		String value = match.getSetAttrOp().getValue();
		String targetId = match.getSetAttrOp().getTargetId();
		
		EList<EObject> elements = match.getWt().eResource().getContents();

		for (EObject eObject : elements) {
			if (eObject.eGet(eObject.eClass().getEStructuralFeature("ID"))
					.equals(targetId)) {
				
				// TODO cast value to the right type?
				eObject.eSet(eObject.eClass().getEStructuralFeature(attr), value);
				
				break;
			}
		}
		
		EcoreUtil.delete(match.getSetAttrOp());
		
	}

	public static TransformationRule<SetAttributeMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<SetAttributeMatch> setAttribute = new TransformationRule<SetAttributeMatch>(
				SetAttributeMatcher.querySpecification(), new SetAttribute());

		return setAttribute;
	}
}
