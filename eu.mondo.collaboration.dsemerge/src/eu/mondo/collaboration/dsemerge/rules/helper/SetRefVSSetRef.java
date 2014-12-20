package eu.mondo.collaboration.dsemerge.rules.helper;

import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.SetReference;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSSetRefMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetRefVSSetRefMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.SetRefVSSetRefProcessor;

public class SetRefVSSetRef extends SetRefVSSetRefProcessor {

	@Override
	public void process(SetReference pSetRefOp, SetReference pSetRefOp2) {
		System.out.println("SetRefVSSetRef");
		pSetRefOp2.setEliminated(true);
		pSetRefOp2.setExecutable(false);
		
	}
	
	public static TransformationRule<SetRefVSSetRefMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetRefVSSetRefMatch> setRefVSsetRef = new TransformationRule<SetRefVSSetRefMatch>(
				SetRefVSSetRefMatcher.querySpecification(), new SetRefVSSetRef());

		return setRefVSsetRef;
	}

}
