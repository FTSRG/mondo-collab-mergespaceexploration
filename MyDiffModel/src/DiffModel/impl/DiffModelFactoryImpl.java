/**
 */
package DiffModel.impl;

import DiffModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffModelFactoryImpl extends EFactoryImpl implements DiffModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiffModelFactory init() {
		try {
			DiffModelFactory theDiffModelFactory = (DiffModelFactory)EPackage.Registry.INSTANCE.getEFactory(DiffModelPackage.eNS_URI);
			if (theDiffModelFactory != null) {
				return theDiffModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiffModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiffModelPackage.DIFF_CONTAINER: return createDiffContainer();
			case DiffModelPackage.CREATE: return createCreate();
			case DiffModelPackage.DELETE: return createDelete();
			case DiffModelPackage.SET_ATTRIBUTE: return createSetAttribute();
			case DiffModelPackage.SET_REFERENCE: return createSetReference();
			case DiffModelPackage.RESET_ATTRIBUTE: return createResetAttribute();
			case DiffModelPackage.RESET_REFERENCE: return createResetReference();
			case DiffModelPackage.ADD_TO_LIST: return createAddToList();
			case DiffModelPackage.REMOVE_FROM_LIST: return createRemoveFromList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffContainer createDiffContainer() {
		DiffContainerImpl diffContainer = new DiffContainerImpl();
		return diffContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAttribute createSetAttribute() {
		SetAttributeImpl setAttribute = new SetAttributeImpl();
		return setAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetReference createSetReference() {
		SetReferenceImpl setReference = new SetReferenceImpl();
		return setReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetAttribute createResetAttribute() {
		ResetAttributeImpl resetAttribute = new ResetAttributeImpl();
		return resetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResetReference createResetReference() {
		ResetReferenceImpl resetReference = new ResetReferenceImpl();
		return resetReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddToList createAddToList() {
		AddToListImpl addToList = new AddToListImpl();
		return addToList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveFromList createRemoveFromList() {
		RemoveFromListImpl removeFromList = new RemoveFromListImpl();
		return removeFromList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffModelPackage getDiffModelPackage() {
		return (DiffModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiffModelPackage getPackage() {
		return DiffModelPackage.eINSTANCE;
	}

} //DiffModelFactoryImpl
