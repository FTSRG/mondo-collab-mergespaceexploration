package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.SetReference;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSSetRefMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSSetRefMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.DeleteVSSetRefProcessor;

public class DeleteVSSetRef extends DeleteVSSetRefProcessor {

	@Override
	public void process(Delete pDeleteOp, SetReference pSetRefOp) {
		
		pSetRefOp.setExecutable(false);
		
	}

	public static TransformationRule<DeleteVSSetRefMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteVSSetRefMatch> deleteVSsetRef = new TransformationRule<DeleteVSSetRefMatch>(
				DeleteVSSetRefMatcher.querySpecification(), new DeleteVSSetRef());

		return deleteVSsetRef;
	}
	
}