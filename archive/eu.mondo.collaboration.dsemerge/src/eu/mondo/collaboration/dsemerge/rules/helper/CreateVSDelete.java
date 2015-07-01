package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Create;
import DiffModel.Delete;
import eu.mondo.collaboration.dsemerge.patterns.CreateVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.CreateVSDeleteMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.CreateVSDeleteProcessor;

public class CreateVSDelete extends CreateVSDeleteProcessor {

	@Override
	public void process(Create pCreateOp, Delete pDeleteOp) {
		
		pDeleteOp.setExecutable(false);
		
	}
	
	public static TransformationRule<CreateVSDeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<CreateVSDeleteMatch> createVSdelete = new TransformationRule<CreateVSDeleteMatch>(
				CreateVSDeleteMatcher.querySpecification(), new CreateVSDelete());

		return createVSdelete;
	}
	
}
