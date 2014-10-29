package rules;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import WTSpecID.IdentifiableWTElement;
import patterns.SetAttributeMatch;
import patterns.SetAttributeMatcher;
import patterns.util.SetAttributeProcessor;

public class SetAttribute extends SetAttributeProcessor {

	@Override
	public void process(DiffModel.SetAttribute pSetAttrOp,
			IdentifiableWTElement pTarget) {

		String attr = pSetAttrOp.getAttribute();
		Object value = pSetAttrOp.getValue();

		// TODO cast value to the right type?
		pTarget.eSet(pTarget.eClass().getEStructuralFeature(attr), value);

		EcoreUtil.delete(pSetAttrOp);

	}

	public static TransformationRule<SetAttributeMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetAttributeMatch> setAttribute = new TransformationRule<SetAttributeMatch>(
				SetAttributeMatcher.querySpecification(), new SetAttribute());

		return setAttribute;
	}

}
