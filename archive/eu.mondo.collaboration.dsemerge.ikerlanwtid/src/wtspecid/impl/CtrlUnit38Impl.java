/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit38;
import wtspecid.WTCFault;
import wtspecid.WTCInput;
import wtspecid.WTCParam;
import wtspecid.WTCTimer;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit38</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit38Impl#getInput__iInput <em>Input iInput</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit38Impl#getInput__iDontCheckInput <em>Input iDont Check Input</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit38Impl#getParameter__pDelay <em>Parameter pDelay</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit38Impl#getFault__fFault <em>Fault fFault</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit38Impl#getTimer__tDelay <em>Timer tDelay</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit38Impl#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit38Impl extends wtcImpl implements CtrlUnit38 {
	/**
	 * The cached value of the '{@link #getInput__iInput() <em>Input iInput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iInput()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iInput;

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
	 * The cached value of the '{@link #getParameter__pDelay() <em>Parameter pDelay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDelay;

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
	 * The cached value of the '{@link #getTimer__tDelay() <em>Timer tDelay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer__tDelay()
	 * @generated
	 * @ordered
	 */
	protected WTCTimer timer__tDelay;

	/**
	 * The default value of the '{@link #getBhvParam__bpLogicType() <em>Bhv Param bp Logic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLogicType()
	 * @generated
	 * @ordered
	 */
	protected static final String BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBhvParam__bpLogicType() <em>Bhv Param bp Logic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBhvParam__bpLogicType()
	 * @generated
	 * @ordered
	 */
	protected String bhvParam__bpLogicType = BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit38Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit38();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iInput() {
		if (input__iInput != null && input__iInput.eIsProxy()) {
			InternalEObject oldInput__iInput = (InternalEObject)input__iInput;
			input__iInput = (WTCInput)eResolveProxy(oldInput__iInput);
			if (input__iInput != oldInput__iInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT38__INPUT_IINPUT, oldInput__iInput, input__iInput));
			}
		}
		return input__iInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iInput() {
		return input__iInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iInput(WTCInput newInput__iInput) {
		WTCInput oldInput__iInput = input__iInput;
		input__iInput = newInput__iInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT38__INPUT_IINPUT, oldInput__iInput, input__iInput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT, oldInput__iDontCheckInput, input__iDontCheckInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDelay() {
		if (parameter__pDelay != null && parameter__pDelay.eIsProxy()) {
			InternalEObject oldParameter__pDelay = (InternalEObject)parameter__pDelay;
			parameter__pDelay = (WTCParam)eResolveProxy(oldParameter__pDelay);
			if (parameter__pDelay != oldParameter__pDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT38__PARAMETER_PDELAY, oldParameter__pDelay, parameter__pDelay));
			}
		}
		return parameter__pDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDelay() {
		return parameter__pDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDelay(WTCParam newParameter__pDelay) {
		WTCParam oldParameter__pDelay = parameter__pDelay;
		parameter__pDelay = newParameter__pDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT38__PARAMETER_PDELAY, oldParameter__pDelay, parameter__pDelay));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT38__FAULT_FFAULT, oldFault__fFault, fault__fFault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT38__FAULT_FFAULT, oldFault__fFault, fault__fFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer getTimer__tDelay() {
		if (timer__tDelay != null && timer__tDelay.eIsProxy()) {
			InternalEObject oldTimer__tDelay = (InternalEObject)timer__tDelay;
			timer__tDelay = (WTCTimer)eResolveProxy(oldTimer__tDelay);
			if (timer__tDelay != oldTimer__tDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT38__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
			}
		}
		return timer__tDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCTimer basicGetTimer__tDelay() {
		return timer__tDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer__tDelay(WTCTimer newTimer__tDelay) {
		WTCTimer oldTimer__tDelay = timer__tDelay;
		timer__tDelay = newTimer__tDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT38__TIMER_TDELAY, oldTimer__tDelay, timer__tDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBhvParam__bpLogicType() {
		return bhvParam__bpLogicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBhvParam__bpLogicType(String newBhvParam__bpLogicType) {
		String oldBhvParam__bpLogicType = bhvParam__bpLogicType;
		bhvParam__bpLogicType = newBhvParam__bpLogicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT38__BHV_PARAM_BP_LOGIC_TYPE, oldBhvParam__bpLogicType, bhvParam__bpLogicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT38__INPUT_IINPUT:
				if (resolve) return getInput__iInput();
				return basicGetInput__iInput();
			case WtspecidPackage.CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT:
				if (resolve) return getInput__iDontCheckInput();
				return basicGetInput__iDontCheckInput();
			case WtspecidPackage.CTRL_UNIT38__PARAMETER_PDELAY:
				if (resolve) return getParameter__pDelay();
				return basicGetParameter__pDelay();
			case WtspecidPackage.CTRL_UNIT38__FAULT_FFAULT:
				if (resolve) return getFault__fFault();
				return basicGetFault__fFault();
			case WtspecidPackage.CTRL_UNIT38__TIMER_TDELAY:
				if (resolve) return getTimer__tDelay();
				return basicGetTimer__tDelay();
			case WtspecidPackage.CTRL_UNIT38__BHV_PARAM_BP_LOGIC_TYPE:
				return getBhvParam__bpLogicType();
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
			case WtspecidPackage.CTRL_UNIT38__INPUT_IINPUT:
				setInput__iInput((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT38__PARAMETER_PDELAY:
				setParameter__pDelay((WTCParam)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT38__FAULT_FFAULT:
				setFault__fFault((WTCFault)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT38__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT38__BHV_PARAM_BP_LOGIC_TYPE:
				setBhvParam__bpLogicType((String)newValue);
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
			case WtspecidPackage.CTRL_UNIT38__INPUT_IINPUT:
				setInput__iInput((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT:
				setInput__iDontCheckInput((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT38__PARAMETER_PDELAY:
				setParameter__pDelay((WTCParam)null);
				return;
			case WtspecidPackage.CTRL_UNIT38__FAULT_FFAULT:
				setFault__fFault((WTCFault)null);
				return;
			case WtspecidPackage.CTRL_UNIT38__TIMER_TDELAY:
				setTimer__tDelay((WTCTimer)null);
				return;
			case WtspecidPackage.CTRL_UNIT38__BHV_PARAM_BP_LOGIC_TYPE:
				setBhvParam__bpLogicType(BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT);
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
			case WtspecidPackage.CTRL_UNIT38__INPUT_IINPUT:
				return input__iInput != null;
			case WtspecidPackage.CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT:
				return input__iDontCheckInput != null;
			case WtspecidPackage.CTRL_UNIT38__PARAMETER_PDELAY:
				return parameter__pDelay != null;
			case WtspecidPackage.CTRL_UNIT38__FAULT_FFAULT:
				return fault__fFault != null;
			case WtspecidPackage.CTRL_UNIT38__TIMER_TDELAY:
				return timer__tDelay != null;
			case WtspecidPackage.CTRL_UNIT38__BHV_PARAM_BP_LOGIC_TYPE:
				return BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT == null ? bhvParam__bpLogicType != null : !BHV_PARAM_BP_LOGIC_TYPE_EDEFAULT.equals(bhvParam__bpLogicType);
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
		result.append(" (BhvParam__bpLogicType: ");
		result.append(bhvParam__bpLogicType);
		result.append(')');
		return result.toString();
	}

} //CtrlUnit38Impl
