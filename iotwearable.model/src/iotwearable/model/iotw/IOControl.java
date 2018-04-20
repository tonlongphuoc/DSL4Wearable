/**
 */
package iotwearable.model.iotw;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.IOControl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.IOControl#getMainboard <em>Mainboard</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getIOControl()
 * @model abstract="true"
 * @generated
 */
public interface IOControl extends Control {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see iotwearable.model.iotw.IotwPackage#getIOControl_Constraints()
	 * @model dataType="iotwearable.model.iotw.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.IOControl#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Mainboard</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.Mainboard#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mainboard</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mainboard</em>' container reference.
	 * @see #setMainboard(Mainboard)
	 * @see iotwearable.model.iotw.IotwPackage#getIOControl_Mainboard()
	 * @see iotwearable.model.iotw.Mainboard#getControls
	 * @model opposite="controls" transient="false"
	 * @generated
	 */
	Mainboard getMainboard();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.IOControl#getMainboard <em>Mainboard</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mainboard</em>' container reference.
	 * @see #getMainboard()
	 * @generated
	 */
	void setMainboard(Mainboard value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pins</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	
} // IOControl
