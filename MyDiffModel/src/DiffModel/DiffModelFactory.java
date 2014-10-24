/**
 */
package DiffModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DiffModel.DiffModelPackage
 * @generated
 */
public interface DiffModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffModelFactory eINSTANCE = DiffModel.impl.DiffModelFactoryImpl.init();

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
	 * Returns a new object of class '<em>Add To List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add To List</em>'.
	 * @generated
	 */
	AddToList createAddToList();

	/**
	 * Returns a new object of class '<em>Remove From List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove From List</em>'.
	 * @generated
	 */
	RemoveFromList createRemoveFromList();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DiffModelPackage getDiffModelPackage();

} //DiffModelFactory
