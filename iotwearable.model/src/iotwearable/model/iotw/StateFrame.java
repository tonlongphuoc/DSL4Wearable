/**
 */
package iotwearable.model.iotw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.StateFrame#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see iotwearable.model.iotw.IotwPackage#getStateFrame()
 * @model
 * @generated
 */
public interface StateFrame extends StateControl {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see iotwearable.model.iotw.IotwPackage#getStateFrame_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link iotwearable.model.iotw.StateFrame#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // StateFrame
