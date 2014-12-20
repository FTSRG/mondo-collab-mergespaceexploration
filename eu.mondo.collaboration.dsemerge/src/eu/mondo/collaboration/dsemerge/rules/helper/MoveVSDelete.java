package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.Move;
import eu.mondo.collaboration.dsemerge.patterns.MoveVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.MoveVSDeleteMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.MoveVSDeleteProcessor;

public class MoveVSDelete extends MoveVSDeleteProcessor {

	@Override
	public void process(Move pMoveOp, Delete pDeleteOp) {
		System.out.println("MoveVSDelete");
		pDeleteOp.setExecutable(false);
		
	}

	public static TransformationRule<MoveVSDeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<MoveVSDeleteMatch> moveVSdelete = new TransformationRule<MoveVSDeleteMatch>(
				MoveVSDeleteMatcher.querySpecification(), new MoveVSDelete());

		return moveVSdelete;
	}
	
}
