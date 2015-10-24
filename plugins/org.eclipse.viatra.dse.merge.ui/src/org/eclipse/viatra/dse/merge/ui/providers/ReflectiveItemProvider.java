package org.eclipse.viatra.dse.merge.ui.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * This item provider adds custom {@link EStructuralFeatureWrapper} children under an {@link EObject} instead of its
 * containments.
 * 
 * @author Csaba Debreceni
 *
 */
public class ReflectiveItemProvider extends org.eclipse.emf.edit.provider.ReflectiveItemProvider {

    public ReflectiveItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public Collection<?> getElements(Object object) {
        return super.getElements(object);
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<?> getChildren(Object object) {
        Collection<Object> children = (Collection<Object>) super.getChildren(object);
        if (object instanceof EObject) {
            EObject eObject = (EObject) object;
            for (EAttribute attr : eObject.eClass().getEAllAttributes()) {
                children.add(new EStructuralFeatureWrapper(attr, eObject.eGet(attr)));
            }
        }
        return children;
    }

    @Override
    public boolean hasChildren(Object object) {
        if (object instanceof EStructuralFeatureWrapper) {
            return false;
        }
        return super.hasChildren(object);
    }

    @Override
    public String getText(Object object) {
        if (object instanceof EStructuralFeatureWrapper) {
            return ((EStructuralFeatureWrapper) object).getAttribute().getName() + ": "
                    + ((EStructuralFeatureWrapper) object).getValue();
        }
        return super.getText(object);
    }

    @Override
    public Object getImage(Object object) {
        if (object instanceof EStructuralFeatureWrapper) {
            return super.getImage(((EStructuralFeatureWrapper) object).getAttribute());
        }
        return super.getImage(object);
    }

    public class EStructuralFeatureWrapper {

        private EAttribute attribute;
        private Object value;

        public EStructuralFeatureWrapper(EAttribute attribute, Object value) {
            this.attribute = attribute;
            this.value = value;
        }

        public EAttribute getAttribute() {
            return attribute;
        }

        public Object getValue() {
            return value;
        }
    }
}
