package eu.mondo.collaboration.dsemerge.rules.basic;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import wtspecid.IdentifiableWTElement;
import DiffModel.Delete;
import eu.mondo.collaboration.dsemerge.patterns.DeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.DeleteProcessor;

public class DeleteElement extends DeleteProcessor {

	@Override
	public void process(Delete pDeleteOp, IdentifiableWTElement pTarget) {
		System.out.println("DeleteElement");
		// deleting target from original
		EcoreUtil.delete(pTarget);
		// deleting this DeleteOp from DiffModel
		EcoreUtil.delete(pDeleteOp);
		
	}

	public static TransformationRule<DeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteMatch> deleteElement = new TransformationRule<DeleteMatch>(
				DeleteMatcher.querySpecification(), new DeleteElement());

		return deleteElement;
	}
	
}
