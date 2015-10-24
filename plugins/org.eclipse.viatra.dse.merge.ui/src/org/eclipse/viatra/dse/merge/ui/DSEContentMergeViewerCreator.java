package org.eclipse.viatra.dse.merge.ui;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.IViewerCreator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

/**
 * @author Csaba Debreceni
 *
 */
public class DSEContentMergeViewerCreator implements IViewerCreator {

    public DSEContentMergeViewerCreator() {
    }

    @Override
    public Viewer createViewer(Composite parent, CompareConfiguration config) {
        return new DSEContentMergeViewer(parent, config);
    }

}
