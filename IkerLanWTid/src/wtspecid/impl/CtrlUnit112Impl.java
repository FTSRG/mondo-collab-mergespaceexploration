/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit112;
import wtspecid.WTCOutput;
import wtspecid.WTCParam;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit112</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit112Impl#getOutput__oChangeCmd <em>Output oChange Cmd</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit112Impl#getOutput__oPersistentDay <em>Output oPersistent Day</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit112Impl#getParameter__pDayChange <em>Parameter pDay Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit112Impl extends wtcImpl implements CtrlUnit112 {
	/**
	 * The cached value of the '{@link #getOutput__oChangeCmd() <em>Output oChange Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oChangeCmd()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oChangeCmd;

	/**
	 * The cached value of the '{@link #getOutput__oPersistentDay() <em>Output oPersistent Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput__oPersistentDay()
	 * @generated
	 * @ordered
	 */
	protected WTCOutput output__oPersistentDay;

	/**
	 * The cached value of the '{@link #getParameter__pDayChange() <em>Parameter pDay Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter__pDayChange()
	 * @generated
	 * @ordered
	 */
	protected WTCParam parameter__pDayChange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit112Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit112();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oChangeCmd() {
		if (output__oChangeCmd != null && output__oChangeCmd.eIsProxy()) {
			InternalEObject oldOutput__oChangeCmd = (InternalEObject)output__oChangeCmd;
			output__oChangeCmd = (WTCOutput)eResolveProxy(oldOutput__oChangeCmd);
			if (output__oChangeCmd != oldOutput__oChangeCmd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT112__OUTPUT_OCHANGE_CMD, oldOutput__oChangeCmd, output__oChangeCmd));
			}
		}
		return output__oChangeCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oChangeCmd() {
		return output__oChangeCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oChangeCmd(WTCOutput newOutput__oChangeCmd) {
		WTCOutput oldOutput__oChangeCmd = output__oChangeCmd;
		output__oChangeCmd = newOutput__oChangeCmd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT112__OUTPUT_OCHANGE_CMD, oldOutput__oChangeCmd, output__oChangeCmd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput getOutput__oPersistentDay() {
		if (output__oPersistentDay != null && output__oPersistentDay.eIsProxy()) {
			InternalEObject oldOutput__oPersistentDay = (InternalEObject)output__oPersistentDay;
			output__oPersistentDay = (WTCOutput)eResolveProxy(oldOutput__oPersistentDay);
			if (output__oPersistentDay != oldOutput__oPersistentDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY, oldOutput__oPersistentDay, output__oPersistentDay));
			}
		}
		return output__oPersistentDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCOutput basicGetOutput__oPersistentDay() {
		return output__oPersistentDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput__oPersistentDay(WTCOutput newOutput__oPersistentDay) {
		WTCOutput oldOutput__oPersistentDay = output__oPersistentDay;
		output__oPersistentDay = newOutput__oPersistentDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY, oldOutput__oPersistentDay, output__oPersistentDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam getParameter__pDayChange() {
		if (parameter__pDayChange != null && parameter__pDayChange.eIsProxy()) {
			InternalEObject oldParameter__pDayChange = (InternalEObject)parameter__pDayChange;
			parameter__pDayChange = (WTCParam)eResolveProxy(oldParameter__pDayChange);
			if (parameter__pDayChange != oldParameter__pDayChange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT112__PARAMETER_PDAY_CHANGE, oldParameter__pDayChange, parameter__pDayChange));
			}
		}
		return parameter__pDayChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCParam basicGetParameter__pDayChange() {
		return parameter__pDayChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter__pDayChange(WTCParam newParameter__pDayChange) {
		WTCParam oldParameter__pDayChange = parameter__pDayChange;
		parameter__pDayChange = newParameter__pDayChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT112__PARAMETER_PDAY_CHANGE, oldParameter__pDayChange, parameter__pDayChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OCHANGE_CMD:
				if (resolve) return getOutput__oChangeCmd();
				return basicGetOutput__oChangeCmd();
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY:
				if (resolve) return getOutput__oPersistentDay();
				return basicGetOutput__oPersistentDay();
			case WtspecidPackage.CTRL_UNIT112__PARAMETER_PDAY_CHANGE:
				if (resolve) return getParameter__pDayChange();
				return basicGetParameter__pDayChange();
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
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OCHANGE_CMD:
				setOutput__oChangeCmd((WTCOutput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY:
				setOutput__oPersistentDay((WTCOutput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT112__PARAMETER_PDAY_CHANGE:
				setParameter__pDayChange((WTCParam)newValue);
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
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OCHANGE_CMD:
				setOutput__oChangeCmd((WTCOutput)null);
				return;
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY:
				setOutput__oPersistentDay((WTCOutput)null);
				return;
			case WtspecidPackage.CTRL_UNIT112__PARAMETER_PDAY_CHANGE:
				setParameter__pDayChange((WTCParam)null);
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
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OCHANGE_CMD:
				return output__oChangeCmd != null;
			case WtspecidPackage.CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY:
				return output__oPersistentDay != null;
			case WtspecidPackage.CTRL_UNIT112__PARAMETER_PDAY_CHANGE:
				return parameter__pDayChange != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit112Impl
