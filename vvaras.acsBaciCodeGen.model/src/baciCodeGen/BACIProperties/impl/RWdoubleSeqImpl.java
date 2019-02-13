/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.RWdoubleSeq;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RWdouble Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.RWdoubleSeqImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.RWdoubleSeqImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RWdoubleSeqImpl extends PdoubleSeq1Impl implements RWdoubleSeq {
	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 1.7976931348623157E308;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

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
	protected static final double MIN_VALUE_EDEFAULT = -1.7976931348623157E308;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

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
	protected RWdoubleSeqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.RWDOUBLE_SEQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		boolean oldMaxValueESet = maxValueESet;
		maxValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.RWDOUBLE_SEQ__MAX_VALUE, oldMaxValue, maxValue, !oldMaxValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxValue() {
		double oldMaxValue = maxValue;
		boolean oldMaxValueESet = maxValueESet;
		maxValue = MAX_VALUE_EDEFAULT;
		maxValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.RWDOUBLE_SEQ__MAX_VALUE, oldMaxValue, MAX_VALUE_EDEFAULT, oldMaxValueESet));
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
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		boolean oldMinValueESet = minValueESet;
		minValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.RWDOUBLE_SEQ__MIN_VALUE, oldMinValue, minValue, !oldMinValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinValue() {
		double oldMinValue = minValue;
		boolean oldMinValueESet = minValueESet;
		minValue = MIN_VALUE_EDEFAULT;
		minValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.RWDOUBLE_SEQ__MIN_VALUE, oldMinValue, MIN_VALUE_EDEFAULT, oldMinValueESet));
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
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MAX_VALUE:
				return getMaxValue();
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MIN_VALUE:
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
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MAX_VALUE:
				setMaxValue((Double)newValue);
				return;
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MIN_VALUE:
				setMinValue((Double)newValue);
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
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MAX_VALUE:
				unsetMaxValue();
				return;
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MIN_VALUE:
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
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MAX_VALUE:
				return isSetMaxValue();
			case BACIPropertiesPackage.RWDOUBLE_SEQ__MIN_VALUE:
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

} //RWdoubleSeqImpl
