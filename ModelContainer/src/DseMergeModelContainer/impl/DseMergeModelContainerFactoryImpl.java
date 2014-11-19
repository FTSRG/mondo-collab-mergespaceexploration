/**
 */
package DseMergeModelContainer.impl;

import DseMergeModelContainer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DseMergeModelContainerFactoryImpl extends EFactoryImpl implements DseMergeModelContainerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DseMergeModelContainerFactory init() {
		try {
			DseMergeModelContainerFactory theDseMergeModelContainerFactory = (DseMergeModelContainerFactory)EPackage.Registry.INSTANCE.getEFactory(DseMergeModelContainerPackage.eNS_URI);
			if (theDseMergeModelContainerFactory != null) {
				return theDseMergeModelContainerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DseMergeModelContainerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseMergeModelContainerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DseMergeModelContainerPackage.MAIN_ROOT: return createMainRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainRoot createMainRoot() {
		MainRootImpl mainRoot = new MainRootImpl();
		return mainRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseMergeModelContainerPackage getDseMergeModelContainerPackage() {
		return (DseMergeModelContainerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DseMergeModelContainerPackage getPackage() {
		return DseMergeModelContainerPackage.eINSTANCE;
	}

} //DseMergeModelContainerFactoryImpl
