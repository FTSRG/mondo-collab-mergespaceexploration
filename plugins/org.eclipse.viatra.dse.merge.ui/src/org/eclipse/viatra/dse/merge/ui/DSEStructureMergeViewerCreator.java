package org.eclipse.viatra.dse.merge.ui;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.IViewerCreator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * @author Csaba Debreceni
 *
 */
public class DSEStructureMergeViewerCreator implements IViewerCreator {

	public DSEStructureMergeViewerCreator() {
	}

	@Override
	public Viewer createViewer(Composite parent, CompareConfiguration config) {
		return new DSEStructuredMergeViewer(parent, config);
	}

}
