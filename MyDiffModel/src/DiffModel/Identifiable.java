/**
 */
package DiffModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DiffModel.Identifiable#getId <em>Id</em>}</li>
 *   <li>{@link DiffModel.Identifiable#getTargetId <em>Target Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see DiffModel.DiffModelPackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see DiffModel.DiffModelPackage#getIdentifiable_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link DiffModel.Identifiable#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see DiffModel.DiffModelPackage#getIdentifiable_TargetId()
	 * @model
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link DiffModel.Identifiable#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

} // Identifiable
