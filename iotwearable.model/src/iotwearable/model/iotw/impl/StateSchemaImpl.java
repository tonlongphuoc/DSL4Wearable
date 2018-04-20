/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.StateControl;
import iotwearable.model.iotw.StateSchema;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.StateSchemaImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.StateSchemaImpl#getConnnections <em>Connnections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateSchemaImpl extends MinimalEObjectImpl.Container implements StateSchema {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<StateControl> controls;

	/**
	 * The cached value of the '{@link #getConnnections() <em>Connnections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.STATE_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateControl> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<StateControl>(StateControl.class, this, IotwPackage.STATE_SCHEMA__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnnections() {
		if (connnections == null) {
			connnections = new EObjectContainmentWithInverseEList<Connection>(Connection.class, this, IotwPackage.STATE_SCHEMA__CONNNECTIONS, IotwPackage.CONNECTION__STATE_SCHEMA);
		}
		return connnections;
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
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnnections()).basicAdd(otherEnd, msgs);
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
			case IotwPackage.STATE_SCHEMA__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return ((InternalEList<?>)getConnnections()).basicRemove(otherEnd, msgs);
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
			case IotwPackage.STATE_SCHEMA__CONTROLS:
				return getControls();
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return getConnnections();
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
			case IotwPackage.STATE_SCHEMA__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends StateControl>)newValue);
				return;
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				getConnnections().clear();
				getConnnections().addAll((Collection<? extends Connection>)newValue);
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
			case IotwPackage.STATE_SCHEMA__CONTROLS:
				getControls().clear();
				return;
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				getConnnections().clear();
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
			case IotwPackage.STATE_SCHEMA__CONTROLS:
				return controls != null && !controls.isEmpty();
			case IotwPackage.STATE_SCHEMA__CONNNECTIONS:
				return connnections != null && !connnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateSchemaImpl
