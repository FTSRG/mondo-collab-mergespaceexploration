/**
 */
package wtspecid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wtspecid.Subsystem#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link wtspecid.Subsystem#getDescription <em>Description</em>}</li>
 *   <li>{@link wtspecid.Subsystem#getItsWTCs <em>Its WT Cs</em>}</li>
 *   <li>{@link wtspecid.Subsystem#getItsSubsystems <em>Its Subsystems</em>}</li>
 * </ul>
 * </p>
 *
 * @see wtspecid.WtspecidPackage#getSubsystem()
 * @model
 * @generated
 */
public interface Subsystem extends IdentifiableWTElement {
	/**
	 * Returns the value of the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sys Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sys Id</em>' attribute.
	 * @see #setSysId(String)
	 * @see wtspecid.WtspecidPackage#getSubsystem_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link wtspecid.Subsystem#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wtspecid.WtspecidPackage#getSubsystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wtspecid.Subsystem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Its WT Cs</b></em>' containment reference list.
	 * The list contents are of type {@link wtspecid.wtc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its WT Cs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its WT Cs</em>' containment reference list.
	 * @see wtspecid.WtspecidPackage#getSubsystem_ItsWTCs()
	 * @model containment="true"
	 * @generated
	 */
	EList<wtc> getItsWTCs();

	/**
	 * Returns the value of the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link wtspecid.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Subsystems</em>' containment reference list.
	 * @see wtspecid.WtspecidPackage#getSubsystem_ItsSubsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subsystem> getItsSubsystems();

} // Subsystem
