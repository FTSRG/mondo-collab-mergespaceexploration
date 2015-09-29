package org.eclipse.viatra.dse.merge.ui.viewers;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.PlatformUI;
import org.eclipse.viatra.dse.merge.ui.provider.SolutionContentProvider;
import org.eclipse.viatra.dse.merge.ui.provider.SolutionLabelProvider;
import org.eclipse.viatra.dse.merge.ui.viewers.DSEContentMergeViewer.SolutionElement;
import org.eclipse.viatra.dse.merge.ui.viewers.DSEContentMergeViewer.SolutionList;

import swing2swt.layout.BorderLayout;

public class DefaultSolutionTab extends AbstractSolutionTab {

    private TreeViewer solutionViewer;

    @Override
    protected String getTabTitle() {
        return "Tree-based";
    }

    @Override
    protected StructuredViewer getStructuredViewer() {
        return solutionViewer;
    }

    @Override
    protected Control createViewer(Composite parent) {
        solutionViewer = new TreeViewer(parent, SWT.BORDER);
        solutionViewer.getTree().setLayoutData(BorderLayout.CENTER);
        solutionViewer.setContentProvider(new SolutionContentProvider());
        solutionViewer.setLabelProvider(new SolutionLabelProvider());
           
        MenuManager menuMgr = new MenuManager();
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {
            public void menuAboutToShow(IMenuManager manager) {

                IStructuredSelection selection = (IStructuredSelection) solutionViewer.getSelection();
                if (selection.size() == 1) {
                    Object object = selection.iterator().next();

                    if (object instanceof SolutionElement) {
                        final SolutionElement element = (SolutionElement) object;
                        manager.add(new Action("Select solution #" + element.counter) {
                            @Override
                            public void run() {
                                selectSolution(element.solution);
                            }
                        });
                    }
                }

            }
        });
        Menu menu = menuMgr.createContextMenu(solutionViewer.getControl());
        solutionViewer.getControl().setMenu(menu);
        PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite()
                .registerContextMenu(menuMgr, solutionViewer);

        return solutionViewer.getControl();
    }

    @Override
    protected void setSolutions(SolutionList solutionList) {
        solutionViewer.setInput(solutionList);
    }

}
