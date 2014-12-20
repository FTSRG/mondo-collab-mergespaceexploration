/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit33;
import wtspecid.WTCFault;
import wtspecid.WTCInput;
import wtspecid.WTCOutput;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit33</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit33Impl#getInput__iResetOutput <em>Input iReset Output</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit33Impl#getOutput__oIsLastError <em>Output oIs Last Error</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit33Impl#getFault__fFault <em>Fault fFault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit33Impl extends wtcImpl implements CtrlUnit33 {
	/**
	 * The cached value of the '{@link #getInput__iResetOutput() <em>Input iReset Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetOutput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetOutput;

	/**
	 * The cached value of the '{@link #getOutput__oIsLastError() <em>Output oIs Last Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oIsLastError()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oIsLastError;

	/**
	 * The cached value of the '{@link #getFault__fFault() <em>Fault fFault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fFault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit33Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit33();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetOutput() {
		if (input__iResetOutput != null && input__iResetOutput.eIsProxy()) {
			InternalEObject oldInput__iResetOutput = (InternalEObject)input__iResetOutput;
			input__iResetOutput = (WTCInput)eResolveProxy(oldInput__iResetOutput);
			if (input__iResetOutput != oldInput__iResetOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT33__INPUT_IRESET_OUTPUT, oldInput__iResetOutput, input__iResetOutput));
			}
		}
		return input__iResetOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetOutput() {
		return input__iResetOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetOutput(WTCInput newInput__iResetOutput) {
		WTCInput oldInput__iResetOutput = input__iResetOutput;
		input__iResetOutput = newInput__iResetOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT33__INPUT_IRESET_OUTPUT, oldInput__iResetOutput, input__iResetOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oIsLastError() {
		if (output__oIsLastError != null && output__oIsLastError.eIsProxy()) {
			InternalEObject oldOutput__oIsLastError = (InternalEObject)output__oIsLastError;
			output__oIsLastError = (WTCOutput)eResolveProxy(oldOutput__oIsLastError);
			if (output__oIsLastError != oldOutput__oIsLastError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR, oldOutput__oIsLastError, output__oIsLastError));
			}
		}
		return output__oIsLastError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oIsLastError() {
		return output__oIsLastError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oIsLastError(WTCOutput newOutput__oIsLastError) {
		WTCOutput oldOutput__oIsLastError = output__oIsLastError;
		output__oIsLastError = newOutput__oIsLastError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR, oldOutput__oIsLastError, output__oIsLastError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fFault() {
		if (fault__fFault != null && fault__fFault.eIsProxy()) {
			InternalEObject oldFault__fFault = (InternalEObject)fault__fFault;
			fault__fFault = (WTCFault)eResolveProxy(oldFault__fFault);
			if (fault__fFault != oldFault__fFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT33__FAULT_FFAULT, oldFault__fFault, fault__fFault));
			}
		}
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fFault() {
		return fault__fFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fFault(WTCFault newFault__fFault) {
		WTCFault oldFault__fFault = fault__fFault;
		fault__fFault = newFault__fFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT33__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT33__INPUT_IRESET_OUTPUT:
				if (resolve) return getInput__iResetOutput();
				return basicGetInput__iResetOutput();
			case WtspecidPackage.CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR:
				if (resolve) return getOutput__oIsLastError();
				return basicGetOutput__oIsLastError();
			case WtspecidPackage.CTRL_UNIT33__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
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
			case WtspecidPackage.CTRL_UNIT33__INPUT_IRESET_OUTPUT:
				setInput__iResetOutput((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR:
				setOutput__oIsLastError((WTCOutput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT33__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
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
			case WtspecidPackage.CTRL_UNIT33__INPUT_IRESET_OUTPUT:
				setInput__iResetOutput((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR:
				setOutput__oIsLastError((WTCOutput)null);
				return;
			case WtspecidPackage.CTRL_UNIT33__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
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
			case WtspecidPackage.CTRL_UNIT33__INPUT_IRESET_OUTPUT:
				return input__iResetOutput != null;
			case WtspecidPackage.CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR:
				return output__oIsLastError != null;
			case WtspecidPackage.CTRL_UNIT33__FAULT_FFAULT:
				return fault__fFault != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit33Impl
