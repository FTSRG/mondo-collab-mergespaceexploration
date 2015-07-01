package org.eclipse.viatra.dse.merge.ui;

import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.team.internal.ui.synchronize.LocalResourceTypedElement;


public class Util {

	@SuppressWarnings("restriction")
	public static IResource getResource(ITypedElement element) {
		if(element instanceof LocalResourceTypedElement) {
			LocalResourceTypedElement typedElement = (LocalResourceTypedElement) element;
			return typedElement.getResource();
		}
		
		return null;
	}
	
}
