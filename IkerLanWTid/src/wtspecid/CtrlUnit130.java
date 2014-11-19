/**
 */
package wtspecid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit130</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wtspecid.CtrlUnit130#getOutput__oYawBrakeHighPressureCmd <em>Output oYaw Brake High Pressure Cmd</em>}</li>
 *   <li>{@link wtspecid.CtrlUnit130#getFault__fOverpressure <em>Fault fOverpressure</em>}</li>
 * </ul>
 * </p>
 *
 * @see wtspecid.WtspecidPackage#getCtrlUnit130()
 * @model
 * @generated
 */
public interface CtrlUnit130 extends wtc {
	/**
	 * Returns the value of the '<em><b>Output oYaw Brake High Pressure Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oYaw Brake High Pressure Cmd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oYaw Brake High Pressure Cmd</em>' reference.
	 * @see #setOutput__oYawBrakeHighPressureCmd(WTCOutput)
	 * @see wtspecid.WtspecidPackage#getCtrlUnit130_Output__oYawBrakeHighPressureCmd()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oYawBrakeHighPressureCmd();

	/**
	 * Sets the value of the '{@link wtspecid.CtrlUnit130#getOutput__oYawBrakeHighPressureCmd <em>Output oYaw Brake High Pressure Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oYaw Brake High Pressure Cmd</em>' reference.
	 * @see #getOutput__oYawBrakeHighPressureCmd()
	 * @generated
	 */
	void setOutput__oYawBrakeHighPressureCmd(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Fault fOverpressure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fOverpressure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fOverpressure</em>' reference.
	 * @see #setFault__fOverpressure(WTCFault)
	 * @see wtspecid.WtspecidPackage#getCtrlUnit130_Fault__fOverpressure()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fOverpressure();

	/**
	 * Sets the value of the '{@link wtspecid.CtrlUnit130#getFault__fOverpressure <em>Fault fOverpressure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fOverpressure</em>' reference.
	 * @see #getFault__fOverpressure()
	 * @generated
	 */
	void setFault__fOverpressure(WTCFault value);

} // CtrlUnit130
