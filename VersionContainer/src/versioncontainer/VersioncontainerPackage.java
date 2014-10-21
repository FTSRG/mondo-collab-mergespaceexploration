/**
 */
package versioncontainer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see versioncontainer.VersioncontainerFactory
 * @model kind="package"
 * @generated
 */
public interface VersioncontainerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "versioncontainer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://versioncontainer/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VersioncontainerPackage eINSTANCE = versioncontainer.impl.VersioncontainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link versioncontainer.impl.MainRootImpl <em>Main Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see versioncontainer.impl.MainRootImpl
	 * @see versioncontainer.impl.VersioncontainerPackageImpl#getMainRoot()
	 * @generated
	 */
	int MAIN_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__ORIGINAL = 0;

	/**
	 * The feature id for the '<em><b>Local</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__LOCAL = 1;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__REMOTE = 2;

	/**
	 * The number of structural features of the '<em>Main Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Main Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link versioncontainer.MainRoot <em>Main Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Root</em>'.
	 * @see versioncontainer.MainRoot
	 * @generated
	 */
	EClass getMainRoot();

	/**
	 * Returns the meta object for the reference '{@link versioncontainer.MainRoot#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see versioncontainer.MainRoot#getOriginal()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_Original();

	/**
	 * Returns the meta object for the reference '{@link versioncontainer.MainRoot#getLocal <em>Local</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Local</em>'.
	 * @see versioncontainer.MainRoot#getLocal()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_Local();

	/**
	 * Returns the meta object for the reference '{@link versioncontainer.MainRoot#getRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Remote</em>'.
	 * @see versioncontainer.MainRoot#getRemote()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_Remote();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VersioncontainerFactory getVersioncontainerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link versioncontainer.impl.MainRootImpl <em>Main Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see versioncontainer.impl.MainRootImpl
		 * @see versioncontainer.impl.VersioncontainerPackageImpl#getMainRoot()
		 * @generated
		 */
		EClass MAIN_ROOT = eINSTANCE.getMainRoot();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__ORIGINAL = eINSTANCE.getMainRoot_Original();

		/**
		 * The meta object literal for the '<em><b>Local</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__LOCAL = eINSTANCE.getMainRoot_Local();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__REMOTE = eINSTANCE.getMainRoot_Remote();

	}

} //VersioncontainerPackage
