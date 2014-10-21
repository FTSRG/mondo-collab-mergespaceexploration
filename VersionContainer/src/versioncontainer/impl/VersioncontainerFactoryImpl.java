/**
 */
package versioncontainer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import versioncontainer.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersioncontainerFactoryImpl extends EFactoryImpl implements VersioncontainerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VersioncontainerFactory init() {
		try {
			VersioncontainerFactory theVersioncontainerFactory = (VersioncontainerFactory)EPackage.Registry.INSTANCE.getEFactory(VersioncontainerPackage.eNS_URI);
			if (theVersioncontainerFactory != null) {
				return theVersioncontainerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VersioncontainerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersioncontainerFactoryImpl() {
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
			case VersioncontainerPackage.MAIN_ROOT: return createMainRoot();
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
	public VersioncontainerPackage getVersioncontainerPackage() {
		return (VersioncontainerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VersioncontainerPackage getPackage() {
		return VersioncontainerPackage.eINSTANCE;
	}

} //VersioncontainerFactoryImpl
