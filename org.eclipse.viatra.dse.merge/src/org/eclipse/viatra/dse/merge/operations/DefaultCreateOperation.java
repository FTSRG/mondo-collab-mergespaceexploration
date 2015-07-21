package org.eclipse.viatra.dse.merge.operations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.dse.merge.DSEMergeStrategy;
import org.eclipse.viatra.dse.merge.iq.util.CreateProcessor;
import org.eclipse.viatra.dse.merge.model.Attribute;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.Create;
import org.eclipse.viatra.dse.merge.model.Delete;
import org.eclipse.viatra.dse.merge.model.Feature;
import org.eclipse.viatra.dse.merge.scope.DSEMergeScope;

import com.google.common.collect.Lists;

public class DefaultCreateOperation extends CreateProcessor {

	public static void process(EObject pContainer, Create pChange) {
		DSEMergeScope pScope = (DSEMergeScope) pChange.eContainer().eContainer();
		
		EObject element = (EObject) EcoreUtil.create(pChange.getClazz());
		EStructuralFeature feature = element.eClass().getEStructuralFeature("id");
		element.eSet(feature, DSEMergeStrategy.getId(pChange.getSrc()));

		if (pChange.getFeature().isMany()) {
			@SuppressWarnings("unchecked")
			EList<EObject> list = (EList<EObject>) pContainer.eGet(pChange.getFeature());
			list.add(element);
		} else {
			pContainer.eSet(pChange.getFeature(), element);
		}

		for (Feature f : Lists.newArrayList(pChange.getFeatures())) {
			if(f instanceof Attribute) {
				Attribute attribute = (Attribute) f;
				switch (attribute.getKind()) {
				case ADD:
					DefaultAddAttributeOperation.process(element, attribute);
					break;
				case REMOVE:
					DefaultRemoveAttributeOperation.process(element, attribute);
					break;
				case SET:
					DefaultSetAttributeOperation.process(element, attribute);
					break;
				case UNSET:
				default:
					break;
				}
			}
		}

		update(pScope, pChange, pContainer);

		EcoreUtil.delete(pChange);
	}

	private static void update(DSEMergeScope pScope, Create pChange, EObject pSrc) {
		for (Delete d : DSEMergeStrategy.deleteDependencies.get(DSEMergeStrategy.getId(pChange.getSrc()))) {
			d.setExecutable(false);			
		}

		if (pScope.getRemote().getChanges().contains(pChange)) {
			for (Change change : pScope.getLocal().getChanges()) {
				setToFalse(pChange, change);
				if(change instanceof Feature && ((Feature) change).getFeature() == getIdFeature(pSrc)) {
					change.setExecutable(false);
				}
			}
		}

		if (pScope.getLocal().getChanges().contains(pChange)) {
			for (Change change : pScope.getRemote().getChanges()) {
				setToFalse(pChange, change);
				if(change instanceof Feature && ((Feature) change).getFeature() == getIdFeature(pSrc)) {
					change.setExecutable(false);
				}
			}
		}

	}

	private static void setToFalse(Create pChange, Change change) {
		if (change instanceof Create) {
			Create _change = (Create) change;
			if (DSEMergeStrategy.getId(_change.getSrc()) == DSEMergeStrategy.getId(pChange.getSrc())) {
				_change.setExecutable(false);
				for (Attribute attribute : pChange.getAttributes()) {
					attribute.setExecutable(false);
				}
			}

		}
	}
	
	private static EStructuralFeature getIdFeature(EObject pSrc) {
		return pSrc.eClass().getEStructuralFeature("id");
	}

	@Override
	public void _process(EObject pContainer, Create pChange) {
		process(pContainer, pChange);
	}

}
