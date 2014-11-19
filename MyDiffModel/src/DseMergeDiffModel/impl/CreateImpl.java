/**
 */
package DseMergeDiffModel.impl;

import DseMergeDiffModel.Create;
import DseMergeDiffModel.DseMergeDiffModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DseMergeDiffModel.impl.CreateImpl#getType <em>Type</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.CreateImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.CreateImpl#getValues <em>Values</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.CreateImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.CreateImpl#getContainerTargetID <em>Container Target ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateImpl extends IdentifiableImpl implements Create {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributes;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseMergeDiffModelPackage.Literals.CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.CREATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAttributes() {
		if (attributes == null) {
			attributes = new EDataTypeUniqueEList<String>(String.class, this, DseMergeDiffModelPackage.CREATE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, DseMergeDiffModelPackage.CREATE__VALUES);
		}
		return values;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.CREATE__REFERENCE, oldReference, reference));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DseMergeDiffModelPackage.CREATE__CONTAINER_TARGET_ID, oldContainerTargetID, containerTargetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseMergeDiffModelPackage.CREATE__TYPE:
				return getType();
			case DseMergeDiffModelPackage.CREATE__ATTRIBUTES:
				return getAttributes();
			case DseMergeDiffModelPackage.CREATE__VALUES:
				return getValues();
			case DseMergeDiffModelPackage.CREATE__REFERENCE:
				return getReference();
			case DseMergeDiffModelPackage.CREATE__CONTAINER_TARGET_ID:
				return getContainerTargetID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DseMergeDiffModelPackage.CREATE__TYPE:
				setType((String)newValue);
				return;
			case DseMergeDiffModelPackage.CREATE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case DseMergeDiffModelPackage.CREATE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
				return;
			case DseMergeDiffModelPackage.CREATE__REFERENCE:
				setReference((String)newValue);
				return;
			case DseMergeDiffModelPackage.CREATE__CONTAINER_TARGET_ID:
				setContainerTargetID((String)newValue);
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
			case DseMergeDiffModelPackage.CREATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DseMergeDiffModelPackage.CREATE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DseMergeDiffModelPackage.CREATE__VALUES:
				getValues().clear();
				return;
			case DseMergeDiffModelPackage.CREATE__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case DseMergeDiffModelPackage.CREATE__CONTAINER_TARGET_ID:
				setContainerTargetID(CONTAINER_TARGET_ID_EDEFAULT);
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
			case DseMergeDiffModelPackage.CREATE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DseMergeDiffModelPackage.CREATE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DseMergeDiffModelPackage.CREATE__VALUES:
				return values != null && !values.isEmpty();
			case DseMergeDiffModelPackage.CREATE__REFERENCE:
				return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
			case DseMergeDiffModelPackage.CREATE__CONTAINER_TARGET_ID:
				return CONTAINER_TARGET_ID_EDEFAULT == null ? containerTargetID != null : !CONTAINER_TARGET_ID_EDEFAULT.equals(containerTargetID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", attributes: ");
		result.append(attributes);
		result.append(", values: ");
		result.append(values);
		result.append(", reference: ");
		result.append(reference);
		result.append(", containerTargetID: ");
		result.append(containerTargetID);
		result.append(')');
		return result.toString();
	}

} //CreateImpl
