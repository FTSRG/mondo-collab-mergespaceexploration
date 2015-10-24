package org.eclipse.viatra.dse.merge.ui.zest;

import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import swing2swt.layout.BorderLayout;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;

public class ZestSolutionForm extends Composite {

    private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
    private Section visualizerSection;
    private Composite graphComposite;
    private Button selectButton;
    private Label includedLabel;
    private Label mustLabel;
    private Label mayLabel;
    private Label excludedLabel;
    private Label selectedLabel;

    /**
     * Create the composite.
     * @param parent
     * @param style
     */
    public ZestSolutionForm(Composite parent, int style) {
        super(parent, style);
        addDisposeListener(new DisposeListener() {
            public void widgetDisposed(DisposeEvent e) {
                toolkit.dispose();
            }
        });
        toolkit.adapt(this);
        toolkit.paintBordersFor(this);
        setLayout(new BorderLayout(0, 0));
        
        Section metricsSection = toolkit.createSection(this, Section.TWISTIE | Section.TITLE_BAR);
        metricsSection.setLayoutData(BorderLayout.SOUTH);
        toolkit.paintBordersFor(metricsSection);
        metricsSection.setText("Metrics");
        metricsSection.setExpanded(true);
        
//        Section propertiesSection = toolkit.createSection(this, Section.TWISTIE | Section.TITLE_BAR);
//        propertiesSection.setLayoutData(BorderLayout.EAST);
//        toolkit.paintBordersFor(propertiesSection);
//        propertiesSection.setText("Properties");
        
        visualizerSection = toolkit.createSection(this, Section.TWISTIE | Section.TITLE_BAR);
        visualizerSection.setLayoutData(BorderLayout.CENTER);
        toolkit.paintBordersFor(visualizerSection);
        visualizerSection.setText("Solution Graph");
        visualizerSection.setExpanded(true);
        
        selectButton = toolkit.createButton(visualizerSection, "Apply", SWT.NONE);
        visualizerSection.setTextClient(selectButton);

        graphComposite = toolkit.createComposite(visualizerSection, SWT.WRAP);
        toolkit.paintBordersFor(graphComposite);
        visualizerSection.setClient(graphComposite);
        graphComposite.setLayout(new FillLayout(SWT.HORIZONTAL));
        
        Composite metricsComposite = toolkit.createComposite(metricsSection, SWT.WRAP);
        toolkit.paintBordersFor(metricsComposite);
        metricsSection.setClient(metricsComposite);
        metricsComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
        
        selectedLabel = toolkit.createLabel(metricsComposite, "Selected #1", SWT.NONE);
        
        Label label = toolkit.createSeparator(metricsComposite, SWT.NONE);
        label.setLayoutData(new RowData(1, 20));
        
        includedLabel = toolkit.createLabel(metricsComposite, "Included: 0000", SWT.NONE);
        
        mustLabel = toolkit.createLabel(metricsComposite, "Must: 000/000", SWT.NONE);
        
        mayLabel = toolkit.createLabel(metricsComposite, "May: 000/000", SWT.NONE);
        
        Label label_1 = toolkit.createSeparator(metricsComposite, SWT.NONE);
        label_1.setLayoutData(new RowData(2, 20));
        
        excludedLabel = toolkit.createLabel(metricsComposite, "Excluded: 000", SWT.NONE);
    }
    
    public Composite getGraphComposite() {
        return graphComposite;
    }
    
    public Button getSelectButton() {
        return selectButton;
    }
    
    public Label getIncludedLabel() {
        return includedLabel;
    }
    
    public Label getMustLabel() {
        return mustLabel;
    }
    
    public Label getMayLabel() {
        return mayLabel;
    }
    
    public Label getExcludedLabel() {
        return excludedLabel;
    }
    
    public Label getSelectedLabel() {
        return selectedLabel;
    }
}

