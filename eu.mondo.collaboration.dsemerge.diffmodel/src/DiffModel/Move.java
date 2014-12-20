/**
 */
package DiffModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DiffModel.Move#getContainerTargetID <em>Container Target ID</em>}</li>
 *   <li>{@link DiffModel.Move#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see DiffModel.DiffModelPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Container Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Target ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Target ID</em>' attribute.
	 * @see #setContainerTargetID(String)
	 * @see DiffModel.DiffModelPackage#getMove_ContainerTargetID()
	 * @model
	 * @generated
	 */
	String getContainerTargetID();

	/**
	 * Sets the value of the '{@link DiffModel.Move#getContainerTargetID <em>Container Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Target ID</em>' attribute.
	 * @see #getContainerTargetID()
	 * @generated
	 */
	void setContainerTargetID(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see DiffModel.DiffModelPackage#getMove_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link DiffModel.Move#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // Move
