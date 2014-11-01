package rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
		// EStructuralFeature esf =
		// pTarget.eClass().getEStructuralFeature(list);
		// System.out.println(esf);
		// System.out.println(((EReferenceImpl) esf).eClass());
		// System.out.println(pTarget.eContainmentFeature());
		// System.out.println(pTarget.eContents());
		// System.out.println(pTarget.eContainingFeature());
		//
		// if (esf instanceof Collection<?>) {
		// System.out.println("coll");
		// }
		// else System.out.println("notcoll");
		// //if (esf instanceof EList<?>) {
		//
		// List<EObject> elist = new ArrayList<EObject>();
		// elist.add(pRef);
		// pTarget.eSet(pTarget.eClass().getEStructuralFeature(list), elist);
		// //}

		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(list);
//		System.out.println(esf);
//		System.out.println(((EReferenceImpl) esf).eClass());
//		System.out.println(pTarget.eContainmentFeature());
//		System.out.println(pTarget.eContents());
//		System.out.println(pTarget.eContainingFeature());

		List<EObject> newList = new ArrayList<EObject>();
//		for (EReference reference : pTarget.eClass().getEAllReferences()) {
//			if (reference.isContainment()) {
//				Object value = pTarget.eGet(reference);
//				if (value instanceof Collection<?>) {
//					for (Object newValue : (Collection<?>) value) {
//						if (!result.contains(newValue)
//								&& newValue instanceof EObject) {
//							result.add((EObject) newValue);
//						}
//					}
//				} else if (!result.contains(value) && value instanceof EObject) {
//					result.add((EObject) value);
//				}
//			}
//		}
		
		System.out.println("UpperBound:");
		System.out.println(esf.getUpperBound());
		
		Object obj = pTarget.eGet(esf);
		if (obj instanceof Collection<?>) {
			for (Object element : (Collection<?>) obj) {
				if (!newList.contains(element)
						&& element instanceof EObject) {
					newList.add((EObject) element);
				}
			}
		}
		
		newList.add(pRef);
		
		System.out.println("newList:");
		System.out.println(newList);

		if (esf instanceof Collection<?>) {
			System.out.println("coll");
		} else
			System.out.println("notcoll");
		// if (esf instanceof EList<?>) {

//		List<EObject> elist = new ArrayList<EObject>();
//		elist.add(pRef);
		pTarget.eSet(pTarget.eClass().getEStructuralFeature(list), newList);
		// }

		EcoreUtil.delete(pAddToListOp);

	}

	public static TransformationRule<AddToListMatch> createRule()
			throws IncQueryException {

		TransformationRule<AddToListMatch> addToList = new TransformationRule<AddToListMatch>(
				AddToListMatcher.querySpecification(), new AddToList());

		return addToList;
	}

}
