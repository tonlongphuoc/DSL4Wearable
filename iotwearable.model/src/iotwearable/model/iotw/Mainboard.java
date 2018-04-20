/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mainboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.Mainboard#getControls <em>Controls</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Mainboard#getConnectivities <em>Connectivities</em>}</li>
 *   <li>{@link iotwearable.model.iotw.Mainboard#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getMainboard()
 * @model abstract="true"
 * @generated
 */
public interface Mainboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link iotwearable.model.iotw.IOControl}.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.IOControl#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see iotwearable.model.iotw.IotwPackage#getMainboard_Controls()
	 * @see iotwearable.model.iotw.IOControl#getMainboard
	 * @model opposite="mainboard" containment="true"
	 * @generated
	 */
	EList<IOControl> getControls();

	/**
	 * Returns the value of the '<em><b>Connectivities</b></em>' containment reference list.
	 * The list contents are of type {@link iotwearable.model.iotw.ConnectivityControl}.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.ConnectivityControl#getMainboard <em>Mainboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectivities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectivities</em>' containment reference list.
	 * @see iotwearable.model.iotw.IotwPackage#getMainboard_Connectivities()
	 * @see iotwearable.model.iotw.ConnectivityControl#getMainboard
	 * @model opposite="mainboard" containment="true"
	 * @generated
	 */
	EList<ConnectivityControl> getConnectivities();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iotwearable.model.iotw.IotwPackage#getMainboard_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.Mainboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addControl(IOControl control);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	EList<Pin> getPins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	EList<Pin> getPinConnecteds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pinDataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	void modifyPin(Pin pin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="iotwearable.model.iotw.Pin" pinDataType="iotwearable.model.iotw.Pin"
	 * @generated
	 */
	Pin findPin(Pin pin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeControl(IOControl control);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addConnectivity(ConnectivityControl control);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeConnectivity(ConnectivityControl control);

} // Mainboard
