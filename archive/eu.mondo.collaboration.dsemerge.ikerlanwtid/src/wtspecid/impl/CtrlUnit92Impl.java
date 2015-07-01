/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit92;
import wtspecid.WTCFault;
import wtspecid.WTCInput;
import wtspecid.WTCParam;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit92</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit92Impl#getInput__iTemp <em>Input iTemp</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit92Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit92Impl#getParameter__pLimitError <em>Parameter pLimit Error</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit92Impl#getParameter__pLimitReset <em>Parameter pLimit Reset</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit92Impl#getFault__fError <em>Fault fError</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit92Impl#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit92Impl extends wtcImpl implements CtrlUnit92 {
	/**
	 * The cached value of the '{@link #getInput__iTemp() <em>Input iTemp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iTemp()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iTemp;

	/**
	 * The cached value of the '{@link #getInput__iDontCheckInput() <em>Input iDont Check Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iDontCheckInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iDontCheckInput;

	/**
	 * The cached value of the '{@link #getParameter__pLimitError() <em>Parameter pLimit Error</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pLimitError()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pLimitError;

	/**
	 * The cached value of the '{@link #getParameter__pLimitReset() <em>Parameter pLimit Reset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pLimitReset()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pLimitReset;

	/**
	 * The cached value of the '{@link #getFault__fError() <em>Fault fError</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fError()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fError;

	/**
	 * The default value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpMode() <em>Bhv Param bp Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpMode()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpMode = BHV_PARAM_BP_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit92Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit92();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iTemp() {
		if (input__iTemp != null && input__iTemp.eIsProxy()) {
			InternalEObject oldInput__iTemp = (InternalEObject)input__iTemp;
			input__iTemp = (WTCInput)eResolveProxy(oldInput__iTemp);
			if (input__iTemp != oldInput__iTemp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT92__INPUT_ITEMP, oldInput__iTemp, input__iTemp));
			}
		}
		return input__iTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iTemp() {
		return input__iTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iTemp(WTCInput newInput__iTemp) {
		WTCInput oldInput__iTemp = input__iTemp;
		input__iTemp = newInput__iTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT92__INPUT_ITEMP, oldInput__iTemp, input__iTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iDontCheckInput() {
		if (input__iDontCheckInput != null && input__iDontCheckInput.eIsProxy()) {
			InternalEObject oldInput__iDontCheckInput = (InternalEObject)input__iDontCheckInput;
			input__iDontCheckInput = (WTCInput)eResolveProxy(oldInput__iDontCheckInput);
			if (input__iDontCheckInput != oldInput__iDontCheckInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
			}
		}
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iDontCheckInput() {
		return input__iDontCheckInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iDontCheckInput(WTCInput newInput__iDontCheckInput) {
		WTCInput oldInput__iDontCheckInput = input__iDontCheckInput;
		input__iDontCheckInput = newInput__iDontCheckInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pLimitError() {
		if (parameter__pLimitError != null && parameter__pLimitError.eIsProxy()) {
			InternalEObject oldParameter__pLimitError = (InternalEObject)parameter__pLimitError;
			parameter__pLimitError = (WTCParam)eResolveProxy(oldParameter__pLimitError);
			if (parameter__pLimitError != oldParameter__pLimitError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_ERROR, oldParameter__pLimitError, parameter__pLimitError));
			}
		}
		return parameter__pLimitError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pLimitError() {
		return parameter__pLimitError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pLimitError(WTCParam newParameter__pLimitError) {
		WTCParam oldParameter__pLimitError = parameter__pLimitError;
		parameter__pLimitError = newParameter__pLimitError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_ERROR, oldParameter__pLimitError, parameter__pLimitError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pLimitReset() {
		if (parameter__pLimitReset != null && parameter__pLimitReset.eIsProxy()) {
			InternalEObject oldParameter__pLimitReset = (InternalEObject)parameter__pLimitReset;
			parameter__pLimitReset = (WTCParam)eResolveProxy(oldParameter__pLimitReset);
			if (parameter__pLimitReset != oldParameter__pLimitReset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_RESET, oldParameter__pLimitReset, parameter__pLimitReset));
			}
		}
		return parameter__pLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pLimitReset() {
		return parameter__pLimitReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pLimitReset(WTCParam newParameter__pLimitReset) {
		WTCParam oldParameter__pLimitReset = parameter__pLimitReset;
		parameter__pLimitReset = newParameter__pLimitReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_RESET, oldParameter__pLimitReset, parameter__pLimitReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fError() {
		if (fault__fError != null && fault__fError.eIsProxy()) {
			InternalEObject oldFault__fError = (InternalEObject)fault__fError;
			fault__fError = (WTCFault)eResolveProxy(oldFault__fError);
			if (fault__fError != oldFault__fError) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT92__FAULT_FERROR, oldFault__fError, fault__fError));
			}
		}
		return fault__fError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fError() {
		return fault__fError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fError(WTCFault newFault__fError) {
		WTCFault oldFault__fError = fault__fError;
		fault__fError = newFault__fError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT92__FAULT_FERROR, oldFault__fError, fault__fError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpMode() {
		return bhvParam__bpMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpMode(String newBhvParam__bpMode) {
		String oldBhvParam__bpMode = bhvParam__bpMode;
		bhvParam__bpMode = newBhvParam__bpMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT92__BHV_PARAM_BP_MODE, oldBhvParam__bpMode, bhvParam__bpMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT92__INPUT_ITEMP:
				if (resolve) return getInput__iTemp();
				return basicGetInput__iTemp();
			case WtspecidPackage.CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_ERROR:
				if (resolve) return getParameter__pLimitError();
				return basicGetParameter__pLimitError();
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_RESET:
				if (resolve) return getParameter__pLimitReset();
				return basicGetParameter__pLimitReset();
			case WtspecidPackage.CTRL_UNIT92__FAULT_FERROR:
				if (resolve) return getFault__fError();
				return basicGetFault__fError();
			case WtspecidPackage.CTRL_UNIT92__BHV_PARAM_BP_MODE:
				return getBhvParam__bpMode();
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
			case WtspecidPackage.CTRL_UNIT92__INPUT_ITEMP:
				setInput__iTemp((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_ERROR:
				setParameter__pLimitError((WTCParam)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_RESET:
				setParameter__pLimitReset((WTCParam)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT92__FAULT_FERROR:
				setFault__fError((WTCFault)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT92__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode((String)newValue);
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
			case WtspecidPackage.CTRL_UNIT92__INPUT_ITEMP:
				setInput__iTemp((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_ERROR:
				setParameter__pLimitError((WTCParam)null);
				return;
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_RESET:
				setParameter__pLimitReset((WTCParam)null);
				return;
			case WtspecidPackage.CTRL_UNIT92__FAULT_FERROR:
				setFault__fError((WTCFault)null);
				return;
			case WtspecidPackage.CTRL_UNIT92__BHV_PARAM_BP_MODE:
				setBhvParam__bpMode(BHV_PARAM_BP_MODE_EDEFAULT);
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
			case WtspecidPackage.CTRL_UNIT92__INPUT_ITEMP:
				return input__iTemp != null;
			case WtspecidPackage.CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_ERROR:
				return parameter__pLimitError != null;
			case WtspecidPackage.CTRL_UNIT92__PARAMETER_PLIMIT_RESET:
				return parameter__pLimitReset != null;
			case WtspecidPackage.CTRL_UNIT92__FAULT_FERROR:
				return fault__fError != null;
			case WtspecidPackage.CTRL_UNIT92__BHV_PARAM_BP_MODE:
				return BHV_PARAM_BP_MODE_EDEFAULT == null ? bhvParam__bpMode != null : !BHV_PARAM_BP_MODE_EDEFAULT.equals(bhvParam__bpMode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BhvParam__bpMode: ");
		result.append(bhvParam__bpMode);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit92Impl
