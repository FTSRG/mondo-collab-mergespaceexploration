/**
 */
package ModelContainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ModelContainer.MainRoot#getOriginal <em>Original</em>}</li>
 *   <li>{@link ModelContainer.MainRoot#getDeltaOB <em>Delta OB</em>}</li>
 *   <li>{@link ModelContainer.MainRoot#getDeltaOA <em>Delta OA</em>}</li>
 * </ul>
 * </p>
 *
 * @see ModelContainer.ModelContainerPackage#getMainRoot()
 * @model
 * @generated
 */
public interface MainRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' reference.
	 * @see #setOriginal(EObject)
	 * @see ModelContainer.ModelContainerPackage#getMainRoot_Original()
	 * @model
	 * @generated
	 */
	EObject getOriginal();

	/**
	 * Sets the value of the '{@link ModelContainer.MainRoot#getOriginal <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(EObject value);

	/**
	 * Returns the value of the '<em><b>Delta OB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta OB</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta OB</em>' reference.
	 * @see #setDeltaOB(EObject)
	 * @see ModelContainer.ModelContainerPackage#getMainRoot_DeltaOB()
	 * @model
	 * @generated
	 */
	EObject getDeltaOB();

	/**
	 * Sets the value of the '{@link ModelContainer.MainRoot#getDeltaOB <em>Delta OB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta OB</em>' reference.
	 * @see #getDeltaOB()
	 * @generated
	 */
	void setDeltaOB(EObject value);

	/**
	 * Returns the value of the '<em><b>Delta OA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta OA</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta OA</em>' reference.
	 * @see #setDeltaOA(EObject)
	 * @see ModelContainer.ModelContainerPackage#getMainRoot_DeltaOA()
	 * @model
	 * @generated
	 */
	EObject getDeltaOA();

	/**
	 * Sets the value of the '{@link ModelContainer.MainRoot#getDeltaOA <em>Delta OA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta OA</em>' reference.
	 * @see #getDeltaOA()
	 * @generated
	 */
	void setDeltaOA(EObject value);

} // MainRoot
