/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.Connection;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.StateControl;
import java.util.Collection;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.StateControlImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.StateControlImpl#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.StateControlImpl#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StateControlImpl extends ControlImpl implements StateControl {
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
	 * The cached value of the '{@link #getIncomings() <em>Incomings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> incomings;

	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> outgoings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.STATE_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.STATE_CONTROL__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectResolvingEList<Connection>(Connection.class, this, IotwPackage.STATE_CONTROL__INCOMINGS);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectResolvingEList<Connection>(Connection.class, this, IotwPackage.STATE_CONTROL__OUTGOINGS);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IotwPackage.STATE_CONTROL__CONSTRAINTS:
				return getConstraints();
			case IotwPackage.STATE_CONTROL__INCOMINGS:
				return getIncomings();
			case IotwPackage.STATE_CONTROL__OUTGOINGS:
				return getOutgoings();
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
			case IotwPackage.STATE_CONTROL__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case IotwPackage.STATE_CONTROL__INCOMINGS:
				getIncomings().clear();
				getIncomings().addAll((Collection<? extends Connection>)newValue);
				return;
			case IotwPackage.STATE_CONTROL__OUTGOINGS:
				getOutgoings().clear();
				getOutgoings().addAll((Collection<? extends Connection>)newValue);
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
			case IotwPackage.STATE_CONTROL__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case IotwPackage.STATE_CONTROL__INCOMINGS:
				getIncomings().clear();
				return;
			case IotwPackage.STATE_CONTROL__OUTGOINGS:
				getOutgoings().clear();
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
			case IotwPackage.STATE_CONTROL__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case IotwPackage.STATE_CONTROL__INCOMINGS:
				return incomings != null && !incomings.isEmpty();
			case IotwPackage.STATE_CONTROL__OUTGOINGS:
				return outgoings != null && !outgoings.isEmpty();
		}
		return super.eIsSet(featureID);
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

} //StateControlImpl
