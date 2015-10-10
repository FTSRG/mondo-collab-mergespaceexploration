package org.eclipse.viatra.dse.merge.ui.viewers;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.compare.CompareConfiguration;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.viatra.dse.merge.DSEMergeConfigurator;
import org.eclipse.viatra.dse.merge.DSEMergeManager;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.emf.compare.EMFCompareTranslator;
import org.eclipse.viatra.dse.merge.model.Change;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.Priority;
import org.eclipse.viatra.dse.merge.model.provider.ModelItemProviderAdapterFactory;
import org.eclipse.viatra.dse.merge.ui.Properties;
import org.eclipse.viatra.dse.merge.ui.interpreter.DefaultCompareEditorInterpreter;
import org.eclipse.viatra.dse.merge.ui.interpreter.ICompareEditorInputInterpreter;

import com.google.common.collect.Lists;

public class DSEContentMergeViewer extends Viewer {

    private static final String INTERPRETER_POINT = "org.eclipse.viatra.dse.merge.ui.interpreter";
    private static final String INTERPRETER_CLASS_ATTRIBUTE = "interpreter";
    private static final String VISUALIZER_POINT = "org.eclipse.viatra.dse.merge.ui.visualizer";
    private static final String VISUALIZER_CLASS_ATTRIBUTE = "visualizer";
    private DSEContentMergeControl mergeControl;
    private Object input;
    private final CompareConfiguration config;
    private AdapterFactory adapterFactory = new ModelItemProviderAdapterFactory();

    private static Collection<ICompareEditorInputInterpreter> interpreters;
    private Collection<AbstractSolutionTab> tabs;
    
    private Resource remote;
    private Resource local;
    private Resource original;
    private ChangeSet changeOL;
    private ChangeSet changeOR;
    private Collection<Solution> solutions;

    private AdapterFactoryContentProvider contentProvider = new AdapterFactoryContentProvider(adapterFactory);
    private AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
    public DSEContentMergeViewer(Composite parent, CompareConfiguration config) {
        this.config = config;
        initialize(parent);
    }

    private static void initializeConfiguration() {
        interpreters = Lists.newArrayList();
        try {
            IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(INTERPRETER_POINT);
            for (IExtension ext : extensionPoint.getExtensions()) {

                for (IConfigurationElement conf : ext.getConfigurationElements()) {
                    interpreters.add((ICompareEditorInputInterpreter) conf.createExecutableExtension(INTERPRETER_CLASS_ATTRIBUTE));
                }
            }
        } catch (InvalidRegistryObjectException | CoreException e) {
            Logger.getLogger(DSEContentMergeViewer.class).error(e.getMessage());
        }
        interpreters.add(new DefaultCompareEditorInterpreter());
    }

    private void initializeTabs() {
        tabs = Lists.newArrayList();
        try {
            IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(VISUALIZER_POINT);
            for (IExtension ext : extensionPoint.getExtensions()) {

                for (IConfigurationElement conf : ext.getConfigurationElements()) {
                    tabs.add((AbstractSolutionTab) conf.createExecutableExtension(VISUALIZER_CLASS_ATTRIBUTE));
                }
            }
        } catch (InvalidRegistryObjectException | CoreException e) {
            Logger.getLogger(DSEContentMergeViewer.class).error(e.getMessage());
        }
        tabs.add(new DefaultSolutionTab());
    }
    
    private void initialize(Composite parent) {
        if (interpreters == null)
            initializeConfiguration();

        initializeTabs();
        
        mergeControl = new DSEContentMergeControl(parent, tabs, SWT.None);
        mergeControl.getLeftViewer().addCheckStateListener(new MayMustCheckStateListener());
        mergeControl.getRightViewer().addCheckStateListener(new MayMustCheckStateListener());
        
        initializeButtons();
        initializeCompareConfig();
    }

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

    private void initializeCompareConfig() {

        config.addPropertyChangeListener(new IPropertyChangeListener() {

            @Override
            public void propertyChange(final PropertyChangeEvent event) {

                Display.getDefault().asyncExec(new Runnable() {
                    @SuppressWarnings("unchecked")
                    public void run() {
                        if (event.getProperty().equals(Properties.READY_TO_COMPARE)) {
                            executeComparison();
                        }
                        if (event.getProperty().equals(Properties.ANCESTOR)) {
                            original = (Resource) event.getNewValue();
                        }
                        if (event.getProperty().equals(Properties.LEFT)) {
                            local = (Resource) event.getNewValue();
                        }
                        if (event.getProperty().equals(Properties.RIGHT)) {
                            remote = (Resource) event.getNewValue();
                        }
                        if (event.getProperty().equals(Properties.CHANGESET_OL)) {
                            changeOL = (ChangeSet) event.getNewValue();
                            mergeControl.getLeftViewer().setContentProvider(contentProvider);
                            mergeControl.getLeftViewer().setLabelProvider(labelProvider);
                            mergeControl.getLeftViewer().setInput(changeOL);
                            refresh();
                        }

                        if (event.getProperty().equals(Properties.CHANGESET_OR)) {
                            changeOR = (ChangeSet) event.getNewValue();
                            mergeControl.getRightViewer().setContentProvider(contentProvider);
                            mergeControl.getRightViewer().setLabelProvider(labelProvider);
                            mergeControl.getRightViewer().setInput(changeOR);
                            refresh();
                        }
                        if (event.getProperty().equals(Properties.SOLUTIONS)) {
                            solutions = (Collection<Solution>) event.getNewValue();
                            SolutionList solutionList = new SolutionList(solutions);
                            
                            for (AbstractSolutionTab tab : tabs) {
                                tab.setSolutions(solutionList);
                                tab.setConfig(config);
                            }
                            
                            mergeControl.changeToSolutionPage();
                        }
                    }
                });
            }
        });
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

    private void executeComparison() {
        IProgressService service = PlatformUI.getWorkbench().getProgressService();
        try {
            service.run(true, false, new IRunnableWithProgress() {

                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

                    monitor.beginTask("Comparison is in progress...", 6);
                    monitor.worked(1);

                    // Configure EMF Compare
                    {
                        IEObjectMatcher matcher = DefaultMatchEngine
                                .createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
                        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
                                new DefaultEqualityHelperFactory());
                        IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
                        matchEngineFactory.setRanking(20);
                        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
                        matchEngineRegistry.add(matchEngineFactory);
                        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry)
                                .build();

                        monitor.worked(1);

                        // Compare the two models
                        if (local != null) {
                            IComparisonScope scopeOL = new DefaultComparisonScope(local, original, null);
                            Comparison comparisonOL = comparator.compare(scopeOL);
                            String nsURI = original.getContents().get(0).eClass().getEPackage().getNsURI();
                            DSEMergeConfigurator configurator = DSEMergeManager.initializeConfiguration().get(nsURI);
                            changeOL = new EMFCompareTranslator().translate(comparisonOL, configurator.getIdMapper());
                        }
                    }
                    monitor.worked(2);

                    {
                        IEObjectMatcher matcher = DefaultMatchEngine
                                .createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
                        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(
                                new DefaultEqualityHelperFactory());
                        IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
                        matchEngineFactory.setRanking(20);
                        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
                        matchEngineRegistry.add(matchEngineFactory);
                        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry)
                                .build();

                        monitor.worked(1);

                        IComparisonScope scopeOR = new DefaultComparisonScope(remote, original, null);
                        Comparison comparisonOR = comparator.compare(scopeOR);
                        String nsURI = original.getContents().get(0).eClass().getEPackage().getNsURI();
                        DSEMergeConfigurator configurator = DSEMergeManager.initializeConfiguration().get(nsURI);
                        changeOR = new EMFCompareTranslator().translate(comparisonOR, configurator.getIdMapper());

                    }
                    monitor.worked(2);
                    monitor.done();

                    if (local != null)
                        config.setProperty(Properties.CHANGESET_OL, changeOL);
                    config.setProperty(Properties.CHANGESET_OR, changeOR);
                }
            });
        } catch (InvocationTargetException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setSelection(ISelection selection, boolean reveal) {

    }

    private class MayMustCheckStateListener implements ICheckStateListener {

        @Override
        public void checkStateChanged(CheckStateChangedEvent event) {
            Object object = event.getElement();
            Change change = (Change) object;
            change.setPriority(event.getChecked() ? Priority.MUST : Priority.MAY);
        }

    }

    public class SolutionElement {
        public int counter;
        public Solution solution;

        public SolutionElement(int counter, Solution solution) {
            this.counter = counter;
            this.solution = solution;
        }
    }

    public class SolutionList {
        public Collection<SolutionElement> list = Lists.newArrayList();

        public SolutionList(Collection<Solution> solutions) {
            for (Solution solution : solutions) {
                add(solution);
            }
        }

        private void add(Solution solution) {
            list.add(new SolutionElement(list.size() + 1, solution));
        }
    }
}
