/**
 */
package versioncontainer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import versioncontainer.MainRoot;
import versioncontainer.VersioncontainerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link versioncontainer.impl.MainRootImpl#getOriginal <em>Original</em>}</li>
 *   <li>{@link versioncontainer.impl.MainRootImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link versioncontainer.impl.MainRootImpl#getRemote <em>Remote</em>}</li>
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
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected EObject local;

	/**
	 * The cached value of the '{@link #getRemote() <em>Remote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemote()
	 * @generated
	 * @ordered
	 */
	protected EObject remote;

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
		return VersioncontainerPackage.Literals.MAIN_ROOT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VersioncontainerPackage.MAIN_ROOT__ORIGINAL, oldOriginal, original));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VersioncontainerPackage.MAIN_ROOT__ORIGINAL, oldOriginal, original));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getLocal() {
		if (local != null && local.eIsProxy()) {
			InternalEObject oldLocal = (InternalEObject)local;
			local = eResolveProxy(oldLocal);
			if (local != oldLocal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VersioncontainerPackage.MAIN_ROOT__LOCAL, oldLocal, local));
			}
		}
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(EObject newLocal) {
		EObject oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VersioncontainerPackage.MAIN_ROOT__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getRemote() {
		if (remote != null && remote.eIsProxy()) {
			InternalEObject oldRemote = (InternalEObject)remote;
			remote = eResolveProxy(oldRemote);
			if (remote != oldRemote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VersioncontainerPackage.MAIN_ROOT__REMOTE, oldRemote, remote));
			}
		}
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(EObject newRemote) {
		EObject oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VersioncontainerPackage.MAIN_ROOT__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VersioncontainerPackage.MAIN_ROOT__ORIGINAL:
				if (resolve) return getOriginal();
				return basicGetOriginal();
			case VersioncontainerPackage.MAIN_ROOT__LOCAL:
				if (resolve) return getLocal();
				return basicGetLocal();
			case VersioncontainerPackage.MAIN_ROOT__REMOTE:
				if (resolve) return getRemote();
				return basicGetRemote();
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
			case VersioncontainerPackage.MAIN_ROOT__ORIGINAL:
				setOriginal((EObject)newValue);
				return;
			case VersioncontainerPackage.MAIN_ROOT__LOCAL:
				setLocal((EObject)newValue);
				return;
			case VersioncontainerPackage.MAIN_ROOT__REMOTE:
				setRemote((EObject)newValue);
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
			case VersioncontainerPackage.MAIN_ROOT__ORIGINAL:
				setOriginal((EObject)null);
				return;
			case VersioncontainerPackage.MAIN_ROOT__LOCAL:
				setLocal((EObject)null);
				return;
			case VersioncontainerPackage.MAIN_ROOT__REMOTE:
				setRemote((EObject)null);
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
			case VersioncontainerPackage.MAIN_ROOT__ORIGINAL:
				return original != null;
			case VersioncontainerPackage.MAIN_ROOT__LOCAL:
				return local != null;
			case VersioncontainerPackage.MAIN_ROOT__REMOTE:
				return remote != null;
		}
		return super.eIsSet(featureID);
	}

} //MainRootImpl
