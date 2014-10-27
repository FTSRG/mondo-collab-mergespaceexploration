/**
 */
package DiffModel.impl;

import DiffModel.AddToList;
import DiffModel.Create;
import DiffModel.Delete;
import DiffModel.DiffContainer;
import DiffModel.DiffModelFactory;
import DiffModel.DiffModelPackage;
import DiffModel.Identifiable;
import DiffModel.RemoveFromList;
import DiffModel.ResetAttribute;
import DiffModel.ResetReference;
import DiffModel.SetAttribute;
import DiffModel.SetReference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffModelPackageImpl extends EPackageImpl implements DiffModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resetReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addToListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeFromListEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see DiffModel.DiffModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiffModelPackageImpl() {
		super(eNS_URI, DiffModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DiffModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiffModelPackage init() {
		if (isInited) return (DiffModelPackage)EPackage.Registry.INSTANCE.getEPackage(DiffModelPackage.eNS_URI);

		// Obtain or create and register package
		DiffModelPackageImpl theDiffModelPackage = (DiffModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DiffModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DiffModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDiffModelPackage.createPackageContents();

		// Initialize created meta-data
		theDiffModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDiffModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiffModelPackage.eNS_URI, theDiffModelPackage);
		return theDiffModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiffContainer() {
		return diffContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_CreateDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_DeleteDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_SetAttrDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_SetRefDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_ResetAttrDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_ResetRefDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_AddToListDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiffContainer_RemoveFromListDiffs() {
		return (EReference)diffContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreate_Type() {
		return (EAttribute)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAttribute() {
		return setAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAttribute_Attribute() {
		return (EAttribute)setAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAttribute_Value() {
		return (EAttribute)setAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetReference() {
		return setReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetReference_Reference() {
		return (EAttribute)setReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetReference_RefID() {
		return (EAttribute)setReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetAttribute() {
		return resetAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetAttribute_Attribute() {
		return (EAttribute)resetAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResetReference() {
		return resetReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResetReference_Reference() {
		return (EAttribute)resetReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_TargetId() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddToList() {
		return addToListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddToList_List() {
		return (EAttribute)addToListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddToList_RefID() {
		return (EAttribute)addToListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveFromList() {
		return removeFromListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveFromList_List() {
		return (EAttribute)removeFromListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveFromList_RefID() {
		return (EAttribute)removeFromListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModelFactory getDiffModelFactory() {
		return (DiffModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diffContainerEClass = createEClass(DIFF_CONTAINER);
		createEReference(diffContainerEClass, DIFF_CONTAINER__CREATE_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__DELETE_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__SET_ATTR_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__SET_REF_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__RESET_ATTR_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__RESET_REF_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__ADD_TO_LIST_DIFFS);
		createEReference(diffContainerEClass, DIFF_CONTAINER__REMOVE_FROM_LIST_DIFFS);

		createEClass = createEClass(CREATE);
		createEAttribute(createEClass, CREATE__TYPE);

		deleteEClass = createEClass(DELETE);

		setAttributeEClass = createEClass(SET_ATTRIBUTE);
		createEAttribute(setAttributeEClass, SET_ATTRIBUTE__ATTRIBUTE);
		createEAttribute(setAttributeEClass, SET_ATTRIBUTE__VALUE);

		setReferenceEClass = createEClass(SET_REFERENCE);
		createEAttribute(setReferenceEClass, SET_REFERENCE__REFERENCE);
		createEAttribute(setReferenceEClass, SET_REFERENCE__REF_ID);

		resetAttributeEClass = createEClass(RESET_ATTRIBUTE);
		createEAttribute(resetAttributeEClass, RESET_ATTRIBUTE__ATTRIBUTE);

		resetReferenceEClass = createEClass(RESET_REFERENCE);
		createEAttribute(resetReferenceEClass, RESET_REFERENCE__REFERENCE);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__TARGET_ID);

		addToListEClass = createEClass(ADD_TO_LIST);
		createEAttribute(addToListEClass, ADD_TO_LIST__LIST);
		createEAttribute(addToListEClass, ADD_TO_LIST__REF_ID);

		removeFromListEClass = createEClass(REMOVE_FROM_LIST);
		createEAttribute(removeFromListEClass, REMOVE_FROM_LIST__LIST);
		createEAttribute(removeFromListEClass, REMOVE_FROM_LIST__REF_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		createEClass.getESuperTypes().add(this.getIdentifiable());
		deleteEClass.getESuperTypes().add(this.getIdentifiable());
		setAttributeEClass.getESuperTypes().add(this.getIdentifiable());
		setReferenceEClass.getESuperTypes().add(this.getIdentifiable());
		resetAttributeEClass.getESuperTypes().add(this.getIdentifiable());
		resetReferenceEClass.getESuperTypes().add(this.getIdentifiable());
		addToListEClass.getESuperTypes().add(this.getIdentifiable());
		removeFromListEClass.getESuperTypes().add(this.getIdentifiable());

		// Initialize classes, features, and operations; add parameters
		initEClass(diffContainerEClass, DiffContainer.class, "DiffContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiffContainer_CreateDiffs(), this.getCreate(), null, "CreateDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_DeleteDiffs(), this.getDelete(), null, "DeleteDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_SetAttrDiffs(), this.getSetAttribute(), null, "SetAttrDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_SetRefDiffs(), this.getSetReference(), null, "SetRefDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_ResetAttrDiffs(), this.getResetAttribute(), null, "ResetAttrDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_ResetRefDiffs(), this.getResetReference(), null, "ResetRefDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_AddToListDiffs(), this.getAddToList(), null, "AddToListDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiffContainer_RemoveFromListDiffs(), this.getRemoveFromList(), null, "RemoveFromListDiffs", null, 0, -1, DiffContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreate_Type(), ecorePackage.getEString(), "type", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setAttributeEClass, SetAttribute.class, "SetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, SetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, SetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setReferenceEClass, SetReference.class, "SetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetReference_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, SetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetReference_RefID(), ecorePackage.getEString(), "refID", null, 0, 1, SetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetAttributeEClass, ResetAttribute.class, "ResetAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResetAttribute_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, ResetAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resetReferenceEClass, ResetReference.class, "ResetReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResetReference_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ResetReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_TargetId(), ecorePackage.getEString(), "targetId", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addToListEClass, AddToList.class, "AddToList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddToList_List(), ecorePackage.getEString(), "list", null, 0, 1, AddToList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddToList_RefID(), ecorePackage.getEString(), "refID", null, 0, 1, AddToList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeFromListEClass, RemoveFromList.class, "RemoveFromList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveFromList_List(), ecorePackage.getEString(), "list", null, 0, 1, RemoveFromList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveFromList_RefID(), ecorePackage.getEString(), "refID", null, 0, 1, RemoveFromList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DiffModelPackageImpl
