package rules;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import wtspecid.IdentifiableWTElement;
import patterns.ResetAttributeMatch;
import patterns.ResetAttributeMatcher;
import patterns.util.ResetAttributeProcessor;

public class ResetAttribute extends ResetAttributeProcessor {

	@Override
	public void process(DseMergeDiffModel.ResetAttribute pResetAttrOp,
			IdentifiableWTElement pTarget) {
		
		String attr = pResetAttrOp.getAttribute();
		
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(attr);

		pTarget.eUnset(esf);

		EcoreUtil.delete(pResetAttrOp);
		
	}

	public static TransformationRule<ResetAttributeMatch> createRule()
			throws IncQueryException {

		TransformationRule<ResetAttributeMatch> resetAttribute = new TransformationRule<ResetAttributeMatch>(
				ResetAttributeMatcher.querySpecification(),
				new ResetAttribute());

		return resetAttribute;
	}

}
