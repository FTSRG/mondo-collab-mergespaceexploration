/**
 */
package DiffModel;

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
 *   <li>{@link DiffModel.DiffContainer#getCreateDiffs <em>Create Diffs</em>}</li>
 *   <li>{@link DiffModel.DiffContainer#getDeleteDiffs <em>Delete Diffs</em>}</li>
 *   <li>{@link DiffModel.DiffContainer#getSetAttrDiffs <em>Set Attr Diffs</em>}</li>
 *   <li>{@link DiffModel.DiffContainer#getSetRefDiffs <em>Set Ref Diffs</em>}</li>
 *   <li>{@link DiffModel.DiffContainer#getMoveDiffs <em>Move Diffs</em>}</li>
 * </ul>
 * </p>
 *
 * @see DiffModel.DiffModelPackage#getDiffContainer()
 * @model
 * @generated
 */
public interface DiffContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Create Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DiffModel.Create}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Diffs</em>' containment reference list.
	 * @see DiffModel.DiffModelPackage#getDiffContainer_CreateDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Create> getCreateDiffs();

	/**
	 * Returns the value of the '<em><b>Delete Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DiffModel.Delete}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Diffs</em>' containment reference list.
	 * @see DiffModel.DiffModelPackage#getDiffContainer_DeleteDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delete> getDeleteDiffs();

	/**
	 * Returns the value of the '<em><b>Set Attr Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DiffModel.SetAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Attr Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Attr Diffs</em>' containment reference list.
	 * @see DiffModel.DiffModelPackage#getDiffContainer_SetAttrDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetAttribute> getSetAttrDiffs();

	/**
	 * Returns the value of the '<em><b>Set Ref Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DiffModel.SetReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Ref Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Ref Diffs</em>' containment reference list.
	 * @see DiffModel.DiffModelPackage#getDiffContainer_SetRefDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetReference> getSetRefDiffs();

	/**
	 * Returns the value of the '<em><b>Move Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link DiffModel.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Diffs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Diffs</em>' containment reference list.
	 * @see DiffModel.DiffModelPackage#getDiffContainer_MoveDiffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMoveDiffs();

} // DiffContainer
