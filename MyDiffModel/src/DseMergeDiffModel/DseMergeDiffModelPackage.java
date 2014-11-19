/**
 */
package DseMergeDiffModel;

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
 * @see DseMergeDiffModel.DseMergeDiffModelFactory
 * @model kind="package"
 * @generated
 */
public interface DseMergeDiffModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DseMergeDiffModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dsemerge.diffmodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsemdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DseMergeDiffModelPackage eINSTANCE = DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link DseMergeDiffModel.impl.DiffContainerImpl <em>Diff Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.DiffContainerImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getDiffContainer()
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
	 * The feature id for the '<em><b>Reset Attr Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__RESET_ATTR_DIFFS = 4;

	/**
	 * The feature id for the '<em><b>Reset Ref Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER__RESET_REF_DIFFS = 5;

	/**
	 * The number of structural features of the '<em>Diff Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Diff Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DseMergeDiffModel.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.IdentifiableImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 7;

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
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DseMergeDiffModel.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.CreateImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getCreate()
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
	 * The meta object id for the '{@link DseMergeDiffModel.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.DeleteImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getDelete()
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
	 * The meta object id for the '{@link DseMergeDiffModel.impl.SetAttributeImpl <em>Set Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.SetAttributeImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getSetAttribute()
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
	 * The meta object id for the '{@link DseMergeDiffModel.impl.SetReferenceImpl <em>Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.SetReferenceImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getSetReference()
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
	 * The meta object id for the '{@link DseMergeDiffModel.impl.ResetAttributeImpl <em>Reset Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.ResetAttributeImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getResetAttribute()
	 * @generated
	 */
	int RESET_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_ATTRIBUTE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_ATTRIBUTE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_ATTRIBUTE__ATTRIBUTE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reset Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_ATTRIBUTE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reset Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_ATTRIBUTE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link DseMergeDiffModel.impl.ResetReferenceImpl <em>Reset Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DseMergeDiffModel.impl.ResetReferenceImpl
	 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getResetReference()
	 * @generated
	 */
	int RESET_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REFERENCE__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Target ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REFERENCE__TARGET_ID = IDENTIFIABLE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REFERENCE__REFERENCE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REFERENCE__REF_ID = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reset Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REFERENCE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reset Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESET_REFERENCE_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.DiffContainer <em>Diff Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Container</em>'.
	 * @see DseMergeDiffModel.DiffContainer
	 * @generated
	 */
	EClass getDiffContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link DseMergeDiffModel.DiffContainer#getCreateDiffs <em>Create Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create Diffs</em>'.
	 * @see DseMergeDiffModel.DiffContainer#getCreateDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_CreateDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DseMergeDiffModel.DiffContainer#getDeleteDiffs <em>Delete Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete Diffs</em>'.
	 * @see DseMergeDiffModel.DiffContainer#getDeleteDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_DeleteDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DseMergeDiffModel.DiffContainer#getSetAttrDiffs <em>Set Attr Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Attr Diffs</em>'.
	 * @see DseMergeDiffModel.DiffContainer#getSetAttrDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_SetAttrDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DseMergeDiffModel.DiffContainer#getSetRefDiffs <em>Set Ref Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Set Ref Diffs</em>'.
	 * @see DseMergeDiffModel.DiffContainer#getSetRefDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_SetRefDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DseMergeDiffModel.DiffContainer#getResetAttrDiffs <em>Reset Attr Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reset Attr Diffs</em>'.
	 * @see DseMergeDiffModel.DiffContainer#getResetAttrDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_ResetAttrDiffs();

	/**
	 * Returns the meta object for the containment reference list '{@link DseMergeDiffModel.DiffContainer#getResetRefDiffs <em>Reset Ref Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reset Ref Diffs</em>'.
	 * @see DseMergeDiffModel.DiffContainer#getResetRefDiffs()
	 * @see #getDiffContainer()
	 * @generated
	 */
	EReference getDiffContainer_ResetRefDiffs();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see DseMergeDiffModel.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.Create#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see DseMergeDiffModel.Create#getType()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Type();

	/**
	 * Returns the meta object for the attribute list '{@link DseMergeDiffModel.Create#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see DseMergeDiffModel.Create#getAttributes()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Attributes();

	/**
	 * Returns the meta object for the attribute list '{@link DseMergeDiffModel.Create#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see DseMergeDiffModel.Create#getValues()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Values();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.Create#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see DseMergeDiffModel.Create#getReference()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Reference();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.Create#getContainerTargetID <em>Container Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Target ID</em>'.
	 * @see DseMergeDiffModel.Create#getContainerTargetID()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_ContainerTargetID();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see DseMergeDiffModel.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.SetAttribute <em>Set Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Attribute</em>'.
	 * @see DseMergeDiffModel.SetAttribute
	 * @generated
	 */
	EClass getSetAttribute();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.SetAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see DseMergeDiffModel.SetAttribute#getAttribute()
	 * @see #getSetAttribute()
	 * @generated
	 */
	EAttribute getSetAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.SetAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DseMergeDiffModel.SetAttribute#getValue()
	 * @see #getSetAttribute()
	 * @generated
	 */
	EAttribute getSetAttribute_Value();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.SetReference <em>Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Reference</em>'.
	 * @see DseMergeDiffModel.SetReference
	 * @generated
	 */
	EClass getSetReference();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.SetReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see DseMergeDiffModel.SetReference#getReference()
	 * @see #getSetReference()
	 * @generated
	 */
	EAttribute getSetReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.SetReference#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see DseMergeDiffModel.SetReference#getRefID()
	 * @see #getSetReference()
	 * @generated
	 */
	EAttribute getSetReference_RefID();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.ResetAttribute <em>Reset Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Attribute</em>'.
	 * @see DseMergeDiffModel.ResetAttribute
	 * @generated
	 */
	EClass getResetAttribute();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.ResetAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see DseMergeDiffModel.ResetAttribute#getAttribute()
	 * @see #getResetAttribute()
	 * @generated
	 */
	EAttribute getResetAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.ResetReference <em>Reset Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reset Reference</em>'.
	 * @see DseMergeDiffModel.ResetReference
	 * @generated
	 */
	EClass getResetReference();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.ResetReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see DseMergeDiffModel.ResetReference#getReference()
	 * @see #getResetReference()
	 * @generated
	 */
	EAttribute getResetReference_Reference();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.ResetReference#getRefID <em>Ref ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref ID</em>'.
	 * @see DseMergeDiffModel.ResetReference#getRefID()
	 * @see #getResetReference()
	 * @generated
	 */
	EAttribute getResetReference_RefID();

	/**
	 * Returns the meta object for class '{@link DseMergeDiffModel.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see DseMergeDiffModel.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.Identifiable#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see DseMergeDiffModel.Identifiable#getID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ID();

	/**
	 * Returns the meta object for the attribute '{@link DseMergeDiffModel.Identifiable#getTargetID <em>Target ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target ID</em>'.
	 * @see DseMergeDiffModel.Identifiable#getTargetID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_TargetID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DseMergeDiffModelFactory getDseMergeDiffModelFactory();

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
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.DiffContainerImpl <em>Diff Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.DiffContainerImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getDiffContainer()
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
		 * The meta object literal for the '<em><b>Reset Attr Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__RESET_ATTR_DIFFS = eINSTANCE.getDiffContainer_ResetAttrDiffs();

		/**
		 * The meta object literal for the '<em><b>Reset Ref Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_CONTAINER__RESET_REF_DIFFS = eINSTANCE.getDiffContainer_ResetRefDiffs();

		/**
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.CreateImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getCreate()
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
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.DeleteImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.SetAttributeImpl <em>Set Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.SetAttributeImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getSetAttribute()
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
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.SetReferenceImpl <em>Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.SetReferenceImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getSetReference()
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
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.ResetAttributeImpl <em>Reset Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.ResetAttributeImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getResetAttribute()
		 * @generated
		 */
		EClass RESET_ATTRIBUTE = eINSTANCE.getResetAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getResetAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.ResetReferenceImpl <em>Reset Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.ResetReferenceImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getResetReference()
		 * @generated
		 */
		EClass RESET_REFERENCE = eINSTANCE.getResetReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET_REFERENCE__REFERENCE = eINSTANCE.getResetReference_Reference();

		/**
		 * The meta object literal for the '<em><b>Ref ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESET_REFERENCE__REF_ID = eINSTANCE.getResetReference_RefID();

		/**
		 * The meta object literal for the '{@link DseMergeDiffModel.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DseMergeDiffModel.impl.IdentifiableImpl
		 * @see DseMergeDiffModel.impl.DseMergeDiffModelPackageImpl#getIdentifiable()
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

	}

} //DseMergeDiffModelPackage
