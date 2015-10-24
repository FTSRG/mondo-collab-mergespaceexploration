package org.eclipse.viatra.dse.merge.ui.listeners;

import org.eclipse.compare.internal.BufferedResourceNode;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.DSEStructuredMergeViewer;
import org.eclipse.viatra.dse.merge.ui.Properties;

@SuppressWarnings("restriction")
public class DSEStructuredConfigChangeListener implements IPropertyChangeListener {

    private DSEStructuredMergeViewer viewer;

    public DSEStructuredConfigChangeListener(DSEStructuredMergeViewer viewer) {
        this.viewer = viewer;
        
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if(event.getProperty().equals(Properties.TARGET)) {
            viewer.setTarget((BufferedResourceNode) event.getNewValue());
        }
        
        if(event.getProperty().equals(Properties.CHANGESET_OL)) {
            viewer.setChangeOL((ChangeSet) event.getNewValue());
        }
        
        if(event.getProperty().equals(Properties.CHANGESET_OR)) {
            viewer.setChangeOR((ChangeSet) event.getNewValue());
        }
        
        if(event.getProperty().equals(Properties.ANCESTOR)) {
            viewer.setOriginal((Resource) event.getNewValue());
            
        }
        if(event.getProperty().equals(Properties.LEFT)) {
            viewer.setLocal((Resource) event.getNewValue());
            
        }
        if(event.getProperty().equals(Properties.SELECTED_SOLUTION)) {
            if(event.getNewValue() == null) 
                return;
            viewer.setSelectedSolution((Solution) event.getNewValue());
        }               
    }

}
