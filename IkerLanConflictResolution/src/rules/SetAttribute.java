package rules;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra.dse.api.TransformationRule;

import WTSpecID.IdentifiableWTElement;
import patterns.SetAttributeMatch;
import patterns.SetAttributeMatcher;
import patterns.util.SetAttributeProcessor;

public class SetAttribute extends SetAttributeProcessor {

	@Override
	public void process(DiffModel.SetAttribute pSetAttrOp,
			IdentifiableWTElement pTarget) {

		String attr = pSetAttrOp.getAttribute();
		String value = pSetAttrOp.getValue();
		
		EStructuralFeature esf = pTarget.eClass().getEStructuralFeature(attr);
		
		Object oldValue = esf.getDefaultValue();
		if(oldValue instanceof Integer) {
			pTarget.eSet(pTarget.eClass().getEStructuralFeature(attr), Integer.parseInt(value));
		}
		else if(oldValue instanceof Short) {
			pTarget.eSet(pTarget.eClass().getEStructuralFeature(attr), Short.parseShort(value));
		} 
		else pTarget.eSet(pTarget.eClass().getEStructuralFeature(attr), value);

		EcoreUtil.delete(pSetAttrOp);

	}

	public static TransformationRule<SetAttributeMatch> createRule()
			throws IncQueryException {

		TransformationRule<SetAttributeMatch> setAttribute = new TransformationRule<SetAttributeMatch>(
				SetAttributeMatcher.querySpecification(), new SetAttribute());

		return setAttribute;
	}

}
