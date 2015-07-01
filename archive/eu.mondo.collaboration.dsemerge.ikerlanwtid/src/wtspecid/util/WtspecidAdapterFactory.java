/**
 */
package wtspecid.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wtspecid.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wtspecid.WtspecidPackage
 * @generated
 */
public class WtspecidAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WtspecidPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WtspecidAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WtspecidPackage.eINSTANCE;
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
	protected WtspecidSwitch<Adapter> modelSwitch =
		new WtspecidSwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiableWTElement(IdentifiableWTElement object) {
				return createIdentifiableWTElementAdapter();
			}
			@Override
			public Adapter caseWT(WT object) {
				return createWTAdapter();
			}
			@Override
			public Adapter caseSystemInput(SystemInput object) {
				return createSystemInputAdapter();
			}
			@Override
			public Adapter caseSystemOutput(SystemOutput object) {
				return createSystemOutputAdapter();
			}
			@Override
			public Adapter caseSystemFault(SystemFault object) {
				return createSystemFaultAdapter();
			}
			@Override
			public Adapter caseSystemParam(SystemParam object) {
				return createSystemParamAdapter();
			}
			@Override
			public Adapter caseSystemTimer(SystemTimer object) {
				return createSystemTimerAdapter();
			}
			@Override
			public Adapter caseSystemVariable(SystemVariable object) {
				return createSystemVariableAdapter();
			}
			@Override
			public Adapter caseSystemErrorReaction(SystemErrorReaction object) {
				return createSystemErrorReactionAdapter();
			}
			@Override
			public Adapter caseWTCInput(WTCInput object) {
				return createWTCInputAdapter();
			}
			@Override
			public Adapter caseWTCOutput(WTCOutput object) {
				return createWTCOutputAdapter();
			}
			@Override
			public Adapter caseWTCParam(WTCParam object) {
				return createWTCParamAdapter();
			}
			@Override
			public Adapter caseWTCTimer(WTCTimer object) {
				return createWTCTimerAdapter();
			}
			@Override
			public Adapter caseWTCFault(WTCFault object) {
				return createWTCFaultAdapter();
			}
			@Override
			public Adapter caseWTCErrorReaction(WTCErrorReaction object) {
				return createWTCErrorReactionAdapter();
			}
			@Override
			public Adapter caseSubsystem(Subsystem object) {
				return createSubsystemAdapter();
			}
			@Override
			public Adapter casewtc(wtc object) {
				return createwtcAdapter();
			}
			@Override
			public Adapter caseCtrlUnit1(CtrlUnit1 object) {
				return createCtrlUnit1Adapter();
			}
			@Override
			public Adapter caseCtrlUnit2(CtrlUnit2 object) {
				return createCtrlUnit2Adapter();
			}
			@Override
			public Adapter caseCtrlUnit3(CtrlUnit3 object) {
				return createCtrlUnit3Adapter();
			}
			@Override
			public Adapter caseCtrlUnit4(CtrlUnit4 object) {
				return createCtrlUnit4Adapter();
			}
			@Override
			public Adapter caseCtrlUnit5(CtrlUnit5 object) {
				return createCtrlUnit5Adapter();
			}
			@Override
			public Adapter caseCtrlUnit6(CtrlUnit6 object) {
				return createCtrlUnit6Adapter();
			}
			@Override
			public Adapter caseCtrlUnit7(CtrlUnit7 object) {
				return createCtrlUnit7Adapter();
			}
			@Override
			public Adapter caseCtrlUnit8(CtrlUnit8 object) {
				return createCtrlUnit8Adapter();
			}
			@Override
			public Adapter caseCtrlUnit9(CtrlUnit9 object) {
				return createCtrlUnit9Adapter();
			}
			@Override
			public Adapter caseCtrlUnit10(CtrlUnit10 object) {
				return createCtrlUnit10Adapter();
			}
			@Override
			public Adapter caseCtrlUnit11(CtrlUnit11 object) {
				return createCtrlUnit11Adapter();
			}
			@Override
			public Adapter caseCtrlUnit12(CtrlUnit12 object) {
				return createCtrlUnit12Adapter();
			}
			@Override
			public Adapter caseCtrlUnit13(CtrlUnit13 object) {
				return createCtrlUnit13Adapter();
			}
			@Override
			public Adapter caseCtrlUnit14(CtrlUnit14 object) {
				return createCtrlUnit14Adapter();
			}
			@Override
			public Adapter caseCtrlUnit15(CtrlUnit15 object) {
				return createCtrlUnit15Adapter();
			}
			@Override
			public Adapter caseCtrlUnit16(CtrlUnit16 object) {
				return createCtrlUnit16Adapter();
			}
			@Override
			public Adapter caseCtrlUnit17(CtrlUnit17 object) {
				return createCtrlUnit17Adapter();
			}
			@Override
			public Adapter caseCtrlUnit18(CtrlUnit18 object) {
				return createCtrlUnit18Adapter();
			}
			@Override
			public Adapter caseCtrlUnit19(CtrlUnit19 object) {
				return createCtrlUnit19Adapter();
			}
			@Override
			public Adapter caseCtrlUnit20(CtrlUnit20 object) {
				return createCtrlUnit20Adapter();
			}
			@Override
			public Adapter caseCtrlUnit21(CtrlUnit21 object) {
				return createCtrlUnit21Adapter();
			}
			@Override
			public Adapter caseCtrlUnit22(CtrlUnit22 object) {
				return createCtrlUnit22Adapter();
			}
			@Override
			public Adapter caseCtrlUnit23(CtrlUnit23 object) {
				return createCtrlUnit23Adapter();
			}
			@Override
			public Adapter caseCtrlUnit24(CtrlUnit24 object) {
				return createCtrlUnit24Adapter();
			}
			@Override
			public Adapter caseCtrlUnit25(CtrlUnit25 object) {
				return createCtrlUnit25Adapter();
			}
			@Override
			public Adapter caseCtrlUnit26(CtrlUnit26 object) {
				return createCtrlUnit26Adapter();
			}
			@Override
			public Adapter caseCtrlUnit27(CtrlUnit27 object) {
				return createCtrlUnit27Adapter();
			}
			@Override
			public Adapter caseCtrlUnit28(CtrlUnit28 object) {
				return createCtrlUnit28Adapter();
			}
			@Override
			public Adapter caseCtrlUnit29(CtrlUnit29 object) {
				return createCtrlUnit29Adapter();
			}
			@Override
			public Adapter caseCtrlUnit30(CtrlUnit30 object) {
				return createCtrlUnit30Adapter();
			}
			@Override
			public Adapter caseCtrlUnit31(CtrlUnit31 object) {
				return createCtrlUnit31Adapter();
			}
			@Override
			public Adapter caseCtrlUnit32(CtrlUnit32 object) {
				return createCtrlUnit32Adapter();
			}
			@Override
			public Adapter caseCtrlUnit33(CtrlUnit33 object) {
				return createCtrlUnit33Adapter();
			}
			@Override
			public Adapter caseCtrlUnit34(CtrlUnit34 object) {
				return createCtrlUnit34Adapter();
			}
			@Override
			public Adapter caseCtrlUnit35(CtrlUnit35 object) {
				return createCtrlUnit35Adapter();
			}
			@Override
			public Adapter caseCtrlUnit36(CtrlUnit36 object) {
				return createCtrlUnit36Adapter();
			}
			@Override
			public Adapter caseCtrlUnit37(CtrlUnit37 object) {
				return createCtrlUnit37Adapter();
			}
			@Override
			public Adapter caseCtrlUnit38(CtrlUnit38 object) {
				return createCtrlUnit38Adapter();
			}
			@Override
			public Adapter caseCtrlUnit39(CtrlUnit39 object) {
				return createCtrlUnit39Adapter();
			}
			@Override
			public Adapter caseCtrlUnit40(CtrlUnit40 object) {
				return createCtrlUnit40Adapter();
			}
			@Override
			public Adapter caseCtrlUnit41(CtrlUnit41 object) {
				return createCtrlUnit41Adapter();
			}
			@Override
			public Adapter caseCtrlUnit42(CtrlUnit42 object) {
				return createCtrlUnit42Adapter();
			}
			@Override
			public Adapter caseCtrlUnit43(CtrlUnit43 object) {
				return createCtrlUnit43Adapter();
			}
			@Override
			public Adapter caseCtrlUnit44(CtrlUnit44 object) {
				return createCtrlUnit44Adapter();
			}
			@Override
			public Adapter caseCtrlUnit45(CtrlUnit45 object) {
				return createCtrlUnit45Adapter();
			}
			@Override
			public Adapter caseCtrlUnit46(CtrlUnit46 object) {
				return createCtrlUnit46Adapter();
			}
			@Override
			public Adapter caseCtrlUnit47(CtrlUnit47 object) {
				return createCtrlUnit47Adapter();
			}
			@Override
			public Adapter caseCtrlUnit48(CtrlUnit48 object) {
				return createCtrlUnit48Adapter();
			}
			@Override
			public Adapter caseCtrlUnit49(CtrlUnit49 object) {
				return createCtrlUnit49Adapter();
			}
			@Override
			public Adapter caseCtrlUnit50(CtrlUnit50 object) {
				return createCtrlUnit50Adapter();
			}
			@Override
			public Adapter caseCtrlUnit51(CtrlUnit51 object) {
				return createCtrlUnit51Adapter();
			}
			@Override
			public Adapter caseCtrlUnit52(CtrlUnit52 object) {
				return createCtrlUnit52Adapter();
			}
			@Override
			public Adapter caseCtrlUnit53(CtrlUnit53 object) {
				return createCtrlUnit53Adapter();
			}
			@Override
			public Adapter caseCtrlUnit54(CtrlUnit54 object) {
				return createCtrlUnit54Adapter();
			}
			@Override
			public Adapter caseCtrlUnit55(CtrlUnit55 object) {
				return createCtrlUnit55Adapter();
			}
			@Override
			public Adapter caseCtrlUnit56(CtrlUnit56 object) {
				return createCtrlUnit56Adapter();
			}
			@Override
			public Adapter caseCtrlUnit57(CtrlUnit57 object) {
				return createCtrlUnit57Adapter();
			}
			@Override
			public Adapter caseCtrlUnit58(CtrlUnit58 object) {
				return createCtrlUnit58Adapter();
			}
			@Override
			public Adapter caseCtrlUnit59(CtrlUnit59 object) {
				return createCtrlUnit59Adapter();
			}
			@Override
			public Adapter caseCtrlUnit60(CtrlUnit60 object) {
				return createCtrlUnit60Adapter();
			}
			@Override
			public Adapter caseCtrlUnit61(CtrlUnit61 object) {
				return createCtrlUnit61Adapter();
			}
			@Override
			public Adapter caseCtrlUnit62(CtrlUnit62 object) {
				return createCtrlUnit62Adapter();
			}
			@Override
			public Adapter caseCtrlUnit63(CtrlUnit63 object) {
				return createCtrlUnit63Adapter();
			}
			@Override
			public Adapter caseCtrlUnit64(CtrlUnit64 object) {
				return createCtrlUnit64Adapter();
			}
			@Override
			public Adapter caseCtrlUnit65(CtrlUnit65 object) {
				return createCtrlUnit65Adapter();
			}
			@Override
			public Adapter caseCtrlUnit66(CtrlUnit66 object) {
				return createCtrlUnit66Adapter();
			}
			@Override
			public Adapter caseCtrlUnit67(CtrlUnit67 object) {
				return createCtrlUnit67Adapter();
			}
			@Override
			public Adapter caseCtrlUnit68(CtrlUnit68 object) {
				return createCtrlUnit68Adapter();
			}
			@Override
			public Adapter caseCtrlUnit69(CtrlUnit69 object) {
				return createCtrlUnit69Adapter();
			}
			@Override
			public Adapter caseCtrlUnit70(CtrlUnit70 object) {
				return createCtrlUnit70Adapter();
			}
			@Override
			public Adapter caseCtrlUnit71(CtrlUnit71 object) {
				return createCtrlUnit71Adapter();
			}
			@Override
			public Adapter caseCtrlUnit72(CtrlUnit72 object) {
				return createCtrlUnit72Adapter();
			}
			@Override
			public Adapter caseCtrlUnit73(CtrlUnit73 object) {
				return createCtrlUnit73Adapter();
			}
			@Override
			public Adapter caseCtrlUnit74(CtrlUnit74 object) {
				return createCtrlUnit74Adapter();
			}
			@Override
			public Adapter caseCtrlUnit75(CtrlUnit75 object) {
				return createCtrlUnit75Adapter();
			}
			@Override
			public Adapter caseCtrlUnit76(CtrlUnit76 object) {
				return createCtrlUnit76Adapter();
			}
			@Override
			public Adapter caseCtrlUnit77(CtrlUnit77 object) {
				return createCtrlUnit77Adapter();
			}
			@Override
			public Adapter caseCtrlUnit78(CtrlUnit78 object) {
				return createCtrlUnit78Adapter();
			}
			@Override
			public Adapter caseCtrlUnit79(CtrlUnit79 object) {
				return createCtrlUnit79Adapter();
			}
			@Override
			public Adapter caseCtrlUnit80(CtrlUnit80 object) {
				return createCtrlUnit80Adapter();
			}
			@Override
			public Adapter caseCtrlUnit81(CtrlUnit81 object) {
				return createCtrlUnit81Adapter();
			}
			@Override
			public Adapter caseCtrlUnit82(CtrlUnit82 object) {
				return createCtrlUnit82Adapter();
			}
			@Override
			public Adapter caseCtrlUnit83(CtrlUnit83 object) {
				return createCtrlUnit83Adapter();
			}
			@Override
			public Adapter caseCtrlUnit84(CtrlUnit84 object) {
				return createCtrlUnit84Adapter();
			}
			@Override
			public Adapter caseCtrlUnit85(CtrlUnit85 object) {
				return createCtrlUnit85Adapter();
			}
			@Override
			public Adapter caseCtrlUnit86(CtrlUnit86 object) {
				return createCtrlUnit86Adapter();
			}
			@Override
			public Adapter caseCtrlUnit87(CtrlUnit87 object) {
				return createCtrlUnit87Adapter();
			}
			@Override
			public Adapter caseCtrlUnit88(CtrlUnit88 object) {
				return createCtrlUnit88Adapter();
			}
			@Override
			public Adapter caseCtrlUnit89(CtrlUnit89 object) {
				return createCtrlUnit89Adapter();
			}
			@Override
			public Adapter caseCtrlUnit90(CtrlUnit90 object) {
				return createCtrlUnit90Adapter();
			}
			@Override
			public Adapter caseCtrlUnit91(CtrlUnit91 object) {
				return createCtrlUnit91Adapter();
			}
			@Override
			public Adapter caseCtrlUnit92(CtrlUnit92 object) {
				return createCtrlUnit92Adapter();
			}
			@Override
			public Adapter caseCtrlUnit93(CtrlUnit93 object) {
				return createCtrlUnit93Adapter();
			}
			@Override
			public Adapter caseCtrlUnit94(CtrlUnit94 object) {
				return createCtrlUnit94Adapter();
			}
			@Override
			public Adapter caseCtrlUnit95(CtrlUnit95 object) {
				return createCtrlUnit95Adapter();
			}
			@Override
			public Adapter caseCtrlUnit96(CtrlUnit96 object) {
				return createCtrlUnit96Adapter();
			}
			@Override
			public Adapter caseCtrlUnit97(CtrlUnit97 object) {
				return createCtrlUnit97Adapter();
			}
			@Override
			public Adapter caseCtrlUnit98(CtrlUnit98 object) {
				return createCtrlUnit98Adapter();
			}
			@Override
			public Adapter caseCtrlUnit99(CtrlUnit99 object) {
				return createCtrlUnit99Adapter();
			}
			@Override
			public Adapter caseCtrlUnit100(CtrlUnit100 object) {
				return createCtrlUnit100Adapter();
			}
			@Override
			public Adapter caseCtrlUnit101(CtrlUnit101 object) {
				return createCtrlUnit101Adapter();
			}
			@Override
			public Adapter caseCtrlUnit102(CtrlUnit102 object) {
				return createCtrlUnit102Adapter();
			}
			@Override
			public Adapter caseCtrlUnit103(CtrlUnit103 object) {
				return createCtrlUnit103Adapter();
			}
			@Override
			public Adapter caseCtrlUnit104(CtrlUnit104 object) {
				return createCtrlUnit104Adapter();
			}
			@Override
			public Adapter caseCtrlUnit105(CtrlUnit105 object) {
				return createCtrlUnit105Adapter();
			}
			@Override
			public Adapter caseCtrlUnit106(CtrlUnit106 object) {
				return createCtrlUnit106Adapter();
			}
			@Override
			public Adapter caseCtrlUnit107(CtrlUnit107 object) {
				return createCtrlUnit107Adapter();
			}
			@Override
			public Adapter caseCtrlUnit108(CtrlUnit108 object) {
				return createCtrlUnit108Adapter();
			}
			@Override
			public Adapter caseCtrlUnit109(CtrlUnit109 object) {
				return createCtrlUnit109Adapter();
			}
			@Override
			public Adapter caseCtrlUnit110(CtrlUnit110 object) {
				return createCtrlUnit110Adapter();
			}
			@Override
			public Adapter caseCtrlUnit111(CtrlUnit111 object) {
				return createCtrlUnit111Adapter();
			}
			@Override
			public Adapter caseCtrlUnit112(CtrlUnit112 object) {
				return createCtrlUnit112Adapter();
			}
			@Override
			public Adapter caseCtrlUnit113(CtrlUnit113 object) {
				return createCtrlUnit113Adapter();
			}
			@Override
			public Adapter caseCtrlUnit114(CtrlUnit114 object) {
				return createCtrlUnit114Adapter();
			}
			@Override
			public Adapter caseCtrlUnit115(CtrlUnit115 object) {
				return createCtrlUnit115Adapter();
			}
			@Override
			public Adapter caseCtrlUnit116(CtrlUnit116 object) {
				return createCtrlUnit116Adapter();
			}
			@Override
			public Adapter caseCtrlUnit117(CtrlUnit117 object) {
				return createCtrlUnit117Adapter();
			}
			@Override
			public Adapter caseCtrlUnit118(CtrlUnit118 object) {
				return createCtrlUnit118Adapter();
			}
			@Override
			public Adapter caseCtrlUnit119(CtrlUnit119 object) {
				return createCtrlUnit119Adapter();
			}
			@Override
			public Adapter caseCtrlUnit120(CtrlUnit120 object) {
				return createCtrlUnit120Adapter();
			}
			@Override
			public Adapter caseCtrlUnit121(CtrlUnit121 object) {
				return createCtrlUnit121Adapter();
			}
			@Override
			public Adapter caseCtrlUnit122(CtrlUnit122 object) {
				return createCtrlUnit122Adapter();
			}
			@Override
			public Adapter caseCtrlUnit123(CtrlUnit123 object) {
				return createCtrlUnit123Adapter();
			}
			@Override
			public Adapter caseCtrlUnit124(CtrlUnit124 object) {
				return createCtrlUnit124Adapter();
			}
			@Override
			public Adapter caseCtrlUnit125(CtrlUnit125 object) {
				return createCtrlUnit125Adapter();
			}
			@Override
			public Adapter caseCtrlUnit126(CtrlUnit126 object) {
				return createCtrlUnit126Adapter();
			}
			@Override
			public Adapter caseCtrlUnit127(CtrlUnit127 object) {
				return createCtrlUnit127Adapter();
			}
			@Override
			public Adapter caseCtrlUnit128(CtrlUnit128 object) {
				return createCtrlUnit128Adapter();
			}
			@Override
			public Adapter caseCtrlUnit129(CtrlUnit129 object) {
				return createCtrlUnit129Adapter();
			}
			@Override
			public Adapter caseCtrlUnit130(CtrlUnit130 object) {
				return createCtrlUnit130Adapter();
			}
			@Override
			public Adapter caseCtrlUnit131(CtrlUnit131 object) {
				return createCtrlUnit131Adapter();
			}
			@Override
			public Adapter caseCtrlUnit132(CtrlUnit132 object) {
				return createCtrlUnit132Adapter();
			}
			@Override
			public Adapter caseCtrlUnit133(CtrlUnit133 object) {
				return createCtrlUnit133Adapter();
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
	 * Creates a new adapter for an object of class '{@link wtspecid.IdentifiableWTElement <em>Identifiable WT Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.IdentifiableWTElement
	 * @generated
	 */
	public Adapter createIdentifiableWTElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WT <em>WT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WT
	 * @generated
	 */
	public Adapter createWTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemInput <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemInput
	 * @generated
	 */
	public Adapter createSystemInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemOutput <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemOutput
	 * @generated
	 */
	public Adapter createSystemOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemFault <em>System Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemFault
	 * @generated
	 */
	public Adapter createSystemFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemParam <em>System Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemParam
	 * @generated
	 */
	public Adapter createSystemParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemTimer <em>System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemTimer
	 * @generated
	 */
	public Adapter createSystemTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemVariable <em>System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemVariable
	 * @generated
	 */
	public Adapter createSystemVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.SystemErrorReaction <em>System Error Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.SystemErrorReaction
	 * @generated
	 */
	public Adapter createSystemErrorReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WTCInput <em>WTC Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WTCInput
	 * @generated
	 */
	public Adapter createWTCInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WTCOutput <em>WTC Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WTCOutput
	 * @generated
	 */
	public Adapter createWTCOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WTCParam <em>WTC Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WTCParam
	 * @generated
	 */
	public Adapter createWTCParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WTCTimer <em>WTC Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WTCTimer
	 * @generated
	 */
	public Adapter createWTCTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WTCFault <em>WTC Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WTCFault
	 * @generated
	 */
	public Adapter createWTCFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.WTCErrorReaction <em>WTC Error Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.WTCErrorReaction
	 * @generated
	 */
	public Adapter createWTCErrorReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.Subsystem
	 * @generated
	 */
	public Adapter createSubsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.wtc <em>wtc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.wtc
	 * @generated
	 */
	public Adapter createwtcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit1 <em>Ctrl Unit1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit1
	 * @generated
	 */
	public Adapter createCtrlUnit1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit2 <em>Ctrl Unit2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit2
	 * @generated
	 */
	public Adapter createCtrlUnit2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit3 <em>Ctrl Unit3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit3
	 * @generated
	 */
	public Adapter createCtrlUnit3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit4 <em>Ctrl Unit4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit4
	 * @generated
	 */
	public Adapter createCtrlUnit4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit5 <em>Ctrl Unit5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit5
	 * @generated
	 */
	public Adapter createCtrlUnit5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit6 <em>Ctrl Unit6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit6
	 * @generated
	 */
	public Adapter createCtrlUnit6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit7 <em>Ctrl Unit7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit7
	 * @generated
	 */
	public Adapter createCtrlUnit7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit8 <em>Ctrl Unit8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit8
	 * @generated
	 */
	public Adapter createCtrlUnit8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit9 <em>Ctrl Unit9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit9
	 * @generated
	 */
	public Adapter createCtrlUnit9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit10 <em>Ctrl Unit10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit10
	 * @generated
	 */
	public Adapter createCtrlUnit10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit11 <em>Ctrl Unit11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit11
	 * @generated
	 */
	public Adapter createCtrlUnit11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit12 <em>Ctrl Unit12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit12
	 * @generated
	 */
	public Adapter createCtrlUnit12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit13 <em>Ctrl Unit13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit13
	 * @generated
	 */
	public Adapter createCtrlUnit13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit14 <em>Ctrl Unit14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit14
	 * @generated
	 */
	public Adapter createCtrlUnit14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit15 <em>Ctrl Unit15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit15
	 * @generated
	 */
	public Adapter createCtrlUnit15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit16 <em>Ctrl Unit16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit16
	 * @generated
	 */
	public Adapter createCtrlUnit16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit17 <em>Ctrl Unit17</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit17
	 * @generated
	 */
	public Adapter createCtrlUnit17Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit18 <em>Ctrl Unit18</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit18
	 * @generated
	 */
	public Adapter createCtrlUnit18Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit19 <em>Ctrl Unit19</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit19
	 * @generated
	 */
	public Adapter createCtrlUnit19Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit20 <em>Ctrl Unit20</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit20
	 * @generated
	 */
	public Adapter createCtrlUnit20Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit21 <em>Ctrl Unit21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit21
	 * @generated
	 */
	public Adapter createCtrlUnit21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit22 <em>Ctrl Unit22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit22
	 * @generated
	 */
	public Adapter createCtrlUnit22Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit23 <em>Ctrl Unit23</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit23
	 * @generated
	 */
	public Adapter createCtrlUnit23Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit24 <em>Ctrl Unit24</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit24
	 * @generated
	 */
	public Adapter createCtrlUnit24Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit25 <em>Ctrl Unit25</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit25
	 * @generated
	 */
	public Adapter createCtrlUnit25Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit26 <em>Ctrl Unit26</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit26
	 * @generated
	 */
	public Adapter createCtrlUnit26Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit27 <em>Ctrl Unit27</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit27
	 * @generated
	 */
	public Adapter createCtrlUnit27Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit28 <em>Ctrl Unit28</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit28
	 * @generated
	 */
	public Adapter createCtrlUnit28Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit29 <em>Ctrl Unit29</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit29
	 * @generated
	 */
	public Adapter createCtrlUnit29Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit30 <em>Ctrl Unit30</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit30
	 * @generated
	 */
	public Adapter createCtrlUnit30Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit31 <em>Ctrl Unit31</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit31
	 * @generated
	 */
	public Adapter createCtrlUnit31Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit32 <em>Ctrl Unit32</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit32
	 * @generated
	 */
	public Adapter createCtrlUnit32Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit33 <em>Ctrl Unit33</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit33
	 * @generated
	 */
	public Adapter createCtrlUnit33Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit34 <em>Ctrl Unit34</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit34
	 * @generated
	 */
	public Adapter createCtrlUnit34Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit35 <em>Ctrl Unit35</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit35
	 * @generated
	 */
	public Adapter createCtrlUnit35Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit36 <em>Ctrl Unit36</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit36
	 * @generated
	 */
	public Adapter createCtrlUnit36Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit37 <em>Ctrl Unit37</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit37
	 * @generated
	 */
	public Adapter createCtrlUnit37Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit38 <em>Ctrl Unit38</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit38
	 * @generated
	 */
	public Adapter createCtrlUnit38Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit39 <em>Ctrl Unit39</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit39
	 * @generated
	 */
	public Adapter createCtrlUnit39Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit40 <em>Ctrl Unit40</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit40
	 * @generated
	 */
	public Adapter createCtrlUnit40Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit41 <em>Ctrl Unit41</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit41
	 * @generated
	 */
	public Adapter createCtrlUnit41Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit42 <em>Ctrl Unit42</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit42
	 * @generated
	 */
	public Adapter createCtrlUnit42Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit43 <em>Ctrl Unit43</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit43
	 * @generated
	 */
	public Adapter createCtrlUnit43Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit44 <em>Ctrl Unit44</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit44
	 * @generated
	 */
	public Adapter createCtrlUnit44Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit45 <em>Ctrl Unit45</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit45
	 * @generated
	 */
	public Adapter createCtrlUnit45Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit46 <em>Ctrl Unit46</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit46
	 * @generated
	 */
	public Adapter createCtrlUnit46Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit47 <em>Ctrl Unit47</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit47
	 * @generated
	 */
	public Adapter createCtrlUnit47Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit48 <em>Ctrl Unit48</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit48
	 * @generated
	 */
	public Adapter createCtrlUnit48Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit49 <em>Ctrl Unit49</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit49
	 * @generated
	 */
	public Adapter createCtrlUnit49Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit50 <em>Ctrl Unit50</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit50
	 * @generated
	 */
	public Adapter createCtrlUnit50Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit51 <em>Ctrl Unit51</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit51
	 * @generated
	 */
	public Adapter createCtrlUnit51Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit52 <em>Ctrl Unit52</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit52
	 * @generated
	 */
	public Adapter createCtrlUnit52Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit53 <em>Ctrl Unit53</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit53
	 * @generated
	 */
	public Adapter createCtrlUnit53Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit54 <em>Ctrl Unit54</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit54
	 * @generated
	 */
	public Adapter createCtrlUnit54Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit55 <em>Ctrl Unit55</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit55
	 * @generated
	 */
	public Adapter createCtrlUnit55Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit56 <em>Ctrl Unit56</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit56
	 * @generated
	 */
	public Adapter createCtrlUnit56Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit57 <em>Ctrl Unit57</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit57
	 * @generated
	 */
	public Adapter createCtrlUnit57Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit58 <em>Ctrl Unit58</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit58
	 * @generated
	 */
	public Adapter createCtrlUnit58Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit59 <em>Ctrl Unit59</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit59
	 * @generated
	 */
	public Adapter createCtrlUnit59Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit60 <em>Ctrl Unit60</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit60
	 * @generated
	 */
	public Adapter createCtrlUnit60Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit61 <em>Ctrl Unit61</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit61
	 * @generated
	 */
	public Adapter createCtrlUnit61Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit62 <em>Ctrl Unit62</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit62
	 * @generated
	 */
	public Adapter createCtrlUnit62Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit63 <em>Ctrl Unit63</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit63
	 * @generated
	 */
	public Adapter createCtrlUnit63Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit64 <em>Ctrl Unit64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit64
	 * @generated
	 */
	public Adapter createCtrlUnit64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit65 <em>Ctrl Unit65</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit65
	 * @generated
	 */
	public Adapter createCtrlUnit65Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit66 <em>Ctrl Unit66</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit66
	 * @generated
	 */
	public Adapter createCtrlUnit66Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit67 <em>Ctrl Unit67</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit67
	 * @generated
	 */
	public Adapter createCtrlUnit67Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit68 <em>Ctrl Unit68</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit68
	 * @generated
	 */
	public Adapter createCtrlUnit68Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit69 <em>Ctrl Unit69</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit69
	 * @generated
	 */
	public Adapter createCtrlUnit69Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit70 <em>Ctrl Unit70</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit70
	 * @generated
	 */
	public Adapter createCtrlUnit70Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit71 <em>Ctrl Unit71</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit71
	 * @generated
	 */
	public Adapter createCtrlUnit71Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit72 <em>Ctrl Unit72</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit72
	 * @generated
	 */
	public Adapter createCtrlUnit72Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit73 <em>Ctrl Unit73</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit73
	 * @generated
	 */
	public Adapter createCtrlUnit73Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit74 <em>Ctrl Unit74</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit74
	 * @generated
	 */
	public Adapter createCtrlUnit74Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit75 <em>Ctrl Unit75</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit75
	 * @generated
	 */
	public Adapter createCtrlUnit75Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit76 <em>Ctrl Unit76</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit76
	 * @generated
	 */
	public Adapter createCtrlUnit76Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit77 <em>Ctrl Unit77</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit77
	 * @generated
	 */
	public Adapter createCtrlUnit77Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit78 <em>Ctrl Unit78</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit78
	 * @generated
	 */
	public Adapter createCtrlUnit78Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit79 <em>Ctrl Unit79</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit79
	 * @generated
	 */
	public Adapter createCtrlUnit79Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit80 <em>Ctrl Unit80</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit80
	 * @generated
	 */
	public Adapter createCtrlUnit80Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit81 <em>Ctrl Unit81</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit81
	 * @generated
	 */
	public Adapter createCtrlUnit81Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit82 <em>Ctrl Unit82</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit82
	 * @generated
	 */
	public Adapter createCtrlUnit82Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit83 <em>Ctrl Unit83</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit83
	 * @generated
	 */
	public Adapter createCtrlUnit83Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit84 <em>Ctrl Unit84</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit84
	 * @generated
	 */
	public Adapter createCtrlUnit84Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit85 <em>Ctrl Unit85</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit85
	 * @generated
	 */
	public Adapter createCtrlUnit85Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit86 <em>Ctrl Unit86</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit86
	 * @generated
	 */
	public Adapter createCtrlUnit86Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit87 <em>Ctrl Unit87</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit87
	 * @generated
	 */
	public Adapter createCtrlUnit87Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit88 <em>Ctrl Unit88</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit88
	 * @generated
	 */
	public Adapter createCtrlUnit88Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit89 <em>Ctrl Unit89</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit89
	 * @generated
	 */
	public Adapter createCtrlUnit89Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit90 <em>Ctrl Unit90</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit90
	 * @generated
	 */
	public Adapter createCtrlUnit90Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit91 <em>Ctrl Unit91</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit91
	 * @generated
	 */
	public Adapter createCtrlUnit91Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit92 <em>Ctrl Unit92</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit92
	 * @generated
	 */
	public Adapter createCtrlUnit92Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit93 <em>Ctrl Unit93</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit93
	 * @generated
	 */
	public Adapter createCtrlUnit93Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit94 <em>Ctrl Unit94</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit94
	 * @generated
	 */
	public Adapter createCtrlUnit94Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit95 <em>Ctrl Unit95</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit95
	 * @generated
	 */
	public Adapter createCtrlUnit95Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit96 <em>Ctrl Unit96</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit96
	 * @generated
	 */
	public Adapter createCtrlUnit96Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit97 <em>Ctrl Unit97</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit97
	 * @generated
	 */
	public Adapter createCtrlUnit97Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit98 <em>Ctrl Unit98</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit98
	 * @generated
	 */
	public Adapter createCtrlUnit98Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit99 <em>Ctrl Unit99</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit99
	 * @generated
	 */
	public Adapter createCtrlUnit99Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit100 <em>Ctrl Unit100</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit100
	 * @generated
	 */
	public Adapter createCtrlUnit100Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit101 <em>Ctrl Unit101</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit101
	 * @generated
	 */
	public Adapter createCtrlUnit101Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit102 <em>Ctrl Unit102</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit102
	 * @generated
	 */
	public Adapter createCtrlUnit102Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit103 <em>Ctrl Unit103</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit103
	 * @generated
	 */
	public Adapter createCtrlUnit103Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit104 <em>Ctrl Unit104</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit104
	 * @generated
	 */
	public Adapter createCtrlUnit104Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit105 <em>Ctrl Unit105</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit105
	 * @generated
	 */
	public Adapter createCtrlUnit105Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit106 <em>Ctrl Unit106</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit106
	 * @generated
	 */
	public Adapter createCtrlUnit106Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit107 <em>Ctrl Unit107</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit107
	 * @generated
	 */
	public Adapter createCtrlUnit107Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit108 <em>Ctrl Unit108</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit108
	 * @generated
	 */
	public Adapter createCtrlUnit108Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit109 <em>Ctrl Unit109</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit109
	 * @generated
	 */
	public Adapter createCtrlUnit109Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit110 <em>Ctrl Unit110</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit110
	 * @generated
	 */
	public Adapter createCtrlUnit110Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit111 <em>Ctrl Unit111</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit111
	 * @generated
	 */
	public Adapter createCtrlUnit111Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit112 <em>Ctrl Unit112</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit112
	 * @generated
	 */
	public Adapter createCtrlUnit112Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit113 <em>Ctrl Unit113</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit113
	 * @generated
	 */
	public Adapter createCtrlUnit113Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit114 <em>Ctrl Unit114</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit114
	 * @generated
	 */
	public Adapter createCtrlUnit114Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit115 <em>Ctrl Unit115</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit115
	 * @generated
	 */
	public Adapter createCtrlUnit115Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit116 <em>Ctrl Unit116</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit116
	 * @generated
	 */
	public Adapter createCtrlUnit116Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit117 <em>Ctrl Unit117</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit117
	 * @generated
	 */
	public Adapter createCtrlUnit117Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit118 <em>Ctrl Unit118</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit118
	 * @generated
	 */
	public Adapter createCtrlUnit118Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit119 <em>Ctrl Unit119</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit119
	 * @generated
	 */
	public Adapter createCtrlUnit119Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit120 <em>Ctrl Unit120</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit120
	 * @generated
	 */
	public Adapter createCtrlUnit120Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit121 <em>Ctrl Unit121</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit121
	 * @generated
	 */
	public Adapter createCtrlUnit121Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit122 <em>Ctrl Unit122</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit122
	 * @generated
	 */
	public Adapter createCtrlUnit122Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit123 <em>Ctrl Unit123</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit123
	 * @generated
	 */
	public Adapter createCtrlUnit123Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit124 <em>Ctrl Unit124</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit124
	 * @generated
	 */
	public Adapter createCtrlUnit124Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit125 <em>Ctrl Unit125</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit125
	 * @generated
	 */
	public Adapter createCtrlUnit125Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit126 <em>Ctrl Unit126</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit126
	 * @generated
	 */
	public Adapter createCtrlUnit126Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit127 <em>Ctrl Unit127</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit127
	 * @generated
	 */
	public Adapter createCtrlUnit127Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit128 <em>Ctrl Unit128</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit128
	 * @generated
	 */
	public Adapter createCtrlUnit128Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit129 <em>Ctrl Unit129</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit129
	 * @generated
	 */
	public Adapter createCtrlUnit129Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit130 <em>Ctrl Unit130</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit130
	 * @generated
	 */
	public Adapter createCtrlUnit130Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit131 <em>Ctrl Unit131</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit131
	 * @generated
	 */
	public Adapter createCtrlUnit131Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit132 <em>Ctrl Unit132</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit132
	 * @generated
	 */
	public Adapter createCtrlUnit132Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wtspecid.CtrlUnit133 <em>Ctrl Unit133</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wtspecid.CtrlUnit133
	 * @generated
	 */
	public Adapter createCtrlUnit133Adapter() {
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

} //WtspecidAdapterFactory
