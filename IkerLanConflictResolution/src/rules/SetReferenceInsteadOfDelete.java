package rules;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.SetReference;
import patterns.SetReferenceInsteadOfDeleteMatch;
import patterns.SetReferenceInsteadOfDeleteMatcher;
import patterns.util.SetReferenceInsteadOfDeleteProcessor;

public class SetReferenceInsteadOfDelete extends SetReferenceInsteadOfDeleteProcessor {

	@Override
	public void process(Delete pDeleteOp, SetReference pSetRefOp) {

		EcoreUtil.delete(pDeleteOp);
	}
	
	public static TransformationRule<SetReferenceInsteadOfDeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<SetReferenceInsteadOfDeleteMatch> deleteElement = new TransformationRule<SetReferenceInsteadOfDeleteMatch>(
				SetReferenceInsteadOfDeleteMatcher.querySpecification(), new SetReferenceInsteadOfDelete());

		return deleteElement;
	}

}
