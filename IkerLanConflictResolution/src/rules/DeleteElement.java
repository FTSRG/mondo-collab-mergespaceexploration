package rules;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import WTSpecID.IdentifiableWTElement;
import patterns.DeleteMatch;
import patterns.DeleteMatcher;
import patterns.util.DeleteProcessor;

public class DeleteElement extends DeleteProcessor {
	
	@Override
	public void process(Delete pDeleteOp, IdentifiableWTElement pTarget) {
		
		EcoreUtil.delete(pTarget);
		
		EcoreUtil.delete(pDeleteOp);
		
	}

	public static TransformationRule<DeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteMatch> deleteElement = new TransformationRule<DeleteMatch>(
				DeleteMatcher.querySpecification(), new DeleteElement());

		return deleteElement;
	}

}
