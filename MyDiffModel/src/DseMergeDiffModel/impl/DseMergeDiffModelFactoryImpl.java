/**
 */
package DseMergeDiffModel.impl;

import DseMergeDiffModel.*;

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
public class DseMergeDiffModelFactoryImpl extends EFactoryImpl implements DseMergeDiffModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DseMergeDiffModelFactory init() {
		try {
			DseMergeDiffModelFactory theDseMergeDiffModelFactory = (DseMergeDiffModelFactory)EPackage.Registry.INSTANCE.getEFactory(DseMergeDiffModelPackage.eNS_URI);
			if (theDseMergeDiffModelFactory != null) {
				return theDseMergeDiffModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DseMergeDiffModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseMergeDiffModelFactoryImpl() {
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
			case DseMergeDiffModelPackage.DIFF_CONTAINER: return createDiffContainer();
			case DseMergeDiffModelPackage.CREATE: return createCreate();
			case DseMergeDiffModelPackage.DELETE: return createDelete();
			case DseMergeDiffModelPackage.SET_ATTRIBUTE: return createSetAttribute();
			case DseMergeDiffModelPackage.SET_REFERENCE: return createSetReference();
			case DseMergeDiffModelPackage.RESET_ATTRIBUTE: return createResetAttribute();
			case DseMergeDiffModelPackage.RESET_REFERENCE: return createResetReference();
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
	public DseMergeDiffModelPackage getDseMergeDiffModelPackage() {
		return (DseMergeDiffModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DseMergeDiffModelPackage getPackage() {
		return DseMergeDiffModelPackage.eINSTANCE;
	}

} //DseMergeDiffModelFactoryImpl
