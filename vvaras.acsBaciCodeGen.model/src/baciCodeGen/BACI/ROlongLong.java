/**
 */
package baciCodeGen.BACI;

import baciCodeGen.BaciCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROlong Long</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Only Long Long Property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultMember <em>Alarm Fault Member</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOff <em>Alarm High Off</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOn <em>Alarm High On</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmLevel <em>Alarm Level</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOff <em>Alarm Low Off</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOn <em>Alarm Low On</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROlongLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getROlongLong()
 * @model extendedMetaData="name='ROlongLong' kind='empty'"
 * @generated
 */
public interface ROlongLong extends PlongLong1, BaciCharacteristics {
	/**
	 * Returns the value of the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 							For a description of this characteristic, see documentation of the ROlong propery.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Fault Family</em>' attribute.
	 * @see #isSetAlarmFaultFamily()
	 * @see #unsetAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmFaultFamily()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_family'"
	 * @generated
	 */
	String getAlarmFaultFamily();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultFamily()
	 * @see #getAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @generated
	 */
	void unsetAlarmFaultFamily();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute is set.
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
	 * 							For a description of this characteristic, see documentation of the ROlong propery.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Fault Member</em>' attribute.
	 * @see #isSetAlarmFaultMember()
	 * @see #unsetAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmFaultMember()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_member'"
	 * @generated
	 */
	String getAlarmFaultMember();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultMember()
	 * @see #getAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @generated
	 */
	void unsetAlarmFaultMember();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation of the ROlong propery.							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm High Off</em>' attribute.
	 * @see #isSetAlarmHighOff()
	 * @see #unsetAlarmHighOff()
	 * @see #setAlarmHighOff(long)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmHighOff()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='alarm_high_off'"
	 * @generated
	 */
	long getAlarmHighOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOff <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm High Off</em>' attribute.
	 * @see #isSetAlarmHighOff()
	 * @see #unsetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @generated
	 */
	void setAlarmHighOff(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOff <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @see #setAlarmHighOff(long)
	 * @generated
	 */
	void unsetAlarmHighOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOff <em>Alarm High Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm High Off</em>' attribute is set.
	 * @see #unsetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @see #setAlarmHighOff(long)
	 * @generated
	 */
	boolean isSetAlarmHighOff();

	/**
	 * Returns the value of the '<em><b>Alarm High On</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the ROlong propery.						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm High On</em>' attribute.
	 * @see #isSetAlarmHighOn()
	 * @see #unsetAlarmHighOn()
	 * @see #setAlarmHighOn(long)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmHighOn()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='alarm_high_on'"
	 * @generated
	 */
	long getAlarmHighOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOn <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm High On</em>' attribute.
	 * @see #isSetAlarmHighOn()
	 * @see #unsetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @generated
	 */
	void setAlarmHighOn(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOn <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @see #setAlarmHighOn(long)
	 * @generated
	 */
	void unsetAlarmHighOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmHighOn <em>Alarm High On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm High On</em>' attribute is set.
	 * @see #unsetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @see #setAlarmHighOn(long)
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
	 * 							For a description of this characteristic, see documentation of the ROlong propery.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Level</em>' attribute.
	 * @see #isSetAlarmLevel()
	 * @see #unsetAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmLevel()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_level'"
	 * @generated
	 */
	int getAlarmLevel();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLevel <em>Alarm Level</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLevel <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLevel()
	 * @see #getAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @generated
	 */
	void unsetAlarmLevel();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLevel <em>Alarm Level</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation of the ROlong propery.							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Low Off</em>' attribute.
	 * @see #isSetAlarmLowOff()
	 * @see #unsetAlarmLowOff()
	 * @see #setAlarmLowOff(long)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmLowOff()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='alarm_low_off'"
	 * @generated
	 */
	long getAlarmLowOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOff <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Low Off</em>' attribute.
	 * @see #isSetAlarmLowOff()
	 * @see #unsetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @generated
	 */
	void setAlarmLowOff(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOff <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @see #setAlarmLowOff(long)
	 * @generated
	 */
	void unsetAlarmLowOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOff <em>Alarm Low Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Low Off</em>' attribute is set.
	 * @see #unsetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @see #setAlarmLowOff(long)
	 * @generated
	 */
	boolean isSetAlarmLowOff();

	/**
	 * Returns the value of the '<em><b>Alarm Low On</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the ROlong propery.						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Low On</em>' attribute.
	 * @see #isSetAlarmLowOn()
	 * @see #unsetAlarmLowOn()
	 * @see #setAlarmLowOn(long)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmLowOn()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='alarm_low_on'"
	 * @generated
	 */
	long getAlarmLowOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOn <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Low On</em>' attribute.
	 * @see #isSetAlarmLowOn()
	 * @see #unsetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @generated
	 */
	void setAlarmLowOn(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOn <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @see #setAlarmLowOn(long)
	 * @generated
	 */
	void unsetAlarmLowOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmLowOn <em>Alarm Low On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Low On</em>' attribute is set.
	 * @see #unsetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @see #setAlarmLowOn(long)
	 * @generated
	 */
	boolean isSetAlarmLowOn();

	/**
	 * Returns the value of the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the ROlong propery.	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Timer Trig</em>' attribute.
	 * @see #isSetAlarmTimerTrig()
	 * @see #unsetAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @see baciCodeGen.BACI.BACIPackage#getROlongLong_AlarmTimerTrig()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='alarm_timer_trig'"
	 * @generated
	 */
	double getAlarmTimerTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	void unsetAlarmTimerTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROlongLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Timer Trig</em>' attribute is set.
	 * @see #unsetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	boolean isSetAlarmTimerTrig();

} // ROlongLong
