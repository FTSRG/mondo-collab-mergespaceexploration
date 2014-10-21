/**
 */
package versioncontainer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import versioncontainer.MainRoot;
import versioncontainer.VersioncontainerFactory;
import versioncontainer.VersioncontainerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersioncontainerPackageImpl extends EPackageImpl implements VersioncontainerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainRootEClass = null;

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
	 * @see versioncontainer.VersioncontainerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VersioncontainerPackageImpl() {
		super(eNS_URI, VersioncontainerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VersioncontainerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VersioncontainerPackage init() {
		if (isInited) return (VersioncontainerPackage)EPackage.Registry.INSTANCE.getEPackage(VersioncontainerPackage.eNS_URI);

		// Obtain or create and register package
		VersioncontainerPackageImpl theVersioncontainerPackage = (VersioncontainerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VersioncontainerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VersioncontainerPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVersioncontainerPackage.createPackageContents();

		// Initialize created meta-data
		theVersioncontainerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVersioncontainerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VersioncontainerPackage.eNS_URI, theVersioncontainerPackage);
		return theVersioncontainerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainRoot() {
		return mainRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainRoot_Original() {
		return (EReference)mainRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainRoot_Local() {
		return (EReference)mainRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainRoot_Remote() {
		return (EReference)mainRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersioncontainerFactory getVersioncontainerFactory() {
		return (VersioncontainerFactory)getEFactoryInstance();
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
		mainRootEClass = createEClass(MAIN_ROOT);
		createEReference(mainRootEClass, MAIN_ROOT__ORIGINAL);
		createEReference(mainRootEClass, MAIN_ROOT__LOCAL);
		createEReference(mainRootEClass, MAIN_ROOT__REMOTE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(mainRootEClass, MainRoot.class, "MainRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainRoot_Original(), ecorePackage.getEObject(), null, "original", null, 0, 1, MainRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainRoot_Local(), ecorePackage.getEObject(), null, "local", null, 0, 1, MainRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainRoot_Remote(), ecorePackage.getEObject(), null, "remote", null, 0, 1, MainRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //VersioncontainerPackageImpl
