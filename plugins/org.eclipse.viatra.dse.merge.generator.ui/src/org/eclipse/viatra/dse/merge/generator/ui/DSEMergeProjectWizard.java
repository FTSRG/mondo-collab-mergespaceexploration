package org.eclipse.viatra.dse.merge.generator.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.ui.PDEPlugin;
import org.eclipse.pde.internal.ui.PDEPluginImages;
import org.eclipse.pde.internal.ui.wizards.IProjectProvider;
import org.eclipse.pde.internal.ui.wizards.NewWizard;
import org.eclipse.pde.internal.ui.wizards.WizardElement;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationOperation;
import org.eclipse.pde.internal.ui.wizards.plugin.NewProjectCreationPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginContentPage;
import org.eclipse.pde.internal.ui.wizards.plugin.PluginFieldData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

@SuppressWarnings("restriction")
public class DSEMergeProjectWizard extends NewWizard implements INewWizard {

    public static final String DEF_PROJECT_NAME = "project_name"; //$NON-NLS-1$
    
    protected DSEMergeWizardPage fDseMergePage;
    
    private IConfigurationElement fConfig;
    private PluginFieldData fPluginData;
    private IProjectProvider fProjectProvider;
    protected NewProjectCreationPage fMainPage;
    protected PluginContentPage fContentPage;
        
    public DSEMergeProjectWizard() {
        setDefaultPageImageDescriptor(PDEPluginImages.DESC_NEWPPRJ_WIZ);
        setDialogSettings(PDEPlugin.getDefault().getDialogSettings());
        setWindowTitle("New DSE Merge Configurator Plugin Project");
        setNeedsProgressMonitor(true);
        fPluginData = new PluginFieldData();
    }
    
    /* (non-Javadoc)
     * @see org.eclipse.jface.wizard.Wizard#addPages()
     */
    @Override
    public void addPages() {
        fMainPage = new NewProjectCreationPage("main", fPluginData, false, getSelection()); //$NON-NLS-1$
        fMainPage.setTitle("DSE Merge Configurator");
        fMainPage.setDescription("Create DSE Merge Configurator Plugin Project");
        String pname = getDefaultValue(DEF_PROJECT_NAME);
        if (pname != null)
            fMainPage.setInitialProjectName(pname);
        addPage(fMainPage);

        fProjectProvider = new IProjectProvider() {
            public String getProjectName() {
                return fMainPage.getProjectName();
            }

            public IProject getProject() {
                return fMainPage.getProjectHandle();
            }

            public IPath getLocationPath() {
                return fMainPage.getLocationPath();
            }
        };

        fContentPage = new PluginContentPage("page2", fProjectProvider, fMainPage, fPluginData); //$NON-NLS-1$
        addPage(fContentPage);
        
        fDseMergePage = new DSEMergeWizardPage();
        addPage(fDseMergePage);
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.wizard.Wizard#canFinish()
     */
    @Override
    public boolean canFinish() {
        IWizardPage page = getContainer().getCurrentPage();
        return super.canFinish() && page == fDseMergePage && fDseMergePage.isPageComplete();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.pde.internal.ui.wizards.NewWizard#performFinish()
     */
    @Override
    public boolean performFinish() {
        if(!performOldFinish())
            return false;
        
        try {
            
            IProject project = fProjectProvider.getProject();
            IFolder root = project.getFolder(fPluginData.getSourceFolderName());
            String generatorName = fDseMergePage.getGeneratorName();
            String className = fDseMergePage.getTypeName();
            String uri = fDseMergePage.getURI();
            String ext = fDseMergePage.getExtension();
            
            getContainer().run(false, true , new GenerateOperation(project, generatorName, ext, className, uri, root));
            return true;
        } catch (InvocationTargetException e) {
            PDEPlugin.logException(e);
        } catch (InterruptedException e) {
        }
        return false;
        
    }
    public boolean performOldFinish() {
        try {
            fMainPage.updateData();
            fContentPage.updateData();
            IDialogSettings settings = getDialogSettings();
            if (settings != null) {
                fMainPage.saveSettings(settings);
                fContentPage.saveSettings(settings);
            }
            BasicNewProjectResourceWizard.updatePerspective(fConfig);

            // If the PDE models are not initialized, initialize with option to cancel
            if (!PDECore.getDefault().areModelsInitialized()) {
                try {
                    getContainer().run(true, true, new IRunnableWithProgress() {
                        public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                            // Target reloaded method clears existing models (which don't exist currently) and inits them with a progress monitor
                            PDECore.getDefault().getModelManager().targetReloaded(monitor);
                            if (monitor.isCanceled()) {
                                throw new InterruptedException();
                            }
                        }
                    });
                } catch (InterruptedException e) {
                    // Target platform will be empty, but project still can be created
                }
            }

            getContainer().run(false, true, new NewProjectCreationOperation(fPluginData, fProjectProvider, null));

            IWorkingSet[] workingSets = fMainPage.getSelectedWorkingSets();
            if (workingSets.length > 0)
                getWorkbench().getWorkingSetManager().addToWorkingSets(fProjectProvider.getProject(), workingSets);

            return true;
        } catch (InvocationTargetException e) {
            PDEPlugin.logException(e);
        } catch (InterruptedException e) {
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.runtime.IExecutableExtension#setInitializationData(org.eclipse.core.runtime.IConfigurationElement, java.lang.String, java.lang.Object)
     */
    public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
        fConfig = config;
    }

    protected WizardElement createWizardElement(IConfigurationElement config) {
        String name = config.getAttribute(WizardElement.ATT_NAME);
        String id = config.getAttribute(WizardElement.ATT_ID);
        String className = config.getAttribute(WizardElement.ATT_CLASS);
        if (name == null || id == null || className == null)
            return null;
        WizardElement element = new WizardElement(config);
        String imageName = config.getAttribute(WizardElement.ATT_ICON);
        if (imageName != null) {
            String pluginID = config.getNamespaceIdentifier();
            Image image = PDEPlugin.getDefault().getLabelProvider().getImageFromPlugin(pluginID, imageName);
            element.setImage(image);
        }
        return element;
    }
    
    
    
}
