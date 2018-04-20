/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wifi ESP8266</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinTX <em>Pin TX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinRX <em>Pin RX</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinVcc <em>Pin Vcc</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinGND <em>Pin GND</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPinCHPD <em>Pin CHPD</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getSSID <em>SSID</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPassword <em>Password</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getHost <em>Host</em>}</li>
 *   <li>{@link iotwearable.model.iotw.WifiESP8266#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266()
 * @model
 * @generated
 */
public interface WifiESP8266 extends ConnectivityControl {
	/**
	 * Returns the value of the '<em><b>Pin TX</b></em>' attribute.
	 * The default value is <code>"TX,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin TX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin TX</em>' attribute.
	 * @see #setPinTX(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinTX()
	 * @model default="TX,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinTX();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinTX <em>Pin TX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin TX</em>' attribute.
	 * @see #getPinTX()
	 * @generated
	 */
	void setPinTX(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin RX</b></em>' attribute.
	 * The default value is <code>"RX,IO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin RX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin RX</em>' attribute.
	 * @see #setPinRX(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinRX()
	 * @model default="RX,IO" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinRX();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinRX <em>Pin RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin RX</em>' attribute.
	 * @see #getPinRX()
	 * @generated
	 */
	void setPinRX(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin Vcc</b></em>' attribute.
	 * The default value is <code>"Vcc,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Vcc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Vcc</em>' attribute.
	 * @see #setPinVcc(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinVcc()
	 * @model default="Vcc,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinVcc();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinVcc <em>Pin Vcc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Vcc</em>' attribute.
	 * @see #getPinVcc()
	 * @generated
	 */
	void setPinVcc(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin GND</b></em>' attribute.
	 * The default value is <code>"GND,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin GND</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin GND</em>' attribute.
	 * @see #setPinGND(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinGND()
	 * @model default="GND,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinGND();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinGND <em>Pin GND</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin GND</em>' attribute.
	 * @see #getPinGND()
	 * @generated
	 */
	void setPinGND(Pin value);

	/**
	 * Returns the value of the '<em><b>Pin CHPD</b></em>' attribute.
	 * The default value is <code>"CHPD,Power"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin CHPD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin CHPD</em>' attribute.
	 * @see #setPinCHPD(Pin)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_PinCHPD()
	 * @model default="CHPD,Power" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin getPinCHPD();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPinCHPD <em>Pin CHPD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin CHPD</em>' attribute.
	 * @see #getPinCHPD()
	 * @generated
	 */
	void setPinCHPD(Pin value);

	/**
	 * Returns the value of the '<em><b>SSID</b></em>' attribute.
	 * The default value is <code>"IotWearable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SSID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SSID</em>' attribute.
	 * @see #setSSID(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_SSID()
	 * @model default="IotWearable"
	 * @generated
	 */
	String getSSID();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getSSID <em>SSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SSID</em>' attribute.
	 * @see #getSSID()
	 * @generated
	 */
	void setSSID(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"IotWearable"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Password()
	 * @model default="IotWearable"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"192.168.200.46"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Host()
	 * @model default="192.168.200.46"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"8080"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see iotwearable.model.iotw.IotwPackage#getWifiESP8266_Port()
	 * @model default="8080"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.WifiESP8266#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // WifiESP8266
