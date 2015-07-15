package org.eclipse.viatra.dse.merge.ui.viewers;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareViewerPane;
import org.eclipse.compare.contentmergeviewer.IFlushable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.viatra.dse.merge.DSEMergeManager;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.Properties;
import org.eclipse.viatra.dse.merge.ui.provider.DetailedReflectiveItemProviderAdapterFactory;

public class DSEStructuredMergeViewer extends TreeViewer implements IFlushable {

	private CompareConfiguration config;
	private ChangeSet changeOR;
	private ChangeSet changeOL;
	private Resource original;
	private Resource local;
	private ReflectiveItemProviderAdapterFactory adapterFactory = new DetailedReflectiveItemProviderAdapterFactory();
	private Solution selectedSolution;
	private CompareEditorInput editorInput;	
	
	public DSEStructuredMergeViewer(Composite parent, CompareConfiguration config) {
		super(parent);
		this.config = config;
		initialize(parent);
	}
	
	private void initialize(Composite parent) {
		
		setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		editorInput = (CompareEditorInput)config.getContainer();
		config.addPropertyChangeListener(new IPropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent event) {
				if(event.getProperty().equals(Properties.CHANGESET_OL)) {
					changeOL = (ChangeSet) event.getNewValue();
				}
				
				if(event.getProperty().equals(Properties.CHANGESET_OR)) {
					changeOR = (ChangeSet) event.getNewValue();
				}
				
				if(event.getProperty().equals(Properties.ANCESTOR)) {
					original = (Resource) event.getNewValue();
					Display.getDefault().syncExec(new Runnable() {
					    public void run() {
					    	setInput(original.getContents().get(0));
					    }
					});
				}
				if(event.getProperty().equals(Properties.LEFT)) {
					local = (Resource) event.getNewValue();
					
				}
				if(event.getProperty().equals(Properties.SELECTED_SOLUTION)) {
					if(event.getNewValue() == null) 
						return;
					selectedSolution = (Solution) event.getNewValue();
					revertChanges.setEnabled(true);
					setInput(selectedSolution.getScope().getOrigin());
					editorInput.setDirty(true);
				}				
			}
		});
		
		addActions(parent);
	}

	private Action executeMerge = new Action("Calculate Solutions") {
		public void run() {
			executeMerge();
		};
	};
	
	private Action revertChanges = new Action("Revert Solution") {
		public void run() {
			Display.getDefault().syncExec(new Runnable() {
			    public void run() {
			    	setInput(original.getContents().get(0));
			    	config.setProperty(Properties.SELECTED_SOLUTION, null);
			    	editorInput.setDirty(false);
					revertChanges.setEnabled(false);
			    }
			});			
		};
	};
	
	private void addActions(Composite parent) {
		ToolBarManager tbm= CompareViewerPane.getToolBarManager(parent);
		revertChanges.setEnabled(false);
		if (tbm != null) {
			tbm.removeAll();
			tbm.add(executeMerge);
			tbm.add(revertChanges);
			tbm.update(true);
			
		}
	}

	private void executeMerge() {
		final DSEMergeManager manager = DSEMergeManager.create(original.getContents().get(0), changeOL, changeOR);
		IProgressService service = PlatformUI.getWorkbench().getProgressService();
		try {
			service.run(true, false, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					monitor.beginTask("Searching solutions...", 1);
					Collection<Solution> solutions = manager.start();
					monitor.worked(1);
					config.setProperty(Properties.SOLUTIONS, solutions);
					monitor.done();
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
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
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		monitor.done();
	}
	
}
