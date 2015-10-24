package org.eclipse.viatra.dse.merge.ui.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

/**
 * 
 * This adapter factory provides the modified {@link ReflectiveItemProvider} when an
 * {@link ReflectiveItemProvider.EStructuralFeatureWrapper} has to be adapted
 * 
 * @author Csaba Debreceni
 *
 */
public class ReflectiveItemProviderAdapterFactory
        extends org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory {

    public ReflectiveItemProviderAdapterFactory() {
        super();
        reflectiveItemProviderAdapter = new ReflectiveItemProvider(this);
    }

    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, type);
    }

    @Override
    public Object adapt(Object object, Object type) {
        if (object instanceof ReflectiveItemProvider.EStructuralFeatureWrapper)
            return reflectiveItemProviderAdapter;
        return super.adapt(object, type);
    }
}
