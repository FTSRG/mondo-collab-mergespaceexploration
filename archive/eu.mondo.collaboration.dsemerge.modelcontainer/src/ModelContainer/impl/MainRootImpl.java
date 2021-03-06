/**
 */
package ModelContainer.impl;

import DiffModel.DiffContainer;

import ModelContainer.MainRoot;
import ModelContainer.ModelContainerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ModelContainer.impl.MainRootImpl#getOriginal <em>Original</em>}</li>
 *   <li>{@link ModelContainer.impl.MainRootImpl#getDeltaOA <em>Delta OA</em>}</li>
 *   <li>{@link ModelContainer.impl.MainRootImpl#getDeltaOB <em>Delta OB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainRootImpl extends MinimalEObjectImpl.Container implements MainRoot {
	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected EObject original;

	/**
	 * The cached value of the '{@link #getDeltaOA() <em>Delta OA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaOA()
	 * @generated
	 * @ordered
	 */
	protected DiffContainer deltaOA;

	/**
	 * The cached value of the '{@link #getDeltaOB() <em>Delta OB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaOB()
	 * @generated
	 * @ordered
	 */
	protected DiffContainer deltaOB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelContainerPackage.Literals.MAIN_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginal(EObject newOriginal, NotificationChain msgs) {
		EObject oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__ORIGINAL, oldOriginal, newOriginal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal(EObject newOriginal) {
		if (newOriginal != original) {
			NotificationChain msgs = null;
			if (original != null)
				msgs = ((InternalEObject)original).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelContainerPackage.MAIN_ROOT__ORIGINAL, null, msgs);
			if (newOriginal != null)
				msgs = ((InternalEObject)newOriginal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelContainerPackage.MAIN_ROOT__ORIGINAL, null, msgs);
			msgs = basicSetOriginal(newOriginal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__ORIGINAL, newOriginal, newOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffContainer getDeltaOA() {
		return deltaOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaOA(DiffContainer newDeltaOA, NotificationChain msgs) {
		DiffContainer oldDeltaOA = deltaOA;
		deltaOA = newDeltaOA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__DELTA_OA, oldDeltaOA, newDeltaOA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaOA(DiffContainer newDeltaOA) {
		if (newDeltaOA != deltaOA) {
			NotificationChain msgs = null;
			if (deltaOA != null)
				msgs = ((InternalEObject)deltaOA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelContainerPackage.MAIN_ROOT__DELTA_OA, null, msgs);
			if (newDeltaOA != null)
				msgs = ((InternalEObject)newDeltaOA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelContainerPackage.MAIN_ROOT__DELTA_OA, null, msgs);
			msgs = basicSetDeltaOA(newDeltaOA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__DELTA_OA, newDeltaOA, newDeltaOA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffContainer getDeltaOB() {
		return deltaOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaOB(DiffContainer newDeltaOB, NotificationChain msgs) {
		DiffContainer oldDeltaOB = deltaOB;
		deltaOB = newDeltaOB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__DELTA_OB, oldDeltaOB, newDeltaOB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaOB(DiffContainer newDeltaOB) {
		if (newDeltaOB != deltaOB) {
			NotificationChain msgs = null;
			if (deltaOB != null)
				msgs = ((InternalEObject)deltaOB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelContainerPackage.MAIN_ROOT__DELTA_OB, null, msgs);
			if (newDeltaOB != null)
				msgs = ((InternalEObject)newDeltaOB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelContainerPackage.MAIN_ROOT__DELTA_OB, null, msgs);
			msgs = basicSetDeltaOB(newDeltaOB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__DELTA_OB, newDeltaOB, newDeltaOB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelContainerPackage.MAIN_ROOT__ORIGINAL:
				return basicSetOriginal(null, msgs);
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				return basicSetDeltaOA(null, msgs);
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				return basicSetDeltaOB(null, msgs);
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
			case ModelContainerPackage.MAIN_ROOT__ORIGINAL:
				return getOriginal();
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				return getDeltaOA();
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				return getDeltaOB();
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
			case ModelContainerPackage.MAIN_ROOT__ORIGINAL:
				setOriginal((EObject)newValue);
				return;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				setDeltaOA((DiffContainer)newValue);
				return;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				setDeltaOB((DiffContainer)newValue);
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
			case ModelContainerPackage.MAIN_ROOT__ORIGINAL:
				setOriginal((EObject)null);
				return;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				setDeltaOA((DiffContainer)null);
				return;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				setDeltaOB((DiffContainer)null);
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
			case ModelContainerPackage.MAIN_ROOT__ORIGINAL:
				return original != null;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				return deltaOA != null;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				return deltaOB != null;
		}
		return super.eIsSet(featureID);
	}

} //MainRootImpl
