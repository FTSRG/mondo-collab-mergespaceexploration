/**
 */
package wtspecid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wtspecid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WtspecidFactoryImpl extends EFactoryImpl implements WtspecidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WtspecidFactory init() {
		try {
			WtspecidFactory theWtspecidFactory = (WtspecidFactory)EPackage.Registry.INSTANCE.getEFactory(WtspecidPackage.eNS_URI);
			if (theWtspecidFactory != null) {
				return theWtspecidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WtspecidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WtspecidFactoryImpl() {
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
			case WtspecidPackage.WT: return createWT();
			case WtspecidPackage.SYSTEM_INPUT: return createSystemInput();
			case WtspecidPackage.SYSTEM_OUTPUT: return createSystemOutput();
			case WtspecidPackage.SYSTEM_FAULT: return createSystemFault();
			case WtspecidPackage.SYSTEM_PARAM: return createSystemParam();
			case WtspecidPackage.SYSTEM_TIMER: return createSystemTimer();
			case WtspecidPackage.SYSTEM_VARIABLE: return createSystemVariable();
			case WtspecidPackage.SYSTEM_ERROR_REACTION: return createSystemErrorReaction();
			case WtspecidPackage.SUBSYSTEM: return createSubsystem();
			case WtspecidPackage.CTRL_UNIT1: return createCtrlUnit1();
			case WtspecidPackage.CTRL_UNIT2: return createCtrlUnit2();
			case WtspecidPackage.CTRL_UNIT3: return createCtrlUnit3();
			case WtspecidPackage.CTRL_UNIT4: return createCtrlUnit4();
			case WtspecidPackage.CTRL_UNIT5: return createCtrlUnit5();
			case WtspecidPackage.CTRL_UNIT6: return createCtrlUnit6();
			case WtspecidPackage.CTRL_UNIT7: return createCtrlUnit7();
			case WtspecidPackage.CTRL_UNIT8: return createCtrlUnit8();
			case WtspecidPackage.CTRL_UNIT9: return createCtrlUnit9();
			case WtspecidPackage.CTRL_UNIT10: return createCtrlUnit10();
			case WtspecidPackage.CTRL_UNIT11: return createCtrlUnit11();
			case WtspecidPackage.CTRL_UNIT12: return createCtrlUnit12();
			case WtspecidPackage.CTRL_UNIT13: return createCtrlUnit13();
			case WtspecidPackage.CTRL_UNIT14: return createCtrlUnit14();
			case WtspecidPackage.CTRL_UNIT15: return createCtrlUnit15();
			case WtspecidPackage.CTRL_UNIT16: return createCtrlUnit16();
			case WtspecidPackage.CTRL_UNIT17: return createCtrlUnit17();
			case WtspecidPackage.CTRL_UNIT18: return createCtrlUnit18();
			case WtspecidPackage.CTRL_UNIT19: return createCtrlUnit19();
			case WtspecidPackage.CTRL_UNIT20: return createCtrlUnit20();
			case WtspecidPackage.CTRL_UNIT21: return createCtrlUnit21();
			case WtspecidPackage.CTRL_UNIT22: return createCtrlUnit22();
			case WtspecidPackage.CTRL_UNIT23: return createCtrlUnit23();
			case WtspecidPackage.CTRL_UNIT24: return createCtrlUnit24();
			case WtspecidPackage.CTRL_UNIT25: return createCtrlUnit25();
			case WtspecidPackage.CTRL_UNIT26: return createCtrlUnit26();
			case WtspecidPackage.CTRL_UNIT27: return createCtrlUnit27();
			case WtspecidPackage.CTRL_UNIT28: return createCtrlUnit28();
			case WtspecidPackage.CTRL_UNIT29: return createCtrlUnit29();
			case WtspecidPackage.CTRL_UNIT30: return createCtrlUnit30();
			case WtspecidPackage.CTRL_UNIT31: return createCtrlUnit31();
			case WtspecidPackage.CTRL_UNIT32: return createCtrlUnit32();
			case WtspecidPackage.CTRL_UNIT33: return createCtrlUnit33();
			case WtspecidPackage.CTRL_UNIT34: return createCtrlUnit34();
			case WtspecidPackage.CTRL_UNIT35: return createCtrlUnit35();
			case WtspecidPackage.CTRL_UNIT36: return createCtrlUnit36();
			case WtspecidPackage.CTRL_UNIT37: return createCtrlUnit37();
			case WtspecidPackage.CTRL_UNIT38: return createCtrlUnit38();
			case WtspecidPackage.CTRL_UNIT39: return createCtrlUnit39();
			case WtspecidPackage.CTRL_UNIT40: return createCtrlUnit40();
			case WtspecidPackage.CTRL_UNIT41: return createCtrlUnit41();
			case WtspecidPackage.CTRL_UNIT42: return createCtrlUnit42();
			case WtspecidPackage.CTRL_UNIT43: return createCtrlUnit43();
			case WtspecidPackage.CTRL_UNIT44: return createCtrlUnit44();
			case WtspecidPackage.CTRL_UNIT45: return createCtrlUnit45();
			case WtspecidPackage.CTRL_UNIT46: return createCtrlUnit46();
			case WtspecidPackage.CTRL_UNIT47: return createCtrlUnit47();
			case WtspecidPackage.CTRL_UNIT48: return createCtrlUnit48();
			case WtspecidPackage.CTRL_UNIT49: return createCtrlUnit49();
			case WtspecidPackage.CTRL_UNIT50: return createCtrlUnit50();
			case WtspecidPackage.CTRL_UNIT51: return createCtrlUnit51();
			case WtspecidPackage.CTRL_UNIT52: return createCtrlUnit52();
			case WtspecidPackage.CTRL_UNIT53: return createCtrlUnit53();
			case WtspecidPackage.CTRL_UNIT54: return createCtrlUnit54();
			case WtspecidPackage.CTRL_UNIT55: return createCtrlUnit55();
			case WtspecidPackage.CTRL_UNIT56: return createCtrlUnit56();
			case WtspecidPackage.CTRL_UNIT57: return createCtrlUnit57();
			case WtspecidPackage.CTRL_UNIT58: return createCtrlUnit58();
			case WtspecidPackage.CTRL_UNIT59: return createCtrlUnit59();
			case WtspecidPackage.CTRL_UNIT60: return createCtrlUnit60();
			case WtspecidPackage.CTRL_UNIT61: return createCtrlUnit61();
			case WtspecidPackage.CTRL_UNIT62: return createCtrlUnit62();
			case WtspecidPackage.CTRL_UNIT63: return createCtrlUnit63();
			case WtspecidPackage.CTRL_UNIT64: return createCtrlUnit64();
			case WtspecidPackage.CTRL_UNIT65: return createCtrlUnit65();
			case WtspecidPackage.CTRL_UNIT66: return createCtrlUnit66();
			case WtspecidPackage.CTRL_UNIT67: return createCtrlUnit67();
			case WtspecidPackage.CTRL_UNIT68: return createCtrlUnit68();
			case WtspecidPackage.CTRL_UNIT69: return createCtrlUnit69();
			case WtspecidPackage.CTRL_UNIT70: return createCtrlUnit70();
			case WtspecidPackage.CTRL_UNIT71: return createCtrlUnit71();
			case WtspecidPackage.CTRL_UNIT72: return createCtrlUnit72();
			case WtspecidPackage.CTRL_UNIT73: return createCtrlUnit73();
			case WtspecidPackage.CTRL_UNIT74: return createCtrlUnit74();
			case WtspecidPackage.CTRL_UNIT75: return createCtrlUnit75();
			case WtspecidPackage.CTRL_UNIT76: return createCtrlUnit76();
			case WtspecidPackage.CTRL_UNIT77: return createCtrlUnit77();
			case WtspecidPackage.CTRL_UNIT78: return createCtrlUnit78();
			case WtspecidPackage.CTRL_UNIT79: return createCtrlUnit79();
			case WtspecidPackage.CTRL_UNIT80: return createCtrlUnit80();
			case WtspecidPackage.CTRL_UNIT81: return createCtrlUnit81();
			case WtspecidPackage.CTRL_UNIT82: return createCtrlUnit82();
			case WtspecidPackage.CTRL_UNIT83: return createCtrlUnit83();
			case WtspecidPackage.CTRL_UNIT84: return createCtrlUnit84();
			case WtspecidPackage.CTRL_UNIT85: return createCtrlUnit85();
			case WtspecidPackage.CTRL_UNIT86: return createCtrlUnit86();
			case WtspecidPackage.CTRL_UNIT87: return createCtrlUnit87();
			case WtspecidPackage.CTRL_UNIT88: return createCtrlUnit88();
			case WtspecidPackage.CTRL_UNIT89: return createCtrlUnit89();
			case WtspecidPackage.CTRL_UNIT90: return createCtrlUnit90();
			case WtspecidPackage.CTRL_UNIT91: return createCtrlUnit91();
			case WtspecidPackage.CTRL_UNIT92: return createCtrlUnit92();
			case WtspecidPackage.CTRL_UNIT93: return createCtrlUnit93();
			case WtspecidPackage.CTRL_UNIT94: return createCtrlUnit94();
			case WtspecidPackage.CTRL_UNIT95: return createCtrlUnit95();
			case WtspecidPackage.CTRL_UNIT96: return createCtrlUnit96();
			case WtspecidPackage.CTRL_UNIT97: return createCtrlUnit97();
			case WtspecidPackage.CTRL_UNIT98: return createCtrlUnit98();
			case WtspecidPackage.CTRL_UNIT99: return createCtrlUnit99();
			case WtspecidPackage.CTRL_UNIT100: return createCtrlUnit100();
			case WtspecidPackage.CTRL_UNIT101: return createCtrlUnit101();
			case WtspecidPackage.CTRL_UNIT102: return createCtrlUnit102();
			case WtspecidPackage.CTRL_UNIT103: return createCtrlUnit103();
			case WtspecidPackage.CTRL_UNIT104: return createCtrlUnit104();
			case WtspecidPackage.CTRL_UNIT105: return createCtrlUnit105();
			case WtspecidPackage.CTRL_UNIT106: return createCtrlUnit106();
			case WtspecidPackage.CTRL_UNIT107: return createCtrlUnit107();
			case WtspecidPackage.CTRL_UNIT108: return createCtrlUnit108();
			case WtspecidPackage.CTRL_UNIT109: return createCtrlUnit109();
			case WtspecidPackage.CTRL_UNIT110: return createCtrlUnit110();
			case WtspecidPackage.CTRL_UNIT111: return createCtrlUnit111();
			case WtspecidPackage.CTRL_UNIT112: return createCtrlUnit112();
			case WtspecidPackage.CTRL_UNIT113: return createCtrlUnit113();
			case WtspecidPackage.CTRL_UNIT114: return createCtrlUnit114();
			case WtspecidPackage.CTRL_UNIT115: return createCtrlUnit115();
			case WtspecidPackage.CTRL_UNIT116: return createCtrlUnit116();
			case WtspecidPackage.CTRL_UNIT117: return createCtrlUnit117();
			case WtspecidPackage.CTRL_UNIT118: return createCtrlUnit118();
			case WtspecidPackage.CTRL_UNIT119: return createCtrlUnit119();
			case WtspecidPackage.CTRL_UNIT120: return createCtrlUnit120();
			case WtspecidPackage.CTRL_UNIT121: return createCtrlUnit121();
			case WtspecidPackage.CTRL_UNIT122: return createCtrlUnit122();
			case WtspecidPackage.CTRL_UNIT123: return createCtrlUnit123();
			case WtspecidPackage.CTRL_UNIT124: return createCtrlUnit124();
			case WtspecidPackage.CTRL_UNIT125: return createCtrlUnit125();
			case WtspecidPackage.CTRL_UNIT126: return createCtrlUnit126();
			case WtspecidPackage.CTRL_UNIT127: return createCtrlUnit127();
			case WtspecidPackage.CTRL_UNIT128: return createCtrlUnit128();
			case WtspecidPackage.CTRL_UNIT129: return createCtrlUnit129();
			case WtspecidPackage.CTRL_UNIT130: return createCtrlUnit130();
			case WtspecidPackage.CTRL_UNIT131: return createCtrlUnit131();
			case WtspecidPackage.CTRL_UNIT132: return createCtrlUnit132();
			case WtspecidPackage.CTRL_UNIT133: return createCtrlUnit133();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WT createWT() {
		WTImpl wt = new WTImpl();
		return wt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInput createSystemInput() {
		SystemInputImpl systemInput = new SystemInputImpl();
		return systemInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOutput createSystemOutput() {
		SystemOutputImpl systemOutput = new SystemOutputImpl();
		return systemOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFault createSystemFault() {
		SystemFaultImpl systemFault = new SystemFaultImpl();
		return systemFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemParam createSystemParam() {
		SystemParamImpl systemParam = new SystemParamImpl();
		return systemParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTimer createSystemTimer() {
		SystemTimerImpl systemTimer = new SystemTimerImpl();
		return systemTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemVariable createSystemVariable() {
		SystemVariableImpl systemVariable = new SystemVariableImpl();
		return systemVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemErrorReaction createSystemErrorReaction() {
		SystemErrorReactionImpl systemErrorReaction = new SystemErrorReactionImpl();
		return systemErrorReaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subsystem createSubsystem() {
		SubsystemImpl subsystem = new SubsystemImpl();
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit1 createCtrlUnit1() {
		CtrlUnit1Impl ctrlUnit1 = new CtrlUnit1Impl();
		return ctrlUnit1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit2 createCtrlUnit2() {
		CtrlUnit2Impl ctrlUnit2 = new CtrlUnit2Impl();
		return ctrlUnit2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit3 createCtrlUnit3() {
		CtrlUnit3Impl ctrlUnit3 = new CtrlUnit3Impl();
		return ctrlUnit3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit4 createCtrlUnit4() {
		CtrlUnit4Impl ctrlUnit4 = new CtrlUnit4Impl();
		return ctrlUnit4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit5 createCtrlUnit5() {
		CtrlUnit5Impl ctrlUnit5 = new CtrlUnit5Impl();
		return ctrlUnit5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit6 createCtrlUnit6() {
		CtrlUnit6Impl ctrlUnit6 = new CtrlUnit6Impl();
		return ctrlUnit6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit7 createCtrlUnit7() {
		CtrlUnit7Impl ctrlUnit7 = new CtrlUnit7Impl();
		return ctrlUnit7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit8 createCtrlUnit8() {
		CtrlUnit8Impl ctrlUnit8 = new CtrlUnit8Impl();
		return ctrlUnit8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit9 createCtrlUnit9() {
		CtrlUnit9Impl ctrlUnit9 = new CtrlUnit9Impl();
		return ctrlUnit9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit10 createCtrlUnit10() {
		CtrlUnit10Impl ctrlUnit10 = new CtrlUnit10Impl();
		return ctrlUnit10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit11 createCtrlUnit11() {
		CtrlUnit11Impl ctrlUnit11 = new CtrlUnit11Impl();
		return ctrlUnit11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit12 createCtrlUnit12() {
		CtrlUnit12Impl ctrlUnit12 = new CtrlUnit12Impl();
		return ctrlUnit12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit13 createCtrlUnit13() {
		CtrlUnit13Impl ctrlUnit13 = new CtrlUnit13Impl();
		return ctrlUnit13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit14 createCtrlUnit14() {
		CtrlUnit14Impl ctrlUnit14 = new CtrlUnit14Impl();
		return ctrlUnit14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit15 createCtrlUnit15() {
		CtrlUnit15Impl ctrlUnit15 = new CtrlUnit15Impl();
		return ctrlUnit15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit16 createCtrlUnit16() {
		CtrlUnit16Impl ctrlUnit16 = new CtrlUnit16Impl();
		return ctrlUnit16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit17 createCtrlUnit17() {
		CtrlUnit17Impl ctrlUnit17 = new CtrlUnit17Impl();
		return ctrlUnit17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit18 createCtrlUnit18() {
		CtrlUnit18Impl ctrlUnit18 = new CtrlUnit18Impl();
		return ctrlUnit18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit19 createCtrlUnit19() {
		CtrlUnit19Impl ctrlUnit19 = new CtrlUnit19Impl();
		return ctrlUnit19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit20 createCtrlUnit20() {
		CtrlUnit20Impl ctrlUnit20 = new CtrlUnit20Impl();
		return ctrlUnit20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit21 createCtrlUnit21() {
		CtrlUnit21Impl ctrlUnit21 = new CtrlUnit21Impl();
		return ctrlUnit21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit22 createCtrlUnit22() {
		CtrlUnit22Impl ctrlUnit22 = new CtrlUnit22Impl();
		return ctrlUnit22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit23 createCtrlUnit23() {
		CtrlUnit23Impl ctrlUnit23 = new CtrlUnit23Impl();
		return ctrlUnit23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit24 createCtrlUnit24() {
		CtrlUnit24Impl ctrlUnit24 = new CtrlUnit24Impl();
		return ctrlUnit24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit25 createCtrlUnit25() {
		CtrlUnit25Impl ctrlUnit25 = new CtrlUnit25Impl();
		return ctrlUnit25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit26 createCtrlUnit26() {
		CtrlUnit26Impl ctrlUnit26 = new CtrlUnit26Impl();
		return ctrlUnit26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit27 createCtrlUnit27() {
		CtrlUnit27Impl ctrlUnit27 = new CtrlUnit27Impl();
		return ctrlUnit27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit28 createCtrlUnit28() {
		CtrlUnit28Impl ctrlUnit28 = new CtrlUnit28Impl();
		return ctrlUnit28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit29 createCtrlUnit29() {
		CtrlUnit29Impl ctrlUnit29 = new CtrlUnit29Impl();
		return ctrlUnit29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit30 createCtrlUnit30() {
		CtrlUnit30Impl ctrlUnit30 = new CtrlUnit30Impl();
		return ctrlUnit30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit31 createCtrlUnit31() {
		CtrlUnit31Impl ctrlUnit31 = new CtrlUnit31Impl();
		return ctrlUnit31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit32 createCtrlUnit32() {
		CtrlUnit32Impl ctrlUnit32 = new CtrlUnit32Impl();
		return ctrlUnit32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit33 createCtrlUnit33() {
		CtrlUnit33Impl ctrlUnit33 = new CtrlUnit33Impl();
		return ctrlUnit33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit34 createCtrlUnit34() {
		CtrlUnit34Impl ctrlUnit34 = new CtrlUnit34Impl();
		return ctrlUnit34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit35 createCtrlUnit35() {
		CtrlUnit35Impl ctrlUnit35 = new CtrlUnit35Impl();
		return ctrlUnit35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit36 createCtrlUnit36() {
		CtrlUnit36Impl ctrlUnit36 = new CtrlUnit36Impl();
		return ctrlUnit36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit37 createCtrlUnit37() {
		CtrlUnit37Impl ctrlUnit37 = new CtrlUnit37Impl();
		return ctrlUnit37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit38 createCtrlUnit38() {
		CtrlUnit38Impl ctrlUnit38 = new CtrlUnit38Impl();
		return ctrlUnit38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit39 createCtrlUnit39() {
		CtrlUnit39Impl ctrlUnit39 = new CtrlUnit39Impl();
		return ctrlUnit39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit40 createCtrlUnit40() {
		CtrlUnit40Impl ctrlUnit40 = new CtrlUnit40Impl();
		return ctrlUnit40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit41 createCtrlUnit41() {
		CtrlUnit41Impl ctrlUnit41 = new CtrlUnit41Impl();
		return ctrlUnit41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit42 createCtrlUnit42() {
		CtrlUnit42Impl ctrlUnit42 = new CtrlUnit42Impl();
		return ctrlUnit42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit43 createCtrlUnit43() {
		CtrlUnit43Impl ctrlUnit43 = new CtrlUnit43Impl();
		return ctrlUnit43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit44 createCtrlUnit44() {
		CtrlUnit44Impl ctrlUnit44 = new CtrlUnit44Impl();
		return ctrlUnit44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit45 createCtrlUnit45() {
		CtrlUnit45Impl ctrlUnit45 = new CtrlUnit45Impl();
		return ctrlUnit45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit46 createCtrlUnit46() {
		CtrlUnit46Impl ctrlUnit46 = new CtrlUnit46Impl();
		return ctrlUnit46;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit47 createCtrlUnit47() {
		CtrlUnit47Impl ctrlUnit47 = new CtrlUnit47Impl();
		return ctrlUnit47;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit48 createCtrlUnit48() {
		CtrlUnit48Impl ctrlUnit48 = new CtrlUnit48Impl();
		return ctrlUnit48;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit49 createCtrlUnit49() {
		CtrlUnit49Impl ctrlUnit49 = new CtrlUnit49Impl();
		return ctrlUnit49;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit50 createCtrlUnit50() {
		CtrlUnit50Impl ctrlUnit50 = new CtrlUnit50Impl();
		return ctrlUnit50;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit51 createCtrlUnit51() {
		CtrlUnit51Impl ctrlUnit51 = new CtrlUnit51Impl();
		return ctrlUnit51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit52 createCtrlUnit52() {
		CtrlUnit52Impl ctrlUnit52 = new CtrlUnit52Impl();
		return ctrlUnit52;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit53 createCtrlUnit53() {
		CtrlUnit53Impl ctrlUnit53 = new CtrlUnit53Impl();
		return ctrlUnit53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit54 createCtrlUnit54() {
		CtrlUnit54Impl ctrlUnit54 = new CtrlUnit54Impl();
		return ctrlUnit54;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit55 createCtrlUnit55() {
		CtrlUnit55Impl ctrlUnit55 = new CtrlUnit55Impl();
		return ctrlUnit55;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit56 createCtrlUnit56() {
		CtrlUnit56Impl ctrlUnit56 = new CtrlUnit56Impl();
		return ctrlUnit56;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit57 createCtrlUnit57() {
		CtrlUnit57Impl ctrlUnit57 = new CtrlUnit57Impl();
		return ctrlUnit57;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit58 createCtrlUnit58() {
		CtrlUnit58Impl ctrlUnit58 = new CtrlUnit58Impl();
		return ctrlUnit58;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit59 createCtrlUnit59() {
		CtrlUnit59Impl ctrlUnit59 = new CtrlUnit59Impl();
		return ctrlUnit59;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit60 createCtrlUnit60() {
		CtrlUnit60Impl ctrlUnit60 = new CtrlUnit60Impl();
		return ctrlUnit60;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit61 createCtrlUnit61() {
		CtrlUnit61Impl ctrlUnit61 = new CtrlUnit61Impl();
		return ctrlUnit61;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit62 createCtrlUnit62() {
		CtrlUnit62Impl ctrlUnit62 = new CtrlUnit62Impl();
		return ctrlUnit62;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit63 createCtrlUnit63() {
		CtrlUnit63Impl ctrlUnit63 = new CtrlUnit63Impl();
		return ctrlUnit63;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit64 createCtrlUnit64() {
		CtrlUnit64Impl ctrlUnit64 = new CtrlUnit64Impl();
		return ctrlUnit64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit65 createCtrlUnit65() {
		CtrlUnit65Impl ctrlUnit65 = new CtrlUnit65Impl();
		return ctrlUnit65;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit66 createCtrlUnit66() {
		CtrlUnit66Impl ctrlUnit66 = new CtrlUnit66Impl();
		return ctrlUnit66;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit67 createCtrlUnit67() {
		CtrlUnit67Impl ctrlUnit67 = new CtrlUnit67Impl();
		return ctrlUnit67;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit68 createCtrlUnit68() {
		CtrlUnit68Impl ctrlUnit68 = new CtrlUnit68Impl();
		return ctrlUnit68;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit69 createCtrlUnit69() {
		CtrlUnit69Impl ctrlUnit69 = new CtrlUnit69Impl();
		return ctrlUnit69;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit70 createCtrlUnit70() {
		CtrlUnit70Impl ctrlUnit70 = new CtrlUnit70Impl();
		return ctrlUnit70;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit71 createCtrlUnit71() {
		CtrlUnit71Impl ctrlUnit71 = new CtrlUnit71Impl();
		return ctrlUnit71;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit72 createCtrlUnit72() {
		CtrlUnit72Impl ctrlUnit72 = new CtrlUnit72Impl();
		return ctrlUnit72;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit73 createCtrlUnit73() {
		CtrlUnit73Impl ctrlUnit73 = new CtrlUnit73Impl();
		return ctrlUnit73;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit74 createCtrlUnit74() {
		CtrlUnit74Impl ctrlUnit74 = new CtrlUnit74Impl();
		return ctrlUnit74;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit75 createCtrlUnit75() {
		CtrlUnit75Impl ctrlUnit75 = new CtrlUnit75Impl();
		return ctrlUnit75;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit76 createCtrlUnit76() {
		CtrlUnit76Impl ctrlUnit76 = new CtrlUnit76Impl();
		return ctrlUnit76;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit77 createCtrlUnit77() {
		CtrlUnit77Impl ctrlUnit77 = new CtrlUnit77Impl();
		return ctrlUnit77;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit78 createCtrlUnit78() {
		CtrlUnit78Impl ctrlUnit78 = new CtrlUnit78Impl();
		return ctrlUnit78;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit79 createCtrlUnit79() {
		CtrlUnit79Impl ctrlUnit79 = new CtrlUnit79Impl();
		return ctrlUnit79;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit80 createCtrlUnit80() {
		CtrlUnit80Impl ctrlUnit80 = new CtrlUnit80Impl();
		return ctrlUnit80;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit81 createCtrlUnit81() {
		CtrlUnit81Impl ctrlUnit81 = new CtrlUnit81Impl();
		return ctrlUnit81;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit82 createCtrlUnit82() {
		CtrlUnit82Impl ctrlUnit82 = new CtrlUnit82Impl();
		return ctrlUnit82;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit83 createCtrlUnit83() {
		CtrlUnit83Impl ctrlUnit83 = new CtrlUnit83Impl();
		return ctrlUnit83;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit84 createCtrlUnit84() {
		CtrlUnit84Impl ctrlUnit84 = new CtrlUnit84Impl();
		return ctrlUnit84;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit85 createCtrlUnit85() {
		CtrlUnit85Impl ctrlUnit85 = new CtrlUnit85Impl();
		return ctrlUnit85;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit86 createCtrlUnit86() {
		CtrlUnit86Impl ctrlUnit86 = new CtrlUnit86Impl();
		return ctrlUnit86;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit87 createCtrlUnit87() {
		CtrlUnit87Impl ctrlUnit87 = new CtrlUnit87Impl();
		return ctrlUnit87;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit88 createCtrlUnit88() {
		CtrlUnit88Impl ctrlUnit88 = new CtrlUnit88Impl();
		return ctrlUnit88;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit89 createCtrlUnit89() {
		CtrlUnit89Impl ctrlUnit89 = new CtrlUnit89Impl();
		return ctrlUnit89;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit90 createCtrlUnit90() {
		CtrlUnit90Impl ctrlUnit90 = new CtrlUnit90Impl();
		return ctrlUnit90;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit91 createCtrlUnit91() {
		CtrlUnit91Impl ctrlUnit91 = new CtrlUnit91Impl();
		return ctrlUnit91;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit92 createCtrlUnit92() {
		CtrlUnit92Impl ctrlUnit92 = new CtrlUnit92Impl();
		return ctrlUnit92;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit93 createCtrlUnit93() {
		CtrlUnit93Impl ctrlUnit93 = new CtrlUnit93Impl();
		return ctrlUnit93;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit94 createCtrlUnit94() {
		CtrlUnit94Impl ctrlUnit94 = new CtrlUnit94Impl();
		return ctrlUnit94;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit95 createCtrlUnit95() {
		CtrlUnit95Impl ctrlUnit95 = new CtrlUnit95Impl();
		return ctrlUnit95;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit96 createCtrlUnit96() {
		CtrlUnit96Impl ctrlUnit96 = new CtrlUnit96Impl();
		return ctrlUnit96;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit97 createCtrlUnit97() {
		CtrlUnit97Impl ctrlUnit97 = new CtrlUnit97Impl();
		return ctrlUnit97;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit98 createCtrlUnit98() {
		CtrlUnit98Impl ctrlUnit98 = new CtrlUnit98Impl();
		return ctrlUnit98;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit99 createCtrlUnit99() {
		CtrlUnit99Impl ctrlUnit99 = new CtrlUnit99Impl();
		return ctrlUnit99;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit100 createCtrlUnit100() {
		CtrlUnit100Impl ctrlUnit100 = new CtrlUnit100Impl();
		return ctrlUnit100;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit101 createCtrlUnit101() {
		CtrlUnit101Impl ctrlUnit101 = new CtrlUnit101Impl();
		return ctrlUnit101;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit102 createCtrlUnit102() {
		CtrlUnit102Impl ctrlUnit102 = new CtrlUnit102Impl();
		return ctrlUnit102;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit103 createCtrlUnit103() {
		CtrlUnit103Impl ctrlUnit103 = new CtrlUnit103Impl();
		return ctrlUnit103;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit104 createCtrlUnit104() {
		CtrlUnit104Impl ctrlUnit104 = new CtrlUnit104Impl();
		return ctrlUnit104;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit105 createCtrlUnit105() {
		CtrlUnit105Impl ctrlUnit105 = new CtrlUnit105Impl();
		return ctrlUnit105;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit106 createCtrlUnit106() {
		CtrlUnit106Impl ctrlUnit106 = new CtrlUnit106Impl();
		return ctrlUnit106;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit107 createCtrlUnit107() {
		CtrlUnit107Impl ctrlUnit107 = new CtrlUnit107Impl();
		return ctrlUnit107;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit108 createCtrlUnit108() {
		CtrlUnit108Impl ctrlUnit108 = new CtrlUnit108Impl();
		return ctrlUnit108;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit109 createCtrlUnit109() {
		CtrlUnit109Impl ctrlUnit109 = new CtrlUnit109Impl();
		return ctrlUnit109;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit110 createCtrlUnit110() {
		CtrlUnit110Impl ctrlUnit110 = new CtrlUnit110Impl();
		return ctrlUnit110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit111 createCtrlUnit111() {
		CtrlUnit111Impl ctrlUnit111 = new CtrlUnit111Impl();
		return ctrlUnit111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit112 createCtrlUnit112() {
		CtrlUnit112Impl ctrlUnit112 = new CtrlUnit112Impl();
		return ctrlUnit112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit113 createCtrlUnit113() {
		CtrlUnit113Impl ctrlUnit113 = new CtrlUnit113Impl();
		return ctrlUnit113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit114 createCtrlUnit114() {
		CtrlUnit114Impl ctrlUnit114 = new CtrlUnit114Impl();
		return ctrlUnit114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit115 createCtrlUnit115() {
		CtrlUnit115Impl ctrlUnit115 = new CtrlUnit115Impl();
		return ctrlUnit115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit116 createCtrlUnit116() {
		CtrlUnit116Impl ctrlUnit116 = new CtrlUnit116Impl();
		return ctrlUnit116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit117 createCtrlUnit117() {
		CtrlUnit117Impl ctrlUnit117 = new CtrlUnit117Impl();
		return ctrlUnit117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit118 createCtrlUnit118() {
		CtrlUnit118Impl ctrlUnit118 = new CtrlUnit118Impl();
		return ctrlUnit118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit119 createCtrlUnit119() {
		CtrlUnit119Impl ctrlUnit119 = new CtrlUnit119Impl();
		return ctrlUnit119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit120 createCtrlUnit120() {
		CtrlUnit120Impl ctrlUnit120 = new CtrlUnit120Impl();
		return ctrlUnit120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit121 createCtrlUnit121() {
		CtrlUnit121Impl ctrlUnit121 = new CtrlUnit121Impl();
		return ctrlUnit121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit122 createCtrlUnit122() {
		CtrlUnit122Impl ctrlUnit122 = new CtrlUnit122Impl();
		return ctrlUnit122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit123 createCtrlUnit123() {
		CtrlUnit123Impl ctrlUnit123 = new CtrlUnit123Impl();
		return ctrlUnit123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit124 createCtrlUnit124() {
		CtrlUnit124Impl ctrlUnit124 = new CtrlUnit124Impl();
		return ctrlUnit124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit125 createCtrlUnit125() {
		CtrlUnit125Impl ctrlUnit125 = new CtrlUnit125Impl();
		return ctrlUnit125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit126 createCtrlUnit126() {
		CtrlUnit126Impl ctrlUnit126 = new CtrlUnit126Impl();
		return ctrlUnit126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit127 createCtrlUnit127() {
		CtrlUnit127Impl ctrlUnit127 = new CtrlUnit127Impl();
		return ctrlUnit127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit128 createCtrlUnit128() {
		CtrlUnit128Impl ctrlUnit128 = new CtrlUnit128Impl();
		return ctrlUnit128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit129 createCtrlUnit129() {
		CtrlUnit129Impl ctrlUnit129 = new CtrlUnit129Impl();
		return ctrlUnit129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit130 createCtrlUnit130() {
		CtrlUnit130Impl ctrlUnit130 = new CtrlUnit130Impl();
		return ctrlUnit130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit131 createCtrlUnit131() {
		CtrlUnit131Impl ctrlUnit131 = new CtrlUnit131Impl();
		return ctrlUnit131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit132 createCtrlUnit132() {
		CtrlUnit132Impl ctrlUnit132 = new CtrlUnit132Impl();
		return ctrlUnit132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtrlUnit133 createCtrlUnit133() {
		CtrlUnit133Impl ctrlUnit133 = new CtrlUnit133Impl();
		return ctrlUnit133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WtspecidPackage getWtspecidPackage() {
		return (WtspecidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WtspecidPackage getPackage() {
		return WtspecidPackage.eINSTANCE;
	}

} //WtspecidFactoryImpl
