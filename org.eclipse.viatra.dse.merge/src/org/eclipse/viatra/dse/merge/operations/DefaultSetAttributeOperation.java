/*******************************************************************************
 * Copyright (c) 2010-2015, Csaba Debreceni, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Csaba Debreceni - initial API and implementation
 *******************************************************************************/
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
import org.eclipse.viatra.dse.merge.util.DSEMergeUtil;

public class DefaultSetAttributeOperation extends SetAttributeProcessor {

	public static void process(EObject pSrc, Attribute pChange) {
		pSrc.eSet(pChange.getFeature(), pChange.getValue());
	
		DSEMergeScope pScope = (DSEMergeScope) pChange.eContainer().eContainer();
		update(pScope, pChange, pSrc);
		
		EcoreUtil.delete(pChange);
	}

	private static void update(DSEMergeScope pScope, Attribute pChange, EObject pSrc) {
		for(Delete d : DSEMergeStrategy.deleteDependencies.get(DSEMergeUtil.getId(pChange.getSrc()))) {
			d.setExecutable(false);
		}
		
		if (pScope.getRemote().getChanges().contains(pChange)) {
			for (Change change : pScope.getLocal().getChanges()) {
				setToFalse(pChange, change);
				if(getIdFeature(pSrc) == pChange.getFeature() && pChange.getOldValue().equals(DSEMergeUtil.getId(change.getSrc()))) {
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
				if(getIdFeature(pSrc) == pChange.getFeature() && pChange.getOldValue().equals(DSEMergeUtil.getId(change.getSrc()))) {
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
			if (DSEMergeUtil.getId(_change.getSrc()).equals(DSEMergeUtil.getId(pChange.getSrc())) && _change.getFeature() == pChange.getFeature())
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
