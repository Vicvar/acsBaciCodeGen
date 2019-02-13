/**
 */
package baciCodeGen.BACIProperties;

import baciCodeGen.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROfloat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Only Float Property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultFamily <em>Alarm Fault Family</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultMember <em>Alarm Fault Member</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOff <em>Alarm High Off</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOn <em>Alarm High On</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLevel <em>Alarm Level</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOff <em>Alarm Low Off</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOn <em>Alarm Low On</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.ROfloat#getAlarmTimerTrig <em>Alarm Timer Trig</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat()
 * @model extendedMetaData="name='ROfloat' kind='empty'"
 * @generated
 */
public interface ROfloat extends Pfloat1, PropertyDefinition {
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
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmFaultFamily()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_family'"
	 * @generated
	 */
	String getAlarmFaultFamily();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultFamily()
	 * @see #getAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @generated
	 */
	void unsetAlarmFaultFamily();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute is set.
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
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmFaultMember()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_member'"
	 * @generated
	 */
	String getAlarmFaultMember();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultMember()
	 * @see #getAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @generated
	 */
	void unsetAlarmFaultMember();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute is set.
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
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the ROlong propery.							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm High Off</em>' attribute.
	 * @see #isSetAlarmHighOff()
	 * @see #unsetAlarmHighOff()
	 * @see #setAlarmHighOff(float)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmHighOff()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='alarm_high_off'"
	 * @generated
	 */
	float getAlarmHighOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOff <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm High Off</em>' attribute.
	 * @see #isSetAlarmHighOff()
	 * @see #unsetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @generated
	 */
	void setAlarmHighOff(float value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOff <em>Alarm High Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @see #setAlarmHighOff(float)
	 * @generated
	 */
	void unsetAlarmHighOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOff <em>Alarm High Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm High Off</em>' attribute is set.
	 * @see #unsetAlarmHighOff()
	 * @see #getAlarmHighOff()
	 * @see #setAlarmHighOff(float)
	 * @generated
	 */
	boolean isSetAlarmHighOff();

	/**
	 * Returns the value of the '<em><b>Alarm High On</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the ROlong propery.						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm High On</em>' attribute.
	 * @see #isSetAlarmHighOn()
	 * @see #unsetAlarmHighOn()
	 * @see #setAlarmHighOn(float)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmHighOn()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='alarm_high_on'"
	 * @generated
	 */
	float getAlarmHighOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOn <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm High On</em>' attribute.
	 * @see #isSetAlarmHighOn()
	 * @see #unsetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @generated
	 */
	void setAlarmHighOn(float value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOn <em>Alarm High On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @see #setAlarmHighOn(float)
	 * @generated
	 */
	void unsetAlarmHighOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOn <em>Alarm High On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm High On</em>' attribute is set.
	 * @see #unsetAlarmHighOn()
	 * @see #getAlarmHighOn()
	 * @see #setAlarmHighOn(float)
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
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmLevel()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_level'"
	 * @generated
	 */
	int getAlarmLevel();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLevel <em>Alarm Level</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLevel <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLevel()
	 * @see #getAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @generated
	 */
	void unsetAlarmLevel();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLevel <em>Alarm Level</em>}' attribute is set.
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
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the ROlong propery.							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Low Off</em>' attribute.
	 * @see #isSetAlarmLowOff()
	 * @see #unsetAlarmLowOff()
	 * @see #setAlarmLowOff(float)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmLowOff()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='alarm_low_off'"
	 * @generated
	 */
	float getAlarmLowOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOff <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Low Off</em>' attribute.
	 * @see #isSetAlarmLowOff()
	 * @see #unsetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @generated
	 */
	void setAlarmLowOff(float value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOff <em>Alarm Low Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @see #setAlarmLowOff(float)
	 * @generated
	 */
	void unsetAlarmLowOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOff <em>Alarm Low Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Low Off</em>' attribute is set.
	 * @see #unsetAlarmLowOff()
	 * @see #getAlarmLowOff()
	 * @see #setAlarmLowOff(float)
	 * @generated
	 */
	boolean isSetAlarmLowOff();

	/**
	 * Returns the value of the '<em><b>Alarm Low On</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the ROlong propery.						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Low On</em>' attribute.
	 * @see #isSetAlarmLowOn()
	 * @see #unsetAlarmLowOn()
	 * @see #setAlarmLowOn(float)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmLowOn()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='alarm_low_on'"
	 * @generated
	 */
	float getAlarmLowOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOn <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Low On</em>' attribute.
	 * @see #isSetAlarmLowOn()
	 * @see #unsetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @generated
	 */
	void setAlarmLowOn(float value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOn <em>Alarm Low On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @see #setAlarmLowOn(float)
	 * @generated
	 */
	void unsetAlarmLowOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOn <em>Alarm Low On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Low On</em>' attribute is set.
	 * @see #unsetAlarmLowOn()
	 * @see #getAlarmLowOn()
	 * @see #setAlarmLowOn(float)
	 * @generated
	 */
	boolean isSetAlarmLowOn();

	/**
	 * Returns the value of the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the ROlong propery.	
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Timer Trig</em>' attribute.
	 * @see #isSetAlarmTimerTrig()
	 * @see #unsetAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getROfloat_AlarmTimerTrig()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='alarm_timer_trig'"
	 * @generated
	 */
	double getAlarmTimerTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	void unsetAlarmTimerTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Timer Trig</em>' attribute is set.
	 * @see #unsetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	boolean isSetAlarmTimerTrig();

} // ROfloat
