package rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import DiffModel.Create;
import ModelContainer.MainRoot;
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
	public void process(Create pCreateOp, MainRoot pMainRoot) {
		
		System.out.println("CreateMatch");

		String classType = pCreateOp.getType();
		String newID = pCreateOp.getTargetID();

		WTSpecIDPackage.eINSTANCE.eClass();

		// getting EClassifier
		EClassifier classifier = WTSpecIDPackage.eINSTANCE
				.getEClassifier(classType);
		// creating new EObject based on EClassifier
		EObject newObject = WTSpecIDPackage.eINSTANCE.getWTSpecIDFactory()
				.create((EClass) classifier);
		// setting ID of the new EObject - there should be an "ID" attribute
		newObject.eSet(newObject.eClass().getEStructuralFeature("ID"), newID);
		// adding new EObject to the Resource
		pMainRoot.getReserved().add(newObject);
//		EList<EObject> elist = pMainRoot.eResource().getContents();
//		pMainRoot.eResource().getContents().add(newObject);
		// deleting this CreateOp from DiffModel
		EcoreUtil.delete(pCreateOp);

		System.out.println("CreateMatch End");
		
	}

}
