/**
 */
package wtspecid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit99</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wtspecid.CtrlUnit99#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}</li>
 *   <li>{@link wtspecid.CtrlUnit99#getOutput__oSafetyLineStartCommand <em>Output oSafety Line Start Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see wtspecid.WtspecidPackage#getCtrlUnit99()
 * @model
 * @generated
 */
public interface CtrlUnit99 extends wtc {
	/**
	 * Returns the value of the '<em><b>Input iSafety Line General Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input iSafety Line General Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input iSafety Line General Status</em>' reference.
	 * @see #setInput__iSafetyLineGeneralStatus(WTCInput)
	 * @see wtspecid.WtspecidPackage#getCtrlUnit99_Input__iSafetyLineGeneralStatus()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iSafetyLineGeneralStatus();

	/**
	 * Sets the value of the '{@link wtspecid.CtrlUnit99#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iSafety Line General Status</em>' reference.
	 * @see #getInput__iSafetyLineGeneralStatus()
	 * @generated
	 */
	void setInput__iSafetyLineGeneralStatus(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Output oSafety Line Start Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oSafety Line Start Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oSafety Line Start Command</em>' reference.
	 * @see #setOutput__oSafetyLineStartCommand(WTCOutput)
	 * @see wtspecid.WtspecidPackage#getCtrlUnit99_Output__oSafetyLineStartCommand()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oSafetyLineStartCommand();

	/**
	 * Sets the value of the '{@link wtspecid.CtrlUnit99#getOutput__oSafetyLineStartCommand <em>Output oSafety Line Start Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oSafety Line Start Command</em>' reference.
	 * @see #getOutput__oSafetyLineStartCommand()
	 * @generated
	 */
	void setOutput__oSafetyLineStartCommand(WTCOutput value);

} // CtrlUnit99
