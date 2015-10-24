package org.eclipse.viatra.dse.merge.ui.listeners;

import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.DSEContentMergeViewer;
import org.eclipse.viatra.dse.merge.ui.Properties;

public class DSEContentConfigChangeListener implements IPropertyChangeListener {
    
    private DSEContentMergeViewer viewer;

    public DSEContentConfigChangeListener(DSEContentMergeViewer viewer) {
        this.viewer = viewer;
    }

    @Override
    public void propertyChange(final PropertyChangeEvent event) {

        Display.getDefault().asyncExec(new Runnable() {
            @SuppressWarnings("unchecked")
            public void run() {
                if (event.getProperty().equals(Properties.READY_TO_COMPARE)) {
                    viewer.executeComparison();
                }
                if (event.getProperty().equals(Properties.ANCESTOR)) {
                    viewer.setOriginal((Resource) event.getNewValue());
                }
                if (event.getProperty().equals(Properties.LEFT)) {
                    viewer.setLocal((Resource) event.getNewValue());
                }
                if (event.getProperty().equals(Properties.RIGHT)) {
                    viewer.setRemote((Resource) event.getNewValue());
                }
                if (event.getProperty().equals(Properties.CHANGESET_OL)) {
                    viewer.setChangeOL((ChangeSet) event.getNewValue());
                }

                if (event.getProperty().equals(Properties.CHANGESET_OR)) {
                    viewer.setChangeOR((ChangeSet) event.getNewValue());
                }
                if (event.getProperty().equals(Properties.SOLUTIONS)) {
                    viewer.setSolutions((Collection<Solution>) event.getNewValue());
                }
            }
        });
    }
}
        
    

