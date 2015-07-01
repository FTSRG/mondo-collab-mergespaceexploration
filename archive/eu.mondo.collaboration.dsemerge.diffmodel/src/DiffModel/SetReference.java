/**
 */
package DiffModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DiffModel.SetReference#getReference <em>Reference</em>}</li>
 *   <li>{@link DiffModel.SetReference#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see DiffModel.DiffModelPackage#getSetReference()
 * @model
 * @generated
 */
public interface SetReference extends Identifiable {
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
	 * @see DiffModel.DiffModelPackage#getSetReference_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link DiffModel.SetReference#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref ID</em>' attribute.
	 * @see #setRefID(String)
	 * @see DiffModel.DiffModelPackage#getSetReference_RefID()
	 * @model
	 * @generated
	 */
	String getRefID();

	/**
	 * Sets the value of the '{@link DiffModel.SetReference#getRefID <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref ID</em>' attribute.
	 * @see #getRefID()
	 * @generated
	 */
	void setRefID(String value);

} // SetReference
