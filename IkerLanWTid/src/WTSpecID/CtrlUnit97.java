/**
 */
package WTSpecID;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctrl Unit97</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link WTSpecID.CtrlUnit97#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}</li>
 *   <li>{@link WTSpecID.CtrlUnit97#getOutput__oDontCheckEmergency <em>Output oDont Check Emergency</em>}</li>
 *   <li>{@link WTSpecID.CtrlUnit97#getFault__fSecLoopOff <em>Fault fSec Loop Off</em>}</li>
 * </ul>
 * </p>
 *
 * @see WTSpecID.WTSpecIDPackage#getCtrlUnit97()
 * @model
 * @generated
 */
public interface CtrlUnit97 extends wtc {
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
	 * @see WTSpecID.WTSpecIDPackage#getCtrlUnit97_Input__iSafetyLineGeneralStatus()
	 * @model
	 * @generated
	 */
	WTCInput getInput__iSafetyLineGeneralStatus();

	/**
	 * Sets the value of the '{@link WTSpecID.CtrlUnit97#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input iSafety Line General Status</em>' reference.
	 * @see #getInput__iSafetyLineGeneralStatus()
	 * @generated
	 */
	void setInput__iSafetyLineGeneralStatus(WTCInput value);

	/**
	 * Returns the value of the '<em><b>Output oDont Check Emergency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output oDont Check Emergency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output oDont Check Emergency</em>' reference.
	 * @see #setOutput__oDontCheckEmergency(WTCOutput)
	 * @see WTSpecID.WTSpecIDPackage#getCtrlUnit97_Output__oDontCheckEmergency()
	 * @model
	 * @generated
	 */
	WTCOutput getOutput__oDontCheckEmergency();

	/**
	 * Sets the value of the '{@link WTSpecID.CtrlUnit97#getOutput__oDontCheckEmergency <em>Output oDont Check Emergency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output oDont Check Emergency</em>' reference.
	 * @see #getOutput__oDontCheckEmergency()
	 * @generated
	 */
	void setOutput__oDontCheckEmergency(WTCOutput value);

	/**
	 * Returns the value of the '<em><b>Fault fSec Loop Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault fSec Loop Off</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fault fSec Loop Off</em>' reference.
	 * @see #setFault__fSecLoopOff(WTCFault)
	 * @see WTSpecID.WTSpecIDPackage#getCtrlUnit97_Fault__fSecLoopOff()
	 * @model
	 * @generated
	 */
	WTCFault getFault__fSecLoopOff();

	/**
	 * Sets the value of the '{@link WTSpecID.CtrlUnit97#getFault__fSecLoopOff <em>Fault fSec Loop Off</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fault fSec Loop Off</em>' reference.
	 * @see #getFault__fSecLoopOff()
	 * @generated
	 */
	void setFault__fSecLoopOff(WTCFault value);

} // CtrlUnit97
