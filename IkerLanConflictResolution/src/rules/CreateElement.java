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
		// TODO Auto-generated method stub
		String classType = match.getCreateOp().getType();
		String newID = match.getCreateOp().getId();
		
		WTSpecPackage.eINSTANCE.eClass();
		
		EClassifier classifier = WTSpecPackage.eINSTANCE.getEClassifier(classType);
		
		EObject newObject = WTSpecPackage.eINSTANCE.getWTSpecFactory().create((EClass) classifier);
		
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
