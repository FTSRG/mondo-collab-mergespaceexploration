package org.eclipse.viatra.dse.merge.ui.viewers;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;

import swing2swt.layout.BorderLayout;

public class DSEContentMergeControl extends Composite {

	private CheckboxTreeViewer fLeftViewer;
	private CheckboxTreeViewer fRightViewer;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public DSEContentMergeControl(Composite parent, int style) {
		super(parent, style);
		setLayout(new BorderLayout(0, 0));
		
		Composite merge = new Composite(this, SWT.NONE);
		merge.setLayoutData(BorderLayout.CENTER);
		merge.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		CTabFolder tabFolder = new CTabFolder(merge, SWT.BORDER);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tbtmPriorities = new CTabItem(tabFolder, SWT.NONE);
		tbtmPriorities.setText("Priorities");
		
		Composite pComposite = new Composite(tabFolder, SWT.NONE);
		tbtmPriorities.setControl(pComposite);
		pComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		fLeftViewer = new CheckboxTreeViewer(pComposite, SWT.BORDER);
		Tree fLeftTree = fLeftViewer.getTree();
		
		fRightViewer = new CheckboxTreeViewer(pComposite, SWT.BORDER);
		Tree fRightTree = fRightViewer.getTree();
		
		CTabItem tbtmSolutions = new CTabItem(tabFolder, SWT.NONE);
		tbtmSolutions.setText("Solutions");
		
		Composite sComposite = new Composite(tabFolder, SWT.NONE);
		tbtmSolutions.setControl(sComposite);

		tabFolder.setSelection(tbtmPriorities);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	public CheckboxTreeViewer getLeftViewer() {
		return fLeftViewer;
	}
	
	public CheckboxTreeViewer getRightViewer() {
		return fRightViewer;
	}
}
