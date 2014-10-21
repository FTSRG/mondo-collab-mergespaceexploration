/**
 */
package WTSpecID;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpecID.WT#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link WTSpecID.WT#getModel <em>Model</em>}</li>
 *   <li>{@link WTSpecID.WT#getVersion <em>Version</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsSubsystems <em>Its Subsystems</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsInputs <em>Its Inputs</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsOutputs <em>Its Outputs</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsParams <em>Its Params</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsTimers <em>Its Timers</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsFaults <em>Its Faults</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsVariables <em>Its Variables</em>}</li>
 *   <li>{@link WTSpecID.WT#getItsErrorReactions <em>Its Error Reactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpecID.WTSpecIDPackage#getWT()
 * @model
 * @generated
 */
public interface WT extends Identifiable {
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
	 * @see WTSpecID.WTSpecIDPackage#getWT_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link WTSpecID.WT#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see WTSpecID.WTSpecIDPackage#getWT_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link WTSpecID.WT#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see WTSpecID.WTSpecIDPackage#getWT_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link WTSpecID.WT#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.Subsystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Subsystems</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsSubsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subsystem> getItsSubsystems();

	/**
	 * Returns the value of the '<em><b>Its Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Inputs</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemInput> getItsInputs();

	/**
	 * Returns the value of the '<em><b>Its Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemOutput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Outputs</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsOutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemOutput> getItsOutputs();

	/**
	 * Returns the value of the '<em><b>Its Params</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Params</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemParam> getItsParams();

	/**
	 * Returns the value of the '<em><b>Its Timers</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemTimer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Timers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Timers</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsTimers()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemTimer> getItsTimers();

	/**
	 * Returns the value of the '<em><b>Its Faults</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemFault}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Faults</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Faults</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsFaults()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemFault> getItsFaults();

	/**
	 * Returns the value of the '<em><b>Its Variables</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Variables</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemVariable> getItsVariables();

	/**
	 * Returns the value of the '<em><b>Its Error Reactions</b></em>' containment reference list.
	 * The list contents are of type {@link WTSpecID.SystemErrorReaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Its Error Reactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Its Error Reactions</em>' containment reference list.
	 * @see WTSpecID.WTSpecIDPackage#getWT_ItsErrorReactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemErrorReaction> getItsErrorReactions();

} // WT
