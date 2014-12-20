package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Delete;
import DiffModel.SetAttribute;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSSetAttrMatch;
import eu.mondo.collaboration.dsemerge.patterns.DeleteVSSetAttrMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.DeleteVSSetAttrProcessor;

public class DeleteVSSetAttr extends DeleteVSSetAttrProcessor {

	@Override
	public void process(Delete pDeleteOp, SetAttribute pSetAttrOp) {
		System.out.println("DeleteVSSetAttr");
		pSetAttrOp.setExecutable(false);
		
	}
	
	public static TransformationRule<DeleteVSSetAttrMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteVSSetAttrMatch> deleteVSsetAttr = new TransformationRule<DeleteVSSetAttrMatch>(
				DeleteVSSetAttrMatcher.querySpecification(), new DeleteVSSetAttr());

		return deleteVSsetAttr;
	}

}