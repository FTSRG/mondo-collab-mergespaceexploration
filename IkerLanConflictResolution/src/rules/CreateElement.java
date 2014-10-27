package rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import WTSpecID.WTSpecIDPackage;
import patterns.CreateMatch;
import patterns.CreateMatcher;

public class CreateElement implements IMatchProcessor<CreateMatch> {

	@Override
	public void process(CreateMatch match) {
		
		System.out.println("CreateMatch");
		
		String classType = match.getCreateOp().getType();
		String newID = match.getCreateOp().getTargetId();
		
		WTSpecIDPackage.eINSTANCE.eClass();
		
		// getting EClassifier
		EClassifier classifier = WTSpecIDPackage.eINSTANCE.getEClassifier(classType);
		// creating new EObject based on EClassifier
		EObject newObject = WTSpecIDPackage.eINSTANCE.getWTSpecIDFactory().create((EClass) classifier);
		// setting ID of the new EObject - there should be an "ID" attribute
		newObject.eSet(newObject.eClass().getEStructuralFeature("ID"), newID);
		// adding new EObject to the Resource
		match.getWt().eResource().getContents().add(newObject);
		// deleting this CreateOp from DiffModel
		EcoreUtil.delete(match.getCreateOp());
		
		System.out.println("CreateMatch End");
		
	}

	public static TransformationRule<CreateMatch> createRule() throws IncQueryException {

		TransformationRule<CreateMatch> createElement = new TransformationRule<CreateMatch>(CreateMatcher.querySpecification(), new CreateElement());

		return createElement;
	}

}
