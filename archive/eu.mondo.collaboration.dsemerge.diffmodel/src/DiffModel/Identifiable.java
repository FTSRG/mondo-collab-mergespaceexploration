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
 *   <li>{@link DiffModel.Identifiable#getID <em>ID</em>}</li>
 *   <li>{@link DiffModel.Identifiable#getTargetID <em>Target ID</em>}</li>
 *   <li>{@link DiffModel.Identifiable#isExecutable <em>Executable</em>}</li>
 *   <li>{@link DiffModel.Identifiable#isEliminated <em>Eliminated</em>}</li>
 * </ul>
 * </p>
 *
 * @see DiffModel.DiffModelPackage#getIdentifiable()
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
	 * @see DiffModel.DiffModelPackage#getIdentifiable_ID()
	 * @model id="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link DiffModel.Identifiable#getID <em>ID</em>}' attribute.
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
	 * @see DiffModel.DiffModelPackage#getIdentifiable_TargetID()
	 * @model
	 * @generated
	 */
	String getTargetID();

	/**
	 * Sets the value of the '{@link DiffModel.Identifiable#getTargetID <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target ID</em>' attribute.
	 * @see #getTargetID()
	 * @generated
	 */
	void setTargetID(String value);

	/**
	 * Returns the value of the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' attribute.
	 * @see #setExecutable(boolean)
	 * @see DiffModel.DiffModelPackage#getIdentifiable_Executable()
	 * @model
	 * @generated
	 */
	boolean isExecutable();

	/**
	 * Sets the value of the '{@link DiffModel.Identifiable#isExecutable <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' attribute.
	 * @see #isExecutable()
	 * @generated
	 */
	void setExecutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eliminated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eliminated</em>' attribute.
	 * @see #setEliminated(boolean)
	 * @see DiffModel.DiffModelPackage#getIdentifiable_Eliminated()
	 * @model
	 * @generated
	 */
	boolean isEliminated();

	/**
	 * Sets the value of the '{@link DiffModel.Identifiable#isEliminated <em>Eliminated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eliminated</em>' attribute.
	 * @see #isEliminated()
	 * @generated
	 */
	void setEliminated(boolean value);

} // Identifiable
