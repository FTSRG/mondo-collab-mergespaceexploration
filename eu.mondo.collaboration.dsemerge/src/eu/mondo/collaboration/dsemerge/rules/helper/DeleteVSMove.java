package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.Move;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSMoveMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSMoveMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.DeleteVSMoveProcessor;

public class DeleteVSMove extends DeleteVSMoveProcessor{

	@Override
	public void process(Delete pDeleteOp, Move pMoveOp) {
		System.out.println("DeleteVSMove");
		pMoveOp.setExecutable(false);
		
	}

	public static TransformationRule<DeleteVSMoveMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteVSMoveMatch> deleteVSmove = new TransformationRule<DeleteVSMoveMatch>(
				DeleteVSMoveMatcher.querySpecification(), new DeleteVSMove());

		return deleteVSmove;
	}
	
}
