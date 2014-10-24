/**
 */
package DiffModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add To List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DiffModel.AddToList#getList <em>List</em>}</li>
 *   <li>{@link DiffModel.AddToList#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see DiffModel.DiffModelPackage#getAddToList()
 * @model
 * @generated
 */
public interface AddToList extends Identifiable {
	/**
	 * Returns the value of the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' attribute.
	 * @see #setList(String)
	 * @see DiffModel.DiffModelPackage#getAddToList_List()
	 * @model
	 * @generated
	 */
	String getList();

	/**
	 * Sets the value of the '{@link DiffModel.AddToList#getList <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' attribute.
	 * @see #getList()
	 * @generated
	 */
	void setList(String value);

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
	 * @see DiffModel.DiffModelPackage#getAddToList_RefID()
	 * @model
	 * @generated
	 */
	String getRefID();

	/**
	 * Sets the value of the '{@link DiffModel.AddToList#getRefID <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref ID</em>' attribute.
	 * @see #getRefID()
	 * @generated
	 */
	void setRefID(String value);

} // AddToList
