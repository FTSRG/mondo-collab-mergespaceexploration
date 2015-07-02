package org.eclipse.viatra.dse.merge.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.compare.ITypedElement;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.team.internal.ui.StorageTypedElement;
import org.eclipse.team.internal.ui.synchronize.LocalResourceTypedElement;


public class Util {

	@SuppressWarnings("restriction")
	public static Resource getResource(ITypedElement element, LoadKind kind) {
		if(element instanceof LocalResourceTypedElement) {
			LocalResourceTypedElement typedElement = (LocalResourceTypedElement) element;
			ResourceSet rSet = new ResourceSetImpl();
			return rSet.getResource(URI.createFileURI(typedElement.getResource().getLocation().toString()), true);
		}
		if(element instanceof StorageTypedElement) {
			StorageTypedElement typedElement = (StorageTypedElement) element;
			try {
				ResourceSet rSet = new ResourceSetImpl();
				Resource resource = rSet.createResource(URI.createURI(kind + "." + typedElement.getType()));
				resource.load(typedElement.getContents(), Collections.emptyMap());
				return resource;
			} catch (CoreException | IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public enum LoadKind {
		LEFT, RIGHT, ANCESTOR
	}
}
