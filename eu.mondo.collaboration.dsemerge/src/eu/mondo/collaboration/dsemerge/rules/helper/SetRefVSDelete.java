package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.SetReference;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSDeleteMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.SetRefVSDeleteProcessor;

public class SetRefVSDelete extends SetRefVSDeleteProcessor {

	@Override
	public void process(SetReference pSetRefOp, Delete pDeleteOp) {
		System.out.println("SetRefVSDelete");
		pDeleteOp.setExecutable(false);
		
	}
	
	public static TransformationRule<SetRefVSDeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<SetRefVSDeleteMatch> setRefVSdelete = new TransformationRule<SetRefVSDeleteMatch>(
				SetRefVSDeleteMatcher.querySpecification(), new SetRefVSDelete());

		return setRefVSdelete;
	}

}
