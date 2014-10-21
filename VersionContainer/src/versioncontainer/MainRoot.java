/**
 */
package versioncontainer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link versioncontainer.MainRoot#getOriginal <em>Original</em>}</li>
 *   <li>{@link versioncontainer.MainRoot#getLocal <em>Local</em>}</li>
 *   <li>{@link versioncontainer.MainRoot#getRemote <em>Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @see versioncontainer.VersioncontainerPackage#getMainRoot()
 * @model
 * @generated
 */
public interface MainRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Original</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original</em>' reference.
	 * @see #setOriginal(EObject)
	 * @see versioncontainer.VersioncontainerPackage#getMainRoot_Original()
	 * @model
	 * @generated
	 */
	EObject getOriginal();

	/**
	 * Sets the value of the '{@link versioncontainer.MainRoot#getOriginal <em>Original</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original</em>' reference.
	 * @see #getOriginal()
	 * @generated
	 */
	void setOriginal(EObject value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' reference.
	 * @see #setLocal(EObject)
	 * @see versioncontainer.VersioncontainerPackage#getMainRoot_Local()
	 * @model
	 * @generated
	 */
	EObject getLocal();

	/**
	 * Sets the value of the '{@link versioncontainer.MainRoot#getLocal <em>Local</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' reference.
	 * @see #getLocal()
	 * @generated
	 */
	void setLocal(EObject value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' reference.
	 * @see #setRemote(EObject)
	 * @see versioncontainer.VersioncontainerPackage#getMainRoot_Remote()
	 * @model
	 * @generated
	 */
	EObject getRemote();

	/**
	 * Sets the value of the '{@link versioncontainer.MainRoot#getRemote <em>Remote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' reference.
	 * @see #getRemote()
	 * @generated
	 */
	void setRemote(EObject value);

} // MainRoot
