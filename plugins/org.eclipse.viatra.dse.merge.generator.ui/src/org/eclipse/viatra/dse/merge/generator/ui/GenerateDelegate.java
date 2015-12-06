package org.eclipse.viatra.dse.merge.generator.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.viatra.dse.merge.generator.ArtifactBuilder;

public class GenerateDelegate implements IObjectActionDelegate {

    IFile file;
    
    public GenerateDelegate() {
    
    }

    @Override
    public void run(IAction action) {
        Job job = new Job("Generating DSE Merge Artifacts") {
            protected IStatus run(IProgressMonitor monitor) {
                ArtifactBuilder builder = new ArtifactBuilder();
                builder.doSetup(file, monitor);
                builder.doTraverse();
                builder.doGenerateContainmentPattern();
                
                return Status.OK_STATUS;
            };
        };
        
        job.schedule();
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        if(selection instanceof TreeSelection) {
            TreeSelection treeSelection = (TreeSelection) selection;
            if(treeSelection.isEmpty()) {
                file = null;
                return;
            }
            if(treeSelection.getFirstElement() instanceof IFile) {
                file = (IFile) treeSelection.getFirstElement();
                return;
            }
            else {
                file = null;
                return;
            }
        }
    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        System.out.println("set");
    }

}
