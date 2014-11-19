/**
 */
package DseMergeDiffModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DseMergeDiffModel.Create#getType <em>Type</em>}</li>
 *   <li>{@link DseMergeDiffModel.Create#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link DseMergeDiffModel.Create#getValues <em>Values</em>}</li>
 *   <li>{@link DseMergeDiffModel.Create#getReference <em>Reference</em>}</li>
 *   <li>{@link DseMergeDiffModel.Create#getContainerTargetID <em>Container Target ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getCreate_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link DseMergeDiffModel.Create#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getCreate_Attributes()
	 * @model
	 * @generated
	 */
	EList<String> getAttributes();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getCreate_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

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
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getCreate_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link DseMergeDiffModel.Create#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

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
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getCreate_ContainerTargetID()
	 * @model
	 * @generated
	 */
	String getContainerTargetID();

	/**
	 * Sets the value of the '{@link DseMergeDiffModel.Create#getContainerTargetID <em>Container Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Target ID</em>' attribute.
	 * @see #getContainerTargetID()
	 * @generated
	 */
	void setContainerTargetID(String value);

} // Create
