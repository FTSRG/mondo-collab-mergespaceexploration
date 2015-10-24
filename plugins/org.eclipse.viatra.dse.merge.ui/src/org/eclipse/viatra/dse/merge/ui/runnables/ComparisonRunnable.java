package org.eclipse.viatra.dse.merge.ui.runnables;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.core.runtime.IProgressMonitor;
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
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.viatra.dse.merge.DSEMergeConfigurator;
import org.eclipse.viatra.dse.merge.DSEMergeManager;
import org.eclipse.viatra.dse.merge.emf.compare.EMFCompareTranslator;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.Properties;

public class ComparisonRunnable implements IRunnableWithProgress {
    
    private Resource original;
    private Resource local;
    private Resource remote;
    private Object changeOL;
    private Object changeOR;
    private CompareConfiguration config;

    public ComparisonRunnable(Resource original, Resource local, Resource remote, Object changeOL, Object changeOR,
            CompareConfiguration config) {
        super();
        this.original = original;
        this.local = local;
        this.remote = remote;
        this.changeOL = changeOL;
        this.changeOR = changeOR;
        this.config = config;
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

        monitor.beginTask("Comparison is in progress...", 3);

        EMFCompare comparator = initializeCompare();
        monitor.worked(1);

        if (local != null && changeOL == null) {
            changeOL = executeCompare(comparator, local, original);
            monitor.worked(1);
            config.setProperty(Properties.CHANGESET_OL, changeOL);
        }
        if (local != null && changeOL == null) {
            changeOR = executeCompare(comparator, remote, original);
            monitor.worked(1);
            config.setProperty(Properties.CHANGESET_OR, changeOR);
        }
        monitor.done();
    }

    private ChangeSet executeCompare(EMFCompare comparator, Resource modified, Resource base) {
        IComparisonScope scopeOL = new DefaultComparisonScope(modified, base, null);
        Comparison comparisonOL = comparator.compare(scopeOL);
        String nsURI = original.getContents().get(0).eClass().getEPackage().getNsURI();
        DSEMergeConfigurator configurator = DSEMergeManager.initializeConfiguration().get(nsURI);
        return new EMFCompareTranslator().translate(comparisonOL, configurator.getIdMapper());
    }

    private EMFCompare initializeCompare() {
        IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
        IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
        IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
        matchEngineFactory.setRanking(20);
        IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
        matchEngineRegistry.add(matchEngineFactory);
        EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();
        return comparator;
    }
}
