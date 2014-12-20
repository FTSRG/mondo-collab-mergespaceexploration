package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Create;
import DiffModel.Delete;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSCreateMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSCreateMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.DeleteVSCreateProcessor;

public class DeleteVSCreate extends DeleteVSCreateProcessor {

	@Override
	public void process(Delete pDeleteOp, Create pCreateOp) {
		
		pCreateOp.setExecutable(false);
		
	}

	public static TransformationRule<DeleteVSCreateMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteVSCreateMatch> deleteVScreate = new TransformationRule<DeleteVSCreateMatch>(
				DeleteVSCreateMatcher.querySpecification(), new DeleteVSCreate());

		return deleteVScreate;
	}
}