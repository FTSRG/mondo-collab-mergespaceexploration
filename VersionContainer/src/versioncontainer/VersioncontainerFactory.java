/**
 */
package versioncontainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see versioncontainer.VersioncontainerPackage
 * @generated
 */
public interface VersioncontainerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VersioncontainerFactory eINSTANCE = versioncontainer.impl.VersioncontainerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Main Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Root</em>'.
	 * @generated
	 */
	MainRoot createMainRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VersioncontainerPackage getVersioncontainerPackage();

} //VersioncontainerFactory
