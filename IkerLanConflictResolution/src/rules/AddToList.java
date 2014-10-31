package rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
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
		System.out.println(esf);
		System.out.println(((EReferenceImpl) esf).eClass());
		System.out.println(pTarget.eContainmentFeature());
		System.out.println(pTarget.eContents());
		System.out.println(pTarget.eContainingFeature());

		if (esf instanceof Collection<?>) {
			System.out.println("coll");
		}
		else System.out.println("notcoll");
		//if (esf instanceof EList<?>) {
		
			List<EObject> elist = new ArrayList<EObject>();
			elist.add(pRef);
			pTarget.eSet(pTarget.eClass().getEStructuralFeature(list), elist);
		//}

		EcoreUtil.delete(pAddToListOp);

	}

	public static TransformationRule<AddToListMatch> createRule()
			throws IncQueryException {

		TransformationRule<AddToListMatch> addToList = new TransformationRule<AddToListMatch>(
				AddToListMatcher.querySpecification(), new AddToList());

		return addToList;
	}

}
