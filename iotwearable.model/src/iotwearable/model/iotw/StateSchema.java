/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.StateSchema#getControls <em>Controls</em>}</li>
 *   <li>{@link iotwearable.model.iotw.StateSchema#getConnnections <em>Connnections</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getStateSchema()
 * @model
 * @generated
 */
public interface StateSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
	 * The list contents are of type {@link iotwearable.model.iotw.StateControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' containment reference list.
	 * @see iotwearable.model.iotw.IotwPackage#getStateSchema_Controls()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateControl> getControls();

	/**
	 * Returns the value of the '<em><b>Connnections</b></em>' containment reference list.
	 * The list contents are of type {@link iotwearable.model.iotw.Connection}.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.Connection#getStateSchema <em>State Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connnections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connnections</em>' containment reference list.
	 * @see iotwearable.model.iotw.IotwPackage#getStateSchema_Connnections()
	 * @see iotwearable.model.iotw.Connection#getStateSchema
	 * @model opposite="stateSchema" containment="true"
	 * @generated
	 */
	EList<Connection> getConnnections();

} // StateSchema
