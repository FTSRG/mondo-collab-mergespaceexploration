/**
 */
package DseMergeDiffModel.util;

import DseMergeDiffModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DseMergeDiffModel.DseMergeDiffModelPackage
 * @generated
 */
public class DseMergeDiffModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DseMergeDiffModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseMergeDiffModelSwitch() {
		if (modelPackage == null) {
			modelPackage = DseMergeDiffModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DseMergeDiffModelPackage.DIFF_CONTAINER: {
				DiffContainer diffContainer = (DiffContainer)theEObject;
				T result = caseDiffContainer(diffContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseIdentifiable(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseIdentifiable(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.SET_ATTRIBUTE: {
				SetAttribute setAttribute = (SetAttribute)theEObject;
				T result = caseSetAttribute(setAttribute);
				if (result == null) result = caseIdentifiable(setAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.SET_REFERENCE: {
				SetReference setReference = (SetReference)theEObject;
				T result = caseSetReference(setReference);
				if (result == null) result = caseIdentifiable(setReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.RESET_ATTRIBUTE: {
				ResetAttribute resetAttribute = (ResetAttribute)theEObject;
				T result = caseResetAttribute(resetAttribute);
				if (result == null) result = caseIdentifiable(resetAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.RESET_REFERENCE: {
				ResetReference resetReference = (ResetReference)theEObject;
				T result = caseResetReference(resetReference);
				if (result == null) result = caseIdentifiable(resetReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DseMergeDiffModelPackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffContainer(DiffContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAttribute(SetAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetReference(SetReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetAttribute(ResetAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResetReference(ResetReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DseMergeDiffModelSwitch
