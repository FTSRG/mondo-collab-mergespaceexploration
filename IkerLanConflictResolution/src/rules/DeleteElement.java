package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import patterns.DeleteMatch;
import patterns.DeleteMatcher;

public class DeleteElement implements IMatchProcessor<DeleteMatch> {

	@Override
	public void process(DeleteMatch match) {

		EList<EObject> elements = match.getWt().eResource().getContents();

		for (EObject eObject : elements) {
			if (eObject.eGet(eObject.eClass().getEStructuralFeature("ID"))
					.equals(match.getDeleteOp().getTargetId())) {
				EcoreUtil.delete(eObject);
				break;
			}
		}
		
		EcoreUtil.delete(match.getDeleteOp());

	}

	public static TransformationRule<DeleteMatch> createRule()
			throws IncQueryException {
		
		TransformationRule<DeleteMatch> deleteElement = new TransformationRule<DeleteMatch>(
				DeleteMatcher.querySpecification(), new DeleteElement());

		return deleteElement;
	}

}
