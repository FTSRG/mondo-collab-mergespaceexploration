package rules;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.viatra.dse.util.EMFHelper;

import WTSpec.WTSpecPackage;
import patterns.CreateMatch;

public class CreateElement implements IMatchProcessor<CreateMatch> {

	@Override
	public void process(CreateMatch match) {
		
		// TODO get eResource and add the new element somehow...
		
		String classType = match.getCreateOp().getType();
		String newID = match.getCreateOp().getId();
		
		WTSpecPackage.eINSTANCE.eClass();
		
		EClassifier classifier = WTSpecPackage.eINSTANCE.getEClassifier(classType);
		
		EObject newObject = WTSpecPackage.eINSTANCE.getWTSpecFactory().create((EClass) classifier);
		
		// TODO this should work without parsing (wrong metamodel?)
		newObject.eSet(newObject.eClass().getEStructuralFeature("ID"), Integer.parseInt(newID));
		
		// TODO add new Object to the model
		
		// TODO remove this crateOp from DiffModels
		// originalRoot.eResource().getResourceSet();
		// --> finding roots of DiffModels
		// "diffModelsRoot.eResource().getContents().remove(index);"
		// find the element with newID from the right DiffModel (there could be an element in both DiffModels with the same ID!)
		// remove it!
		
		
		
		//dse List<EModelElement> classesAndReferences = EMFHelper.getClassesAndReferences(metaModelPackages);
		
		//EPackage.Registry.INSTANCE...
		
//		EPackage.getEClassifier(java.lang.String name) 
//        Returns the classifier with the given name.
		
//		EFactory	getEFactory(java.lang.String nsURI) 
//        Looks up the value in the map, converting EPackage.Descriptor objects to EFactory objects on demand.
//EPackage	getEPackage(java.lang.String nsURI) 
//        Looks up the value in the map, converting EPackage.Descriptor objects to EPackage objects on demand.
	}

}
