package org.eclipse.viatra.dse.merge.ui.providers;

import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.viatra.dse.merge.model.ChangeSet;
import org.eclipse.viatra.dse.merge.model.provider.ModelItemProviderAdapterFactory;
import org.eclipse.viatra.dse.merge.scope.DSEMergeScope;
import org.eclipse.viatra.dse.merge.scope.provider.ScopeItemProviderAdapterFactory;
import org.eclipse.viatra.dse.merge.ui.providers.helper.SolutionElement;

/**
 * This label provider resuses the model and scope providers from *.edit plugin for visualization purpose.
 * 
 * @author Csaba Debreceni
 *
 */
public class SolutionLabelProvider extends LabelProvider {

    private static final ModelItemProviderAdapterFactory MODEL_ADAPTER_FACTORY = new ModelItemProviderAdapterFactory();
    private static final ScopeItemProviderAdapterFactory SCOPE_ADAPTER_FACTORY = new ScopeItemProviderAdapterFactory();
    AdapterFactoryLabelProvider scope = new AdapterFactoryLabelProvider(SCOPE_ADAPTER_FACTORY);
    AdapterFactoryLabelProvider model = new AdapterFactoryLabelProvider(MODEL_ADAPTER_FACTORY);
    AdapterFactoryLabelProvider basic = new AdapterFactoryLabelProvider(new ReflectiveItemProviderAdapterFactory());

    @Override
    public String getText(Object element) {
        if (element instanceof SolutionElement) {
            return "Solution " + ((SolutionElement) element).counter;
        }
        if (element instanceof ChangeSet) {
            DSEMergeScope scope = (DSEMergeScope) ((ChangeSet) element).eContainer();
            if (scope.getLocal() == element) {
                return "Unused local changes";
            }
            if (scope.getRemote() == element) {
                return "Unused remote changes";
            }
        }
        if (SCOPE_ADAPTER_FACTORY.isFactoryForType(element)) {
            return scope.getText(element);
        }
        if (MODEL_ADAPTER_FACTORY.isFactoryForType(element)) {
            return model.getText(element);
        }
        return basic.getText(element);
    }

    @Override
    public Image getImage(Object element) {
        if (element instanceof SolutionElement) {
            return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD)
                    .createImage();
        }
        if (SCOPE_ADAPTER_FACTORY.isFactoryForType(element)) {
            return scope.getImage(element);
        }
        if (MODEL_ADAPTER_FACTORY.isFactoryForType(element)) {
            return model.getImage(element);
        }
        return basic.getImage(element);
    }

}
