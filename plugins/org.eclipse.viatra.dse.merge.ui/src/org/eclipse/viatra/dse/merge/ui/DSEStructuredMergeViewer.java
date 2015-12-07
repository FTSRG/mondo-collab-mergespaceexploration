package org.eclipse.viatra.dse.merge.ui;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.contentmergeviewer.IFlushable;
import org.eclipse.compare.internal.BufferedResourceNode;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.listeners.DSEStructuredConfigChangeListener;
import org.eclipse.viatra.dse.merge.ui.runnables.MergeRunnable;

@SuppressWarnings("restriction")
public class DSEStructuredMergeViewer extends Viewer implements IFlushable {

	private CompareConfiguration config;
	private ChangeSet changeOR;
	private ChangeSet changeOL;
	private Resource original;
	private Resource local;
	private Solution selectedSolution;
	private CompareEditorInput editorInput;	
	private BufferedResourceNode target;
	private DSEStructuredMergeControl mergeControl;
	
	public DSEStructuredMergeViewer(Composite parent, CompareConfiguration config) {
        this.config = config;
        initialize(parent);
    }
        
    private void initialize(Composite parent) {
        editorInput = (CompareEditorInput)config.getContainer();
        mergeControl = new DSEStructuredMergeControl(this, parent, SWT.None);
        
        if(config.getProperty(Properties.ANCESTOR) != null) {
            original = (Resource) config.getProperty(Properties.ANCESTOR);
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    setInput(original);
                }
            });
        }
        if(config.getProperty(Properties.LEFT) != null) 
            local = (Resource) config.getProperty(Properties.LEFT);
        if(config.getProperty(Properties.CHANGESET_OL) != null)
            changeOL = (ChangeSet) config.getProperty(Properties.CHANGESET_OL);
        if(config.getProperty(Properties.CHANGESET_OR) != null)
            changeOR = (ChangeSet) config.getProperty(Properties.CHANGESET_OR);
        
        config.addPropertyChangeListener(new DSEStructuredConfigChangeListener(this));
    }
	
	public void setSelectedSolution(Solution selectedSolution) {
        this.selectedSolution = selectedSolution;
        mergeControl.getRevertChanges().setEnabled(true);
        setInput(selectedSolution.getScope().getOrigin());
        refresh();
        editorInput.setDirty(true);
    }
	
	public void reverted() {
	    config.setProperty(Properties.SELECTED_SOLUTION, null);
        editorInput.setDirty(false);
        mergeControl.getRevertChanges().setEnabled(false);
	}
	
	public void executeMerge() {
		IProgressService service = PlatformUI.getWorkbench().getProgressService();
		try {
			service.run(true, false, new MergeRunnable(original, changeOL, changeOR, config));
		} catch (InvocationTargetException | InterruptedException e) {
		    Logger.getLogger(DSEStructuredMergeViewer.class).error(e.getMessage());
		    e.printStackTrace();
		}
	}

    @Override
    public void flush(IProgressMonitor monitor) {
		monitor.beginTask("Saving the merged model", 1);
		EObject newOrigin = selectedSolution.getScope().getOrigin();
		Resource resource = local;
		resource.getContents().clear();
		resource.getContents().add(newOrigin);
		try {
		    ByteArrayOutputStream baos = new ByteArrayOutputStream();
		    resource.save(baos, Collections.emptyMap());
		    target.setContent(baos.toByteArray());
		} catch (IOException e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		monitor.done();
		editorInput.setDirty(false);
	}

    @Override
	public Control getControl() {
		return mergeControl.getControl();
	}

	@Override
	public Object getInput() {
		return original;
	}

	@Override
	public ISelection getSelection() {
		return mergeControl.getSelection();
	}

	@Override
	public void refresh() {
		mergeControl.refresh();
	}

	@Override
	public void setInput(Object input) {
		mergeControl.setInput(input);
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		mergeControl.setSelection(selection, reveal);
	}
	
	public void setChangeOL(ChangeSet changeOL) {
        this.changeOL = changeOL;
    }
    
    public void setChangeOR(ChangeSet changeOR) {
        this.changeOR = changeOR;
    }
    
    public Resource getOriginal() {
        return original;
    }
    
    public void setOriginal(final Resource original) {
        this.original = original;
        setInput(original);       
    }
    
    public void setLocal(Resource local) {
        this.local = local;
    }
    
    public void setTarget(BufferedResourceNode target) {
        this.target = target;
    }
}
