package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import WTSpecID.IdentifiableWTElement;
import patterns.RemoveFromListMatch;
import patterns.RemoveFromListMatcher;
import patterns.util.RemoveFromListProcessor;

public class RemoveFromList extends RemoveFromListProcessor {

	@Override
	public void process(DiffModel.RemoveFromList pRemoveFromListOp,
			IdentifiableWTElement pTarget, IdentifiableWTElement pRef) {

		String list = pRemoveFromListOp.getList();

		// TODO cast reference to the right type?
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(list);
		if (esf instanceof EList<?>) {
			EList<EObject> elist = (EList<EObject>) esf;
			elist.remove(pRef);
			pTarget.eSet(pTarget.eClass().getEStructuralFeature(list), elist);
		}

		EcoreUtil.delete(pRemoveFromListOp);

	}

	public static TransformationRule<RemoveFromListMatch> createRule()
			throws IncQueryException {

		TransformationRule<RemoveFromListMatch> removeFromList = new TransformationRule<RemoveFromListMatch>(
				RemoveFromListMatcher.querySpecification(),
				new RemoveFromList());

		return removeFromList;
	}

}
