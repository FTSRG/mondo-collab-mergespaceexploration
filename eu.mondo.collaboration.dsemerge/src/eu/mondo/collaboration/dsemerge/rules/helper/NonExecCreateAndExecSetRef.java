package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Create;
import DiffModel.SetReference;
import eu.mondo.collaboration.dsemerge.patterns.NonExecCreateAndExecSetRefWithSameTargetMatch;
import eu.mondo.collaboration.dsemerge.patterns.NonExecCreateAndExecSetRefWithSameTargetMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.NonExecCreateAndExecSetRefWithSameTargetProcessor;

public class NonExecCreateAndExecSetRef extends NonExecCreateAndExecSetRefWithSameTargetProcessor {

	@Override
	public void process(Create pCreateOp, SetReference pSetRefOp) {
		
		pCreateOp.setExecutable(false);
		pSetRefOp.setExecutable(false);
		
	}
	
	public static TransformationRule<NonExecCreateAndExecSetRefWithSameTargetMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<NonExecCreateAndExecSetRefWithSameTargetMatch> nonExecCreateOrNonExecSetRef = new TransformationRule<NonExecCreateAndExecSetRefWithSameTargetMatch>(
				NonExecCreateAndExecSetRefWithSameTargetMatcher.querySpecification(), new NonExecCreateAndExecSetRef());

		return nonExecCreateOrNonExecSetRef;
	}

}
