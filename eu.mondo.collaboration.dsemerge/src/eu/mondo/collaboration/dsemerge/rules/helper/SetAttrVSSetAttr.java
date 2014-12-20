package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.SetAttribute;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSSetAttrMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttrVSSetAttrMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.SetAttrVSSetAttrProcessor;

public class SetAttrVSSetAttr extends SetAttrVSSetAttrProcessor {

	@Override
	public void process(SetAttribute pSetAttrOp, SetAttribute pSetAttrOp2) {
		System.out.println("SetAttrVSSetAttr");
		pSetAttrOp2.setEliminated(true);
		pSetAttrOp2.setExecutable(false);
		
	}

	public static TransformationRule<SetAttrVSSetAttrMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetAttrVSSetAttrMatch> setAttrVSsetAttr = new TransformationRule<SetAttrVSSetAttrMatch>(
				SetAttrVSSetAttrMatcher.querySpecification(), new SetAttrVSSetAttr());

		return setAttrVSsetAttr;
	}

}