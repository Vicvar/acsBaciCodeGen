/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.BaciType;
import baciCodeGen.DevIO;
import baciCodeGen.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.PropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.PropertyImpl#getBaciType <em>Baci Type</em>}</li>
 *   <li>{@link baciCodeGen.impl.PropertyImpl#getDevIO <em>Dev IO</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The cached value of the '{@link #getBaciType() <em>Baci Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaciType()
	 * @generated
	 * @ordered
	 */
	protected BaciType baciType;

	/**
	 * The cached value of the '{@link #getDevIO() <em>Dev IO</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevIO()
	 * @generated
	 * @ordered
	 */
	protected DevIO devIO;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciType getBaciType() {
		if (baciType != null && baciType.eIsProxy()) {
			InternalEObject oldBaciType = (InternalEObject)baciType;
			baciType = (BaciType)eResolveProxy(oldBaciType);
			if (baciType != oldBaciType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BaciCodeGenPackage.PROPERTY__BACI_TYPE, oldBaciType, baciType));
			}
		}
		return baciType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciType basicGetBaciType() {
		return baciType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaciType(BaciType newBaciType) {
		BaciType oldBaciType = baciType;
		baciType = newBaciType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.PROPERTY__BACI_TYPE, oldBaciType, baciType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevIO getDevIO() {
		if (devIO != null && devIO.eIsProxy()) {
			InternalEObject oldDevIO = (InternalEObject)devIO;
			devIO = (DevIO)eResolveProxy(oldDevIO);
			if (devIO != oldDevIO) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BaciCodeGenPackage.PROPERTY__DEV_IO, oldDevIO, devIO));
			}
		}
		return devIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevIO basicGetDevIO() {
		return devIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevIO(DevIO newDevIO) {
		DevIO oldDevIO = devIO;
		devIO = newDevIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.PROPERTY__DEV_IO, oldDevIO, devIO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaciCodeGenPackage.PROPERTY__NAME:
				return getName();
			case BaciCodeGenPackage.PROPERTY__BACI_TYPE:
				if (resolve) return getBaciType();
				return basicGetBaciType();
			case BaciCodeGenPackage.PROPERTY__DEV_IO:
				if (resolve) return getDevIO();
				return basicGetDevIO();
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
			case BaciCodeGenPackage.PROPERTY__NAME:
				setName((String)newValue);
				return;
			case BaciCodeGenPackage.PROPERTY__BACI_TYPE:
				setBaciType((BaciType)newValue);
				return;
			case BaciCodeGenPackage.PROPERTY__DEV_IO:
				setDevIO((DevIO)newValue);
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
			case BaciCodeGenPackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.PROPERTY__BACI_TYPE:
				setBaciType((BaciType)null);
				return;
			case BaciCodeGenPackage.PROPERTY__DEV_IO:
				setDevIO((DevIO)null);
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
			case BaciCodeGenPackage.PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaciCodeGenPackage.PROPERTY__BACI_TYPE:
				return baciType != null;
			case BaciCodeGenPackage.PROPERTY__DEV_IO:
				return devIO != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
