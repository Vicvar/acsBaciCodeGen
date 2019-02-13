/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.CharacteristicComponent;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl#getActionThreadStackSize <em>Action Thread Stack Size</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl#getMonitoringThreadStackSize <em>Monitoring Thread Stack Size</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl#getRecentCommand <em>Recent Command</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl#getRecentTimeStamp <em>Recent Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicComponentImpl extends CharacteristicModelImpl implements CharacteristicComponent {
	/**
	 * The default value of the '{@link #getActionThreadStackSize() <em>Action Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionThreadStackSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACTION_THREAD_STACK_SIZE_EDEFAULT = new BigInteger("1024");

	/**
	 * The cached value of the '{@link #getActionThreadStackSize() <em>Action Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionThreadStackSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger actionThreadStackSize = ACTION_THREAD_STACK_SIZE_EDEFAULT;

	/**
	 * This is true if the Action Thread Stack Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionThreadStackSizeESet;

	/**
	 * The default value of the '{@link #getMonitoringThreadStackSize() <em>Monitoring Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringThreadStackSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MONITORING_THREAD_STACK_SIZE_EDEFAULT = new BigInteger("2048");

	/**
	 * The cached value of the '{@link #getMonitoringThreadStackSize() <em>Monitoring Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringThreadStackSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger monitoringThreadStackSize = MONITORING_THREAD_STACK_SIZE_EDEFAULT;

	/**
	 * This is true if the Monitoring Thread Stack Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monitoringThreadStackSizeESet;

	/**
	 * The default value of the '{@link #getRecentCommand() <em>Recent Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecentCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String RECENT_COMMAND_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecentCommand() <em>Recent Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecentCommand()
	 * @generated
	 * @ordered
	 */
	protected String recentCommand = RECENT_COMMAND_EDEFAULT;

	/**
	 * This is true if the Recent Command attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recentCommandESet;

	/**
	 * The default value of the '{@link #getRecentTimeStamp() <em>Recent Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecentTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String RECENT_TIME_STAMP_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRecentTimeStamp() <em>Recent Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecentTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String recentTimeStamp = RECENT_TIME_STAMP_EDEFAULT;

	/**
	 * This is true if the Recent Time Stamp attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean recentTimeStampESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.CHARACTERISTIC_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getActionThreadStackSize() {
		return actionThreadStackSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionThreadStackSize(BigInteger newActionThreadStackSize) {
		BigInteger oldActionThreadStackSize = actionThreadStackSize;
		actionThreadStackSize = newActionThreadStackSize;
		boolean oldActionThreadStackSizeESet = actionThreadStackSizeESet;
		actionThreadStackSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE, oldActionThreadStackSize, actionThreadStackSize, !oldActionThreadStackSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActionThreadStackSize() {
		BigInteger oldActionThreadStackSize = actionThreadStackSize;
		boolean oldActionThreadStackSizeESet = actionThreadStackSizeESet;
		actionThreadStackSize = ACTION_THREAD_STACK_SIZE_EDEFAULT;
		actionThreadStackSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE, oldActionThreadStackSize, ACTION_THREAD_STACK_SIZE_EDEFAULT, oldActionThreadStackSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionThreadStackSize() {
		return actionThreadStackSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMonitoringThreadStackSize() {
		return monitoringThreadStackSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringThreadStackSize(BigInteger newMonitoringThreadStackSize) {
		BigInteger oldMonitoringThreadStackSize = monitoringThreadStackSize;
		monitoringThreadStackSize = newMonitoringThreadStackSize;
		boolean oldMonitoringThreadStackSizeESet = monitoringThreadStackSizeESet;
		monitoringThreadStackSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE, oldMonitoringThreadStackSize, monitoringThreadStackSize, !oldMonitoringThreadStackSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMonitoringThreadStackSize() {
		BigInteger oldMonitoringThreadStackSize = monitoringThreadStackSize;
		boolean oldMonitoringThreadStackSizeESet = monitoringThreadStackSizeESet;
		monitoringThreadStackSize = MONITORING_THREAD_STACK_SIZE_EDEFAULT;
		monitoringThreadStackSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE, oldMonitoringThreadStackSize, MONITORING_THREAD_STACK_SIZE_EDEFAULT, oldMonitoringThreadStackSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMonitoringThreadStackSize() {
		return monitoringThreadStackSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecentCommand() {
		return recentCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecentCommand(String newRecentCommand) {
		String oldRecentCommand = recentCommand;
		recentCommand = newRecentCommand;
		boolean oldRecentCommandESet = recentCommandESet;
		recentCommandESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_COMMAND, oldRecentCommand, recentCommand, !oldRecentCommandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecentCommand() {
		String oldRecentCommand = recentCommand;
		boolean oldRecentCommandESet = recentCommandESet;
		recentCommand = RECENT_COMMAND_EDEFAULT;
		recentCommandESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_COMMAND, oldRecentCommand, RECENT_COMMAND_EDEFAULT, oldRecentCommandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecentCommand() {
		return recentCommandESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecentTimeStamp() {
		return recentTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecentTimeStamp(String newRecentTimeStamp) {
		String oldRecentTimeStamp = recentTimeStamp;
		recentTimeStamp = newRecentTimeStamp;
		boolean oldRecentTimeStampESet = recentTimeStampESet;
		recentTimeStampESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP, oldRecentTimeStamp, recentTimeStamp, !oldRecentTimeStampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRecentTimeStamp() {
		String oldRecentTimeStamp = recentTimeStamp;
		boolean oldRecentTimeStampESet = recentTimeStampESet;
		recentTimeStamp = RECENT_TIME_STAMP_EDEFAULT;
		recentTimeStampESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP, oldRecentTimeStamp, RECENT_TIME_STAMP_EDEFAULT, oldRecentTimeStampESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRecentTimeStamp() {
		return recentTimeStampESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE:
				return getActionThreadStackSize();
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE:
				return getMonitoringThreadStackSize();
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_COMMAND:
				return getRecentCommand();
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP:
				return getRecentTimeStamp();
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
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE:
				setActionThreadStackSize((BigInteger)newValue);
				return;
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE:
				setMonitoringThreadStackSize((BigInteger)newValue);
				return;
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_COMMAND:
				setRecentCommand((String)newValue);
				return;
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP:
				setRecentTimeStamp((String)newValue);
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
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE:
				unsetActionThreadStackSize();
				return;
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE:
				unsetMonitoringThreadStackSize();
				return;
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_COMMAND:
				unsetRecentCommand();
				return;
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP:
				unsetRecentTimeStamp();
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
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE:
				return isSetActionThreadStackSize();
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE:
				return isSetMonitoringThreadStackSize();
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_COMMAND:
				return isSetRecentCommand();
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP:
				return isSetRecentTimeStamp();
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
		result.append(" (actionThreadStackSize: ");
		if (actionThreadStackSizeESet) result.append(actionThreadStackSize); else result.append("<unset>");
		result.append(", monitoringThreadStackSize: ");
		if (monitoringThreadStackSizeESet) result.append(monitoringThreadStackSize); else result.append("<unset>");
		result.append(", recentCommand: ");
		if (recentCommandESet) result.append(recentCommand); else result.append("<unset>");
		result.append(", recentTimeStamp: ");
		if (recentTimeStampESet) result.append(recentTimeStamp); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CharacteristicComponentImpl
