package org.eclipse.viatra.dse.merge.ui.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ReflectiveItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;

public class DetailedReflectiveItemProviderAdapterFactory extends ReflectiveItemProviderAdapterFactory {

	
	public DetailedReflectiveItemProviderAdapterFactory() {
		super();
		reflectiveItemProviderAdapter = new DetailedReflectiveItemProvider(this);
	}
	
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, type);
	}
	
	@Override
	public Object adapt(Object object, Object type) {
		if(object instanceof DetailedReflectiveItemProvider.EStructuralFeatureWrapper)
			return reflectiveItemProviderAdapter;
		return super.adapt(object, type);
	}
	
	private class DetailedReflectiveItemProvider extends ReflectiveItemProvider{

		public DetailedReflectiveItemProvider(AdapterFactory adapterFactory) {
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
			if(object instanceof EObject) {
				EObject eObject = (EObject) object;
				for(EAttribute attr : eObject.eClass().getEAllAttributes()) {
					children.add(new EStructuralFeatureWrapper(eObject, attr, eObject.eGet(attr)));
				}				
			}
			return children;
		}
		
		@Override
		public boolean hasChildren(Object object) {
			if(object instanceof EStructuralFeatureWrapper) {
				return false;
			}
			return super.hasChildren(object);
		}
		
		@Override
		public String getText(Object object) {
			if(object instanceof EStructuralFeatureWrapper) {
				return ((EStructuralFeatureWrapper) object).getAttribute().getName() + ": " + ((EStructuralFeatureWrapper) object).getValue();
			}
			return super.getText(object);
		}
		
		@Override
		public Object getImage(Object object) {
			if(object instanceof EStructuralFeatureWrapper) {
				return super.getImage(((EStructuralFeatureWrapper) object).getAttribute());
			}
			return super.getImage(object);
		}
		
		public class EStructuralFeatureWrapper {

			private EObject eObject;
			private EAttribute attribute;
			private Object value;

			public EStructuralFeatureWrapper(EObject eObject, EAttribute attribute,	Object value) {
				this.eObject = eObject;
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
}
