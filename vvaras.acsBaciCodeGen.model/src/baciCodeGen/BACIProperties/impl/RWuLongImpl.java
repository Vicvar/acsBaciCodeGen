/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.RWuLong;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RWu Long</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.RWuLongImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.RWuLongImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RWuLongImpl extends PuLong1Impl implements RWuLong {
	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_VALUE_EDEFAULT = 4294967295L;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected long maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * This is true if the Max Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxValueESet;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_VALUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected long minValue = MIN_VALUE_EDEFAULT;

	/**
	 * This is true if the Min Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RWuLongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.RWU_LONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(long newMaxValue) {
		long oldMaxValue = maxValue;
		maxValue = newMaxValue;
		boolean oldMaxValueESet = maxValueESet;
		maxValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.RWU_LONG__MAX_VALUE, oldMaxValue, maxValue, !oldMaxValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxValue() {
		long oldMaxValue = maxValue;
		boolean oldMaxValueESet = maxValueESet;
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.RWU_LONG__MAX_VALUE, oldMaxValue, MAX_VALUE_EDEFAULT, oldMaxValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxValue() {
		return maxValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(long newMinValue) {
		long oldMinValue = minValue;
		minValue = newMinValue;
		boolean oldMinValueESet = minValueESet;
		minValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.RWU_LONG__MIN_VALUE, oldMinValue, minValue, !oldMinValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinValue() {
		long oldMinValue = minValue;
		boolean oldMinValueESet = minValueESet;
		minValue = MIN_VALUE_EDEFAULT;
		minValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.RWU_LONG__MIN_VALUE, oldMinValue, MIN_VALUE_EDEFAULT, oldMinValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinValue() {
		return minValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.RWU_LONG__MAX_VALUE:
				return getMaxValue();
			case BACIPropertiesPackage.RWU_LONG__MIN_VALUE:
				return getMinValue();
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
			case BACIPropertiesPackage.RWU_LONG__MAX_VALUE:
				setMaxValue((Long)newValue);
				return;
			case BACIPropertiesPackage.RWU_LONG__MIN_VALUE:
				setMinValue((Long)newValue);
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
			case BACIPropertiesPackage.RWU_LONG__MAX_VALUE:
				unsetMaxValue();
				return;
			case BACIPropertiesPackage.RWU_LONG__MIN_VALUE:
				unsetMinValue();
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
			case BACIPropertiesPackage.RWU_LONG__MAX_VALUE:
				return isSetMaxValue();
			case BACIPropertiesPackage.RWU_LONG__MIN_VALUE:
				return isSetMinValue();
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
		result.append(" (maxValue: ");
		if (maxValueESet) result.append(maxValue); else result.append("<unset>");
		result.append(", minValue: ");
		if (minValueESet) result.append(minValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RWuLongImpl
