/**
 */
package DseMergeDiffModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DseMergeDiffModel.DiffContainer#getCreateDiffs <em>Create Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.DiffContainer#getDeleteDiffs <em>Delete Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.DiffContainer#getSetAttrDiffs <em>Set Attr Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.DiffContainer#getSetRefDiffs <em>Set Ref Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.DiffContainer#getResetAttrDiffs <em>Reset Attr Diffs</em>}</li>
 *   <li>{@link DseMergeDiffModel.DiffContainer#getResetRefDiffs <em>Reset Ref Diffs</em>}</li>
 * </ul>
 * </p>
 *
 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer()
 * @model
 * @generated
 */
public interface DiffContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DseMergeDiffModel.Create}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Diffs</em>' containment reference list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer_CreateDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Create> getCreateDiffs();

	/**
	 * Returns the value of the '<em><b>Delete Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DseMergeDiffModel.Delete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Diffs</em>' containment reference list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer_DeleteDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delete> getDeleteDiffs();

	/**
	 * Returns the value of the '<em><b>Set Attr Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DseMergeDiffModel.SetAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Attr Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Attr Diffs</em>' containment reference list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer_SetAttrDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetAttribute> getSetAttrDiffs();

	/**
	 * Returns the value of the '<em><b>Set Ref Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DseMergeDiffModel.SetReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Ref Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Ref Diffs</em>' containment reference list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer_SetRefDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetReference> getSetRefDiffs();

	/**
	 * Returns the value of the '<em><b>Reset Attr Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DseMergeDiffModel.ResetAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Attr Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Attr Diffs</em>' containment reference list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer_ResetAttrDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResetAttribute> getResetAttrDiffs();

	/**
	 * Returns the value of the '<em><b>Reset Ref Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DseMergeDiffModel.ResetReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Ref Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Ref Diffs</em>' containment reference list.
	 * @see DseMergeDiffModel.DseMergeDiffModelPackage#getDiffContainer_ResetRefDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResetReference> getResetRefDiffs();

} // DiffContainer
