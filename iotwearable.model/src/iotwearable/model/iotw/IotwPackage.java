/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see iotwearable.model.iotw.IotwFactory
 * @model kind="package"
 * @generated
 */
public interface IotwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iotw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.iuh.wearable/model/iotw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iotw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IotwPackage eINSTANCE = iotwearable.model.iotw.impl.IotwPackageImpl.init();

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.MainboardImpl <em>Mainboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.MainboardImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getMainboard()
	 * @generated
	 */
	int MAINBOARD = 6;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__ID = 1;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.IOControlImpl <em>IO Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.IOControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getIOControl()
	 * @generated
	 */
	int IO_CONTROL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL__CONSTRAINTS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL__MAINBOARD = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IO Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL___GET_PINS = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL___GET_PIN_CONNECTEDS = CONTROL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL___MODIFY_PIN__PIN = CONTROL_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>IO Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ConnectivityControlImpl <em>Connectivity Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ConnectivityControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectivityControl()
	 * @generated
	 */
	int CONNECTIVITY_CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL__CONSTRAINTS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL__MAINBOARD = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connectivity Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL___GET_PINS = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL___GET_PIN_CONNECTEDS = CONTROL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL___MODIFY_PIN__PIN = CONTROL_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connectivity Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTIVITY_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StateControlImpl <em>State Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StateControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateControl()
	 * @generated
	 */
	int STATE_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL__CONSTRAINTS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL__INCOMINGS = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL__OUTGOINGS = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.DataControlImpl <em>Data Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.DataControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDataControl()
	 * @generated
	 */
	int DATA_CONTROL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__NAME = CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__ID = CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__CONSTRAINTS = CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__LOCATION = CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__TYPE = CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Explorer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL__DATA_EXPLORER = CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.DataExplorerImpl <em>Data Explorer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.DataExplorerImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDataExplorer()
	 * @generated
	 */
	int DATA_EXPLORER = 5;

	/**
	 * The feature id for the '<em><b>Datas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPLORER__DATAS = 0;

	/**
	 * The number of structural features of the '<em>Data Explorer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPLORER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Explorer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPLORER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ConnectionImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 9;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StateSchemaImpl <em>State Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StateSchemaImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateSchema()
	 * @generated
	 */
	int STATE_SCHEMA = 7;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Connectivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__CONNECTIVITIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD__NAME = 2;

	/**
	 * The number of structural features of the '<em>Mainboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___ADD_CONTROL__IOCONTROL = 0;

	/**
	 * The operation id for the '<em>Remove Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___REMOVE_CONTROL__IOCONTROL = 1;

	/**
	 * The operation id for the '<em>Add Connectivity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___ADD_CONNECTIVITY__CONNECTIVITYCONTROL = 2;

	/**
	 * The operation id for the '<em>Remove Connectivity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___REMOVE_CONNECTIVITY__CONNECTIVITYCONTROL = 3;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_PINS = 4;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___GET_PIN_CONNECTEDS = 5;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___MODIFY_PIN__PIN = 6;

	/**
	 * The operation id for the '<em>Find Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD___FIND_PIN__PIN = 7;

	/**
	 * The number of operations of the '<em>Mainboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINBOARD_OPERATION_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA__CONTROLS = 0;

	/**
	 * The feature id for the '<em><b>Connnections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA__CONNNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>State Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl <em>Arduino UNOR3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ArduinoUNOR3Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getArduinoUNOR3()
	 * @generated
	 */
	int ARDUINO_UNOR3 = 8;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__CONTROLS = MAINBOARD__CONTROLS;

	/**
	 * The feature id for the '<em><b>Connectivities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__CONNECTIVITIES = MAINBOARD__CONNECTIVITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__NAME = MAINBOARD__NAME;

	/**
	 * The feature id for the '<em><b>Pin0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN0 = MAINBOARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN1 = MAINBOARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN2 = MAINBOARD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN3 = MAINBOARD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pin4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN4 = MAINBOARD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pin5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN5 = MAINBOARD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pin6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN6 = MAINBOARD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pin7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN7 = MAINBOARD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pin8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN8 = MAINBOARD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pin9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN9 = MAINBOARD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pin10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN10 = MAINBOARD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pin11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN11 = MAINBOARD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pin12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN12 = MAINBOARD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Pin13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN13 = MAINBOARD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Pin A0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A0 = MAINBOARD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Pin A1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A1 = MAINBOARD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pin A2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A2 = MAINBOARD_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Pin A3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A3 = MAINBOARD_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Pin A4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A4 = MAINBOARD_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Pin A5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3__PIN_A5 = MAINBOARD_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Arduino UNOR3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3_FEATURE_COUNT = MAINBOARD_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>Add Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___ADD_CONTROL__IOCONTROL = MAINBOARD___ADD_CONTROL__IOCONTROL;

	/**
	 * The operation id for the '<em>Remove Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___REMOVE_CONTROL__IOCONTROL = MAINBOARD___REMOVE_CONTROL__IOCONTROL;

	/**
	 * The operation id for the '<em>Add Connectivity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___ADD_CONNECTIVITY__CONNECTIVITYCONTROL = MAINBOARD___ADD_CONNECTIVITY__CONNECTIVITYCONTROL;

	/**
	 * The operation id for the '<em>Remove Connectivity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___REMOVE_CONNECTIVITY__CONNECTIVITYCONTROL = MAINBOARD___REMOVE_CONNECTIVITY__CONNECTIVITYCONTROL;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___GET_PINS = MAINBOARD___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___GET_PIN_CONNECTEDS = MAINBOARD___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___MODIFY_PIN__PIN = MAINBOARD___MODIFY_PIN__PIN;

	/**
	 * The operation id for the '<em>Find Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3___FIND_PIN__PIN = MAINBOARD___FIND_PIN__PIN;

	/**
	 * The number of operations of the '<em>Arduino UNOR3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_UNOR3_OPERATION_COUNT = MAINBOARD_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BENDPOINTS = 0;

	/**
	 * The feature id for the '<em><b>Router Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ROUTER_KIND = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__KIND = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LABEL = 5;

	/**
	 * The feature id for the '<em><b>State Schema</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STATE_SCHEMA = 6;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.InputControlImpl <em>Input Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.InputControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getInputControl()
	 * @generated
	 */
	int INPUT_CONTROL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL__NAME = IO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL__ID = IO_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL__CONSTRAINTS = IO_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL__MAINBOARD = IO_CONTROL__MAINBOARD;

	/**
	 * The number of structural features of the '<em>Input Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL_FEATURE_COUNT = IO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL___GET_PINS = IO_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL___GET_PIN_CONNECTEDS = IO_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL___MODIFY_PIN__PIN = IO_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Input Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_CONTROL_OPERATION_COUNT = IO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.OutputControlImpl <em>Output Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.OutputControlImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getOutputControl()
	 * @generated
	 */
	int OUTPUT_CONTROL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL__NAME = IO_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL__ID = IO_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL__CONSTRAINTS = IO_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL__MAINBOARD = IO_CONTROL__MAINBOARD;

	/**
	 * The number of structural features of the '<em>Output Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL_FEATURE_COUNT = IO_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL___GET_PINS = IO_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL___GET_PIN_CONNECTEDS = IO_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL___MODIFY_PIN__PIN = IO_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Output Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONTROL_OPERATION_COUNT = IO_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.Keypad4x4Impl <em>Keypad4x4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.Keypad4x4Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getKeypad4x4()
	 * @generated
	 */
	int KEYPAD4X4 = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME = INPUT_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__ID = INPUT_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__CONSTRAINTS = INPUT_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__MAINBOARD = INPUT_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__KEYS = INPUT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__ROWS = INPUT_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__COLS = INPUT_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN1 = INPUT_CONTROL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN2 = INPUT_CONTROL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pin3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN3 = INPUT_CONTROL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pin4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN4 = INPUT_CONTROL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pin5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN5 = INPUT_CONTROL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pin6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN6 = INPUT_CONTROL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pin7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN7 = INPUT_CONTROL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pin8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__PIN8 = INPUT_CONTROL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Name Button1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON1 = INPUT_CONTROL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Name Button2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON2 = INPUT_CONTROL_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name Button3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON3 = INPUT_CONTROL_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Name Button4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON4 = INPUT_CONTROL_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Name Button5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON5 = INPUT_CONTROL_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Name Button6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON6 = INPUT_CONTROL_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Name Button7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON7 = INPUT_CONTROL_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Name Button8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON8 = INPUT_CONTROL_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Name Button9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON9 = INPUT_CONTROL_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Name Button0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON0 = INPUT_CONTROL_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Name Button A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_A = INPUT_CONTROL_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Name Button B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_B = INPUT_CONTROL_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Name Button C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_C = INPUT_CONTROL_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Name Button D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_D = INPUT_CONTROL_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Name Button Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_HASH = INPUT_CONTROL_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Name Button Asterisk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4__NAME_BUTTON_ASTERISK = INPUT_CONTROL_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Keypad4x4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4_FEATURE_COUNT = INPUT_CONTROL_FEATURE_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___GET_PINS = INPUT_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___GET_PIN_CONNECTEDS = INPUT_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___MODIFY_PIN__PIN = INPUT_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The operation id for the '<em>Get Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4___GET_BUTTON__STRING = INPUT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Keypad4x4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYPAD4X4_OPERATION_COUNT = INPUT_CONTROL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.LEDImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getLED()
	 * @generated
	 */
	int LED = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = OUTPUT_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ID = OUTPUT_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__CONSTRAINTS = OUTPUT_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__MAINBOARD = OUTPUT_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN1 = OUTPUT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN2 = OUTPUT_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = OUTPUT_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED___GET_PINS = OUTPUT_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED___GET_PIN_CONNECTEDS = OUTPUT_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED___MODIFY_PIN__PIN = OUTPUT_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = OUTPUT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.I2CLCD2004Impl <em>I2CLCD2004</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.I2CLCD2004Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getI2CLCD2004()
	 * @generated
	 */
	int I2CLCD2004 = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__NAME = OUTPUT_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__ID = OUTPUT_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__CONSTRAINTS = OUTPUT_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__MAINBOARD = OUTPUT_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Pin GND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__PIN_GND = OUTPUT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Vcc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__PIN_VCC = OUTPUT_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin SDA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__PIN_SDA = OUTPUT_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin SCL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004__PIN_SCL = OUTPUT_CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>I2CLCD2004</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004_FEATURE_COUNT = OUTPUT_CONTROL_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004___GET_PINS = OUTPUT_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004___GET_PIN_CONNECTEDS = OUTPUT_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004___MODIFY_PIN__PIN = OUTPUT_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>I2CLCD2004</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I2CLCD2004_OPERATION_COUNT = OUTPUT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StateFrameImpl <em>State Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StateFrameImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateFrame()
	 * @generated
	 */
	int STATE_FRAME = 19;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.DecisionImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 20;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.StartPointImpl <em>Start Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.StartPointImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStartPoint()
	 * @generated
	 */
	int START_POINT = 21;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.EndPointImpl <em>End Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.EndPointImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getEndPoint()
	 * @generated
	 */
	int END_POINT = 22;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.RouterKind <em>Router Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.RouterKind
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRouterKind()
	 * @generated
	 */
	int ROUTER_KIND = 24;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.TypeData <em>Type Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.TypeData
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getTypeData()
	 * @generated
	 */
	int TYPE_DATA = 25;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.BuzzerImpl <em>Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.BuzzerImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBuzzer()
	 * @generated
	 */
	int BUZZER = 18;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.ButtonImpl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 17;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.BluetoothHC06Impl <em>Bluetooth HC06</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.BluetoothHC06Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBluetoothHC06()
	 * @generated
	 */
	int BLUETOOTH_HC06 = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__NAME = CONNECTIVITY_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__ID = CONNECTIVITY_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__CONSTRAINTS = CONNECTIVITY_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__MAINBOARD = CONNECTIVITY_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Pin TXD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_TXD = CONNECTIVITY_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin RXD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_RXD = CONNECTIVITY_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin GND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_GND = CONNECTIVITY_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin VCC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06__PIN_VCC = CONNECTIVITY_CONTROL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bluetooth HC06</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06_FEATURE_COUNT = CONNECTIVITY_CONTROL_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06___GET_PINS = CONNECTIVITY_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06___GET_PIN_CONNECTEDS = CONNECTIVITY_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06___MODIFY_PIN__PIN = CONNECTIVITY_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Bluetooth HC06</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_HC06_OPERATION_COUNT = CONNECTIVITY_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.impl.WifiESP8266Impl <em>Wifi ESP8266</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.impl.WifiESP8266Impl
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiESP8266()
	 * @generated
	 */
	int WIFI_ESP8266 = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__NAME = CONNECTIVITY_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__ID = CONNECTIVITY_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__CONSTRAINTS = CONNECTIVITY_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__MAINBOARD = CONNECTIVITY_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Pin TX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_TX = CONNECTIVITY_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin RX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_RX = CONNECTIVITY_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pin Vcc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_VCC = CONNECTIVITY_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pin GND</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_GND = CONNECTIVITY_CONTROL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pin CHPD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PIN_CHPD = CONNECTIVITY_CONTROL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>SSID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__SSID = CONNECTIVITY_CONTROL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PASSWORD = CONNECTIVITY_CONTROL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__HOST = CONNECTIVITY_CONTROL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266__PORT = CONNECTIVITY_CONTROL_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Wifi ESP8266</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266_FEATURE_COUNT = CONNECTIVITY_CONTROL_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266___GET_PINS = CONNECTIVITY_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266___GET_PIN_CONNECTEDS = CONNECTIVITY_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266___MODIFY_PIN__PIN = CONNECTIVITY_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Wifi ESP8266</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIFI_ESP8266_OPERATION_COUNT = CONNECTIVITY_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = INPUT_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ID = INPUT_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CONSTRAINTS = INPUT_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__MAINBOARD = INPUT_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__PIN1 = INPUT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = INPUT_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___GET_PINS = INPUT_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___GET_PIN_CONNECTEDS = INPUT_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___MODIFY_PIN__PIN = INPUT_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = INPUT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__NAME = OUTPUT_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__ID = OUTPUT_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__CONSTRAINTS = OUTPUT_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Mainboard</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__MAINBOARD = OUTPUT_CONTROL__MAINBOARD;

	/**
	 * The feature id for the '<em><b>Pin1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__PIN1 = OUTPUT_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__PIN2 = OUTPUT_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_FEATURE_COUNT = OUTPUT_CONTROL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Pins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER___GET_PINS = OUTPUT_CONTROL___GET_PINS;

	/**
	 * The operation id for the '<em>Get Pin Connecteds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER___GET_PIN_CONNECTEDS = OUTPUT_CONTROL___GET_PIN_CONNECTEDS;

	/**
	 * The operation id for the '<em>Modify Pin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER___MODIFY_PIN__PIN = OUTPUT_CONTROL___MODIFY_PIN__PIN;

	/**
	 * The number of operations of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_OPERATION_COUNT = OUTPUT_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__NAME = STATE_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__ID = STATE_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__CONSTRAINTS = STATE_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__INCOMINGS = STATE_CONTROL__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__OUTGOINGS = STATE_CONTROL__OUTGOINGS;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME__CONTENT = STATE_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME_FEATURE_COUNT = STATE_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FRAME_OPERATION_COUNT = STATE_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__NAME = STATE_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = STATE_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__CONSTRAINTS = STATE_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__INCOMINGS = STATE_CONTROL__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__OUTGOINGS = STATE_CONTROL__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = STATE_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = STATE_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__NAME = STATE_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__ID = STATE_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__CONSTRAINTS = STATE_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__INCOMINGS = STATE_CONTROL__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT__OUTGOINGS = STATE_CONTROL__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>Start Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT_FEATURE_COUNT = STATE_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_POINT_OPERATION_COUNT = STATE_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__NAME = STATE_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__ID = STATE_CONTROL__ID;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__CONSTRAINTS = STATE_CONTROL__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__INCOMINGS = STATE_CONTROL__INCOMINGS;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT__OUTGOINGS = STATE_CONTROL__OUTGOINGS;

	/**
	 * The number of structural features of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_FEATURE_COUNT = STATE_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_OPERATION_COUNT = STATE_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link iotwearable.model.iotw.ConnectionKind <em>Connection Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.ConnectionKind
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectionKind()
	 * @generated
	 */
	int CONNECTION_KIND = 23;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 26;


	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 27;


	/**
	 * The meta object id for the '<em>Pin</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iotwearable.model.iotw.Pin
	 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 28;


	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Mainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mainboard</em>'.
	 * @see iotwearable.model.iotw.Mainboard
	 * @generated
	 */
	EClass getMainboard();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.Mainboard#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see iotwearable.model.iotw.Mainboard#getControls()
	 * @see #getMainboard()
	 * @generated
	 */
	EReference getMainboard_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.Mainboard#getConnectivities <em>Connectivities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectivities</em>'.
	 * @see iotwearable.model.iotw.Mainboard#getConnectivities()
	 * @see #getMainboard()
	 * @generated
	 */
	EReference getMainboard_Connectivities();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Mainboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotwearable.model.iotw.Mainboard#getName()
	 * @see #getMainboard()
	 * @generated
	 */
	EAttribute getMainboard_Name();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#addControl(iotwearable.model.iotw.IOControl) <em>Add Control</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Control</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#addControl(iotwearable.model.iotw.IOControl)
	 * @generated
	 */
	EOperation getMainboard__AddControl__IOControl();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#getPins() <em>Get Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pins</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#getPins()
	 * @generated
	 */
	EOperation getMainboard__GetPins();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#getPinConnecteds() <em>Get Pin Connecteds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin Connecteds</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#getPinConnecteds()
	 * @generated
	 */
	EOperation getMainboard__GetPinConnecteds();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#modifyPin(iotwearable.model.iotw.Pin) <em>Modify Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Pin</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#modifyPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getMainboard__ModifyPin__Pin();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#findPin(iotwearable.model.iotw.Pin) <em>Find Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Pin</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#findPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getMainboard__FindPin__Pin();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.ArduinoUNOR3 <em>Arduino UNOR3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino UNOR3</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3
	 * @generated
	 */
	EClass getArduinoUNOR3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin0 <em>Pin0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin0</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin0()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin0();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin1()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin2()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin3 <em>Pin3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin3</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin3()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin4 <em>Pin4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin4</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin4()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin5 <em>Pin5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin5</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin5()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin5();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin6 <em>Pin6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin6</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin6()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin6();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin7 <em>Pin7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin7</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin7()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin7();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin8 <em>Pin8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin8</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin8()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin8();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin9 <em>Pin9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin9</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin9()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin9();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin10 <em>Pin10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin10</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin10()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin10();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin11 <em>Pin11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin11</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin11()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin11();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin12 <em>Pin12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin12</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin12()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin12();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPin13 <em>Pin13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin13</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPin13()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_Pin13();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA0 <em>Pin A0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A0</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA0()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA0();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA1 <em>Pin A1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A1</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA1()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA2 <em>Pin A2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A2</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA2()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA3 <em>Pin A3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A3</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA3()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA4 <em>Pin A4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A4</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA4()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ArduinoUNOR3#getPinA5 <em>Pin A5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin A5</em>'.
	 * @see iotwearable.model.iotw.ArduinoUNOR3#getPinA5()
	 * @see #getArduinoUNOR3()
	 * @generated
	 */
	EAttribute getArduinoUNOR3_PinA5();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#removeControl(iotwearable.model.iotw.IOControl) <em>Remove Control</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Control</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#removeControl(iotwearable.model.iotw.IOControl)
	 * @generated
	 */
	EOperation getMainboard__RemoveControl__IOControl();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#addConnectivity(iotwearable.model.iotw.ConnectivityControl) <em>Add Connectivity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Connectivity</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#addConnectivity(iotwearable.model.iotw.ConnectivityControl)
	 * @generated
	 */
	EOperation getMainboard__AddConnectivity__ConnectivityControl();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Mainboard#removeConnectivity(iotwearable.model.iotw.ConnectivityControl) <em>Remove Connectivity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Connectivity</em>' operation.
	 * @see iotwearable.model.iotw.Mainboard#removeConnectivity(iotwearable.model.iotw.ConnectivityControl)
	 * @generated
	 */
	EOperation getMainboard__RemoveConnectivity__ConnectivityControl();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see iotwearable.model.iotw.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iotwearable.model.iotw.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Control#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see iotwearable.model.iotw.Control#getId()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Id();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.IOControl <em>IO Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Control</em>'.
	 * @see iotwearable.model.iotw.IOControl
	 * @generated
	 */
	EClass getIOControl();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.IOControl#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see iotwearable.model.iotw.IOControl#getConstraints()
	 * @see #getIOControl()
	 * @generated
	 */
	EAttribute getIOControl_Constraints();

	/**
	 * Returns the meta object for the container reference '{@link iotwearable.model.iotw.IOControl#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mainboard</em>'.
	 * @see iotwearable.model.iotw.IOControl#getMainboard()
	 * @see #getIOControl()
	 * @generated
	 */
	EReference getIOControl_Mainboard();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.IOControl#getPins() <em>Get Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pins</em>' operation.
	 * @see iotwearable.model.iotw.IOControl#getPins()
	 * @generated
	 */
	EOperation getIOControl__GetPins();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.IOControl#getPinConnecteds() <em>Get Pin Connecteds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin Connecteds</em>' operation.
	 * @see iotwearable.model.iotw.IOControl#getPinConnecteds()
	 * @generated
	 */
	EOperation getIOControl__GetPinConnecteds();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.IOControl#modifyPin(iotwearable.model.iotw.Pin) <em>Modify Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Pin</em>' operation.
	 * @see iotwearable.model.iotw.IOControl#modifyPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getIOControl__ModifyPin__Pin();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.ConnectivityControl <em>Connectivity Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectivity Control</em>'.
	 * @see iotwearable.model.iotw.ConnectivityControl
	 * @generated
	 */
	EClass getConnectivityControl();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.ConnectivityControl#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see iotwearable.model.iotw.ConnectivityControl#getConstraints()
	 * @see #getConnectivityControl()
	 * @generated
	 */
	EAttribute getConnectivityControl_Constraints();

	/**
	 * Returns the meta object for the container reference '{@link iotwearable.model.iotw.ConnectivityControl#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mainboard</em>'.
	 * @see iotwearable.model.iotw.ConnectivityControl#getMainboard()
	 * @see #getConnectivityControl()
	 * @generated
	 */
	EReference getConnectivityControl_Mainboard();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.ConnectivityControl#getPins() <em>Get Pins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pins</em>' operation.
	 * @see iotwearable.model.iotw.ConnectivityControl#getPins()
	 * @generated
	 */
	EOperation getConnectivityControl__GetPins();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.ConnectivityControl#getPinConnecteds() <em>Get Pin Connecteds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Pin Connecteds</em>' operation.
	 * @see iotwearable.model.iotw.ConnectivityControl#getPinConnecteds()
	 * @generated
	 */
	EOperation getConnectivityControl__GetPinConnecteds();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.ConnectivityControl#modifyPin(iotwearable.model.iotw.Pin) <em>Modify Pin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modify Pin</em>' operation.
	 * @see iotwearable.model.iotw.ConnectivityControl#modifyPin(iotwearable.model.iotw.Pin)
	 * @generated
	 */
	EOperation getConnectivityControl__ModifyPin__Pin();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StateControl <em>State Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Control</em>'.
	 * @see iotwearable.model.iotw.StateControl
	 * @generated
	 */
	EClass getStateControl();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.StateControl#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see iotwearable.model.iotw.StateControl#getConstraints()
	 * @see #getStateControl()
	 * @generated
	 */
	EAttribute getStateControl_Constraints();

	/**
	 * Returns the meta object for the reference list '{@link iotwearable.model.iotw.StateControl#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomings</em>'.
	 * @see iotwearable.model.iotw.StateControl#getIncomings()
	 * @see #getStateControl()
	 * @generated
	 */
	EReference getStateControl_Incomings();

	/**
	 * Returns the meta object for the reference list '{@link iotwearable.model.iotw.StateControl#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoings</em>'.
	 * @see iotwearable.model.iotw.StateControl#getOutgoings()
	 * @see #getStateControl()
	 * @generated
	 */
	EReference getStateControl_Outgoings();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.DataControl <em>Data Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Control</em>'.
	 * @see iotwearable.model.iotw.DataControl
	 * @generated
	 */
	EClass getDataControl();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.DataControl#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see iotwearable.model.iotw.DataControl#getConstraints()
	 * @see #getDataControl()
	 * @generated
	 */
	EAttribute getDataControl_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.DataControl#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see iotwearable.model.iotw.DataControl#getLocation()
	 * @see #getDataControl()
	 * @generated
	 */
	EAttribute getDataControl_Location();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.DataControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see iotwearable.model.iotw.DataControl#getType()
	 * @see #getDataControl()
	 * @generated
	 */
	EAttribute getDataControl_Type();

	/**
	 * Returns the meta object for the container reference '{@link iotwearable.model.iotw.DataControl#getDataExplorer <em>Data Explorer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Explorer</em>'.
	 * @see iotwearable.model.iotw.DataControl#getDataExplorer()
	 * @see #getDataControl()
	 * @generated
	 */
	EReference getDataControl_DataExplorer();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.DataExplorer <em>Data Explorer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Explorer</em>'.
	 * @see iotwearable.model.iotw.DataExplorer
	 * @generated
	 */
	EClass getDataExplorer();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.DataExplorer#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datas</em>'.
	 * @see iotwearable.model.iotw.DataExplorer#getDatas()
	 * @see #getDataExplorer()
	 * @generated
	 */
	EReference getDataExplorer_Datas();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see iotwearable.model.iotw.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute list '{@link iotwearable.model.iotw.Connection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see iotwearable.model.iotw.Connection#getBendpoints()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Connection#getRouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Router Kind</em>'.
	 * @see iotwearable.model.iotw.Connection#getRouterKind()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_RouterKind();

	/**
	 * Returns the meta object for the reference '{@link iotwearable.model.iotw.Connection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see iotwearable.model.iotw.Connection#getSource()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link iotwearable.model.iotw.Connection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see iotwearable.model.iotw.Connection#getTarget()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Connection#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see iotwearable.model.iotw.Connection#getKind()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Kind();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Connection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see iotwearable.model.iotw.Connection#getLabel()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Label();

	/**
	 * Returns the meta object for the container reference '{@link iotwearable.model.iotw.Connection#getStateSchema <em>State Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Schema</em>'.
	 * @see iotwearable.model.iotw.Connection#getStateSchema()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_StateSchema();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StateSchema <em>State Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Schema</em>'.
	 * @see iotwearable.model.iotw.StateSchema
	 * @generated
	 */
	EClass getStateSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.StateSchema#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controls</em>'.
	 * @see iotwearable.model.iotw.StateSchema#getControls()
	 * @see #getStateSchema()
	 * @generated
	 */
	EReference getStateSchema_Controls();

	/**
	 * Returns the meta object for the containment reference list '{@link iotwearable.model.iotw.StateSchema#getConnnections <em>Connnections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connnections</em>'.
	 * @see iotwearable.model.iotw.StateSchema#getConnnections()
	 * @see #getStateSchema()
	 * @generated
	 */
	EReference getStateSchema_Connnections();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.InputControl <em>Input Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Control</em>'.
	 * @see iotwearable.model.iotw.InputControl
	 * @generated
	 */
	EClass getInputControl();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.OutputControl <em>Output Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Control</em>'.
	 * @see iotwearable.model.iotw.OutputControl
	 * @generated
	 */
	EClass getOutputControl();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Keypad4x4 <em>Keypad4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keypad4x4</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4
	 * @generated
	 */
	EClass getKeypad4x4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getKeys()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Keys();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getRows()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Rows();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getCols()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Cols();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin1()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin2()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin3 <em>Pin3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin3</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin3()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin4 <em>Pin4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin4</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin4()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin5 <em>Pin5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin5</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin5()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin5();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin6 <em>Pin6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin6</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin6()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin6();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin7 <em>Pin7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin7</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin7()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin7();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getPin8 <em>Pin8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin8</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getPin8()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_Pin8();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton1 <em>Name Button1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button1</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton1()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton2 <em>Name Button2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button2</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton2()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton2();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton3 <em>Name Button3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button3</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton3()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton3();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton4 <em>Name Button4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button4</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton4()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton4();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton5 <em>Name Button5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button5</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton5()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton5();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton6 <em>Name Button6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button6</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton6()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton6();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton7 <em>Name Button7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button7</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton7()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton7();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton8 <em>Name Button8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button8</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton8()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton8();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton9 <em>Name Button9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button9</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton9()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton9();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButton0 <em>Name Button0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button0</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButton0()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButton0();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonA <em>Name Button A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button A</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonA()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonA();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonB <em>Name Button B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button B</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonB()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonB();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonC <em>Name Button C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button C</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonC()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonC();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonD <em>Name Button D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button D</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonD()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonHash <em>Name Button Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button Hash</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonHash()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonHash();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Keypad4x4#getNameButtonAsterisk <em>Name Button Asterisk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Button Asterisk</em>'.
	 * @see iotwearable.model.iotw.Keypad4x4#getNameButtonAsterisk()
	 * @see #getKeypad4x4()
	 * @generated
	 */
	EAttribute getKeypad4x4_NameButtonAsterisk();

	/**
	 * Returns the meta object for the '{@link iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String) <em>Get Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Button</em>' operation.
	 * @see iotwearable.model.iotw.Keypad4x4#getButton(java.lang.String)
	 * @generated
	 */
	EOperation getKeypad4x4__GetButton__String();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see iotwearable.model.iotw.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.LED#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.LED#getPin1()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.LED#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.LED#getPin2()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Pin2();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.I2CLCD2004 <em>I2CLCD2004</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I2CLCD2004</em>'.
	 * @see iotwearable.model.iotw.I2CLCD2004
	 * @generated
	 */
	EClass getI2CLCD2004();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD2004#getPinGND <em>Pin GND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin GND</em>'.
	 * @see iotwearable.model.iotw.I2CLCD2004#getPinGND()
	 * @see #getI2CLCD2004()
	 * @generated
	 */
	EAttribute getI2CLCD2004_PinGND();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD2004#getPinVcc <em>Pin Vcc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Vcc</em>'.
	 * @see iotwearable.model.iotw.I2CLCD2004#getPinVcc()
	 * @see #getI2CLCD2004()
	 * @generated
	 */
	EAttribute getI2CLCD2004_PinVcc();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD2004#getPinSDA <em>Pin SDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin SDA</em>'.
	 * @see iotwearable.model.iotw.I2CLCD2004#getPinSDA()
	 * @see #getI2CLCD2004()
	 * @generated
	 */
	EAttribute getI2CLCD2004_PinSDA();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.I2CLCD2004#getPinSCL <em>Pin SCL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin SCL</em>'.
	 * @see iotwearable.model.iotw.I2CLCD2004#getPinSCL()
	 * @see #getI2CLCD2004()
	 * @generated
	 */
	EAttribute getI2CLCD2004_PinSCL();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StateFrame <em>State Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Frame</em>'.
	 * @see iotwearable.model.iotw.StateFrame
	 * @generated
	 */
	EClass getStateFrame();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.StateFrame#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see iotwearable.model.iotw.StateFrame#getContent()
	 * @see #getStateFrame()
	 * @generated
	 */
	EAttribute getStateFrame_Content();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see iotwearable.model.iotw.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Point</em>'.
	 * @see iotwearable.model.iotw.StartPoint
	 * @generated
	 */
	EClass getStartPoint();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point</em>'.
	 * @see iotwearable.model.iotw.EndPoint
	 * @generated
	 */
	EClass getEndPoint();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.BluetoothHC06 <em>Bluetooth HC06</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth HC06</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06
	 * @generated
	 */
	EClass getBluetoothHC06();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinTXD <em>Pin TXD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin TXD</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinTXD()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinTXD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinRXD <em>Pin RXD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin RXD</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinRXD()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinRXD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinGND <em>Pin GND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin GND</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinGND()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinGND();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.BluetoothHC06#getPinVCC <em>Pin VCC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin VCC</em>'.
	 * @see iotwearable.model.iotw.BluetoothHC06#getPinVCC()
	 * @see #getBluetoothHC06()
	 * @generated
	 */
	EAttribute getBluetoothHC06_PinVCC();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.WifiESP8266 <em>Wifi ESP8266</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wifi ESP8266</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266
	 * @generated
	 */
	EClass getWifiESP8266();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinTX <em>Pin TX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin TX</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinTX()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinTX();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinRX <em>Pin RX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin RX</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinRX()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinRX();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinVcc <em>Pin Vcc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Vcc</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinVcc()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinVcc();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinGND <em>Pin GND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin GND</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinGND()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinGND();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPinCHPD <em>Pin CHPD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin CHPD</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPinCHPD()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_PinCHPD();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getSSID <em>SSID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SSID</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getSSID()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_SSID();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPassword()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Password();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getHost()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Host();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.WifiESP8266#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see iotwearable.model.iotw.WifiESP8266#getPort()
	 * @see #getWifiESP8266()
	 * @generated
	 */
	EAttribute getWifiESP8266_Port();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see iotwearable.model.iotw.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Button#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.Button#getPin1()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Pin1();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.ConnectionKind <em>Connection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Kind</em>'.
	 * @see iotwearable.model.iotw.ConnectionKind
	 * @generated
	 */
	EEnum getConnectionKind();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.RouterKind <em>Router Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Router Kind</em>'.
	 * @see iotwearable.model.iotw.RouterKind
	 * @generated
	 */
	EEnum getRouterKind();

	/**
	 * Returns the meta object for enum '{@link iotwearable.model.iotw.TypeData <em>Type Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Data</em>'.
	 * @see iotwearable.model.iotw.TypeData
	 * @generated
	 */
	EEnum getTypeData();

	/**
	 * Returns the meta object for class '{@link iotwearable.model.iotw.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzzer</em>'.
	 * @see iotwearable.model.iotw.Buzzer
	 * @generated
	 */
	EClass getBuzzer();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Buzzer#getPin1 <em>Pin1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin1</em>'.
	 * @see iotwearable.model.iotw.Buzzer#getPin1()
	 * @see #getBuzzer()
	 * @generated
	 */
	EAttribute getBuzzer_Pin1();

	/**
	 * Returns the meta object for the attribute '{@link iotwearable.model.iotw.Buzzer#getPin2 <em>Pin2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin2</em>'.
	 * @see iotwearable.model.iotw.Buzzer#getPin2()
	 * @see #getBuzzer()
	 * @generated
	 */
	EAttribute getBuzzer_Pin2();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link iotwearable.model.iotw.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pin</em>'.
	 * @see iotwearable.model.iotw.Pin
	 * @model instanceClass="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	EDataType getPin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IotwFactory getIotwFactory();

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
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.MainboardImpl <em>Mainboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.MainboardImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getMainboard()
		 * @generated
		 */
		EClass MAINBOARD = eINSTANCE.getMainboard();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINBOARD__CONTROLS = eINSTANCE.getMainboard_Controls();

		/**
		 * The meta object literal for the '<em><b>Connectivities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAINBOARD__CONNECTIVITIES = eINSTANCE.getMainboard_Connectivities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINBOARD__NAME = eINSTANCE.getMainboard_Name();

		/**
		 * The meta object literal for the '<em><b>Add Control</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___ADD_CONTROL__IOCONTROL = eINSTANCE.getMainboard__AddControl__IOControl();

		/**
		 * The meta object literal for the '<em><b>Get Pins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___GET_PINS = eINSTANCE.getMainboard__GetPins();

		/**
		 * The meta object literal for the '<em><b>Get Pin Connecteds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___GET_PIN_CONNECTEDS = eINSTANCE.getMainboard__GetPinConnecteds();

		/**
		 * The meta object literal for the '<em><b>Modify Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___MODIFY_PIN__PIN = eINSTANCE.getMainboard__ModifyPin__Pin();

		/**
		 * The meta object literal for the '<em><b>Find Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___FIND_PIN__PIN = eINSTANCE.getMainboard__FindPin__Pin();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ArduinoUNOR3Impl <em>Arduino UNOR3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ArduinoUNOR3Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getArduinoUNOR3()
		 * @generated
		 */
		EClass ARDUINO_UNOR3 = eINSTANCE.getArduinoUNOR3();

		/**
		 * The meta object literal for the '<em><b>Pin0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN0 = eINSTANCE.getArduinoUNOR3_Pin0();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN1 = eINSTANCE.getArduinoUNOR3_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN2 = eINSTANCE.getArduinoUNOR3_Pin2();

		/**
		 * The meta object literal for the '<em><b>Pin3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN3 = eINSTANCE.getArduinoUNOR3_Pin3();

		/**
		 * The meta object literal for the '<em><b>Pin4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN4 = eINSTANCE.getArduinoUNOR3_Pin4();

		/**
		 * The meta object literal for the '<em><b>Pin5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN5 = eINSTANCE.getArduinoUNOR3_Pin5();

		/**
		 * The meta object literal for the '<em><b>Pin6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN6 = eINSTANCE.getArduinoUNOR3_Pin6();

		/**
		 * The meta object literal for the '<em><b>Pin7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN7 = eINSTANCE.getArduinoUNOR3_Pin7();

		/**
		 * The meta object literal for the '<em><b>Pin8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN8 = eINSTANCE.getArduinoUNOR3_Pin8();

		/**
		 * The meta object literal for the '<em><b>Pin9</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN9 = eINSTANCE.getArduinoUNOR3_Pin9();

		/**
		 * The meta object literal for the '<em><b>Pin10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN10 = eINSTANCE.getArduinoUNOR3_Pin10();

		/**
		 * The meta object literal for the '<em><b>Pin11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN11 = eINSTANCE.getArduinoUNOR3_Pin11();

		/**
		 * The meta object literal for the '<em><b>Pin12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN12 = eINSTANCE.getArduinoUNOR3_Pin12();

		/**
		 * The meta object literal for the '<em><b>Pin13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN13 = eINSTANCE.getArduinoUNOR3_Pin13();

		/**
		 * The meta object literal for the '<em><b>Pin A0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A0 = eINSTANCE.getArduinoUNOR3_PinA0();

		/**
		 * The meta object literal for the '<em><b>Pin A1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A1 = eINSTANCE.getArduinoUNOR3_PinA1();

		/**
		 * The meta object literal for the '<em><b>Pin A2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A2 = eINSTANCE.getArduinoUNOR3_PinA2();

		/**
		 * The meta object literal for the '<em><b>Pin A3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A3 = eINSTANCE.getArduinoUNOR3_PinA3();

		/**
		 * The meta object literal for the '<em><b>Pin A4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A4 = eINSTANCE.getArduinoUNOR3_PinA4();

		/**
		 * The meta object literal for the '<em><b>Pin A5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_UNOR3__PIN_A5 = eINSTANCE.getArduinoUNOR3_PinA5();

		/**
		 * The meta object literal for the '<em><b>Remove Control</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___REMOVE_CONTROL__IOCONTROL = eINSTANCE.getMainboard__RemoveControl__IOControl();

		/**
		 * The meta object literal for the '<em><b>Add Connectivity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___ADD_CONNECTIVITY__CONNECTIVITYCONTROL = eINSTANCE.getMainboard__AddConnectivity__ConnectivityControl();

		/**
		 * The meta object literal for the '<em><b>Remove Connectivity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAINBOARD___REMOVE_CONNECTIVITY__CONNECTIVITYCONTROL = eINSTANCE.getMainboard__RemoveConnectivity__ConnectivityControl();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__ID = eINSTANCE.getControl_Id();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.IOControlImpl <em>IO Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.IOControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getIOControl()
		 * @generated
		 */
		EClass IO_CONTROL = eINSTANCE.getIOControl();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_CONTROL__CONSTRAINTS = eINSTANCE.getIOControl_Constraints();

		/**
		 * The meta object literal for the '<em><b>Mainboard</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_CONTROL__MAINBOARD = eINSTANCE.getIOControl_Mainboard();

		/**
		 * The meta object literal for the '<em><b>Get Pins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IO_CONTROL___GET_PINS = eINSTANCE.getIOControl__GetPins();

		/**
		 * The meta object literal for the '<em><b>Get Pin Connecteds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IO_CONTROL___GET_PIN_CONNECTEDS = eINSTANCE.getIOControl__GetPinConnecteds();

		/**
		 * The meta object literal for the '<em><b>Modify Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IO_CONTROL___MODIFY_PIN__PIN = eINSTANCE.getIOControl__ModifyPin__Pin();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ConnectivityControlImpl <em>Connectivity Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ConnectivityControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectivityControl()
		 * @generated
		 */
		EClass CONNECTIVITY_CONTROL = eINSTANCE.getConnectivityControl();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTIVITY_CONTROL__CONSTRAINTS = eINSTANCE.getConnectivityControl_Constraints();

		/**
		 * The meta object literal for the '<em><b>Mainboard</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTIVITY_CONTROL__MAINBOARD = eINSTANCE.getConnectivityControl_Mainboard();

		/**
		 * The meta object literal for the '<em><b>Get Pins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTIVITY_CONTROL___GET_PINS = eINSTANCE.getConnectivityControl__GetPins();

		/**
		 * The meta object literal for the '<em><b>Get Pin Connecteds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTIVITY_CONTROL___GET_PIN_CONNECTEDS = eINSTANCE.getConnectivityControl__GetPinConnecteds();

		/**
		 * The meta object literal for the '<em><b>Modify Pin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTIVITY_CONTROL___MODIFY_PIN__PIN = eINSTANCE.getConnectivityControl__ModifyPin__Pin();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StateControlImpl <em>State Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StateControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateControl()
		 * @generated
		 */
		EClass STATE_CONTROL = eINSTANCE.getStateControl();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_CONTROL__CONSTRAINTS = eINSTANCE.getStateControl_Constraints();

		/**
		 * The meta object literal for the '<em><b>Incomings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONTROL__INCOMINGS = eINSTANCE.getStateControl_Incomings();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_CONTROL__OUTGOINGS = eINSTANCE.getStateControl_Outgoings();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.DataControlImpl <em>Data Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.DataControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDataControl()
		 * @generated
		 */
		EClass DATA_CONTROL = eINSTANCE.getDataControl();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTROL__CONSTRAINTS = eINSTANCE.getDataControl_Constraints();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTROL__LOCATION = eINSTANCE.getDataControl_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTROL__TYPE = eINSTANCE.getDataControl_Type();

		/**
		 * The meta object literal for the '<em><b>Data Explorer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONTROL__DATA_EXPLORER = eINSTANCE.getDataControl_DataExplorer();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.DataExplorerImpl <em>Data Explorer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.DataExplorerImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDataExplorer()
		 * @generated
		 */
		EClass DATA_EXPLORER = eINSTANCE.getDataExplorer();

		/**
		 * The meta object literal for the '<em><b>Datas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXPLORER__DATAS = eINSTANCE.getDataExplorer_Datas();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ConnectionImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BENDPOINTS = eINSTANCE.getConnection_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Router Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ROUTER_KIND = eINSTANCE.getConnection_RouterKind();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__SOURCE = eINSTANCE.getConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TARGET = eINSTANCE.getConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__KIND = eINSTANCE.getConnection_Kind();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__LABEL = eINSTANCE.getConnection_Label();

		/**
		 * The meta object literal for the '<em><b>State Schema</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__STATE_SCHEMA = eINSTANCE.getConnection_StateSchema();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StateSchemaImpl <em>State Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StateSchemaImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateSchema()
		 * @generated
		 */
		EClass STATE_SCHEMA = eINSTANCE.getStateSchema();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SCHEMA__CONTROLS = eINSTANCE.getStateSchema_Controls();

		/**
		 * The meta object literal for the '<em><b>Connnections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_SCHEMA__CONNNECTIONS = eINSTANCE.getStateSchema_Connnections();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.InputControlImpl <em>Input Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.InputControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getInputControl()
		 * @generated
		 */
		EClass INPUT_CONTROL = eINSTANCE.getInputControl();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.OutputControlImpl <em>Output Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.OutputControlImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getOutputControl()
		 * @generated
		 */
		EClass OUTPUT_CONTROL = eINSTANCE.getOutputControl();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.Keypad4x4Impl <em>Keypad4x4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.Keypad4x4Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getKeypad4x4()
		 * @generated
		 */
		EClass KEYPAD4X4 = eINSTANCE.getKeypad4x4();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__KEYS = eINSTANCE.getKeypad4x4_Keys();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__ROWS = eINSTANCE.getKeypad4x4_Rows();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__COLS = eINSTANCE.getKeypad4x4_Cols();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN1 = eINSTANCE.getKeypad4x4_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN2 = eINSTANCE.getKeypad4x4_Pin2();

		/**
		 * The meta object literal for the '<em><b>Pin3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN3 = eINSTANCE.getKeypad4x4_Pin3();

		/**
		 * The meta object literal for the '<em><b>Pin4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN4 = eINSTANCE.getKeypad4x4_Pin4();

		/**
		 * The meta object literal for the '<em><b>Pin5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN5 = eINSTANCE.getKeypad4x4_Pin5();

		/**
		 * The meta object literal for the '<em><b>Pin6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN6 = eINSTANCE.getKeypad4x4_Pin6();

		/**
		 * The meta object literal for the '<em><b>Pin7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN7 = eINSTANCE.getKeypad4x4_Pin7();

		/**
		 * The meta object literal for the '<em><b>Pin8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__PIN8 = eINSTANCE.getKeypad4x4_Pin8();

		/**
		 * The meta object literal for the '<em><b>Name Button1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON1 = eINSTANCE.getKeypad4x4_NameButton1();

		/**
		 * The meta object literal for the '<em><b>Name Button2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON2 = eINSTANCE.getKeypad4x4_NameButton2();

		/**
		 * The meta object literal for the '<em><b>Name Button3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON3 = eINSTANCE.getKeypad4x4_NameButton3();

		/**
		 * The meta object literal for the '<em><b>Name Button4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON4 = eINSTANCE.getKeypad4x4_NameButton4();

		/**
		 * The meta object literal for the '<em><b>Name Button5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON5 = eINSTANCE.getKeypad4x4_NameButton5();

		/**
		 * The meta object literal for the '<em><b>Name Button6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON6 = eINSTANCE.getKeypad4x4_NameButton6();

		/**
		 * The meta object literal for the '<em><b>Name Button7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON7 = eINSTANCE.getKeypad4x4_NameButton7();

		/**
		 * The meta object literal for the '<em><b>Name Button8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON8 = eINSTANCE.getKeypad4x4_NameButton8();

		/**
		 * The meta object literal for the '<em><b>Name Button9</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON9 = eINSTANCE.getKeypad4x4_NameButton9();

		/**
		 * The meta object literal for the '<em><b>Name Button0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON0 = eINSTANCE.getKeypad4x4_NameButton0();

		/**
		 * The meta object literal for the '<em><b>Name Button A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_A = eINSTANCE.getKeypad4x4_NameButtonA();

		/**
		 * The meta object literal for the '<em><b>Name Button B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_B = eINSTANCE.getKeypad4x4_NameButtonB();

		/**
		 * The meta object literal for the '<em><b>Name Button C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_C = eINSTANCE.getKeypad4x4_NameButtonC();

		/**
		 * The meta object literal for the '<em><b>Name Button D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_D = eINSTANCE.getKeypad4x4_NameButtonD();

		/**
		 * The meta object literal for the '<em><b>Name Button Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_HASH = eINSTANCE.getKeypad4x4_NameButtonHash();

		/**
		 * The meta object literal for the '<em><b>Name Button Asterisk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYPAD4X4__NAME_BUTTON_ASTERISK = eINSTANCE.getKeypad4x4_NameButtonAsterisk();

		/**
		 * The meta object literal for the '<em><b>Get Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation KEYPAD4X4___GET_BUTTON__STRING = eINSTANCE.getKeypad4x4__GetButton__String();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.LEDImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__PIN1 = eINSTANCE.getLED_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__PIN2 = eINSTANCE.getLED_Pin2();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.I2CLCD2004Impl <em>I2CLCD2004</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.I2CLCD2004Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getI2CLCD2004()
		 * @generated
		 */
		EClass I2CLCD2004 = eINSTANCE.getI2CLCD2004();

		/**
		 * The meta object literal for the '<em><b>Pin GND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD2004__PIN_GND = eINSTANCE.getI2CLCD2004_PinGND();

		/**
		 * The meta object literal for the '<em><b>Pin Vcc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD2004__PIN_VCC = eINSTANCE.getI2CLCD2004_PinVcc();

		/**
		 * The meta object literal for the '<em><b>Pin SDA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD2004__PIN_SDA = eINSTANCE.getI2CLCD2004_PinSDA();

		/**
		 * The meta object literal for the '<em><b>Pin SCL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I2CLCD2004__PIN_SCL = eINSTANCE.getI2CLCD2004_PinSCL();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StateFrameImpl <em>State Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StateFrameImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStateFrame()
		 * @generated
		 */
		EClass STATE_FRAME = eINSTANCE.getStateFrame();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_FRAME__CONTENT = eINSTANCE.getStateFrame_Content();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.DecisionImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.StartPointImpl <em>Start Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.StartPointImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getStartPoint()
		 * @generated
		 */
		EClass START_POINT = eINSTANCE.getStartPoint();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.EndPointImpl <em>End Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.EndPointImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getEndPoint()
		 * @generated
		 */
		EClass END_POINT = eINSTANCE.getEndPoint();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.BluetoothHC06Impl <em>Bluetooth HC06</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.BluetoothHC06Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBluetoothHC06()
		 * @generated
		 */
		EClass BLUETOOTH_HC06 = eINSTANCE.getBluetoothHC06();

		/**
		 * The meta object literal for the '<em><b>Pin TXD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_TXD = eINSTANCE.getBluetoothHC06_PinTXD();

		/**
		 * The meta object literal for the '<em><b>Pin RXD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_RXD = eINSTANCE.getBluetoothHC06_PinRXD();

		/**
		 * The meta object literal for the '<em><b>Pin GND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_GND = eINSTANCE.getBluetoothHC06_PinGND();

		/**
		 * The meta object literal for the '<em><b>Pin VCC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_HC06__PIN_VCC = eINSTANCE.getBluetoothHC06_PinVCC();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.WifiESP8266Impl <em>Wifi ESP8266</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.WifiESP8266Impl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getWifiESP8266()
		 * @generated
		 */
		EClass WIFI_ESP8266 = eINSTANCE.getWifiESP8266();

		/**
		 * The meta object literal for the '<em><b>Pin TX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_TX = eINSTANCE.getWifiESP8266_PinTX();

		/**
		 * The meta object literal for the '<em><b>Pin RX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_RX = eINSTANCE.getWifiESP8266_PinRX();

		/**
		 * The meta object literal for the '<em><b>Pin Vcc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_VCC = eINSTANCE.getWifiESP8266_PinVcc();

		/**
		 * The meta object literal for the '<em><b>Pin GND</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_GND = eINSTANCE.getWifiESP8266_PinGND();

		/**
		 * The meta object literal for the '<em><b>Pin CHPD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PIN_CHPD = eINSTANCE.getWifiESP8266_PinCHPD();

		/**
		 * The meta object literal for the '<em><b>SSID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__SSID = eINSTANCE.getWifiESP8266_SSID();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PASSWORD = eINSTANCE.getWifiESP8266_Password();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__HOST = eINSTANCE.getWifiESP8266_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIFI_ESP8266__PORT = eINSTANCE.getWifiESP8266_Port();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.ButtonImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__PIN1 = eINSTANCE.getButton_Pin1();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.ConnectionKind <em>Connection Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.ConnectionKind
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getConnectionKind()
		 * @generated
		 */
		EEnum CONNECTION_KIND = eINSTANCE.getConnectionKind();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.RouterKind <em>Router Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.RouterKind
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRouterKind()
		 * @generated
		 */
		EEnum ROUTER_KIND = eINSTANCE.getRouterKind();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.TypeData <em>Type Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.TypeData
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getTypeData()
		 * @generated
		 */
		EEnum TYPE_DATA = eINSTANCE.getTypeData();

		/**
		 * The meta object literal for the '{@link iotwearable.model.iotw.impl.BuzzerImpl <em>Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.impl.BuzzerImpl
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getBuzzer()
		 * @generated
		 */
		EClass BUZZER = eINSTANCE.getBuzzer();

		/**
		 * The meta object literal for the '<em><b>Pin1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZER__PIN1 = eINSTANCE.getBuzzer_Pin1();

		/**
		 * The meta object literal for the '<em><b>Pin2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUZZER__PIN2 = eINSTANCE.getBuzzer_Pin2();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Pin</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iotwearable.model.iotw.Pin
		 * @see iotwearable.model.iotw.impl.IotwPackageImpl#getPin()
		 * @generated
		 */
		EDataType PIN = eINSTANCE.getPin();

	}

} //IotwPackage
