/**
 */
package WTSpecID.impl;

import WTSpecID.CtrlUnit99;
import WTSpecID.WTCInput;
import WTSpecID.WTCOutput;
import WTSpecID.WTSpecIDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit99</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link WTSpecID.impl.CtrlUnit99Impl#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}</li>
 *   <li>{@link WTSpecID.impl.CtrlUnit99Impl#getOutput__oSafetyLineStartCommand <em>Output oSafety Line Start Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit99Impl extends wtcImpl implements CtrlUnit99 {
	/**
	 * The cached value of the '{@link #getInput__iSafetyLineGeneralStatus() <em>Input iSafety Line General Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iSafetyLineGeneralStatus()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iSafetyLineGeneralStatus;

	/**
	 * The cached value of the '{@link #getOutput__oSafetyLineStartCommand() <em>Output oSafety Line Start Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oSafetyLineStartCommand()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oSafetyLineStartCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit99Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WTSpecIDPackage.eINSTANCE.getCtrlUnit99();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iSafetyLineGeneralStatus() {
		if (input__iSafetyLineGeneralStatus != null && input__iSafetyLineGeneralStatus.eIsProxy()) {
			InternalEObject oldInput__iSafetyLineGeneralStatus = (InternalEObject)input__iSafetyLineGeneralStatus;
			input__iSafetyLineGeneralStatus = (WTCInput)eResolveProxy(oldInput__iSafetyLineGeneralStatus);
			if (input__iSafetyLineGeneralStatus != oldInput__iSafetyLineGeneralStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecIDPackage.CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS, oldInput__iSafetyLineGeneralStatus, input__iSafetyLineGeneralStatus));
			}
		}
		return input__iSafetyLineGeneralStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iSafetyLineGeneralStatus() {
		return input__iSafetyLineGeneralStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iSafetyLineGeneralStatus(WTCInput newInput__iSafetyLineGeneralStatus) {
		WTCInput oldInput__iSafetyLineGeneralStatus = input__iSafetyLineGeneralStatus;
		input__iSafetyLineGeneralStatus = newInput__iSafetyLineGeneralStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecIDPackage.CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS, oldInput__iSafetyLineGeneralStatus, input__iSafetyLineGeneralStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oSafetyLineStartCommand() {
		if (output__oSafetyLineStartCommand != null && output__oSafetyLineStartCommand.eIsProxy()) {
			InternalEObject oldOutput__oSafetyLineStartCommand = (InternalEObject)output__oSafetyLineStartCommand;
			output__oSafetyLineStartCommand = (WTCOutput)eResolveProxy(oldOutput__oSafetyLineStartCommand);
			if (output__oSafetyLineStartCommand != oldOutput__oSafetyLineStartCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpecIDPackage.CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND, oldOutput__oSafetyLineStartCommand, output__oSafetyLineStartCommand));
			}
		}
		return output__oSafetyLineStartCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oSafetyLineStartCommand() {
		return output__oSafetyLineStartCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oSafetyLineStartCommand(WTCOutput newOutput__oSafetyLineStartCommand) {
		WTCOutput oldOutput__oSafetyLineStartCommand = output__oSafetyLineStartCommand;
		output__oSafetyLineStartCommand = newOutput__oSafetyLineStartCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WTSpecIDPackage.CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND, oldOutput__oSafetyLineStartCommand, output__oSafetyLineStartCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WTSpecIDPackage.CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				if (resolve) return getInput__iSafetyLineGeneralStatus();
				return basicGetInput__iSafetyLineGeneralStatus();
			case WTSpecIDPackage.CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND:
				if (resolve) return getOutput__oSafetyLineStartCommand();
				return basicGetOutput__oSafetyLineStartCommand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WTSpecIDPackage.CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				setInput__iSafetyLineGeneralStatus((WTCInput)newValue);
				return;
			case WTSpecIDPackage.CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND:
				setOutput__oSafetyLineStartCommand((WTCOutput)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WTSpecIDPackage.CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				setInput__iSafetyLineGeneralStatus((WTCInput)null);
				return;
			case WTSpecIDPackage.CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND:
				setOutput__oSafetyLineStartCommand((WTCOutput)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WTSpecIDPackage.CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS:
				return input__iSafetyLineGeneralStatus != null;
			case WTSpecIDPackage.CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND:
				return output__oSafetyLineStartCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit99Impl
