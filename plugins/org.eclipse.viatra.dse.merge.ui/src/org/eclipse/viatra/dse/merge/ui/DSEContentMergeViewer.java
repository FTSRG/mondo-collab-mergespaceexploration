package org.eclipse.viatra.dse.merge.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.compare.CompareConfiguration;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.Priority;
import org.eclipse.viatra.dse.merge.model.provider.ModelItemProviderAdapterFactory;
import org.eclipse.viatra.dse.merge.ui.interpreter.DefaultCompareEditorInterpreter;
import org.eclipse.viatra.dse.merge.ui.interpreter.ICompareEditorInputInterpreter;
import org.eclipse.viatra.dse.merge.ui.listeners.DSEContentConfigChangeListener;
import org.eclipse.viatra.dse.merge.ui.listeners.MayMustCheckStateListener;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionList;
import org.eclipse.viatra.dse.merge.ui.runnables.ComparisonRunnable;
import org.eclipse.viatra.dse.merge.ui.tabs.AbstractSolutionTab;
import org.eclipse.viatra.dse.merge.ui.tabs.DefaultTreeSolutionTab;

import com.google.common.collect.Lists;

/**
 * Content Merge Viewer for DSE Merge.
 * 
 * @author Csaba Debreceni
 *
 */
public class DSEContentMergeViewer extends Viewer {

    // extension point properties
    private static final String INTERPRETER_POINT = "org.eclipse.viatra.dse.merge.ui.interpreter";
    private static final String INTERPRETER_CLASS_ATTRIBUTE = "interpreter";
    private static final String VISUALIZER_POINT = "org.eclipse.viatra.dse.merge.ui.visualizer";
    private static final String VISUALIZER_CLASS_ATTRIBUTE = "visualizer";
    // objects read from extension points
    private static Collection<ICompareEditorInputInterpreter> interpreters;
    private Collection<AbstractSolutionTab> visualizers;
    // view control
    private DSEContentMergeControl mergeControl;
    // compare configuration - communication via this object
    private final CompareConfiguration config;
    // factories
    private AdapterFactory adapterFactory = new ModelItemProviderAdapterFactory();
    private AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
    private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);

    private Object input;
    private Resource remote;
    private Resource local;
    private Resource original;
    private ChangeSet changeOL;
    private ChangeSet changeOR;

    public DSEContentMergeViewer(Composite parent, CompareConfiguration config) {
        this.config = config;
        initialize(parent);
    }

    private void initialize(Composite parent) {
        if (interpreters == null)
            initializeInterpreters();

        if (visualizers == null)
            initializeVisualizers();

        mergeControl = new DSEContentMergeControl(parent, visualizers, SWT.None);
        mergeControl.getLeftViewer().setContentProvider(contentProvider);
        mergeControl.getLeftViewer().setLabelProvider(labelProvider);
        mergeControl.getLeftViewer().addCheckStateListener(new MayMustCheckStateListener());
        mergeControl.getRightViewer().setContentProvider(contentProvider);
        mergeControl.getRightViewer().setLabelProvider(labelProvider);
        mergeControl.getRightViewer().addCheckStateListener(new MayMustCheckStateListener());

        initializeButtons();
        registerCompareConfig();
    }

    /**
     * Reads the interpreter extension points
     */
    private static void initializeInterpreters() {
        interpreters = Lists.newArrayList();
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(INTERPRETER_POINT);
        for (IExtension ext : extensionPoint.getExtensions()) {
            for (IConfigurationElement conf : ext.getConfigurationElements()) {
                try {
                    interpreters.add((ICompareEditorInputInterpreter) conf
                            .createExecutableExtension(INTERPRETER_CLASS_ATTRIBUTE));
                } catch (InvalidRegistryObjectException | CoreException e) {
                    Logger.getLogger(DSEContentMergeViewer.class).error(
                            conf.getContributor().getName() + " - " + e.getMessage());
                }
            }
        }
        interpreters.add(new DefaultCompareEditorInterpreter());
    }

    /**
     * Reads the visualizer extension points and adds the default tree tab
     */
    private void initializeVisualizers() {
        visualizers = Lists.newArrayList();
        IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(VISUALIZER_POINT);
        for (IExtension ext : extensionPoint.getExtensions()) {
            for (IConfigurationElement conf : ext.getConfigurationElements()) {
                try {
                    visualizers.add((AbstractSolutionTab) conf.createExecutableExtension(VISUALIZER_CLASS_ATTRIBUTE));
                } catch (InvalidRegistryObjectException | CoreException e) {
                    Logger.getLogger(DSEContentMergeViewer.class).error(
                            conf.getContributor().getName() + " - " + e.getMessage());
                }
            }
        }
        visualizers.add(new DefaultTreeSolutionTab());
    }

    /**
     * Adds listeners the buttons in the control
     */
    private void initializeButtons() {
        mergeControl.getButtonLeftAll().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                for (Change change : changeOL.getChanges()) {
                    mergeControl.getLeftViewer().setSubtreeChecked(change, true);
                    change.setPriority(Priority.MUST);
                }
            }
        });
        mergeControl.getButtonLeftNone().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                for (Change change : changeOL.getChanges()) {
                    mergeControl.getLeftViewer().setSubtreeChecked(change, false);
                    change.setPriority(Priority.MAY);
                }
            }
        });
        mergeControl.getButtonRightAll().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                for (Change change : changeOR.getChanges()) {
                    mergeControl.getRightViewer().setSubtreeChecked(change, true);
                    change.setPriority(Priority.MUST);
                }
            }
        });
        mergeControl.getButtonRightNone().addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                for (Change change : changeOR.getChanges()) {
                    mergeControl.getRightViewer().setSubtreeChecked(change, false);
                    change.setPriority(Priority.MAY);
                }
            }
        });
    }

    private void registerCompareConfig() {
        config.addPropertyChangeListener(new DSEContentConfigChangeListener(this));
    }

    @Override
    public void setInput(Object input) {

        mergeControl.getLabelLeft().setText(config.getLeftLabel(input));
        mergeControl.getLabelRight().setText(config.getRightLabel(input));

        for (ICompareEditorInputInterpreter interpreter : interpreters) {
            if (interpreter.isInterpreterForType(input)) {
                interpreter.interpretEditorInput(input, config);
                break;
            }
        }
    }

    public void executeComparison() {
        IProgressService service = PlatformUI.getWorkbench().getProgressService();
        try {
            service.run(true, false, new ComparisonRunnable(original, local, remote, null, null, config));
        } catch (InvocationTargetException | InterruptedException e) {
            e.printStackTrace();
            Logger.getLogger(DSEContentMergeViewer.class).error(e.getMessage());
        }
    }

    @Override
    public Control getControl() {
        return mergeControl;
    }

    @Override
    public Object getInput() {
        return input;
    }

    @Override
    public ISelection getSelection() {
        return mergeControl.getLeftViewer().getSelection();
    }

    @Override
    public void refresh() {
        mergeControl.redraw();
    }

    public void setOriginal(Resource original) {
        this.original = original;
    }

    public void setLocal(Resource local) {
        this.local = local;
    }

    public void setRemote(Resource remote) {
        this.remote = remote;
    }

    public void setChangeOL(ChangeSet changeOL) {
        this.changeOL = changeOL;
        mergeControl.getLeftViewer().setInput(changeOL);
        refresh();
    }

    public void setChangeOR(ChangeSet changeOR) {
        this.changeOR = changeOR;
        mergeControl.getRightViewer().setInput(changeOR);
        refresh();
    }

    public void setSolutions(Collection<Solution> solutions) {
        SolutionList solutionList = new SolutionList(solutions);

        for (AbstractSolutionTab tab : visualizers) {
            tab.setSolutions(solutionList);
            tab.setConfig(config);
        }

        mergeControl.changeToSolutionPage();
    }

    @Override
    public void setSelection(ISelection selection, boolean reveal) {

    }
}
