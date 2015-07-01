package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.SetAttribute;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSDeleteMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSDeleteMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.SetAttrVSDeleteProcessor;

public class SetAttrVSDelete extends SetAttrVSDeleteProcessor {

	@Override
	public void process(SetAttribute pSetAttrOp, Delete pDeleteOp) {
		
		pDeleteOp.setExecutable(false);
		
	}

	public static TransformationRule<SetAttrVSDeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<SetAttrVSDeleteMatch> setAttrVSdelete = new TransformationRule<SetAttrVSDeleteMatch>(
				SetAttrVSDeleteMatcher.querySpecification(), new SetAttrVSDelete());

		return setAttrVSdelete;
	}

}
