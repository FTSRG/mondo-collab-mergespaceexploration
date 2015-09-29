package org.eclipse.viatra.dse.merge.ui.viewers;

import java.util.Collection;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Tree;

import swing2swt.layout.BorderLayout;

public class DSEContentMergeControl extends Composite {

	private CheckboxTreeViewer fLeftViewer;
	private CheckboxTreeViewer fRightViewer;
	private Label lblLabelRight;
	private Label lblLabelLeft;
	private Label lblSelected;
	private TabItem tbtmSolutions;
	private TabFolder tabFolder;
    private CTabFolder tabFolderSolutions;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public DSEContentMergeControl(Composite parent, Collection<AbstractSolutionTab> tabs, int style) {
		super(parent, style);
		setLayout(new BorderLayout(0, 0));
		
		Composite merge = new Composite(this, SWT.NONE);
		merge.setLayoutData(BorderLayout.CENTER);
		merge.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		tabFolder = new TabFolder(merge, SWT.BORDER);
		tabFolder.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		TabItem tbtmPriorities = new TabItem(tabFolder, SWT.NONE);
		tbtmPriorities.setText("Priorities");
		
		Composite pComposite = new Composite(tabFolder, SWT.NONE);
		tbtmPriorities.setControl(pComposite);
		pComposite.setLayout(new FillLayout());
		
		SashForm sash_composite = new SashForm(pComposite, SWT.HORIZONTAL);
		
		Composite compositeLeft = new Composite(sash_composite, SWT.NONE);
		compositeLeft.setLayout(new BorderLayout(0, 0));
		
		fLeftViewer = new CheckboxTreeViewer(compositeLeft, SWT.PUSH);
		Tree treeLeft = fLeftViewer.getTree();
		treeLeft.setLayoutData(BorderLayout.CENTER);
		
		lblLabelLeft = new Label(compositeLeft, SWT.NONE);
		lblLabelLeft.setLayoutData(BorderLayout.NORTH);
		lblLabelLeft.setText("Label");
		
		Composite compositeRight = new Composite(sash_composite, SWT.NONE);
		compositeRight.setLayout(new BorderLayout(0, 0));
		
		lblLabelRight = new Label(compositeRight, SWT.NONE);
		lblLabelRight.setLayoutData(BorderLayout.NORTH);
		lblLabelRight.setText("Label");
		
		fRightViewer = new CheckboxTreeViewer(compositeRight, SWT.PUSH);
		Tree treeRight = fRightViewer.getTree();
		treeRight.setLayoutData(BorderLayout.CENTER);
		
		tbtmSolutions = new TabItem(tabFolder, SWT.NONE);
		tbtmSolutions.setText("Solutions");
		
		Composite sComposite = new Composite(tabFolder, SWT.NONE);
		tbtmSolutions.setControl(sComposite);
		sComposite.setLayout(new BorderLayout(0, 0));
		
		lblSelected = new Label(sComposite, SWT.NONE);
		lblSelected.setLayoutData(BorderLayout.NORTH);
		lblSelected.setText("Selected");
		
		Composite solutionsComposite = new Composite(sComposite, SWT.NONE);
		solutionsComposite.setLayoutData(BorderLayout.CENTER);
		solutionsComposite.setLayout(new BorderLayout(0, 0));
		
		tabFolderSolutions = new CTabFolder(solutionsComposite, SWT.BORDER | SWT.BOTTOM);
		tabFolderSolutions.setLayoutData(BorderLayout.CENTER);
		tabFolderSolutions.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		for (AbstractSolutionTab tab : tabs) {
		    tab.createPartControl(tabFolderSolutions);
	    }
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
	
	public Label getLabelLeft() {
		return lblLabelLeft;
	}
	
	public Label getLabelRight() {
		return lblLabelRight;
	}
	
	public Label getSelected() {
		return lblSelected;
	}
	
	public void changeToSolutionPage() {
		tabFolder.setSelection(tbtmSolutions);
		tabFolderSolutions.setSelection(0);
	}
}
