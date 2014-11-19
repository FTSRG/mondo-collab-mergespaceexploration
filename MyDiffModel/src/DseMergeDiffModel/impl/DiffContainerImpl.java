/**
 */
package DseMergeDiffModel.impl;

import DseMergeDiffModel.Create;
import DseMergeDiffModel.Delete;
import DseMergeDiffModel.DiffContainer;
import DseMergeDiffModel.DseMergeDiffModelPackage;
import DseMergeDiffModel.ResetAttribute;
import DseMergeDiffModel.ResetReference;
import DseMergeDiffModel.SetAttribute;
import DseMergeDiffModel.SetReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DseMergeDiffModel.impl.DiffContainerImpl#getCreateDiffs <em>Create Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.DiffContainerImpl#getDeleteDiffs <em>Delete Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.DiffContainerImpl#getSetAttrDiffs <em>Set Attr Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.DiffContainerImpl#getSetRefDiffs <em>Set Ref Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.DiffContainerImpl#getResetAttrDiffs <em>Reset Attr Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.impl.DiffContainerImpl#getResetRefDiffs <em>Reset Ref Diffs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiffContainerImpl extends MinimalEObjectImpl.Container implements DiffContainer {
	/**
	 * The cached value of the '{@link #getCreateDiffs() <em>Create Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Create> createDiffs;

	/**
	 * The cached value of the '{@link #getDeleteDiffs() <em>Delete Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Delete> deleteDiffs;

	/**
	 * The cached value of the '{@link #getSetAttrDiffs() <em>Set Attr Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetAttrDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<SetAttribute> setAttrDiffs;

	/**
	 * The cached value of the '{@link #getSetRefDiffs() <em>Set Ref Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetRefDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<SetReference> setRefDiffs;

	/**
	 * The cached value of the '{@link #getResetAttrDiffs() <em>Reset Attr Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetAttrDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<ResetAttribute> resetAttrDiffs;

	/**
	 * The cached value of the '{@link #getResetRefDiffs() <em>Reset Ref Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetRefDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<ResetReference> resetRefDiffs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DseMergeDiffModelPackage.Literals.DIFF_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Create> getCreateDiffs() {
		if (createDiffs == null) {
			createDiffs = new EObjectContainmentEList<Create>(Create.class, this, DseMergeDiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS);
		}
		return createDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delete> getDeleteDiffs() {
		if (deleteDiffs == null) {
			deleteDiffs = new EObjectContainmentEList<Delete>(Delete.class, this, DseMergeDiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS);
		}
		return deleteDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetAttribute> getSetAttrDiffs() {
		if (setAttrDiffs == null) {
			setAttrDiffs = new EObjectContainmentEList<SetAttribute>(SetAttribute.class, this, DseMergeDiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS);
		}
		return setAttrDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetReference> getSetRefDiffs() {
		if (setRefDiffs == null) {
			setRefDiffs = new EObjectContainmentEList<SetReference>(SetReference.class, this, DseMergeDiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS);
		}
		return setRefDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResetAttribute> getResetAttrDiffs() {
		if (resetAttrDiffs == null) {
			resetAttrDiffs = new EObjectContainmentEList<ResetAttribute>(ResetAttribute.class, this, DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_ATTR_DIFFS);
		}
		return resetAttrDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResetReference> getResetRefDiffs() {
		if (resetRefDiffs == null) {
			resetRefDiffs = new EObjectContainmentEList<ResetReference>(ResetReference.class, this, DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_REF_DIFFS);
		}
		return resetRefDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DseMergeDiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				return ((InternalEList<?>)getCreateDiffs()).basicRemove(otherEnd, msgs);
			case DseMergeDiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				return ((InternalEList<?>)getDeleteDiffs()).basicRemove(otherEnd, msgs);
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				return ((InternalEList<?>)getSetAttrDiffs()).basicRemove(otherEnd, msgs);
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				return ((InternalEList<?>)getSetRefDiffs()).basicRemove(otherEnd, msgs);
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_ATTR_DIFFS:
				return ((InternalEList<?>)getResetAttrDiffs()).basicRemove(otherEnd, msgs);
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_REF_DIFFS:
				return ((InternalEList<?>)getResetRefDiffs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DseMergeDiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				return getCreateDiffs();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				return getDeleteDiffs();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				return getSetAttrDiffs();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				return getSetRefDiffs();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_ATTR_DIFFS:
				return getResetAttrDiffs();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_REF_DIFFS:
				return getResetRefDiffs();
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
			case DseMergeDiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				getCreateDiffs().clear();
				getCreateDiffs().addAll((Collection<? extends Create>)newValue);
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				getDeleteDiffs().clear();
				getDeleteDiffs().addAll((Collection<? extends Delete>)newValue);
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				getSetAttrDiffs().clear();
				getSetAttrDiffs().addAll((Collection<? extends SetAttribute>)newValue);
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				getSetRefDiffs().clear();
				getSetRefDiffs().addAll((Collection<? extends SetReference>)newValue);
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_ATTR_DIFFS:
				getResetAttrDiffs().clear();
				getResetAttrDiffs().addAll((Collection<? extends ResetAttribute>)newValue);
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_REF_DIFFS:
				getResetRefDiffs().clear();
				getResetRefDiffs().addAll((Collection<? extends ResetReference>)newValue);
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
			case DseMergeDiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				getCreateDiffs().clear();
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				getDeleteDiffs().clear();
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				getSetAttrDiffs().clear();
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				getSetRefDiffs().clear();
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_ATTR_DIFFS:
				getResetAttrDiffs().clear();
				return;
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_REF_DIFFS:
				getResetRefDiffs().clear();
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
			case DseMergeDiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				return createDiffs != null && !createDiffs.isEmpty();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				return deleteDiffs != null && !deleteDiffs.isEmpty();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				return setAttrDiffs != null && !setAttrDiffs.isEmpty();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				return setRefDiffs != null && !setRefDiffs.isEmpty();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_ATTR_DIFFS:
				return resetAttrDiffs != null && !resetAttrDiffs.isEmpty();
			case DseMergeDiffModelPackage.DIFF_CONTAINER__RESET_REF_DIFFS:
				return resetRefDiffs != null && !resetRefDiffs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiffContainerImpl
