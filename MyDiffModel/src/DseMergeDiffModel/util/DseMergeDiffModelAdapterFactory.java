/**
 */
package DseMergeDiffModel.util;

import DseMergeDiffModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see DseMergeDiffModel.DseMergeDiffModelPackage
 * @generated
 */
public class DseMergeDiffModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DseMergeDiffModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DseMergeDiffModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DseMergeDiffModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DseMergeDiffModelSwitch<Adapter> modelSwitch =
		new DseMergeDiffModelSwitch<Adapter>() {
			@Override
			public Adapter caseDiffContainer(DiffContainer object) {
				return createDiffContainerAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseSetAttribute(SetAttribute object) {
				return createSetAttributeAdapter();
			}
			@Override
			public Adapter caseSetReference(SetReference object) {
				return createSetReferenceAdapter();
			}
			@Override
			public Adapter caseResetAttribute(ResetAttribute object) {
				return createResetAttributeAdapter();
			}
			@Override
			public Adapter caseResetReference(ResetReference object) {
				return createResetReferenceAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.DiffContainer <em>Diff Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.DiffContainer
	 * @generated
	 */
	public Adapter createDiffContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.SetAttribute <em>Set Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.SetAttribute
	 * @generated
	 */
	public Adapter createSetAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.SetReference <em>Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.SetReference
	 * @generated
	 */
	public Adapter createSetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.ResetAttribute <em>Reset Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.ResetAttribute
	 * @generated
	 */
	public Adapter createResetAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.ResetReference <em>Reset Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.ResetReference
	 * @generated
	 */
	public Adapter createResetReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link DseMergeDiffModel.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see DseMergeDiffModel.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DseMergeDiffModelAdapterFactory
