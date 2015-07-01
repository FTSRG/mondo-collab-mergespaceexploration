/**
 */
package wtspecid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>wtc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wtspecid.wtc#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link wtspecid.wtc#getDescription <em>Description</em>}</li>
 *   <li>{@link wtspecid.wtc#getCycle <em>Cycle</em>}</li>
 *   <li>{@link wtspecid.wtc#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see wtspecid.WtspecidPackage#getwtc()
 * @model abstract="true"
 * @generated
 */
public interface wtc extends IdentifiableWTElement {
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
	 * @see wtspecid.WtspecidPackage#getwtc_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link wtspecid.wtc#getSysId <em>Sys Id</em>}' attribute.
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
	 * @see wtspecid.WtspecidPackage#getwtc_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wtspecid.wtc#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle</em>' attribute.
	 * @see #setCycle(short)
	 * @see wtspecid.WtspecidPackage#getwtc_Cycle()
	 * @model
	 * @generated
	 */
	short getCycle();

	/**
	 * Sets the value of the '{@link wtspecid.wtc#getCycle <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle</em>' attribute.
	 * @see #getCycle()
	 * @generated
	 */
	void setCycle(short value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(short)
	 * @see wtspecid.WtspecidPackage#getwtc_Priority()
	 * @model
	 * @generated
	 */
	short getPriority();

	/**
	 * Sets the value of the '{@link wtspecid.wtc#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(short value);

} // wtc
