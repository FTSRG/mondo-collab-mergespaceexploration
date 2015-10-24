package org.eclipse.viatra.dse.merge.ui.listeners;

import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.Priority;

public final class MayMustCheckStateListener implements ICheckStateListener {

    @Override
    public void checkStateChanged(CheckStateChangedEvent event) {
        Object object = event.getElement();
        Change change = (Change) object;
        change.setPriority(event.getChecked() ? Priority.MUST : Priority.MAY);
    }
}