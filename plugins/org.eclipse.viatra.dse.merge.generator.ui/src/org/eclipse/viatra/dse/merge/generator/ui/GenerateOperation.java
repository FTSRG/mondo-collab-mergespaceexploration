package org.eclipse.viatra.dse.merge.generator.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.viatra.dse.merge.generator.ArtifactBuilder;
import org.eclipse.viatra.dse.merge.generator.ProjectBuilder;

public class GenerateOperation implements IRunnableWithProgress {

    private IProject project;
    private String generatorName;
    private String ext;
    private String className;
    private String uri;
    private IFolder root;

    public GenerateOperation(IProject project, String generatorName, String ext, String className, String uri, IFolder root) {
        this.project = project;
        this.generatorName = generatorName;
        this.ext = ext;
        this.className = className;
        this.uri = uri;
        this.root = root;
    }
    
    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
        ProjectBuilder projectBuilder = new ProjectBuilder();
        IFile generator = projectBuilder.doGenerate(project, generatorName, ext, className, uri, root, monitor);
        ArtifactBuilder artifactBuilder = new ArtifactBuilder();
        artifactBuilder.doSetup(generator, monitor);
        artifactBuilder.doTraverse();
        artifactBuilder.doGenerate();
    }

}
