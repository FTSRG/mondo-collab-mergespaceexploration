/**
 */
package ModelContainer;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ModelContainer.ModelContainerPackage
 * @generated
 */
public interface ModelContainerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelContainerFactory eINSTANCE = ModelContainer.impl.ModelContainerFactoryImpl.init();

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
	ModelContainerPackage getModelContainerPackage();

} //ModelContainerFactory
