package rules;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Create;
import DiffModel.Delete;
import patterns.CreateInsteadOfDeleteMatch;
import patterns.CreateInsteadOfDeleteMatcher;
import patterns.util.CreateInsteadOfDeleteProcessor;

public class CreateInsteadOfDelete extends CreateInsteadOfDeleteProcessor {

	@Override
	public void process(Delete pDeleteOp, Create pCreateOp) {

		System.out.println("CreateInsteadOfDeleteMatch");
		
		EcoreUtil.delete(pDeleteOp);
		
		System.out.println("CreateInsteadOfDeleteMatch End");
		
	}
	
	public static TransformationRule<CreateInsteadOfDeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<CreateInsteadOfDeleteMatch> deleteElement = new TransformationRule<CreateInsteadOfDeleteMatch>(
				CreateInsteadOfDeleteMatcher.querySpecification(), new CreateInsteadOfDelete());

		return deleteElement;
	}

}
