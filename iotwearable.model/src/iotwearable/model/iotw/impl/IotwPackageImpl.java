/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.BluetoothHC06;
import iotwearable.model.iotw.Button;
import iotwearable.model.iotw.Buzzer;
import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.ConnectionKind;
import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.Control;
import iotwearable.model.iotw.DataControl;
import iotwearable.model.iotw.DataExplorer;
import iotwearable.model.iotw.Decision;
import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.InputControl;
import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Keypad4x4;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.OutputControl;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.RouterKind;
import iotwearable.model.iotw.StartPoint;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateFrame;
import iotwearable.model.iotw.StateSchema;
import iotwearable.model.iotw.TypeData;
import iotwearable.model.iotw.WifiESP8266;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IotwPackageImpl extends EPackageImpl implements IotwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoUNOR3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectivityControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExplorerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keypad4x4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i2CLCD2004EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateFrameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothHC06EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wifiESP8266EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routerKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pinEDataType = null;

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
	 * @see iotwearable.model.iotw.IotwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IotwPackageImpl() {
		super(eNS_URI, IotwFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IotwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IotwPackage init() {
		if (isInited) return (IotwPackage)EPackage.Registry.INSTANCE.getEPackage(IotwPackage.eNS_URI);

		// Obtain or create and register package
		IotwPackageImpl theIotwPackage = (IotwPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IotwPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IotwPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIotwPackage.createPackageContents();

		// Initialize created meta-data
		theIotwPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIotwPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IotwPackage.eNS_URI, theIotwPackage);
		return theIotwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainboard() {
		return mainboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainboard_Controls() {
		return (EReference)mainboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMainboard_Connectivities() {
		return (EReference)mainboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainboard_Name() {
		return (EAttribute)mainboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__AddControl__IOControl() {
		return mainboardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__GetPins() {
		return mainboardEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__GetPinConnecteds() {
		return mainboardEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__ModifyPin__Pin() {
		return mainboardEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__FindPin__Pin() {
		return mainboardEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoUNOR3() {
		return arduinoUNOR3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin0() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin1() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin2() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin3() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin4() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin5() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin6() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin7() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin8() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin9() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin10() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin11() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin12() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_Pin13() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA0() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA1() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA2() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA3() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA4() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoUNOR3_PinA5() {
		return (EAttribute)arduinoUNOR3EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__RemoveControl__IOControl() {
		return mainboardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__AddConnectivity__ConnectivityControl() {
		return mainboardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainboard__RemoveConnectivity__ConnectivityControl() {
		return mainboardEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Name() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Id() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOControl() {
		return ioControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIOControl_Constraints() {
		return (EAttribute)ioControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOControl_Mainboard() {
		return (EReference)ioControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOControl__GetPins() {
		return ioControlEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOControl__GetPinConnecteds() {
		return ioControlEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIOControl__ModifyPin__Pin() {
		return ioControlEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectivityControl() {
		return connectivityControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectivityControl_Constraints() {
		return (EAttribute)connectivityControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectivityControl_Mainboard() {
		return (EReference)connectivityControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectivityControl__GetPins() {
		return connectivityControlEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectivityControl__GetPinConnecteds() {
		return connectivityControlEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectivityControl__ModifyPin__Pin() {
		return connectivityControlEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateControl() {
		return stateControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateControl_Constraints() {
		return (EAttribute)stateControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateControl_Incomings() {
		return (EReference)stateControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateControl_Outgoings() {
		return (EReference)stateControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataControl() {
		return dataControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataControl_Constraints() {
		return (EAttribute)dataControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataControl_Location() {
		return (EAttribute)dataControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataControl_Type() {
		return (EAttribute)dataControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataControl_DataExplorer() {
		return (EReference)dataControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExplorer() {
		return dataExplorerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataExplorer_Datas() {
		return (EReference)dataExplorerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Bendpoints() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_RouterKind() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Source() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Target() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Kind() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnection_Label() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_StateSchema() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateSchema() {
		return stateSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSchema_Controls() {
		return (EReference)stateSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateSchema_Connnections() {
		return (EReference)stateSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputControl() {
		return inputControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputControl() {
		return outputControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeypad4x4() {
		return keypad4x4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Keys() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Rows() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Cols() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin1() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin2() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin3() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin4() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin5() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin6() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin7() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_Pin8() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton1() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton2() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton3() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton4() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton5() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton6() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton7() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton8() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton9() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButton0() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonA() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonB() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonC() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonD() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonHash() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeypad4x4_NameButtonAsterisk() {
		return (EAttribute)keypad4x4EClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeypad4x4__GetButton__String() {
		return keypad4x4EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Pin1() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Pin2() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getI2CLCD2004() {
		return i2CLCD2004EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD2004_PinGND() {
		return (EAttribute)i2CLCD2004EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD2004_PinVcc() {
		return (EAttribute)i2CLCD2004EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD2004_PinSDA() {
		return (EAttribute)i2CLCD2004EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getI2CLCD2004_PinSCL() {
		return (EAttribute)i2CLCD2004EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateFrame() {
		return stateFrameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateFrame_Content() {
		return (EAttribute)stateFrameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartPoint() {
		return startPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndPoint() {
		return endPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothHC06() {
		return bluetoothHC06EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinTXD() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinRXD() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinGND() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothHC06_PinVCC() {
		return (EAttribute)bluetoothHC06EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWifiESP8266() {
		return wifiESP8266EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinTX() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinRX() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinVcc() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinGND() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_PinCHPD() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_SSID() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Password() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Host() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWifiESP8266_Port() {
		return (EAttribute)wifiESP8266EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Pin1() {
		return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionKind() {
		return connectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouterKind() {
		return routerKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeData() {
		return typeDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzer() {
		return buzzerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzer_Pin1() {
		return (EAttribute)buzzerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuzzer_Pin2() {
		return (EAttribute)buzzerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPin() {
		return pinEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwFactory getIotwFactory() {
		return (IotwFactory)getEFactoryInstance();
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
		controlEClass = createEClass(CONTROL);
		createEAttribute(controlEClass, CONTROL__NAME);
		createEAttribute(controlEClass, CONTROL__ID);

		ioControlEClass = createEClass(IO_CONTROL);
		createEAttribute(ioControlEClass, IO_CONTROL__CONSTRAINTS);
		createEReference(ioControlEClass, IO_CONTROL__MAINBOARD);
		createEOperation(ioControlEClass, IO_CONTROL___GET_PINS);
		createEOperation(ioControlEClass, IO_CONTROL___GET_PIN_CONNECTEDS);
		createEOperation(ioControlEClass, IO_CONTROL___MODIFY_PIN__PIN);

		connectivityControlEClass = createEClass(CONNECTIVITY_CONTROL);
		createEAttribute(connectivityControlEClass, CONNECTIVITY_CONTROL__CONSTRAINTS);
		createEReference(connectivityControlEClass, CONNECTIVITY_CONTROL__MAINBOARD);
		createEOperation(connectivityControlEClass, CONNECTIVITY_CONTROL___GET_PINS);
		createEOperation(connectivityControlEClass, CONNECTIVITY_CONTROL___GET_PIN_CONNECTEDS);
		createEOperation(connectivityControlEClass, CONNECTIVITY_CONTROL___MODIFY_PIN__PIN);

		stateControlEClass = createEClass(STATE_CONTROL);
		createEAttribute(stateControlEClass, STATE_CONTROL__CONSTRAINTS);
		createEReference(stateControlEClass, STATE_CONTROL__INCOMINGS);
		createEReference(stateControlEClass, STATE_CONTROL__OUTGOINGS);

		dataControlEClass = createEClass(DATA_CONTROL);
		createEAttribute(dataControlEClass, DATA_CONTROL__CONSTRAINTS);
		createEAttribute(dataControlEClass, DATA_CONTROL__LOCATION);
		createEAttribute(dataControlEClass, DATA_CONTROL__TYPE);
		createEReference(dataControlEClass, DATA_CONTROL__DATA_EXPLORER);

		dataExplorerEClass = createEClass(DATA_EXPLORER);
		createEReference(dataExplorerEClass, DATA_EXPLORER__DATAS);

		mainboardEClass = createEClass(MAINBOARD);
		createEReference(mainboardEClass, MAINBOARD__CONTROLS);
		createEReference(mainboardEClass, MAINBOARD__CONNECTIVITIES);
		createEAttribute(mainboardEClass, MAINBOARD__NAME);
		createEOperation(mainboardEClass, MAINBOARD___ADD_CONTROL__IOCONTROL);
		createEOperation(mainboardEClass, MAINBOARD___REMOVE_CONTROL__IOCONTROL);
		createEOperation(mainboardEClass, MAINBOARD___ADD_CONNECTIVITY__CONNECTIVITYCONTROL);
		createEOperation(mainboardEClass, MAINBOARD___REMOVE_CONNECTIVITY__CONNECTIVITYCONTROL);
		createEOperation(mainboardEClass, MAINBOARD___GET_PINS);
		createEOperation(mainboardEClass, MAINBOARD___GET_PIN_CONNECTEDS);
		createEOperation(mainboardEClass, MAINBOARD___MODIFY_PIN__PIN);
		createEOperation(mainboardEClass, MAINBOARD___FIND_PIN__PIN);

		stateSchemaEClass = createEClass(STATE_SCHEMA);
		createEReference(stateSchemaEClass, STATE_SCHEMA__CONTROLS);
		createEReference(stateSchemaEClass, STATE_SCHEMA__CONNNECTIONS);

		arduinoUNOR3EClass = createEClass(ARDUINO_UNOR3);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN0);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN1);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN2);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN3);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN4);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN5);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN6);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN7);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN8);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN9);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN10);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN11);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN12);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN13);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A0);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A1);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A2);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A3);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A4);
		createEAttribute(arduinoUNOR3EClass, ARDUINO_UNOR3__PIN_A5);

		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__BENDPOINTS);
		createEAttribute(connectionEClass, CONNECTION__ROUTER_KIND);
		createEReference(connectionEClass, CONNECTION__SOURCE);
		createEReference(connectionEClass, CONNECTION__TARGET);
		createEAttribute(connectionEClass, CONNECTION__KIND);
		createEAttribute(connectionEClass, CONNECTION__LABEL);
		createEReference(connectionEClass, CONNECTION__STATE_SCHEMA);

		inputControlEClass = createEClass(INPUT_CONTROL);

		outputControlEClass = createEClass(OUTPUT_CONTROL);

		keypad4x4EClass = createEClass(KEYPAD4X4);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__KEYS);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__ROWS);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__COLS);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN1);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN2);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN3);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN4);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN5);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN6);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN7);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__PIN8);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON1);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON2);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON3);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON4);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON5);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON6);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON7);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON8);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON9);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON0);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_A);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_B);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_C);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_D);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_HASH);
		createEAttribute(keypad4x4EClass, KEYPAD4X4__NAME_BUTTON_ASTERISK);
		createEOperation(keypad4x4EClass, KEYPAD4X4___GET_BUTTON__STRING);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__PIN1);
		createEAttribute(ledEClass, LED__PIN2);

		i2CLCD2004EClass = createEClass(I2CLCD2004);
		createEAttribute(i2CLCD2004EClass, I2CLCD2004__PIN_GND);
		createEAttribute(i2CLCD2004EClass, I2CLCD2004__PIN_VCC);
		createEAttribute(i2CLCD2004EClass, I2CLCD2004__PIN_SDA);
		createEAttribute(i2CLCD2004EClass, I2CLCD2004__PIN_SCL);

		bluetoothHC06EClass = createEClass(BLUETOOTH_HC06);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_TXD);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_RXD);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_GND);
		createEAttribute(bluetoothHC06EClass, BLUETOOTH_HC06__PIN_VCC);

		wifiESP8266EClass = createEClass(WIFI_ESP8266);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_TX);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_RX);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_VCC);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_GND);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PIN_CHPD);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__SSID);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PASSWORD);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__HOST);
		createEAttribute(wifiESP8266EClass, WIFI_ESP8266__PORT);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__PIN1);

		buzzerEClass = createEClass(BUZZER);
		createEAttribute(buzzerEClass, BUZZER__PIN1);
		createEAttribute(buzzerEClass, BUZZER__PIN2);

		stateFrameEClass = createEClass(STATE_FRAME);
		createEAttribute(stateFrameEClass, STATE_FRAME__CONTENT);

		decisionEClass = createEClass(DECISION);

		startPointEClass = createEClass(START_POINT);

		endPointEClass = createEClass(END_POINT);

		// Create enums
		connectionKindEEnum = createEEnum(CONNECTION_KIND);
		routerKindEEnum = createEEnum(ROUTER_KIND);
		typeDataEEnum = createEEnum(TYPE_DATA);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
		pinEDataType = createEDataType(PIN);
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
		ioControlEClass.getESuperTypes().add(this.getControl());
		connectivityControlEClass.getESuperTypes().add(this.getControl());
		stateControlEClass.getESuperTypes().add(this.getControl());
		dataControlEClass.getESuperTypes().add(this.getControl());
		arduinoUNOR3EClass.getESuperTypes().add(this.getMainboard());
		inputControlEClass.getESuperTypes().add(this.getIOControl());
		outputControlEClass.getESuperTypes().add(this.getIOControl());
		keypad4x4EClass.getESuperTypes().add(this.getInputControl());
		ledEClass.getESuperTypes().add(this.getOutputControl());
		i2CLCD2004EClass.getESuperTypes().add(this.getOutputControl());
		bluetoothHC06EClass.getESuperTypes().add(this.getConnectivityControl());
		wifiESP8266EClass.getESuperTypes().add(this.getConnectivityControl());
		buttonEClass.getESuperTypes().add(this.getInputControl());
		buzzerEClass.getESuperTypes().add(this.getOutputControl());
		stateFrameEClass.getESuperTypes().add(this.getStateControl());
		decisionEClass.getESuperTypes().add(this.getStateControl());
		startPointEClass.getESuperTypes().add(this.getStateControl());
		endPointEClass.getESuperTypes().add(this.getStateControl());

		// Initialize classes, features, and operations; add parameters
		initEClass(controlEClass, Control.class, "Control", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Id(), ecorePackage.getEString(), "id", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ioControlEClass, IOControl.class, "IOControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIOControl_Constraints(), this.getRectangle(), "constraints", null, 0, 1, IOControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIOControl_Mainboard(), this.getMainboard(), this.getMainboard_Controls(), "mainboard", null, 0, 1, IOControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIOControl__GetPins(), this.getPin(), "getPins", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIOControl__GetPinConnecteds(), this.getPin(), "getPinConnecteds", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getIOControl__ModifyPin__Pin(), null, "modifyPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(connectivityControlEClass, ConnectivityControl.class, "ConnectivityControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectivityControl_Constraints(), this.getRectangle(), "constraints", null, 0, 1, ConnectivityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectivityControl_Mainboard(), this.getMainboard(), this.getMainboard_Connectivities(), "mainboard", null, 0, 1, ConnectivityControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getConnectivityControl__GetPins(), this.getPin(), "getPins", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnectivityControl__GetPinConnecteds(), this.getPin(), "getPinConnecteds", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnectivityControl__ModifyPin__Pin(), null, "modifyPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateControlEClass, StateControl.class, "StateControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateControl_Constraints(), this.getRectangle(), "constraints", null, 0, 1, StateControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateControl_Incomings(), this.getConnection(), null, "incomings", null, 0, -1, StateControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateControl_Outgoings(), this.getConnection(), null, "outgoings", null, 0, -1, StateControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataControlEClass, DataControl.class, "DataControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataControl_Constraints(), this.getRectangle(), "constraints", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataControl_Location(), ecorePackage.getEString(), "location", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataControl_Type(), this.getTypeData(), "type", "XML", 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataControl_DataExplorer(), this.getDataExplorer(), this.getDataExplorer_Datas(), "dataExplorer", null, 0, 1, DataControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataExplorerEClass, DataExplorer.class, "DataExplorer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataExplorer_Datas(), this.getDataControl(), this.getDataControl_DataExplorer(), "datas", null, 0, -1, DataExplorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainboardEClass, Mainboard.class, "Mainboard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMainboard_Controls(), this.getIOControl(), this.getIOControl_Mainboard(), "controls", null, 0, -1, Mainboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMainboard_Connectivities(), this.getConnectivityControl(), this.getConnectivityControl_Mainboard(), "connectivities", null, 0, -1, Mainboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainboard_Name(), ecorePackage.getEString(), "name", "", 0, 1, Mainboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMainboard__AddControl__IOControl(), null, "addControl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOControl(), "control", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__RemoveControl__IOControl(), null, "removeControl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIOControl(), "control", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__AddConnectivity__ConnectivityControl(), null, "addConnectivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectivityControl(), "control", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__RemoveConnectivity__ConnectivityControl(), null, "removeConnectivity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConnectivityControl(), "control", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMainboard__GetPins(), this.getPin(), "getPins", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMainboard__GetPinConnecteds(), this.getPin(), "getPinConnecteds", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__ModifyPin__Pin(), null, "modifyPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMainboard__FindPin__Pin(), this.getPin(), "findPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPin(), "pin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateSchemaEClass, StateSchema.class, "StateSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateSchema_Controls(), this.getStateControl(), null, "controls", null, 0, -1, StateSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateSchema_Connnections(), this.getConnection(), this.getConnection_StateSchema(), "connnections", null, 0, -1, StateSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arduinoUNOR3EClass, ArduinoUNOR3.class, "ArduinoUNOR3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduinoUNOR3_Pin0(), this.getPin(), "pin0", "0,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin1(), this.getPin(), "pin1", "1,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin2(), this.getPin(), "pin2", "2,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin3(), this.getPin(), "pin3", "3,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin4(), this.getPin(), "pin4", "4,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin5(), this.getPin(), "pin5", "5,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin6(), this.getPin(), "pin6", "6,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin7(), this.getPin(), "pin7", "7,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin8(), this.getPin(), "pin8", "8,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin9(), this.getPin(), "pin9", "9,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin10(), this.getPin(), "pin10", "10,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin11(), this.getPin(), "pin11", "11,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin12(), this.getPin(), "pin12", "12,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_Pin13(), this.getPin(), "pin13", "13,IO", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA0(), this.getPin(), "pinA0", "A0,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA1(), this.getPin(), "pinA1", "A1,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA2(), this.getPin(), "pinA2", "A2,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA3(), this.getPin(), "pinA3", "A3,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA4(), this.getPin(), "pinA4", "A4,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoUNOR3_PinA5(), this.getPin(), "pinA5", "A5,Input", 0, 1, ArduinoUNOR3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_Bendpoints(), this.getPoint(), "bendpoints", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_RouterKind(), this.getRouterKind(), "routerKind", "Bendpoint", 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Source(), this.getControl(), null, "source", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Target(), this.getControl(), null, "target", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Kind(), this.getConnectionKind(), "kind", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Label(), ecorePackage.getEString(), "label", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_StateSchema(), this.getStateSchema(), this.getStateSchema_Connnections(), "stateSchema", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputControlEClass, InputControl.class, "InputControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputControlEClass, OutputControl.class, "OutputControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keypad4x4EClass, Keypad4x4.class, "Keypad4x4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeypad4x4_Keys(), ecorePackage.getEString(), "keys", "{\'1\',\'2\',\'3\',\'A\'},{\'4\',\'5\',\'6\',\'B\'},{\'7\',\'8\',\'9\',\'C\'},{\'*\',\'0\',\'#\',\'D\'}", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Rows(), ecorePackage.getEInt(), "rows", "4", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Cols(), ecorePackage.getEInt(), "cols", "4", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin1(), this.getPin(), "pin1", "R1,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin2(), this.getPin(), "pin2", "R2,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin3(), this.getPin(), "pin3", "R3,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin4(), this.getPin(), "pin4", "R4,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin5(), this.getPin(), "pin5", "C1,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin6(), this.getPin(), "pin6", "C2,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin7(), this.getPin(), "pin7", "C3,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_Pin8(), this.getPin(), "pin8", "C4,IO", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton1(), ecorePackage.getEString(), "nameButton1", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton2(), ecorePackage.getEString(), "nameButton2", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton3(), ecorePackage.getEString(), "nameButton3", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton4(), ecorePackage.getEString(), "nameButton4", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton5(), ecorePackage.getEString(), "nameButton5", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton6(), ecorePackage.getEString(), "nameButton6", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton7(), ecorePackage.getEString(), "nameButton7", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton8(), ecorePackage.getEString(), "nameButton8", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton9(), ecorePackage.getEString(), "nameButton9", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButton0(), ecorePackage.getEString(), "nameButton0", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonA(), ecorePackage.getEString(), "nameButtonA", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonB(), ecorePackage.getEString(), "nameButtonB", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonC(), ecorePackage.getEString(), "nameButtonC", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonD(), ecorePackage.getEString(), "nameButtonD", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonHash(), ecorePackage.getEString(), "nameButtonHash", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeypad4x4_NameButtonAsterisk(), ecorePackage.getEString(), "nameButtonAsterisk", "", 0, 1, Keypad4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getKeypad4x4__GetButton__String(), ecorePackage.getEString(), "getButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ledEClass, iotwearable.model.iotw.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_Pin1(), this.getPin(), "pin1", "1,Passive", 0, 1, iotwearable.model.iotw.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLED_Pin2(), this.getPin(), "pin2", "2,Passive", 0, 1, iotwearable.model.iotw.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(i2CLCD2004EClass, iotwearable.model.iotw.I2CLCD2004.class, "I2CLCD2004", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI2CLCD2004_PinGND(), this.getPin(), "pinGND", "GND,IO", 0, 1, iotwearable.model.iotw.I2CLCD2004.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD2004_PinVcc(), this.getPin(), "pinVcc", "Vcc,IO", 0, 1, iotwearable.model.iotw.I2CLCD2004.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD2004_PinSDA(), this.getPin(), "pinSDA", "SDA,IO", 0, 1, iotwearable.model.iotw.I2CLCD2004.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getI2CLCD2004_PinSCL(), this.getPin(), "pinSCL", "SCL,IO", 0, 1, iotwearable.model.iotw.I2CLCD2004.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bluetoothHC06EClass, BluetoothHC06.class, "BluetoothHC06", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBluetoothHC06_PinTXD(), this.getPin(), "pinTXD", "TXD,IO", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothHC06_PinRXD(), this.getPin(), "pinRXD", "RXD,IO", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothHC06_PinGND(), this.getPin(), "pinGND", "GND,Power", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBluetoothHC06_PinVCC(), this.getPin(), "pinVCC", "VCC,Power", 0, 1, BluetoothHC06.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wifiESP8266EClass, WifiESP8266.class, "WifiESP8266", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWifiESP8266_PinTX(), this.getPin(), "pinTX", "TX,IO", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinRX(), this.getPin(), "pinRX", "RX,IO", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinVcc(), this.getPin(), "pinVcc", "Vcc,Power", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinGND(), this.getPin(), "pinGND", "GND,Power", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_PinCHPD(), this.getPin(), "pinCHPD", "CHPD,Power", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_SSID(), ecorePackage.getEString(), "SSID", "IotWearable", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Password(), ecorePackage.getEString(), "Password", "IotWearable", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Host(), ecorePackage.getEString(), "Host", "192.168.200.46", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWifiESP8266_Port(), ecorePackage.getEInt(), "Port", "8080", 0, 1, WifiESP8266.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_Pin1(), this.getPin(), "pin1", "1,IO", 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buzzerEClass, Buzzer.class, "Buzzer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBuzzer_Pin1(), this.getPin(), "pin1", "1,Passive", 0, 1, Buzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuzzer_Pin2(), this.getPin(), "pin2", "2,Passive", 0, 1, Buzzer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateFrameEClass, StateFrame.class, "StateFrame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateFrame_Content(), ecorePackage.getEString(), "content", null, 0, 1, StateFrame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startPointEClass, StartPoint.class, "StartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(connectionKindEEnum, ConnectionKind.class, "ConnectionKind");
		addEEnumLiteral(connectionKindEEnum, ConnectionKind.STATE_FLOW);

		initEEnum(routerKindEEnum, RouterKind.class, "RouterKind");
		addEEnumLiteral(routerKindEEnum, RouterKind.BENDPOINT);
		addEEnumLiteral(routerKindEEnum, RouterKind.MANHATTAN);

		initEEnum(typeDataEEnum, TypeData.class, "TypeData");
		addEEnumLiteral(typeDataEEnum, TypeData.XML);
		addEEnumLiteral(typeDataEEnum, TypeData.JSON);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pinEDataType, Pin.class, "Pin", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //IotwPackageImpl
