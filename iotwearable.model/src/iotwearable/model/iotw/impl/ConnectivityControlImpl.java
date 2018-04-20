/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectivityControlImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.ConnectivityControlImpl#getMainboard <em>Mainboard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectivityControlImpl extends ControlImpl implements ConnectivityControl {
	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectivityControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.CONNECTIVITY_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTIVITY_CONTROL__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mainboard getMainboard() {
		if (eContainerFeatureID() != IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD) return null;
		return (Mainboard)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainboard(Mainboard newMainboard, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMainboard, IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainboard(Mainboard newMainboard) {
		if (newMainboard != eInternalContainer() || (eContainerFeatureID() != IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD && newMainboard != null)) {
			if (EcoreUtil.isAncestor(this, newMainboard))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMainboard != null)
				msgs = ((InternalEObject)newMainboard).eInverseAdd(this, IotwPackage.MAINBOARD__CONNECTIVITIES, Mainboard.class, msgs);
			msgs = basicSetMainboard(newMainboard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD, newMainboard, newMainboard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Pin> getPins() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Pin> getPinConnecteds() {
		EList<Pin> pins = new BasicEList<Pin>();
		for(Pin pin : getPins()){
			if( !pin.getIdConnect().isEmpty())
				pins.add(pin);
		}
		return pins;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void modifyPin(Pin pin) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMainboard((Mainboard)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				return basicSetMainboard(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				return eInternalContainer().eInverseRemove(this, IotwPackage.MAINBOARD__CONNECTIVITIES, Mainboard.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.CONNECTIVITY_CONTROL__CONSTRAINTS:
				return getConstraints();
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				return getMainboard();
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
			case IotwPackage.CONNECTIVITY_CONTROL__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				setMainboard((Mainboard)newValue);
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
			case IotwPackage.CONNECTIVITY_CONTROL__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				setMainboard((Mainboard)null);
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
			case IotwPackage.CONNECTIVITY_CONTROL__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD:
				return getMainboard() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case IotwPackage.CONNECTIVITY_CONTROL___GET_PINS:
				return getPins();
			case IotwPackage.CONNECTIVITY_CONTROL___GET_PIN_CONNECTEDS:
				return getPinConnecteds();
			case IotwPackage.CONNECTIVITY_CONTROL___MODIFY_PIN__PIN:
				modifyPin((Pin)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //ConnectivityControlImpl
