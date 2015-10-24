package org.eclipse.viatra.dse.merge.ui.runnables;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.viatra.dse.merge.DSEMergeManager;
import org.eclipse.viatra.dse.merge.DSEMergeManager.Solution;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.ui.Properties;

public class MergeRunnable implements IRunnableWithProgress {

    private Resource original;
    private ChangeSet changeOL;
    private ChangeSet changeOR;
    private CompareConfiguration config;

    public MergeRunnable(Resource original, ChangeSet changeOL, ChangeSet changeOR, CompareConfiguration config) {
        super();
        this.original = original;
        this.changeOL = changeOL;
        this.changeOR = changeOR;
        this.config = config;
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

        monitor.beginTask("Searching solutions...", 2);

        DSEMergeManager manager = DSEMergeManager.create(original.getContents().get(0), changeOL, changeOR);
        monitor.worked(1);
        Collection<Solution> solutions = manager.start();
        monitor.worked(1);
        config.setProperty(Properties.SOLUTIONS, solutions);
        monitor.done();
    }

}
