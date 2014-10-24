/**
 */
package ModelContainer.impl;

import ModelContainer.MainRoot;
import ModelContainer.ModelContainerPackage;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link ModelContainer.impl.MainRootImpl#getDeltaOB <em>Delta OB</em>}</li>
 *   <li>{@link ModelContainer.impl.MainRootImpl#getDeltaOA <em>Delta OA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainRootImpl extends MinimalEObjectImpl.Container implements MainRoot {
	/**
	 * The cached value of the '{@link #getOriginal() <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginal()
	 * @generated
	 * @ordered
	 */
	protected EObject original;

	/**
	 * The cached value of the '{@link #getDeltaOB() <em>Delta OB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaOB()
	 * @generated
	 * @ordered
	 */
	protected EObject deltaOB;

	/**
	 * The cached value of the '{@link #getDeltaOA() <em>Delta OA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaOA()
	 * @generated
	 * @ordered
	 */
	protected EObject deltaOA;

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
		if (original != null && original.eIsProxy()) {
			InternalEObject oldOriginal = (InternalEObject)original;
			original = eResolveProxy(oldOriginal);
			if (original != oldOriginal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelContainerPackage.MAIN_ROOT__ORIGINAL, oldOriginal, original));
			}
		}
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOriginal() {
		return original;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginal(EObject newOriginal) {
		EObject oldOriginal = original;
		original = newOriginal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDeltaOB() {
		if (deltaOB != null && deltaOB.eIsProxy()) {
			InternalEObject oldDeltaOB = (InternalEObject)deltaOB;
			deltaOB = eResolveProxy(oldDeltaOB);
			if (deltaOB != oldDeltaOB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelContainerPackage.MAIN_ROOT__DELTA_OB, oldDeltaOB, deltaOB));
			}
		}
		return deltaOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDeltaOB() {
		return deltaOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaOB(EObject newDeltaOB) {
		EObject oldDeltaOB = deltaOB;
		deltaOB = newDeltaOB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__DELTA_OB, oldDeltaOB, deltaOB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getDeltaOA() {
		if (deltaOA != null && deltaOA.eIsProxy()) {
			InternalEObject oldDeltaOA = (InternalEObject)deltaOA;
			deltaOA = eResolveProxy(oldDeltaOA);
			if (deltaOA != oldDeltaOA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelContainerPackage.MAIN_ROOT__DELTA_OA, oldDeltaOA, deltaOA));
			}
		}
		return deltaOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetDeltaOA() {
		return deltaOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaOA(EObject newDeltaOA) {
		EObject oldDeltaOA = deltaOA;
		deltaOA = newDeltaOA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelContainerPackage.MAIN_ROOT__DELTA_OA, oldDeltaOA, deltaOA));
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
				if (resolve) return getOriginal();
				return basicGetOriginal();
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				if (resolve) return getDeltaOB();
				return basicGetDeltaOB();
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				if (resolve) return getDeltaOA();
				return basicGetDeltaOA();
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
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				setDeltaOB((EObject)newValue);
				return;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				setDeltaOA((EObject)newValue);
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
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				setDeltaOB((EObject)null);
				return;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				setDeltaOA((EObject)null);
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
			case ModelContainerPackage.MAIN_ROOT__DELTA_OB:
				return deltaOB != null;
			case ModelContainerPackage.MAIN_ROOT__DELTA_OA:
				return deltaOA != null;
		}
		return super.eIsSet(featureID);
	}

} //MainRootImpl
