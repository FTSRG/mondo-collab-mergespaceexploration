/**
 */
package DiffModel.impl;

import DiffModel.AddToList;
import DiffModel.DiffModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add To List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DiffModel.impl.AddToListImpl#getList <em>List</em>}</li>
 *   <li>{@link DiffModel.impl.AddToListImpl#getRefID <em>Ref ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddToListImpl extends IdentifiableImpl implements AddToList {
	/**
	 * The default value of the '{@link #getList() <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected static final String LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected String list = LIST_EDEFAULT;

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
	protected AddToListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffModelPackage.Literals.ADD_TO_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(String newList) {
		String oldList = list;
		list = newList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.ADD_TO_LIST__LIST, oldList, list));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.ADD_TO_LIST__REF_ID, oldRefID, refID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffModelPackage.ADD_TO_LIST__LIST:
				return getList();
			case DiffModelPackage.ADD_TO_LIST__REF_ID:
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
			case DiffModelPackage.ADD_TO_LIST__LIST:
				setList((String)newValue);
				return;
			case DiffModelPackage.ADD_TO_LIST__REF_ID:
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
			case DiffModelPackage.ADD_TO_LIST__LIST:
				setList(LIST_EDEFAULT);
				return;
			case DiffModelPackage.ADD_TO_LIST__REF_ID:
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
			case DiffModelPackage.ADD_TO_LIST__LIST:
				return LIST_EDEFAULT == null ? list != null : !LIST_EDEFAULT.equals(list);
			case DiffModelPackage.ADD_TO_LIST__REF_ID:
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
		result.append(" (list: ");
		result.append(list);
		result.append(", refID: ");
		result.append(refID);
		result.append(')');
		return result.toString();
	}

} //AddToListImpl
