/**
 */
package DseMergeDiffModel.impl;

import DseMergeDiffModel.DseMergeDiffModelPackage;
import DseMergeDiffModel.Identifiable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DseMergeDiffModel.impl.IdentifiableImpl#getID <em>ID</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.IdentifiableImpl#getTargetID <em>Target ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IdentifiableImpl extends MinimalEObjectImpl.Container implements Identifiable {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetID() <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetID()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetID() <em>Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetID()
	 * @generated
	 * @ordered
	 */
	protected String targetID = TARGET_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseMergeDiffModelPackage.Literals.IDENTIFIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.IDENTIFIABLE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetID() {
		return targetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetID(String newTargetID) {
		String oldTargetID = targetID;
		targetID = newTargetID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.IDENTIFIABLE__TARGET_ID, oldTargetID, targetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseMergeDiffModelPackage.IDENTIFIABLE__ID:
				return getID();
			case DseMergeDiffModelPackage.IDENTIFIABLE__TARGET_ID:
				return getTargetID();
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
			case DseMergeDiffModelPackage.IDENTIFIABLE__ID:
				setID((String)newValue);
				return;
			case DseMergeDiffModelPackage.IDENTIFIABLE__TARGET_ID:
				setTargetID((String)newValue);
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
			case DseMergeDiffModelPackage.IDENTIFIABLE__ID:
				setID(ID_EDEFAULT);
				return;
			case DseMergeDiffModelPackage.IDENTIFIABLE__TARGET_ID:
				setTargetID(TARGET_ID_EDEFAULT);
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
			case DseMergeDiffModelPackage.IDENTIFIABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DseMergeDiffModelPackage.IDENTIFIABLE__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetID != null : !TARGET_ID_EDEFAULT.equals(targetID);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", targetID: ");
		result.append(targetID);
		result.append(')');
		return result.toString();
	}

} //IdentifiableImpl
