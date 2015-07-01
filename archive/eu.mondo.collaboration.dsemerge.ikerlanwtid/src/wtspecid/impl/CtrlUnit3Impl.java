/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit3;
import wtspecid.WTCInput;
import wtspecid.WTCOutput;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit3Impl#getInput__iAccessStateNC2 <em>Input iAccess State NC2</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit3Impl#getInput__iAccessStateTC <em>Input iAccess State TC</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit3Impl#getOutput__oAccessState <em>Output oAccess State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit3Impl extends wtcImpl implements CtrlUnit3 {
	/**
	 * The cached value of the '{@link #getInput__iAccessStateNC2() <em>Input iAccess State NC2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAccessStateNC2()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAccessStateNC2;

	/**
	 * The cached value of the '{@link #getInput__iAccessStateTC() <em>Input iAccess State TC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iAccessStateTC()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iAccessStateTC;

	/**
	 * The cached value of the '{@link #getOutput__oAccessState() <em>Output oAccess State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oAccessState()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oAccessState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAccessStateNC2() {
		if (input__iAccessStateNC2 != null && input__iAccessStateNC2.eIsProxy()) {
			InternalEObject oldInput__iAccessStateNC2 = (InternalEObject)input__iAccessStateNC2;
			input__iAccessStateNC2 = (WTCInput)eResolveProxy(oldInput__iAccessStateNC2);
			if (input__iAccessStateNC2 != oldInput__iAccessStateNC2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_NC2, oldInput__iAccessStateNC2, input__iAccessStateNC2));
			}
		}
		return input__iAccessStateNC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAccessStateNC2() {
		return input__iAccessStateNC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAccessStateNC2(WTCInput newInput__iAccessStateNC2) {
		WTCInput oldInput__iAccessStateNC2 = input__iAccessStateNC2;
		input__iAccessStateNC2 = newInput__iAccessStateNC2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_NC2, oldInput__iAccessStateNC2, input__iAccessStateNC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iAccessStateTC() {
		if (input__iAccessStateTC != null && input__iAccessStateTC.eIsProxy()) {
			InternalEObject oldInput__iAccessStateTC = (InternalEObject)input__iAccessStateTC;
			input__iAccessStateTC = (WTCInput)eResolveProxy(oldInput__iAccessStateTC);
			if (input__iAccessStateTC != oldInput__iAccessStateTC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_TC, oldInput__iAccessStateTC, input__iAccessStateTC));
			}
		}
		return input__iAccessStateTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iAccessStateTC() {
		return input__iAccessStateTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iAccessStateTC(WTCInput newInput__iAccessStateTC) {
		WTCInput oldInput__iAccessStateTC = input__iAccessStateTC;
		input__iAccessStateTC = newInput__iAccessStateTC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_TC, oldInput__iAccessStateTC, input__iAccessStateTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oAccessState() {
		if (output__oAccessState != null && output__oAccessState.eIsProxy()) {
			InternalEObject oldOutput__oAccessState = (InternalEObject)output__oAccessState;
			output__oAccessState = (WTCOutput)eResolveProxy(oldOutput__oAccessState);
			if (output__oAccessState != oldOutput__oAccessState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT3__OUTPUT_OACCESS_STATE, oldOutput__oAccessState, output__oAccessState));
			}
		}
		return output__oAccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oAccessState() {
		return output__oAccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oAccessState(WTCOutput newOutput__oAccessState) {
		WTCOutput oldOutput__oAccessState = output__oAccessState;
		output__oAccessState = newOutput__oAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT3__OUTPUT_OACCESS_STATE, oldOutput__oAccessState, output__oAccessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_NC2:
				if (resolve) return getInput__iAccessStateNC2();
				return basicGetInput__iAccessStateNC2();
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_TC:
				if (resolve) return getInput__iAccessStateTC();
				return basicGetInput__iAccessStateTC();
			case WtspecidPackage.CTRL_UNIT3__OUTPUT_OACCESS_STATE:
				if (resolve) return getOutput__oAccessState();
				return basicGetOutput__oAccessState();
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
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_NC2:
				setInput__iAccessStateNC2((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_TC:
				setInput__iAccessStateTC((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT3__OUTPUT_OACCESS_STATE:
				setOutput__oAccessState((WTCOutput)newValue);
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
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_NC2:
				setInput__iAccessStateNC2((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_TC:
				setInput__iAccessStateTC((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT3__OUTPUT_OACCESS_STATE:
				setOutput__oAccessState((WTCOutput)null);
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
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_NC2:
				return input__iAccessStateNC2 != null;
			case WtspecidPackage.CTRL_UNIT3__INPUT_IACCESS_STATE_TC:
				return input__iAccessStateTC != null;
			case WtspecidPackage.CTRL_UNIT3__OUTPUT_OACCESS_STATE:
				return output__oAccessState != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit3Impl
