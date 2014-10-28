package rules;

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

		// TODO cast new reference to the right type?
		pTarget.eSet(pTarget.eClass().getEStructuralFeature(ref), pRef);

		EcoreUtil.delete(pSetRefOp);

	}

	public static TransformationRule<SetReferenceMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetReferenceMatch> setReference = new TransformationRule<SetReferenceMatch>(
				SetReferenceMatcher.querySpecification(), new SetReference());

		return setReference;
	}

}
