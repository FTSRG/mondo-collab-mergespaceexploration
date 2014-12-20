package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Move;
import eu.mondo.collaboration.dsemerge.patterns.MoveVSMoveMatch;
import eu.mondo.collaboration.dsemerge.patterns.MoveVSMoveMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.MoveVSMoveProcessor;

public class MoveVSMove extends MoveVSMoveProcessor {

	@Override
	public void process(Move pMoveOp, Move pMoveOp2) {
		
		pMoveOp2.setEliminated(true);
		pMoveOp2.setExecutable(false);
		
	}
	
	public static TransformationRule<MoveVSMoveMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<MoveVSMoveMatch> moveVSmove = new TransformationRule<MoveVSMoveMatch>(
				MoveVSMoveMatcher.querySpecification(), new MoveVSMove());

		return moveVSmove;
	}

}
