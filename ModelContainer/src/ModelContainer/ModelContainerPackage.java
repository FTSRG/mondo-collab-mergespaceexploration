/**
 */
package ModelContainer;

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
 * @see ModelContainer.ModelContainerFactory
 * @model kind="package"
 * @generated
 */
public interface ModelContainerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ModelContainer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelcontainer/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelContainerPackage eINSTANCE = ModelContainer.impl.ModelContainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link ModelContainer.impl.MainRootImpl <em>Main Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModelContainer.impl.MainRootImpl
	 * @see ModelContainer.impl.ModelContainerPackageImpl#getMainRoot()
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
	 * The feature id for the '<em><b>Delta OB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__DELTA_OB = 1;

	/**
	 * The feature id for the '<em><b>Delta OA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__DELTA_OA = 2;

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
	 * Returns the meta object for class '{@link ModelContainer.MainRoot <em>Main Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Root</em>'.
	 * @see ModelContainer.MainRoot
	 * @generated
	 */
	EClass getMainRoot();

	/**
	 * Returns the meta object for the reference '{@link ModelContainer.MainRoot#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original</em>'.
	 * @see ModelContainer.MainRoot#getOriginal()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_Original();

	/**
	 * Returns the meta object for the reference '{@link ModelContainer.MainRoot#getDeltaOB <em>Delta OB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delta OB</em>'.
	 * @see ModelContainer.MainRoot#getDeltaOB()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_DeltaOB();

	/**
	 * Returns the meta object for the reference '{@link ModelContainer.MainRoot#getDeltaOA <em>Delta OA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delta OA</em>'.
	 * @see ModelContainer.MainRoot#getDeltaOA()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_DeltaOA();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelContainerFactory getModelContainerFactory();

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
		 * The meta object literal for the '{@link ModelContainer.impl.MainRootImpl <em>Main Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModelContainer.impl.MainRootImpl
		 * @see ModelContainer.impl.ModelContainerPackageImpl#getMainRoot()
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
		 * The meta object literal for the '<em><b>Delta OB</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__DELTA_OB = eINSTANCE.getMainRoot_DeltaOB();

		/**
		 * The meta object literal for the '<em><b>Delta OA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__DELTA_OA = eINSTANCE.getMainRoot_DeltaOA();

	}

} //ModelContainerPackage
