/**
 */
package iotwearable.model.iotw.impl;

import iotwearable.model.iotw.DataControl;
import iotwearable.model.iotw.DataExplorer;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.TypeData;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iotwearable.model.iotw.impl.DataControlImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.DataControlImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.DataControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link iotwearable.model.iotw.impl.DataControlImpl#getDataExplorer <em>Data Explorer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataControlImpl extends ControlImpl implements DataControl {
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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeData TYPE_EDEFAULT = TypeData.XML;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeData type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IotwPackage.Literals.DATA_CONTROL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.DATA_CONTROL__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.DATA_CONTROL__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeData getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeData newType) {
		TypeData oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.DATA_CONTROL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataExplorer getDataExplorer() {
		if (eContainerFeatureID() != IotwPackage.DATA_CONTROL__DATA_EXPLORER) return null;
		return (DataExplorer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataExplorer(DataExplorer newDataExplorer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataExplorer, IotwPackage.DATA_CONTROL__DATA_EXPLORER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataExplorer(DataExplorer newDataExplorer) {
		if (newDataExplorer != eInternalContainer() || (eContainerFeatureID() != IotwPackage.DATA_CONTROL__DATA_EXPLORER && newDataExplorer != null)) {
			if (EcoreUtil.isAncestor(this, newDataExplorer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataExplorer != null)
				msgs = ((InternalEObject)newDataExplorer).eInverseAdd(this, IotwPackage.DATA_EXPLORER__DATAS, DataExplorer.class, msgs);
			msgs = basicSetDataExplorer(newDataExplorer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IotwPackage.DATA_CONTROL__DATA_EXPLORER, newDataExplorer, newDataExplorer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataExplorer((DataExplorer)otherEnd, msgs);
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
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				return basicSetDataExplorer(null, msgs);
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
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				return eInternalContainer().eInverseRemove(this, IotwPackage.DATA_EXPLORER__DATAS, DataExplorer.class, msgs);
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
			case IotwPackage.DATA_CONTROL__CONSTRAINTS:
				return getConstraints();
			case IotwPackage.DATA_CONTROL__LOCATION:
				return getLocation();
			case IotwPackage.DATA_CONTROL__TYPE:
				return getType();
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				return getDataExplorer();
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
			case IotwPackage.DATA_CONTROL__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case IotwPackage.DATA_CONTROL__LOCATION:
				setLocation((String)newValue);
				return;
			case IotwPackage.DATA_CONTROL__TYPE:
				setType((TypeData)newValue);
				return;
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				setDataExplorer((DataExplorer)newValue);
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
			case IotwPackage.DATA_CONTROL__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case IotwPackage.DATA_CONTROL__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case IotwPackage.DATA_CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				setDataExplorer((DataExplorer)null);
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
			case IotwPackage.DATA_CONTROL__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case IotwPackage.DATA_CONTROL__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case IotwPackage.DATA_CONTROL__TYPE:
				return type != TYPE_EDEFAULT;
			case IotwPackage.DATA_CONTROL__DATA_EXPLORER:
				return getDataExplorer() != null;
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
		result.append(", location: ");
		result.append(location);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DataControlImpl
