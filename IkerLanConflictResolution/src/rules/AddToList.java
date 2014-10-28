package rules;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import WTSpecID.IdentifiableWTElement;
import patterns.AddToListMatch;
import patterns.AddToListMatcher;
import patterns.util.AddToListProcessor;

public class AddToList extends AddToListProcessor {

	@Override
	public void process(DiffModel.AddToList pAddToListOp,
			IdentifiableWTElement pTarget, IdentifiableWTElement pRef) {

		String list = pAddToListOp.getList();

		// TODO cast new reference to the right type?
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(list);
		if (esf instanceof EList<?>) {
			EList<EObject> elist = (EList<EObject>) esf;
			elist.add(pRef);
			pTarget.eSet(pTarget.eClass().getEStructuralFeature(list), elist);
		}

		EcoreUtil.delete(pAddToListOp);

	}

	public static TransformationRule<AddToListMatch> createRule()
			throws IncQueryException {

		TransformationRule<AddToListMatch> addToList = new TransformationRule<AddToListMatch>(
				AddToListMatcher.querySpecification(), new AddToList());

		return addToList;
	}

}
