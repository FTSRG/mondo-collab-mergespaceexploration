package org.eclipse.viatra.dse.merge.ui.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.scope.Cemetery;
import org.eclipse.viatra.dse.merge.scope.DSEMergeScope;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionElement;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionList;

import com.google.common.collect.Lists;

/**
 * This tree contect provider defines how to display a solution in a tree view.
 * 
 * @author Csaba Debreceni
 *
 */
public class SolutionContentProvider implements ITreeContentProvider {

    @Override
    public void dispose() {
    }

    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }

    @Override
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        if (parentElement instanceof SolutionList) {
            return ((SolutionList) parentElement).list.toArray();
        }
        if (parentElement instanceof SolutionElement) {
            DSEMergeScope scope = ((SolutionElement) parentElement).solution.getScope();
            return Lists.newArrayList(scope, scope.getLocal(), scope.getRemote(), scope.getCemetery()).toArray();
        }
        if (parentElement instanceof ChangeSet) {
            ChangeSet changeSet = (ChangeSet) parentElement;
            return changeSet.getChanges().toArray();
        }
        if (parentElement instanceof Cemetery) {
            Cemetery cemetery = (Cemetery) parentElement;
            return cemetery.getObjects().toArray();
        }
        if (parentElement instanceof DSEMergeScope) {
            DSEMergeScope scope = (DSEMergeScope) parentElement;
            return scope.getCompleted().toArray();
        }
        return null;
    }

    @Override
    public Object getParent(Object element) {
        if (element instanceof EObject) {
            return ((EObject) element).eContainer();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        if (element instanceof DSEMergeScope) {            
            DSEMergeScope scope = (DSEMergeScope) element;
            return !scope.getCompleted().isEmpty();
        }
        if (element instanceof SolutionElement) {
            return true;
        }
        if (element instanceof ChangeSet) {
            ChangeSet changeSet = (ChangeSet) element;
            return !changeSet.getChanges().isEmpty();
        }
        if (element instanceof Cemetery) {
            Cemetery cemetery = (Cemetery) element;
            return !cemetery.getObjects().isEmpty();
        }
        return false;
    }

}
