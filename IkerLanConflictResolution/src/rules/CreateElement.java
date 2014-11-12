package rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Create;
import ModelContainer.MainRoot;
import WTSpecID.IdentifiableWTElement;
import WTSpecID.WTSpecIDPackage;
import patterns.CreateMatch;
import patterns.CreateMatcher;
import patterns.util.CreateProcessor;

public class CreateElement extends CreateProcessor {

//	@Override
//	public void process(Create pCreateOp, WT pWt) {
//
//		System.out.println("CreateMatch");
//
//		String classType = pCreateOp.getType();
//		String newID = pCreateOp.getTargetId();
//
//		WTSpecIDPackage.eINSTANCE.eClass();
//
//		// getting EClassifier
//		EClassifier classifier = WTSpecIDPackage.eINSTANCE
//				.getEClassifier(classType);
//		// creating new EObject based on EClassifier
//		EObject newObject = WTSpecIDPackage.eINSTANCE.getWTSpecIDFactory()
//				.create((EClass) classifier);
//		// setting ID of the new EObject - there should be an "ID" attribute
//		newObject.eSet(newObject.eClass().getEStructuralFeature("ID"), newID);
//		// adding new EObject to the Resource
//		pWt.eResource();
//		EList<EObject> elist = pWt.eResource().getContents();
//		pWt.eResource().getContents().add(newObject);
//		// deleting this CreateOp from DiffModel
//		EcoreUtil.delete(pCreateOp);
//
//		System.out.println("CreateMatch End");
//	}

	public static TransformationRule<CreateMatch> createRule()
			throws IncQueryException {

		TransformationRule<CreateMatch> createElement = new TransformationRule<CreateMatch>(
				CreateMatcher.querySpecification(), new CreateElement());

		return createElement;
	}

	@Override
	public void process(Create pCreateOp, IdentifiableWTElement pContainerTarget) {

		System.out.println("CreateMatch");

		String classType = pCreateOp.getType();
		String newID = pCreateOp.getTargetID();
		String ref = pCreateOp.getReference();

		WTSpecIDPackage.eINSTANCE.eClass();

		// getting EClassifier
		EClassifier classifier = WTSpecIDPackage.eINSTANCE
				.getEClassifier(classType);
		// creating new EObject based on EClassifier
		EObject newObject = WTSpecIDPackage.eINSTANCE.getWTSpecIDFactory()
				.create((EClass) classifier);
		// setting ID of the new EObject - there should be an "ID" attribute
		newObject.eSet(newObject.eClass().getEStructuralFeature("ID"), newID);
		
		List<String> attrs = pCreateOp.getAttributes();
		List<String> values = pCreateOp.getValues();
		
		int attrNum = attrs.size();
		String attr;
		String value;
		// setting attributes and values of new EObject
		
		
		EStructuralFeature esf;
		
		for (int i = 0; i < attrNum; i++) {
			attr = attrs.get(i);
			value = values.get(i);
					
			esf = newObject.eClass().getEStructuralFeature(attr);
			
			Object oldValue = esf.getDefaultValue();
			if(oldValue instanceof Integer) {
				newObject.eSet(esf, Integer.parseInt(value));
			}
			else if(oldValue instanceof Short) {
				newObject.eSet(esf, Short.parseShort(value));
			} 
			else newObject.eSet(esf, value);
		}

		// setting new EObject to its container
		esf = pContainerTarget.eClass().getEStructuralFeature(ref);
		
		if (esf.getUpperBound() == 1) {
			pContainerTarget.eSet(esf, newObject);
		}
		else {
			List<EObject> newList = new ArrayList<EObject>();
			
			Object obj = pContainerTarget.eGet(esf);
			if (obj instanceof Collection<?>) {
				for (Object element : (Collection<?>) obj) {
					if (element instanceof EObject) {
						newList.add((EObject) element);
					}
				}
			}
			
			newList.add(newObject);

			pContainerTarget.eSet(esf, newList);
		}
		
		// deleting this CreateOp from DiffModel
		EcoreUtil.delete(pCreateOp);

		System.out.println("CreateMatch End");
		
	}

//	@Override
//	public void process(Create pCreateOp, MainRoot pMainRoot) {
//		
//		System.out.println("CreateMatch");
//
//		String classType = pCreateOp.getType();
//		String newID = pCreateOp.getTargetID();
//
//		WTSpecIDPackage.eINSTANCE.eClass();
//
//		// getting EClassifier
//		EClassifier classifier = WTSpecIDPackage.eINSTANCE
//				.getEClassifier(classType);
//		// creating new EObject based on EClassifier
//		EObject newObject = WTSpecIDPackage.eINSTANCE.getWTSpecIDFactory()
//				.create((EClass) classifier);
//		// setting ID of the new EObject - there should be an "ID" attribute
//		newObject.eSet(newObject.eClass().getEStructuralFeature("ID"), newID);
//		// adding new EObject to the Resource
//		pMainRoot.getReserved().add(newObject);
////		EList<EObject> elist = pMainRoot.eResource().getContents();
////		pMainRoot.eResource().getContents().add(newObject);
//		// deleting this CreateOp from DiffModel
//		EcoreUtil.delete(pCreateOp);
//
//		System.out.println("CreateMatch End");
//		
//	}

}
