package eu.mondo.collaboration.dsemerge.rules.basic;

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

import wtspecid.IdentifiableWTElement;
import wtspecid.WtspecidPackage;
import DiffModel.Create;
import eu.mondo.collaboration.dsemerge.patterns.CreateMatch;
import eu.mondo.collaboration.dsemerge.patterns.CreateMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.CreateProcessor;

public class CreateElement extends CreateProcessor {

	@Override
	public void process(Create pCreateOp, IdentifiableWTElement pContainerTarget) {
		System.out.println("CreateElement");
		String classType = pCreateOp.getType();
		String newID = pCreateOp.getTargetID();
		String ref = pCreateOp.getReference();

		WtspecidPackage.eINSTANCE.eClass();

		// getting EClassifier
		EClassifier classifier = WtspecidPackage.eINSTANCE
				.getEClassifier(classType);
		// creating new EObject based on EClassifier
		EObject newObject = WtspecidPackage.eINSTANCE.getWtspecidFactory()
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
		
	}

	public static TransformationRule<CreateMatch> createRule()
			throws IncQueryException {

		TransformationRule<CreateMatch> createElement = new TransformationRule<CreateMatch>(
				CreateMatcher.querySpecification(), new CreateElement());

		return createElement;
	}
	
}
