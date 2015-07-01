/**
 */
package DiffModel.impl;

import DiffModel.Create;
import DiffModel.Delete;
import DiffModel.DiffContainer;
import DiffModel.DiffModelPackage;
import DiffModel.Move;
import DiffModel.SetAttribute;
import DiffModel.SetReference;
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
 *   <li>{@link DiffModel.impl.DiffContainerImpl#getCreateDiffs <em>Create Diffs</em>}</li>
 *   <li>{@link DiffModel.impl.DiffContainerImpl#getDeleteDiffs <em>Delete Diffs</em>}</li>
 *   <li>{@link DiffModel.impl.DiffContainerImpl#getSetAttrDiffs <em>Set Attr Diffs</em>}</li>
 *   <li>{@link DiffModel.impl.DiffContainerImpl#getSetRefDiffs <em>Set Ref Diffs</em>}</li>
 *   <li>{@link DiffModel.impl.DiffContainerImpl#getMoveDiffs <em>Move Diffs</em>}</li>
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
	 * The cached value of the '{@link #getMoveDiffs() <em>Move Diffs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveDiffs()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> moveDiffs;

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
		return DiffModelPackage.Literals.DIFF_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Create> getCreateDiffs() {
		if (createDiffs == null) {
			createDiffs = new EObjectContainmentEList<Create>(Create.class, this, DiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS);
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
			deleteDiffs = new EObjectContainmentEList<Delete>(Delete.class, this, DiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS);
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
			setAttrDiffs = new EObjectContainmentEList<SetAttribute>(SetAttribute.class, this, DiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS);
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
			setRefDiffs = new EObjectContainmentEList<SetReference>(SetReference.class, this, DiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS);
		}
		return setRefDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMoveDiffs() {
		if (moveDiffs == null) {
			moveDiffs = new EObjectContainmentEList<Move>(Move.class, this, DiffModelPackage.DIFF_CONTAINER__MOVE_DIFFS);
		}
		return moveDiffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				return ((InternalEList<?>)getCreateDiffs()).basicRemove(otherEnd, msgs);
			case DiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				return ((InternalEList<?>)getDeleteDiffs()).basicRemove(otherEnd, msgs);
			case DiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				return ((InternalEList<?>)getSetAttrDiffs()).basicRemove(otherEnd, msgs);
			case DiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				return ((InternalEList<?>)getSetRefDiffs()).basicRemove(otherEnd, msgs);
			case DiffModelPackage.DIFF_CONTAINER__MOVE_DIFFS:
				return ((InternalEList<?>)getMoveDiffs()).basicRemove(otherEnd, msgs);
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
			case DiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				return getCreateDiffs();
			case DiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				return getDeleteDiffs();
			case DiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				return getSetAttrDiffs();
			case DiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				return getSetRefDiffs();
			case DiffModelPackage.DIFF_CONTAINER__MOVE_DIFFS:
				return getMoveDiffs();
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
			case DiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				getCreateDiffs().clear();
				getCreateDiffs().addAll((Collection<? extends Create>)newValue);
				return;
			case DiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				getDeleteDiffs().clear();
				getDeleteDiffs().addAll((Collection<? extends Delete>)newValue);
				return;
			case DiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				getSetAttrDiffs().clear();
				getSetAttrDiffs().addAll((Collection<? extends SetAttribute>)newValue);
				return;
			case DiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				getSetRefDiffs().clear();
				getSetRefDiffs().addAll((Collection<? extends SetReference>)newValue);
				return;
			case DiffModelPackage.DIFF_CONTAINER__MOVE_DIFFS:
				getMoveDiffs().clear();
				getMoveDiffs().addAll((Collection<? extends Move>)newValue);
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
			case DiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				getCreateDiffs().clear();
				return;
			case DiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				getDeleteDiffs().clear();
				return;
			case DiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				getSetAttrDiffs().clear();
				return;
			case DiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				getSetRefDiffs().clear();
				return;
			case DiffModelPackage.DIFF_CONTAINER__MOVE_DIFFS:
				getMoveDiffs().clear();
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
			case DiffModelPackage.DIFF_CONTAINER__CREATE_DIFFS:
				return createDiffs != null && !createDiffs.isEmpty();
			case DiffModelPackage.DIFF_CONTAINER__DELETE_DIFFS:
				return deleteDiffs != null && !deleteDiffs.isEmpty();
			case DiffModelPackage.DIFF_CONTAINER__SET_ATTR_DIFFS:
				return setAttrDiffs != null && !setAttrDiffs.isEmpty();
			case DiffModelPackage.DIFF_CONTAINER__SET_REF_DIFFS:
				return setRefDiffs != null && !setRefDiffs.isEmpty();
			case DiffModelPackage.DIFF_CONTAINER__MOVE_DIFFS:
				return moveDiffs != null && !moveDiffs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiffContainerImpl
