/**
 */
package iotwearable.model.iotw;

import org.eclipse.draw2d.geometry.Rectangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.DataControl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.DataControl#getLocation <em>Location</em>}</li>
 *   <li>{@link iotwearable.model.iotw.DataControl#getType <em>Type</em>}</li>
 *   <li>{@link iotwearable.model.iotw.DataControl#getDataExplorer <em>Data Explorer</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getDataControl()
 * @model abstract="true"
 * @generated
 */
public interface DataControl extends Control {
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
	 * @see iotwearable.model.iotw.IotwPackage#getDataControl_Constraints()
	 * @model dataType="iotwearable.model.iotw.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DataControl#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see iotwearable.model.iotw.IotwPackage#getDataControl_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DataControl#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"XML"</code>.
	 * The literals are from the enumeration {@link iotwearable.model.iotw.TypeData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see iotwearable.model.iotw.TypeData
	 * @see #setType(TypeData)
	 * @see iotwearable.model.iotw.IotwPackage#getDataControl_Type()
	 * @model default="XML"
	 * @generated
	 */
	TypeData getType();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DataControl#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see iotwearable.model.iotw.TypeData
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeData value);

	/**
	 * Returns the value of the '<em><b>Data Explorer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.DataExplorer#getDatas <em>Datas</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Explorer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Explorer</em>' container reference.
	 * @see #setDataExplorer(DataExplorer)
	 * @see iotwearable.model.iotw.IotwPackage#getDataControl_DataExplorer()
	 * @see iotwearable.model.iotw.DataExplorer#getDatas
	 * @model opposite="datas" transient="false"
	 * @generated
	 */
	DataExplorer getDataExplorer();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.DataControl#getDataExplorer <em>Data Explorer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Explorer</em>' container reference.
	 * @see #getDataExplorer()
	 * @generated
	 */
	void setDataExplorer(DataExplorer value);

} // DataControl
