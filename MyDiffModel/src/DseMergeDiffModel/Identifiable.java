/**
 */
package DseMergeDiffModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DseMergeDiffModel.Identifiable#getID <em>ID</em>}</li>
 *   <li>{@link DseMergeDiffModel.Identifiable#getTargetID <em>Target ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getIdentifiable_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link DseMergeDiffModel.Identifiable#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target ID</em>' attribute.
	 * @see #setTargetID(String)
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getIdentifiable_TargetID()
	 * @model
	 * @generated
	 */
	String getTargetID();

	/**
	 * Sets the value of the '{@link DseMergeDiffModel.Identifiable#getTargetID <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ID</em>' attribute.
	 * @see #getTargetID()
	 * @generated
	 */
	void setTargetID(String value);

} // Identifiable
