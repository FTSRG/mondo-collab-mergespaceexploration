/**
 */
package WTSpecID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpecID.SystemVariable#getSysId <em>Sys Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpecID.WTSpecIDPackage#getSystemVariable()
 * @model
 * @generated
 */
public interface SystemVariable extends WTCInput, WTCOutput {
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
	 * @see WTSpecID.WTSpecIDPackage#getSystemVariable_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link WTSpecID.SystemVariable#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

} // SystemVariable
