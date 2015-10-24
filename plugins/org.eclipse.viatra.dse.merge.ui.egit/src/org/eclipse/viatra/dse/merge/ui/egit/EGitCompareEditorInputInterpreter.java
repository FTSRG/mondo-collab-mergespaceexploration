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
package org.eclipse.viatra.dse.merge.ui.egit;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.egit.ui.internal.revision.FileRevisionTypedElement;
import org.eclipse.egit.ui.internal.revision.ResourceEditableRevision;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.team.internal.ui.StorageTypedElement;
import org.eclipse.team.internal.ui.synchronize.LocalResourceTypedElement;
import org.eclipse.viatra.dse.merge.ui.Properties;
import org.eclipse.viatra.dse.merge.ui.interpreter.ICompareEditorInputInterpreter;


@SuppressWarnings("restriction")
public class EGitCompareEditorInputInterpreter implements ICompareEditorInputInterpreter {

	@Override
	public boolean isInterpreterForType(Object input) {
		if(input instanceof DiffNode)
			return true;
		if(input instanceof FileRevisionTypedElement)
			return true;
		return false;
	}

	@Override
	public void interpretEditorInput(Object input, CompareConfiguration config) {
		if (input instanceof DiffNode) {
			DiffNode diffNode = (DiffNode) input;
			Resource local = getResourceSpecific(diffNode.getLeft());
			config.setProperty(Properties.LEFT, local);
			Resource right = getResourceSpecific(diffNode.getRight());
			config.setProperty(Properties.RIGHT, right);
			Resource original = getResourceSpecific(diffNode.getAncestor());
			config.setProperty(Properties.ANCESTOR, original);
			config.setProperty(Properties.READY_TO_COMPARE, new Object());

		}
	}

	public Resource getResourceSpecific(ITypedElement element) {
		if(element == null) {
			System.out.println("Ajjjaj, ez null lett...");
		}
		if(element instanceof ResourceEditableRevision) {
			ResourceEditableRevision revision = (ResourceEditableRevision) element;
			
			ResourceSet rSet = new ResourceSetImpl();
			Resource resource = null;
			resource= rSet.createResource(URI.createFileURI(revision.getFile().getLocation().toString()));
			try {
				resource.load(revision.getContents(), Collections.emptyMap());
			} catch (IOException | CoreException e) {
				e.printStackTrace();
			}
			return resource;
		}
		
		if(element instanceof FileRevisionTypedElement) {
			FileRevisionTypedElement typedElement = (FileRevisionTypedElement) element;
			ResourceSet rSet = new ResourceSetImpl();
			Resource resource = null;
			resource= rSet.createResource(URI.createURI(UUID.randomUUID() + "." + typedElement.getType()));
			try {
				resource.load(typedElement.getContents(), Collections.emptyMap());
			} catch (IOException | CoreException e) {
				e.printStackTrace();
			}
			return resource;
		}
		return getResource(element);
	}
	
	public Resource getResource(ITypedElement element) {
        if (element instanceof LocalResourceTypedElement) {
            LocalResourceTypedElement typedElement = (LocalResourceTypedElement) element;
            ResourceSet rSet = new ResourceSetImpl();
            return rSet.getResource(URI.createFileURI(typedElement.getResource().getLocation().toString()), true);
        }
        if (element instanceof StorageTypedElement) {
            StorageTypedElement typedElement = (StorageTypedElement) element;
            try {
                ResourceSet rSet = new ResourceSetImpl();
                Resource resource = rSet
                        .createResource(URI.createURI(UUID.randomUUID() + "." + typedElement.getType()));
                resource.load(typedElement.getContents(), Collections.emptyMap());
                return resource;
            } catch (CoreException | IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
	
}
