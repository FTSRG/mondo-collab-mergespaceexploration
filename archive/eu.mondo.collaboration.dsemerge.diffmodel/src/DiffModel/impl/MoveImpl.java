/**
 */
package DiffModel.impl;

import DiffModel.DiffModelPackage;
import DiffModel.Move;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DiffModel.impl.MoveImpl#getContainerTargetID <em>Container Target ID</em>}</li>
 *   <li>{@link DiffModel.impl.MoveImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveImpl extends IdentifiableImpl implements Move {
	/**
	 * The default value of the '{@link #getContainerTargetID() <em>Container Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTargetID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerTargetID() <em>Container Target ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerTargetID()
	 * @generated
	 * @ordered
	 */
	protected String containerTargetID = CONTAINER_TARGET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected String reference = REFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffModelPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainerTargetID() {
		return containerTargetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerTargetID(String newContainerTargetID) {
		String oldContainerTargetID = containerTargetID;
		containerTargetID = newContainerTargetID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.MOVE__CONTAINER_TARGET_ID, oldContainerTargetID, containerTargetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(String newReference) {
		String oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.MOVE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffModelPackage.MOVE__CONTAINER_TARGET_ID:
				return getContainerTargetID();
			case DiffModelPackage.MOVE__REFERENCE:
				return getReference();
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
			case DiffModelPackage.MOVE__CONTAINER_TARGET_ID:
				setContainerTargetID((String)newValue);
				return;
			case DiffModelPackage.MOVE__REFERENCE:
				setReference((String)newValue);
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
			case DiffModelPackage.MOVE__CONTAINER_TARGET_ID:
				setContainerTargetID(CONTAINER_TARGET_ID_EDEFAULT);
				return;
			case DiffModelPackage.MOVE__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
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
			case DiffModelPackage.MOVE__CONTAINER_TARGET_ID:
				return CONTAINER_TARGET_ID_EDEFAULT == null ? containerTargetID != null : !CONTAINER_TARGET_ID_EDEFAULT.equals(containerTargetID);
			case DiffModelPackage.MOVE__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
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
		result.append(" (containerTargetID: ");
		result.append(containerTargetID);
		result.append(", reference: ");
		result.append(reference);
		result.append(')');
		return result.toString();
	}

} //MoveImpl
