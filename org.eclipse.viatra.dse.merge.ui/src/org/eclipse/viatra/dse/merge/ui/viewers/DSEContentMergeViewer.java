package org.eclipse.viatra.dse.merge.ui.viewers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.team.internal.ui.mapping.AbstractCompareInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.viatra.dse.merge.emf.compare.EMFCompareTranslator;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.provider.ModelItemProviderAdapterFactory;
import org.eclipse.viatra.dse.merge.ui.Util;

public class DSEContentMergeViewer extends Viewer {

	private DSEContentMergeControl mergeControl;
	private AbstractCompareInput input;
	private final CompareConfiguration config;
	private AdapterFactory adapterFactory = new ModelItemProviderAdapterFactory();
	
	public static final String ANCESTOR = "ANCESTOR";
	public static final String LEFT = "LEFT";
	public static final String RIGHT = "RIGHT";
	public static final String CHANGESET_OL = "ChangeSet_OL";
	public static final String CHANGESET_OR = "ChangeSet_OR";
	
	private IResource remote;
	private IResource local;
	private IResource original;
	private ChangeSet changeOL;
	private ChangeSet changeOR;

	public DSEContentMergeViewer(Composite parent, CompareConfiguration config) {
		mergeControl = new DSEContentMergeControl(parent, SWT.None);
		this.config = config;
		initialize();
	}

	private void initialize() {
		config.addPropertyChangeListener(new IPropertyChangeListener() {
			
			@Override
			public void propertyChange(final PropertyChangeEvent event) {
				
				Display.getDefault().syncExec(new Runnable() {
				    public void run() {
				    	if(event.getProperty().equals(CHANGESET_OL)) {
							changeOL = (ChangeSet) event.getNewValue();
							mergeControl.getLeftViewer().setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
							mergeControl.getLeftViewer().setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
							mergeControl.getLeftViewer().setInput(changeOL);
							refresh();
						}
						
						if(event.getProperty().equals(CHANGESET_OR)) {
							changeOR = (ChangeSet) event.getNewValue();
							mergeControl.getRightViewer().setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
							mergeControl.getRightViewer().setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
							mergeControl.getRightViewer().setInput(changeOR);
							refresh();
						}
				    }
				});
				
//				IProgressService service = PlatformUI.getWorkbench().getProgressService();
//				try {
//					service.run(true, false, new IRunnableWithProgress() {
//						
//						@Override
//						public void run(IProgressMonitor monitor) throws InvocationTargetException,
//								InterruptedException {
//							
//						}
//					});
//				} catch (InvocationTargetException | InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		mergeControl.redraw();
	}

	@Override
	@SuppressWarnings("restriction")
	public void setInput(Object input) {
		if(input instanceof AbstractCompareInput) {
			this.input = (AbstractCompareInput) input;
			original = Util.getResource(this.input.getAncestor());
			config.setProperty(ANCESTOR, original);
			local = Util.getResource(this.input.getLeft());
			config.setProperty(LEFT, local);
			remote = Util.getResource(this.input.getRight());
			config.setProperty(RIGHT, remote);
			executeComparison();
		}
	}

	private void executeComparison() {
		IProgressService service = PlatformUI.getWorkbench().getProgressService();
		try {
			service.run(true, false, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					
					monitor.beginTask("Comparison is in progress...", 8);
					
					ResourceSet originalSet = new ResourceSetImpl();
					ResourceSet localSet = new ResourceSetImpl();
					ResourceSet remoteSet = new ResourceSetImpl();
					
					// Loading models to resource set
					originalSet.getResource(URI.createFileURI(original.getLocation().toString()), true);
					localSet.getResource(URI.createFileURI(local.getLocation().toString()), true);
					remoteSet.getResource(URI.createFileURI(remote.getLocation().toString()), true);
					
					monitor.worked(1);
					
					// Configure EMF Compare
					IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
					IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
					IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
					matchEngineFactory.setRanking(20);
					IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
					matchEngineRegistry.add(matchEngineFactory);
					EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

					monitor.worked(1);
					
					// Compare the two models
					IComparisonScope scopeOL = EMFCompare.createDefaultScope(localSet, originalSet);
					Comparison comparisonOL = comparator.compare(scopeOL);
					
					monitor.worked(2);
					
					IComparisonScope scopeOR = EMFCompare.createDefaultScope(remoteSet, originalSet);
					Comparison comparisonOR = comparator.compare(scopeOR);

					monitor.worked(2);

					ChangeSet translatedOL = EMFCompareTranslator.translate(comparisonOL);
					ChangeSet translatedOR = EMFCompareTranslator.translate(comparisonOR);
					
					monitor.worked(2);
					monitor.done();
					
					config.setProperty(CHANGESET_OL, translatedOL);
					config.setProperty(CHANGESET_OR, translatedOR);
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void setSelection(ISelection selection, boolean reveal) {
		// TODO Auto-generated method stub
		
	}
	
}
