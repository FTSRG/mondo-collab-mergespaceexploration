/**
 */
package wtspecid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wtspecid.WtspecidPackage;
import wtspecid.wtc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>wtc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wtspecid.impl.wtcImpl#getSysId <em>Sys Id</em>}</li>
 *   <li>{@link wtspecid.impl.wtcImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link wtspecid.impl.wtcImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link wtspecid.impl.wtcImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class wtcImpl extends IdentifiableWTElementImpl implements wtc {
	/**
	 * The default value of the '{@link #getSysId() <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysId()
	 * @generated
	 * @ordered
	 */
	protected static final String SYS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSysId() <em>Sys Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysId()
	 * @generated
	 * @ordered
	 */
	protected String sysId = SYS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected static final short CYCLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCycle()
	 * @generated
	 * @ordered
	 */
	protected short cycle = CYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final short PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected short priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected wtcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WtspecidPackage.eINSTANCE.getwtc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSysId() {
		return sysId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysId(String newSysId) {
		String oldSysId = sysId;
		sysId = newSysId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.WTC__SYS_ID, oldSysId, sysId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.WTC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getCycle() {
		return cycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCycle(short newCycle) {
		short oldCycle = cycle;
		cycle = newCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.WTC__CYCLE, oldCycle, cycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(short newPriority) {
		short oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WtspecidPackage.WTC__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WtspecidPackage.WTC__SYS_ID:
				return getSysId();
			case WtspecidPackage.WTC__DESCRIPTION:
				return getDescription();
			case WtspecidPackage.WTC__CYCLE:
				return getCycle();
			case WtspecidPackage.WTC__PRIORITY:
				return getPriority();
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
			case WtspecidPackage.WTC__SYS_ID:
				setSysId((String)newValue);
				return;
			case WtspecidPackage.WTC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WtspecidPackage.WTC__CYCLE:
				setCycle((Short)newValue);
				return;
			case WtspecidPackage.WTC__PRIORITY:
				setPriority((Short)newValue);
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
			case WtspecidPackage.WTC__SYS_ID:
				setSysId(SYS_ID_EDEFAULT);
				return;
			case WtspecidPackage.WTC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WtspecidPackage.WTC__CYCLE:
				setCycle(CYCLE_EDEFAULT);
				return;
			case WtspecidPackage.WTC__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case WtspecidPackage.WTC__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysId != null : !SYS_ID_EDEFAULT.equals(sysId);
			case WtspecidPackage.WTC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WtspecidPackage.WTC__CYCLE:
				return cycle != CYCLE_EDEFAULT;
			case WtspecidPackage.WTC__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (sysId: ");
		result.append(sysId);
		result.append(", description: ");
		result.append(description);
		result.append(", cycle: ");
		result.append(cycle);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //wtcImpl
