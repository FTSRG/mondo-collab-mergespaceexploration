/**
 */
package wtspecid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wtspecid.SystemOutput#getSysId <em>Sys Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see wtspecid.WtspecidPackage#getSystemOutput()
 * @model
 * @generated
 */
public interface SystemOutput extends WTCOutput {
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
	 * @see wtspecid.WtspecidPackage#getSystemOutput_SysId()
	 * @model
	 * @generated
	 */
	String getSysId();

	/**
	 * Sets the value of the '{@link wtspecid.SystemOutput#getSysId <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys Id</em>' attribute.
	 * @see #getSysId()
	 * @generated
	 */
	void setSysId(String value);

} // SystemOutput
