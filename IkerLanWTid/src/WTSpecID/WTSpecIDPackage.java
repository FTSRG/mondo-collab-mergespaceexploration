/**
 */
package WTSpecID;

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
 * @see WTSpecID.WTSpecIDFactory
 * @model kind="package"
 * @generated
 */
public interface WTSpecIDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WTSpecID";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://WTSpec/2.01";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wtc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WTSpecIDPackage eINSTANCE = WTSpecID.impl.WTSpecIDPackageImpl.init();

	/**
	 * The meta object id for the '{@link WTSpecID.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.IdentifiableImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTImpl <em>WT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWT()
	 * @generated
	 */
	int WT = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__SYS_ID = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__MODEL = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__VERSION = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_SUBSYSTEMS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Its Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_INPUTS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Its Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_OUTPUTS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Its Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_PARAMS = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Its Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_TIMERS = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Its Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_FAULTS = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Its Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_VARIABLES = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Its Error Reactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT__ITS_ERROR_REACTIONS = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>WT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>WT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTCInputImpl <em>WTC Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTCInputImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWTCInput()
	 * @generated
	 */
	int WTC_INPUT = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_INPUT__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>WTC Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_INPUT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WTC Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_INPUT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemInputImpl <em>System Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemInputImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemInput()
	 * @generated
	 */
	int SYSTEM_INPUT = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT__ID = WTC_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT__SYS_ID = WTC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_FEATURE_COUNT = WTC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_INPUT_OPERATION_COUNT = WTC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTCOutputImpl <em>WTC Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTCOutputImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWTCOutput()
	 * @generated
	 */
	int WTC_OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OUTPUT__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>WTC Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OUTPUT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WTC Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OUTPUT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemOutputImpl <em>System Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemOutputImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemOutput()
	 * @generated
	 */
	int SYSTEM_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__ID = WTC_OUTPUT__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT__SYS_ID = WTC_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_FEATURE_COUNT = WTC_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OUTPUT_OPERATION_COUNT = WTC_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTCFaultImpl <em>WTC Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTCFaultImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWTCFault()
	 * @generated
	 */
	int WTC_FAULT = 13;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FAULT__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>WTC Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FAULT_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WTC Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FAULT_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemFaultImpl <em>System Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemFaultImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemFault()
	 * @generated
	 */
	int SYSTEM_FAULT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT__ID = WTC_FAULT__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT__SYS_ID = WTC_FAULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT__VALUE = WTC_FAULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT_FEATURE_COUNT = WTC_FAULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FAULT_OPERATION_COUNT = WTC_FAULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTCParamImpl <em>WTC Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTCParamImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWTCParam()
	 * @generated
	 */
	int WTC_PARAM = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_PARAM__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>WTC Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_PARAM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WTC Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_PARAM_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemParamImpl <em>System Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemParamImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemParam()
	 * @generated
	 */
	int SYSTEM_PARAM = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__ID = WTC_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__SYS_ID = WTC_PARAM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM__VALUE = WTC_PARAM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_FEATURE_COUNT = WTC_PARAM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PARAM_OPERATION_COUNT = WTC_PARAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTCTimerImpl <em>WTC Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTCTimerImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWTCTimer()
	 * @generated
	 */
	int WTC_TIMER = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_TIMER__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>WTC Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_TIMER_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WTC Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_TIMER_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemTimerImpl <em>System Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemTimerImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemTimer()
	 * @generated
	 */
	int SYSTEM_TIMER = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER__ID = WTC_TIMER__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER__SYS_ID = WTC_TIMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER__VALUE = WTC_TIMER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER_FEATURE_COUNT = WTC_TIMER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TIMER_OPERATION_COUNT = WTC_TIMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemVariableImpl <em>System Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemVariableImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemVariable()
	 * @generated
	 */
	int SYSTEM_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE__ID = WTC_INPUT__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE__SYS_ID = WTC_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE_FEATURE_COUNT = WTC_INPUT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_VARIABLE_OPERATION_COUNT = WTC_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.WTCErrorReactionImpl <em>WTC Error Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.WTCErrorReactionImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getWTCErrorReaction()
	 * @generated
	 */
	int WTC_ERROR_REACTION = 14;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_ERROR_REACTION__ID = IDENTIFIABLE__ID;

	/**
	 * The number of structural features of the '<em>WTC Error Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_ERROR_REACTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>WTC Error Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_ERROR_REACTION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SystemErrorReactionImpl <em>System Error Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SystemErrorReactionImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSystemErrorReaction()
	 * @generated
	 */
	int SYSTEM_ERROR_REACTION = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ERROR_REACTION__ID = WTC_ERROR_REACTION__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ERROR_REACTION__SYS_ID = WTC_ERROR_REACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Error Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ERROR_REACTION_FEATURE_COUNT = WTC_ERROR_REACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Error Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ERROR_REACTION_OPERATION_COUNT = WTC_ERROR_REACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.SubsystemImpl <em>Subsystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.SubsystemImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getSubsystem()
	 * @generated
	 */
	int SUBSYSTEM = 15;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__SYS_ID = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__DESCRIPTION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Its WT Cs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ITS_WT_CS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Its Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM__ITS_SUBSYSTEMS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Subsystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSYSTEM_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.wtcImpl <em>wtc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.wtcImpl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getwtc()
	 * @generated
	 */
	int WTC = 16;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__SYS_ID = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__DESCRIPTION = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__CYCLE = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC__PRIORITY = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>wtc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>wtc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WTC_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit1Impl <em>Ctrl Unit1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit1Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit1()
	 * @generated
	 */
	int CTRL_UNIT1 = 17;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oNacelle Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1__OUTPUT_ONACELLE_DIRECTION = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT1_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit2Impl <em>Ctrl Unit2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit2Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit2()
	 * @generated
	 */
	int CTRL_UNIT2 = 18;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oNorth Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__OUTPUT_ONORTH_DIRECTION = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pNorth Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2__PARAMETER_PNORTH_OFFSET = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT2_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit3Impl <em>Ctrl Unit3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit3Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit3()
	 * @generated
	 */
	int CTRL_UNIT3 = 19;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAccess State NC2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__INPUT_IACCESS_STATE_NC2 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iAccess State TC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__INPUT_IACCESS_STATE_TC = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oAccess State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3__OUTPUT_OACCESS_STATE = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT3_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit4Impl <em>Ctrl Unit4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit4Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit4()
	 * @generated
	 */
	int CTRL_UNIT4 = 20;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iStatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__INPUT_ISTATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iOverload Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__INPUT_IOVERLOAD_ALARM = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iAlarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__INPUT_IALARM_COUNTER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oAlarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__OUTPUT_OALARM_COUNTER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pAlarm Count Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__PARAMETER_PALARM_COUNT_LIMIT = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pTime Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__PARAMETER_PTIME_PERIOD = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault fOverload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__FAULT_FOVERLOAD = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timer tSync Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4__TIMER_TSYNC_DELAY = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT4_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit5Impl <em>Ctrl Unit5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit5Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit5()
	 * @generated
	 */
	int CTRL_UNIT5 = 21;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oResult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5__OUTPUT_ORESULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT5_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit6Impl <em>Ctrl Unit6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit6Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit6()
	 * @generated
	 */
	int CTRL_UNIT6 = 22;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iStatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__INPUT_ISTATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iOverload Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__INPUT_IOVERLOAD_ALARM = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iAlarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__INPUT_IALARM_COUNTER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oAlarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__OUTPUT_OALARM_COUNTER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pTime Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__PARAMETER_PTIME_PERIOD = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pOverload Time Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__PARAMETER_POVERLOAD_TIME_LIMIT = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault fOverload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__FAULT_FOVERLOAD = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timer tSync Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6__TIMER_TSYNC_DELAY = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT6_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit7Impl <em>Ctrl Unit7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit7Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit7()
	 * @generated
	 */
	int CTRL_UNIT7 = 23;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAnalog Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__INPUT_IANALOG_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oAnalog Compensated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7__OUTPUT_OANALOG_COMPENSATED = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT7_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit8Impl <em>Ctrl Unit8</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit8Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit8()
	 * @generated
	 */
	int CTRL_UNIT8 = 24;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input i1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__INPUT_I1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output o1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__OUTPUT_O1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__PARAMETER_PDELAY = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8__BHV_PARAM_BP_FILTER = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit8</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT8_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit9Impl <em>Ctrl Unit9</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit9Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit9()
	 * @generated
	 */
	int CTRL_UNIT9 = 25;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iValue To Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_IVALUE_TO_CHECK = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iLimit Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_ILIMIT_VALUE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iLimit Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__INPUT_ILIMIT_RESET = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oLimit Reached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__OUTPUT_OLIMIT_REACHED = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pLimit Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__PARAMETER_PLIMIT_VALUE = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pLimit Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__PARAMETER_PLIMIT_RESET = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__TIMER_TDELAY = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Limits Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9__BHV_PARAM_BP_LIMITS_TYPE = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit9</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT9_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit10Impl <em>Ctrl Unit10</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit10Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit10()
	 * @generated
	 */
	int CTRL_UNIT10 = 26;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAnalog Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__INPUT_IANALOG_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oAnalog Scaled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__OUTPUT_OANALOG_SCALED = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pFactor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PFACTOR = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pOffset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_POFFSET = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pUp Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PUP_LIMIT = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pUp Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PUP_VALUE = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pDown Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PDOWN_LIMIT = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pDown Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__PARAMETER_PDOWN_VALUE = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10__BHV_PARAM_BP_OPERATION = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ctrl Unit10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10_FEATURE_COUNT = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Ctrl Unit10</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT10_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit11Impl <em>Ctrl Unit11</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit11Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit11()
	 * @generated
	 */
	int CTRL_UNIT11 = 27;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit11</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT11_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit12Impl <em>Ctrl Unit12</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit12Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit12()
	 * @generated
	 */
	int CTRL_UNIT12 = 28;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPin Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__INPUT_IPIN_POSITION = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInductive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__INPUT_IINDUCTIVE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iFl In Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__INPUT_IFL_IN_POSITION = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iLocking Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__INPUT_ILOCKING_ORDER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iLocking Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__INPUT_ILOCKING_SET = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oPin Auto Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__OUTPUT_OPIN_AUTO_CMD = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pPin No Back Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__PARAMETER_PPIN_NO_BACK_POS = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pPin Extended Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__PARAMETER_PPIN_EXTENDED_POS = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pPin Retracted Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__PARAMETER_PPIN_RETRACTED_POS = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pPin Hysteresis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12__PARAMETER_PPIN_HYSTERESIS = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit12</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT12_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit13Impl <em>Ctrl Unit13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit13Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit13()
	 * @generated
	 */
	int CTRL_UNIT13 = 29;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSelect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__INPUT_ISELECT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__BHV_PARAM_BP_TYPE = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13__BHV_PARAM_BP_INPUT_TYPE = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT13_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit14Impl <em>Ctrl Unit14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit14Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit14()
	 * @generated
	 */
	int CTRL_UNIT14 = 30;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oBit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14__OUTPUT_OBIT = WTC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ctrl Unit14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14_FEATURE_COUNT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ctrl Unit14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT14_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit15Impl <em>Ctrl Unit15</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit15Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit15()
	 * @generated
	 */
	int CTRL_UNIT15 = 31;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pMask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15__PARAMETER_PMASK = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit15</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT15_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit16Impl <em>Ctrl Unit16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit16Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit16()
	 * @generated
	 */
	int CTRL_UNIT16 = 32;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iVar Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__INPUT_IVAR_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oVar Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16__OUTPUT_OVAR_OUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT16_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit17Impl <em>Ctrl Unit17</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit17Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit17()
	 * @generated
	 */
	int CTRL_UNIT17 = 33;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Parameter pParam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__PARAMETER_PPARAM = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fWarning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__FAULT_FWARNING = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__FAULT_FFAULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17__TIMER_TTIMER = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit17</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT17_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit18Impl <em>Ctrl Unit18</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit18Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit18()
	 * @generated
	 */
	int CTRL_UNIT18 = 34;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOrder Cw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IORDER_CW = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iOrder Ccw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IORDER_CCW = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_IFAULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iCmd Disable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_ICMD_DISABLE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iCmd Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_ICMD_RESET = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iSta Ready To On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__INPUT_ISTA_READY_TO_ON = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oControl Word</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__OUTPUT_OCONTROL_WORD = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Disabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_DISABLED = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_ENABLED = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Cw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_CW = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Ccw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_CCW = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_RESET = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Switch On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_SWITCH_ON = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter pCmd Braking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__PARAMETER_PCMD_BRAKING = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18__TIMER_TDELAY = WTC_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ctrl Unit18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18_FEATURE_COUNT = WTC_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Ctrl Unit18</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT18_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit19Impl <em>Ctrl Unit19</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit19Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit19()
	 * @generated
	 */
	int CTRL_UNIT19 = 35;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPitch Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__INPUT_IPITCH_TORQUE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oPitch Rms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__OUTPUT_OPITCH_RMS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pDivisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19__PARAMETER_PDIVISOR = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit19</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit19</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT19_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit20Impl <em>Ctrl Unit20</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit20Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit20()
	 * @generated
	 */
	int CTRL_UNIT20 = 36;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iMaster Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__INPUT_IMASTER_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInverter Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__INPUT_IINVERTER_ORDER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iChange Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__INPUT_ICHANGE_ORDER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iManual Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__INPUT_IMANUAL_STOP = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oMaster Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__OUTPUT_OMASTER_SELECTED = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oInverter Enabled</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__OUTPUT_OINVERTER_ENABLED = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oForce Inv Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20__OUTPUT_OFORCE_INV_OFF = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit20</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit20</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT20_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit21Impl <em>Ctrl Unit21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit21Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit21()
	 * @generated
	 */
	int CTRL_UNIT21 = 37;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iWind Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__INPUT_IWIND_DIRECTION = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iFlag Brakes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__INPUT_IFLAG_BRAKES = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iFlag Into Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__INPUT_IFLAG_INTO_WIND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oBack Wind Detected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__OUTPUT_OBACK_WIND_DETECTED = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMax Absolute Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21__PARAMETER_PMAX_ABSOLUTE_ANGLE = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT21_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit22Impl <em>Ctrl Unit22</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit22Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit22()
	 * @generated
	 */
	int CTRL_UNIT22 = 38;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__INPUT_IYAW_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iMax Twist CW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__INPUT_IMAX_TWIST_CW = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iMax Twist CCW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__INPUT_IMAX_TWIST_CCW = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oMax Twist Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__OUTPUT_OMAX_TWIST_PRE_COMMAND = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pMax Twist Hysteresis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__PARAMETER_PMAX_TWIST_HYSTERESIS = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault fTwist Excessive CW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CW = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault fTwist Excessive CCW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22__FAULT_FTWIST_EXCESSIVE_CCW = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT22_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit23Impl <em>Ctrl Unit23</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit23Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit23()
	 * @generated
	 */
	int CTRL_UNIT23 = 39;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iWind Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__INPUT_IWIND_SPEED = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInverter Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__INPUT_IINVERTER_POWER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oRelation Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__OUTPUT_ORELATION_ERROR = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pWind Speed Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__PARAMETER_PWIND_SPEED_LIMIT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pInverter Power Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__PARAMETER_PINVERTER_POWER_LIMIT = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tWind Minimum Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__TIMER_TWIND_MINIMUM_TIME = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timer tPower And Wind Minimum Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23__TIMER_TPOWER_AND_WIND_MINIMUM_TIME = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT23_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit24Impl <em>Ctrl Unit24</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit24Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit24()
	 * @generated
	 */
	int CTRL_UNIT24 = 40;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInverter Ready</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__INPUT_IINVERTER_READY = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInverter Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__INPUT_IINVERTER_POWER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iAlgorithm Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__INPUT_IALGORITHM_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pPower Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__PARAMETER_PPOWER_LIMIT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fYaw Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__FAULT_FYAW_PROBLEM = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tDelay Problem Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__TIMER_TDELAY_PROBLEM_NOTIFY = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Decision Sequence ds Decision Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24__DECISION_SEQUENCE_DS_DECISION_TREE = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit24</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit24</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT24_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit25Impl <em>Ctrl Unit25</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit25Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit25()
	 * @generated
	 */
	int CTRL_UNIT25 = 41;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iStatus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__INPUT_ISTATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iOverload Alarm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__INPUT_IOVERLOAD_ALARM = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iAlarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__INPUT_IALARM_COUNTER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oAlarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__OUTPUT_OALARM_COUNTER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fOverload</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__FAULT_FOVERLOAD = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__TIMER_TTIMER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timer tSync Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25__TIMER_TSYNC_DELAY = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit25</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit25</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT25_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit26Impl <em>Ctrl Unit26</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit26Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit26()
	 * @generated
	 */
	int CTRL_UNIT26 = 42;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iCounter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__INPUT_ICOUNTER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iActivator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__INPUT_IACTIVATOR = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oCounter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__OUTPUT_OCOUNTER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oLimit Reached</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__OUTPUT_OLIMIT_REACHED = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pLimit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26__PARAMETER_PLIMIT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit26</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit26</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT26_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit27Impl <em>Ctrl Unit27</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit27Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit27()
	 * @generated
	 */
	int CTRL_UNIT27 = 43;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__INPUT_IORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iFailure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__INPUT_IFAILURE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__OUTPUT_OORDER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oCounter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__OUTPUT_OCOUNTER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMax Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27__PARAMETER_PMAX_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit27</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit27</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT27_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit28Impl <em>Ctrl Unit28</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit28Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit28()
	 * @generated
	 */
	int CTRL_UNIT28 = 44;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iDigital Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__INPUT_IDIGITAL_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oAlarm Has Been Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__OUTPUT_OALARM_HAS_BEEN_RESET = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28__FAULT_FFAULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit28</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit28</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT28_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit29Impl <em>Ctrl Unit29</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit29Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit29()
	 * @generated
	 */
	int CTRL_UNIT29 = 45;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iDigital Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__INPUT_IDIGITAL_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__FAULT_FFAULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Reset Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29__BHV_PARAM_BP_RESET_MODE = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit29</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit29</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT29_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit30Impl <em>Ctrl Unit30</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit30Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit30()
	 * @generated
	 */
	int CTRL_UNIT30 = 46;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iDigital Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__INPUT_IDIGITAL_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iOff Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30__INPUT_IOFF_ORDER = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit30</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit30</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT30_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit31Impl <em>Ctrl Unit31</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit31Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit31()
	 * @generated
	 */
	int CTRL_UNIT31 = 47;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pMask</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31__PARAMETER_PMASK = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT31_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit32Impl <em>Ctrl Unit32</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit32Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit32()
	 * @generated
	 */
	int CTRL_UNIT32 = 48;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oChange Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__OUTPUT_OCHANGE_CMD = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oPersistent Hour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__OUTPUT_OPERSISTENT_HOUR = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pDay Change Hour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32__PARAMETER_PDAY_CHANGE_HOUR = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT32_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit33Impl <em>Ctrl Unit33</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit33Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit33()
	 * @generated
	 */
	int CTRL_UNIT33 = 49;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iReset Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__INPUT_IRESET_OUTPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oIs Last Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__OUTPUT_OIS_LAST_ERROR = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33__FAULT_FFAULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit33</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit33</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT33_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit34Impl <em>Ctrl Unit34</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit34Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit34()
	 * @generated
	 */
	int CTRL_UNIT34 = 50;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iFeedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__INPUT_IFEEDBACK = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oFault On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__OUTPUT_OFAULT_ON = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oFault Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__OUTPUT_OFAULT_OFF = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer tDelay On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__TIMER_TDELAY_ON = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tDelay Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__TIMER_TDELAY_OFF = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit34</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit34</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT34_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit35Impl <em>Ctrl Unit35</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit35Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit35()
	 * @generated
	 */
	int CTRL_UNIT35 = 51;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iFeedback</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__INPUT_IFEEDBACK = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__FAULT_FFAULT_ON = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault fFault Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__FAULT_FFAULT_OFF = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer tDelay On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__TIMER_TDELAY_ON = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tDelay Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__TIMER_TDELAY_OFF = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit35</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit35</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT35_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit36Impl <em>Ctrl Unit36</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit36Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit36()
	 * @generated
	 */
	int CTRL_UNIT36 = 52;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input i1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__INPUT_I1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output o1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__OUTPUT_O1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pDelay On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__PARAMETER_PDELAY_ON = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pDelay Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36__PARAMETER_PDELAY_OFF = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit36</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit36</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT36_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit37Impl <em>Ctrl Unit37</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit37Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit37()
	 * @generated
	 */
	int CTRL_UNIT37 = 53;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iBad Input Quality</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__INPUT_IBAD_INPUT_QUALITY = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oSend Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__OUTPUT_OSEND_RESET = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__FAULT_FFAULT = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tCheck Input Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__TIMER_TCHECK_INPUT_DELAY = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit37</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit37</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT37_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit38Impl <em>Ctrl Unit38</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit38Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit38()
	 * @generated
	 */
	int CTRL_UNIT38 = 54;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__PARAMETER_PDELAY = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__FAULT_FFAULT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__TIMER_TDELAY = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit38</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit38</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT38_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit39Impl <em>Ctrl Unit39</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit39Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit39()
	 * @generated
	 */
	int CTRL_UNIT39 = 55;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__FAULT_FFAULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__TIMER_TDELAY = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit39</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit39</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT39_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit40Impl <em>Ctrl Unit40</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit40Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit40()
	 * @generated
	 */
	int CTRL_UNIT40 = 56;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__INPUT_IORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40__TIMER_TTIMER = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit40</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT40_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit41Impl <em>Ctrl Unit41</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit41Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit41()
	 * @generated
	 */
	int CTRL_UNIT41 = 57;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pParam3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__PARAMETER_PPARAM3 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fault fFault2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__FAULT_FFAULT2 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fault fFault3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__FAULT_FFAULT3 = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Error Reaction eReaction1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__ERROR_REACTION_EREACTION1 = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Error Reaction eReaction2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__ERROR_REACTION_EREACTION2 = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Guard gGuard To Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__GUARD_GGUARD_TO_MAIN = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Guard gGuard From Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__GUARD_GGUARD_FROM_MAIN = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Guard gGuard To On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__GUARD_GGUARD_TO_ON = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Guard gGuard To Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41__GUARD_GGUARD_TO_OFF = WTC_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Ctrl Unit41</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41_FEATURE_COUNT = WTC_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Ctrl Unit41</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT41_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit42Impl <em>Ctrl Unit42</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit42Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit42()
	 * @generated
	 */
	int CTRL_UNIT42 = 58;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oActive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__OUTPUT_OACTIVE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oPulsing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__OUTPUT_OPULSING = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__TIMER_TDELAY = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tActive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42__TIMER_TACTIVE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit42</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit42</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT42_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit43Impl <em>Ctrl Unit43</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit43Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit43()
	 * @generated
	 */
	int CTRL_UNIT43 = 59;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oOut Div</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__OUTPUT_OOUT_DIV = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oOut Mod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__OUTPUT_OOUT_MOD = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pDiv</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__PARAMETER_PDIV = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43__BHV_PARAM_BP_TYPE = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit43</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit43</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT43_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit44Impl <em>Ctrl Unit44</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit44Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit44()
	 * @generated
	 */
	int CTRL_UNIT44 = 60;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit44</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit44</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT44_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit45Impl <em>Ctrl Unit45</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit45Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit45()
	 * @generated
	 */
	int CTRL_UNIT45 = 61;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45__BHV_PARAM_BP_TYPE = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit45</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit45</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT45_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit46Impl <em>Ctrl Unit46</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit46Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit46()
	 * @generated
	 */
	int CTRL_UNIT46 = 62;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Reaction er Error Reaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46__ERROR_REACTION_ER_ERROR_REACTION = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit46</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit46</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT46_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit47Impl <em>Ctrl Unit47</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit47Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit47()
	 * @generated
	 */
	int CTRL_UNIT47 = 63;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iReset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__INPUT_IRESET_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fReset Fault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47__FAULT_FRESET_FAULT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit47</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit47</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT47_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit48Impl <em>Ctrl Unit48</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit48Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit48()
	 * @generated
	 */
	int CTRL_UNIT48 = 64;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTemp1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__INPUT_ITEMP1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iTemp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__INPUT_ITEMP2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iTemp3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__INPUT_ITEMP3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oFan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__OUTPUT_OFAN = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pTemp Limit1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__PARAMETER_PTEMP_LIMIT1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pTemp Limit2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__PARAMETER_PTEMP_LIMIT2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pTemp Limit3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__PARAMETER_PTEMP_LIMIT3 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Reaction er Reaction1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__ERROR_REACTION_ER_REACTION1 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Error Reaction er Reaction2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48__ERROR_REACTION_ER_REACTION2 = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit48</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit48</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT48_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit49Impl <em>Ctrl Unit49</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit49Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit49()
	 * @generated
	 */
	int CTRL_UNIT49 = 65;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__INPUT_IINPUT4 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oOutput Fan1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__OUTPUT_OOUTPUT_FAN1 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oOutput Fan2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__OUTPUT_OOUTPUT_FAN2 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pParam1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM1 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pParam2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM2 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pParam3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM3 = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pParam4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__PARAMETER_PPARAM4 = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fault fFault1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__FAULT_FFAULT1 = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Timer tTimer1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__TIMER_TTIMER1 = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Error Reaction eReaction1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__ERROR_REACTION_EREACTION1 = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Error Reaction eReaction2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__ERROR_REACTION_EREACTION2 = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Guard gGuard Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_ERRORS = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Guard gGuard No Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_NO_ERRORS = WTC_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Guard gGuard Off To Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_OFF_TO_HI = WTC_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Guard gGuard Hi To Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_HI_TO_OFF = WTC_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Guard gGuard Off To Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_OFF_TO_LOW = WTC_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Guard gGuard Low To Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_LOW_TO_OFF = WTC_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Guard gGuard Low To Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_LOW_TO_HI = WTC_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Guard gGuard Hi To Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49__GUARD_GGUARD_HI_TO_LOW = WTC_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Ctrl Unit49</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49_FEATURE_COUNT = WTC_FEATURE_COUNT + 22;

	/**
	 * The number of operations of the '<em>Ctrl Unit49</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT49_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit50Impl <em>Ctrl Unit50</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit50Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit50()
	 * @generated
	 */
	int CTRL_UNIT50 = 66;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50__FAULT_FFAULT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit50</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit50</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT50_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit51Impl <em>Ctrl Unit51</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit51Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit51()
	 * @generated
	 */
	int CTRL_UNIT51 = 67;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Parameter pHour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__PARAMETER_PHOUR = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51__FAULT_FFAULT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit51</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit51</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT51_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit52Impl <em>Ctrl Unit52</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit52Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit52()
	 * @generated
	 */
	int CTRL_UNIT52 = 68;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iVar Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__INPUT_IVAR_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oVar Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52__OUTPUT_OVAR_OUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit52</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit52</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT52_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit53Impl <em>Ctrl Unit53</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit53Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit53()
	 * @generated
	 */
	int CTRL_UNIT53 = 69;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iMachine Status Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IMACHINE_STATUS_INDICATOR = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iStop Condition Indicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_ISTOP_CONDITION_INDICATOR = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iManual By Pass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IMANUAL_BY_PASS = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iMotorizing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IMOTORIZING = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iFlag Into Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IFLAG_INTO_WIND = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iProtection Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IPROTECTION_CONDITION = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iEmergency Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IEMERGENCY_CONDITION = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input iDeenergize Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__INPUT_IDEENERGIZE_CONDITION = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oAuto Stop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__OUTPUT_OAUTO_STOP_COMMAND = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fault fRun Fault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__FAULT_FRUN_FAULT = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Timer tStart Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__TIMER_TSTART_DELAY = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Timer tCheck Run Fault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__TIMER_TCHECK_RUN_FAULT = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Error Reaction er Motorizing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53__ERROR_REACTION_ER_MOTORIZING = WTC_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Ctrl Unit53</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53_FEATURE_COUNT = WTC_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Ctrl Unit53</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT53_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit54Impl <em>Ctrl Unit54</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit54Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit54()
	 * @generated
	 */
	int CTRL_UNIT54 = 70;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSafety</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_ISAFETY = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iLocking Order Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_ILOCKING_ORDER_SELECTED = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iMachine State L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_IMACHINE_STATE_L = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iMachine State U</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_IMACHINE_STATE_U = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iMachine State S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_IMACHINE_STATE_S = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iInitial Conditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_IINITIAL_CONDITIONS = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iPin State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__INPUT_IPIN_STATE = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oLocking Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54__OUTPUT_OLOCKING_ORDER = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit54</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit54</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT54_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit55Impl <em>Ctrl Unit55</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit55Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit55()
	 * @generated
	 */
	int CTRL_UNIT55 = 71;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oSignal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55__OUTPUT_OSIGNAL = WTC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ctrl Unit55</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55_FEATURE_COUNT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ctrl Unit55</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT55_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit56Impl <em>Ctrl Unit56</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit56Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit56()
	 * @generated
	 */
	int CTRL_UNIT56 = 72;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInternal Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__INPUT_IINTERNAL_FAILURE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oInhibit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56__OUTPUT_OINHIBIT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit56</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit56</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT56_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit57Impl <em>Ctrl Unit57</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit57Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit57()
	 * @generated
	 */
	int CTRL_UNIT57 = 73;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iUp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__INPUT_IUP = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDown</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__INPUT_IDOWN = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oAnalog Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__OUTPUT_OANALOG_OUT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pParam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__PARAMETER_PPARAM = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMax</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__PARAMETER_PMAX = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pMin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57__PARAMETER_PMIN = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit57</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit57</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT57_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit58Impl <em>Ctrl Unit58</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit58Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit58()
	 * @generated
	 */
	int CTRL_UNIT58 = 74;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pParam</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__PARAMETER_PPARAM = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit58</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit58</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT58_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit59Impl <em>Ctrl Unit59</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit59Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit59()
	 * @generated
	 */
	int CTRL_UNIT59 = 75;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iVar Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__INPUT_IVAR_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oVar Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59__OUTPUT_OVAR_OUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit59</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit59</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT59_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit60Impl <em>Ctrl Unit60</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit60Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit60()
	 * @generated
	 */
	int CTRL_UNIT60 = 76;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iDisconnect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IDISCONNECT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iStop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_ISTOP_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iPitch Braked</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IPITCH_BRAKED = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInverter Rpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IINVERTER_RPM = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iReady For On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IREADY_FOR_ON = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iReady For Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IREADY_FOR_RUN = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iReady For Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IREADY_FOR_REF = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input iReset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IRESET_ORDER = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input iForce Inv Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_IFORCE_INV_OFF = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input iSafety Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__INPUT_ISAFETY_INPUT = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output oInverter Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__OUTPUT_OINVERTER_RUN = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output oInverter To On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__OUTPUT_OINVERTER_TO_ON = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameter pInverter Conn Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter pInverter Conn Speed Hysteresis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__PARAMETER_PINVERTER_CONN_SPEED_HYSTERESIS = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fault fReconnect Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__FAULT_FRECONNECT_WARNING = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Fault fReady Ref Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__FAULT_FREADY_REF_WARNING = WTC_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Timer tConnection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__TIMER_TCONNECTION = WTC_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Timer tRunning Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60__TIMER_TRUNNING_DELAY = WTC_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Ctrl Unit60</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60_FEATURE_COUNT = WTC_FEATURE_COUNT + 18;

	/**
	 * The number of operations of the '<em>Ctrl Unit60</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT60_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit61Impl <em>Ctrl Unit61</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit61Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit61()
	 * @generated
	 */
	int CTRL_UNIT61 = 77;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInverter To On Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IINVERTER_TO_ON_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInverter Ready Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IINVERTER_READY_REF = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iRemote Reset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IREMOTE_RESET_ORDER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInverter Torque Reg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IINVERTER_TORQUE_REG = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iInverter Hw State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IINVERTER_HW_STATE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iReset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IRESET_ORDER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iMotorizing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__INPUT_IMOTORIZING = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oInverter To On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__OUTPUT_OINVERTER_TO_ON = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oInverter Reset Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__OUTPUT_OINVERTER_RESET_COMMAND = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Output oInverter Torque Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__OUTPUT_OINVERTER_TORQUE_REF = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output oInverter Reset Alarms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__OUTPUT_OINVERTER_RESET_ALARMS = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fault fEther CAT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__FAULT_FETHER_CAT = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Timer tReset Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__TIMER_TRESET_TIME = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Timer tDelay Between Resets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__TIMER_TDELAY_BETWEEN_RESETS = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Error Reaction er Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61__ERROR_REACTION_ER_STOP = WTC_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Ctrl Unit61</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61_FEATURE_COUNT = WTC_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Ctrl Unit61</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT61_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit62Impl <em>Ctrl Unit62</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit62Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit62()
	 * @generated
	 */
	int CTRL_UNIT62 = 78;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInverter Torque Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInverter Torque Ref Locking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__INPUT_IINVERTER_TORQUE_REF_LOCKING = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iMotorizing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__INPUT_IMOTORIZING = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oInverter Torque Ref Final</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__OUTPUT_OINVERTER_TORQUE_REF_FINAL = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oInverter Motorize Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62__OUTPUT_OINVERTER_MOTORIZE_COMMAND = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit62</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit62</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT62_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit63Impl <em>Ctrl Unit63</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit63Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit63()
	 * @generated
	 */
	int CTRL_UNIT63 = 79;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAzimuth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_IAZIMUTH = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_IORDER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iTarget Hole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_ITARGET_HOLE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInv Ready Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_IINV_READY_REF = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iEncoder Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_IENCODER_SPEED = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iInductive Sensor1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR1 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iInductive Sensor2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__INPUT_IINDUCTIVE_SENSOR2 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oMotor Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OMOTOR_TORQUE = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oMotor Sense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OMOTOR_SENSE = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Output oFl Into Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OFL_INTO_POSITION = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output oStatus From Dll</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OSTATUS_FROM_DLL = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output oPosition Setpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OPOSITION_SETPOINT = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Output oTorque Ave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OTORQUE_AVE = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Output oError Ave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OERROR_AVE = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Output oSpeed Ave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OSPEED_AVE = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Output oWref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OWREF = WTC_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Output oTarget Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OTARGET_POSITION = WTC_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Output oKeep State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OKEEP_STATE = WTC_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Output oSeek State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OSEEK_STATE = WTC_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Output oMotorize</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OMOTORIZE = WTC_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Output oReal Objetive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OREAL_OBJETIVE = WTC_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Output oControl Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__OUTPUT_OCONTROL_MODE = WTC_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Parameter pOffset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_POFFSET = WTC_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Parameter pEncoder Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PENCODER_OFFSET = WTC_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Parameter pNext Hole Degrees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PNEXT_HOLE_DEGREES = WTC_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Parameter pPos Rate1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PPOS_RATE1 = WTC_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Parameter pPos Rate2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PPOS_RATE2 = WTC_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Parameter pMax Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PMAX_SPEED = WTC_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Parameter pSample Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PSAMPLE_TIME = WTC_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Parameter pMax Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PMAX_TORQUE = WTC_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Parameter pAverage Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PAVERAGE_TIME = WTC_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Parameter pSpeed Average Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PSPEED_AVERAGE_TIME = WTC_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Parameter pMax Acceleration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PMAX_ACCELERATION = WTC_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Parameter pKpp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKPP = WTC_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Parameter pKps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKPS = WTC_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Parameter pKis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKIS = WTC_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Parameter pFilter OK</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PFILTER_OK = WTC_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Parameter pFilter Freq</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PFILTER_FREQ = WTC_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Parameter pFilter Damp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PFILTER_DAMP = WTC_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Parameter pKp2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKP2 = WTC_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Parameter pKp1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKP1 = WTC_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Parameter pKi1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKI1 = WTC_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Parameter pKi2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PKI2 = WTC_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Parameter pPos Band</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__PARAMETER_PPOS_BAND = WTC_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63__BHV_PARAM_BP_CONTROL_MODE = WTC_FEATURE_COUNT + 44;

	/**
	 * The number of structural features of the '<em>Ctrl Unit63</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63_FEATURE_COUNT = WTC_FEATURE_COUNT + 45;

	/**
	 * The number of operations of the '<em>Ctrl Unit63</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT63_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit64Impl <em>Ctrl Unit64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit64Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit64()
	 * @generated
	 */
	int CTRL_UNIT64 = 80;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Reaction er Error Reaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64__ERROR_REACTION_ER_ERROR_REACTION = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT64_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit65Impl <em>Ctrl Unit65</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit65Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit65()
	 * @generated
	 */
	int CTRL_UNIT65 = 81;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65__FAULT_FFAULT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit65</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit65</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT65_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit66Impl <em>Ctrl Unit66</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit66Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit66()
	 * @generated
	 */
	int CTRL_UNIT66 = 82;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iMaintenance Preventive Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__INPUT_IMAINTENANCE_PREVENTIVE_BUTTON = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iMaintenance Corrective Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__INPUT_IMAINTENANCE_CORRECTIVE_BUTTON = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oMaintenance Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__OUTPUT_OMAINTENANCE_STATUS = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fMaintenance Preventive</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__FAULT_FMAINTENANCE_PREVENTIVE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fault fMaintenance Corrective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66__FAULT_FMAINTENANCE_CORRECTIVE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit66</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit66</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT66_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit67Impl <em>Ctrl Unit67</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit67Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit67()
	 * @generated
	 */
	int CTRL_UNIT67 = 83;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iHMI Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__INPUT_IHMI_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iElement Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__INPUT_IELEMENT_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iMaster Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__INPUT_IMASTER_POS = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oElement Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__OUTPUT_OELEMENT_ROL = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMax Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__PARAMETER_PMAX_ELEMENTS = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit67</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit67</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT67_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit68Impl <em>Ctrl Unit68</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit68Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit68()
	 * @generated
	 */
	int CTRL_UNIT68 = 84;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iValue1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__INPUT_IVALUE1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iValue2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__INPUT_IVALUE2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oResult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__OUTPUT_ORESULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68__BHV_PARAM_BP_OPERATION_TYPE = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit68</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit68</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT68_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit69Impl <em>Ctrl Unit69</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit69Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit69()
	 * @generated
	 */
	int CTRL_UNIT69 = 85;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iLocal Max Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__INPUT_ILOCAL_MAX_POWER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iRemote Max Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__INPUT_IREMOTE_MAX_POWER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iTorque Control Max Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__INPUT_ITORQUE_CONTROL_MAX_POWER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oMax Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__OUTPUT_OMAX_POWER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMax Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69__PARAMETER_PMAX_POWER = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit69</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit69</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT69_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit70Impl <em>Ctrl Unit70</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit70Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit70()
	 * @generated
	 */
	int CTRL_UNIT70 = 86;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oResult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70__OUTPUT_ORESULT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit70</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit70</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT70_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit71Impl <em>Ctrl Unit71</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit71Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit71()
	 * @generated
	 */
	int CTRL_UNIT71 = 87;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSelect1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_ISELECT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iSelect2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_ISELECT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iSelect3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_ISELECT3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iInput3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__INPUT_IINPUT3 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oOutput Wrong Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71__OUTPUT_OOUTPUT_WRONG_STATUS = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit71</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit71</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT71_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit72Impl <em>Ctrl Unit72</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit72Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit72()
	 * @generated
	 */
	int CTRL_UNIT72 = 88;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72__TIMER_TDELAY = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit72</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit72</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT72_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit73Impl <em>Ctrl Unit73</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit73Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit73()
	 * @generated
	 */
	int CTRL_UNIT73 = 89;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit73</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit73</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT73_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit74Impl <em>Ctrl Unit74</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit74Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit74()
	 * @generated
	 */
	int CTRL_UNIT74 = 90;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iConverter Tripped</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__INPUT_ICONVERTER_TRIPPED = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iConverter Running</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__INPUT_ICONVERTER_RUNNING = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOpc Cnv Operation Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74__OUTPUT_OOPC_CNV_OPERATION_MODE = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit74</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit74</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT74_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit75Impl <em>Ctrl Unit75</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit75Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit75()
	 * @generated
	 */
	int CTRL_UNIT75 = 91;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iMaintenance Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IMAINTENANCE_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iFl Brakes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IFL_BRAKES = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iWTG Stopped</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IWTG_STOPPED = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iGrid Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IGRID_ERROR = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iRe Twisting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IRE_TWISTING = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iHi Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IHI_WIND = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iHi Gust</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IHI_GUST = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input iLow Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_ILOW_WIND = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input iBack Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IBACK_WIND = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input iEn Estela</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__INPUT_IEN_ESTELA = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output oOpc Turbine Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75__OUTPUT_OOPC_TURBINE_STATUS = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Ctrl Unit75</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75_FEATURE_COUNT = WTC_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Ctrl Unit75</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT75_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit76Impl <em>Ctrl Unit76</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit76Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit76()
	 * @generated
	 */
	int CTRL_UNIT76 = 92;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iCtrl Yaw Brake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__INPUT_ICTRL_YAW_BRAKE_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOpc Yaw Brake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76__OUTPUT_OOPC_YAW_BRAKE_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit76</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit76</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT76_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit77Impl <em>Ctrl Unit77</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit77Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit77()
	 * @generated
	 */
	int CTRL_UNIT77 = 93;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Inhibited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__INPUT_IYAW_INHIBITED = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iYaw Cw Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__INPUT_IYAW_CW_ORDER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iYaw Ccw Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__INPUT_IYAW_CCW_ORDER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iFlag Into Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__INPUT_IFLAG_INTO_WIND = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oOpc Yaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77__OUTPUT_OOPC_YAW_STATUS = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit77</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit77</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT77_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit78Impl <em>Ctrl Unit78</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit78Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit78()
	 * @generated
	 */
	int CTRL_UNIT78 = 94;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oOutput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78__OUTPUT_OOUTPUT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit78</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit78</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT78_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit79Impl <em>Ctrl Unit79</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit79Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit79()
	 * @generated
	 */
	int CTRL_UNIT79 = 95;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOver Pressure Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__INPUT_IOVER_PRESSURE_CMD = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oYaw Brake High Pressure Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fYaw Brake Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__FAULT_FYAW_BRAKE_BLOCK = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault fYaw Brake Loose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__FAULT_FYAW_BRAKE_LOOSE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fYaw Brake Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__FAULT_FYAW_BRAKE_ACTIVE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fault fWarning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__FAULT_FWARNING = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__FAULT_FFAULT = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Decision Sequence ds Commands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79__DECISION_SEQUENCE_DS_COMMANDS = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ctrl Unit79</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79_FEATURE_COUNT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ctrl Unit79</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT79_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit80Impl <em>Ctrl Unit80</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit80Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit80()
	 * @generated
	 */
	int CTRL_UNIT80 = 96;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAccess State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IACCESS_STATE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iMaintenance Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IMAINTENANCE_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iButton State NC2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IBUTTON_STATE_NC2 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iButton State TC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IBUTTON_STATE_TC = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iButton State Remote</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__INPUT_IBUTTON_STATE_REMOTE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oButton State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80__OUTPUT_OBUTTON_STATE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit80</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit80</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT80_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit81Impl <em>Ctrl Unit81</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit81Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit81()
	 * @generated
	 */
	int CTRL_UNIT81 = 97;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__INPUT_IINPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oPercent Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__OUTPUT_OPERCENT_VAL = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pPercent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__PARAMETER_PPERCENT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pInput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__PARAMETER_PINPUT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81__BHV_PARAM_BP_SELECT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit81</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit81</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT81_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit82Impl <em>Ctrl Unit82</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit82Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit82()
	 * @generated
	 */
	int CTRL_UNIT82 = 98;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iVar Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__INPUT_IVAR_INPUT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iWrite Twist Angle Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__INPUT_IWRITE_TWIST_ANGLE_REQUEST = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iNew Twist Angle Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__INPUT_INEW_TWIST_ANGLE_VALUE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oVar Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__OUTPUT_OVAR_OUTPUT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMin Difference To Consider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__PARAMETER_PMIN_DIFFERENCE_TO_CONSIDER = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tSync Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82__TIMER_TSYNC_DELAY = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit82</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit82</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT82_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit83Impl <em>Ctrl Unit83</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit83Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit83()
	 * @generated
	 */
	int CTRL_UNIT83 = 99;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPin Safety Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__INPUT_IPIN_SAFETY_CMD = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iPin Auto Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__INPUT_IPIN_AUTO_CMD = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iPin Manual Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__INPUT_IPIN_MANUAL_CMD = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iLocking Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__INPUT_ILOCKING_SET = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iManual Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__INPUT_IMANUAL_MODE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iSafety Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__INPUT_ISAFETY_BLOCK = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oPin Enable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__OUTPUT_OPIN_ENABLE = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oPin Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__OUTPUT_OPIN_EXTEND = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oPin Retract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83__OUTPUT_OPIN_RETRACT = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ctrl Unit83</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83_FEATURE_COUNT = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Ctrl Unit83</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT83_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit84Impl <em>Ctrl Unit84</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit84Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit84()
	 * @generated
	 */
	int CTRL_UNIT84 = 100;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAngle GH1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__INPUT_IANGLE_GH1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iAngle GH2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__INPUT_IANGLE_GH2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iAngle GH3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__INPUT_IANGLE_GH3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iStop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__INPUT_ISTOP_COMMAND = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iFl Brakes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__INPUT_IFL_BRAKES = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oAngle Reference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE1 = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oAngle Reference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE2 = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oAngle Reference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__OUTPUT_OANGLE_REFERENCE3 = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oSpeed Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__OUTPUT_OSPEED_REFERENCE = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Output oAcceleration Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__OUTPUT_OACCELERATION_REFERENCE = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Brake Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__PARAMETER_PPITCH_BRAKE_ANGLE = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Std Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__PARAMETER_PPITCH_STD_SPEED = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Std Acceleration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__PARAMETER_PPITCH_STD_ACCELERATION = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Regulation Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_SPEED = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Regulation Acceleration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__PARAMETER_PPITCH_REGULATION_ACCELERATION = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Error Reaction er Emergency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84__ERROR_REACTION_ER_EMERGENCY = WTC_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Ctrl Unit84</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84_FEATURE_COUNT = WTC_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Ctrl Unit84</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT84_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit85Impl <em>Ctrl Unit85</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit85Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit85()
	 * @generated
	 */
	int CTRL_UNIT85 = 101;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPitch Angle1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__INPUT_IPITCH_ANGLE1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iPitch Angle2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__INPUT_IPITCH_ANGLE2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iPitch Angle3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__INPUT_IPITCH_ANGLE3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oPitch Brake Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__OUTPUT_OPITCH_BRAKE_POSITION = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Max Brake Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__PARAMETER_PPITCH_MAX_BRAKE_ANGLE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Min Brake Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__PARAMETER_PPITCH_MIN_BRAKE_ANGLE = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Brake Angle Hysteresis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85__PARAMETER_PPITCH_BRAKE_ANGLE_HYSTERESIS = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit85</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit85</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT85_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit86Impl <em>Ctrl Unit86</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit86Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit86()
	 * @generated
	 */
	int CTRL_UNIT86 = 102;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPitch Hw Standby</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__INPUT_IPITCH_HW_STANDBY = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iPitch Hw Fault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__INPUT_IPITCH_HW_FAULT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iPitch Stop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__INPUT_IPITCH_STOP_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iPitch Brake Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__INPUT_IPITCH_BRAKE_POSITION = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oBrakes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__OUTPUT_OBRAKES = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oPitch Normal Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__OUTPUT_OPITCH_NORMAL_ORDER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oPitch Emergency Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__OUTPUT_OPITCH_EMERGENCY_ORDER = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oPitch Test UCap Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__OUTPUT_OPITCH_TEST_UCAP_ORDER = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Error Reaction er Emergency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__ERROR_REACTION_ER_EMERGENCY = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Error Reaction er Security Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86__ERROR_REACTION_ER_SECURITY_LINE = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit86</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit86</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT86_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit87Impl <em>Ctrl Unit87</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit87Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit87()
	 * @generated
	 */
	int CTRL_UNIT87 = 103;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iExternal Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__INPUT_IEXTERNAL_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iExternal Failure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__INPUT_IEXTERNAL_FAILURE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oLubrication Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__OUTPUT_OLUBRICATION_ORDER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87__TIMER_TDELAY = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit87</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit87</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT87_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit88Impl <em>Ctrl Unit88</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit88Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit88()
	 * @generated
	 */
	int CTRL_UNIT88 = 104;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPth Reset Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__INPUT_IPTH_RESET_COMMAND = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iPth Reset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__INPUT_IPTH_RESET_ORDER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oPth Reset Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__OUTPUT_OPTH_RESET_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oPth Reset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__OUTPUT_OPTH_RESET_ORDER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oPth Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__OUTPUT_OPTH_RESET = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tReset Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__TIMER_TRESET_TIMER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timer tTime Between Resets</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88__TIMER_TTIME_BETWEEN_RESETS = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit88</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit88</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT88_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit89Impl <em>Ctrl Unit89</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit89Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit89()
	 * @generated
	 */
	int CTRL_UNIT89 = 105;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iAngle Reference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IANGLE_REFERENCE1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iAngle Reference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IANGLE_REFERENCE2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iAngle Reference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IANGLE_REFERENCE3 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iSpeed Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_ISPEED_REFERENCE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iAcceleration Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IACCELERATION_REFERENCE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iPitch Manual Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IPITCH_MANUAL_CONTROL = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Input iPitch Manual Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IPITCH_MANUAL_ANGLE = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input iMaintenance Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IMAINTENANCE_STATUS = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input iGenerator Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IGENERATOR_SPEED = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Input iPitch Braked</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__INPUT_IPITCH_BRAKED = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output oPitch Angle Ref1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF1 = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output oPitch Angle Ref2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF2 = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Output oPitch Angle Ref3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__OUTPUT_OPITCH_ANGLE_REF3 = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Output oPitch Speed Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__OUTPUT_OPITCH_SPEED_REF = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Output oPitch Acceleration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__OUTPUT_OPITCH_ACCELERATION_REF = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Output oPitch Stop Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__OUTPUT_OPITCH_STOP_COMMAND = WTC_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Parameter pGenerator Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__PARAMETER_PGENERATOR_SPEED = WTC_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Brake Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__PARAMETER_PPITCH_BRAKE_ANGLE = WTC_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Std Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__PARAMETER_PPITCH_STD_SPEED = WTC_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Parameter pPitch Std Acceleration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__PARAMETER_PPITCH_STD_ACCELERATION = WTC_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Fault fManual Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__FAULT_FMANUAL_STOP = WTC_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Timer tMax Stop Operation Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__TIMER_TMAX_STOP_OPERATION_LENGTH = WTC_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Error Reaction er Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89__ERROR_REACTION_ER_STOP = WTC_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Ctrl Unit89</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89_FEATURE_COUNT = WTC_FEATURE_COUNT + 23;

	/**
	 * The number of operations of the '<em>Ctrl Unit89</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT89_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit90Impl <em>Ctrl Unit90</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit90Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit90()
	 * @generated
	 */
	int CTRL_UNIT90 = 106;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iStatus R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__INPUT_ISTATUS_R = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iStatus S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__INPUT_ISTATUS_S = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iStatus T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__INPUT_ISTATUS_T = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iValue R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__INPUT_IVALUE_R = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iValue S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__INPUT_IVALUE_S = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iValue T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__INPUT_IVALUE_T = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oCosine Phi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCOSINE_PHI = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oFrequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OFREQUENCY = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oControl R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCONTROL_R = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Output oControl S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCONTROL_S = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Output oControl T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCONTROL_T = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Output oApparent Power</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OAPPARENT_POWER = WTC_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Output oVoltage R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OVOLTAGE_R = WTC_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Output oVoltage S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OVOLTAGE_S = WTC_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Output oVoltage T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OVOLTAGE_T = WTC_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Output oCurrent R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCURRENT_R = WTC_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Output oCurrent S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCURRENT_S = WTC_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Output oCurrent T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__OUTPUT_OCURRENT_T = WTC_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Parameter pCurrent Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__PARAMETER_PCURRENT_FACTOR = WTC_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Parameter pVoltage Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90__PARAMETER_PVOLTAGE_FACTOR = WTC_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Ctrl Unit90</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90_FEATURE_COUNT = WTC_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Ctrl Unit90</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT90_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit91Impl <em>Ctrl Unit91</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit91Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit91()
	 * @generated
	 */
	int CTRL_UNIT91 = 107;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTemp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__INPUT_ITEMP = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iLimit Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__INPUT_ILIMIT_ERROR = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pLimit Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__PARAMETER_PLIMIT_RESET = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fError</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__FAULT_FERROR = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__TIMER_TDELAY = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit91</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit91</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT91_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit92Impl <em>Ctrl Unit92</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit92Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit92()
	 * @generated
	 */
	int CTRL_UNIT92 = 108;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTemp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__INPUT_ITEMP = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iDont Check Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__INPUT_IDONT_CHECK_INPUT = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pLimit Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__PARAMETER_PLIMIT_ERROR = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pLimit Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__PARAMETER_PLIMIT_RESET = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault fError</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__FAULT_FERROR = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit92</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit92</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT92_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit93Impl <em>Ctrl Unit93</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit93Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit93()
	 * @generated
	 */
	int CTRL_UNIT93 = 109;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iActual Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__INPUT_IACTUAL_VAL = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oLast Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__OUTPUT_OLAST_VAL = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pRate Limiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93__PARAMETER_PRATE_LIMITER = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit93</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit93</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT93_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit94Impl <em>Ctrl Unit94</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit94Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit94()
	 * @generated
	 */
	int CTRL_UNIT94 = 110;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iReset Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__INPUT_IRESET_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oValue To Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94__OUTPUT_OVALUE_TO_RESET = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit94</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit94</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT94_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit95Impl <em>Ctrl Unit95</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit95Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit95()
	 * @generated
	 */
	int CTRL_UNIT95 = 111;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iAccess State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__INPUT_IACCESS_STATE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oTwist Angle Left Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_LEFT_LIMIT = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oTwist Angle Right Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__OUTPUT_OTWIST_ANGLE_RIGHT_LIMIT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oRetwist Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__OUTPUT_ORETWIST_PRE_COMMAND = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Fault fTwist Excessive CW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CW = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fault fTwist Excessive CCW</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95__FAULT_FTWIST_EXCESSIVE_CCW = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit95</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit95</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT95_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit96Impl <em>Ctrl Unit96</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit96Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit96()
	 * @generated
	 */
	int CTRL_UNIT96 = 112;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iHMI Disable Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__INPUT_IHMI_DISABLE_ORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iElement Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__INPUT_IELEMENT_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oElement Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__OUTPUT_OELEMENT_ROL = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pMax Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96__PARAMETER_PMAX_ELEMENTS = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit96</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit96</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT96_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit97Impl <em>Ctrl Unit97</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit97Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit97()
	 * @generated
	 */
	int CTRL_UNIT97 = 113;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSafety Line General Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__INPUT_ISAFETY_LINE_GENERAL_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oDont Check Emergency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__OUTPUT_ODONT_CHECK_EMERGENCY = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fSec Loop Off</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97__FAULT_FSEC_LOOP_OFF = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit97</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit97</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT97_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit98Impl <em>Ctrl Unit98</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit98Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit98()
	 * @generated
	 */
	int CTRL_UNIT98 = 114;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSafety Line Stopped</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__INPUT_ISAFETY_LINE_STOPPED = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oEmergency Rearm Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98__OUTPUT_OEMERGENCY_REARM_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit98</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit98</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT98_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit99Impl <em>Ctrl Unit99</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit99Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit99()
	 * @generated
	 */
	int CTRL_UNIT99 = 115;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSafety Line General Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__INPUT_ISAFETY_LINE_GENERAL_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oSafety Line Start Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99__OUTPUT_OSAFETY_LINE_START_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit99</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit99</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT99_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit100Impl <em>Ctrl Unit100</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit100Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit100()
	 * @generated
	 */
	int CTRL_UNIT100 = 116;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iPin Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__INPUT_IPIN_POSITION = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oPin Safety Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__OUTPUT_OPIN_SAFETY_CMD = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pPin No Back Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__PARAMETER_PPIN_NO_BACK_POS = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pPin Extended Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__PARAMETER_PPIN_EXTENDED_POS = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pPin Retracted Pos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__PARAMETER_PPIN_RETRACTED_POS = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pPin Hysteresis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__PARAMETER_PPIN_HYSTERESIS = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit100</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit100</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT100_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit101Impl <em>Ctrl Unit101</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit101Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit101()
	 * @generated
	 */
	int CTRL_UNIT101 = 117;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iSpeed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__INPUT_ISPEED = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iPosition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__INPUT_IPOSITION = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oSpeed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__OUTPUT_OSPEED = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oSpeed Monitoring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__OUTPUT_OSPEED_MONITORING = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pOffset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__PARAMETER_POFFSET = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pConversion Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101__PARAMETER_PCONVERSION_FACTOR = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit101</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit101</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT101_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit102Impl <em>Ctrl Unit102</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit102Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit102()
	 * @generated
	 */
	int CTRL_UNIT102 = 118;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOriginal Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__INPUT_IORIGINAL_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iReset Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__INPUT_IRESET_REQUEST = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oFiltered Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__OUTPUT_OFILTERED_STATUS = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102__FAULT_FFAULT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit102</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit102</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT102_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit103Impl <em>Ctrl Unit103</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit103Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit103()
	 * @generated
	 */
	int CTRL_UNIT103 = 119;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInput1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__INPUT_IINPUT1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInput2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__INPUT_IINPUT2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oResult</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103__OUTPUT_ORESULT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit103</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit103</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT103_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit104Impl <em>Ctrl Unit104</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit104Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit104()
	 * @generated
	 */
	int CTRL_UNIT104 = 120;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__INPUT_IORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__OUTPUT_OORDER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__TIMER_TTIMER = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer tDelay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104__TIMER_TDELAY = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit104</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit104</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT104_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit105Impl <em>Ctrl Unit105</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit105Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit105()
	 * @generated
	 */
	int CTRL_UNIT105 = 121;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iEntry To Count</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__INPUT_IENTRY_TO_COUNT = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iReset Partial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__INPUT_IRESET_PARTIAL = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oSeconds On Total</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__OUTPUT_OSECONDS_ON_TOTAL = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oSeconds On Partial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105__OUTPUT_OSECONDS_ON_PARTIAL = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit105</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit105</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT105_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit106Impl <em>Ctrl Unit106</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit106Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit106()
	 * @generated
	 */
	int CTRL_UNIT106 = 122;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input i1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__INPUT_I1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output o1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__OUTPUT_O1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timer t1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__TIMER_T1 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timer t2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__TIMER_T2 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit106</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit106</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT106_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit107Impl <em>Ctrl Unit107</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit107Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit107()
	 * @generated
	 */
	int CTRL_UNIT107 = 123;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Fault fDLL Warning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__FAULT_FDLL_WARNING = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fDLL Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107__FAULT_FDLL_ERROR = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit107</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit107</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT107_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit108Impl <em>Ctrl Unit108</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit108Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit108()
	 * @generated
	 */
	int CTRL_UNIT108 = 124;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iVoltage Drop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__INPUT_IVOLTAGE_DROP = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fVoltage Drop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__FAULT_FVOLTAGE_DROP = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timer tAuto Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108__TIMER_TAUTO_RESET = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit108</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT108_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit109Impl <em>Ctrl Unit109</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit109Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit109()
	 * @generated
	 */
	int CTRL_UNIT109 = 125;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInv Hw Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__INPUT_IINV_HW_RUN = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iVoltage Drop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__INPUT_IVOLTAGE_DROP = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iTorque Demand</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__INPUT_ITORQUE_DEMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInv Stop Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__INPUT_IINV_STOP_ORDER = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oTorque Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__OUTPUT_OTORQUE_REFERENCE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Reaction er Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109__ERROR_REACTION_ER_STOP = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit109</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit109</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT109_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit110Impl <em>Ctrl Unit110</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit110Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit110()
	 * @generated
	 */
	int CTRL_UNIT110 = 126;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iManual Stop Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__INPUT_IMANUAL_STOP_REQUEST = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iRemote Stop Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__INPUT_IREMOTE_STOP_REQUEST = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iManual Start Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__INPUT_IMANUAL_START_REQUEST = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iRemote Start Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__INPUT_IREMOTE_START_REQUEST = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iStopped</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__INPUT_ISTOPPED = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oMachine Stop Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110__OUTPUT_OMACHINE_STOP_ORDER = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit110</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit110</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT110_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit111Impl <em>Ctrl Unit111</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit111Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit111()
	 * @generated
	 */
	int CTRL_UNIT111 = 127;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iOrder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__INPUT_IORDER = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__TIMER_TTIMER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111__BHV_PARAM_BP_MODE = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit111</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit111</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT111_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit112Impl <em>Ctrl Unit112</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit112Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit112()
	 * @generated
	 */
	int CTRL_UNIT112 = 128;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oChange Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__OUTPUT_OCHANGE_CMD = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oPersistent Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__OUTPUT_OPERSISTENT_DAY = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pDay Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112__PARAMETER_PDAY_CHANGE = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit112</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit112</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT112_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit113Impl <em>Ctrl Unit113</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit113Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit113()
	 * @generated
	 */
	int CTRL_UNIT113 = 129;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iWind Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__INPUT_IWIND_SPEED = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iWind Speed Average</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__INPUT_IWIND_SPEED_AVERAGE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oExcessive Wind Acceleration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__OUTPUT_OEXCESSIVE_WIND_ACCELERATION = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pConsidered Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__PARAMETER_PCONSIDERED_TIME = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pWind Acceleration Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__PARAMETER_PWIND_ACCELERATION_LIMIT = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pHi Wind Limit Reset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__PARAMETER_PHI_WIND_LIMIT_RESET = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pMax Absolute Wind Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113__PARAMETER_PMAX_ABSOLUTE_WIND_SPEED = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit113</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit113</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT113_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit114Impl <em>Ctrl Unit114</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit114Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit114()
	 * @generated
	 */
	int CTRL_UNIT114 = 130;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iWind Direction Raw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__INPUT_IWIND_DIRECTION_RAW = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iNacelle Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__INPUT_INACELLE_DIRECTION = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oWind Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__OUTPUT_OWIND_DIRECTION = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oWind Direction Average</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_AVERAGE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oWind Direction Disp Absolute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_ABSOLUTE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oWind Direction Disp Relative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__OUTPUT_OWIND_DIRECTION_DISP_RELATIVE = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pVane Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114__PARAMETER_PVANE_OFFSET = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ctrl Unit114</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114_FEATURE_COUNT = WTC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ctrl Unit114</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT114_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit115Impl <em>Ctrl Unit115</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit115Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit115()
	 * @generated
	 */
	int CTRL_UNIT115 = 131;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iWind Speed Raw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__INPUT_IWIND_SPEED_RAW = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oWind Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__OUTPUT_OWIND_SPEED = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oWind Speed Average</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__OUTPUT_OWIND_SPEED_AVERAGE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pNacelle Slope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__PARAMETER_PNACELLE_SLOPE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pNacelle Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__PARAMETER_PNACELLE_OFFSET = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pWind Speed Average Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115__PARAMETER_PWIND_SPEED_AVERAGE_PERIOD = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit115</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit115</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT115_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit116Impl <em>Ctrl Unit116</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit116Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit116()
	 * @generated
	 */
	int CTRL_UNIT116 = 132;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInhibit Auto Yaw Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__INPUT_IINHIBIT_AUTO_YAW_CONDITION = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInhibit Yaw Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__INPUT_IINHIBIT_YAW_CONDITION = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oInhibit Auto Yaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__OUTPUT_OINHIBIT_AUTO_YAW = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oInhibit Yaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__OUTPUT_OINHIBIT_YAW = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oYaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116__OUTPUT_OYAW_STATUS = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit116</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit116</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT116_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit117Impl <em>Ctrl Unit117</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit117Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit117()
	 * @generated
	 */
	int CTRL_UNIT117 = 133;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Brake Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__INPUT_IYAW_BRAKE_COMMAND = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iYaw Electrobrake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__INPUT_IYAW_ELECTROBRAKE_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iYaw Hydraulicbrake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__INPUT_IYAW_HYDRAULICBRAKE_STATUS = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInhibit Yaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__INPUT_IINHIBIT_YAW = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oYaw Brake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__OUTPUT_OYAW_BRAKE_STATUS = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oYaw Electrobrake Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__OUTPUT_OYAW_ELECTROBRAKE_ORDER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oYaw Hydraulicbrake Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__OUTPUT_OYAW_HYDRAULICBRAKE_ORDER = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Output oBrakes Set Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__OUTPUT_OBRAKES_SET_PROBLEM = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Output oBrakes Lifted Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__OUTPUT_OBRAKES_LIFTED_PROBLEM = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Timer tYaw Brake Actions Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117__TIMER_TYAW_BRAKE_ACTIONS_DELAY = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ctrl Unit117</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117_FEATURE_COUNT = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Ctrl Unit117</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT117_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit118Impl <em>Ctrl Unit118</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit118Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit118()
	 * @generated
	 */
	int CTRL_UNIT118 = 134;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Brake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__INPUT_IYAW_BRAKE_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iRetwist Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__INPUT_IRETWIST_PRE_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iYaw Brake Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__INPUT_IYAW_BRAKE_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oYaw Hydraulicbrake2 Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118__OUTPUT_OYAW_HYDRAULICBRAKE2_ORDER = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit118</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit118</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT118_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit119Impl <em>Ctrl Unit119</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit119Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit119()
	 * @generated
	 */
	int CTRL_UNIT119 = 135;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iManual Yaw Brake Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__INPUT_IMANUAL_YAW_BRAKE_PRE_COMMAND = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iAuto Yaw Brake Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__INPUT_IAUTO_YAW_BRAKE_PRE_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oYaw Brake Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119__OUTPUT_OYAW_BRAKE_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit119</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit119</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT119_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit120Impl <em>Ctrl Unit120</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit120Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit120()
	 * @generated
	 */
	int CTRL_UNIT120 = 136;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Cw Final Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__INPUT_IYAW_CW_FINAL_BUTTON = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iYaw Ccw Final Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__INPUT_IYAW_CCW_FINAL_BUTTON = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oManual Yaw Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120__OUTPUT_OMANUAL_YAW_PRE_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit120</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit120</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT120_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit121Impl <em>Ctrl Unit121</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit121Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit121()
	 * @generated
	 */
	int CTRL_UNIT121 = 137;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iManual Yaw Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__INPUT_IMANUAL_YAW_PRE_COMMAND = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iMax Twist Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__INPUT_IMAX_TWIST_PRE_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iRetwist Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__INPUT_IRETWIST_PRE_COMMAND = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iRel Wind Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__INPUT_IREL_WIND_PRE_COMMAND = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oYaw Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121__OUTPUT_OYAW_COMMAND = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit121</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit121</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT121_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit122Impl <em>Ctrl Unit122</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit122Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit122()
	 * @generated
	 */
	int CTRL_UNIT122 = 138;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__INPUT_IYAW_COMMAND = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iYaw Brake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__INPUT_IYAW_BRAKE_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iInhibit Yaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__INPUT_IINHIBIT_YAW = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oYaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__OUTPUT_OYAW_STATUS = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oYaw Brake Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__OUTPUT_OYAW_BRAKE_COMMAND = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oYaw Cw Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__OUTPUT_OYAW_CW_ORDER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oYaw Ccw Order</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__OUTPUT_OYAW_CCW_ORDER = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timer tDelay Yawing Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__TIMER_TDELAY_YAWING_CONTROL = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Timer tDelay Yawing To Stop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122__TIMER_TDELAY_YAWING_TO_STOP = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ctrl Unit122</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122_FEATURE_COUNT = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Ctrl Unit122</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT122_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit123Impl <em>Ctrl Unit123</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit123Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit123()
	 * @generated
	 */
	int CTRL_UNIT123 = 139;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iUpper Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__INPUT_IUPPER_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iLower Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__INPUT_ILOWER_STATUS = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oBrake Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123__OUTPUT_OBRAKE_STATUS = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit123</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit123</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT123_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit124Impl <em>Ctrl Unit124</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit124Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit124()
	 * @generated
	 */
	int CTRL_UNIT124 = 140;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTorque Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__INPUT_ITORQUE_VAL = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iRol Converter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__INPUT_IROL_CONVERTER = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oTorque Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124__OUTPUT_OTORQUE_REF = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ctrl Unit124</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124_FEATURE_COUNT = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ctrl Unit124</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT124_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit125Impl <em>Ctrl Unit125</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit125Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit125()
	 * @generated
	 */
	int CTRL_UNIT125 = 141;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iInv Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__INPUT_IINV_ROL = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output oSpeed Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__OUTPUT_OSPEED_REF = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter pSpeed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__PARAMETER_PSPEED = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pOffset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125__PARAMETER_POFFSET = WTC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ctrl Unit125</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125_FEATURE_COUNT = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ctrl Unit125</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT125_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit126Impl <em>Ctrl Unit126</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit126Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit126()
	 * @generated
	 */
	int CTRL_UNIT126 = 142;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTorque Val</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__INPUT_ITORQUE_VAL = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iInv Rol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__INPUT_IINV_ROL = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oMax Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__OUTPUT_OMAX_TORQUE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oMin Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__OUTPUT_OMIN_TORQUE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pMax Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__PARAMETER_PMAX_TORQUE = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pMin Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126__PARAMETER_PMIN_TORQUE = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ctrl Unit126</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126_FEATURE_COUNT = WTC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ctrl Unit126</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT126_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit127Impl <em>Ctrl Unit127</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit127Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit127()
	 * @generated
	 */
	int CTRL_UNIT127 = 143;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iLow Wind Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__INPUT_ILOW_WIND_ACTIVE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iWind Direction Rel Avg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__INPUT_IWIND_DIRECTION_REL_AVG = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iInhibit Auto Yaw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__INPUT_IINHIBIT_AUTO_YAW = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output oRel Wind Pre Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__OUTPUT_OREL_WIND_PRE_COMMAND = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Output oFlag Into Wind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__OUTPUT_OFLAG_INTO_WIND = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oExcessive Yawing Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__OUTPUT_OEXCESSIVE_YAWING_TIME = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pWind Direction Tolerance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__PARAMETER_PWIND_DIRECTION_TOLERANCE = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pYaw Filter Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__PARAMETER_PYAW_FILTER_TIME = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pYaw Stop Angle Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__PARAMETER_PYAW_STOP_ANGLE_LIMIT = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Timer tMaximum Time Yawing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127__TIMER_TMAXIMUM_TIME_YAWING = WTC_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Ctrl Unit127</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127_FEATURE_COUNT = WTC_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Ctrl Unit127</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT127_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit128Impl <em>Ctrl Unit128</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit128Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit128()
	 * @generated
	 */
	int CTRL_UNIT128 = 144;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__INPUT_IYAW_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output oYaw Motion Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__OUTPUT_OYAW_MOTION_PROBLEM = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter pDegrees Per Second</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__PARAMETER_PDEGREES_PER_SECOND = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Timer tCheck Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128__TIMER_TCHECK_FREQUENCY = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit128</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit128</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT128_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit129Impl <em>Ctrl Unit129</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit129Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit129()
	 * @generated
	 */
	int CTRL_UNIT129 = 145;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__INPUT_IYAW_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iYaw Current1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__INPUT_IYAW_CURRENT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iYaw Current2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__INPUT_IYAW_CURRENT2 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iYaw Current3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__INPUT_IYAW_CURRENT3 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iYaw Current4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__INPUT_IYAW_CURRENT4 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter pMinimum Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__PARAMETER_PMINIMUM_TORQUE = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameter pTorque Difference Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__PARAMETER_PTORQUE_DIFFERENCE_LIMIT = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fault fYaw Motor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__FAULT_FYAW_MOTOR = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129__TIMER_TTIMER = WTC_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Ctrl Unit129</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129_FEATURE_COUNT = WTC_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Ctrl Unit129</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT129_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit130Impl <em>Ctrl Unit130</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit130Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit130()
	 * @generated
	 */
	int CTRL_UNIT130 = 146;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Output oYaw Brake High Pressure Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__OUTPUT_OYAW_BRAKE_HIGH_PRESSURE_CMD = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault fOverpressure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130__FAULT_FOVERPRESSURE = WTC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ctrl Unit130</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130_FEATURE_COUNT = WTC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ctrl Unit130</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT130_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit131Impl <em>Ctrl Unit131</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit131Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit131()
	 * @generated
	 */
	int CTRL_UNIT131 = 147;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iExcessive Pressure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__INPUT_IEXCESSIVE_PRESSURE = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iBrake Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__INPUT_IBRAKE_COMMAND = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fault fComm Error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__FAULT_FCOMM_ERROR = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__FAULT_FFAULT = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bhv Param bp Logic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131__BHV_PARAM_BP_LOGIC_TYPE = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit131</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit131</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT131_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit132Impl <em>Ctrl Unit132</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit132Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit132()
	 * @generated
	 */
	int CTRL_UNIT132 = 148;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iTeeth1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__INPUT_ITEETH1 = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iTeeth2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__INPUT_ITEETH2 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__INPUT_ITWIST_ANGLE = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output oTwist Angle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__OUTPUT_OTWIST_ANGLE = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameter pDegrees Per Pulse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132__PARAMETER_PDEGREES_PER_PULSE = WTC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ctrl Unit132</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132_FEATURE_COUNT = WTC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ctrl Unit132</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT132_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link WTSpecID.impl.CtrlUnit133Impl <em>Ctrl Unit133</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WTSpecID.impl.CtrlUnit133Impl
	 * @see WTSpecID.impl.WTSpecIDPackageImpl#getCtrlUnit133()
	 * @generated
	 */
	int CTRL_UNIT133 = 149;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__ID = WTC__ID;

	/**
	 * The feature id for the '<em><b>Sys Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__SYS_ID = WTC__SYS_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__DESCRIPTION = WTC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__CYCLE = WTC__CYCLE;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__PRIORITY = WTC__PRIORITY;

	/**
	 * The feature id for the '<em><b>Input iYaw Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__INPUT_IYAW_STATUS = WTC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input iYaw Current1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__INPUT_IYAW_CURRENT1 = WTC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input iYaw Current2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__INPUT_IYAW_CURRENT2 = WTC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input iYaw Current3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__INPUT_IYAW_CURRENT3 = WTC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input iYaw Current4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__INPUT_IYAW_CURRENT4 = WTC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input iOverload Alarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__INPUT_IOVERLOAD_ALARM_COUNTER = WTC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output oOverload Alarm Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__OUTPUT_OOVERLOAD_ALARM_COUNTER = WTC_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parameter pMaximum Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__PARAMETER_PMAXIMUM_TORQUE = WTC_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameter pMinimum Torque</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__PARAMETER_PMINIMUM_TORQUE = WTC_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parameter pTorque Difference Limit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__PARAMETER_PTORQUE_DIFFERENCE_LIMIT = WTC_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Fault fFault</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__FAULT_FFAULT = WTC_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Timer tTimer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133__TIMER_TTIMER = WTC_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Ctrl Unit133</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133_FEATURE_COUNT = WTC_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Ctrl Unit133</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CTRL_UNIT133_OPERATION_COUNT = WTC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link WTSpecID.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see WTSpecID.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.Identifiable#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see WTSpecID.Identifiable#getID()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_ID();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WT <em>WT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WT</em>'.
	 * @see WTSpecID.WT
	 * @generated
	 */
	EClass getWT();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.WT#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.WT#getSysId()
	 * @see #getWT()
	 * @generated
	 */
	EAttribute getWT_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.WT#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see WTSpecID.WT#getModel()
	 * @see #getWT()
	 * @generated
	 */
	EAttribute getWT_Model();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.WT#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see WTSpecID.WT#getVersion()
	 * @see #getWT()
	 * @generated
	 */
	EAttribute getWT_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsSubsystems <em>Its Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Subsystems</em>'.
	 * @see WTSpecID.WT#getItsSubsystems()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsSubsystems();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsInputs <em>Its Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Inputs</em>'.
	 * @see WTSpecID.WT#getItsInputs()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsInputs();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsOutputs <em>Its Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Outputs</em>'.
	 * @see WTSpecID.WT#getItsOutputs()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsParams <em>Its Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Params</em>'.
	 * @see WTSpecID.WT#getItsParams()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsParams();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsTimers <em>Its Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Timers</em>'.
	 * @see WTSpecID.WT#getItsTimers()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsTimers();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsFaults <em>Its Faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Faults</em>'.
	 * @see WTSpecID.WT#getItsFaults()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsFaults();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsVariables <em>Its Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Variables</em>'.
	 * @see WTSpecID.WT#getItsVariables()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.WT#getItsErrorReactions <em>Its Error Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Error Reactions</em>'.
	 * @see WTSpecID.WT#getItsErrorReactions()
	 * @see #getWT()
	 * @generated
	 */
	EReference getWT_ItsErrorReactions();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemInput <em>System Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Input</em>'.
	 * @see WTSpecID.SystemInput
	 * @generated
	 */
	EClass getSystemInput();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemInput#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemInput#getSysId()
	 * @see #getSystemInput()
	 * @generated
	 */
	EAttribute getSystemInput_SysId();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemOutput <em>System Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Output</em>'.
	 * @see WTSpecID.SystemOutput
	 * @generated
	 */
	EClass getSystemOutput();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemOutput#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemOutput#getSysId()
	 * @see #getSystemOutput()
	 * @generated
	 */
	EAttribute getSystemOutput_SysId();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemFault <em>System Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Fault</em>'.
	 * @see WTSpecID.SystemFault
	 * @generated
	 */
	EClass getSystemFault();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemFault#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemFault#getSysId()
	 * @see #getSystemFault()
	 * @generated
	 */
	EAttribute getSystemFault_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemFault#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WTSpecID.SystemFault#getValue()
	 * @see #getSystemFault()
	 * @generated
	 */
	EAttribute getSystemFault_Value();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemParam <em>System Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Param</em>'.
	 * @see WTSpecID.SystemParam
	 * @generated
	 */
	EClass getSystemParam();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemParam#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemParam#getSysId()
	 * @see #getSystemParam()
	 * @generated
	 */
	EAttribute getSystemParam_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WTSpecID.SystemParam#getValue()
	 * @see #getSystemParam()
	 * @generated
	 */
	EAttribute getSystemParam_Value();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemTimer <em>System Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Timer</em>'.
	 * @see WTSpecID.SystemTimer
	 * @generated
	 */
	EClass getSystemTimer();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemTimer#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemTimer#getSysId()
	 * @see #getSystemTimer()
	 * @generated
	 */
	EAttribute getSystemTimer_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemTimer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see WTSpecID.SystemTimer#getValue()
	 * @see #getSystemTimer()
	 * @generated
	 */
	EAttribute getSystemTimer_Value();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemVariable <em>System Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Variable</em>'.
	 * @see WTSpecID.SystemVariable
	 * @generated
	 */
	EClass getSystemVariable();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemVariable#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemVariable#getSysId()
	 * @see #getSystemVariable()
	 * @generated
	 */
	EAttribute getSystemVariable_SysId();

	/**
	 * Returns the meta object for class '{@link WTSpecID.SystemErrorReaction <em>System Error Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Error Reaction</em>'.
	 * @see WTSpecID.SystemErrorReaction
	 * @generated
	 */
	EClass getSystemErrorReaction();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.SystemErrorReaction#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.SystemErrorReaction#getSysId()
	 * @see #getSystemErrorReaction()
	 * @generated
	 */
	EAttribute getSystemErrorReaction_SysId();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WTCInput <em>WTC Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Input</em>'.
	 * @see WTSpecID.WTCInput
	 * @generated
	 */
	EClass getWTCInput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WTCOutput <em>WTC Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Output</em>'.
	 * @see WTSpecID.WTCOutput
	 * @generated
	 */
	EClass getWTCOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WTCParam <em>WTC Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Param</em>'.
	 * @see WTSpecID.WTCParam
	 * @generated
	 */
	EClass getWTCParam();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WTCTimer <em>WTC Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Timer</em>'.
	 * @see WTSpecID.WTCTimer
	 * @generated
	 */
	EClass getWTCTimer();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WTCFault <em>WTC Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Fault</em>'.
	 * @see WTSpecID.WTCFault
	 * @generated
	 */
	EClass getWTCFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.WTCErrorReaction <em>WTC Error Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WTC Error Reaction</em>'.
	 * @see WTSpecID.WTCErrorReaction
	 * @generated
	 */
	EClass getWTCErrorReaction();

	/**
	 * Returns the meta object for class '{@link WTSpecID.Subsystem <em>Subsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsystem</em>'.
	 * @see WTSpecID.Subsystem
	 * @generated
	 */
	EClass getSubsystem();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.Subsystem#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.Subsystem#getSysId()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.Subsystem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpecID.Subsystem#getDescription()
	 * @see #getSubsystem()
	 * @generated
	 */
	EAttribute getSubsystem_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.Subsystem#getItsWTCs <em>Its WT Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its WT Cs</em>'.
	 * @see WTSpecID.Subsystem#getItsWTCs()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_ItsWTCs();

	/**
	 * Returns the meta object for the containment reference list '{@link WTSpecID.Subsystem#getItsSubsystems <em>Its Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Its Subsystems</em>'.
	 * @see WTSpecID.Subsystem#getItsSubsystems()
	 * @see #getSubsystem()
	 * @generated
	 */
	EReference getSubsystem_ItsSubsystems();

	/**
	 * Returns the meta object for class '{@link WTSpecID.wtc <em>wtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>wtc</em>'.
	 * @see WTSpecID.wtc
	 * @generated
	 */
	EClass getwtc();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.wtc#getSysId <em>Sys Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Id</em>'.
	 * @see WTSpecID.wtc#getSysId()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_SysId();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.wtc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WTSpecID.wtc#getDescription()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Description();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.wtc#getCycle <em>Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cycle</em>'.
	 * @see WTSpecID.wtc#getCycle()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Cycle();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.wtc#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see WTSpecID.wtc#getPriority()
	 * @see #getwtc()
	 * @generated
	 */
	EAttribute getwtc_Priority();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit1 <em>Ctrl Unit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit1</em>'.
	 * @see WTSpecID.CtrlUnit1
	 * @generated
	 */
	EClass getCtrlUnit1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit1#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit1#getInput__iTwistAngle()
	 * @see #getCtrlUnit1()
	 * @generated
	 */
	EReference getCtrlUnit1_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit1#getOutput__oNacelleDirection <em>Output oNacelle Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oNacelle Direction</em>'.
	 * @see WTSpecID.CtrlUnit1#getOutput__oNacelleDirection()
	 * @see #getCtrlUnit1()
	 * @generated
	 */
	EReference getCtrlUnit1_Output__oNacelleDirection();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit2 <em>Ctrl Unit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit2</em>'.
	 * @see WTSpecID.CtrlUnit2
	 * @generated
	 */
	EClass getCtrlUnit2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit2#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit2#getInput__iTwistAngle()
	 * @see #getCtrlUnit2()
	 * @generated
	 */
	EReference getCtrlUnit2_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit2#getOutput__oNorthDirection <em>Output oNorth Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oNorth Direction</em>'.
	 * @see WTSpecID.CtrlUnit2#getOutput__oNorthDirection()
	 * @see #getCtrlUnit2()
	 * @generated
	 */
	EReference getCtrlUnit2_Output__oNorthDirection();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit2#getParameter__pNorthOffset <em>Parameter pNorth Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pNorth Offset</em>'.
	 * @see WTSpecID.CtrlUnit2#getParameter__pNorthOffset()
	 * @see #getCtrlUnit2()
	 * @generated
	 */
	EReference getCtrlUnit2_Parameter__pNorthOffset();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit3 <em>Ctrl Unit3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit3</em>'.
	 * @see WTSpecID.CtrlUnit3
	 * @generated
	 */
	EClass getCtrlUnit3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit3#getInput__iAccessStateNC2 <em>Input iAccess State NC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAccess State NC2</em>'.
	 * @see WTSpecID.CtrlUnit3#getInput__iAccessStateNC2()
	 * @see #getCtrlUnit3()
	 * @generated
	 */
	EReference getCtrlUnit3_Input__iAccessStateNC2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit3#getInput__iAccessStateTC <em>Input iAccess State TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAccess State TC</em>'.
	 * @see WTSpecID.CtrlUnit3#getInput__iAccessStateTC()
	 * @see #getCtrlUnit3()
	 * @generated
	 */
	EReference getCtrlUnit3_Input__iAccessStateTC();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit3#getOutput__oAccessState <em>Output oAccess State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAccess State</em>'.
	 * @see WTSpecID.CtrlUnit3#getOutput__oAccessState()
	 * @see #getCtrlUnit3()
	 * @generated
	 */
	EReference getCtrlUnit3_Output__oAccessState();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit4 <em>Ctrl Unit4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit4</em>'.
	 * @see WTSpecID.CtrlUnit4
	 * @generated
	 */
	EClass getCtrlUnit4();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getInput__iStatus <em>Input iStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStatus</em>'.
	 * @see WTSpecID.CtrlUnit4#getInput__iStatus()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Input__iStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getInput__iOverloadAlarm <em>Input iOverload Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOverload Alarm</em>'.
	 * @see WTSpecID.CtrlUnit4#getInput__iOverloadAlarm()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Input__iOverloadAlarm();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getInput__iAlarmCounter <em>Input iAlarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAlarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit4#getInput__iAlarmCounter()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Input__iAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getOutput__oAlarmCounter <em>Output oAlarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAlarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit4#getOutput__oAlarmCounter()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Output__oAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getParameter__pAlarmCountLimit <em>Parameter pAlarm Count Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pAlarm Count Limit</em>'.
	 * @see WTSpecID.CtrlUnit4#getParameter__pAlarmCountLimit()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Parameter__pAlarmCountLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getParameter__pTimePeriod <em>Parameter pTime Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTime Period</em>'.
	 * @see WTSpecID.CtrlUnit4#getParameter__pTimePeriod()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Parameter__pTimePeriod();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getFault__fOverload <em>Fault fOverload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fOverload</em>'.
	 * @see WTSpecID.CtrlUnit4#getFault__fOverload()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Fault__fOverload();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit4#getTimer__tSyncDelay <em>Timer tSync Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tSync Delay</em>'.
	 * @see WTSpecID.CtrlUnit4#getTimer__tSyncDelay()
	 * @see #getCtrlUnit4()
	 * @generated
	 */
	EReference getCtrlUnit4_Timer__tSyncDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit5 <em>Ctrl Unit5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit5</em>'.
	 * @see WTSpecID.CtrlUnit5
	 * @generated
	 */
	EClass getCtrlUnit5();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit5#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit5#getInput__iInput1()
	 * @see #getCtrlUnit5()
	 * @generated
	 */
	EReference getCtrlUnit5_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit5#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit5#getInput__iInput2()
	 * @see #getCtrlUnit5()
	 * @generated
	 */
	EReference getCtrlUnit5_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit5#getOutput__oResult <em>Output oResult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oResult</em>'.
	 * @see WTSpecID.CtrlUnit5#getOutput__oResult()
	 * @see #getCtrlUnit5()
	 * @generated
	 */
	EReference getCtrlUnit5_Output__oResult();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit6 <em>Ctrl Unit6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit6</em>'.
	 * @see WTSpecID.CtrlUnit6
	 * @generated
	 */
	EClass getCtrlUnit6();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getInput__iStatus <em>Input iStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStatus</em>'.
	 * @see WTSpecID.CtrlUnit6#getInput__iStatus()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Input__iStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getInput__iOverloadAlarm <em>Input iOverload Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOverload Alarm</em>'.
	 * @see WTSpecID.CtrlUnit6#getInput__iOverloadAlarm()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Input__iOverloadAlarm();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getInput__iAlarmCounter <em>Input iAlarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAlarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit6#getInput__iAlarmCounter()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Input__iAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getOutput__oAlarmCounter <em>Output oAlarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAlarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit6#getOutput__oAlarmCounter()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Output__oAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getParameter__pTimePeriod <em>Parameter pTime Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTime Period</em>'.
	 * @see WTSpecID.CtrlUnit6#getParameter__pTimePeriod()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Parameter__pTimePeriod();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getParameter__pOverloadTimeLimit <em>Parameter pOverload Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pOverload Time Limit</em>'.
	 * @see WTSpecID.CtrlUnit6#getParameter__pOverloadTimeLimit()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Parameter__pOverloadTimeLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getFault__fOverload <em>Fault fOverload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fOverload</em>'.
	 * @see WTSpecID.CtrlUnit6#getFault__fOverload()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Fault__fOverload();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit6#getTimer__tSyncDelay <em>Timer tSync Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tSync Delay</em>'.
	 * @see WTSpecID.CtrlUnit6#getTimer__tSyncDelay()
	 * @see #getCtrlUnit6()
	 * @generated
	 */
	EReference getCtrlUnit6_Timer__tSyncDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit7 <em>Ctrl Unit7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit7</em>'.
	 * @see WTSpecID.CtrlUnit7
	 * @generated
	 */
	EClass getCtrlUnit7();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit7#getInput__iAnalogInput <em>Input iAnalog Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAnalog Input</em>'.
	 * @see WTSpecID.CtrlUnit7#getInput__iAnalogInput()
	 * @see #getCtrlUnit7()
	 * @generated
	 */
	EReference getCtrlUnit7_Input__iAnalogInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit7#getOutput__oAnalogCompensated <em>Output oAnalog Compensated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAnalog Compensated</em>'.
	 * @see WTSpecID.CtrlUnit7#getOutput__oAnalogCompensated()
	 * @see #getCtrlUnit7()
	 * @generated
	 */
	EReference getCtrlUnit7_Output__oAnalogCompensated();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit8 <em>Ctrl Unit8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit8</em>'.
	 * @see WTSpecID.CtrlUnit8
	 * @generated
	 */
	EClass getCtrlUnit8();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit8#getInput__i1 <em>Input i1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input i1</em>'.
	 * @see WTSpecID.CtrlUnit8#getInput__i1()
	 * @see #getCtrlUnit8()
	 * @generated
	 */
	EReference getCtrlUnit8_Input__i1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit8#getOutput__o1 <em>Output o1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output o1</em>'.
	 * @see WTSpecID.CtrlUnit8#getOutput__o1()
	 * @see #getCtrlUnit8()
	 * @generated
	 */
	EReference getCtrlUnit8_Output__o1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit8#getParameter__pDelay <em>Parameter pDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDelay</em>'.
	 * @see WTSpecID.CtrlUnit8#getParameter__pDelay()
	 * @see #getCtrlUnit8()
	 * @generated
	 */
	EReference getCtrlUnit8_Parameter__pDelay();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit8#getBhvParam__bpFilter <em>Bhv Param bp Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Filter</em>'.
	 * @see WTSpecID.CtrlUnit8#getBhvParam__bpFilter()
	 * @see #getCtrlUnit8()
	 * @generated
	 */
	EAttribute getCtrlUnit8_BhvParam__bpFilter();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit9 <em>Ctrl Unit9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit9</em>'.
	 * @see WTSpecID.CtrlUnit9
	 * @generated
	 */
	EClass getCtrlUnit9();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getInput__iValueToCheck <em>Input iValue To Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iValue To Check</em>'.
	 * @see WTSpecID.CtrlUnit9#getInput__iValueToCheck()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iValueToCheck();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit9#getInput__iDontCheckInput()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getInput__iLimitValue <em>Input iLimit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLimit Value</em>'.
	 * @see WTSpecID.CtrlUnit9#getInput__iLimitValue()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iLimitValue();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getInput__iLimitReset <em>Input iLimit Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLimit Reset</em>'.
	 * @see WTSpecID.CtrlUnit9#getInput__iLimitReset()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Input__iLimitReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getOutput__oLimitReached <em>Output oLimit Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oLimit Reached</em>'.
	 * @see WTSpecID.CtrlUnit9#getOutput__oLimitReached()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Output__oLimitReached();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getParameter__pLimitValue <em>Parameter pLimit Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pLimit Value</em>'.
	 * @see WTSpecID.CtrlUnit9#getParameter__pLimitValue()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Parameter__pLimitValue();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getParameter__pLimitReset <em>Parameter pLimit Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pLimit Reset</em>'.
	 * @see WTSpecID.CtrlUnit9#getParameter__pLimitReset()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Parameter__pLimitReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit9#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit9#getTimer__tDelay()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EReference getCtrlUnit9_Timer__tDelay();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit9#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit9#getBhvParam__bpMode()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EAttribute getCtrlUnit9_BhvParam__bpMode();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit9#getBhvParam__bpLimitsType <em>Bhv Param bp Limits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Limits Type</em>'.
	 * @see WTSpecID.CtrlUnit9#getBhvParam__bpLimitsType()
	 * @see #getCtrlUnit9()
	 * @generated
	 */
	EAttribute getCtrlUnit9_BhvParam__bpLimitsType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit10 <em>Ctrl Unit10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit10</em>'.
	 * @see WTSpecID.CtrlUnit10
	 * @generated
	 */
	EClass getCtrlUnit10();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getInput__iAnalogInput <em>Input iAnalog Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAnalog Input</em>'.
	 * @see WTSpecID.CtrlUnit10#getInput__iAnalogInput()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Input__iAnalogInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getOutput__oAnalogScaled <em>Output oAnalog Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAnalog Scaled</em>'.
	 * @see WTSpecID.CtrlUnit10#getOutput__oAnalogScaled()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Output__oAnalogScaled();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getParameter__pFactor <em>Parameter pFactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pFactor</em>'.
	 * @see WTSpecID.CtrlUnit10#getParameter__pFactor()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pFactor();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getParameter__pOffset <em>Parameter pOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pOffset</em>'.
	 * @see WTSpecID.CtrlUnit10#getParameter__pOffset()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pOffset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getParameter__pUpLimit <em>Parameter pUp Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pUp Limit</em>'.
	 * @see WTSpecID.CtrlUnit10#getParameter__pUpLimit()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pUpLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getParameter__pUpValue <em>Parameter pUp Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pUp Value</em>'.
	 * @see WTSpecID.CtrlUnit10#getParameter__pUpValue()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pUpValue();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getParameter__pDownLimit <em>Parameter pDown Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDown Limit</em>'.
	 * @see WTSpecID.CtrlUnit10#getParameter__pDownLimit()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pDownLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit10#getParameter__pDownValue <em>Parameter pDown Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDown Value</em>'.
	 * @see WTSpecID.CtrlUnit10#getParameter__pDownValue()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EReference getCtrlUnit10_Parameter__pDownValue();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit10#getBhvParam__bpOperation <em>Bhv Param bp Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Operation</em>'.
	 * @see WTSpecID.CtrlUnit10#getBhvParam__bpOperation()
	 * @see #getCtrlUnit10()
	 * @generated
	 */
	EAttribute getCtrlUnit10_BhvParam__bpOperation();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit11 <em>Ctrl Unit11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit11</em>'.
	 * @see WTSpecID.CtrlUnit11
	 * @generated
	 */
	EClass getCtrlUnit11();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit11#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit11#getInput__iInput1()
	 * @see #getCtrlUnit11()
	 * @generated
	 */
	EReference getCtrlUnit11_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit11#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit11#getInput__iInput2()
	 * @see #getCtrlUnit11()
	 * @generated
	 */
	EReference getCtrlUnit11_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit11#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit11#getOutput__oOutput()
	 * @see #getCtrlUnit11()
	 * @generated
	 */
	EReference getCtrlUnit11_Output__oOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit12 <em>Ctrl Unit12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit12</em>'.
	 * @see WTSpecID.CtrlUnit12
	 * @generated
	 */
	EClass getCtrlUnit12();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getInput__iPinPosition <em>Input iPin Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPin Position</em>'.
	 * @see WTSpecID.CtrlUnit12#getInput__iPinPosition()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Input__iPinPosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getInput__iInductive <em>Input iInductive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInductive</em>'.
	 * @see WTSpecID.CtrlUnit12#getInput__iInductive()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Input__iInductive();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getInput__iFlInPosition <em>Input iFl In Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFl In Position</em>'.
	 * @see WTSpecID.CtrlUnit12#getInput__iFlInPosition()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Input__iFlInPosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getInput__iLockingOrder <em>Input iLocking Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLocking Order</em>'.
	 * @see WTSpecID.CtrlUnit12#getInput__iLockingOrder()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Input__iLockingOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getInput__iLockingSet <em>Input iLocking Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLocking Set</em>'.
	 * @see WTSpecID.CtrlUnit12#getInput__iLockingSet()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Input__iLockingSet();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getOutput__oPinAutoCmd <em>Output oPin Auto Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPin Auto Cmd</em>'.
	 * @see WTSpecID.CtrlUnit12#getOutput__oPinAutoCmd()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Output__oPinAutoCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getParameter__pPinNoBackPos <em>Parameter pPin No Back Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin No Back Pos</em>'.
	 * @see WTSpecID.CtrlUnit12#getParameter__pPinNoBackPos()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Parameter__pPinNoBackPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getParameter__pPinExtendedPos <em>Parameter pPin Extended Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin Extended Pos</em>'.
	 * @see WTSpecID.CtrlUnit12#getParameter__pPinExtendedPos()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Parameter__pPinExtendedPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getParameter__pPinRetractedPos <em>Parameter pPin Retracted Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin Retracted Pos</em>'.
	 * @see WTSpecID.CtrlUnit12#getParameter__pPinRetractedPos()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Parameter__pPinRetractedPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit12#getParameter__pPinHysteresis <em>Parameter pPin Hysteresis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin Hysteresis</em>'.
	 * @see WTSpecID.CtrlUnit12#getParameter__pPinHysteresis()
	 * @see #getCtrlUnit12()
	 * @generated
	 */
	EReference getCtrlUnit12_Parameter__pPinHysteresis();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit13 <em>Ctrl Unit13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit13</em>'.
	 * @see WTSpecID.CtrlUnit13
	 * @generated
	 */
	EClass getCtrlUnit13();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit13#getInput__iSelect <em>Input iSelect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSelect</em>'.
	 * @see WTSpecID.CtrlUnit13#getInput__iSelect()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Input__iSelect();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit13#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit13#getInput__iInput1()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit13#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit13#getInput__iInput2()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit13#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit13#getOutput__oOutput()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit13#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpecID.CtrlUnit13#getParameter__pParam1()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit13#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpecID.CtrlUnit13#getParameter__pParam2()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EReference getCtrlUnit13_Parameter__pParam2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit13#getBhvParam__bpType <em>Bhv Param bp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Type</em>'.
	 * @see WTSpecID.CtrlUnit13#getBhvParam__bpType()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EAttribute getCtrlUnit13_BhvParam__bpType();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit13#getBhvParam__bpInputType <em>Bhv Param bp Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Input Type</em>'.
	 * @see WTSpecID.CtrlUnit13#getBhvParam__bpInputType()
	 * @see #getCtrlUnit13()
	 * @generated
	 */
	EAttribute getCtrlUnit13_BhvParam__bpInputType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit14 <em>Ctrl Unit14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit14</em>'.
	 * @see WTSpecID.CtrlUnit14
	 * @generated
	 */
	EClass getCtrlUnit14();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit14#getOutput__oBit <em>Output oBit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oBit</em>'.
	 * @see WTSpecID.CtrlUnit14#getOutput__oBit()
	 * @see #getCtrlUnit14()
	 * @generated
	 */
	EReference getCtrlUnit14_Output__oBit();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit15 <em>Ctrl Unit15</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit15</em>'.
	 * @see WTSpecID.CtrlUnit15
	 * @generated
	 */
	EClass getCtrlUnit15();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit15#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit15#getInput__iInput()
	 * @see #getCtrlUnit15()
	 * @generated
	 */
	EReference getCtrlUnit15_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit15#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit15#getOutput__oOutput()
	 * @see #getCtrlUnit15()
	 * @generated
	 */
	EReference getCtrlUnit15_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit15#getParameter__pMask <em>Parameter pMask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMask</em>'.
	 * @see WTSpecID.CtrlUnit15#getParameter__pMask()
	 * @see #getCtrlUnit15()
	 * @generated
	 */
	EReference getCtrlUnit15_Parameter__pMask();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit16 <em>Ctrl Unit16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit16</em>'.
	 * @see WTSpecID.CtrlUnit16
	 * @generated
	 */
	EClass getCtrlUnit16();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit16#getInput__iVarInput <em>Input iVar Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iVar Input</em>'.
	 * @see WTSpecID.CtrlUnit16#getInput__iVarInput()
	 * @see #getCtrlUnit16()
	 * @generated
	 */
	EReference getCtrlUnit16_Input__iVarInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit16#getOutput__oVarOutput <em>Output oVar Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVar Output</em>'.
	 * @see WTSpecID.CtrlUnit16#getOutput__oVarOutput()
	 * @see #getCtrlUnit16()
	 * @generated
	 */
	EReference getCtrlUnit16_Output__oVarOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit17 <em>Ctrl Unit17</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit17</em>'.
	 * @see WTSpecID.CtrlUnit17
	 * @generated
	 */
	EClass getCtrlUnit17();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit17#getParameter__pParam <em>Parameter pParam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam</em>'.
	 * @see WTSpecID.CtrlUnit17#getParameter__pParam()
	 * @see #getCtrlUnit17()
	 * @generated
	 */
	EReference getCtrlUnit17_Parameter__pParam();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit17#getFault__fWarning <em>Fault fWarning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fWarning</em>'.
	 * @see WTSpecID.CtrlUnit17#getFault__fWarning()
	 * @see #getCtrlUnit17()
	 * @generated
	 */
	EReference getCtrlUnit17_Fault__fWarning();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit17#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit17#getFault__fFault()
	 * @see #getCtrlUnit17()
	 * @generated
	 */
	EReference getCtrlUnit17_Fault__fFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit17#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit17#getTimer__tTimer()
	 * @see #getCtrlUnit17()
	 * @generated
	 */
	EReference getCtrlUnit17_Timer__tTimer();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit18 <em>Ctrl Unit18</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit18</em>'.
	 * @see WTSpecID.CtrlUnit18
	 * @generated
	 */
	EClass getCtrlUnit18();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getInput__iOrderCw <em>Input iOrder Cw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder Cw</em>'.
	 * @see WTSpecID.CtrlUnit18#getInput__iOrderCw()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iOrderCw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getInput__iOrderCcw <em>Input iOrder Ccw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder Ccw</em>'.
	 * @see WTSpecID.CtrlUnit18#getInput__iOrderCcw()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iOrderCcw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getInput__iFault <em>Input iFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFault</em>'.
	 * @see WTSpecID.CtrlUnit18#getInput__iFault()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getInput__iCmdDisable <em>Input iCmd Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iCmd Disable</em>'.
	 * @see WTSpecID.CtrlUnit18#getInput__iCmdDisable()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iCmdDisable();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getInput__iCmdReset <em>Input iCmd Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iCmd Reset</em>'.
	 * @see WTSpecID.CtrlUnit18#getInput__iCmdReset()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iCmdReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getInput__iStaReadyToOn <em>Input iSta Ready To On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSta Ready To On</em>'.
	 * @see WTSpecID.CtrlUnit18#getInput__iStaReadyToOn()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Input__iStaReadyToOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getOutput__oControlWord <em>Output oControl Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oControl Word</em>'.
	 * @see WTSpecID.CtrlUnit18#getOutput__oControlWord()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Output__oControlWord();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdDisabled <em>Parameter pCmd Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Disabled</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdDisabled()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdDisabled();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdEnabled <em>Parameter pCmd Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Enabled</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdEnabled()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdEnabled();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdCw <em>Parameter pCmd Cw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Cw</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdCw()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdCw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdCcw <em>Parameter pCmd Ccw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Ccw</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdCcw()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdCcw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdReset <em>Parameter pCmd Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Reset</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdReset()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdSwitchOn <em>Parameter pCmd Switch On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Switch On</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdSwitchOn()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdSwitchOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getParameter__pCmdBraking <em>Parameter pCmd Braking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCmd Braking</em>'.
	 * @see WTSpecID.CtrlUnit18#getParameter__pCmdBraking()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Parameter__pCmdBraking();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit18#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit18#getTimer__tDelay()
	 * @see #getCtrlUnit18()
	 * @generated
	 */
	EReference getCtrlUnit18_Timer__tDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit19 <em>Ctrl Unit19</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit19</em>'.
	 * @see WTSpecID.CtrlUnit19
	 * @generated
	 */
	EClass getCtrlUnit19();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit19#getInput__iPitchTorque <em>Input iPitch Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Torque</em>'.
	 * @see WTSpecID.CtrlUnit19#getInput__iPitchTorque()
	 * @see #getCtrlUnit19()
	 * @generated
	 */
	EReference getCtrlUnit19_Input__iPitchTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit19#getOutput__oPitchRms <em>Output oPitch Rms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Rms</em>'.
	 * @see WTSpecID.CtrlUnit19#getOutput__oPitchRms()
	 * @see #getCtrlUnit19()
	 * @generated
	 */
	EReference getCtrlUnit19_Output__oPitchRms();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit19#getParameter__pDivisor <em>Parameter pDivisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDivisor</em>'.
	 * @see WTSpecID.CtrlUnit19#getParameter__pDivisor()
	 * @see #getCtrlUnit19()
	 * @generated
	 */
	EReference getCtrlUnit19_Parameter__pDivisor();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit20 <em>Ctrl Unit20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit20</em>'.
	 * @see WTSpecID.CtrlUnit20
	 * @generated
	 */
	EClass getCtrlUnit20();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getInput__iMasterOrder <em>Input iMaster Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaster Order</em>'.
	 * @see WTSpecID.CtrlUnit20#getInput__iMasterOrder()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Input__iMasterOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getInput__iInverterOrder <em>Input iInverter Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Order</em>'.
	 * @see WTSpecID.CtrlUnit20#getInput__iInverterOrder()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Input__iInverterOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getInput__iChangeOrder <em>Input iChange Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iChange Order</em>'.
	 * @see WTSpecID.CtrlUnit20#getInput__iChangeOrder()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Input__iChangeOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getInput__iManualStop <em>Input iManual Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual Stop</em>'.
	 * @see WTSpecID.CtrlUnit20#getInput__iManualStop()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Input__iManualStop();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getOutput__oMasterSelected <em>Output oMaster Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMaster Selected</em>'.
	 * @see WTSpecID.CtrlUnit20#getOutput__oMasterSelected()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Output__oMasterSelected();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getOutput__oInverterEnabled <em>Output oInverter Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Enabled</em>'.
	 * @see WTSpecID.CtrlUnit20#getOutput__oInverterEnabled()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Output__oInverterEnabled();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit20#getOutput__oForceInvOff <em>Output oForce Inv Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oForce Inv Off</em>'.
	 * @see WTSpecID.CtrlUnit20#getOutput__oForceInvOff()
	 * @see #getCtrlUnit20()
	 * @generated
	 */
	EReference getCtrlUnit20_Output__oForceInvOff();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit21 <em>Ctrl Unit21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit21</em>'.
	 * @see WTSpecID.CtrlUnit21
	 * @generated
	 */
	EClass getCtrlUnit21();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit21#getInput__iWindDirection <em>Input iWind Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Direction</em>'.
	 * @see WTSpecID.CtrlUnit21#getInput__iWindDirection()
	 * @see #getCtrlUnit21()
	 * @generated
	 */
	EReference getCtrlUnit21_Input__iWindDirection();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit21#getInput__iFlagBrakes <em>Input iFlag Brakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFlag Brakes</em>'.
	 * @see WTSpecID.CtrlUnit21#getInput__iFlagBrakes()
	 * @see #getCtrlUnit21()
	 * @generated
	 */
	EReference getCtrlUnit21_Input__iFlagBrakes();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit21#getInput__iFlagIntoWind <em>Input iFlag Into Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFlag Into Wind</em>'.
	 * @see WTSpecID.CtrlUnit21#getInput__iFlagIntoWind()
	 * @see #getCtrlUnit21()
	 * @generated
	 */
	EReference getCtrlUnit21_Input__iFlagIntoWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit21#getOutput__oBackWindDetected <em>Output oBack Wind Detected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oBack Wind Detected</em>'.
	 * @see WTSpecID.CtrlUnit21#getOutput__oBackWindDetected()
	 * @see #getCtrlUnit21()
	 * @generated
	 */
	EReference getCtrlUnit21_Output__oBackWindDetected();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit21#getParameter__pMaxAbsoluteAngle <em>Parameter pMax Absolute Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Absolute Angle</em>'.
	 * @see WTSpecID.CtrlUnit21#getParameter__pMaxAbsoluteAngle()
	 * @see #getCtrlUnit21()
	 * @generated
	 */
	EReference getCtrlUnit21_Parameter__pMaxAbsoluteAngle();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit22 <em>Ctrl Unit22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit22</em>'.
	 * @see WTSpecID.CtrlUnit22
	 * @generated
	 */
	EClass getCtrlUnit22();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getInput__iYawStatus <em>Input iYaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Status</em>'.
	 * @see WTSpecID.CtrlUnit22#getInput__iYawStatus()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Input__iYawStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit22#getInput__iTwistAngle()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getInput__iMaxTwistCW <em>Input iMax Twist CW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMax Twist CW</em>'.
	 * @see WTSpecID.CtrlUnit22#getInput__iMaxTwistCW()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Input__iMaxTwistCW();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getInput__iMaxTwistCCW <em>Input iMax Twist CCW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMax Twist CCW</em>'.
	 * @see WTSpecID.CtrlUnit22#getInput__iMaxTwistCCW()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Input__iMaxTwistCCW();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getOutput__oMaxTwistPreCommand <em>Output oMax Twist Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMax Twist Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit22#getOutput__oMaxTwistPreCommand()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Output__oMaxTwistPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getParameter__pMaxTwistHysteresis <em>Parameter pMax Twist Hysteresis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Twist Hysteresis</em>'.
	 * @see WTSpecID.CtrlUnit22#getParameter__pMaxTwistHysteresis()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Parameter__pMaxTwistHysteresis();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getFault__fTwistExcessiveCW <em>Fault fTwist Excessive CW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fTwist Excessive CW</em>'.
	 * @see WTSpecID.CtrlUnit22#getFault__fTwistExcessiveCW()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Fault__fTwistExcessiveCW();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit22#getFault__fTwistExcessiveCCW <em>Fault fTwist Excessive CCW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fTwist Excessive CCW</em>'.
	 * @see WTSpecID.CtrlUnit22#getFault__fTwistExcessiveCCW()
	 * @see #getCtrlUnit22()
	 * @generated
	 */
	EReference getCtrlUnit22_Fault__fTwistExcessiveCCW();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit23 <em>Ctrl Unit23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit23</em>'.
	 * @see WTSpecID.CtrlUnit23
	 * @generated
	 */
	EClass getCtrlUnit23();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getInput__iWindSpeed <em>Input iWind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Speed</em>'.
	 * @see WTSpecID.CtrlUnit23#getInput__iWindSpeed()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Input__iWindSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getInput__iInverterPower <em>Input iInverter Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Power</em>'.
	 * @see WTSpecID.CtrlUnit23#getInput__iInverterPower()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Input__iInverterPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getOutput__oRelationError <em>Output oRelation Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oRelation Error</em>'.
	 * @see WTSpecID.CtrlUnit23#getOutput__oRelationError()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Output__oRelationError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getParameter__pWindSpeedLimit <em>Parameter pWind Speed Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pWind Speed Limit</em>'.
	 * @see WTSpecID.CtrlUnit23#getParameter__pWindSpeedLimit()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Parameter__pWindSpeedLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getParameter__pInverterPowerLimit <em>Parameter pInverter Power Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pInverter Power Limit</em>'.
	 * @see WTSpecID.CtrlUnit23#getParameter__pInverterPowerLimit()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Parameter__pInverterPowerLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getTimer__tWindMinimumTime <em>Timer tWind Minimum Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tWind Minimum Time</em>'.
	 * @see WTSpecID.CtrlUnit23#getTimer__tWindMinimumTime()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Timer__tWindMinimumTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit23#getTimer__tPowerAndWindMinimumTime <em>Timer tPower And Wind Minimum Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tPower And Wind Minimum Time</em>'.
	 * @see WTSpecID.CtrlUnit23#getTimer__tPowerAndWindMinimumTime()
	 * @see #getCtrlUnit23()
	 * @generated
	 */
	EReference getCtrlUnit23_Timer__tPowerAndWindMinimumTime();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit24 <em>Ctrl Unit24</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit24</em>'.
	 * @see WTSpecID.CtrlUnit24
	 * @generated
	 */
	EClass getCtrlUnit24();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit24#getInput__iInverterReady <em>Input iInverter Ready</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Ready</em>'.
	 * @see WTSpecID.CtrlUnit24#getInput__iInverterReady()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EReference getCtrlUnit24_Input__iInverterReady();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit24#getInput__iInverterPower <em>Input iInverter Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Power</em>'.
	 * @see WTSpecID.CtrlUnit24#getInput__iInverterPower()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EReference getCtrlUnit24_Input__iInverterPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit24#getInput__iAlgorithmCommand <em>Input iAlgorithm Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAlgorithm Command</em>'.
	 * @see WTSpecID.CtrlUnit24#getInput__iAlgorithmCommand()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EReference getCtrlUnit24_Input__iAlgorithmCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit24#getParameter__pPowerLimit <em>Parameter pPower Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPower Limit</em>'.
	 * @see WTSpecID.CtrlUnit24#getParameter__pPowerLimit()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EReference getCtrlUnit24_Parameter__pPowerLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit24#getFault__fYawProblem <em>Fault fYaw Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fYaw Problem</em>'.
	 * @see WTSpecID.CtrlUnit24#getFault__fYawProblem()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EReference getCtrlUnit24_Fault__fYawProblem();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit24#getTimer__tDelayProblemNotify <em>Timer tDelay Problem Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay Problem Notify</em>'.
	 * @see WTSpecID.CtrlUnit24#getTimer__tDelayProblemNotify()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EReference getCtrlUnit24_Timer__tDelayProblemNotify();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit24#getDecisionSequence__dsDecisionTree <em>Decision Sequence ds Decision Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Sequence ds Decision Tree</em>'.
	 * @see WTSpecID.CtrlUnit24#getDecisionSequence__dsDecisionTree()
	 * @see #getCtrlUnit24()
	 * @generated
	 */
	EAttribute getCtrlUnit24_DecisionSequence__dsDecisionTree();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit25 <em>Ctrl Unit25</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit25</em>'.
	 * @see WTSpecID.CtrlUnit25
	 * @generated
	 */
	EClass getCtrlUnit25();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getInput__iStatus <em>Input iStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStatus</em>'.
	 * @see WTSpecID.CtrlUnit25#getInput__iStatus()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Input__iStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getInput__iOverloadAlarm <em>Input iOverload Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOverload Alarm</em>'.
	 * @see WTSpecID.CtrlUnit25#getInput__iOverloadAlarm()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Input__iOverloadAlarm();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getInput__iAlarmCounter <em>Input iAlarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAlarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit25#getInput__iAlarmCounter()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Input__iAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getOutput__oAlarmCounter <em>Output oAlarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAlarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit25#getOutput__oAlarmCounter()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Output__oAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getFault__fOverload <em>Fault fOverload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fOverload</em>'.
	 * @see WTSpecID.CtrlUnit25#getFault__fOverload()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Fault__fOverload();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit25#getTimer__tTimer()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Timer__tTimer();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit25#getTimer__tSyncDelay <em>Timer tSync Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tSync Delay</em>'.
	 * @see WTSpecID.CtrlUnit25#getTimer__tSyncDelay()
	 * @see #getCtrlUnit25()
	 * @generated
	 */
	EReference getCtrlUnit25_Timer__tSyncDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit26 <em>Ctrl Unit26</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit26</em>'.
	 * @see WTSpecID.CtrlUnit26
	 * @generated
	 */
	EClass getCtrlUnit26();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit26#getInput__iCounter <em>Input iCounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iCounter</em>'.
	 * @see WTSpecID.CtrlUnit26#getInput__iCounter()
	 * @see #getCtrlUnit26()
	 * @generated
	 */
	EReference getCtrlUnit26_Input__iCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit26#getInput__iActivator <em>Input iActivator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iActivator</em>'.
	 * @see WTSpecID.CtrlUnit26#getInput__iActivator()
	 * @see #getCtrlUnit26()
	 * @generated
	 */
	EReference getCtrlUnit26_Input__iActivator();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit26#getOutput__oCounter <em>Output oCounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oCounter</em>'.
	 * @see WTSpecID.CtrlUnit26#getOutput__oCounter()
	 * @see #getCtrlUnit26()
	 * @generated
	 */
	EReference getCtrlUnit26_Output__oCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit26#getOutput__oLimitReached <em>Output oLimit Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oLimit Reached</em>'.
	 * @see WTSpecID.CtrlUnit26#getOutput__oLimitReached()
	 * @see #getCtrlUnit26()
	 * @generated
	 */
	EReference getCtrlUnit26_Output__oLimitReached();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit26#getParameter__pLimit <em>Parameter pLimit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pLimit</em>'.
	 * @see WTSpecID.CtrlUnit26#getParameter__pLimit()
	 * @see #getCtrlUnit26()
	 * @generated
	 */
	EReference getCtrlUnit26_Parameter__pLimit();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit27 <em>Ctrl Unit27</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit27</em>'.
	 * @see WTSpecID.CtrlUnit27
	 * @generated
	 */
	EClass getCtrlUnit27();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit27#getInput__iOrder <em>Input iOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder</em>'.
	 * @see WTSpecID.CtrlUnit27#getInput__iOrder()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Input__iOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit27#getInput__iFailure <em>Input iFailure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFailure</em>'.
	 * @see WTSpecID.CtrlUnit27#getInput__iFailure()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Input__iFailure();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit27#getOutput__oOrder <em>Output oOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOrder</em>'.
	 * @see WTSpecID.CtrlUnit27#getOutput__oOrder()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Output__oOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit27#getOutput__oCounter <em>Output oCounter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oCounter</em>'.
	 * @see WTSpecID.CtrlUnit27#getOutput__oCounter()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Output__oCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit27#getParameter__pMaxCount <em>Parameter pMax Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Count</em>'.
	 * @see WTSpecID.CtrlUnit27#getParameter__pMaxCount()
	 * @see #getCtrlUnit27()
	 * @generated
	 */
	EReference getCtrlUnit27_Parameter__pMaxCount();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit28 <em>Ctrl Unit28</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit28</em>'.
	 * @see WTSpecID.CtrlUnit28
	 * @generated
	 */
	EClass getCtrlUnit28();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit28#getInput__iDigitalInput <em>Input iDigital Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDigital Input</em>'.
	 * @see WTSpecID.CtrlUnit28#getInput__iDigitalInput()
	 * @see #getCtrlUnit28()
	 * @generated
	 */
	EReference getCtrlUnit28_Input__iDigitalInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit28#getOutput__oAlarmHasBeenReset <em>Output oAlarm Has Been Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAlarm Has Been Reset</em>'.
	 * @see WTSpecID.CtrlUnit28#getOutput__oAlarmHasBeenReset()
	 * @see #getCtrlUnit28()
	 * @generated
	 */
	EReference getCtrlUnit28_Output__oAlarmHasBeenReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit28#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit28#getFault__fFault()
	 * @see #getCtrlUnit28()
	 * @generated
	 */
	EReference getCtrlUnit28_Fault__fFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit29 <em>Ctrl Unit29</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit29</em>'.
	 * @see WTSpecID.CtrlUnit29
	 * @generated
	 */
	EClass getCtrlUnit29();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit29#getInput__iDigitalInput <em>Input iDigital Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDigital Input</em>'.
	 * @see WTSpecID.CtrlUnit29#getInput__iDigitalInput()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EReference getCtrlUnit29_Input__iDigitalInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit29#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit29#getInput__iDontCheckInput()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EReference getCtrlUnit29_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit29#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit29#getFault__fFault()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EReference getCtrlUnit29_Fault__fFault();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit29#getBhvParam__bpResetMode <em>Bhv Param bp Reset Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Reset Mode</em>'.
	 * @see WTSpecID.CtrlUnit29#getBhvParam__bpResetMode()
	 * @see #getCtrlUnit29()
	 * @generated
	 */
	EAttribute getCtrlUnit29_BhvParam__bpResetMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit30 <em>Ctrl Unit30</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit30</em>'.
	 * @see WTSpecID.CtrlUnit30
	 * @generated
	 */
	EClass getCtrlUnit30();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit30#getInput__iDigitalInput <em>Input iDigital Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDigital Input</em>'.
	 * @see WTSpecID.CtrlUnit30#getInput__iDigitalInput()
	 * @see #getCtrlUnit30()
	 * @generated
	 */
	EReference getCtrlUnit30_Input__iDigitalInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit30#getInput__iOffOrder <em>Input iOff Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOff Order</em>'.
	 * @see WTSpecID.CtrlUnit30#getInput__iOffOrder()
	 * @see #getCtrlUnit30()
	 * @generated
	 */
	EReference getCtrlUnit30_Input__iOffOrder();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit31 <em>Ctrl Unit31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit31</em>'.
	 * @see WTSpecID.CtrlUnit31
	 * @generated
	 */
	EClass getCtrlUnit31();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit31#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit31#getInput__iInput()
	 * @see #getCtrlUnit31()
	 * @generated
	 */
	EReference getCtrlUnit31_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit31#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit31#getOutput__oOutput()
	 * @see #getCtrlUnit31()
	 * @generated
	 */
	EReference getCtrlUnit31_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit31#getParameter__pMask <em>Parameter pMask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMask</em>'.
	 * @see WTSpecID.CtrlUnit31#getParameter__pMask()
	 * @see #getCtrlUnit31()
	 * @generated
	 */
	EReference getCtrlUnit31_Parameter__pMask();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit32 <em>Ctrl Unit32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit32</em>'.
	 * @see WTSpecID.CtrlUnit32
	 * @generated
	 */
	EClass getCtrlUnit32();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit32#getOutput__oChangeCmd <em>Output oChange Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oChange Cmd</em>'.
	 * @see WTSpecID.CtrlUnit32#getOutput__oChangeCmd()
	 * @see #getCtrlUnit32()
	 * @generated
	 */
	EReference getCtrlUnit32_Output__oChangeCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit32#getOutput__oPersistentHour <em>Output oPersistent Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPersistent Hour</em>'.
	 * @see WTSpecID.CtrlUnit32#getOutput__oPersistentHour()
	 * @see #getCtrlUnit32()
	 * @generated
	 */
	EReference getCtrlUnit32_Output__oPersistentHour();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit32#getParameter__pDayChangeHour <em>Parameter pDay Change Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDay Change Hour</em>'.
	 * @see WTSpecID.CtrlUnit32#getParameter__pDayChangeHour()
	 * @see #getCtrlUnit32()
	 * @generated
	 */
	EReference getCtrlUnit32_Parameter__pDayChangeHour();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit33 <em>Ctrl Unit33</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit33</em>'.
	 * @see WTSpecID.CtrlUnit33
	 * @generated
	 */
	EClass getCtrlUnit33();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit33#getInput__iResetOutput <em>Input iReset Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Output</em>'.
	 * @see WTSpecID.CtrlUnit33#getInput__iResetOutput()
	 * @see #getCtrlUnit33()
	 * @generated
	 */
	EReference getCtrlUnit33_Input__iResetOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit33#getOutput__oIsLastError <em>Output oIs Last Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oIs Last Error</em>'.
	 * @see WTSpecID.CtrlUnit33#getOutput__oIsLastError()
	 * @see #getCtrlUnit33()
	 * @generated
	 */
	EReference getCtrlUnit33_Output__oIsLastError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit33#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit33#getFault__fFault()
	 * @see #getCtrlUnit33()
	 * @generated
	 */
	EReference getCtrlUnit33_Fault__fFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit34 <em>Ctrl Unit34</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit34</em>'.
	 * @see WTSpecID.CtrlUnit34
	 * @generated
	 */
	EClass getCtrlUnit34();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit34#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit34#getInput__iInput()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit34#getInput__iFeedback <em>Input iFeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFeedback</em>'.
	 * @see WTSpecID.CtrlUnit34#getInput__iFeedback()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Input__iFeedback();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit34#getOutput__oFaultOn <em>Output oFault On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFault On</em>'.
	 * @see WTSpecID.CtrlUnit34#getOutput__oFaultOn()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Output__oFaultOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit34#getOutput__oFaultOff <em>Output oFault Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFault Off</em>'.
	 * @see WTSpecID.CtrlUnit34#getOutput__oFaultOff()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Output__oFaultOff();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit34#getTimer__tDelayOn <em>Timer tDelay On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay On</em>'.
	 * @see WTSpecID.CtrlUnit34#getTimer__tDelayOn()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Timer__tDelayOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit34#getTimer__tDelayOff <em>Timer tDelay Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay Off</em>'.
	 * @see WTSpecID.CtrlUnit34#getTimer__tDelayOff()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EReference getCtrlUnit34_Timer__tDelayOff();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit34#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit34#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit34()
	 * @generated
	 */
	EAttribute getCtrlUnit34_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit35 <em>Ctrl Unit35</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit35</em>'.
	 * @see WTSpecID.CtrlUnit35
	 * @generated
	 */
	EClass getCtrlUnit35();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit35#getInput__iFeedback <em>Input iFeedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFeedback</em>'.
	 * @see WTSpecID.CtrlUnit35#getInput__iFeedback()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EReference getCtrlUnit35_Input__iFeedback();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit35#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit35#getOutput__oOutput()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EReference getCtrlUnit35_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit35#getFault__fFaultOn <em>Fault fFault On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault On</em>'.
	 * @see WTSpecID.CtrlUnit35#getFault__fFaultOn()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EReference getCtrlUnit35_Fault__fFaultOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit35#getFault__fFaultOff <em>Fault fFault Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault Off</em>'.
	 * @see WTSpecID.CtrlUnit35#getFault__fFaultOff()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EReference getCtrlUnit35_Fault__fFaultOff();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit35#getTimer__tDelayOn <em>Timer tDelay On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay On</em>'.
	 * @see WTSpecID.CtrlUnit35#getTimer__tDelayOn()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EReference getCtrlUnit35_Timer__tDelayOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit35#getTimer__tDelayOff <em>Timer tDelay Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay Off</em>'.
	 * @see WTSpecID.CtrlUnit35#getTimer__tDelayOff()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EReference getCtrlUnit35_Timer__tDelayOff();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit35#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit35#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit35()
	 * @generated
	 */
	EAttribute getCtrlUnit35_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit36 <em>Ctrl Unit36</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit36</em>'.
	 * @see WTSpecID.CtrlUnit36
	 * @generated
	 */
	EClass getCtrlUnit36();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit36#getInput__i1 <em>Input i1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input i1</em>'.
	 * @see WTSpecID.CtrlUnit36#getInput__i1()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Input__i1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit36#getOutput__o1 <em>Output o1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output o1</em>'.
	 * @see WTSpecID.CtrlUnit36#getOutput__o1()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Output__o1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit36#getParameter__pDelayOn <em>Parameter pDelay On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDelay On</em>'.
	 * @see WTSpecID.CtrlUnit36#getParameter__pDelayOn()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Parameter__pDelayOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit36#getParameter__pDelayOff <em>Parameter pDelay Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDelay Off</em>'.
	 * @see WTSpecID.CtrlUnit36#getParameter__pDelayOff()
	 * @see #getCtrlUnit36()
	 * @generated
	 */
	EReference getCtrlUnit36_Parameter__pDelayOff();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit37 <em>Ctrl Unit37</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit37</em>'.
	 * @see WTSpecID.CtrlUnit37
	 * @generated
	 */
	EClass getCtrlUnit37();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit37#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit37#getInput__iInput()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit37#getInput__iBadInputQuality <em>Input iBad Input Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iBad Input Quality</em>'.
	 * @see WTSpecID.CtrlUnit37#getInput__iBadInputQuality()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Input__iBadInputQuality();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit37#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit37#getInput__iDontCheckInput()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit37#getOutput__oSendReset <em>Output oSend Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSend Reset</em>'.
	 * @see WTSpecID.CtrlUnit37#getOutput__oSendReset()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Output__oSendReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit37#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit37#getFault__fFault()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Fault__fFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit37#getTimer__tCheckInputDelay <em>Timer tCheck Input Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tCheck Input Delay</em>'.
	 * @see WTSpecID.CtrlUnit37#getTimer__tCheckInputDelay()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EReference getCtrlUnit37_Timer__tCheckInputDelay();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit37#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit37#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit37()
	 * @generated
	 */
	EAttribute getCtrlUnit37_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit38 <em>Ctrl Unit38</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit38</em>'.
	 * @see WTSpecID.CtrlUnit38
	 * @generated
	 */
	EClass getCtrlUnit38();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit38#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit38#getInput__iInput()
	 * @see #getCtrlUnit38()
	 * @generated
	 */
	EReference getCtrlUnit38_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit38#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit38#getInput__iDontCheckInput()
	 * @see #getCtrlUnit38()
	 * @generated
	 */
	EReference getCtrlUnit38_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit38#getParameter__pDelay <em>Parameter pDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDelay</em>'.
	 * @see WTSpecID.CtrlUnit38#getParameter__pDelay()
	 * @see #getCtrlUnit38()
	 * @generated
	 */
	EReference getCtrlUnit38_Parameter__pDelay();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit38#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit38#getFault__fFault()
	 * @see #getCtrlUnit38()
	 * @generated
	 */
	EReference getCtrlUnit38_Fault__fFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit38#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit38#getTimer__tDelay()
	 * @see #getCtrlUnit38()
	 * @generated
	 */
	EReference getCtrlUnit38_Timer__tDelay();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit38#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit38#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit38()
	 * @generated
	 */
	EAttribute getCtrlUnit38_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit39 <em>Ctrl Unit39</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit39</em>'.
	 * @see WTSpecID.CtrlUnit39
	 * @generated
	 */
	EClass getCtrlUnit39();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit39#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit39#getInput__iInput()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit39#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit39#getInput__iDontCheckInput()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit39#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit39#getFault__fFault()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Fault__fFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit39#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit39#getTimer__tDelay()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EReference getCtrlUnit39_Timer__tDelay();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit39#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit39#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit39()
	 * @generated
	 */
	EAttribute getCtrlUnit39_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit40 <em>Ctrl Unit40</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit40</em>'.
	 * @see WTSpecID.CtrlUnit40
	 * @generated
	 */
	EClass getCtrlUnit40();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit40#getInput__iOrder <em>Input iOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder</em>'.
	 * @see WTSpecID.CtrlUnit40#getInput__iOrder()
	 * @see #getCtrlUnit40()
	 * @generated
	 */
	EReference getCtrlUnit40_Input__iOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit40#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit40#getOutput__oOutput()
	 * @see #getCtrlUnit40()
	 * @generated
	 */
	EReference getCtrlUnit40_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit40#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit40#getTimer__tTimer()
	 * @see #getCtrlUnit40()
	 * @generated
	 */
	EReference getCtrlUnit40_Timer__tTimer();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit41 <em>Ctrl Unit41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit41</em>'.
	 * @see WTSpecID.CtrlUnit41
	 * @generated
	 */
	EClass getCtrlUnit41();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit41#getInput__iInput1()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit41#getInput__iInput2()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpecID.CtrlUnit41#getInput__iInput3()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit41#getOutput__oOutput()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpecID.CtrlUnit41#getParameter__pParam1()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpecID.CtrlUnit41#getParameter__pParam2()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getParameter__pParam3 <em>Parameter pParam3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam3</em>'.
	 * @see WTSpecID.CtrlUnit41#getParameter__pParam3()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Parameter__pParam3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpecID.CtrlUnit41#getFault__fFault1()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Fault__fFault1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getFault__fFault2 <em>Fault fFault2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault2</em>'.
	 * @see WTSpecID.CtrlUnit41#getFault__fFault2()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Fault__fFault2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getFault__fFault3 <em>Fault fFault3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault3</em>'.
	 * @see WTSpecID.CtrlUnit41#getFault__fFault3()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_Fault__fFault3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getErrorReaction__eReaction1 <em>Error Reaction eReaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction eReaction1</em>'.
	 * @see WTSpecID.CtrlUnit41#getErrorReaction__eReaction1()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_ErrorReaction__eReaction1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit41#getErrorReaction__eReaction2 <em>Error Reaction eReaction2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction eReaction2</em>'.
	 * @see WTSpecID.CtrlUnit41#getErrorReaction__eReaction2()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EReference getCtrlUnit41_ErrorReaction__eReaction2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit41#getGuard__gGuardToMain <em>Guard gGuard To Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard To Main</em>'.
	 * @see WTSpecID.CtrlUnit41#getGuard__gGuardToMain()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EAttribute getCtrlUnit41_Guard__gGuardToMain();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit41#getGuard__gGuardFromMain <em>Guard gGuard From Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard From Main</em>'.
	 * @see WTSpecID.CtrlUnit41#getGuard__gGuardFromMain()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EAttribute getCtrlUnit41_Guard__gGuardFromMain();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit41#getGuard__gGuardToOn <em>Guard gGuard To On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard To On</em>'.
	 * @see WTSpecID.CtrlUnit41#getGuard__gGuardToOn()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EAttribute getCtrlUnit41_Guard__gGuardToOn();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit41#getGuard__gGuardToOff <em>Guard gGuard To Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard To Off</em>'.
	 * @see WTSpecID.CtrlUnit41#getGuard__gGuardToOff()
	 * @see #getCtrlUnit41()
	 * @generated
	 */
	EAttribute getCtrlUnit41_Guard__gGuardToOff();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit42 <em>Ctrl Unit42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit42</em>'.
	 * @see WTSpecID.CtrlUnit42
	 * @generated
	 */
	EClass getCtrlUnit42();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit42#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit42#getInput__iInput()
	 * @see #getCtrlUnit42()
	 * @generated
	 */
	EReference getCtrlUnit42_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit42#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit42#getInput__iDontCheckInput()
	 * @see #getCtrlUnit42()
	 * @generated
	 */
	EReference getCtrlUnit42_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit42#getOutput__oActive <em>Output oActive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oActive</em>'.
	 * @see WTSpecID.CtrlUnit42#getOutput__oActive()
	 * @see #getCtrlUnit42()
	 * @generated
	 */
	EReference getCtrlUnit42_Output__oActive();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit42#getOutput__oPulsing <em>Output oPulsing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPulsing</em>'.
	 * @see WTSpecID.CtrlUnit42#getOutput__oPulsing()
	 * @see #getCtrlUnit42()
	 * @generated
	 */
	EReference getCtrlUnit42_Output__oPulsing();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit42#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit42#getTimer__tDelay()
	 * @see #getCtrlUnit42()
	 * @generated
	 */
	EReference getCtrlUnit42_Timer__tDelay();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit42#getTimer__tActive <em>Timer tActive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tActive</em>'.
	 * @see WTSpecID.CtrlUnit42#getTimer__tActive()
	 * @see #getCtrlUnit42()
	 * @generated
	 */
	EReference getCtrlUnit42_Timer__tActive();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit43 <em>Ctrl Unit43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit43</em>'.
	 * @see WTSpecID.CtrlUnit43
	 * @generated
	 */
	EClass getCtrlUnit43();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit43#getInput__iInput1()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit43#getInput__iInput2()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit43#getInput__iDontCheckInput()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit43#getOutput__oOutput()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getOutput__oOutDiv <em>Output oOut Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOut Div</em>'.
	 * @see WTSpecID.CtrlUnit43#getOutput__oOutDiv()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Output__oOutDiv();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getOutput__oOutMod <em>Output oOut Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOut Mod</em>'.
	 * @see WTSpecID.CtrlUnit43#getOutput__oOutMod()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Output__oOutMod();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getParameter__pDiv <em>Parameter pDiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDiv</em>'.
	 * @see WTSpecID.CtrlUnit43#getParameter__pDiv()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Parameter__pDiv();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpecID.CtrlUnit43#getParameter__pParam1()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit43#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpecID.CtrlUnit43#getParameter__pParam2()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EReference getCtrlUnit43_Parameter__pParam2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit43#getBhvParam__bpType <em>Bhv Param bp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Type</em>'.
	 * @see WTSpecID.CtrlUnit43#getBhvParam__bpType()
	 * @see #getCtrlUnit43()
	 * @generated
	 */
	EAttribute getCtrlUnit43_BhvParam__bpType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit44 <em>Ctrl Unit44</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit44</em>'.
	 * @see WTSpecID.CtrlUnit44
	 * @generated
	 */
	EClass getCtrlUnit44();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit44#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit44#getInput__iInput()
	 * @see #getCtrlUnit44()
	 * @generated
	 */
	EReference getCtrlUnit44_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit44#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit44#getOutput__oOutput()
	 * @see #getCtrlUnit44()
	 * @generated
	 */
	EReference getCtrlUnit44_Output__oOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit45 <em>Ctrl Unit45</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit45</em>'.
	 * @see WTSpecID.CtrlUnit45
	 * @generated
	 */
	EClass getCtrlUnit45();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit45#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit45#getInput__iInput()
	 * @see #getCtrlUnit45()
	 * @generated
	 */
	EReference getCtrlUnit45_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit45#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit45#getOutput__oOutput()
	 * @see #getCtrlUnit45()
	 * @generated
	 */
	EReference getCtrlUnit45_Output__oOutput();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit45#getBhvParam__bpType <em>Bhv Param bp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Type</em>'.
	 * @see WTSpecID.CtrlUnit45#getBhvParam__bpType()
	 * @see #getCtrlUnit45()
	 * @generated
	 */
	EAttribute getCtrlUnit45_BhvParam__bpType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit46 <em>Ctrl Unit46</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit46</em>'.
	 * @see WTSpecID.CtrlUnit46
	 * @generated
	 */
	EClass getCtrlUnit46();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit46#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit46#getOutput__oOutput()
	 * @see #getCtrlUnit46()
	 * @generated
	 */
	EReference getCtrlUnit46_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit46#getErrorReaction__erErrorReaction <em>Error Reaction er Error Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Error Reaction</em>'.
	 * @see WTSpecID.CtrlUnit46#getErrorReaction__erErrorReaction()
	 * @see #getCtrlUnit46()
	 * @generated
	 */
	EReference getCtrlUnit46_ErrorReaction__erErrorReaction();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit47 <em>Ctrl Unit47</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit47</em>'.
	 * @see WTSpecID.CtrlUnit47
	 * @generated
	 */
	EClass getCtrlUnit47();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit47#getInput__iResetOrder <em>Input iReset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Order</em>'.
	 * @see WTSpecID.CtrlUnit47#getInput__iResetOrder()
	 * @see #getCtrlUnit47()
	 * @generated
	 */
	EReference getCtrlUnit47_Input__iResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit47#getFault__fResetFault <em>Fault fReset Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fReset Fault</em>'.
	 * @see WTSpecID.CtrlUnit47#getFault__fResetFault()
	 * @see #getCtrlUnit47()
	 * @generated
	 */
	EReference getCtrlUnit47_Fault__fResetFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit48 <em>Ctrl Unit48</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit48</em>'.
	 * @see WTSpecID.CtrlUnit48
	 * @generated
	 */
	EClass getCtrlUnit48();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getInput__iTemp1 <em>Input iTemp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTemp1</em>'.
	 * @see WTSpecID.CtrlUnit48#getInput__iTemp1()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Input__iTemp1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getInput__iTemp2 <em>Input iTemp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTemp2</em>'.
	 * @see WTSpecID.CtrlUnit48#getInput__iTemp2()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Input__iTemp2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getInput__iTemp3 <em>Input iTemp3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTemp3</em>'.
	 * @see WTSpecID.CtrlUnit48#getInput__iTemp3()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Input__iTemp3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getOutput__oFan <em>Output oFan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFan</em>'.
	 * @see WTSpecID.CtrlUnit48#getOutput__oFan()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Output__oFan();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getParameter__pTempLimit1 <em>Parameter pTemp Limit1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTemp Limit1</em>'.
	 * @see WTSpecID.CtrlUnit48#getParameter__pTempLimit1()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Parameter__pTempLimit1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getParameter__pTempLimit2 <em>Parameter pTemp Limit2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTemp Limit2</em>'.
	 * @see WTSpecID.CtrlUnit48#getParameter__pTempLimit2()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Parameter__pTempLimit2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getParameter__pTempLimit3 <em>Parameter pTemp Limit3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTemp Limit3</em>'.
	 * @see WTSpecID.CtrlUnit48#getParameter__pTempLimit3()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Parameter__pTempLimit3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpecID.CtrlUnit48#getFault__fFault1()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_Fault__fFault1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getErrorReaction__erReaction1 <em>Error Reaction er Reaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Reaction1</em>'.
	 * @see WTSpecID.CtrlUnit48#getErrorReaction__erReaction1()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_ErrorReaction__erReaction1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit48#getErrorReaction__erReaction2 <em>Error Reaction er Reaction2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Reaction2</em>'.
	 * @see WTSpecID.CtrlUnit48#getErrorReaction__erReaction2()
	 * @see #getCtrlUnit48()
	 * @generated
	 */
	EReference getCtrlUnit48_ErrorReaction__erReaction2();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit49 <em>Ctrl Unit49</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit49</em>'.
	 * @see WTSpecID.CtrlUnit49
	 * @generated
	 */
	EClass getCtrlUnit49();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit49#getInput__iInput1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit49#getInput__iInput2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpecID.CtrlUnit49#getInput__iInput3()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getInput__iInput4 <em>Input iInput4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput4</em>'.
	 * @see WTSpecID.CtrlUnit49#getInput__iInput4()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Input__iInput4();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getOutput__oOutputFan1 <em>Output oOutput Fan1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput Fan1</em>'.
	 * @see WTSpecID.CtrlUnit49#getOutput__oOutputFan1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Output__oOutputFan1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getOutput__oOutputFan2 <em>Output oOutput Fan2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput Fan2</em>'.
	 * @see WTSpecID.CtrlUnit49#getOutput__oOutputFan2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Output__oOutputFan2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getParameter__pParam1 <em>Parameter pParam1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam1</em>'.
	 * @see WTSpecID.CtrlUnit49#getParameter__pParam1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getParameter__pParam2 <em>Parameter pParam2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam2</em>'.
	 * @see WTSpecID.CtrlUnit49#getParameter__pParam2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getParameter__pParam3 <em>Parameter pParam3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam3</em>'.
	 * @see WTSpecID.CtrlUnit49#getParameter__pParam3()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getParameter__pParam4 <em>Parameter pParam4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam4</em>'.
	 * @see WTSpecID.CtrlUnit49#getParameter__pParam4()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Parameter__pParam4();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getFault__fFault1 <em>Fault fFault1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault1</em>'.
	 * @see WTSpecID.CtrlUnit49#getFault__fFault1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Fault__fFault1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getTimer__tTimer1 <em>Timer tTimer1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer1</em>'.
	 * @see WTSpecID.CtrlUnit49#getTimer__tTimer1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_Timer__tTimer1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getErrorReaction__eReaction1 <em>Error Reaction eReaction1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction eReaction1</em>'.
	 * @see WTSpecID.CtrlUnit49#getErrorReaction__eReaction1()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_ErrorReaction__eReaction1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit49#getErrorReaction__eReaction2 <em>Error Reaction eReaction2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction eReaction2</em>'.
	 * @see WTSpecID.CtrlUnit49#getErrorReaction__eReaction2()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EReference getCtrlUnit49_ErrorReaction__eReaction2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardErrors <em>Guard gGuard Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Errors</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardErrors()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardErrors();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardNoErrors <em>Guard gGuard No Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard No Errors</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardNoErrors()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardNoErrors();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardOffToHi <em>Guard gGuard Off To Hi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Off To Hi</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardOffToHi()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardOffToHi();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardHiToOff <em>Guard gGuard Hi To Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Hi To Off</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardHiToOff()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardHiToOff();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardOffToLow <em>Guard gGuard Off To Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Off To Low</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardOffToLow()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardOffToLow();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardLowToOff <em>Guard gGuard Low To Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Low To Off</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardLowToOff()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardLowToOff();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardLowToHi <em>Guard gGuard Low To Hi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Low To Hi</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardLowToHi()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardLowToHi();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit49#getGuard__gGuardHiToLow <em>Guard gGuard Hi To Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard gGuard Hi To Low</em>'.
	 * @see WTSpecID.CtrlUnit49#getGuard__gGuardHiToLow()
	 * @see #getCtrlUnit49()
	 * @generated
	 */
	EAttribute getCtrlUnit49_Guard__gGuardHiToLow();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit50 <em>Ctrl Unit50</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit50</em>'.
	 * @see WTSpecID.CtrlUnit50
	 * @generated
	 */
	EClass getCtrlUnit50();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit50#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit50#getOutput__oOutput()
	 * @see #getCtrlUnit50()
	 * @generated
	 */
	EReference getCtrlUnit50_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit50#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit50#getFault__fFault()
	 * @see #getCtrlUnit50()
	 * @generated
	 */
	EReference getCtrlUnit50_Fault__fFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit51 <em>Ctrl Unit51</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit51</em>'.
	 * @see WTSpecID.CtrlUnit51
	 * @generated
	 */
	EClass getCtrlUnit51();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit51#getParameter__pHour <em>Parameter pHour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pHour</em>'.
	 * @see WTSpecID.CtrlUnit51#getParameter__pHour()
	 * @see #getCtrlUnit51()
	 * @generated
	 */
	EReference getCtrlUnit51_Parameter__pHour();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit51#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit51#getFault__fFault()
	 * @see #getCtrlUnit51()
	 * @generated
	 */
	EReference getCtrlUnit51_Fault__fFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit52 <em>Ctrl Unit52</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit52</em>'.
	 * @see WTSpecID.CtrlUnit52
	 * @generated
	 */
	EClass getCtrlUnit52();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit52#getInput__iVarInput <em>Input iVar Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iVar Input</em>'.
	 * @see WTSpecID.CtrlUnit52#getInput__iVarInput()
	 * @see #getCtrlUnit52()
	 * @generated
	 */
	EReference getCtrlUnit52_Input__iVarInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit52#getOutput__oVarOutput <em>Output oVar Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVar Output</em>'.
	 * @see WTSpecID.CtrlUnit52#getOutput__oVarOutput()
	 * @see #getCtrlUnit52()
	 * @generated
	 */
	EReference getCtrlUnit52_Output__oVarOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit53 <em>Ctrl Unit53</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit53</em>'.
	 * @see WTSpecID.CtrlUnit53
	 * @generated
	 */
	EClass getCtrlUnit53();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iMachineStatusIndicator <em>Input iMachine Status Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMachine Status Indicator</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iMachineStatusIndicator()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iMachineStatusIndicator();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iStopConditionIndicator <em>Input iStop Condition Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStop Condition Indicator</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iStopConditionIndicator()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iStopConditionIndicator();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iManualByPass <em>Input iManual By Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual By Pass</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iManualByPass()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iManualByPass();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iMotorizing <em>Input iMotorizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMotorizing</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iMotorizing()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iMotorizing();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iFlagIntoWind <em>Input iFlag Into Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFlag Into Wind</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iFlagIntoWind()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iFlagIntoWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iProtectionCondition <em>Input iProtection Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iProtection Condition</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iProtectionCondition()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iProtectionCondition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iEmergencyCondition <em>Input iEmergency Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iEmergency Condition</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iEmergencyCondition()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iEmergencyCondition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getInput__iDeenergizeCondition <em>Input iDeenergize Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDeenergize Condition</em>'.
	 * @see WTSpecID.CtrlUnit53#getInput__iDeenergizeCondition()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Input__iDeenergizeCondition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getOutput__oAutoStopCommand <em>Output oAuto Stop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAuto Stop Command</em>'.
	 * @see WTSpecID.CtrlUnit53#getOutput__oAutoStopCommand()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Output__oAutoStopCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getFault__fRunFault <em>Fault fRun Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fRun Fault</em>'.
	 * @see WTSpecID.CtrlUnit53#getFault__fRunFault()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Fault__fRunFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getTimer__tStartDelay <em>Timer tStart Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tStart Delay</em>'.
	 * @see WTSpecID.CtrlUnit53#getTimer__tStartDelay()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Timer__tStartDelay();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getTimer__tCheckRunFault <em>Timer tCheck Run Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tCheck Run Fault</em>'.
	 * @see WTSpecID.CtrlUnit53#getTimer__tCheckRunFault()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_Timer__tCheckRunFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit53#getErrorReaction__erMotorizing <em>Error Reaction er Motorizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Motorizing</em>'.
	 * @see WTSpecID.CtrlUnit53#getErrorReaction__erMotorizing()
	 * @see #getCtrlUnit53()
	 * @generated
	 */
	EReference getCtrlUnit53_ErrorReaction__erMotorizing();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit54 <em>Ctrl Unit54</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit54</em>'.
	 * @see WTSpecID.CtrlUnit54
	 * @generated
	 */
	EClass getCtrlUnit54();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iSafety <em>Input iSafety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSafety</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iSafety()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iSafety();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iLockingOrderSelected <em>Input iLocking Order Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLocking Order Selected</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iLockingOrderSelected()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iLockingOrderSelected();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iMachineStateL <em>Input iMachine State L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMachine State L</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iMachineStateL()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iMachineStateL();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iMachineStateU <em>Input iMachine State U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMachine State U</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iMachineStateU()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iMachineStateU();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iMachineStateS <em>Input iMachine State S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMachine State S</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iMachineStateS()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iMachineStateS();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iInitialConditions <em>Input iInitial Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInitial Conditions</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iInitialConditions()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iInitialConditions();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getInput__iPinState <em>Input iPin State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPin State</em>'.
	 * @see WTSpecID.CtrlUnit54#getInput__iPinState()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Input__iPinState();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit54#getOutput__oLockingOrder <em>Output oLocking Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oLocking Order</em>'.
	 * @see WTSpecID.CtrlUnit54#getOutput__oLockingOrder()
	 * @see #getCtrlUnit54()
	 * @generated
	 */
	EReference getCtrlUnit54_Output__oLockingOrder();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit55 <em>Ctrl Unit55</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit55</em>'.
	 * @see WTSpecID.CtrlUnit55
	 * @generated
	 */
	EClass getCtrlUnit55();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit55#getOutput__oSignal <em>Output oSignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSignal</em>'.
	 * @see WTSpecID.CtrlUnit55#getOutput__oSignal()
	 * @see #getCtrlUnit55()
	 * @generated
	 */
	EReference getCtrlUnit55_Output__oSignal();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit56 <em>Ctrl Unit56</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit56</em>'.
	 * @see WTSpecID.CtrlUnit56
	 * @generated
	 */
	EClass getCtrlUnit56();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit56#getInput__iInternalFailure <em>Input iInternal Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInternal Failure</em>'.
	 * @see WTSpecID.CtrlUnit56#getInput__iInternalFailure()
	 * @see #getCtrlUnit56()
	 * @generated
	 */
	EReference getCtrlUnit56_Input__iInternalFailure();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit56#getOutput__oInhibit <em>Output oInhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInhibit</em>'.
	 * @see WTSpecID.CtrlUnit56#getOutput__oInhibit()
	 * @see #getCtrlUnit56()
	 * @generated
	 */
	EReference getCtrlUnit56_Output__oInhibit();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit57 <em>Ctrl Unit57</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit57</em>'.
	 * @see WTSpecID.CtrlUnit57
	 * @generated
	 */
	EClass getCtrlUnit57();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit57#getInput__iUp <em>Input iUp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iUp</em>'.
	 * @see WTSpecID.CtrlUnit57#getInput__iUp()
	 * @see #getCtrlUnit57()
	 * @generated
	 */
	EReference getCtrlUnit57_Input__iUp();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit57#getInput__iDown <em>Input iDown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDown</em>'.
	 * @see WTSpecID.CtrlUnit57#getInput__iDown()
	 * @see #getCtrlUnit57()
	 * @generated
	 */
	EReference getCtrlUnit57_Input__iDown();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit57#getOutput__oAnalogOut <em>Output oAnalog Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAnalog Out</em>'.
	 * @see WTSpecID.CtrlUnit57#getOutput__oAnalogOut()
	 * @see #getCtrlUnit57()
	 * @generated
	 */
	EReference getCtrlUnit57_Output__oAnalogOut();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit57#getParameter__pParam <em>Parameter pParam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam</em>'.
	 * @see WTSpecID.CtrlUnit57#getParameter__pParam()
	 * @see #getCtrlUnit57()
	 * @generated
	 */
	EReference getCtrlUnit57_Parameter__pParam();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit57#getParameter__pMax <em>Parameter pMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax</em>'.
	 * @see WTSpecID.CtrlUnit57#getParameter__pMax()
	 * @see #getCtrlUnit57()
	 * @generated
	 */
	EReference getCtrlUnit57_Parameter__pMax();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit57#getParameter__pMin <em>Parameter pMin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMin</em>'.
	 * @see WTSpecID.CtrlUnit57#getParameter__pMin()
	 * @see #getCtrlUnit57()
	 * @generated
	 */
	EReference getCtrlUnit57_Parameter__pMin();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit58 <em>Ctrl Unit58</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit58</em>'.
	 * @see WTSpecID.CtrlUnit58
	 * @generated
	 */
	EClass getCtrlUnit58();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit58#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit58#getInput__iInput()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EReference getCtrlUnit58_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit58#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit58#getOutput__oOutput()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EReference getCtrlUnit58_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit58#getParameter__pParam <em>Parameter pParam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pParam</em>'.
	 * @see WTSpecID.CtrlUnit58#getParameter__pParam()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EReference getCtrlUnit58_Parameter__pParam();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit58#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit58#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit58()
	 * @generated
	 */
	EAttribute getCtrlUnit58_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit59 <em>Ctrl Unit59</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit59</em>'.
	 * @see WTSpecID.CtrlUnit59
	 * @generated
	 */
	EClass getCtrlUnit59();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit59#getInput__iVarInput <em>Input iVar Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iVar Input</em>'.
	 * @see WTSpecID.CtrlUnit59#getInput__iVarInput()
	 * @see #getCtrlUnit59()
	 * @generated
	 */
	EReference getCtrlUnit59_Input__iVarInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit59#getOutput__oVarOutput <em>Output oVar Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVar Output</em>'.
	 * @see WTSpecID.CtrlUnit59#getOutput__oVarOutput()
	 * @see #getCtrlUnit59()
	 * @generated
	 */
	EReference getCtrlUnit59_Output__oVarOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit60 <em>Ctrl Unit60</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit60</em>'.
	 * @see WTSpecID.CtrlUnit60
	 * @generated
	 */
	EClass getCtrlUnit60();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iDisconnect <em>Input iDisconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDisconnect</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iDisconnect()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iDisconnect();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iStopCommand <em>Input iStop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStop Command</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iStopCommand()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iStopCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iPitchBraked <em>Input iPitch Braked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Braked</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iPitchBraked()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iPitchBraked();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iInverterRpm <em>Input iInverter Rpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Rpm</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iInverterRpm()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iInverterRpm();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iReadyForOn <em>Input iReady For On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReady For On</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iReadyForOn()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iReadyForOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iReadyForRun <em>Input iReady For Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReady For Run</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iReadyForRun()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iReadyForRun();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iReadyForRef <em>Input iReady For Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReady For Ref</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iReadyForRef()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iReadyForRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iResetOrder <em>Input iReset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Order</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iResetOrder()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iForceInvOff <em>Input iForce Inv Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iForce Inv Off</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iForceInvOff()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iForceInvOff();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getInput__iSafetyInput <em>Input iSafety Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSafety Input</em>'.
	 * @see WTSpecID.CtrlUnit60#getInput__iSafetyInput()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Input__iSafetyInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getOutput__oInverterRun <em>Output oInverter Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Run</em>'.
	 * @see WTSpecID.CtrlUnit60#getOutput__oInverterRun()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Output__oInverterRun();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getOutput__oInverterToOn <em>Output oInverter To On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter To On</em>'.
	 * @see WTSpecID.CtrlUnit60#getOutput__oInverterToOn()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Output__oInverterToOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getParameter__pInverterConnSpeed <em>Parameter pInverter Conn Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pInverter Conn Speed</em>'.
	 * @see WTSpecID.CtrlUnit60#getParameter__pInverterConnSpeed()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Parameter__pInverterConnSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getParameter__pInverterConnSpeedHysteresis <em>Parameter pInverter Conn Speed Hysteresis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pInverter Conn Speed Hysteresis</em>'.
	 * @see WTSpecID.CtrlUnit60#getParameter__pInverterConnSpeedHysteresis()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Parameter__pInverterConnSpeedHysteresis();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getFault__fReconnectWarning <em>Fault fReconnect Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fReconnect Warning</em>'.
	 * @see WTSpecID.CtrlUnit60#getFault__fReconnectWarning()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Fault__fReconnectWarning();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getFault__fReadyRefWarning <em>Fault fReady Ref Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fReady Ref Warning</em>'.
	 * @see WTSpecID.CtrlUnit60#getFault__fReadyRefWarning()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Fault__fReadyRefWarning();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getTimer__tConnection <em>Timer tConnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tConnection</em>'.
	 * @see WTSpecID.CtrlUnit60#getTimer__tConnection()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Timer__tConnection();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit60#getTimer__tRunningDelay <em>Timer tRunning Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tRunning Delay</em>'.
	 * @see WTSpecID.CtrlUnit60#getTimer__tRunningDelay()
	 * @see #getCtrlUnit60()
	 * @generated
	 */
	EReference getCtrlUnit60_Timer__tRunningDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit61 <em>Ctrl Unit61</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit61</em>'.
	 * @see WTSpecID.CtrlUnit61
	 * @generated
	 */
	EClass getCtrlUnit61();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iInverterToOnOrder <em>Input iInverter To On Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter To On Order</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iInverterToOnOrder()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iInverterToOnOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iInverterReadyRef <em>Input iInverter Ready Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Ready Ref</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iInverterReadyRef()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iInverterReadyRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iRemoteResetOrder <em>Input iRemote Reset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRemote Reset Order</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iRemoteResetOrder()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iRemoteResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iInverterTorqueReg <em>Input iInverter Torque Reg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Torque Reg</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iInverterTorqueReg()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iInverterTorqueReg();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iInverterHwState <em>Input iInverter Hw State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Hw State</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iInverterHwState()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iInverterHwState();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iResetOrder <em>Input iReset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Order</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iResetOrder()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getInput__iMotorizing <em>Input iMotorizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMotorizing</em>'.
	 * @see WTSpecID.CtrlUnit61#getInput__iMotorizing()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Input__iMotorizing();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getOutput__oInverterToOn <em>Output oInverter To On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter To On</em>'.
	 * @see WTSpecID.CtrlUnit61#getOutput__oInverterToOn()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Output__oInverterToOn();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getOutput__oInverterResetCommand <em>Output oInverter Reset Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Reset Command</em>'.
	 * @see WTSpecID.CtrlUnit61#getOutput__oInverterResetCommand()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Output__oInverterResetCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getOutput__oInverterTorqueRef <em>Output oInverter Torque Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Torque Ref</em>'.
	 * @see WTSpecID.CtrlUnit61#getOutput__oInverterTorqueRef()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Output__oInverterTorqueRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getOutput__oInverterResetAlarms <em>Output oInverter Reset Alarms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Reset Alarms</em>'.
	 * @see WTSpecID.CtrlUnit61#getOutput__oInverterResetAlarms()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Output__oInverterResetAlarms();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getFault__fEtherCAT <em>Fault fEther CAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fEther CAT</em>'.
	 * @see WTSpecID.CtrlUnit61#getFault__fEtherCAT()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Fault__fEtherCAT();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getTimer__tResetTime <em>Timer tReset Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tReset Time</em>'.
	 * @see WTSpecID.CtrlUnit61#getTimer__tResetTime()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Timer__tResetTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getTimer__tDelayBetweenResets <em>Timer tDelay Between Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay Between Resets</em>'.
	 * @see WTSpecID.CtrlUnit61#getTimer__tDelayBetweenResets()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_Timer__tDelayBetweenResets();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit61#getErrorReaction__erStop <em>Error Reaction er Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Stop</em>'.
	 * @see WTSpecID.CtrlUnit61#getErrorReaction__erStop()
	 * @see #getCtrlUnit61()
	 * @generated
	 */
	EReference getCtrlUnit61_ErrorReaction__erStop();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit62 <em>Ctrl Unit62</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit62</em>'.
	 * @see WTSpecID.CtrlUnit62
	 * @generated
	 */
	EClass getCtrlUnit62();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit62#getInput__iInverterTorqueRef <em>Input iInverter Torque Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Torque Ref</em>'.
	 * @see WTSpecID.CtrlUnit62#getInput__iInverterTorqueRef()
	 * @see #getCtrlUnit62()
	 * @generated
	 */
	EReference getCtrlUnit62_Input__iInverterTorqueRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit62#getInput__iInverterTorqueRefLocking <em>Input iInverter Torque Ref Locking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInverter Torque Ref Locking</em>'.
	 * @see WTSpecID.CtrlUnit62#getInput__iInverterTorqueRefLocking()
	 * @see #getCtrlUnit62()
	 * @generated
	 */
	EReference getCtrlUnit62_Input__iInverterTorqueRefLocking();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit62#getInput__iMotorizing <em>Input iMotorizing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMotorizing</em>'.
	 * @see WTSpecID.CtrlUnit62#getInput__iMotorizing()
	 * @see #getCtrlUnit62()
	 * @generated
	 */
	EReference getCtrlUnit62_Input__iMotorizing();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit62#getOutput__oInverterTorqueRefFinal <em>Output oInverter Torque Ref Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Torque Ref Final</em>'.
	 * @see WTSpecID.CtrlUnit62#getOutput__oInverterTorqueRefFinal()
	 * @see #getCtrlUnit62()
	 * @generated
	 */
	EReference getCtrlUnit62_Output__oInverterTorqueRefFinal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit62#getOutput__oInverterMotorizeCommand <em>Output oInverter Motorize Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInverter Motorize Command</em>'.
	 * @see WTSpecID.CtrlUnit62#getOutput__oInverterMotorizeCommand()
	 * @see #getCtrlUnit62()
	 * @generated
	 */
	EReference getCtrlUnit62_Output__oInverterMotorizeCommand();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit63 <em>Ctrl Unit63</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit63</em>'.
	 * @see WTSpecID.CtrlUnit63
	 * @generated
	 */
	EClass getCtrlUnit63();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iAzimuth <em>Input iAzimuth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAzimuth</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iAzimuth()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iAzimuth();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iOrder <em>Input iOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iOrder()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iTargetHole <em>Input iTarget Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTarget Hole</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iTargetHole()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iTargetHole();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iInvReadyRef <em>Input iInv Ready Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInv Ready Ref</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iInvReadyRef()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iInvReadyRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iEncoderSpeed <em>Input iEncoder Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iEncoder Speed</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iEncoderSpeed()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iEncoderSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iInductiveSensor1 <em>Input iInductive Sensor1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInductive Sensor1</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iInductiveSensor1()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iInductiveSensor1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getInput__iInductiveSensor2 <em>Input iInductive Sensor2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInductive Sensor2</em>'.
	 * @see WTSpecID.CtrlUnit63#getInput__iInductiveSensor2()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Input__iInductiveSensor2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oMotorTorque <em>Output oMotor Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMotor Torque</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oMotorTorque()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oMotorTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oMotorSense <em>Output oMotor Sense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMotor Sense</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oMotorSense()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oMotorSense();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oFlIntoPosition <em>Output oFl Into Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFl Into Position</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oFlIntoPosition()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oFlIntoPosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oStatusFromDll <em>Output oStatus From Dll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oStatus From Dll</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oStatusFromDll()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oStatusFromDll();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oPositionSetpoint <em>Output oPosition Setpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPosition Setpoint</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oPositionSetpoint()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oPositionSetpoint();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oTorqueAve <em>Output oTorque Ave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTorque Ave</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oTorqueAve()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oTorqueAve();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oErrorAve <em>Output oError Ave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oError Ave</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oErrorAve()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oErrorAve();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oSpeedAve <em>Output oSpeed Ave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSpeed Ave</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oSpeedAve()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oSpeedAve();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oWref <em>Output oWref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWref</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oWref()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oWref();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oTargetPosition <em>Output oTarget Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTarget Position</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oTargetPosition()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oTargetPosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oKeepState <em>Output oKeep State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oKeep State</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oKeepState()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oKeepState();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oSeekState <em>Output oSeek State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSeek State</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oSeekState()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oSeekState();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oMotorize <em>Output oMotorize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMotorize</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oMotorize()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oMotorize();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oRealObjetive <em>Output oReal Objetive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oReal Objetive</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oRealObjetive()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oRealObjetive();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getOutput__oControlMode <em>Output oControl Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oControl Mode</em>'.
	 * @see WTSpecID.CtrlUnit63#getOutput__oControlMode()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Output__oControlMode();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pOffset <em>Parameter pOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pOffset</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pOffset()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pOffset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pEncoderOffset <em>Parameter pEncoder Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pEncoder Offset</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pEncoderOffset()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pEncoderOffset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pNextHoleDegrees <em>Parameter pNext Hole Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pNext Hole Degrees</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pNextHoleDegrees()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pNextHoleDegrees();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pPosRate1 <em>Parameter pPos Rate1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPos Rate1</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pPosRate1()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pPosRate1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pPosRate2 <em>Parameter pPos Rate2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPos Rate2</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pPosRate2()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pPosRate2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pMaxSpeed <em>Parameter pMax Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Speed</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pMaxSpeed()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pMaxSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pSampleTime <em>Parameter pSample Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pSample Time</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pSampleTime()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pSampleTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pMaxTorque <em>Parameter pMax Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Torque</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pMaxTorque()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pMaxTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pAverageTime <em>Parameter pAverage Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pAverage Time</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pAverageTime()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pAverageTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pSpeedAverageTime <em>Parameter pSpeed Average Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pSpeed Average Time</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pSpeedAverageTime()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pSpeedAverageTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pMaxAcceleration <em>Parameter pMax Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Acceleration</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pMaxAcceleration()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pMaxAcceleration();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKpp <em>Parameter pKpp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKpp</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKpp()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKpp();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKps <em>Parameter pKps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKps</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKps()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKps();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKis <em>Parameter pKis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKis</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKis()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKis();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pFilterOK <em>Parameter pFilter OK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pFilter OK</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pFilterOK()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pFilterOK();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pFilterFreq <em>Parameter pFilter Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pFilter Freq</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pFilterFreq()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pFilterFreq();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pFilterDamp <em>Parameter pFilter Damp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pFilter Damp</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pFilterDamp()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pFilterDamp();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKp2 <em>Parameter pKp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKp2</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKp2()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKp2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKp1 <em>Parameter pKp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKp1</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKp1()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKp1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKi1 <em>Parameter pKi1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKi1</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKi1()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKi1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pKi2 <em>Parameter pKi2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pKi2</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pKi2()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pKi2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit63#getParameter__pPosBand <em>Parameter pPos Band</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPos Band</em>'.
	 * @see WTSpecID.CtrlUnit63#getParameter__pPosBand()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EReference getCtrlUnit63_Parameter__pPosBand();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit63#getBhvParam__bpControlMode <em>Bhv Param bp Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Control Mode</em>'.
	 * @see WTSpecID.CtrlUnit63#getBhvParam__bpControlMode()
	 * @see #getCtrlUnit63()
	 * @generated
	 */
	EAttribute getCtrlUnit63_BhvParam__bpControlMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit64 <em>Ctrl Unit64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit64</em>'.
	 * @see WTSpecID.CtrlUnit64
	 * @generated
	 */
	EClass getCtrlUnit64();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit64#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit64#getOutput__oOutput()
	 * @see #getCtrlUnit64()
	 * @generated
	 */
	EReference getCtrlUnit64_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit64#getErrorReaction__erErrorReaction <em>Error Reaction er Error Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Error Reaction</em>'.
	 * @see WTSpecID.CtrlUnit64#getErrorReaction__erErrorReaction()
	 * @see #getCtrlUnit64()
	 * @generated
	 */
	EReference getCtrlUnit64_ErrorReaction__erErrorReaction();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit65 <em>Ctrl Unit65</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit65</em>'.
	 * @see WTSpecID.CtrlUnit65
	 * @generated
	 */
	EClass getCtrlUnit65();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit65#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit65#getOutput__oOutput()
	 * @see #getCtrlUnit65()
	 * @generated
	 */
	EReference getCtrlUnit65_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit65#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit65#getFault__fFault()
	 * @see #getCtrlUnit65()
	 * @generated
	 */
	EReference getCtrlUnit65_Fault__fFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit66 <em>Ctrl Unit66</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit66</em>'.
	 * @see WTSpecID.CtrlUnit66
	 * @generated
	 */
	EClass getCtrlUnit66();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit66#getInput__iMaintenancePreventiveButton <em>Input iMaintenance Preventive Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaintenance Preventive Button</em>'.
	 * @see WTSpecID.CtrlUnit66#getInput__iMaintenancePreventiveButton()
	 * @see #getCtrlUnit66()
	 * @generated
	 */
	EReference getCtrlUnit66_Input__iMaintenancePreventiveButton();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit66#getInput__iMaintenanceCorrectiveButton <em>Input iMaintenance Corrective Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaintenance Corrective Button</em>'.
	 * @see WTSpecID.CtrlUnit66#getInput__iMaintenanceCorrectiveButton()
	 * @see #getCtrlUnit66()
	 * @generated
	 */
	EReference getCtrlUnit66_Input__iMaintenanceCorrectiveButton();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit66#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit66#getInput__iDontCheckInput()
	 * @see #getCtrlUnit66()
	 * @generated
	 */
	EReference getCtrlUnit66_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit66#getOutput__oMaintenanceStatus <em>Output oMaintenance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMaintenance Status</em>'.
	 * @see WTSpecID.CtrlUnit66#getOutput__oMaintenanceStatus()
	 * @see #getCtrlUnit66()
	 * @generated
	 */
	EReference getCtrlUnit66_Output__oMaintenanceStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit66#getFault__fMaintenancePreventive <em>Fault fMaintenance Preventive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fMaintenance Preventive</em>'.
	 * @see WTSpecID.CtrlUnit66#getFault__fMaintenancePreventive()
	 * @see #getCtrlUnit66()
	 * @generated
	 */
	EReference getCtrlUnit66_Fault__fMaintenancePreventive();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit66#getFault__fMaintenanceCorrective <em>Fault fMaintenance Corrective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fMaintenance Corrective</em>'.
	 * @see WTSpecID.CtrlUnit66#getFault__fMaintenanceCorrective()
	 * @see #getCtrlUnit66()
	 * @generated
	 */
	EReference getCtrlUnit66_Fault__fMaintenanceCorrective();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit67 <em>Ctrl Unit67</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit67</em>'.
	 * @see WTSpecID.CtrlUnit67
	 * @generated
	 */
	EClass getCtrlUnit67();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit67#getInput__iHMIOrder <em>Input iHMI Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iHMI Order</em>'.
	 * @see WTSpecID.CtrlUnit67#getInput__iHMIOrder()
	 * @see #getCtrlUnit67()
	 * @generated
	 */
	EReference getCtrlUnit67_Input__iHMIOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit67#getInput__iElementStatus <em>Input iElement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iElement Status</em>'.
	 * @see WTSpecID.CtrlUnit67#getInput__iElementStatus()
	 * @see #getCtrlUnit67()
	 * @generated
	 */
	EReference getCtrlUnit67_Input__iElementStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit67#getInput__iMasterPos <em>Input iMaster Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaster Pos</em>'.
	 * @see WTSpecID.CtrlUnit67#getInput__iMasterPos()
	 * @see #getCtrlUnit67()
	 * @generated
	 */
	EReference getCtrlUnit67_Input__iMasterPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit67#getOutput__oElementRol <em>Output oElement Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oElement Rol</em>'.
	 * @see WTSpecID.CtrlUnit67#getOutput__oElementRol()
	 * @see #getCtrlUnit67()
	 * @generated
	 */
	EReference getCtrlUnit67_Output__oElementRol();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit67#getParameter__pMaxElements <em>Parameter pMax Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Elements</em>'.
	 * @see WTSpecID.CtrlUnit67#getParameter__pMaxElements()
	 * @see #getCtrlUnit67()
	 * @generated
	 */
	EReference getCtrlUnit67_Parameter__pMaxElements();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit67#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit67#getBhvParam__bpMode()
	 * @see #getCtrlUnit67()
	 * @generated
	 */
	EAttribute getCtrlUnit67_BhvParam__bpMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit68 <em>Ctrl Unit68</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit68</em>'.
	 * @see WTSpecID.CtrlUnit68
	 * @generated
	 */
	EClass getCtrlUnit68();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit68#getInput__iValue1 <em>Input iValue1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iValue1</em>'.
	 * @see WTSpecID.CtrlUnit68#getInput__iValue1()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EReference getCtrlUnit68_Input__iValue1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit68#getInput__iValue2 <em>Input iValue2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iValue2</em>'.
	 * @see WTSpecID.CtrlUnit68#getInput__iValue2()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EReference getCtrlUnit68_Input__iValue2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit68#getOutput__oResult <em>Output oResult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oResult</em>'.
	 * @see WTSpecID.CtrlUnit68#getOutput__oResult()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EReference getCtrlUnit68_Output__oResult();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit68#getBhvParam__bpOperationType <em>Bhv Param bp Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Operation Type</em>'.
	 * @see WTSpecID.CtrlUnit68#getBhvParam__bpOperationType()
	 * @see #getCtrlUnit68()
	 * @generated
	 */
	EAttribute getCtrlUnit68_BhvParam__bpOperationType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit69 <em>Ctrl Unit69</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit69</em>'.
	 * @see WTSpecID.CtrlUnit69
	 * @generated
	 */
	EClass getCtrlUnit69();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit69#getInput__iLocalMaxPower <em>Input iLocal Max Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLocal Max Power</em>'.
	 * @see WTSpecID.CtrlUnit69#getInput__iLocalMaxPower()
	 * @see #getCtrlUnit69()
	 * @generated
	 */
	EReference getCtrlUnit69_Input__iLocalMaxPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit69#getInput__iRemoteMaxPower <em>Input iRemote Max Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRemote Max Power</em>'.
	 * @see WTSpecID.CtrlUnit69#getInput__iRemoteMaxPower()
	 * @see #getCtrlUnit69()
	 * @generated
	 */
	EReference getCtrlUnit69_Input__iRemoteMaxPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit69#getInput__iTorqueControlMaxPower <em>Input iTorque Control Max Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTorque Control Max Power</em>'.
	 * @see WTSpecID.CtrlUnit69#getInput__iTorqueControlMaxPower()
	 * @see #getCtrlUnit69()
	 * @generated
	 */
	EReference getCtrlUnit69_Input__iTorqueControlMaxPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit69#getOutput__oMaxPower <em>Output oMax Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMax Power</em>'.
	 * @see WTSpecID.CtrlUnit69#getOutput__oMaxPower()
	 * @see #getCtrlUnit69()
	 * @generated
	 */
	EReference getCtrlUnit69_Output__oMaxPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit69#getParameter__pMaxPower <em>Parameter pMax Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Power</em>'.
	 * @see WTSpecID.CtrlUnit69#getParameter__pMaxPower()
	 * @see #getCtrlUnit69()
	 * @generated
	 */
	EReference getCtrlUnit69_Parameter__pMaxPower();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit70 <em>Ctrl Unit70</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit70</em>'.
	 * @see WTSpecID.CtrlUnit70
	 * @generated
	 */
	EClass getCtrlUnit70();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit70#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit70#getInput__iInput1()
	 * @see #getCtrlUnit70()
	 * @generated
	 */
	EReference getCtrlUnit70_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit70#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit70#getInput__iInput2()
	 * @see #getCtrlUnit70()
	 * @generated
	 */
	EReference getCtrlUnit70_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit70#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpecID.CtrlUnit70#getInput__iInput3()
	 * @see #getCtrlUnit70()
	 * @generated
	 */
	EReference getCtrlUnit70_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit70#getOutput__oResult <em>Output oResult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oResult</em>'.
	 * @see WTSpecID.CtrlUnit70#getOutput__oResult()
	 * @see #getCtrlUnit70()
	 * @generated
	 */
	EReference getCtrlUnit70_Output__oResult();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit71 <em>Ctrl Unit71</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit71</em>'.
	 * @see WTSpecID.CtrlUnit71
	 * @generated
	 */
	EClass getCtrlUnit71();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getInput__iSelect1 <em>Input iSelect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSelect1</em>'.
	 * @see WTSpecID.CtrlUnit71#getInput__iSelect1()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iSelect1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getInput__iSelect2 <em>Input iSelect2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSelect2</em>'.
	 * @see WTSpecID.CtrlUnit71#getInput__iSelect2()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iSelect2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getInput__iSelect3 <em>Input iSelect3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSelect3</em>'.
	 * @see WTSpecID.CtrlUnit71#getInput__iSelect3()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iSelect3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit71#getInput__iInput1()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit71#getInput__iInput2()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getInput__iInput3 <em>Input iInput3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput3</em>'.
	 * @see WTSpecID.CtrlUnit71#getInput__iInput3()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Input__iInput3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit71#getOutput__oOutput()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Output__oOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit71#getOutput__oOutputWrongStatus <em>Output oOutput Wrong Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput Wrong Status</em>'.
	 * @see WTSpecID.CtrlUnit71#getOutput__oOutputWrongStatus()
	 * @see #getCtrlUnit71()
	 * @generated
	 */
	EReference getCtrlUnit71_Output__oOutputWrongStatus();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit72 <em>Ctrl Unit72</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit72</em>'.
	 * @see WTSpecID.CtrlUnit72
	 * @generated
	 */
	EClass getCtrlUnit72();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit72#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit72#getInput__iInput()
	 * @see #getCtrlUnit72()
	 * @generated
	 */
	EReference getCtrlUnit72_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit72#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit72#getTimer__tDelay()
	 * @see #getCtrlUnit72()
	 * @generated
	 */
	EReference getCtrlUnit72_Timer__tDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit73 <em>Ctrl Unit73</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit73</em>'.
	 * @see WTSpecID.CtrlUnit73
	 * @generated
	 */
	EClass getCtrlUnit73();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit73#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit73#getInput__iInput()
	 * @see #getCtrlUnit73()
	 * @generated
	 */
	EReference getCtrlUnit73_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit73#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit73#getOutput__oOutput()
	 * @see #getCtrlUnit73()
	 * @generated
	 */
	EReference getCtrlUnit73_Output__oOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit74 <em>Ctrl Unit74</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit74</em>'.
	 * @see WTSpecID.CtrlUnit74
	 * @generated
	 */
	EClass getCtrlUnit74();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit74#getInput__iConverterTripped <em>Input iConverter Tripped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iConverter Tripped</em>'.
	 * @see WTSpecID.CtrlUnit74#getInput__iConverterTripped()
	 * @see #getCtrlUnit74()
	 * @generated
	 */
	EReference getCtrlUnit74_Input__iConverterTripped();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit74#getInput__iConverterRunning <em>Input iConverter Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iConverter Running</em>'.
	 * @see WTSpecID.CtrlUnit74#getInput__iConverterRunning()
	 * @see #getCtrlUnit74()
	 * @generated
	 */
	EReference getCtrlUnit74_Input__iConverterRunning();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit74#getOutput__oOpcCnvOperationMode <em>Output oOpc Cnv Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOpc Cnv Operation Mode</em>'.
	 * @see WTSpecID.CtrlUnit74#getOutput__oOpcCnvOperationMode()
	 * @see #getCtrlUnit74()
	 * @generated
	 */
	EReference getCtrlUnit74_Output__oOpcCnvOperationMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit75 <em>Ctrl Unit75</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit75</em>'.
	 * @see WTSpecID.CtrlUnit75
	 * @generated
	 */
	EClass getCtrlUnit75();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iMaintenanceStatus <em>Input iMaintenance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaintenance Status</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iMaintenanceStatus()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iMaintenanceStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iFlBrakes <em>Input iFl Brakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFl Brakes</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iFlBrakes()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iFlBrakes();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iWTGStopped <em>Input iWTG Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWTG Stopped</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iWTGStopped()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iWTGStopped();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iGridError <em>Input iGrid Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iGrid Error</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iGridError()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iGridError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iReTwisting <em>Input iRe Twisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRe Twisting</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iReTwisting()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iReTwisting();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iHiWind <em>Input iHi Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iHi Wind</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iHiWind()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iHiWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iHiGust <em>Input iHi Gust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iHi Gust</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iHiGust()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iHiGust();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iLowWind <em>Input iLow Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLow Wind</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iLowWind()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iLowWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iBackWind <em>Input iBack Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iBack Wind</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iBackWind()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iBackWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getInput__iEnEstela <em>Input iEn Estela</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iEn Estela</em>'.
	 * @see WTSpecID.CtrlUnit75#getInput__iEnEstela()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Input__iEnEstela();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit75#getOutput__oOpcTurbineStatus <em>Output oOpc Turbine Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOpc Turbine Status</em>'.
	 * @see WTSpecID.CtrlUnit75#getOutput__oOpcTurbineStatus()
	 * @see #getCtrlUnit75()
	 * @generated
	 */
	EReference getCtrlUnit75_Output__oOpcTurbineStatus();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit76 <em>Ctrl Unit76</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit76</em>'.
	 * @see WTSpecID.CtrlUnit76
	 * @generated
	 */
	EClass getCtrlUnit76();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit76#getInput__iCtrlYawBrakeStatus <em>Input iCtrl Yaw Brake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iCtrl Yaw Brake Status</em>'.
	 * @see WTSpecID.CtrlUnit76#getInput__iCtrlYawBrakeStatus()
	 * @see #getCtrlUnit76()
	 * @generated
	 */
	EReference getCtrlUnit76_Input__iCtrlYawBrakeStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit76#getOutput__oOpcYawBrakeStatus <em>Output oOpc Yaw Brake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOpc Yaw Brake Status</em>'.
	 * @see WTSpecID.CtrlUnit76#getOutput__oOpcYawBrakeStatus()
	 * @see #getCtrlUnit76()
	 * @generated
	 */
	EReference getCtrlUnit76_Output__oOpcYawBrakeStatus();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit77 <em>Ctrl Unit77</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit77</em>'.
	 * @see WTSpecID.CtrlUnit77
	 * @generated
	 */
	EClass getCtrlUnit77();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit77#getInput__iYawInhibited <em>Input iYaw Inhibited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Inhibited</em>'.
	 * @see WTSpecID.CtrlUnit77#getInput__iYawInhibited()
	 * @see #getCtrlUnit77()
	 * @generated
	 */
	EReference getCtrlUnit77_Input__iYawInhibited();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit77#getInput__iYawCwOrder <em>Input iYaw Cw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Cw Order</em>'.
	 * @see WTSpecID.CtrlUnit77#getInput__iYawCwOrder()
	 * @see #getCtrlUnit77()
	 * @generated
	 */
	EReference getCtrlUnit77_Input__iYawCwOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit77#getInput__iYawCcwOrder <em>Input iYaw Ccw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Ccw Order</em>'.
	 * @see WTSpecID.CtrlUnit77#getInput__iYawCcwOrder()
	 * @see #getCtrlUnit77()
	 * @generated
	 */
	EReference getCtrlUnit77_Input__iYawCcwOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit77#getInput__iFlagIntoWind <em>Input iFlag Into Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFlag Into Wind</em>'.
	 * @see WTSpecID.CtrlUnit77#getInput__iFlagIntoWind()
	 * @see #getCtrlUnit77()
	 * @generated
	 */
	EReference getCtrlUnit77_Input__iFlagIntoWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit77#getOutput__oOpcYawStatus <em>Output oOpc Yaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOpc Yaw Status</em>'.
	 * @see WTSpecID.CtrlUnit77#getOutput__oOpcYawStatus()
	 * @see #getCtrlUnit77()
	 * @generated
	 */
	EReference getCtrlUnit77_Output__oOpcYawStatus();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit78 <em>Ctrl Unit78</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit78</em>'.
	 * @see WTSpecID.CtrlUnit78
	 * @generated
	 */
	EClass getCtrlUnit78();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit78#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit78#getInput__iInput1()
	 * @see #getCtrlUnit78()
	 * @generated
	 */
	EReference getCtrlUnit78_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit78#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit78#getInput__iInput2()
	 * @see #getCtrlUnit78()
	 * @generated
	 */
	EReference getCtrlUnit78_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit78#getOutput__oOutput <em>Output oOutput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOutput</em>'.
	 * @see WTSpecID.CtrlUnit78#getOutput__oOutput()
	 * @see #getCtrlUnit78()
	 * @generated
	 */
	EReference getCtrlUnit78_Output__oOutput();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit79 <em>Ctrl Unit79</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit79</em>'.
	 * @see WTSpecID.CtrlUnit79
	 * @generated
	 */
	EClass getCtrlUnit79();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getInput__iOverPressureCmd <em>Input iOver Pressure Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOver Pressure Cmd</em>'.
	 * @see WTSpecID.CtrlUnit79#getInput__iOverPressureCmd()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Input__iOverPressureCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getOutput__oYawBrakeHighPressureCmd <em>Output oYaw Brake High Pressure Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Brake High Pressure Cmd</em>'.
	 * @see WTSpecID.CtrlUnit79#getOutput__oYawBrakeHighPressureCmd()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Output__oYawBrakeHighPressureCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getFault__fYawBrakeBlock <em>Fault fYaw Brake Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fYaw Brake Block</em>'.
	 * @see WTSpecID.CtrlUnit79#getFault__fYawBrakeBlock()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Fault__fYawBrakeBlock();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getFault__fYawBrakeLoose <em>Fault fYaw Brake Loose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fYaw Brake Loose</em>'.
	 * @see WTSpecID.CtrlUnit79#getFault__fYawBrakeLoose()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Fault__fYawBrakeLoose();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getFault__fYawBrakeActive <em>Fault fYaw Brake Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fYaw Brake Active</em>'.
	 * @see WTSpecID.CtrlUnit79#getFault__fYawBrakeActive()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Fault__fYawBrakeActive();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getFault__fWarning <em>Fault fWarning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fWarning</em>'.
	 * @see WTSpecID.CtrlUnit79#getFault__fWarning()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Fault__fWarning();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit79#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit79#getFault__fFault()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EReference getCtrlUnit79_Fault__fFault();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit79#getDecisionSequence__dsCommands <em>Decision Sequence ds Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Sequence ds Commands</em>'.
	 * @see WTSpecID.CtrlUnit79#getDecisionSequence__dsCommands()
	 * @see #getCtrlUnit79()
	 * @generated
	 */
	EAttribute getCtrlUnit79_DecisionSequence__dsCommands();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit80 <em>Ctrl Unit80</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit80</em>'.
	 * @see WTSpecID.CtrlUnit80
	 * @generated
	 */
	EClass getCtrlUnit80();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit80#getInput__iAccessState <em>Input iAccess State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAccess State</em>'.
	 * @see WTSpecID.CtrlUnit80#getInput__iAccessState()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iAccessState();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit80#getInput__iMaintenanceStatus <em>Input iMaintenance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaintenance Status</em>'.
	 * @see WTSpecID.CtrlUnit80#getInput__iMaintenanceStatus()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iMaintenanceStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit80#getInput__iButtonStateNC2 <em>Input iButton State NC2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iButton State NC2</em>'.
	 * @see WTSpecID.CtrlUnit80#getInput__iButtonStateNC2()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iButtonStateNC2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit80#getInput__iButtonStateTC <em>Input iButton State TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iButton State TC</em>'.
	 * @see WTSpecID.CtrlUnit80#getInput__iButtonStateTC()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iButtonStateTC();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit80#getInput__iButtonStateRemote <em>Input iButton State Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iButton State Remote</em>'.
	 * @see WTSpecID.CtrlUnit80#getInput__iButtonStateRemote()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Input__iButtonStateRemote();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit80#getOutput__oButtonState <em>Output oButton State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oButton State</em>'.
	 * @see WTSpecID.CtrlUnit80#getOutput__oButtonState()
	 * @see #getCtrlUnit80()
	 * @generated
	 */
	EReference getCtrlUnit80_Output__oButtonState();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit81 <em>Ctrl Unit81</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit81</em>'.
	 * @see WTSpecID.CtrlUnit81
	 * @generated
	 */
	EClass getCtrlUnit81();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit81#getInput__iInput <em>Input iInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput</em>'.
	 * @see WTSpecID.CtrlUnit81#getInput__iInput()
	 * @see #getCtrlUnit81()
	 * @generated
	 */
	EReference getCtrlUnit81_Input__iInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit81#getOutput__oPercentVal <em>Output oPercent Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPercent Val</em>'.
	 * @see WTSpecID.CtrlUnit81#getOutput__oPercentVal()
	 * @see #getCtrlUnit81()
	 * @generated
	 */
	EReference getCtrlUnit81_Output__oPercentVal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit81#getParameter__pPercent <em>Parameter pPercent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPercent</em>'.
	 * @see WTSpecID.CtrlUnit81#getParameter__pPercent()
	 * @see #getCtrlUnit81()
	 * @generated
	 */
	EReference getCtrlUnit81_Parameter__pPercent();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit81#getParameter__pInput <em>Parameter pInput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pInput</em>'.
	 * @see WTSpecID.CtrlUnit81#getParameter__pInput()
	 * @see #getCtrlUnit81()
	 * @generated
	 */
	EReference getCtrlUnit81_Parameter__pInput();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit81#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit81#getBhvParam__bpMode()
	 * @see #getCtrlUnit81()
	 * @generated
	 */
	EAttribute getCtrlUnit81_BhvParam__bpMode();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit81#getBhvParam__bpSelect <em>Bhv Param bp Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Select</em>'.
	 * @see WTSpecID.CtrlUnit81#getBhvParam__bpSelect()
	 * @see #getCtrlUnit81()
	 * @generated
	 */
	EAttribute getCtrlUnit81_BhvParam__bpSelect();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit82 <em>Ctrl Unit82</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit82</em>'.
	 * @see WTSpecID.CtrlUnit82
	 * @generated
	 */
	EClass getCtrlUnit82();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit82#getInput__iVarInput <em>Input iVar Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iVar Input</em>'.
	 * @see WTSpecID.CtrlUnit82#getInput__iVarInput()
	 * @see #getCtrlUnit82()
	 * @generated
	 */
	EReference getCtrlUnit82_Input__iVarInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit82#getInput__iWriteTwistAngleRequest <em>Input iWrite Twist Angle Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWrite Twist Angle Request</em>'.
	 * @see WTSpecID.CtrlUnit82#getInput__iWriteTwistAngleRequest()
	 * @see #getCtrlUnit82()
	 * @generated
	 */
	EReference getCtrlUnit82_Input__iWriteTwistAngleRequest();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit82#getInput__iNewTwistAngleValue <em>Input iNew Twist Angle Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iNew Twist Angle Value</em>'.
	 * @see WTSpecID.CtrlUnit82#getInput__iNewTwistAngleValue()
	 * @see #getCtrlUnit82()
	 * @generated
	 */
	EReference getCtrlUnit82_Input__iNewTwistAngleValue();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit82#getOutput__oVarOutput <em>Output oVar Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVar Output</em>'.
	 * @see WTSpecID.CtrlUnit82#getOutput__oVarOutput()
	 * @see #getCtrlUnit82()
	 * @generated
	 */
	EReference getCtrlUnit82_Output__oVarOutput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit82#getParameter__pMinDifferenceToConsider <em>Parameter pMin Difference To Consider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMin Difference To Consider</em>'.
	 * @see WTSpecID.CtrlUnit82#getParameter__pMinDifferenceToConsider()
	 * @see #getCtrlUnit82()
	 * @generated
	 */
	EReference getCtrlUnit82_Parameter__pMinDifferenceToConsider();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit82#getTimer__tSyncDelay <em>Timer tSync Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tSync Delay</em>'.
	 * @see WTSpecID.CtrlUnit82#getTimer__tSyncDelay()
	 * @see #getCtrlUnit82()
	 * @generated
	 */
	EReference getCtrlUnit82_Timer__tSyncDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit83 <em>Ctrl Unit83</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit83</em>'.
	 * @see WTSpecID.CtrlUnit83
	 * @generated
	 */
	EClass getCtrlUnit83();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getInput__iPinSafetyCmd <em>Input iPin Safety Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPin Safety Cmd</em>'.
	 * @see WTSpecID.CtrlUnit83#getInput__iPinSafetyCmd()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Input__iPinSafetyCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getInput__iPinAutoCmd <em>Input iPin Auto Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPin Auto Cmd</em>'.
	 * @see WTSpecID.CtrlUnit83#getInput__iPinAutoCmd()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Input__iPinAutoCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getInput__iPinManualCmd <em>Input iPin Manual Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPin Manual Cmd</em>'.
	 * @see WTSpecID.CtrlUnit83#getInput__iPinManualCmd()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Input__iPinManualCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getInput__iLockingSet <em>Input iLocking Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLocking Set</em>'.
	 * @see WTSpecID.CtrlUnit83#getInput__iLockingSet()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Input__iLockingSet();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getInput__iManualMode <em>Input iManual Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual Mode</em>'.
	 * @see WTSpecID.CtrlUnit83#getInput__iManualMode()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Input__iManualMode();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getInput__iSafetyBlock <em>Input iSafety Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSafety Block</em>'.
	 * @see WTSpecID.CtrlUnit83#getInput__iSafetyBlock()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Input__iSafetyBlock();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getOutput__oPinEnable <em>Output oPin Enable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPin Enable</em>'.
	 * @see WTSpecID.CtrlUnit83#getOutput__oPinEnable()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Output__oPinEnable();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getOutput__oPinExtend <em>Output oPin Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPin Extend</em>'.
	 * @see WTSpecID.CtrlUnit83#getOutput__oPinExtend()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Output__oPinExtend();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit83#getOutput__oPinRetract <em>Output oPin Retract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPin Retract</em>'.
	 * @see WTSpecID.CtrlUnit83#getOutput__oPinRetract()
	 * @see #getCtrlUnit83()
	 * @generated
	 */
	EReference getCtrlUnit83_Output__oPinRetract();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit84 <em>Ctrl Unit84</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit84</em>'.
	 * @see WTSpecID.CtrlUnit84
	 * @generated
	 */
	EClass getCtrlUnit84();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getInput__iAngleGH1 <em>Input iAngle GH1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAngle GH1</em>'.
	 * @see WTSpecID.CtrlUnit84#getInput__iAngleGH1()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Input__iAngleGH1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getInput__iAngleGH2 <em>Input iAngle GH2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAngle GH2</em>'.
	 * @see WTSpecID.CtrlUnit84#getInput__iAngleGH2()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Input__iAngleGH2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getInput__iAngleGH3 <em>Input iAngle GH3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAngle GH3</em>'.
	 * @see WTSpecID.CtrlUnit84#getInput__iAngleGH3()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Input__iAngleGH3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getInput__iStopCommand <em>Input iStop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStop Command</em>'.
	 * @see WTSpecID.CtrlUnit84#getInput__iStopCommand()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Input__iStopCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getInput__iFlBrakes <em>Input iFl Brakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iFl Brakes</em>'.
	 * @see WTSpecID.CtrlUnit84#getInput__iFlBrakes()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Input__iFlBrakes();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getOutput__oAngleReference1 <em>Output oAngle Reference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAngle Reference1</em>'.
	 * @see WTSpecID.CtrlUnit84#getOutput__oAngleReference1()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Output__oAngleReference1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getOutput__oAngleReference2 <em>Output oAngle Reference2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAngle Reference2</em>'.
	 * @see WTSpecID.CtrlUnit84#getOutput__oAngleReference2()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Output__oAngleReference2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getOutput__oAngleReference3 <em>Output oAngle Reference3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAngle Reference3</em>'.
	 * @see WTSpecID.CtrlUnit84#getOutput__oAngleReference3()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Output__oAngleReference3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getOutput__oSpeedReference <em>Output oSpeed Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSpeed Reference</em>'.
	 * @see WTSpecID.CtrlUnit84#getOutput__oSpeedReference()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Output__oSpeedReference();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getOutput__oAccelerationReference <em>Output oAcceleration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oAcceleration Reference</em>'.
	 * @see WTSpecID.CtrlUnit84#getOutput__oAccelerationReference()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Output__oAccelerationReference();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getParameter__pPitchBrakeAngle <em>Parameter pPitch Brake Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Brake Angle</em>'.
	 * @see WTSpecID.CtrlUnit84#getParameter__pPitchBrakeAngle()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Parameter__pPitchBrakeAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getParameter__pPitchStdSpeed <em>Parameter pPitch Std Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Std Speed</em>'.
	 * @see WTSpecID.CtrlUnit84#getParameter__pPitchStdSpeed()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Parameter__pPitchStdSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getParameter__pPitchStdAcceleration <em>Parameter pPitch Std Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Std Acceleration</em>'.
	 * @see WTSpecID.CtrlUnit84#getParameter__pPitchStdAcceleration()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Parameter__pPitchStdAcceleration();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getParameter__pPitchRegulationSpeed <em>Parameter pPitch Regulation Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Regulation Speed</em>'.
	 * @see WTSpecID.CtrlUnit84#getParameter__pPitchRegulationSpeed()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Parameter__pPitchRegulationSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getParameter__pPitchRegulationAcceleration <em>Parameter pPitch Regulation Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Regulation Acceleration</em>'.
	 * @see WTSpecID.CtrlUnit84#getParameter__pPitchRegulationAcceleration()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_Parameter__pPitchRegulationAcceleration();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit84#getErrorReaction__erEmergency <em>Error Reaction er Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Emergency</em>'.
	 * @see WTSpecID.CtrlUnit84#getErrorReaction__erEmergency()
	 * @see #getCtrlUnit84()
	 * @generated
	 */
	EReference getCtrlUnit84_ErrorReaction__erEmergency();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit85 <em>Ctrl Unit85</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit85</em>'.
	 * @see WTSpecID.CtrlUnit85
	 * @generated
	 */
	EClass getCtrlUnit85();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getInput__iPitchAngle1 <em>Input iPitch Angle1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Angle1</em>'.
	 * @see WTSpecID.CtrlUnit85#getInput__iPitchAngle1()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Input__iPitchAngle1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getInput__iPitchAngle2 <em>Input iPitch Angle2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Angle2</em>'.
	 * @see WTSpecID.CtrlUnit85#getInput__iPitchAngle2()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Input__iPitchAngle2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getInput__iPitchAngle3 <em>Input iPitch Angle3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Angle3</em>'.
	 * @see WTSpecID.CtrlUnit85#getInput__iPitchAngle3()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Input__iPitchAngle3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getOutput__oPitchBrakePosition <em>Output oPitch Brake Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Brake Position</em>'.
	 * @see WTSpecID.CtrlUnit85#getOutput__oPitchBrakePosition()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Output__oPitchBrakePosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getParameter__pPitchMaxBrakeAngle <em>Parameter pPitch Max Brake Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Max Brake Angle</em>'.
	 * @see WTSpecID.CtrlUnit85#getParameter__pPitchMaxBrakeAngle()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Parameter__pPitchMaxBrakeAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getParameter__pPitchMinBrakeAngle <em>Parameter pPitch Min Brake Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Min Brake Angle</em>'.
	 * @see WTSpecID.CtrlUnit85#getParameter__pPitchMinBrakeAngle()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Parameter__pPitchMinBrakeAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit85#getParameter__pPitchBrakeAngleHysteresis <em>Parameter pPitch Brake Angle Hysteresis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Brake Angle Hysteresis</em>'.
	 * @see WTSpecID.CtrlUnit85#getParameter__pPitchBrakeAngleHysteresis()
	 * @see #getCtrlUnit85()
	 * @generated
	 */
	EReference getCtrlUnit85_Parameter__pPitchBrakeAngleHysteresis();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit86 <em>Ctrl Unit86</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit86</em>'.
	 * @see WTSpecID.CtrlUnit86
	 * @generated
	 */
	EClass getCtrlUnit86();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getInput__iPitchHwStandby <em>Input iPitch Hw Standby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Hw Standby</em>'.
	 * @see WTSpecID.CtrlUnit86#getInput__iPitchHwStandby()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Input__iPitchHwStandby();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getInput__iPitchHwFault <em>Input iPitch Hw Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Hw Fault</em>'.
	 * @see WTSpecID.CtrlUnit86#getInput__iPitchHwFault()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Input__iPitchHwFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getInput__iPitchStopCommand <em>Input iPitch Stop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Stop Command</em>'.
	 * @see WTSpecID.CtrlUnit86#getInput__iPitchStopCommand()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Input__iPitchStopCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getInput__iPitchBrakePosition <em>Input iPitch Brake Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Brake Position</em>'.
	 * @see WTSpecID.CtrlUnit86#getInput__iPitchBrakePosition()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Input__iPitchBrakePosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getOutput__oBrakes <em>Output oBrakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oBrakes</em>'.
	 * @see WTSpecID.CtrlUnit86#getOutput__oBrakes()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Output__oBrakes();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getOutput__oPitchNormalOrder <em>Output oPitch Normal Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Normal Order</em>'.
	 * @see WTSpecID.CtrlUnit86#getOutput__oPitchNormalOrder()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Output__oPitchNormalOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getOutput__oPitchEmergencyOrder <em>Output oPitch Emergency Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Emergency Order</em>'.
	 * @see WTSpecID.CtrlUnit86#getOutput__oPitchEmergencyOrder()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Output__oPitchEmergencyOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getOutput__oPitchTestUCapOrder <em>Output oPitch Test UCap Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Test UCap Order</em>'.
	 * @see WTSpecID.CtrlUnit86#getOutput__oPitchTestUCapOrder()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_Output__oPitchTestUCapOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getErrorReaction__erEmergency <em>Error Reaction er Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Emergency</em>'.
	 * @see WTSpecID.CtrlUnit86#getErrorReaction__erEmergency()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_ErrorReaction__erEmergency();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit86#getErrorReaction__erSecurityLine <em>Error Reaction er Security Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Security Line</em>'.
	 * @see WTSpecID.CtrlUnit86#getErrorReaction__erSecurityLine()
	 * @see #getCtrlUnit86()
	 * @generated
	 */
	EReference getCtrlUnit86_ErrorReaction__erSecurityLine();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit87 <em>Ctrl Unit87</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit87</em>'.
	 * @see WTSpecID.CtrlUnit87
	 * @generated
	 */
	EClass getCtrlUnit87();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit87#getInput__iExternalOrder <em>Input iExternal Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iExternal Order</em>'.
	 * @see WTSpecID.CtrlUnit87#getInput__iExternalOrder()
	 * @see #getCtrlUnit87()
	 * @generated
	 */
	EReference getCtrlUnit87_Input__iExternalOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit87#getInput__iExternalFailure <em>Input iExternal Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iExternal Failure</em>'.
	 * @see WTSpecID.CtrlUnit87#getInput__iExternalFailure()
	 * @see #getCtrlUnit87()
	 * @generated
	 */
	EReference getCtrlUnit87_Input__iExternalFailure();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit87#getOutput__oLubricationOrder <em>Output oLubrication Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oLubrication Order</em>'.
	 * @see WTSpecID.CtrlUnit87#getOutput__oLubricationOrder()
	 * @see #getCtrlUnit87()
	 * @generated
	 */
	EReference getCtrlUnit87_Output__oLubricationOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit87#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit87#getTimer__tDelay()
	 * @see #getCtrlUnit87()
	 * @generated
	 */
	EReference getCtrlUnit87_Timer__tDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit88 <em>Ctrl Unit88</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit88</em>'.
	 * @see WTSpecID.CtrlUnit88
	 * @generated
	 */
	EClass getCtrlUnit88();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getInput__iPthResetCommand <em>Input iPth Reset Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPth Reset Command</em>'.
	 * @see WTSpecID.CtrlUnit88#getInput__iPthResetCommand()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Input__iPthResetCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getInput__iPthResetOrder <em>Input iPth Reset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPth Reset Order</em>'.
	 * @see WTSpecID.CtrlUnit88#getInput__iPthResetOrder()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Input__iPthResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getOutput__oPthResetCommand <em>Output oPth Reset Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPth Reset Command</em>'.
	 * @see WTSpecID.CtrlUnit88#getOutput__oPthResetCommand()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Output__oPthResetCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getOutput__oPthResetOrder <em>Output oPth Reset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPth Reset Order</em>'.
	 * @see WTSpecID.CtrlUnit88#getOutput__oPthResetOrder()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Output__oPthResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getOutput__oPthReset <em>Output oPth Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPth Reset</em>'.
	 * @see WTSpecID.CtrlUnit88#getOutput__oPthReset()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Output__oPthReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getTimer__tResetTimer <em>Timer tReset Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tReset Timer</em>'.
	 * @see WTSpecID.CtrlUnit88#getTimer__tResetTimer()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Timer__tResetTimer();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit88#getTimer__tTimeBetweenResets <em>Timer tTime Between Resets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTime Between Resets</em>'.
	 * @see WTSpecID.CtrlUnit88#getTimer__tTimeBetweenResets()
	 * @see #getCtrlUnit88()
	 * @generated
	 */
	EReference getCtrlUnit88_Timer__tTimeBetweenResets();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit89 <em>Ctrl Unit89</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit89</em>'.
	 * @see WTSpecID.CtrlUnit89
	 * @generated
	 */
	EClass getCtrlUnit89();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iAngleReference1 <em>Input iAngle Reference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAngle Reference1</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iAngleReference1()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iAngleReference1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iAngleReference2 <em>Input iAngle Reference2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAngle Reference2</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iAngleReference2()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iAngleReference2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iAngleReference3 <em>Input iAngle Reference3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAngle Reference3</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iAngleReference3()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iAngleReference3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iSpeedReference <em>Input iSpeed Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSpeed Reference</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iSpeedReference()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iSpeedReference();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iAccelerationReference <em>Input iAcceleration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAcceleration Reference</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iAccelerationReference()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iAccelerationReference();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iPitchManualControl <em>Input iPitch Manual Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Manual Control</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iPitchManualControl()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iPitchManualControl();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iPitchManualAngle <em>Input iPitch Manual Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Manual Angle</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iPitchManualAngle()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iPitchManualAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iMaintenanceStatus <em>Input iMaintenance Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMaintenance Status</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iMaintenanceStatus()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iMaintenanceStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iGeneratorSpeed <em>Input iGenerator Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iGenerator Speed</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iGeneratorSpeed()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iGeneratorSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getInput__iPitchBraked <em>Input iPitch Braked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPitch Braked</em>'.
	 * @see WTSpecID.CtrlUnit89#getInput__iPitchBraked()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Input__iPitchBraked();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getOutput__oPitchAngleRef1 <em>Output oPitch Angle Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Angle Ref1</em>'.
	 * @see WTSpecID.CtrlUnit89#getOutput__oPitchAngleRef1()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Output__oPitchAngleRef1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getOutput__oPitchAngleRef2 <em>Output oPitch Angle Ref2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Angle Ref2</em>'.
	 * @see WTSpecID.CtrlUnit89#getOutput__oPitchAngleRef2()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Output__oPitchAngleRef2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getOutput__oPitchAngleRef3 <em>Output oPitch Angle Ref3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Angle Ref3</em>'.
	 * @see WTSpecID.CtrlUnit89#getOutput__oPitchAngleRef3()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Output__oPitchAngleRef3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getOutput__oPitchSpeedRef <em>Output oPitch Speed Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Speed Ref</em>'.
	 * @see WTSpecID.CtrlUnit89#getOutput__oPitchSpeedRef()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Output__oPitchSpeedRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getOutput__oPitchAccelerationRef <em>Output oPitch Acceleration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Acceleration Ref</em>'.
	 * @see WTSpecID.CtrlUnit89#getOutput__oPitchAccelerationRef()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Output__oPitchAccelerationRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getOutput__oPitchStopCommand <em>Output oPitch Stop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPitch Stop Command</em>'.
	 * @see WTSpecID.CtrlUnit89#getOutput__oPitchStopCommand()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Output__oPitchStopCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getParameter__pGeneratorSpeed <em>Parameter pGenerator Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pGenerator Speed</em>'.
	 * @see WTSpecID.CtrlUnit89#getParameter__pGeneratorSpeed()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Parameter__pGeneratorSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getParameter__pPitchBrakeAngle <em>Parameter pPitch Brake Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Brake Angle</em>'.
	 * @see WTSpecID.CtrlUnit89#getParameter__pPitchBrakeAngle()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Parameter__pPitchBrakeAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getParameter__pPitchStdSpeed <em>Parameter pPitch Std Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Std Speed</em>'.
	 * @see WTSpecID.CtrlUnit89#getParameter__pPitchStdSpeed()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Parameter__pPitchStdSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getParameter__pPitchStdAcceleration <em>Parameter pPitch Std Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPitch Std Acceleration</em>'.
	 * @see WTSpecID.CtrlUnit89#getParameter__pPitchStdAcceleration()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Parameter__pPitchStdAcceleration();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getFault__fManualStop <em>Fault fManual Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fManual Stop</em>'.
	 * @see WTSpecID.CtrlUnit89#getFault__fManualStop()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Fault__fManualStop();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getTimer__tMaxStopOperationLength <em>Timer tMax Stop Operation Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tMax Stop Operation Length</em>'.
	 * @see WTSpecID.CtrlUnit89#getTimer__tMaxStopOperationLength()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_Timer__tMaxStopOperationLength();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit89#getErrorReaction__erStop <em>Error Reaction er Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Stop</em>'.
	 * @see WTSpecID.CtrlUnit89#getErrorReaction__erStop()
	 * @see #getCtrlUnit89()
	 * @generated
	 */
	EReference getCtrlUnit89_ErrorReaction__erStop();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit90 <em>Ctrl Unit90</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit90</em>'.
	 * @see WTSpecID.CtrlUnit90
	 * @generated
	 */
	EClass getCtrlUnit90();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getInput__iStatusR <em>Input iStatus R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStatus R</em>'.
	 * @see WTSpecID.CtrlUnit90#getInput__iStatusR()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Input__iStatusR();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getInput__iStatusS <em>Input iStatus S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStatus S</em>'.
	 * @see WTSpecID.CtrlUnit90#getInput__iStatusS()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Input__iStatusS();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getInput__iStatusT <em>Input iStatus T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStatus T</em>'.
	 * @see WTSpecID.CtrlUnit90#getInput__iStatusT()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Input__iStatusT();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getInput__iValueR <em>Input iValue R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iValue R</em>'.
	 * @see WTSpecID.CtrlUnit90#getInput__iValueR()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Input__iValueR();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getInput__iValueS <em>Input iValue S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iValue S</em>'.
	 * @see WTSpecID.CtrlUnit90#getInput__iValueS()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Input__iValueS();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getInput__iValueT <em>Input iValue T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iValue T</em>'.
	 * @see WTSpecID.CtrlUnit90#getInput__iValueT()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Input__iValueT();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oCosinePhi <em>Output oCosine Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oCosine Phi</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oCosinePhi()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oCosinePhi();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oFrequency <em>Output oFrequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFrequency</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oFrequency()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oFrequency();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oControlR <em>Output oControl R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oControl R</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oControlR()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oControlR();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oControlS <em>Output oControl S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oControl S</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oControlS()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oControlS();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oControlT <em>Output oControl T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oControl T</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oControlT()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oControlT();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oApparentPower <em>Output oApparent Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oApparent Power</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oApparentPower()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oApparentPower();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oVoltageR <em>Output oVoltage R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVoltage R</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oVoltageR()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oVoltageR();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oVoltageS <em>Output oVoltage S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVoltage S</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oVoltageS()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oVoltageS();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oVoltageT <em>Output oVoltage T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oVoltage T</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oVoltageT()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oVoltageT();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oCurrentR <em>Output oCurrent R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oCurrent R</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oCurrentR()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oCurrentR();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oCurrentS <em>Output oCurrent S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oCurrent S</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oCurrentS()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oCurrentS();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getOutput__oCurrentT <em>Output oCurrent T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oCurrent T</em>'.
	 * @see WTSpecID.CtrlUnit90#getOutput__oCurrentT()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Output__oCurrentT();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getParameter__pCurrentFactor <em>Parameter pCurrent Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pCurrent Factor</em>'.
	 * @see WTSpecID.CtrlUnit90#getParameter__pCurrentFactor()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Parameter__pCurrentFactor();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit90#getParameter__pVoltageFactor <em>Parameter pVoltage Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pVoltage Factor</em>'.
	 * @see WTSpecID.CtrlUnit90#getParameter__pVoltageFactor()
	 * @see #getCtrlUnit90()
	 * @generated
	 */
	EReference getCtrlUnit90_Parameter__pVoltageFactor();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit91 <em>Ctrl Unit91</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit91</em>'.
	 * @see WTSpecID.CtrlUnit91
	 * @generated
	 */
	EClass getCtrlUnit91();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit91#getInput__iTemp <em>Input iTemp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTemp</em>'.
	 * @see WTSpecID.CtrlUnit91#getInput__iTemp()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EReference getCtrlUnit91_Input__iTemp();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit91#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit91#getInput__iDontCheckInput()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EReference getCtrlUnit91_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit91#getInput__iLimitError <em>Input iLimit Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLimit Error</em>'.
	 * @see WTSpecID.CtrlUnit91#getInput__iLimitError()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EReference getCtrlUnit91_Input__iLimitError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit91#getParameter__pLimitReset <em>Parameter pLimit Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pLimit Reset</em>'.
	 * @see WTSpecID.CtrlUnit91#getParameter__pLimitReset()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EReference getCtrlUnit91_Parameter__pLimitReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit91#getFault__fError <em>Fault fError</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fError</em>'.
	 * @see WTSpecID.CtrlUnit91#getFault__fError()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EReference getCtrlUnit91_Fault__fError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit91#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit91#getTimer__tDelay()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EReference getCtrlUnit91_Timer__tDelay();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit91#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit91#getBhvParam__bpMode()
	 * @see #getCtrlUnit91()
	 * @generated
	 */
	EAttribute getCtrlUnit91_BhvParam__bpMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit92 <em>Ctrl Unit92</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit92</em>'.
	 * @see WTSpecID.CtrlUnit92
	 * @generated
	 */
	EClass getCtrlUnit92();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit92#getInput__iTemp <em>Input iTemp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTemp</em>'.
	 * @see WTSpecID.CtrlUnit92#getInput__iTemp()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Input__iTemp();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit92#getInput__iDontCheckInput <em>Input iDont Check Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iDont Check Input</em>'.
	 * @see WTSpecID.CtrlUnit92#getInput__iDontCheckInput()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Input__iDontCheckInput();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit92#getParameter__pLimitError <em>Parameter pLimit Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pLimit Error</em>'.
	 * @see WTSpecID.CtrlUnit92#getParameter__pLimitError()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Parameter__pLimitError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit92#getParameter__pLimitReset <em>Parameter pLimit Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pLimit Reset</em>'.
	 * @see WTSpecID.CtrlUnit92#getParameter__pLimitReset()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Parameter__pLimitReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit92#getFault__fError <em>Fault fError</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fError</em>'.
	 * @see WTSpecID.CtrlUnit92#getFault__fError()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EReference getCtrlUnit92_Fault__fError();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit92#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit92#getBhvParam__bpMode()
	 * @see #getCtrlUnit92()
	 * @generated
	 */
	EAttribute getCtrlUnit92_BhvParam__bpMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit93 <em>Ctrl Unit93</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit93</em>'.
	 * @see WTSpecID.CtrlUnit93
	 * @generated
	 */
	EClass getCtrlUnit93();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit93#getInput__iActualVal <em>Input iActual Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iActual Val</em>'.
	 * @see WTSpecID.CtrlUnit93#getInput__iActualVal()
	 * @see #getCtrlUnit93()
	 * @generated
	 */
	EReference getCtrlUnit93_Input__iActualVal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit93#getOutput__oLastVal <em>Output oLast Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oLast Val</em>'.
	 * @see WTSpecID.CtrlUnit93#getOutput__oLastVal()
	 * @see #getCtrlUnit93()
	 * @generated
	 */
	EReference getCtrlUnit93_Output__oLastVal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit93#getParameter__pRateLimiter <em>Parameter pRate Limiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pRate Limiter</em>'.
	 * @see WTSpecID.CtrlUnit93#getParameter__pRateLimiter()
	 * @see #getCtrlUnit93()
	 * @generated
	 */
	EReference getCtrlUnit93_Parameter__pRateLimiter();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit94 <em>Ctrl Unit94</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit94</em>'.
	 * @see WTSpecID.CtrlUnit94
	 * @generated
	 */
	EClass getCtrlUnit94();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit94#getInput__iResetOrder <em>Input iReset Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Order</em>'.
	 * @see WTSpecID.CtrlUnit94#getInput__iResetOrder()
	 * @see #getCtrlUnit94()
	 * @generated
	 */
	EReference getCtrlUnit94_Input__iResetOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit94#getOutput__oValueToReset <em>Output oValue To Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oValue To Reset</em>'.
	 * @see WTSpecID.CtrlUnit94#getOutput__oValueToReset()
	 * @see #getCtrlUnit94()
	 * @generated
	 */
	EReference getCtrlUnit94_Output__oValueToReset();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit95 <em>Ctrl Unit95</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit95</em>'.
	 * @see WTSpecID.CtrlUnit95
	 * @generated
	 */
	EClass getCtrlUnit95();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit95#getInput__iTwistAngle()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getInput__iAccessState <em>Input iAccess State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAccess State</em>'.
	 * @see WTSpecID.CtrlUnit95#getInput__iAccessState()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Input__iAccessState();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getOutput__oTwistAngleLeftLimit <em>Output oTwist Angle Left Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTwist Angle Left Limit</em>'.
	 * @see WTSpecID.CtrlUnit95#getOutput__oTwistAngleLeftLimit()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Output__oTwistAngleLeftLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getOutput__oTwistAngleRightLimit <em>Output oTwist Angle Right Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTwist Angle Right Limit</em>'.
	 * @see WTSpecID.CtrlUnit95#getOutput__oTwistAngleRightLimit()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Output__oTwistAngleRightLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getOutput__oRetwistPreCommand <em>Output oRetwist Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oRetwist Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit95#getOutput__oRetwistPreCommand()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Output__oRetwistPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getFault__fTwistExcessiveCW <em>Fault fTwist Excessive CW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fTwist Excessive CW</em>'.
	 * @see WTSpecID.CtrlUnit95#getFault__fTwistExcessiveCW()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Fault__fTwistExcessiveCW();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit95#getFault__fTwistExcessiveCCW <em>Fault fTwist Excessive CCW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fTwist Excessive CCW</em>'.
	 * @see WTSpecID.CtrlUnit95#getFault__fTwistExcessiveCCW()
	 * @see #getCtrlUnit95()
	 * @generated
	 */
	EReference getCtrlUnit95_Fault__fTwistExcessiveCCW();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit96 <em>Ctrl Unit96</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit96</em>'.
	 * @see WTSpecID.CtrlUnit96
	 * @generated
	 */
	EClass getCtrlUnit96();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit96#getInput__iHMIDisableOrder <em>Input iHMI Disable Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iHMI Disable Order</em>'.
	 * @see WTSpecID.CtrlUnit96#getInput__iHMIDisableOrder()
	 * @see #getCtrlUnit96()
	 * @generated
	 */
	EReference getCtrlUnit96_Input__iHMIDisableOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit96#getInput__iElementStatus <em>Input iElement Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iElement Status</em>'.
	 * @see WTSpecID.CtrlUnit96#getInput__iElementStatus()
	 * @see #getCtrlUnit96()
	 * @generated
	 */
	EReference getCtrlUnit96_Input__iElementStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit96#getOutput__oElementRol <em>Output oElement Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oElement Rol</em>'.
	 * @see WTSpecID.CtrlUnit96#getOutput__oElementRol()
	 * @see #getCtrlUnit96()
	 * @generated
	 */
	EReference getCtrlUnit96_Output__oElementRol();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit96#getParameter__pMaxElements <em>Parameter pMax Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Elements</em>'.
	 * @see WTSpecID.CtrlUnit96#getParameter__pMaxElements()
	 * @see #getCtrlUnit96()
	 * @generated
	 */
	EReference getCtrlUnit96_Parameter__pMaxElements();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit97 <em>Ctrl Unit97</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit97</em>'.
	 * @see WTSpecID.CtrlUnit97
	 * @generated
	 */
	EClass getCtrlUnit97();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit97#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSafety Line General Status</em>'.
	 * @see WTSpecID.CtrlUnit97#getInput__iSafetyLineGeneralStatus()
	 * @see #getCtrlUnit97()
	 * @generated
	 */
	EReference getCtrlUnit97_Input__iSafetyLineGeneralStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit97#getOutput__oDontCheckEmergency <em>Output oDont Check Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oDont Check Emergency</em>'.
	 * @see WTSpecID.CtrlUnit97#getOutput__oDontCheckEmergency()
	 * @see #getCtrlUnit97()
	 * @generated
	 */
	EReference getCtrlUnit97_Output__oDontCheckEmergency();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit97#getFault__fSecLoopOff <em>Fault fSec Loop Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fSec Loop Off</em>'.
	 * @see WTSpecID.CtrlUnit97#getFault__fSecLoopOff()
	 * @see #getCtrlUnit97()
	 * @generated
	 */
	EReference getCtrlUnit97_Fault__fSecLoopOff();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit98 <em>Ctrl Unit98</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit98</em>'.
	 * @see WTSpecID.CtrlUnit98
	 * @generated
	 */
	EClass getCtrlUnit98();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit98#getInput__iSafetyLineStopped <em>Input iSafety Line Stopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSafety Line Stopped</em>'.
	 * @see WTSpecID.CtrlUnit98#getInput__iSafetyLineStopped()
	 * @see #getCtrlUnit98()
	 * @generated
	 */
	EReference getCtrlUnit98_Input__iSafetyLineStopped();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit98#getOutput__oEmergencyRearmCommand <em>Output oEmergency Rearm Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oEmergency Rearm Command</em>'.
	 * @see WTSpecID.CtrlUnit98#getOutput__oEmergencyRearmCommand()
	 * @see #getCtrlUnit98()
	 * @generated
	 */
	EReference getCtrlUnit98_Output__oEmergencyRearmCommand();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit99 <em>Ctrl Unit99</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit99</em>'.
	 * @see WTSpecID.CtrlUnit99
	 * @generated
	 */
	EClass getCtrlUnit99();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit99#getInput__iSafetyLineGeneralStatus <em>Input iSafety Line General Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSafety Line General Status</em>'.
	 * @see WTSpecID.CtrlUnit99#getInput__iSafetyLineGeneralStatus()
	 * @see #getCtrlUnit99()
	 * @generated
	 */
	EReference getCtrlUnit99_Input__iSafetyLineGeneralStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit99#getOutput__oSafetyLineStartCommand <em>Output oSafety Line Start Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSafety Line Start Command</em>'.
	 * @see WTSpecID.CtrlUnit99#getOutput__oSafetyLineStartCommand()
	 * @see #getCtrlUnit99()
	 * @generated
	 */
	EReference getCtrlUnit99_Output__oSafetyLineStartCommand();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit100 <em>Ctrl Unit100</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit100</em>'.
	 * @see WTSpecID.CtrlUnit100
	 * @generated
	 */
	EClass getCtrlUnit100();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit100#getInput__iPinPosition <em>Input iPin Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPin Position</em>'.
	 * @see WTSpecID.CtrlUnit100#getInput__iPinPosition()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EReference getCtrlUnit100_Input__iPinPosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit100#getOutput__oPinSafetyCmd <em>Output oPin Safety Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPin Safety Cmd</em>'.
	 * @see WTSpecID.CtrlUnit100#getOutput__oPinSafetyCmd()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EReference getCtrlUnit100_Output__oPinSafetyCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit100#getParameter__pPinNoBackPos <em>Parameter pPin No Back Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin No Back Pos</em>'.
	 * @see WTSpecID.CtrlUnit100#getParameter__pPinNoBackPos()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EReference getCtrlUnit100_Parameter__pPinNoBackPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit100#getParameter__pPinExtendedPos <em>Parameter pPin Extended Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin Extended Pos</em>'.
	 * @see WTSpecID.CtrlUnit100#getParameter__pPinExtendedPos()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EReference getCtrlUnit100_Parameter__pPinExtendedPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit100#getParameter__pPinRetractedPos <em>Parameter pPin Retracted Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin Retracted Pos</em>'.
	 * @see WTSpecID.CtrlUnit100#getParameter__pPinRetractedPos()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EReference getCtrlUnit100_Parameter__pPinRetractedPos();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit100#getParameter__pPinHysteresis <em>Parameter pPin Hysteresis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pPin Hysteresis</em>'.
	 * @see WTSpecID.CtrlUnit100#getParameter__pPinHysteresis()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EReference getCtrlUnit100_Parameter__pPinHysteresis();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit100#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit100#getBhvParam__bpMode()
	 * @see #getCtrlUnit100()
	 * @generated
	 */
	EAttribute getCtrlUnit100_BhvParam__bpMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit101 <em>Ctrl Unit101</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit101</em>'.
	 * @see WTSpecID.CtrlUnit101
	 * @generated
	 */
	EClass getCtrlUnit101();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit101#getInput__iSpeed <em>Input iSpeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iSpeed</em>'.
	 * @see WTSpecID.CtrlUnit101#getInput__iSpeed()
	 * @see #getCtrlUnit101()
	 * @generated
	 */
	EReference getCtrlUnit101_Input__iSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit101#getInput__iPosition <em>Input iPosition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iPosition</em>'.
	 * @see WTSpecID.CtrlUnit101#getInput__iPosition()
	 * @see #getCtrlUnit101()
	 * @generated
	 */
	EReference getCtrlUnit101_Input__iPosition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit101#getOutput__oSpeed <em>Output oSpeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSpeed</em>'.
	 * @see WTSpecID.CtrlUnit101#getOutput__oSpeed()
	 * @see #getCtrlUnit101()
	 * @generated
	 */
	EReference getCtrlUnit101_Output__oSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit101#getOutput__oSpeedMonitoring <em>Output oSpeed Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSpeed Monitoring</em>'.
	 * @see WTSpecID.CtrlUnit101#getOutput__oSpeedMonitoring()
	 * @see #getCtrlUnit101()
	 * @generated
	 */
	EReference getCtrlUnit101_Output__oSpeedMonitoring();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit101#getParameter__pOffset <em>Parameter pOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pOffset</em>'.
	 * @see WTSpecID.CtrlUnit101#getParameter__pOffset()
	 * @see #getCtrlUnit101()
	 * @generated
	 */
	EReference getCtrlUnit101_Parameter__pOffset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit101#getParameter__pConversionFactor <em>Parameter pConversion Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pConversion Factor</em>'.
	 * @see WTSpecID.CtrlUnit101#getParameter__pConversionFactor()
	 * @see #getCtrlUnit101()
	 * @generated
	 */
	EReference getCtrlUnit101_Parameter__pConversionFactor();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit102 <em>Ctrl Unit102</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit102</em>'.
	 * @see WTSpecID.CtrlUnit102
	 * @generated
	 */
	EClass getCtrlUnit102();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit102#getInput__iOriginalStatus <em>Input iOriginal Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOriginal Status</em>'.
	 * @see WTSpecID.CtrlUnit102#getInput__iOriginalStatus()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Input__iOriginalStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit102#getInput__iResetRequest <em>Input iReset Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Request</em>'.
	 * @see WTSpecID.CtrlUnit102#getInput__iResetRequest()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Input__iResetRequest();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit102#getOutput__oFilteredStatus <em>Output oFiltered Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFiltered Status</em>'.
	 * @see WTSpecID.CtrlUnit102#getOutput__oFilteredStatus()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Output__oFilteredStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit102#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit102#getFault__fFault()
	 * @see #getCtrlUnit102()
	 * @generated
	 */
	EReference getCtrlUnit102_Fault__fFault();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit103 <em>Ctrl Unit103</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit103</em>'.
	 * @see WTSpecID.CtrlUnit103
	 * @generated
	 */
	EClass getCtrlUnit103();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit103#getInput__iInput1 <em>Input iInput1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput1</em>'.
	 * @see WTSpecID.CtrlUnit103#getInput__iInput1()
	 * @see #getCtrlUnit103()
	 * @generated
	 */
	EReference getCtrlUnit103_Input__iInput1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit103#getInput__iInput2 <em>Input iInput2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInput2</em>'.
	 * @see WTSpecID.CtrlUnit103#getInput__iInput2()
	 * @see #getCtrlUnit103()
	 * @generated
	 */
	EReference getCtrlUnit103_Input__iInput2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit103#getOutput__oResult <em>Output oResult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oResult</em>'.
	 * @see WTSpecID.CtrlUnit103#getOutput__oResult()
	 * @see #getCtrlUnit103()
	 * @generated
	 */
	EReference getCtrlUnit103_Output__oResult();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit104 <em>Ctrl Unit104</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit104</em>'.
	 * @see WTSpecID.CtrlUnit104
	 * @generated
	 */
	EClass getCtrlUnit104();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit104#getInput__iOrder <em>Input iOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder</em>'.
	 * @see WTSpecID.CtrlUnit104#getInput__iOrder()
	 * @see #getCtrlUnit104()
	 * @generated
	 */
	EReference getCtrlUnit104_Input__iOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit104#getOutput__oOrder <em>Output oOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOrder</em>'.
	 * @see WTSpecID.CtrlUnit104#getOutput__oOrder()
	 * @see #getCtrlUnit104()
	 * @generated
	 */
	EReference getCtrlUnit104_Output__oOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit104#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit104#getTimer__tTimer()
	 * @see #getCtrlUnit104()
	 * @generated
	 */
	EReference getCtrlUnit104_Timer__tTimer();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit104#getTimer__tDelay <em>Timer tDelay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay</em>'.
	 * @see WTSpecID.CtrlUnit104#getTimer__tDelay()
	 * @see #getCtrlUnit104()
	 * @generated
	 */
	EReference getCtrlUnit104_Timer__tDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit105 <em>Ctrl Unit105</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit105</em>'.
	 * @see WTSpecID.CtrlUnit105
	 * @generated
	 */
	EClass getCtrlUnit105();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit105#getInput__iEntryToCount <em>Input iEntry To Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iEntry To Count</em>'.
	 * @see WTSpecID.CtrlUnit105#getInput__iEntryToCount()
	 * @see #getCtrlUnit105()
	 * @generated
	 */
	EReference getCtrlUnit105_Input__iEntryToCount();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit105#getInput__iResetPartial <em>Input iReset Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iReset Partial</em>'.
	 * @see WTSpecID.CtrlUnit105#getInput__iResetPartial()
	 * @see #getCtrlUnit105()
	 * @generated
	 */
	EReference getCtrlUnit105_Input__iResetPartial();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit105#getOutput__oSecondsOnTotal <em>Output oSeconds On Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSeconds On Total</em>'.
	 * @see WTSpecID.CtrlUnit105#getOutput__oSecondsOnTotal()
	 * @see #getCtrlUnit105()
	 * @generated
	 */
	EReference getCtrlUnit105_Output__oSecondsOnTotal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit105#getOutput__oSecondsOnPartial <em>Output oSeconds On Partial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSeconds On Partial</em>'.
	 * @see WTSpecID.CtrlUnit105#getOutput__oSecondsOnPartial()
	 * @see #getCtrlUnit105()
	 * @generated
	 */
	EReference getCtrlUnit105_Output__oSecondsOnPartial();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit106 <em>Ctrl Unit106</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit106</em>'.
	 * @see WTSpecID.CtrlUnit106
	 * @generated
	 */
	EClass getCtrlUnit106();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit106#getInput__i1 <em>Input i1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input i1</em>'.
	 * @see WTSpecID.CtrlUnit106#getInput__i1()
	 * @see #getCtrlUnit106()
	 * @generated
	 */
	EReference getCtrlUnit106_Input__i1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit106#getOutput__o1 <em>Output o1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output o1</em>'.
	 * @see WTSpecID.CtrlUnit106#getOutput__o1()
	 * @see #getCtrlUnit106()
	 * @generated
	 */
	EReference getCtrlUnit106_Output__o1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit106#getTimer__t1 <em>Timer t1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer t1</em>'.
	 * @see WTSpecID.CtrlUnit106#getTimer__t1()
	 * @see #getCtrlUnit106()
	 * @generated
	 */
	EReference getCtrlUnit106_Timer__t1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit106#getTimer__t2 <em>Timer t2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer t2</em>'.
	 * @see WTSpecID.CtrlUnit106#getTimer__t2()
	 * @see #getCtrlUnit106()
	 * @generated
	 */
	EReference getCtrlUnit106_Timer__t2();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit106#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit106#getBhvParam__bpMode()
	 * @see #getCtrlUnit106()
	 * @generated
	 */
	EAttribute getCtrlUnit106_BhvParam__bpMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit107 <em>Ctrl Unit107</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit107</em>'.
	 * @see WTSpecID.CtrlUnit107
	 * @generated
	 */
	EClass getCtrlUnit107();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit107#getFault__fDLLWarning <em>Fault fDLL Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fDLL Warning</em>'.
	 * @see WTSpecID.CtrlUnit107#getFault__fDLLWarning()
	 * @see #getCtrlUnit107()
	 * @generated
	 */
	EReference getCtrlUnit107_Fault__fDLLWarning();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit107#getFault__fDLLError <em>Fault fDLL Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fDLL Error</em>'.
	 * @see WTSpecID.CtrlUnit107#getFault__fDLLError()
	 * @see #getCtrlUnit107()
	 * @generated
	 */
	EReference getCtrlUnit107_Fault__fDLLError();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit108 <em>Ctrl Unit108</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit108</em>'.
	 * @see WTSpecID.CtrlUnit108
	 * @generated
	 */
	EClass getCtrlUnit108();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit108#getInput__iVoltageDrop <em>Input iVoltage Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iVoltage Drop</em>'.
	 * @see WTSpecID.CtrlUnit108#getInput__iVoltageDrop()
	 * @see #getCtrlUnit108()
	 * @generated
	 */
	EReference getCtrlUnit108_Input__iVoltageDrop();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit108#getFault__fVoltageDrop <em>Fault fVoltage Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fVoltage Drop</em>'.
	 * @see WTSpecID.CtrlUnit108#getFault__fVoltageDrop()
	 * @see #getCtrlUnit108()
	 * @generated
	 */
	EReference getCtrlUnit108_Fault__fVoltageDrop();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit108#getTimer__tAutoReset <em>Timer tAuto Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tAuto Reset</em>'.
	 * @see WTSpecID.CtrlUnit108#getTimer__tAutoReset()
	 * @see #getCtrlUnit108()
	 * @generated
	 */
	EReference getCtrlUnit108_Timer__tAutoReset();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit109 <em>Ctrl Unit109</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit109</em>'.
	 * @see WTSpecID.CtrlUnit109
	 * @generated
	 */
	EClass getCtrlUnit109();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit109#getInput__iInvHwRun <em>Input iInv Hw Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInv Hw Run</em>'.
	 * @see WTSpecID.CtrlUnit109#getInput__iInvHwRun()
	 * @see #getCtrlUnit109()
	 * @generated
	 */
	EReference getCtrlUnit109_Input__iInvHwRun();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit109#getInput__iVoltageDrop <em>Input iVoltage Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iVoltage Drop</em>'.
	 * @see WTSpecID.CtrlUnit109#getInput__iVoltageDrop()
	 * @see #getCtrlUnit109()
	 * @generated
	 */
	EReference getCtrlUnit109_Input__iVoltageDrop();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit109#getInput__iTorqueDemand <em>Input iTorque Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTorque Demand</em>'.
	 * @see WTSpecID.CtrlUnit109#getInput__iTorqueDemand()
	 * @see #getCtrlUnit109()
	 * @generated
	 */
	EReference getCtrlUnit109_Input__iTorqueDemand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit109#getInput__iInvStopOrder <em>Input iInv Stop Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInv Stop Order</em>'.
	 * @see WTSpecID.CtrlUnit109#getInput__iInvStopOrder()
	 * @see #getCtrlUnit109()
	 * @generated
	 */
	EReference getCtrlUnit109_Input__iInvStopOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit109#getOutput__oTorqueReference <em>Output oTorque Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTorque Reference</em>'.
	 * @see WTSpecID.CtrlUnit109#getOutput__oTorqueReference()
	 * @see #getCtrlUnit109()
	 * @generated
	 */
	EReference getCtrlUnit109_Output__oTorqueReference();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit109#getErrorReaction__erStop <em>Error Reaction er Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Reaction er Stop</em>'.
	 * @see WTSpecID.CtrlUnit109#getErrorReaction__erStop()
	 * @see #getCtrlUnit109()
	 * @generated
	 */
	EReference getCtrlUnit109_ErrorReaction__erStop();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit110 <em>Ctrl Unit110</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit110</em>'.
	 * @see WTSpecID.CtrlUnit110
	 * @generated
	 */
	EClass getCtrlUnit110();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit110#getInput__iManualStopRequest <em>Input iManual Stop Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual Stop Request</em>'.
	 * @see WTSpecID.CtrlUnit110#getInput__iManualStopRequest()
	 * @see #getCtrlUnit110()
	 * @generated
	 */
	EReference getCtrlUnit110_Input__iManualStopRequest();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit110#getInput__iRemoteStopRequest <em>Input iRemote Stop Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRemote Stop Request</em>'.
	 * @see WTSpecID.CtrlUnit110#getInput__iRemoteStopRequest()
	 * @see #getCtrlUnit110()
	 * @generated
	 */
	EReference getCtrlUnit110_Input__iRemoteStopRequest();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit110#getInput__iManualStartRequest <em>Input iManual Start Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual Start Request</em>'.
	 * @see WTSpecID.CtrlUnit110#getInput__iManualStartRequest()
	 * @see #getCtrlUnit110()
	 * @generated
	 */
	EReference getCtrlUnit110_Input__iManualStartRequest();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit110#getInput__iRemoteStartRequest <em>Input iRemote Start Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRemote Start Request</em>'.
	 * @see WTSpecID.CtrlUnit110#getInput__iRemoteStartRequest()
	 * @see #getCtrlUnit110()
	 * @generated
	 */
	EReference getCtrlUnit110_Input__iRemoteStartRequest();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit110#getInput__iStopped <em>Input iStopped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iStopped</em>'.
	 * @see WTSpecID.CtrlUnit110#getInput__iStopped()
	 * @see #getCtrlUnit110()
	 * @generated
	 */
	EReference getCtrlUnit110_Input__iStopped();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit110#getOutput__oMachineStopOrder <em>Output oMachine Stop Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMachine Stop Order</em>'.
	 * @see WTSpecID.CtrlUnit110#getOutput__oMachineStopOrder()
	 * @see #getCtrlUnit110()
	 * @generated
	 */
	EReference getCtrlUnit110_Output__oMachineStopOrder();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit111 <em>Ctrl Unit111</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit111</em>'.
	 * @see WTSpecID.CtrlUnit111
	 * @generated
	 */
	EClass getCtrlUnit111();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit111#getInput__iOrder <em>Input iOrder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOrder</em>'.
	 * @see WTSpecID.CtrlUnit111#getInput__iOrder()
	 * @see #getCtrlUnit111()
	 * @generated
	 */
	EReference getCtrlUnit111_Input__iOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit111#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit111#getTimer__tTimer()
	 * @see #getCtrlUnit111()
	 * @generated
	 */
	EReference getCtrlUnit111_Timer__tTimer();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit111#getBhvParam__bpMode <em>Bhv Param bp Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Mode</em>'.
	 * @see WTSpecID.CtrlUnit111#getBhvParam__bpMode()
	 * @see #getCtrlUnit111()
	 * @generated
	 */
	EAttribute getCtrlUnit111_BhvParam__bpMode();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit112 <em>Ctrl Unit112</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit112</em>'.
	 * @see WTSpecID.CtrlUnit112
	 * @generated
	 */
	EClass getCtrlUnit112();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit112#getOutput__oChangeCmd <em>Output oChange Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oChange Cmd</em>'.
	 * @see WTSpecID.CtrlUnit112#getOutput__oChangeCmd()
	 * @see #getCtrlUnit112()
	 * @generated
	 */
	EReference getCtrlUnit112_Output__oChangeCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit112#getOutput__oPersistentDay <em>Output oPersistent Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oPersistent Day</em>'.
	 * @see WTSpecID.CtrlUnit112#getOutput__oPersistentDay()
	 * @see #getCtrlUnit112()
	 * @generated
	 */
	EReference getCtrlUnit112_Output__oPersistentDay();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit112#getParameter__pDayChange <em>Parameter pDay Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDay Change</em>'.
	 * @see WTSpecID.CtrlUnit112#getParameter__pDayChange()
	 * @see #getCtrlUnit112()
	 * @generated
	 */
	EReference getCtrlUnit112_Parameter__pDayChange();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit113 <em>Ctrl Unit113</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit113</em>'.
	 * @see WTSpecID.CtrlUnit113
	 * @generated
	 */
	EClass getCtrlUnit113();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getInput__iWindSpeed <em>Input iWind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Speed</em>'.
	 * @see WTSpecID.CtrlUnit113#getInput__iWindSpeed()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Input__iWindSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getInput__iWindSpeedAverage <em>Input iWind Speed Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Speed Average</em>'.
	 * @see WTSpecID.CtrlUnit113#getInput__iWindSpeedAverage()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Input__iWindSpeedAverage();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getOutput__oExcessiveWindAcceleration <em>Output oExcessive Wind Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oExcessive Wind Acceleration</em>'.
	 * @see WTSpecID.CtrlUnit113#getOutput__oExcessiveWindAcceleration()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Output__oExcessiveWindAcceleration();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getParameter__pConsideredTime <em>Parameter pConsidered Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pConsidered Time</em>'.
	 * @see WTSpecID.CtrlUnit113#getParameter__pConsideredTime()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Parameter__pConsideredTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getParameter__pWindAccelerationLimit <em>Parameter pWind Acceleration Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pWind Acceleration Limit</em>'.
	 * @see WTSpecID.CtrlUnit113#getParameter__pWindAccelerationLimit()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Parameter__pWindAccelerationLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getParameter__pHiWindLimitReset <em>Parameter pHi Wind Limit Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pHi Wind Limit Reset</em>'.
	 * @see WTSpecID.CtrlUnit113#getParameter__pHiWindLimitReset()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Parameter__pHiWindLimitReset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit113#getParameter__pMaxAbsoluteWindSpeed <em>Parameter pMax Absolute Wind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Absolute Wind Speed</em>'.
	 * @see WTSpecID.CtrlUnit113#getParameter__pMaxAbsoluteWindSpeed()
	 * @see #getCtrlUnit113()
	 * @generated
	 */
	EReference getCtrlUnit113_Parameter__pMaxAbsoluteWindSpeed();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit114 <em>Ctrl Unit114</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit114</em>'.
	 * @see WTSpecID.CtrlUnit114
	 * @generated
	 */
	EClass getCtrlUnit114();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getInput__iWindDirectionRaw <em>Input iWind Direction Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Direction Raw</em>'.
	 * @see WTSpecID.CtrlUnit114#getInput__iWindDirectionRaw()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Input__iWindDirectionRaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getInput__iNacelleDirection <em>Input iNacelle Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iNacelle Direction</em>'.
	 * @see WTSpecID.CtrlUnit114#getInput__iNacelleDirection()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Input__iNacelleDirection();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getOutput__oWindDirection <em>Output oWind Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWind Direction</em>'.
	 * @see WTSpecID.CtrlUnit114#getOutput__oWindDirection()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Output__oWindDirection();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getOutput__oWindDirectionAverage <em>Output oWind Direction Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWind Direction Average</em>'.
	 * @see WTSpecID.CtrlUnit114#getOutput__oWindDirectionAverage()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Output__oWindDirectionAverage();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getOutput__oWindDirectionDispAbsolute <em>Output oWind Direction Disp Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWind Direction Disp Absolute</em>'.
	 * @see WTSpecID.CtrlUnit114#getOutput__oWindDirectionDispAbsolute()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Output__oWindDirectionDispAbsolute();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getOutput__oWindDirectionDispRelative <em>Output oWind Direction Disp Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWind Direction Disp Relative</em>'.
	 * @see WTSpecID.CtrlUnit114#getOutput__oWindDirectionDispRelative()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Output__oWindDirectionDispRelative();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit114#getParameter__pVaneOffset <em>Parameter pVane Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pVane Offset</em>'.
	 * @see WTSpecID.CtrlUnit114#getParameter__pVaneOffset()
	 * @see #getCtrlUnit114()
	 * @generated
	 */
	EReference getCtrlUnit114_Parameter__pVaneOffset();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit115 <em>Ctrl Unit115</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit115</em>'.
	 * @see WTSpecID.CtrlUnit115
	 * @generated
	 */
	EClass getCtrlUnit115();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit115#getInput__iWindSpeedRaw <em>Input iWind Speed Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Speed Raw</em>'.
	 * @see WTSpecID.CtrlUnit115#getInput__iWindSpeedRaw()
	 * @see #getCtrlUnit115()
	 * @generated
	 */
	EReference getCtrlUnit115_Input__iWindSpeedRaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit115#getOutput__oWindSpeed <em>Output oWind Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWind Speed</em>'.
	 * @see WTSpecID.CtrlUnit115#getOutput__oWindSpeed()
	 * @see #getCtrlUnit115()
	 * @generated
	 */
	EReference getCtrlUnit115_Output__oWindSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit115#getOutput__oWindSpeedAverage <em>Output oWind Speed Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oWind Speed Average</em>'.
	 * @see WTSpecID.CtrlUnit115#getOutput__oWindSpeedAverage()
	 * @see #getCtrlUnit115()
	 * @generated
	 */
	EReference getCtrlUnit115_Output__oWindSpeedAverage();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit115#getParameter__pNacelleSlope <em>Parameter pNacelle Slope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pNacelle Slope</em>'.
	 * @see WTSpecID.CtrlUnit115#getParameter__pNacelleSlope()
	 * @see #getCtrlUnit115()
	 * @generated
	 */
	EReference getCtrlUnit115_Parameter__pNacelleSlope();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit115#getParameter__pNacelleOffset <em>Parameter pNacelle Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pNacelle Offset</em>'.
	 * @see WTSpecID.CtrlUnit115#getParameter__pNacelleOffset()
	 * @see #getCtrlUnit115()
	 * @generated
	 */
	EReference getCtrlUnit115_Parameter__pNacelleOffset();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit115#getParameter__pWindSpeedAveragePeriod <em>Parameter pWind Speed Average Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pWind Speed Average Period</em>'.
	 * @see WTSpecID.CtrlUnit115#getParameter__pWindSpeedAveragePeriod()
	 * @see #getCtrlUnit115()
	 * @generated
	 */
	EReference getCtrlUnit115_Parameter__pWindSpeedAveragePeriod();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit116 <em>Ctrl Unit116</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit116</em>'.
	 * @see WTSpecID.CtrlUnit116
	 * @generated
	 */
	EClass getCtrlUnit116();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit116#getInput__iInhibitAutoYawCondition <em>Input iInhibit Auto Yaw Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInhibit Auto Yaw Condition</em>'.
	 * @see WTSpecID.CtrlUnit116#getInput__iInhibitAutoYawCondition()
	 * @see #getCtrlUnit116()
	 * @generated
	 */
	EReference getCtrlUnit116_Input__iInhibitAutoYawCondition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit116#getInput__iInhibitYawCondition <em>Input iInhibit Yaw Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInhibit Yaw Condition</em>'.
	 * @see WTSpecID.CtrlUnit116#getInput__iInhibitYawCondition()
	 * @see #getCtrlUnit116()
	 * @generated
	 */
	EReference getCtrlUnit116_Input__iInhibitYawCondition();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit116#getOutput__oInhibitAutoYaw <em>Output oInhibit Auto Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInhibit Auto Yaw</em>'.
	 * @see WTSpecID.CtrlUnit116#getOutput__oInhibitAutoYaw()
	 * @see #getCtrlUnit116()
	 * @generated
	 */
	EReference getCtrlUnit116_Output__oInhibitAutoYaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit116#getOutput__oInhibitYaw <em>Output oInhibit Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oInhibit Yaw</em>'.
	 * @see WTSpecID.CtrlUnit116#getOutput__oInhibitYaw()
	 * @see #getCtrlUnit116()
	 * @generated
	 */
	EReference getCtrlUnit116_Output__oInhibitYaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit116#getOutput__oYawStatus <em>Output oYaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Status</em>'.
	 * @see WTSpecID.CtrlUnit116#getOutput__oYawStatus()
	 * @see #getCtrlUnit116()
	 * @generated
	 */
	EReference getCtrlUnit116_Output__oYawStatus();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit117 <em>Ctrl Unit117</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit117</em>'.
	 * @see WTSpecID.CtrlUnit117
	 * @generated
	 */
	EClass getCtrlUnit117();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getInput__iYawBrakeCommand <em>Input iYaw Brake Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Brake Command</em>'.
	 * @see WTSpecID.CtrlUnit117#getInput__iYawBrakeCommand()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Input__iYawBrakeCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getInput__iYawElectrobrakeStatus <em>Input iYaw Electrobrake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Electrobrake Status</em>'.
	 * @see WTSpecID.CtrlUnit117#getInput__iYawElectrobrakeStatus()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Input__iYawElectrobrakeStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getInput__iYawHydraulicbrakeStatus <em>Input iYaw Hydraulicbrake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Hydraulicbrake Status</em>'.
	 * @see WTSpecID.CtrlUnit117#getInput__iYawHydraulicbrakeStatus()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Input__iYawHydraulicbrakeStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getInput__iInhibitYaw <em>Input iInhibit Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInhibit Yaw</em>'.
	 * @see WTSpecID.CtrlUnit117#getInput__iInhibitYaw()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Input__iInhibitYaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getOutput__oYawBrakeStatus <em>Output oYaw Brake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Brake Status</em>'.
	 * @see WTSpecID.CtrlUnit117#getOutput__oYawBrakeStatus()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Output__oYawBrakeStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getOutput__oYawElectrobrakeOrder <em>Output oYaw Electrobrake Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Electrobrake Order</em>'.
	 * @see WTSpecID.CtrlUnit117#getOutput__oYawElectrobrakeOrder()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Output__oYawElectrobrakeOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getOutput__oYawHydraulicbrakeOrder <em>Output oYaw Hydraulicbrake Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Hydraulicbrake Order</em>'.
	 * @see WTSpecID.CtrlUnit117#getOutput__oYawHydraulicbrakeOrder()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Output__oYawHydraulicbrakeOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getOutput__oBrakesSetProblem <em>Output oBrakes Set Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oBrakes Set Problem</em>'.
	 * @see WTSpecID.CtrlUnit117#getOutput__oBrakesSetProblem()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Output__oBrakesSetProblem();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getOutput__oBrakesLiftedProblem <em>Output oBrakes Lifted Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oBrakes Lifted Problem</em>'.
	 * @see WTSpecID.CtrlUnit117#getOutput__oBrakesLiftedProblem()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Output__oBrakesLiftedProblem();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit117#getTimer__tYawBrakeActionsDelay <em>Timer tYaw Brake Actions Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tYaw Brake Actions Delay</em>'.
	 * @see WTSpecID.CtrlUnit117#getTimer__tYawBrakeActionsDelay()
	 * @see #getCtrlUnit117()
	 * @generated
	 */
	EReference getCtrlUnit117_Timer__tYawBrakeActionsDelay();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit118 <em>Ctrl Unit118</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit118</em>'.
	 * @see WTSpecID.CtrlUnit118
	 * @generated
	 */
	EClass getCtrlUnit118();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit118#getInput__iYawBrakeStatus <em>Input iYaw Brake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Brake Status</em>'.
	 * @see WTSpecID.CtrlUnit118#getInput__iYawBrakeStatus()
	 * @see #getCtrlUnit118()
	 * @generated
	 */
	EReference getCtrlUnit118_Input__iYawBrakeStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit118#getInput__iRetwistPreCommand <em>Input iRetwist Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRetwist Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit118#getInput__iRetwistPreCommand()
	 * @see #getCtrlUnit118()
	 * @generated
	 */
	EReference getCtrlUnit118_Input__iRetwistPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit118#getInput__iYawBrakeCommand <em>Input iYaw Brake Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Brake Command</em>'.
	 * @see WTSpecID.CtrlUnit118#getInput__iYawBrakeCommand()
	 * @see #getCtrlUnit118()
	 * @generated
	 */
	EReference getCtrlUnit118_Input__iYawBrakeCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit118#getOutput__oYawHydraulicbrake2Order <em>Output oYaw Hydraulicbrake2 Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Hydraulicbrake2 Order</em>'.
	 * @see WTSpecID.CtrlUnit118#getOutput__oYawHydraulicbrake2Order()
	 * @see #getCtrlUnit118()
	 * @generated
	 */
	EReference getCtrlUnit118_Output__oYawHydraulicbrake2Order();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit119 <em>Ctrl Unit119</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit119</em>'.
	 * @see WTSpecID.CtrlUnit119
	 * @generated
	 */
	EClass getCtrlUnit119();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit119#getInput__iManualYawBrakePreCommand <em>Input iManual Yaw Brake Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual Yaw Brake Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit119#getInput__iManualYawBrakePreCommand()
	 * @see #getCtrlUnit119()
	 * @generated
	 */
	EReference getCtrlUnit119_Input__iManualYawBrakePreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit119#getInput__iAutoYawBrakePreCommand <em>Input iAuto Yaw Brake Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iAuto Yaw Brake Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit119#getInput__iAutoYawBrakePreCommand()
	 * @see #getCtrlUnit119()
	 * @generated
	 */
	EReference getCtrlUnit119_Input__iAutoYawBrakePreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit119#getOutput__oYawBrakeCommand <em>Output oYaw Brake Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Brake Command</em>'.
	 * @see WTSpecID.CtrlUnit119#getOutput__oYawBrakeCommand()
	 * @see #getCtrlUnit119()
	 * @generated
	 */
	EReference getCtrlUnit119_Output__oYawBrakeCommand();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit120 <em>Ctrl Unit120</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit120</em>'.
	 * @see WTSpecID.CtrlUnit120
	 * @generated
	 */
	EClass getCtrlUnit120();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit120#getInput__iYawCwFinalButton <em>Input iYaw Cw Final Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Cw Final Button</em>'.
	 * @see WTSpecID.CtrlUnit120#getInput__iYawCwFinalButton()
	 * @see #getCtrlUnit120()
	 * @generated
	 */
	EReference getCtrlUnit120_Input__iYawCwFinalButton();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit120#getInput__iYawCcwFinalButton <em>Input iYaw Ccw Final Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Ccw Final Button</em>'.
	 * @see WTSpecID.CtrlUnit120#getInput__iYawCcwFinalButton()
	 * @see #getCtrlUnit120()
	 * @generated
	 */
	EReference getCtrlUnit120_Input__iYawCcwFinalButton();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit120#getOutput__oManualYawPreCommand <em>Output oManual Yaw Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oManual Yaw Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit120#getOutput__oManualYawPreCommand()
	 * @see #getCtrlUnit120()
	 * @generated
	 */
	EReference getCtrlUnit120_Output__oManualYawPreCommand();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit121 <em>Ctrl Unit121</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit121</em>'.
	 * @see WTSpecID.CtrlUnit121
	 * @generated
	 */
	EClass getCtrlUnit121();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit121#getInput__iManualYawPreCommand <em>Input iManual Yaw Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iManual Yaw Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit121#getInput__iManualYawPreCommand()
	 * @see #getCtrlUnit121()
	 * @generated
	 */
	EReference getCtrlUnit121_Input__iManualYawPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit121#getInput__iMaxTwistPreCommand <em>Input iMax Twist Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iMax Twist Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit121#getInput__iMaxTwistPreCommand()
	 * @see #getCtrlUnit121()
	 * @generated
	 */
	EReference getCtrlUnit121_Input__iMaxTwistPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit121#getInput__iRetwistPreCommand <em>Input iRetwist Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRetwist Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit121#getInput__iRetwistPreCommand()
	 * @see #getCtrlUnit121()
	 * @generated
	 */
	EReference getCtrlUnit121_Input__iRetwistPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit121#getInput__iRelWindPreCommand <em>Input iRel Wind Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRel Wind Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit121#getInput__iRelWindPreCommand()
	 * @see #getCtrlUnit121()
	 * @generated
	 */
	EReference getCtrlUnit121_Input__iRelWindPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit121#getOutput__oYawCommand <em>Output oYaw Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Command</em>'.
	 * @see WTSpecID.CtrlUnit121#getOutput__oYawCommand()
	 * @see #getCtrlUnit121()
	 * @generated
	 */
	EReference getCtrlUnit121_Output__oYawCommand();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit122 <em>Ctrl Unit122</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit122</em>'.
	 * @see WTSpecID.CtrlUnit122
	 * @generated
	 */
	EClass getCtrlUnit122();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getInput__iYawCommand <em>Input iYaw Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Command</em>'.
	 * @see WTSpecID.CtrlUnit122#getInput__iYawCommand()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Input__iYawCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getInput__iYawBrakeStatus <em>Input iYaw Brake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Brake Status</em>'.
	 * @see WTSpecID.CtrlUnit122#getInput__iYawBrakeStatus()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Input__iYawBrakeStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getInput__iInhibitYaw <em>Input iInhibit Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInhibit Yaw</em>'.
	 * @see WTSpecID.CtrlUnit122#getInput__iInhibitYaw()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Input__iInhibitYaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getOutput__oYawStatus <em>Output oYaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Status</em>'.
	 * @see WTSpecID.CtrlUnit122#getOutput__oYawStatus()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Output__oYawStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getOutput__oYawBrakeCommand <em>Output oYaw Brake Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Brake Command</em>'.
	 * @see WTSpecID.CtrlUnit122#getOutput__oYawBrakeCommand()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Output__oYawBrakeCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getOutput__oYawCwOrder <em>Output oYaw Cw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Cw Order</em>'.
	 * @see WTSpecID.CtrlUnit122#getOutput__oYawCwOrder()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Output__oYawCwOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getOutput__oYawCcwOrder <em>Output oYaw Ccw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Ccw Order</em>'.
	 * @see WTSpecID.CtrlUnit122#getOutput__oYawCcwOrder()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Output__oYawCcwOrder();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getTimer__tDelayYawingControl <em>Timer tDelay Yawing Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay Yawing Control</em>'.
	 * @see WTSpecID.CtrlUnit122#getTimer__tDelayYawingControl()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Timer__tDelayYawingControl();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit122#getTimer__tDelayYawingToStop <em>Timer tDelay Yawing To Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tDelay Yawing To Stop</em>'.
	 * @see WTSpecID.CtrlUnit122#getTimer__tDelayYawingToStop()
	 * @see #getCtrlUnit122()
	 * @generated
	 */
	EReference getCtrlUnit122_Timer__tDelayYawingToStop();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit123 <em>Ctrl Unit123</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit123</em>'.
	 * @see WTSpecID.CtrlUnit123
	 * @generated
	 */
	EClass getCtrlUnit123();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit123#getInput__iUpperStatus <em>Input iUpper Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iUpper Status</em>'.
	 * @see WTSpecID.CtrlUnit123#getInput__iUpperStatus()
	 * @see #getCtrlUnit123()
	 * @generated
	 */
	EReference getCtrlUnit123_Input__iUpperStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit123#getInput__iLowerStatus <em>Input iLower Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLower Status</em>'.
	 * @see WTSpecID.CtrlUnit123#getInput__iLowerStatus()
	 * @see #getCtrlUnit123()
	 * @generated
	 */
	EReference getCtrlUnit123_Input__iLowerStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit123#getOutput__oBrakeStatus <em>Output oBrake Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oBrake Status</em>'.
	 * @see WTSpecID.CtrlUnit123#getOutput__oBrakeStatus()
	 * @see #getCtrlUnit123()
	 * @generated
	 */
	EReference getCtrlUnit123_Output__oBrakeStatus();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit124 <em>Ctrl Unit124</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit124</em>'.
	 * @see WTSpecID.CtrlUnit124
	 * @generated
	 */
	EClass getCtrlUnit124();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit124#getInput__iTorqueVal <em>Input iTorque Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTorque Val</em>'.
	 * @see WTSpecID.CtrlUnit124#getInput__iTorqueVal()
	 * @see #getCtrlUnit124()
	 * @generated
	 */
	EReference getCtrlUnit124_Input__iTorqueVal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit124#getInput__iRolConverter <em>Input iRol Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iRol Converter</em>'.
	 * @see WTSpecID.CtrlUnit124#getInput__iRolConverter()
	 * @see #getCtrlUnit124()
	 * @generated
	 */
	EReference getCtrlUnit124_Input__iRolConverter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit124#getOutput__oTorqueRef <em>Output oTorque Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTorque Ref</em>'.
	 * @see WTSpecID.CtrlUnit124#getOutput__oTorqueRef()
	 * @see #getCtrlUnit124()
	 * @generated
	 */
	EReference getCtrlUnit124_Output__oTorqueRef();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit125 <em>Ctrl Unit125</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit125</em>'.
	 * @see WTSpecID.CtrlUnit125
	 * @generated
	 */
	EClass getCtrlUnit125();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit125#getInput__iInvRol <em>Input iInv Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInv Rol</em>'.
	 * @see WTSpecID.CtrlUnit125#getInput__iInvRol()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Input__iInvRol();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit125#getOutput__oSpeedRef <em>Output oSpeed Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oSpeed Ref</em>'.
	 * @see WTSpecID.CtrlUnit125#getOutput__oSpeedRef()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Output__oSpeedRef();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit125#getParameter__pSpeed <em>Parameter pSpeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pSpeed</em>'.
	 * @see WTSpecID.CtrlUnit125#getParameter__pSpeed()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Parameter__pSpeed();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit125#getParameter__pOffset <em>Parameter pOffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pOffset</em>'.
	 * @see WTSpecID.CtrlUnit125#getParameter__pOffset()
	 * @see #getCtrlUnit125()
	 * @generated
	 */
	EReference getCtrlUnit125_Parameter__pOffset();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit126 <em>Ctrl Unit126</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit126</em>'.
	 * @see WTSpecID.CtrlUnit126
	 * @generated
	 */
	EClass getCtrlUnit126();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit126#getInput__iTorqueVal <em>Input iTorque Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTorque Val</em>'.
	 * @see WTSpecID.CtrlUnit126#getInput__iTorqueVal()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Input__iTorqueVal();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit126#getInput__iInvRol <em>Input iInv Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInv Rol</em>'.
	 * @see WTSpecID.CtrlUnit126#getInput__iInvRol()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Input__iInvRol();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit126#getOutput__oMaxTorque <em>Output oMax Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMax Torque</em>'.
	 * @see WTSpecID.CtrlUnit126#getOutput__oMaxTorque()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Output__oMaxTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit126#getOutput__oMinTorque <em>Output oMin Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oMin Torque</em>'.
	 * @see WTSpecID.CtrlUnit126#getOutput__oMinTorque()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Output__oMinTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit126#getParameter__pMaxTorque <em>Parameter pMax Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMax Torque</em>'.
	 * @see WTSpecID.CtrlUnit126#getParameter__pMaxTorque()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Parameter__pMaxTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit126#getParameter__pMinTorque <em>Parameter pMin Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMin Torque</em>'.
	 * @see WTSpecID.CtrlUnit126#getParameter__pMinTorque()
	 * @see #getCtrlUnit126()
	 * @generated
	 */
	EReference getCtrlUnit126_Parameter__pMinTorque();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit127 <em>Ctrl Unit127</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit127</em>'.
	 * @see WTSpecID.CtrlUnit127
	 * @generated
	 */
	EClass getCtrlUnit127();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getInput__iLowWindActive <em>Input iLow Wind Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iLow Wind Active</em>'.
	 * @see WTSpecID.CtrlUnit127#getInput__iLowWindActive()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Input__iLowWindActive();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getInput__iWindDirectionRelAvg <em>Input iWind Direction Rel Avg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iWind Direction Rel Avg</em>'.
	 * @see WTSpecID.CtrlUnit127#getInput__iWindDirectionRelAvg()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Input__iWindDirectionRelAvg();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit127#getInput__iTwistAngle()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getInput__iInhibitAutoYaw <em>Input iInhibit Auto Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iInhibit Auto Yaw</em>'.
	 * @see WTSpecID.CtrlUnit127#getInput__iInhibitAutoYaw()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Input__iInhibitAutoYaw();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getOutput__oRelWindPreCommand <em>Output oRel Wind Pre Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oRel Wind Pre Command</em>'.
	 * @see WTSpecID.CtrlUnit127#getOutput__oRelWindPreCommand()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Output__oRelWindPreCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getOutput__oFlagIntoWind <em>Output oFlag Into Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oFlag Into Wind</em>'.
	 * @see WTSpecID.CtrlUnit127#getOutput__oFlagIntoWind()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Output__oFlagIntoWind();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getOutput__oExcessiveYawingTime <em>Output oExcessive Yawing Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oExcessive Yawing Time</em>'.
	 * @see WTSpecID.CtrlUnit127#getOutput__oExcessiveYawingTime()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Output__oExcessiveYawingTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getParameter__pWindDirectionTolerance <em>Parameter pWind Direction Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pWind Direction Tolerance</em>'.
	 * @see WTSpecID.CtrlUnit127#getParameter__pWindDirectionTolerance()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Parameter__pWindDirectionTolerance();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getParameter__pYawFilterTime <em>Parameter pYaw Filter Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pYaw Filter Time</em>'.
	 * @see WTSpecID.CtrlUnit127#getParameter__pYawFilterTime()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Parameter__pYawFilterTime();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getParameter__pYawStopAngleLimit <em>Parameter pYaw Stop Angle Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pYaw Stop Angle Limit</em>'.
	 * @see WTSpecID.CtrlUnit127#getParameter__pYawStopAngleLimit()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Parameter__pYawStopAngleLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit127#getTimer__tMaximumTimeYawing <em>Timer tMaximum Time Yawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tMaximum Time Yawing</em>'.
	 * @see WTSpecID.CtrlUnit127#getTimer__tMaximumTimeYawing()
	 * @see #getCtrlUnit127()
	 * @generated
	 */
	EReference getCtrlUnit127_Timer__tMaximumTimeYawing();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit128 <em>Ctrl Unit128</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit128</em>'.
	 * @see WTSpecID.CtrlUnit128
	 * @generated
	 */
	EClass getCtrlUnit128();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit128#getInput__iYawStatus <em>Input iYaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Status</em>'.
	 * @see WTSpecID.CtrlUnit128#getInput__iYawStatus()
	 * @see #getCtrlUnit128()
	 * @generated
	 */
	EReference getCtrlUnit128_Input__iYawStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit128#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit128#getInput__iTwistAngle()
	 * @see #getCtrlUnit128()
	 * @generated
	 */
	EReference getCtrlUnit128_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit128#getOutput__oYawMotionProblem <em>Output oYaw Motion Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Motion Problem</em>'.
	 * @see WTSpecID.CtrlUnit128#getOutput__oYawMotionProblem()
	 * @see #getCtrlUnit128()
	 * @generated
	 */
	EReference getCtrlUnit128_Output__oYawMotionProblem();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit128#getParameter__pDegreesPerSecond <em>Parameter pDegrees Per Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDegrees Per Second</em>'.
	 * @see WTSpecID.CtrlUnit128#getParameter__pDegreesPerSecond()
	 * @see #getCtrlUnit128()
	 * @generated
	 */
	EReference getCtrlUnit128_Parameter__pDegreesPerSecond();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit128#getTimer__tCheckFrequency <em>Timer tCheck Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tCheck Frequency</em>'.
	 * @see WTSpecID.CtrlUnit128#getTimer__tCheckFrequency()
	 * @see #getCtrlUnit128()
	 * @generated
	 */
	EReference getCtrlUnit128_Timer__tCheckFrequency();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit129 <em>Ctrl Unit129</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit129</em>'.
	 * @see WTSpecID.CtrlUnit129
	 * @generated
	 */
	EClass getCtrlUnit129();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getInput__iYawStatus <em>Input iYaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Status</em>'.
	 * @see WTSpecID.CtrlUnit129#getInput__iYawStatus()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Input__iYawStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getInput__iYawCurrent1 <em>Input iYaw Current1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current1</em>'.
	 * @see WTSpecID.CtrlUnit129#getInput__iYawCurrent1()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Input__iYawCurrent1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getInput__iYawCurrent2 <em>Input iYaw Current2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current2</em>'.
	 * @see WTSpecID.CtrlUnit129#getInput__iYawCurrent2()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Input__iYawCurrent2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getInput__iYawCurrent3 <em>Input iYaw Current3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current3</em>'.
	 * @see WTSpecID.CtrlUnit129#getInput__iYawCurrent3()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Input__iYawCurrent3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getInput__iYawCurrent4 <em>Input iYaw Current4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current4</em>'.
	 * @see WTSpecID.CtrlUnit129#getInput__iYawCurrent4()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Input__iYawCurrent4();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getParameter__pMinimumTorque <em>Parameter pMinimum Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMinimum Torque</em>'.
	 * @see WTSpecID.CtrlUnit129#getParameter__pMinimumTorque()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Parameter__pMinimumTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getParameter__pTorqueDifferenceLimit <em>Parameter pTorque Difference Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTorque Difference Limit</em>'.
	 * @see WTSpecID.CtrlUnit129#getParameter__pTorqueDifferenceLimit()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Parameter__pTorqueDifferenceLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getFault__fYawMotor <em>Fault fYaw Motor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fYaw Motor</em>'.
	 * @see WTSpecID.CtrlUnit129#getFault__fYawMotor()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Fault__fYawMotor();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit129#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit129#getTimer__tTimer()
	 * @see #getCtrlUnit129()
	 * @generated
	 */
	EReference getCtrlUnit129_Timer__tTimer();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit130 <em>Ctrl Unit130</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit130</em>'.
	 * @see WTSpecID.CtrlUnit130
	 * @generated
	 */
	EClass getCtrlUnit130();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit130#getOutput__oYawBrakeHighPressureCmd <em>Output oYaw Brake High Pressure Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oYaw Brake High Pressure Cmd</em>'.
	 * @see WTSpecID.CtrlUnit130#getOutput__oYawBrakeHighPressureCmd()
	 * @see #getCtrlUnit130()
	 * @generated
	 */
	EReference getCtrlUnit130_Output__oYawBrakeHighPressureCmd();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit130#getFault__fOverpressure <em>Fault fOverpressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fOverpressure</em>'.
	 * @see WTSpecID.CtrlUnit130#getFault__fOverpressure()
	 * @see #getCtrlUnit130()
	 * @generated
	 */
	EReference getCtrlUnit130_Fault__fOverpressure();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit131 <em>Ctrl Unit131</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit131</em>'.
	 * @see WTSpecID.CtrlUnit131
	 * @generated
	 */
	EClass getCtrlUnit131();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit131#getInput__iExcessivePressure <em>Input iExcessive Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iExcessive Pressure</em>'.
	 * @see WTSpecID.CtrlUnit131#getInput__iExcessivePressure()
	 * @see #getCtrlUnit131()
	 * @generated
	 */
	EReference getCtrlUnit131_Input__iExcessivePressure();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit131#getInput__iBrakeCommand <em>Input iBrake Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iBrake Command</em>'.
	 * @see WTSpecID.CtrlUnit131#getInput__iBrakeCommand()
	 * @see #getCtrlUnit131()
	 * @generated
	 */
	EReference getCtrlUnit131_Input__iBrakeCommand();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit131#getFault__fCommError <em>Fault fComm Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fComm Error</em>'.
	 * @see WTSpecID.CtrlUnit131#getFault__fCommError()
	 * @see #getCtrlUnit131()
	 * @generated
	 */
	EReference getCtrlUnit131_Fault__fCommError();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit131#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit131#getFault__fFault()
	 * @see #getCtrlUnit131()
	 * @generated
	 */
	EReference getCtrlUnit131_Fault__fFault();

	/**
	 * Returns the meta object for the attribute '{@link WTSpecID.CtrlUnit131#getBhvParam__bpLogicType <em>Bhv Param bp Logic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bhv Param bp Logic Type</em>'.
	 * @see WTSpecID.CtrlUnit131#getBhvParam__bpLogicType()
	 * @see #getCtrlUnit131()
	 * @generated
	 */
	EAttribute getCtrlUnit131_BhvParam__bpLogicType();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit132 <em>Ctrl Unit132</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit132</em>'.
	 * @see WTSpecID.CtrlUnit132
	 * @generated
	 */
	EClass getCtrlUnit132();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit132#getInput__iTeeth1 <em>Input iTeeth1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTeeth1</em>'.
	 * @see WTSpecID.CtrlUnit132#getInput__iTeeth1()
	 * @see #getCtrlUnit132()
	 * @generated
	 */
	EReference getCtrlUnit132_Input__iTeeth1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit132#getInput__iTeeth2 <em>Input iTeeth2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTeeth2</em>'.
	 * @see WTSpecID.CtrlUnit132#getInput__iTeeth2()
	 * @see #getCtrlUnit132()
	 * @generated
	 */
	EReference getCtrlUnit132_Input__iTeeth2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit132#getInput__iTwistAngle <em>Input iTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit132#getInput__iTwistAngle()
	 * @see #getCtrlUnit132()
	 * @generated
	 */
	EReference getCtrlUnit132_Input__iTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit132#getOutput__oTwistAngle <em>Output oTwist Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oTwist Angle</em>'.
	 * @see WTSpecID.CtrlUnit132#getOutput__oTwistAngle()
	 * @see #getCtrlUnit132()
	 * @generated
	 */
	EReference getCtrlUnit132_Output__oTwistAngle();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit132#getParameter__pDegreesPerPulse <em>Parameter pDegrees Per Pulse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pDegrees Per Pulse</em>'.
	 * @see WTSpecID.CtrlUnit132#getParameter__pDegreesPerPulse()
	 * @see #getCtrlUnit132()
	 * @generated
	 */
	EReference getCtrlUnit132_Parameter__pDegreesPerPulse();

	/**
	 * Returns the meta object for class '{@link WTSpecID.CtrlUnit133 <em>Ctrl Unit133</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ctrl Unit133</em>'.
	 * @see WTSpecID.CtrlUnit133
	 * @generated
	 */
	EClass getCtrlUnit133();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getInput__iYawStatus <em>Input iYaw Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Status</em>'.
	 * @see WTSpecID.CtrlUnit133#getInput__iYawStatus()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Input__iYawStatus();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getInput__iYawCurrent1 <em>Input iYaw Current1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current1</em>'.
	 * @see WTSpecID.CtrlUnit133#getInput__iYawCurrent1()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Input__iYawCurrent1();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getInput__iYawCurrent2 <em>Input iYaw Current2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current2</em>'.
	 * @see WTSpecID.CtrlUnit133#getInput__iYawCurrent2()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Input__iYawCurrent2();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getInput__iYawCurrent3 <em>Input iYaw Current3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current3</em>'.
	 * @see WTSpecID.CtrlUnit133#getInput__iYawCurrent3()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Input__iYawCurrent3();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getInput__iYawCurrent4 <em>Input iYaw Current4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iYaw Current4</em>'.
	 * @see WTSpecID.CtrlUnit133#getInput__iYawCurrent4()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Input__iYawCurrent4();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getInput__iOverloadAlarmCounter <em>Input iOverload Alarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input iOverload Alarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit133#getInput__iOverloadAlarmCounter()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Input__iOverloadAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getOutput__oOverloadAlarmCounter <em>Output oOverload Alarm Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output oOverload Alarm Counter</em>'.
	 * @see WTSpecID.CtrlUnit133#getOutput__oOverloadAlarmCounter()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Output__oOverloadAlarmCounter();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getParameter__pMaximumTorque <em>Parameter pMaximum Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMaximum Torque</em>'.
	 * @see WTSpecID.CtrlUnit133#getParameter__pMaximumTorque()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Parameter__pMaximumTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getParameter__pMinimumTorque <em>Parameter pMinimum Torque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pMinimum Torque</em>'.
	 * @see WTSpecID.CtrlUnit133#getParameter__pMinimumTorque()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Parameter__pMinimumTorque();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getParameter__pTorqueDifferenceLimit <em>Parameter pTorque Difference Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter pTorque Difference Limit</em>'.
	 * @see WTSpecID.CtrlUnit133#getParameter__pTorqueDifferenceLimit()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Parameter__pTorqueDifferenceLimit();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getFault__fFault <em>Fault fFault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault fFault</em>'.
	 * @see WTSpecID.CtrlUnit133#getFault__fFault()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Fault__fFault();

	/**
	 * Returns the meta object for the reference '{@link WTSpecID.CtrlUnit133#getTimer__tTimer <em>Timer tTimer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer tTimer</em>'.
	 * @see WTSpecID.CtrlUnit133#getTimer__tTimer()
	 * @see #getCtrlUnit133()
	 * @generated
	 */
	EReference getCtrlUnit133_Timer__tTimer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WTSpecIDFactory getWTSpecIDFactory();

} //WTSpecIDPackage
