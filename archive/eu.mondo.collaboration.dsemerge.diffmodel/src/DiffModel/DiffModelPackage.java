/**
 */
package DiffModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DiffModel.DiffModelFactory
 * @model kind="package"
 * @generated
 */
public interface DiffModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DiffModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eu.mondo.collaboration.dsemerge.diffmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diffmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffModelPackage eINSTANCE = DiffModel.impl.DiffModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link DiffModel.impl.DiffContainerImpl <em>Diff Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.DiffContainerImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getDiffContainer()
	 * @generated
	 */
	int DIFF_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Create Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__CREATE_DIFFS = 0;

	/**
	 * The feature id for the '<em><b>Delete Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__DELETE_DIFFS = 1;

	/**
	 * The feature id for the '<em><b>Set Attr Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__SET_ATTR_DIFFS = 2;

	/**
	 * The feature id for the '<em><b>Set Ref Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__SET_REF_DIFFS = 3;

	/**
	 * The feature id for the '<em><b>Move Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__MOVE_DIFFS = 4;

	/**
	 * The number of structural features of the '<em>Diff Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Diff Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DiffModel.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.IdentifiableImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__TARGET_ID = 1;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__EXECUTABLE = 2;

	/**
	 * The feature id for the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ELIMINATED = 3;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DiffModel.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.CreateImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__EXECUTABLE = IDENTIFIABLE__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ELIMINATED = IDENTIFIABLE__ELIMINATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ATTRIBUTES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__VALUES = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__REFERENCE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CONTAINER_TARGET_ID = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DiffModel.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.DeleteImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__EXECUTABLE = IDENTIFIABLE__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ELIMINATED = IDENTIFIABLE__ELIMINATED;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DiffModel.impl.SetAttributeImpl <em>Set Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.SetAttributeImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getSetAttribute()
	 * @generated
	 */
	int SET_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__EXECUTABLE = IDENTIFIABLE__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__ELIMINATED = IDENTIFIABLE__ELIMINATED;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__ATTRIBUTE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE__VALUE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ATTRIBUTE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DiffModel.impl.SetReferenceImpl <em>Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.SetReferenceImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getSetReference()
	 * @generated
	 */
	int SET_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__EXECUTABLE = IDENTIFIABLE__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__ELIMINATED = IDENTIFIABLE__ELIMINATED;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__REFERENCE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE__REF_ID = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_REFERENCE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DiffModel.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DiffModel.impl.MoveImpl
	 * @see DiffModel.impl.DiffModelPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__EXECUTABLE = IDENTIFIABLE__EXECUTABLE;

	/**
	 * The feature id for the '<em><b>Eliminated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ELIMINATED = IDENTIFIABLE__ELIMINATED;

	/**
	 * The feature id for the '<em><b>Container Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__CONTAINER_TARGET_ID = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__REFERENCE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DiffModel.DiffContainer <em>Diff Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Container</em>'.
	 * @see DiffModel.DiffContainer
	 * @generated
	 */
	EClass getDiffContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link DiffModel.DiffContainer#getCreateDiffs <em>Create Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Diffs</em>'.
	 * @see DiffModel.DiffContainer#getCreateDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_CreateDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DiffModel.DiffContainer#getDeleteDiffs <em>Delete Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Diffs</em>'.
	 * @see DiffModel.DiffContainer#getDeleteDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_DeleteDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DiffModel.DiffContainer#getSetAttrDiffs <em>Set Attr Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Attr Diffs</em>'.
	 * @see DiffModel.DiffContainer#getSetAttrDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_SetAttrDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DiffModel.DiffContainer#getSetRefDiffs <em>Set Ref Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Ref Diffs</em>'.
	 * @see DiffModel.DiffContainer#getSetRefDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_SetRefDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DiffModel.DiffContainer#getMoveDiffs <em>Move Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move Diffs</em>'.
	 * @see DiffModel.DiffContainer#getMoveDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_MoveDiffs();

	/**
	 * Returns the meta object for class '{@link DiffModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see DiffModel.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Create#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DiffModel.Create#getType()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Type();

	/**
	 * Returns the meta object for the attribute list '{@link DiffModel.Create#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see DiffModel.Create#getAttributes()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Attributes();

	/**
	 * Returns the meta object for the attribute list '{@link DiffModel.Create#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see DiffModel.Create#getValues()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Values();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Create#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see DiffModel.Create#getReference()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Reference();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Create#getContainerTargetID <em>Container Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Target ID</em>'.
	 * @see DiffModel.Create#getContainerTargetID()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_ContainerTargetID();

	/**
	 * Returns the meta object for class '{@link DiffModel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see DiffModel.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link DiffModel.SetAttribute <em>Set Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Attribute</em>'.
	 * @see DiffModel.SetAttribute
	 * @generated
	 */
	EClass getSetAttribute();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.SetAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see DiffModel.SetAttribute#getAttribute()
	 * @see #getSetAttribute()
	 * @generated
	 */
	EAttribute getSetAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.SetAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DiffModel.SetAttribute#getValue()
	 * @see #getSetAttribute()
	 * @generated
	 */
	EAttribute getSetAttribute_Value();

	/**
	 * Returns the meta object for class '{@link DiffModel.SetReference <em>Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Reference</em>'.
	 * @see DiffModel.SetReference
	 * @generated
	 */
	EClass getSetReference();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.SetReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see DiffModel.SetReference#getReference()
	 * @see #getSetReference()
	 * @generated
	 */
	EAttribute getSetReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.SetReference#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see DiffModel.SetReference#getRefID()
	 * @see #getSetReference()
	 * @generated
	 */
	EAttribute getSetReference_RefID();

	/**
	 * Returns the meta object for class '{@link DiffModel.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see DiffModel.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Identifiable#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see DiffModel.Identifiable#getID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ID();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Identifiable#getTargetID <em>Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target ID</em>'.
	 * @see DiffModel.Identifiable#getTargetID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_TargetID();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Identifiable#isExecutable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executable</em>'.
	 * @see DiffModel.Identifiable#isExecutable()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Executable();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Identifiable#isEliminated <em>Eliminated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eliminated</em>'.
	 * @see DiffModel.Identifiable#isEliminated()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Eliminated();

	/**
	 * Returns the meta object for class '{@link DiffModel.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see DiffModel.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Move#getContainerTargetID <em>Container Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Target ID</em>'.
	 * @see DiffModel.Move#getContainerTargetID()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_ContainerTargetID();

	/**
	 * Returns the meta object for the attribute '{@link DiffModel.Move#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see DiffModel.Move#getReference()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Reference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiffModelFactory getDiffModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DiffModel.impl.DiffContainerImpl <em>Diff Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.DiffContainerImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getDiffContainer()
		 * @generated
		 */
		EClass DIFF_CONTAINER = eINSTANCE.getDiffContainer();

		/**
		 * The meta object literal for the '<em><b>Create Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__CREATE_DIFFS = eINSTANCE.getDiffContainer_CreateDiffs();

		/**
		 * The meta object literal for the '<em><b>Delete Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__DELETE_DIFFS = eINSTANCE.getDiffContainer_DeleteDiffs();

		/**
		 * The meta object literal for the '<em><b>Set Attr Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__SET_ATTR_DIFFS = eINSTANCE.getDiffContainer_SetAttrDiffs();

		/**
		 * The meta object literal for the '<em><b>Set Ref Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__SET_REF_DIFFS = eINSTANCE.getDiffContainer_SetRefDiffs();

		/**
		 * The meta object literal for the '<em><b>Move Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__MOVE_DIFFS = eINSTANCE.getDiffContainer_MoveDiffs();

		/**
		 * The meta object literal for the '{@link DiffModel.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.CreateImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__TYPE = eINSTANCE.getCreate_Type();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__ATTRIBUTES = eINSTANCE.getCreate_Attributes();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__VALUES = eINSTANCE.getCreate_Values();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__REFERENCE = eINSTANCE.getCreate_Reference();

		/**
		 * The meta object literal for the '<em><b>Container Target ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__CONTAINER_TARGET_ID = eINSTANCE.getCreate_ContainerTargetID();

		/**
		 * The meta object literal for the '{@link DiffModel.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.DeleteImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link DiffModel.impl.SetAttributeImpl <em>Set Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.SetAttributeImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getSetAttribute()
		 * @generated
		 */
		EClass SET_ATTRIBUTE = eINSTANCE.getSetAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getSetAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_ATTRIBUTE__VALUE = eINSTANCE.getSetAttribute_Value();

		/**
		 * The meta object literal for the '{@link DiffModel.impl.SetReferenceImpl <em>Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.SetReferenceImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getSetReference()
		 * @generated
		 */
		EClass SET_REFERENCE = eINSTANCE.getSetReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_REFERENCE__REFERENCE = eINSTANCE.getSetReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_REFERENCE__REF_ID = eINSTANCE.getSetReference_RefID();

		/**
		 * The meta object literal for the '{@link DiffModel.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.IdentifiableImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_ID();

		/**
		 * The meta object literal for the '<em><b>Target ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__TARGET_ID = eINSTANCE.getIdentifiable_TargetID();

		/**
		 * The meta object literal for the '<em><b>Executable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__EXECUTABLE = eINSTANCE.getIdentifiable_Executable();

		/**
		 * The meta object literal for the '<em><b>Eliminated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ELIMINATED = eINSTANCE.getIdentifiable_Eliminated();

		/**
		 * The meta object literal for the '{@link DiffModel.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DiffModel.impl.MoveImpl
		 * @see DiffModel.impl.DiffModelPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Container Target ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__CONTAINER_TARGET_ID = eINSTANCE.getMove_ContainerTargetID();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__REFERENCE = eINSTANCE.getMove_Reference();

	}

} //DiffModelPackage
