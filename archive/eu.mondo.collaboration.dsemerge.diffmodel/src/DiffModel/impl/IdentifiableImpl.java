/**
 */
package DiffModel.impl;

import DiffModel.DiffModelPackage;
import DiffModel.Identifiable;

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
 *   <li>{@link DiffModel.impl.IdentifiableImpl#getID <em>ID</em>}</li>
 *   <li>{@link DiffModel.impl.IdentifiableImpl#getTargetID <em>Target ID</em>}</li>
 *   <li>{@link DiffModel.impl.IdentifiableImpl#isExecutable <em>Executable</em>}</li>
 *   <li>{@link DiffModel.impl.IdentifiableImpl#isEliminated <em>Eliminated</em>}</li>
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
	 * The default value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecutable() <em>Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean executable = EXECUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEliminated() <em>Eliminated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEliminated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELIMINATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEliminated() <em>Eliminated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEliminated()
	 * @generated
	 * @ordered
	 */
	protected boolean eliminated = ELIMINATED_EDEFAULT;

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
		return DiffModelPackage.Literals.IDENTIFIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.IDENTIFIABLE__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.IDENTIFIABLE__TARGET_ID, oldTargetID, targetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecutable() {
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutable(boolean newExecutable) {
		boolean oldExecutable = executable;
		executable = newExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.IDENTIFIABLE__EXECUTABLE, oldExecutable, executable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEliminated() {
		return eliminated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEliminated(boolean newEliminated) {
		boolean oldEliminated = eliminated;
		eliminated = newEliminated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiffModelPackage.IDENTIFIABLE__ELIMINATED, oldEliminated, eliminated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffModelPackage.IDENTIFIABLE__ID:
				return getID();
			case DiffModelPackage.IDENTIFIABLE__TARGET_ID:
				return getTargetID();
			case DiffModelPackage.IDENTIFIABLE__EXECUTABLE:
				return isExecutable();
			case DiffModelPackage.IDENTIFIABLE__ELIMINATED:
				return isEliminated();
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
			case DiffModelPackage.IDENTIFIABLE__ID:
				setID((String)newValue);
				return;
			case DiffModelPackage.IDENTIFIABLE__TARGET_ID:
				setTargetID((String)newValue);
				return;
			case DiffModelPackage.IDENTIFIABLE__EXECUTABLE:
				setExecutable((Boolean)newValue);
				return;
			case DiffModelPackage.IDENTIFIABLE__ELIMINATED:
				setEliminated((Boolean)newValue);
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
			case DiffModelPackage.IDENTIFIABLE__ID:
				setID(ID_EDEFAULT);
				return;
			case DiffModelPackage.IDENTIFIABLE__TARGET_ID:
				setTargetID(TARGET_ID_EDEFAULT);
				return;
			case DiffModelPackage.IDENTIFIABLE__EXECUTABLE:
				setExecutable(EXECUTABLE_EDEFAULT);
				return;
			case DiffModelPackage.IDENTIFIABLE__ELIMINATED:
				setEliminated(ELIMINATED_EDEFAULT);
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
			case DiffModelPackage.IDENTIFIABLE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DiffModelPackage.IDENTIFIABLE__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetID != null : !TARGET_ID_EDEFAULT.equals(targetID);
			case DiffModelPackage.IDENTIFIABLE__EXECUTABLE:
				return executable != EXECUTABLE_EDEFAULT;
			case DiffModelPackage.IDENTIFIABLE__ELIMINATED:
				return eliminated != ELIMINATED_EDEFAULT;
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
		result.append(", executable: ");
		result.append(executable);
		result.append(", eliminated: ");
		result.append(eliminated);
		result.append(')');
		return result.toString();
	}

} //IdentifiableImpl
