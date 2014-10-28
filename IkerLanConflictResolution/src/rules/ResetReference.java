package rules;

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
			IdentifiableWTElement pTarget) {

		String ref = pResetRefOp.getReference();

		pTarget.eUnset(pTarget.eClass().getEStructuralFeature(ref));

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
