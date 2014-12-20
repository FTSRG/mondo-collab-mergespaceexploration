package eu.mondo.collaboration.dsemerge.rules.basic;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import wtspecid.IdentifiableWTElement;
import DiffModel.SetAttribute;
import eu.mondo.collaboration.dsemerge.patterns.SetAttributeMatch;
import eu.mondo.collaboration.dsemerge.patterns.SetAttributeMatcher;
import eu.mondo.collaboration.dsemerge.patterns.util.SetAttributeProcessor;

public class SetAttributeOnElement extends SetAttributeProcessor {

	@Override
	public void process(SetAttribute pSetAttrOp, IdentifiableWTElement pTarget,
			SetAttribute pSetAttrOp2, IdentifiableWTElement pTarget2) {
		System.out.println("SetAttributeOnElement");
		String attr = pSetAttrOp.getAttribute();
		String value = pSetAttrOp.getValue();
		
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(attr);
		
		if(value.equals("")) {
			pTarget.eUnset(esf);
			return;
		}
		
		// setting new value to the target attribute
		Object defaultValue = esf.getDefaultValue();
		if(defaultValue instanceof Integer) {
			pTarget.eSet(esf, Integer.parseInt(value));
		}
		else if(defaultValue instanceof Short) {
			pTarget.eSet(esf, Short.parseShort(value));
		} 
		else {
			String oldString = (String) pTarget.eGet(esf);
			
			pTarget.eSet(esf, value);
			
			String newString = (String) pTarget.eGet(esf);
			
			if(newString.equals(oldString)) {
				pTarget.eUnset(esf);
			}
		}

		// deleting this SetAttrOp from DiffModel
		EcoreUtil.delete(pSetAttrOp);
		
	}

	public static TransformationRule<SetAttributeMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetAttributeMatch> setAttribute = new TransformationRule<SetAttributeMatch>(
				SetAttributeMatcher.querySpecification(), new SetAttributeOnElement());

		return setAttribute;
	}
	
}
