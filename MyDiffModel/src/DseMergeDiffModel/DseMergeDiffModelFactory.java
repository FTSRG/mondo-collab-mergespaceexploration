/**
 */
package DseMergeDiffModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DseMergeDiffModel.DseMergeDiffModelPackage
 * @generated
 */
public interface DseMergeDiffModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DseMergeDiffModelFactory eINSTANCE = DseMergeDiffModel.impl.DseMergeDiffModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diff Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Container</em>'.
	 * @generated
	 */
	DiffContainer createDiffContainer();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Set Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Attribute</em>'.
	 * @generated
	 */
	SetAttribute createSetAttribute();

	/**
	 * Returns a new object of class '<em>Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Reference</em>'.
	 * @generated
	 */
	SetReference createSetReference();

	/**
	 * Returns a new object of class '<em>Reset Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Attribute</em>'.
	 * @generated
	 */
	ResetAttribute createResetAttribute();

	/**
	 * Returns a new object of class '<em>Reset Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reset Reference</em>'.
	 * @generated
	 */
	ResetReference createResetReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DseMergeDiffModelPackage getDseMergeDiffModelPackage();

} //DseMergeDiffModelFactory
