/**
 */
package iotwearable.model.iotw.util;

import iotwearable.model.iotw.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see iotwearable.model.iotw.IotwPackage
 * @generated
 */
public class IotwSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IotwPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IotwSwitch() {
		if (modelPackage == null) {
			modelPackage = IotwPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case IotwPackage.CONTROL: {
				Control control = (Control)theEObject;
				T result = caseControl(control);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.IO_CONTROL: {
				IOControl ioControl = (IOControl)theEObject;
				T result = caseIOControl(ioControl);
				if (result == null) result = caseControl(ioControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.CONNECTIVITY_CONTROL: {
				ConnectivityControl connectivityControl = (ConnectivityControl)theEObject;
				T result = caseConnectivityControl(connectivityControl);
				if (result == null) result = caseControl(connectivityControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.STATE_CONTROL: {
				StateControl stateControl = (StateControl)theEObject;
				T result = caseStateControl(stateControl);
				if (result == null) result = caseControl(stateControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.DATA_CONTROL: {
				DataControl dataControl = (DataControl)theEObject;
				T result = caseDataControl(dataControl);
				if (result == null) result = caseControl(dataControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.DATA_EXPLORER: {
				DataExplorer dataExplorer = (DataExplorer)theEObject;
				T result = caseDataExplorer(dataExplorer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.MAINBOARD: {
				Mainboard mainboard = (Mainboard)theEObject;
				T result = caseMainboard(mainboard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.STATE_SCHEMA: {
				StateSchema stateSchema = (StateSchema)theEObject;
				T result = caseStateSchema(stateSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.ARDUINO_UNOR3: {
				ArduinoUNOR3 arduinoUNOR3 = (ArduinoUNOR3)theEObject;
				T result = caseArduinoUNOR3(arduinoUNOR3);
				if (result == null) result = caseMainboard(arduinoUNOR3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.INPUT_CONTROL: {
				InputControl inputControl = (InputControl)theEObject;
				T result = caseInputControl(inputControl);
				if (result == null) result = caseIOControl(inputControl);
				if (result == null) result = caseControl(inputControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.OUTPUT_CONTROL: {
				OutputControl outputControl = (OutputControl)theEObject;
				T result = caseOutputControl(outputControl);
				if (result == null) result = caseIOControl(outputControl);
				if (result == null) result = caseControl(outputControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.KEYPAD4X4: {
				Keypad4x4 keypad4x4 = (Keypad4x4)theEObject;
				T result = caseKeypad4x4(keypad4x4);
				if (result == null) result = caseInputControl(keypad4x4);
				if (result == null) result = caseIOControl(keypad4x4);
				if (result == null) result = caseControl(keypad4x4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.LED: {
				LED led = (LED)theEObject;
				T result = caseLED(led);
				if (result == null) result = caseOutputControl(led);
				if (result == null) result = caseIOControl(led);
				if (result == null) result = caseControl(led);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.I2CLCD2004: {
				I2CLCD2004 i2CLCD2004 = (I2CLCD2004)theEObject;
				T result = caseI2CLCD2004(i2CLCD2004);
				if (result == null) result = caseOutputControl(i2CLCD2004);
				if (result == null) result = caseIOControl(i2CLCD2004);
				if (result == null) result = caseControl(i2CLCD2004);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.BLUETOOTH_HC06: {
				BluetoothHC06 bluetoothHC06 = (BluetoothHC06)theEObject;
				T result = caseBluetoothHC06(bluetoothHC06);
				if (result == null) result = caseConnectivityControl(bluetoothHC06);
				if (result == null) result = caseControl(bluetoothHC06);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.WIFI_ESP8266: {
				WifiESP8266 wifiESP8266 = (WifiESP8266)theEObject;
				T result = caseWifiESP8266(wifiESP8266);
				if (result == null) result = caseConnectivityControl(wifiESP8266);
				if (result == null) result = caseControl(wifiESP8266);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.BUTTON: {
				Button button = (Button)theEObject;
				T result = caseButton(button);
				if (result == null) result = caseInputControl(button);
				if (result == null) result = caseIOControl(button);
				if (result == null) result = caseControl(button);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.BUZZER: {
				Buzzer buzzer = (Buzzer)theEObject;
				T result = caseBuzzer(buzzer);
				if (result == null) result = caseOutputControl(buzzer);
				if (result == null) result = caseIOControl(buzzer);
				if (result == null) result = caseControl(buzzer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.STATE_FRAME: {
				StateFrame stateFrame = (StateFrame)theEObject;
				T result = caseStateFrame(stateFrame);
				if (result == null) result = caseStateControl(stateFrame);
				if (result == null) result = caseControl(stateFrame);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = caseStateControl(decision);
				if (result == null) result = caseControl(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.START_POINT: {
				StartPoint startPoint = (StartPoint)theEObject;
				T result = caseStartPoint(startPoint);
				if (result == null) result = caseStateControl(startPoint);
				if (result == null) result = caseControl(startPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IotwPackage.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = caseStateControl(endPoint);
				if (result == null) result = caseControl(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainboard(Mainboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arduino UNOR3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arduino UNOR3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArduinoUNOR3(ArduinoUNOR3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControl(Control object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControl(IOControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectivity Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectivity Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectivityControl(ConnectivityControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateControl(StateControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataControl(DataControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Explorer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Explorer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExplorer(DataExplorer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateSchema(StateSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputControl(InputControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputControl(OutputControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keypad4x4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keypad4x4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeypad4x4(Keypad4x4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I2CLCD2004</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I2CLCD2004</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI2CLCD2004(I2CLCD2004 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Frame</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Frame</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateFrame(StateFrame object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPoint(StartPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth HC06</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth HC06</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBluetoothHC06(BluetoothHC06 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wifi ESP8266</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wifi ESP8266</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWifiESP8266(WifiESP8266 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buzzer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buzzer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuzzer(Buzzer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //IotwSwitch
