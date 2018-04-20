/**
 */
package iotwearable.model.iotw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Explorer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.DataExplorer#getDatas <em>Datas</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getDataExplorer()
 * @model
 * @generated
 */
public interface DataExplorer extends EObject {
	/**
	 * Returns the value of the '<em><b>Datas</b></em>' containment reference list.
	 * The list contents are of type {@link iotwearable.model.iotw.DataControl}.
	 * It is bidirectional and its opposite is '{@link iotwearable.model.iotw.DataControl#getDataExplorer <em>Data Explorer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' containment reference list.
	 * @see iotwearable.model.iotw.IotwPackage#getDataExplorer_Datas()
	 * @see iotwearable.model.iotw.DataControl#getDataExplorer
	 * @model opposite="dataExplorer" containment="true"
	 * @generated
	 */
	EList<DataControl> getDatas();

} // DataExplorer
