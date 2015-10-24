package org.eclipse.viatra.dse.merge.ui;

import org.eclipse.compare.CompareViewerPane;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra.dse.merge.ui.providers.ReflectiveItemProviderAdapterFactory;

public class DSEStructuredMergeControl extends Composite {

    private ReflectiveItemProviderAdapterFactory adapterFactory = new ReflectiveItemProviderAdapterFactory();
    private TreeViewer fViewer;
    private DSEStructuredMergeViewer viewer;
    
    public DSEStructuredMergeControl(DSEStructuredMergeViewer viewer, Composite parent, int style) {
        super(parent, style);
        this.viewer = viewer;
        
        fViewer = new TreeViewer(parent);
        fViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
        fViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
        
        addActions(parent);
    }

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
    
    private Action revertChanges = new Action("Revert Solution") {
        public void run() {
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    setInput(viewer.getOriginal());
                    viewer.reverted();
                }
            });         
        };
    };
    
    public Action getRevertChanges() {
        return revertChanges;
    }
    
    private Action executeMerge = new Action("Calculate Solutions") {
        public void run() {
            viewer.executeMerge();
        };
    };
    
    public Action getExecuteMerge() {
        return executeMerge;
    }
    
    public Control getControl() {
        return fViewer.getControl();
    }
    
    public ISelection getSelection() {
        return fViewer.getSelection();
    }
    
    public void refresh() {
        fViewer.refresh();
    }
    
    public void setInput(final Object input) {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                if(input instanceof Resource) {
                    fViewer.setInput(viewer.getOriginal().getContents().get(0));
                } else if (input instanceof EObject) {
                    fViewer.setInput(input);
               }
            }
        });
        
    }
    
    public void setSelection(ISelection selection, boolean reveal) {
        fViewer.setSelection(selection, reveal);
    }
}
