package org.eclipse.viatra.dse.merge.operations;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.dse.merge.DSEMergeStrategy;
import org.eclipse.viatra.dse.merge.iq.util.SetAttributeProcessor;
import org.eclipse.viatra.dse.merge.model.Attribute;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.Delete;
import org.eclipse.viatra.dse.merge.model.Feature;
import org.eclipse.viatra.dse.merge.scope.DSEMergeScope;

public class DefaultSetAttributeOperation extends SetAttributeProcessor {

	public static void process(EObject pSrc, Attribute pChange) {
		pSrc.eSet(pChange.getFeature(), pChange.getValue());
	
		DSEMergeScope pScope = (DSEMergeScope) pChange.eContainer().eContainer();
		update(pScope, pChange, pSrc);
		
		EcoreUtil.delete(pChange);
	}

	private static void update(DSEMergeScope pScope, Attribute pChange, EObject pSrc) {
		for(Delete d : DSEMergeStrategy.deleteDependencies.get(DSEMergeStrategy.getId(pChange.getSrc()))) {
			d.setExecutable(false);
		}
		
		if (pScope.getRemote().getChanges().contains(pChange)) {
			for (Change change : pScope.getLocal().getChanges()) {
				setToFalse(pChange, change);
				if(getIdFeature(pSrc) == pChange.getFeature() && pChange.getOldValue().equals(DSEMergeStrategy.getId(change.getSrc()))) {
					change.setExecutable(false);
				}
				if(change instanceof Feature && ((Feature) change).getFeature() == getIdFeature(pSrc)) {
					change.setExecutable(false);
				}
			}
		}

		if (pScope.getLocal().getChanges().contains(pChange)) {
			for (Change change : pScope.getRemote().getChanges()) {
				setToFalse(pChange, change);
				if(getIdFeature(pSrc) == pChange.getFeature() && pChange.getOldValue().equals(DSEMergeStrategy.getId(change.getSrc()))) {
					change.setExecutable(false);
				}
				if(change instanceof Feature && ((Feature) change).getFeature() == getIdFeature(pSrc)) {
					change.setExecutable(false);
				}
			}
			
		}
	}

	private static void setToFalse(Attribute pChange, Change change) {
		if (change instanceof Attribute) {
			Attribute _change = (Attribute) change;
			if (DSEMergeStrategy.getId(_change.getSrc()).equals(DSEMergeStrategy.getId(pChange.getSrc())) && _change.getFeature() == pChange.getFeature())
				_change.setExecutable(false);
		}
	}
	
	private static EStructuralFeature getIdFeature(EObject pSrc) {
		return pSrc.eClass().getEStructuralFeature("id");
	}

	@Override
	public void _process(EObject pSrc, Attribute pChange) {
		process(pSrc, pChange);
	}
		
}
