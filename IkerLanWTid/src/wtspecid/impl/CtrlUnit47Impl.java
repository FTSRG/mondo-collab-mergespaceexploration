/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.CtrlUnit47;
import wtspecid.WTCFault;
import wtspecid.WTCInput;
import wtspecid.WtspecidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctrl Unit47</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.CtrlUnit47Impl#getInput__iResetOrder <em>Input iReset Order</em>}</li>
 *   <li>{@link wtspecid.impl.CtrlUnit47Impl#getFault__fResetFault <em>Fault fReset Fault</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CtrlUnit47Impl extends wtcImpl implements CtrlUnit47 {
	/**
	 * The cached value of the '{@link #getInput__iResetOrder() <em>Input iReset Order</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput__iResetOrder()
	 * @generated
	 * @ordered
	 */
	protected WTCInput input__iResetOrder;

	/**
	 * The cached value of the '{@link #getFault__fResetFault() <em>Fault fReset Fault</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault__fResetFault()
	 * @generated
	 * @ordered
	 */
	protected WTCFault fault__fResetFault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtrlUnit47Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getCtrlUnit47();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput getInput__iResetOrder() {
		if (input__iResetOrder != null && input__iResetOrder.eIsProxy()) {
			InternalEObject oldInput__iResetOrder = (InternalEObject)input__iResetOrder;
			input__iResetOrder = (WTCInput)eResolveProxy(oldInput__iResetOrder);
			if (input__iResetOrder != oldInput__iResetOrder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT47__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
			}
		}
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCInput basicGetInput__iResetOrder() {
		return input__iResetOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput__iResetOrder(WTCInput newInput__iResetOrder) {
		WTCInput oldInput__iResetOrder = input__iResetOrder;
		input__iResetOrder = newInput__iResetOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT47__INPUT_IRESET_ORDER, oldInput__iResetOrder, input__iResetOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault getFault__fResetFault() {
		if (fault__fResetFault != null && fault__fResetFault.eIsProxy()) {
			InternalEObject oldFault__fResetFault = (InternalEObject)fault__fResetFault;
			fault__fResetFault = (WTCFault)eResolveProxy(oldFault__fResetFault);
			if (fault__fResetFault != oldFault__fResetFault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WtspecidPackage.CTRL_UNIT47__FAULT_FRESET_FAULT, oldFault__fResetFault, fault__fResetFault));
			}
		}
		return fault__fResetFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WTCFault basicGetFault__fResetFault() {
		return fault__fResetFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFault__fResetFault(WTCFault newFault__fResetFault) {
		WTCFault oldFault__fResetFault = fault__fResetFault;
		fault__fResetFault = newFault__fResetFault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.CTRL_UNIT47__FAULT_FRESET_FAULT, oldFault__fResetFault, fault__fResetFault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.CTRL_UNIT47__INPUT_IRESET_ORDER:
				if (resolve) return getInput__iResetOrder();
				return basicGetInput__iResetOrder();
			case WtspecidPackage.CTRL_UNIT47__FAULT_FRESET_FAULT:
				if (resolve) return getFault__fResetFault();
				return basicGetFault__fResetFault();
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
			case WtspecidPackage.CTRL_UNIT47__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)newValue);
				return;
			case WtspecidPackage.CTRL_UNIT47__FAULT_FRESET_FAULT:
				setFault__fResetFault((WTCFault)newValue);
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
			case WtspecidPackage.CTRL_UNIT47__INPUT_IRESET_ORDER:
				setInput__iResetOrder((WTCInput)null);
				return;
			case WtspecidPackage.CTRL_UNIT47__FAULT_FRESET_FAULT:
				setFault__fResetFault((WTCFault)null);
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
			case WtspecidPackage.CTRL_UNIT47__INPUT_IRESET_ORDER:
				return input__iResetOrder != null;
			case WtspecidPackage.CTRL_UNIT47__FAULT_FRESET_FAULT:
				return fault__fResetFault != null;
		}
		return super.eIsSet(featureID);
	}

} //CtrlUnit47Impl
