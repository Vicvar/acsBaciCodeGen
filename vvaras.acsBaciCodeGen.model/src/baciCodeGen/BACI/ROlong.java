/**
 */
package baciCodeGen.BACI;

import baciCodeGen.BaciCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROlong</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Only Long Property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmFaultFamily <em>Alarm Fault Family</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmFaultMember <em>Alarm Fault Member</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmHighOff <em>Alarm High Off</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmHighOn <em>Alarm High On</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmLevel <em>Alarm Level</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmLowOff <em>Alarm Low Off</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmLowOn <em>Alarm Low On</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getROlong()
 * @model extendedMetaData="name='ROlong' kind='empty'"
 * @generated
 */
public interface ROlong extends Plong1, BaciCharacteristics {
	/**
	 * Returns the value of the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 							Here user can specify fault family for the alarm. for details of the fault family see the alarm documentation. 
	 * 							If the fault family attribute is not specified (=is empty), than default value which is BACIproperty is taken.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Fault Family</em>' attribute.
	 * @see #isSetAlarmFaultFamily()
	 * @see #unsetAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmFaultFamily()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_family'"
	 * @generated
	 */
	String getAlarmFaultFamily();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Fault Family</em>' attribute.
	 * @see #isSetAlarmFaultFamily()
	 * @see #unsetAlarmFaultFamily()
	 * @see #getAlarmFaultFamily()
	 * @generated
	 */
	void setAlarmFaultFamily(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultFamily()
	 * @see #getAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @generated
	 */
	void unsetAlarmFaultFamily();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Fault Family</em>' attribute is set.
	 * @see #unsetAlarmFaultFamily()
	 * @see #getAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @generated
	 */
	boolean isSetAlarmFaultFamily();

	/**
	 * Returns the value of the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 							Here user can specify fault member for the alarm. for details of the fault member see the alarm documentation. 
	 * 							If the fault member attribute is not specified (=is empty), than default value which is property name is taken.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Fault Member</em>' attribute.
	 * @see #isSetAlarmFaultMember()
	 * @see #unsetAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmFaultMember()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_member'"
	 * @generated
	 */
	String getAlarmFaultMember();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Fault Member</em>' attribute.
	 * @see #isSetAlarmFaultMember()
	 * @see #unsetAlarmFaultMember()
	 * @see #getAlarmFaultMember()
	 * @generated
	 */
	void setAlarmFaultMember(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultMember()
	 * @see #getAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @generated
	 */
	void unsetAlarmFaultMember();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Fault Member</em>' attribute is set.
	 * @see #unsetAlarmFaultMember()
	 * @see #getAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @generated
	 */
	boolean isSetAlarmFaultMember();

	/**
	 * Returns the value of the '<em><b>Alarm High Off</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Same type and units as the Property.
	 * Below this value alarm is cleared 
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm High Off</em>' attribute.
	 * @see #isSetAlarmHighOff()
	 * @see #unsetAlarmHighOff()
	 * @see #setAlarmHighOff(int)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmHighOff()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_high_off'"
	 * @generated
	 */
	int getAlarmHighOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmHighOff <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm High Off</em>' attribute.
	 * @see #isSetAlarmHighOff()
	 * @see #unsetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @generated
	 */
	void setAlarmHighOff(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmHighOff <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @see #setAlarmHighOff(int)
	 * @generated
	 */
	void unsetAlarmHighOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmHighOff <em>Alarm High Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm High Off</em>' attribute is set.
	 * @see #unsetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @see #setAlarmHighOff(int)
	 * @generated
	 */
	boolean isSetAlarmHighOff();

	/**
	 * Returns the value of the '<em><b>Alarm High On</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Same type and units as the Property.
	 * Above this value alarm is set 
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm High On</em>' attribute.
	 * @see #isSetAlarmHighOn()
	 * @see #unsetAlarmHighOn()
	 * @see #setAlarmHighOn(int)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmHighOn()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_high_on'"
	 * @generated
	 */
	int getAlarmHighOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmHighOn <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm High On</em>' attribute.
	 * @see #isSetAlarmHighOn()
	 * @see #unsetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @generated
	 */
	void setAlarmHighOn(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmHighOn <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @see #setAlarmHighOn(int)
	 * @generated
	 */
	void unsetAlarmHighOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmHighOn <em>Alarm High On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm High On</em>' attribute is set.
	 * @see #unsetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @see #setAlarmHighOn(int)
	 * @generated
	 */
	boolean isSetAlarmHighOn();

	/**
	 * Returns the value of the '<em><b>Alarm Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 							Defines the level (priority) of the alarm.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Level</em>' attribute.
	 * @see #isSetAlarmLevel()
	 * @see #unsetAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmLevel()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_level'"
	 * @generated
	 */
	int getAlarmLevel();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLevel <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Level</em>' attribute.
	 * @see #isSetAlarmLevel()
	 * @see #unsetAlarmLevel()
	 * @see #getAlarmLevel()
	 * @generated
	 */
	void setAlarmLevel(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLevel <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLevel()
	 * @see #getAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @generated
	 */
	void unsetAlarmLevel();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLevel <em>Alarm Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Level</em>' attribute is set.
	 * @see #unsetAlarmLevel()
	 * @see #getAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @generated
	 */
	boolean isSetAlarmLevel();

	/**
	 * Returns the value of the '<em><b>Alarm Low Off</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Same type and units as the Property.
	 * Above this value alarm is cleared
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Low Off</em>' attribute.
	 * @see #isSetAlarmLowOff()
	 * @see #unsetAlarmLowOff()
	 * @see #setAlarmLowOff(int)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmLowOff()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_low_off'"
	 * @generated
	 */
	int getAlarmLowOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLowOff <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Low Off</em>' attribute.
	 * @see #isSetAlarmLowOff()
	 * @see #unsetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @generated
	 */
	void setAlarmLowOff(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLowOff <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @see #setAlarmLowOff(int)
	 * @generated
	 */
	void unsetAlarmLowOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLowOff <em>Alarm Low Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Low Off</em>' attribute is set.
	 * @see #unsetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @see #setAlarmLowOff(int)
	 * @generated
	 */
	boolean isSetAlarmLowOff();

	/**
	 * Returns the value of the '<em><b>Alarm Low On</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Same type and units as the Property.
	 * Below this value the alarm is set.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Low On</em>' attribute.
	 * @see #isSetAlarmLowOn()
	 * @see #unsetAlarmLowOn()
	 * @see #setAlarmLowOn(int)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmLowOn()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_low_on'"
	 * @generated
	 */
	int getAlarmLowOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLowOn <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Low On</em>' attribute.
	 * @see #isSetAlarmLowOn()
	 * @see #unsetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @generated
	 */
	void setAlarmLowOn(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLowOn <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @see #setAlarmLowOn(int)
	 * @generated
	 */
	void unsetAlarmLowOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmLowOn <em>Alarm Low On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Low On</em>' attribute is set.
	 * @see #unsetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @see #setAlarmLowOn(int)
	 * @generated
	 */
	boolean isSetAlarmLowOn();

	/**
	 * Returns the value of the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum time interval (in seconds and fractions of seconds) for the notification of changes in the alarm status.
	 * Is the time you want the alarm system to check for the value of the property.
	 * It might be the same as default_timer_trig, but depending on you application and on the criticality
	 * of the property they might be different.
	 * For example:
	 *    - If a property is normally changing slowly, but it is critical
	 *      to see as soon as possible an alarm if it goes out of range, I would normally
	 *      put alarm_timer_trig = 0.1 default_timer_trig
	 *    - The opposite might also happen, if you care for seeing fine variations, for example to plot them,
	 *      but not much for alarms because the change is in small steps and the critical 
	 *      range band before you get damage
	 *      is quite large, you can have the alarm_timer_trig = 10 default_timer_trig 
	 * A value of 0.0 (default) means that alarm triggering is disabled.
	 * See the documentation of the specific implementation for details on the implications of this value.
	 * For example in the ACS CPP baci implementation, the value of a property is checked for its status with respect to the alarm configuration by an internal monitor defined with this time interval. This means that, depending on the underlying DevIO implementation, changes in the alarm status accurring during this time interval might get un-noticed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Timer Trig</em>' attribute.
	 * @see #isSetAlarmTimerTrig()
	 * @see #unsetAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @see baciCodeGen.BACI.BACIPackage#getROlong_AlarmTimerTrig()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='alarm_timer_trig'"
	 * @generated
	 */
	double getAlarmTimerTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Timer Trig</em>' attribute.
	 * @see #isSetAlarmTimerTrig()
	 * @see #unsetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @generated
	 */
	void setAlarmTimerTrig(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	void unsetAlarmTimerTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Timer Trig</em>' attribute is set.
	 * @see #unsetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	boolean isSetAlarmTimerTrig();

} // ROlong
