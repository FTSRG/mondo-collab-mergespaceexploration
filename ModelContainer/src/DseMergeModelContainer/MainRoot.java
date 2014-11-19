/**
 */
package DseMergeModelContainer;

import DseMergeDiffModel.DiffContainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DseMergeModelContainer.MainRoot#getOriginal <em>Original</em>}</li>
 *   <li>{@link DseMergeModelContainer.MainRoot#getDeltaOA <em>Delta OA</em>}</li>
 *   <li>{@link DseMergeModelContainer.MainRoot#getDeltaOB <em>Delta OB</em>}</li>
 * </ul>
 * </p>
 *
 * @see DseMergeModelContainer.DseMergeModelContainerPackage#getMainRoot()
 * @model
 * @generated
 */
public interface MainRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' containment reference.
	 * @see #setOriginal(EObject)
	 * @see DseMergeModelContainer.DseMergeModelContainerPackage#getMainRoot_Original()
	 * @model containment="true"
	 * @generated
	 */
	EObject getOriginal();

	/**
	 * Sets the value of the '{@link DseMergeModelContainer.MainRoot#getOriginal <em>Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' containment reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(EObject value);

	/**
	 * Returns the value of the '<em><b>Delta OA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta OA</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta OA</em>' containment reference.
	 * @see #setDeltaOA(DiffContainer)
	 * @see DseMergeModelContainer.DseMergeModelContainerPackage#getMainRoot_DeltaOA()
	 * @model containment="true"
	 * @generated
	 */
	DiffContainer getDeltaOA();

	/**
	 * Sets the value of the '{@link DseMergeModelContainer.MainRoot#getDeltaOA <em>Delta OA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta OA</em>' containment reference.
	 * @see #getDeltaOA()
	 * @generated
	 */
	void setDeltaOA(DiffContainer value);

	/**
	 * Returns the value of the '<em><b>Delta OB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta OB</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta OB</em>' containment reference.
	 * @see #setDeltaOB(DiffContainer)
	 * @see DseMergeModelContainer.DseMergeModelContainerPackage#getMainRoot_DeltaOB()
	 * @model containment="true"
	 * @generated
	 */
	DiffContainer getDeltaOB();

	/**
	 * Sets the value of the '{@link DseMergeModelContainer.MainRoot#getDeltaOB <em>Delta OB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta OB</em>' containment reference.
	 * @see #getDeltaOB()
	 * @generated
	 */
	void setDeltaOB(DiffContainer value);

} // MainRoot
