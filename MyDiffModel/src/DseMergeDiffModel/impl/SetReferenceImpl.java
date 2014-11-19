/**
 */
package DseMergeDiffModel.impl;

import DseMergeDiffModel.DseMergeDiffModelPackage;
import DseMergeDiffModel.SetReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DseMergeDiffModel.impl.SetReferenceImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.SetReferenceImpl#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetReferenceImpl extends IdentifiableImpl implements SetReference {
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
	 * The default value of the '{@link #getRefID() <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefID()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefID() <em>Ref ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefID()
	 * @generated
	 * @ordered
	 */
	protected String refID = REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseMergeDiffModelPackage.Literals.SET_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.SET_REFERENCE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefID() {
		return refID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefID(String newRefID) {
		String oldRefID = refID;
		refID = newRefID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.SET_REFERENCE__REF_ID, oldRefID, refID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseMergeDiffModelPackage.SET_REFERENCE__REFERENCE:
				return getReference();
			case DseMergeDiffModelPackage.SET_REFERENCE__REF_ID:
				return getRefID();
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
			case DseMergeDiffModelPackage.SET_REFERENCE__REFERENCE:
				setReference((String)newValue);
				return;
			case DseMergeDiffModelPackage.SET_REFERENCE__REF_ID:
				setRefID((String)newValue);
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
			case DseMergeDiffModelPackage.SET_REFERENCE__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case DseMergeDiffModelPackage.SET_REFERENCE__REF_ID:
				setRefID(REF_ID_EDEFAULT);
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
			case DseMergeDiffModelPackage.SET_REFERENCE__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case DseMergeDiffModelPackage.SET_REFERENCE__REF_ID:
				return REF_ID_EDEFAULT == null ? refID != null : !REF_ID_EDEFAULT.equals(refID);
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
		result.append(" (reference: ");
		result.append(reference);
		result.append(", refID: ");
		result.append(refID);
		result.append(')');
		return result.toString();
	}

} //SetReferenceImpl
