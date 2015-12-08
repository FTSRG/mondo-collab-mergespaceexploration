package org.eclipse.viatra.dse.merge.ui.interpreter;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.team.internal.ui.StorageTypedElement;
import org.eclipse.team.internal.ui.mapping.AbstractCompareInput;
import org.eclipse.team.internal.ui.mapping.ResourceDiffCompareInput;
import org.eclipse.team.internal.ui.synchronize.LocalResourceTypedElement;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.Properties;

@SuppressWarnings("restriction")
public class DefaultCompareEditorInterpreter implements ICompareEditorInputInterpreter {

    @Override
    public boolean isInterpreterForType(Object input) {
        if (input instanceof AbstractCompareInput)
            return true;
        return false;
    }

    @Override
    public void interpretEditorInput(Object input, CompareConfiguration config) {
        setLeft(input, config);
        setRight(input, config);

        config.setProperty(Properties.READY_TO_COMPARE, null);
    }

    protected void setRight(Object input, CompareConfiguration config) {
        if (input instanceof AbstractCompareInput) {
            AbstractCompareInput compareInput = (AbstractCompareInput) input;
            Resource original = getResource(compareInput.getAncestor());
            config.setProperty(Properties.ANCESTOR, original);
            config.setProperty(Properties.TARGET, compareInput.getAncestor());
            if (null == config.getProperty(Properties.LEFT) && null == config.getProperty(Properties.CHANGESET_OL)) {
                Resource local = getResource(compareInput.getLeft());
                config.setProperty(Properties.LEFT, local);
            }
            Resource remote = getResource(compareInput.getRight());
            config.setProperty(Properties.RIGHT, remote);
        }
    }

    protected void setLeft(Object input, CompareConfiguration config) {
        if (input instanceof ResourceDiffCompareInput) {
            ResourceDiffCompareInput compareInput = (ResourceDiffCompareInput) input;
            if (compareInput.getLeft() == null) {
                IResource file = compareInput.getResource();
                String location = file.getLocation().toString();
                if (new File(location + "." + "changeset").exists()) {
                    ChangeSet changeOL = (ChangeSet) new ResourceSetImpl()
                            .getResource(URI.createFileURI(location + "." + "changeset"), true).getContents().get(0);
                    config.setProperty(Properties.CHANGESET_OL, changeOL);
                } else {
                    Resource local = new ResourceSetImpl().getResource(URI.createFileURI(location), true);
                    config.setProperty(Properties.LEFT, local);
                }
            }
        }
    }

    public static Resource getResource(ITypedElement element) {
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
