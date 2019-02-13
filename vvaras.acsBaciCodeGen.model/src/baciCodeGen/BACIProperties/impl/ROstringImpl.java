/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.ROstring;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROstring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROstringImpl#getAlarmFaultFamily <em>Alarm Fault Family</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROstringImpl#getAlarmFaultMember <em>Alarm Fault Member</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROstringImpl#getAlarmLevel <em>Alarm Level</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.ROstringImpl#getAlarmTimerTrig <em>Alarm Timer Trig</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROstringImpl extends Pstring1Impl implements ROstring {
	/**
	 * The default value of the '{@link #getAlarmFaultFamily() <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_FAULT_FAMILY_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlarmFaultFamily() <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultFamily()
	 * @generated
	 * @ordered
	 */
	protected String alarmFaultFamily = ALARM_FAULT_FAMILY_EDEFAULT;

	/**
	 * This is true if the Alarm Fault Family attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmFaultFamilyESet;

	/**
	 * The default value of the '{@link #getAlarmFaultMember() <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultMember()
	 * @generated
	 * @ordered
	 */
	protected static final String ALARM_FAULT_MEMBER_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAlarmFaultMember() <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmFaultMember()
	 * @generated
	 * @ordered
	 */
	protected String alarmFaultMember = ALARM_FAULT_MEMBER_EDEFAULT;

	/**
	 * This is true if the Alarm Fault Member attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmFaultMemberESet;

	/**
	 * The default value of the '{@link #getAlarmLevel() <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int ALARM_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlarmLevel() <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmLevel()
	 * @generated
	 * @ordered
	 */
	protected int alarmLevel = ALARM_LEVEL_EDEFAULT;

	/**
	 * This is true if the Alarm Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmLevelESet;

	/**
	 * The default value of the '{@link #getAlarmTimerTrig() <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected static final double ALARM_TIMER_TRIG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlarmTimerTrig() <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected double alarmTimerTrig = ALARM_TIMER_TRIG_EDEFAULT;

	/**
	 * This is true if the Alarm Timer Trig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alarmTimerTrigESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROstringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.ROSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlarmFaultFamily() {
		return alarmFaultFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmFaultFamily(String newAlarmFaultFamily) {
		String oldAlarmFaultFamily = alarmFaultFamily;
		alarmFaultFamily = newAlarmFaultFamily;
		boolean oldAlarmFaultFamilyESet = alarmFaultFamilyESet;
		alarmFaultFamilyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROSTRING__ALARM_FAULT_FAMILY, oldAlarmFaultFamily, alarmFaultFamily, !oldAlarmFaultFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmFaultFamily() {
		String oldAlarmFaultFamily = alarmFaultFamily;
		boolean oldAlarmFaultFamilyESet = alarmFaultFamilyESet;
		alarmFaultFamily = ALARM_FAULT_FAMILY_EDEFAULT;
		alarmFaultFamilyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROSTRING__ALARM_FAULT_FAMILY, oldAlarmFaultFamily, ALARM_FAULT_FAMILY_EDEFAULT, oldAlarmFaultFamilyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmFaultFamily() {
		return alarmFaultFamilyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlarmFaultMember() {
		return alarmFaultMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmFaultMember(String newAlarmFaultMember) {
		String oldAlarmFaultMember = alarmFaultMember;
		alarmFaultMember = newAlarmFaultMember;
		boolean oldAlarmFaultMemberESet = alarmFaultMemberESet;
		alarmFaultMemberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROSTRING__ALARM_FAULT_MEMBER, oldAlarmFaultMember, alarmFaultMember, !oldAlarmFaultMemberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmFaultMember() {
		String oldAlarmFaultMember = alarmFaultMember;
		boolean oldAlarmFaultMemberESet = alarmFaultMemberESet;
		alarmFaultMember = ALARM_FAULT_MEMBER_EDEFAULT;
		alarmFaultMemberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROSTRING__ALARM_FAULT_MEMBER, oldAlarmFaultMember, ALARM_FAULT_MEMBER_EDEFAULT, oldAlarmFaultMemberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmFaultMember() {
		return alarmFaultMemberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlarmLevel() {
		return alarmLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmLevel(int newAlarmLevel) {
		int oldAlarmLevel = alarmLevel;
		alarmLevel = newAlarmLevel;
		boolean oldAlarmLevelESet = alarmLevelESet;
		alarmLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROSTRING__ALARM_LEVEL, oldAlarmLevel, alarmLevel, !oldAlarmLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmLevel() {
		int oldAlarmLevel = alarmLevel;
		boolean oldAlarmLevelESet = alarmLevelESet;
		alarmLevel = ALARM_LEVEL_EDEFAULT;
		alarmLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROSTRING__ALARM_LEVEL, oldAlarmLevel, ALARM_LEVEL_EDEFAULT, oldAlarmLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmLevel() {
		return alarmLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlarmTimerTrig() {
		return alarmTimerTrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlarmTimerTrig(double newAlarmTimerTrig) {
		double oldAlarmTimerTrig = alarmTimerTrig;
		alarmTimerTrig = newAlarmTimerTrig;
		boolean oldAlarmTimerTrigESet = alarmTimerTrigESet;
		alarmTimerTrigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.ROSTRING__ALARM_TIMER_TRIG, oldAlarmTimerTrig, alarmTimerTrig, !oldAlarmTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlarmTimerTrig() {
		double oldAlarmTimerTrig = alarmTimerTrig;
		boolean oldAlarmTimerTrigESet = alarmTimerTrigESet;
		alarmTimerTrig = ALARM_TIMER_TRIG_EDEFAULT;
		alarmTimerTrigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.ROSTRING__ALARM_TIMER_TRIG, oldAlarmTimerTrig, ALARM_TIMER_TRIG_EDEFAULT, oldAlarmTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlarmTimerTrig() {
		return alarmTimerTrigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_FAMILY:
				return getAlarmFaultFamily();
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_MEMBER:
				return getAlarmFaultMember();
			case BACIPropertiesPackage.ROSTRING__ALARM_LEVEL:
				return getAlarmLevel();
			case BACIPropertiesPackage.ROSTRING__ALARM_TIMER_TRIG:
				return getAlarmTimerTrig();
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
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_FAMILY:
				setAlarmFaultFamily((String)newValue);
				return;
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_MEMBER:
				setAlarmFaultMember((String)newValue);
				return;
			case BACIPropertiesPackage.ROSTRING__ALARM_LEVEL:
				setAlarmLevel((Integer)newValue);
				return;
			case BACIPropertiesPackage.ROSTRING__ALARM_TIMER_TRIG:
				setAlarmTimerTrig((Double)newValue);
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
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_FAMILY:
				unsetAlarmFaultFamily();
				return;
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_MEMBER:
				unsetAlarmFaultMember();
				return;
			case BACIPropertiesPackage.ROSTRING__ALARM_LEVEL:
				unsetAlarmLevel();
				return;
			case BACIPropertiesPackage.ROSTRING__ALARM_TIMER_TRIG:
				unsetAlarmTimerTrig();
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
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_FAMILY:
				return isSetAlarmFaultFamily();
			case BACIPropertiesPackage.ROSTRING__ALARM_FAULT_MEMBER:
				return isSetAlarmFaultMember();
			case BACIPropertiesPackage.ROSTRING__ALARM_LEVEL:
				return isSetAlarmLevel();
			case BACIPropertiesPackage.ROSTRING__ALARM_TIMER_TRIG:
				return isSetAlarmTimerTrig();
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
		result.append(" (alarmFaultFamily: ");
		if (alarmFaultFamilyESet) result.append(alarmFaultFamily); else result.append("<unset>");
		result.append(", alarmFaultMember: ");
		if (alarmFaultMemberESet) result.append(alarmFaultMember); else result.append("<unset>");
		result.append(", alarmLevel: ");
		if (alarmLevelESet) result.append(alarmLevel); else result.append("<unset>");
		result.append(", alarmTimerTrig: ");
		if (alarmTimerTrigESet) result.append(alarmTimerTrig); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ROstringImpl
