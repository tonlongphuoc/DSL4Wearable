/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.Mainboard;
import iotwearable.model.iotw.Pin;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mainboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.MainboardImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.MainboardImpl#getConnectivities <em>Connectivities</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.MainboardImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MainboardImpl extends MinimalEObjectImpl.Container implements Mainboard {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<IOControl> controls;
	
	/**
	 * The cached value of the '{@link #getConnectivities() <em>Connectivities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectivities()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectivityControl> connectivities;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.MAINBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOControl> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentWithInverseEList<IOControl>(IOControl.class, this, IotwPackage.MAINBOARD__CONTROLS, IotwPackage.IO_CONTROL__MAINBOARD);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectivityControl> getConnectivities() {
		if (connectivities == null) {
			connectivities = new EObjectContainmentWithInverseEList<ConnectivityControl>(ConnectivityControl.class, this, IotwPackage.MAINBOARD__CONNECTIVITIES, IotwPackage.CONNECTIVITY_CONTROL__MAINBOARD);
		}
		return connectivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.MAINBOARD__NAME, oldName, name));
	}

	/**
	 * Add control
	 * @param control
	 * 						IOControl
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addControl(IOControl control) {
		if(control == null)
			return;
		if(!controls.contains(control)){
			controls.add(control);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pin> getPins() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			if(!pin.getIdConnect().isEmpty()){
				pins.add(pin);
			}
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
	 * Find pin of mainboard with pin of control
	 * @param pin of control
	 * 		{@link Pin}
	 * @return return pin of mainboard if pin of control is connected
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Pin findPin(Pin pin) {
		if(pin != null){
			for(Pin _pin : getPinConnecteds()){
				if(_pin.getIdConnect().equals(pin.getIdConnect())){
					return _pin;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeControl(IOControl control) {
		if(control == null){
			return;
		}
		if(controls.contains(control)){
			for(Pin pinControl : control.getPinConnecteds()){
				for(Pin pinMainboard : this.getPinConnecteds()){
					if(pinControl.getIdConnect().equals(pinMainboard.getIdConnect())){
						pinMainboard.setIdConnect("");
						modifyPin(pinMainboard);
					}
				}
			}
			controls.remove(control);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addConnectivity(ConnectivityControl control) {
		if(control == null)
			return;
		if(!connectivities.contains(control)){
			connectivities.add(control);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeConnectivity(ConnectivityControl control) {
		if(connectivities.contains(control)){
			for(Pin pinControl : control.getPinConnecteds()){
				for(Pin pinMainboard : this.getPinConnecteds()){
					if(pinControl.getIdConnect().equals(pinMainboard.getIdConnect())){
						pinMainboard.setIdConnect("");
						modifyPin(pinMainboard);
					}
				}
			}
			connectivities.remove(control);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.MAINBOARD__CONTROLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControls()).basicAdd(otherEnd, msgs);
			case IotwPackage.MAINBOARD__CONNECTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectivities()).basicAdd(otherEnd, msgs);
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
			case IotwPackage.MAINBOARD__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case IotwPackage.MAINBOARD__CONNECTIVITIES:
				return ((InternalEList<?>)getConnectivities()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.MAINBOARD__CONTROLS:
				return getControls();
			case IotwPackage.MAINBOARD__CONNECTIVITIES:
				return getConnectivities();
			case IotwPackage.MAINBOARD__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IotwPackage.MAINBOARD__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends IOControl>)newValue);
				return;
			case IotwPackage.MAINBOARD__CONNECTIVITIES:
				getConnectivities().clear();
				getConnectivities().addAll((Collection<? extends ConnectivityControl>)newValue);
				return;
			case IotwPackage.MAINBOARD__NAME:
				setName((String)newValue);
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
			case IotwPackage.MAINBOARD__CONTROLS:
				getControls().clear();
				return;
			case IotwPackage.MAINBOARD__CONNECTIVITIES:
				getConnectivities().clear();
				return;
			case IotwPackage.MAINBOARD__NAME:
				setName(NAME_EDEFAULT);
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
			case IotwPackage.MAINBOARD__CONTROLS:
				return controls != null && !controls.isEmpty();
			case IotwPackage.MAINBOARD__CONNECTIVITIES:
				return connectivities != null && !connectivities.isEmpty();
			case IotwPackage.MAINBOARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case IotwPackage.MAINBOARD___ADD_CONTROL__IOCONTROL:
				addControl((IOControl)arguments.get(0));
				return null;
			case IotwPackage.MAINBOARD___REMOVE_CONTROL__IOCONTROL:
				removeControl((IOControl)arguments.get(0));
				return null;
			case IotwPackage.MAINBOARD___ADD_CONNECTIVITY__CONNECTIVITYCONTROL:
				addConnectivity((ConnectivityControl)arguments.get(0));
				return null;
			case IotwPackage.MAINBOARD___REMOVE_CONNECTIVITY__CONNECTIVITYCONTROL:
				removeConnectivity((ConnectivityControl)arguments.get(0));
				return null;
			case IotwPackage.MAINBOARD___GET_PINS:
				return getPins();
			case IotwPackage.MAINBOARD___GET_PIN_CONNECTEDS:
				return getPinConnecteds();
			case IotwPackage.MAINBOARD___MODIFY_PIN__PIN:
				modifyPin((Pin)arguments.get(0));
				return null;
			case IotwPackage.MAINBOARD___FIND_PIN__PIN:
				return findPin((Pin)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MainboardImpl
