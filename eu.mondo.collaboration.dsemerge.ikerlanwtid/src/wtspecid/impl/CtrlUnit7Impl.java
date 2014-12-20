/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit7;
import wtspecid.WTCInput;
import wtspecid.WTCOutput;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit7</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit7Impl#getInput__iAnalogInput <em>Input iAnalog Input</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit7Impl#getOutput__oAnalogCompensated <em>Output oAnalog Compensated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit7Impl extends wtcImpl implements CtrlUnit7 {
	/**
	 * The cached value of the '{@link #getInput__iAnalogInput() <em>Input iAnalog Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAnalogInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAnalogInput;

	/**
	 * The cached value of the '{@link #getOutput__oAnalogCompensated() <em>Output oAnalog Compensated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAnalogCompensated()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAnalogCompensated;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit7Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit7();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAnalogInput() {
		if (input__iAnalogInput != null && input__iAnalogInput.eIsProxy()) {
			InternalEObject oldInput__iAnalogInput = (InternalEObject)input__iAnalogInput;
			input__iAnalogInput = (WTCInput)eResolveProxy(oldInput__iAnalogInput);
			if (input__iAnalogInput != oldInput__iAnalogInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT7__INPUT_IANALOG_INPUT, oldInput__iAnalogInput, input__iAnalogInput));
			}
		}
		return input__iAnalogInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAnalogInput() {
		return input__iAnalogInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAnalogInput(WTCInput newInput__iAnalogInput) {
		WTCInput oldInput__iAnalogInput = input__iAnalogInput;
		input__iAnalogInput = newInput__iAnalogInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT7__INPUT_IANALOG_INPUT, oldInput__iAnalogInput, input__iAnalogInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAnalogCompensated() {
		if (output__oAnalogCompensated != null && output__oAnalogCompensated.eIsProxy()) {
			InternalEObject oldOutput__oAnalogCompensated = (InternalEObject)output__oAnalogCompensated;
			output__oAnalogCompensated = (WTCOutput)eResolveProxy(oldOutput__oAnalogCompensated);
			if (output__oAnalogCompensated != oldOutput__oAnalogCompensated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED, oldOutput__oAnalogCompensated, output__oAnalogCompensated));
			}
		}
		return output__oAnalogCompensated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAnalogCompensated() {
		return output__oAnalogCompensated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAnalogCompensated(WTCOutput newOutput__oAnalogCompensated) {
		WTCOutput oldOutput__oAnalogCompensated = output__oAnalogCompensated;
		output__oAnalogCompensated = newOutput__oAnalogCompensated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED, oldOutput__oAnalogCompensated, output__oAnalogCompensated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT7__INPUT_IANALOG_INPUT:
				if (resolve) return getInput__iAnalogInput();
				return basicGetInput__iAnalogInput();
			case WtspecidPackage.CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED:
				if (resolve) return getOutput__oAnalogCompensated();
				return basicGetOutput__oAnalogCompensated();
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
			case WtspecidPackage.CTRL_UNIT7__INPUT_IANALOG_INPUT:
				setInput__iAnalogInput((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED:
				setOutput__oAnalogCompensated((WTCOutput)newValue);
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
			case WtspecidPackage.CTRL_UNIT7__INPUT_IANALOG_INPUT:
				setInput__iAnalogInput((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED:
				setOutput__oAnalogCompensated((WTCOutput)null);
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
			case WtspecidPackage.CTRL_UNIT7__INPUT_IANALOG_INPUT:
				return input__iAnalogInput != null;
			case WtspecidPackage.CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED:
				return output__oAnalogCompensated != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit7Impl
