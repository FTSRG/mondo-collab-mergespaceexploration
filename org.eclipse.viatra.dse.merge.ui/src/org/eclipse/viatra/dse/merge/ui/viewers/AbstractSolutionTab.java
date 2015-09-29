package org.eclipse.viatra.dse.merge.ui.viewers;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.ui.Properties;
import org.eclipse.viatra.dse.merge.ui.viewers.DSEContentMergeViewer.SolutionList;

public abstract class AbstractSolutionTab {

    private CompareConfiguration config;


    public final void setConfig(CompareConfiguration config) {
        this.config = config;
    }
    
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        getStructuredViewer().addSelectionChangedListener(listener);
    }

    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
        getStructuredViewer().removeSelectionChangedListener(listener);
    }

    public void setSelection(ISelection selection) {
        StructuredViewer viewer = getStructuredViewer();
        if (viewer != null && !(viewer.getControl().isDisposed())) {
            viewer.setSelection(selection);
        }
    }

    public ISelection getSelection() {
        StructuredViewer viewer = getStructuredViewer();
        if (viewer != null && !(viewer.getControl().isDisposed())) {
            return viewer.getSelection();
        } else {
            return StructuredSelection.EMPTY;
        }
    }

    public void createPartControl(CTabFolder folder) {
        CTabItem tab = new CTabItem(folder, SWT.NONE);
        tab.setText(getTabTitle());
        Control viewer = createViewer(folder);
        tab.setControl(viewer);
    }

    protected abstract String getTabTitle();

    protected abstract StructuredViewer getStructuredViewer();

    protected abstract Control createViewer(Composite parent);
    
    protected abstract void setSolutions(SolutionList solutionList);
    
    protected final void selectSolution(Solution solution) {
        config.setProperty(Properties.SELECTED_SOLUTION, solution);
    }
}
