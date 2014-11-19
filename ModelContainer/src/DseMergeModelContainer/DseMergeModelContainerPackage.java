/**
 */
package DseMergeModelContainer;

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
 * @see DseMergeModelContainer.DseMergeModelContainerFactory
 * @model kind="package"
 * @generated
 */
public interface DseMergeModelContainerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DseMergeModelContainer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dsemerge.modelcontainer/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsemmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DseMergeModelContainerPackage eINSTANCE = DseMergeModelContainer.impl.DseMergeModelContainerPackageImpl.init();

	/**
	 * The meta object id for the '{@link DseMergeModelContainer.impl.MainRootImpl <em>Main Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeModelContainer.impl.MainRootImpl
	 * @see DseMergeModelContainer.impl.DseMergeModelContainerPackageImpl#getMainRoot()
	 * @generated
	 */
	int MAIN_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__ORIGINAL = 0;

	/**
	 * The feature id for the '<em><b>Delta OA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__DELTA_OA = 1;

	/**
	 * The feature id for the '<em><b>Delta OB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_ROOT__DELTA_OB = 2;

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
	 * Returns the meta object for class '{@link DseMergeModelContainer.MainRoot <em>Main Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Root</em>'.
	 * @see DseMergeModelContainer.MainRoot
	 * @generated
	 */
	EClass getMainRoot();

	/**
	 * Returns the meta object for the containment reference '{@link DseMergeModelContainer.MainRoot#getOriginal <em>Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Original</em>'.
	 * @see DseMergeModelContainer.MainRoot#getOriginal()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_Original();

	/**
	 * Returns the meta object for the containment reference '{@link DseMergeModelContainer.MainRoot#getDeltaOA <em>Delta OA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delta OA</em>'.
	 * @see DseMergeModelContainer.MainRoot#getDeltaOA()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_DeltaOA();

	/**
	 * Returns the meta object for the containment reference '{@link DseMergeModelContainer.MainRoot#getDeltaOB <em>Delta OB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delta OB</em>'.
	 * @see DseMergeModelContainer.MainRoot#getDeltaOB()
	 * @see #getMainRoot()
	 * @generated
	 */
	EReference getMainRoot_DeltaOB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DseMergeModelContainerFactory getDseMergeModelContainerFactory();

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
		 * The meta object literal for the '{@link DseMergeModelContainer.impl.MainRootImpl <em>Main Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeModelContainer.impl.MainRootImpl
		 * @see DseMergeModelContainer.impl.DseMergeModelContainerPackageImpl#getMainRoot()
		 * @generated
		 */
		EClass MAIN_ROOT = eINSTANCE.getMainRoot();

		/**
		 * The meta object literal for the '<em><b>Original</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__ORIGINAL = eINSTANCE.getMainRoot_Original();

		/**
		 * The meta object literal for the '<em><b>Delta OA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__DELTA_OA = eINSTANCE.getMainRoot_DeltaOA();

		/**
		 * The meta object literal for the '<em><b>Delta OB</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_ROOT__DELTA_OB = eINSTANCE.getMainRoot_DeltaOB();

	}

} //DseMergeModelContainerPackage
