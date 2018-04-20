/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.IotwFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Pin;
import iotwearable.model.iotw.WifiESP8266;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wifi ESP8266</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinTX <em>Pin TX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinRX <em>Pin RX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPinCHPD <em>Pin CHPD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getSSID <em>SSID</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPassword <em>Password</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getHost <em>Host</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.WifiESP8266Impl#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WifiESP8266Impl extends ConnectivityControlImpl implements WifiESP8266 {
	/**
	 * The default value of the '{@link #getPinTX() <em>Pin TX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinTX()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_TX_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "TX,IO");

	/**
	 * The cached value of the '{@link #getPinTX() <em>Pin TX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinTX()
	 * @generated
	 * @ordered
	 */
	protected Pin pinTX = PIN_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinRX() <em>Pin RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinRX()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_RX_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "RX,IO");

	/**
	 * The cached value of the '{@link #getPinRX() <em>Pin RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinRX()
	 * @generated
	 * @ordered
	 */
	protected Pin pinRX = PIN_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_VCC_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "Vcc,Power");

	/**
	 * The cached value of the '{@link #getPinVcc() <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinVcc()
	 * @generated
	 * @ordered
	 */
	protected Pin pinVcc = PIN_VCC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_GND_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "GND,Power");

	/**
	 * The cached value of the '{@link #getPinGND() <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinGND()
	 * @generated
	 * @ordered
	 */
	protected Pin pinGND = PIN_GND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinCHPD() <em>Pin CHPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinCHPD()
	 * @generated
	 * @ordered
	 */
	protected static final Pin PIN_CHPD_EDEFAULT = (Pin)IotwFactory.eINSTANCE.createFromString(IotwPackage.eINSTANCE.getPin(), "CHPD,Power");

	/**
	 * The cached value of the '{@link #getPinCHPD() <em>Pin CHPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinCHPD()
	 * @generated
	 * @ordered
	 */
	protected Pin pinCHPD = PIN_CHPD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSID() <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = "IotWearable";

	/**
	 * The cached value of the '{@link #getSSID() <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSID()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = "IotWearable";

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = "192.168.200.46";

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 8080;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WifiESP8266Impl() {
		super();
		this.name ="Wifi ESP8266";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.WIFI_ESP8266;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinTX() {
		return pinTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinTX(Pin newPinTX) {
		Pin oldPinTX = pinTX;
		pinTX = newPinTX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_TX, oldPinTX, pinTX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinRX() {
		return pinRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinRX(Pin newPinRX) {
		Pin oldPinRX = pinRX;
		pinRX = newPinRX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_RX, oldPinRX, pinRX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinVcc() {
		return pinVcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinVcc(Pin newPinVcc) {
		Pin oldPinVcc = pinVcc;
		pinVcc = newPinVcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_VCC, oldPinVcc, pinVcc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinGND() {
		return pinGND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinGND(Pin newPinGND) {
		Pin oldPinGND = pinGND;
		pinGND = newPinGND;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_GND, oldPinGND, pinGND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getPinCHPD() {
		return pinCHPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinCHPD(Pin newPinCHPD) {
		Pin oldPinCHPD = pinCHPD;
		pinCHPD = newPinCHPD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PIN_CHPD, oldPinCHPD, pinCHPD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSSID() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSSID(String newSSID) {
		String oldSSID = ssid;
		ssid = newSSID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__SSID, oldSSID, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.WIFI_ESP8266__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				return getPinTX();
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				return getPinRX();
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				return getPinVcc();
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				return getPinGND();
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				return getPinCHPD();
			case IotwPackage.WIFI_ESP8266__SSID:
				return getSSID();
			case IotwPackage.WIFI_ESP8266__PASSWORD:
				return getPassword();
			case IotwPackage.WIFI_ESP8266__HOST:
				return getHost();
			case IotwPackage.WIFI_ESP8266__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				setPinTX((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				setPinRX((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				setPinVcc((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				setPinGND((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				setPinCHPD((Pin)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__SSID:
				setSSID((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PASSWORD:
				setPassword((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__HOST:
				setHost((String)newValue);
				return;
			case IotwPackage.WIFI_ESP8266__PORT:
				setPort((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				setPinTX(PIN_TX_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				setPinRX(PIN_RX_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				setPinVcc(PIN_VCC_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				setPinGND(PIN_GND_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				setPinCHPD(PIN_CHPD_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__SSID:
				setSSID(SSID_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case IotwPackage.WIFI_ESP8266__PORT:
				setPort(PORT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IotwPackage.WIFI_ESP8266__PIN_TX:
				return PIN_TX_EDEFAULT == null ? pinTX != null : !PIN_TX_EDEFAULT.equals(pinTX);
			case IotwPackage.WIFI_ESP8266__PIN_RX:
				return PIN_RX_EDEFAULT == null ? pinRX != null : !PIN_RX_EDEFAULT.equals(pinRX);
			case IotwPackage.WIFI_ESP8266__PIN_VCC:
				return PIN_VCC_EDEFAULT == null ? pinVcc != null : !PIN_VCC_EDEFAULT.equals(pinVcc);
			case IotwPackage.WIFI_ESP8266__PIN_GND:
				return PIN_GND_EDEFAULT == null ? pinGND != null : !PIN_GND_EDEFAULT.equals(pinGND);
			case IotwPackage.WIFI_ESP8266__PIN_CHPD:
				return PIN_CHPD_EDEFAULT == null ? pinCHPD != null : !PIN_CHPD_EDEFAULT.equals(pinCHPD);
			case IotwPackage.WIFI_ESP8266__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case IotwPackage.WIFI_ESP8266__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case IotwPackage.WIFI_ESP8266__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case IotwPackage.WIFI_ESP8266__PORT:
				return port != PORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pinTX: ");
		result.append(pinTX);
		result.append(", pinRX: ");
		result.append(pinRX);
		result.append(", pinVcc: ");
		result.append(pinVcc);
		result.append(", pinGND: ");
		result.append(pinGND);
		result.append(", pinCHPD: ");
		result.append(pinCHPD);
		result.append(", SSID: ");
		result.append(ssid);
		result.append(", Password: ");
		result.append(password);
		result.append(", Host: ");
		result.append(host);
		result.append(", Port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}
	@Override
	public EList<Pin> getPins() {
		EList<Pin> pins = new BasicEList<Pin>();
		pins.add(pinTX);
		pins.add(pinRX);
		pins.add(pinGND);
		pins.add(pinVcc);
		return pins;
	}
	@Override
	public void modifyPin(Pin pin) {
		if(pin.getName().equals(pinRX.getName())){
			setPinRX(pin);
		}
		else if(pin.getName().equals(pinTX.getName())){
			setPinTX(pin);
		}
		else if(pin.getName().equals(pinGND.getName())){
			setPinGND(pin);
		}
		else if(pin.getName().equals(pinVcc.getName())){
			setPinVcc(pin);
		}
	}
} //WifiESP8266Impl
