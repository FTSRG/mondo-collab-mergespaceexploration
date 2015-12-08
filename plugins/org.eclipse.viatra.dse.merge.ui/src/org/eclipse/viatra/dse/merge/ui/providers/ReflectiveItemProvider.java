package org.eclipse.viatra.dse.merge.ui.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

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
            for (EReference ref : eObject.eClass().getEAllReferences()) {
                children.add(new EStructuralFeatureWrapper(ref, getText(eObject.eGet(ref))));
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
            return ((EStructuralFeatureWrapper) object).getFeature().getName() + ": "
                    + ((EStructuralFeatureWrapper) object).getValue();
        }
        if (object instanceof EList<?>) {
            EList<?> list = (EList<?>) object;
            boolean flag = true;
            String ret = "";
            for (Object o : list) {
                if(flag) {
                    flag = false;
                } else {
                    ret += ", ";
                }
                ret = super.getText(o);
            }
            return ret;
        }
        return super.getText(object);
    }

    @Override
    public Object getImage(Object object) {
        if (object instanceof EStructuralFeatureWrapper) {
            return super.getImage(((EStructuralFeatureWrapper) object).getFeature());
        }
        return super.getImage(object);
    }

    public class EStructuralFeatureWrapper {

        private EStructuralFeature attribute;
        private Object value;

        public EStructuralFeatureWrapper(EStructuralFeature attribute, Object value) {
            this.attribute = attribute;
            this.value = value;
        }

        public EStructuralFeature getFeature() {
            return attribute;
        }

        public Object getValue() {
            return value;
        }
    }
}
