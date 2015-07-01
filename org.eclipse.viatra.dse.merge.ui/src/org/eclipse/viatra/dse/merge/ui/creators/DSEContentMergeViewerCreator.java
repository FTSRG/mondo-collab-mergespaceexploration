package org.eclipse.viatra.dse.merge.ui.creators;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.IViewerCreator;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.viatra.dse.merge.ui.viewers.DSEContentMergeViewer;

public class DSEContentMergeViewerCreator implements IViewerCreator {

	public DSEContentMergeViewerCreator() {
	}

	@Override
	public Viewer createViewer(Composite parent, CompareConfiguration config) {
		return new DSEContentMergeViewer(parent, config);
	}

}
