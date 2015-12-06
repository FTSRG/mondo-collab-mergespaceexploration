package org.eclipse.viatra.dse.merge.generator.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.presentation.EcoreActionBarContributor.ExtendedLoadResourceAction.RegisteredPackageDialog;
import org.eclipse.emf.ecore.presentation.EcoreEditorPlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.LoadResourceAction.LoadResourceDialog;
import org.eclipse.equinox.bidi.StructuredTextTypeHandlerFactory;
import org.eclipse.jdt.internal.ui.IJavaHelpContextIds;
import org.eclipse.jdt.internal.ui.dialogs.TextFieldNavigationHandler;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.IStringButtonAdapter;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringButtonDialogField;
import org.eclipse.jdt.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.jdt.ui.wizards.NewClassWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.util.BidiUtils;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

@SuppressWarnings("restriction")
public class DSEMergeWizardPage extends NewClassWizardPage {

    StringButtonDialogField fUriDialogField;
    StringDialogField fGeneratorNameDialogField;
    StringDialogField fExtensionDialogField;
    StringButtonDialogField fEPackageDialogField;
    List<URI> URIs;
    DialogFieldAdapter adapter;
    boolean firstTime = true;
    
    /**
     * Create the wizard page.
     */
    public DSEMergeWizardPage() {
        super();
        
        setTitle("DSE Merge Configuration");
        setDescription("This wizard will help you to DSE Merge Configuration.");
        
        adapter = new DialogFieldAdapter();
        
        fGeneratorNameDialogField= new StringDialogField();
        fGeneratorNameDialogField.setDialogFieldListener(adapter);
        fGeneratorNameDialogField.setLabelText(getGeneratorNameLabel());

        fExtensionDialogField= new StringDialogField();
        fExtensionDialogField.setDialogFieldListener(adapter);
        fExtensionDialogField.setLabelText(getExtensionLabel());

        fUriDialogField = new StringButtonDialogField(adapter);
        fUriDialogField.setDialogFieldListener(adapter);
        fUriDialogField.setLabelText(getUriLabel());
        fUriDialogField.setButtonLabel("Browse");
        
        setDefaultValues();
    }

    private void setDefaultValues() {
        fGeneratorNameDialogField.setText("generator.dsemerge");
        fExtensionDialogField.setText("xmi");
        setTypeName("DSEMergeConfigurator", true);
        validatePage();
    }

    /**
     * Create contents of the wizard.
     * @param parent
     */
    @Override
    public void createControl(Composite parent) {
        initializeDialogUnits(parent);
        
        Composite composite= new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());

        int nColumns= 4;

        GridLayout layout= new GridLayout();
        layout.numColumns= nColumns;
        composite.setLayout(layout);
        
        createTypeNameControls(composite, nColumns);
        createGeneratorNameControls(composite, nColumns);
        createSeparator(composite, nColumns);
        createUriControls(composite, nColumns);
        createExtensionControls(composite, nColumns);
        createSeparator(composite, nColumns);
        
        setControl(composite);

        Dialog.applyDialogFont(composite);
        PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IJavaHelpContextIds.NEW_CLASS_WIZARD_PAGE);
    }

    @Override
    protected void setFocus() {
        fUriDialogField.setFocus();
    }
    
    /**
     * Creates the controls for the type name field. Expects a <code>GridLayout</code> with at
     * least 2 columns.
     *
     * @param composite the parent composite
     * @param nColumns number of columns to span
     */
    protected void createGeneratorNameControls(Composite composite, int nColumns) {
        fGeneratorNameDialogField.doFillIntoGrid(composite, nColumns - 1);
        DialogField.createEmptySpace(composite);

        Text text= fGeneratorNameDialogField.getTextControl(null);
        LayoutUtil.setWidthHint(text, getMaxFieldWidth());
        TextFieldNavigationHandler.install(text);
    }


    /**
     * Creates the controls for the uri field. Expects a <code>GridLayout</code> with at
     * least 2 columns.
     *
     * @param composite the parent composite
     * @param nColumns number of columns to span
     */
    protected void createUriControls(Composite parent, int nColumns) {
        fUriDialogField.doFillIntoGrid(parent, nColumns);
        LayoutUtil.setWidthHint(fUriDialogField.getTextControl(null), getMaxFieldWidth());
        BidiUtils.applyBidiProcessing(fUriDialogField.getTextControl(null), StructuredTextTypeHandlerFactory.FILE);
    }
    
    /**
     * Creates the controls for the extension field. Expects a <code>GridLayout</code> with at
     * least 2 columns.
     *
     * @param composite the parent composite
     * @param nColumns number of columns to span
     */
    protected void createExtensionControls(Composite parent, int nColumns) {
        fExtensionDialogField.doFillIntoGrid(parent, nColumns);
        LayoutUtil.setWidthHint(fExtensionDialogField.getTextControl(null), getMaxFieldWidth());
        BidiUtils.applyBidiProcessing(fExtensionDialogField.getTextControl(null), StructuredTextTypeHandlerFactory.FILE);
    }
    
    /**
     * Returns the generator name entered into the generator input field.
     *
     * @return the generator name
     */
    public String getGeneratorName() {
        return fGeneratorNameDialogField.getText();
    }
    
    /**
     * Returns the selected URI field.
     *
     * @return the URI
     */
    public String getURI() {
        return fUriDialogField.getText();
    }
    
    /**
     * Returns the selected extension field.
     *
     * @return the extension
     */
    public String getExtension() {
        return fExtensionDialogField.getText();
    }
    
    /**
     * Sets the generator name input field's text to the given value. Method doesn't update
     * the model.
     *
     * @param name the new generator name
     * @param canBeModified if <code>true</code> the type name field is
     * editable; otherwise it is read-only.
     */
    public void setGeneratorName(String name, boolean canBeModified) {
        fGeneratorNameDialogField.setText(name);
        fGeneratorNameDialogField.setEnabled(canBeModified);
    }
    
    /**
     * Sets the uri input field's text to the given value. Method doesn't update
     * the model.
     *
     * @param name the new uri
     * @param canBeModified if <code>true</code> the type name field is
     * editable; otherwise it is read-only.
     */
    public void setURI(String name, boolean canBeModified) {
        fUriDialogField.setText(name);
        fUriDialogField.setEnabled(canBeModified);
    }
    
    /**
     * Sets the extension input field's text to the given value. Method doesn't update
     * the model.
     *
     * @param name the new extension
     * @param canBeModified if <code>true</code> the type name field is
     * editable; otherwise it is read-only.
     */
    public void setExtension(String name, boolean canBeModified) {
        fExtensionDialogField.setText(name);
        fExtensionDialogField.setEnabled(canBeModified);
    }
    
    @Override
    protected String getTypeNameLabel() {
        return "Configurator Class Name";
    }
    
    public String getGeneratorNameLabel() {
        return "Generator File Name";
    }
    
    public String getExtensionLabel() {
        return "Model file extension";
    }
    
    public String getUriLabel() {
        return "EPackage URI";
    }
    
    private class DialogFieldAdapter implements IDialogFieldListener, IStringButtonAdapter {

        @Override
        public void dialogFieldChanged(DialogField field) {
            validatePage();
        }

        @Override
        public void changeControlPressed(DialogField field) {
            if(field == fUriDialogField) {
                NameSpaceUriSelectorDialog dialog = new NameSpaceUriSelectorDialog(getShell(), null);
                dialog.setBlockOnOpen(true);
                if(dialog.open() == Window.OK) {
                    URIs = dialog.getURIs();
                    if(URIs.isEmpty())
                        setURI("", true);
                    setURI(URIs.get(0).toString(), true);
                }
            }
            validatePage();
        }
    }
    
    protected void validatePage() {
        String errorMessage = null;
        if(errorMessage == null && fUriDialogField.getText().trim().length() == 0) {
            errorMessage = "At least one URI has to be selected.";
            setMessage("At least one URI has to be selected.", IStatus.ERROR);
        }
        if(errorMessage == null && fGeneratorNameDialogField.getText().length() == 0) {
            errorMessage = "Generator name has to be set.";
            setMessage("Generator name has to be set.", IStatus.ERROR);
        }
        if(errorMessage == null && !fGeneratorNameDialogField.getText().endsWith(".dsemerge")) {
            setMessage("The (.dsemerge) extension will be added automatically.", IStatus.WARNING);
        }
        if(errorMessage == null && getTypeName().length() == 0) {
            errorMessage = "Configurator has to be set.";
            setMessage("Configurator has to be set.", IStatus.ERROR);
        }
        if(errorMessage == null && fExtensionDialogField.getText().length() == 0) {
            errorMessage = "Model file extension has to be set.";
            setMessage("Model file extension has to be set.", IStatus.ERROR);
        }
        if(errorMessage == null) {
            setPageComplete(true);
        } else {
            setPageComplete(false);
        }
    }
    
    public static class NameSpaceUriSelectorDialog extends LoadResourceDialog {

        protected Set<EPackage> registeredPackages = new LinkedHashSet<EPackage>();

        public NameSpaceUriSelectorDialog(Shell parent, EditingDomain domain) {
            super(parent, domain);
        }
        
        @Override
        protected boolean processResource(Resource resource)
        {
          // Put all static package in the package registry.
          //
          ResourceSet resourceSet = domain.getResourceSet();
          if (!resourceSet.getResources().contains(resource))
          {
            Registry packageRegistry = resourceSet.getPackageRegistry();
            for (EPackage ePackage : getAllPackages(resource))
            {
              packageRegistry.put(ePackage.getNsURI(), ePackage);
              registeredPackages.add(ePackage);
            }
          }
          return true;
        }

        public Set<EPackage> getRegisteredPackages()
        {
          return registeredPackages;
        }

        protected Collection<EPackage> getAllPackages(Resource resource)
        {
          List<EPackage> result = new ArrayList<EPackage>();
          for (TreeIterator<?> j =
                 new EcoreUtil.ContentTreeIterator<Object>(resource.getContents())
                 {
                   private static final long serialVersionUID = 1L;

                   @Override
                   protected Iterator<? extends EObject> getEObjectChildren(EObject eObject)
                   {
                     return
                       eObject instanceof EPackage ?
                         ((EPackage)eObject).getESubpackages().iterator() :
                           Collections.<EObject>emptyList().iterator();
                   }
                 };
               j.hasNext(); )
          {
            Object content = j.next();
            if (content instanceof EPackage)
            {
              result.add((EPackage)content);
            }
          }
          return result;
        }
        
        @Override
        protected Control createDialogArea(Composite parent)
        {
          Composite composite = (Composite)super.createDialogArea(parent);
          Composite buttonComposite = (Composite)composite.getChildren()[0];

          Button browseRegisteredPackagesButton = new Button(buttonComposite, SWT.PUSH);
          browseRegisteredPackagesButton.setText(EcoreEditorPlugin.INSTANCE.getString("_UI_BrowseRegisteredPackages_label"));
          prepareBrowseRegisteredPackagesButton(browseRegisteredPackagesButton);
          {
            FormData data = new FormData();
            Control [] children = buttonComposite.getChildren();
            data.right = new FormAttachment(children[0], -CONTROL_OFFSET);
            browseRegisteredPackagesButton.setLayoutData(data);
          }

          return composite;
        }
        
        protected void prepareBrowseRegisteredPackagesButton(Button browseRegisteredPackagesButton)
        {
          browseRegisteredPackagesButton.addSelectionListener
            (new SelectionAdapter()
             {
               @Override
               public void widgetSelected(SelectionEvent event)
               {
                 RegisteredPackageDialog registeredPackageDialog = new RegisteredPackageDialog(getShell());
                 registeredPackageDialog.open();
                 Object [] result = registeredPackageDialog.getResult();
                 if (result != null)
                 {
                   List<?> nsURIs = Arrays.asList(result);
                   if (registeredPackageDialog.isDevelopmentTimeVersion())
                   {
                     ResourceSet resourceSet = new ResourceSetImpl();
                     resourceSet.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(false));

                     // To support Xcore resources, we need a resource with a URI that helps determine the containing project
                     //
                     Resource dummyResource = domain == null ? null : resourceSet.createResource(domain.getResourceSet().getResources().get(0).getURI());

                     StringBuffer uris = new StringBuffer();
                     Map<String, URI> ePackageNsURItoGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false);
                     for (int i = 0, length = result.length; i < length; i++)
                     {
                       URI location = ePackageNsURItoGenModelLocationMap.get(result[i]);
                       Resource resource = resourceSet.getResource(location, true);
                       EcoreUtil.resolveAll(resource);
                     }

                     EList<Resource> resources = resourceSet.getResources();
                     resources.remove(dummyResource);

                     for (Resource resource : resources)
                     {
                       for (EPackage ePackage : getAllPackages(resource))
                       {
                         if (nsURIs.contains(ePackage.getNsURI()))
                         {
                           //uris.append(resource.getURI());
                           uris.append(ePackage.getNsURI());
                           uris.append("  ");
                           break;
                         }
                       }
                     }
                     uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
                   }
                   else
                   {
                     StringBuffer uris = new StringBuffer();
                     for (int i = 0, length = result.length; i < length; i++)
                     {
                       uris.append(result[i]);
                       uris.append("  ");
                     }
                     uriField.setText((uriField.getText() + "  " + uris.toString()).trim());
                   }
                 }
               }
             });
        }
        
      
    }
    @Override
    public void setPageComplete(boolean complete) {
        super.setPageComplete(complete);
    }
}
