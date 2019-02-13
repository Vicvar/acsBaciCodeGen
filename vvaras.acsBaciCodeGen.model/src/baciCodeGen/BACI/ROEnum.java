/**
 */
package baciCodeGen.BACI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RO Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Only Enumeration Property. Used to handle enumerations of values defined by the user.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.ROEnum#getAlarmFaultFamily <em>Alarm Fault Family</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROEnum#getAlarmFaultMember <em>Alarm Fault Member</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROEnum#getAlarmLevel <em>Alarm Level</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROEnum#getAlarmOff <em>Alarm Off</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROEnum#getAlarmOn <em>Alarm On</em>}</li>
 *   <li>{@link baciCodeGen.BACI.ROEnum#getAlarmTimerTrig <em>Alarm Timer Trig</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getROEnum()
 * @model extendedMetaData="name='ROEnum' kind='empty'"
 * @generated
 */
public interface ROEnum extends PEnum1 {
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
	 * @see baciCodeGen.BACI.BACIPackage#getROEnum_AlarmFaultFamily()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_family'"
	 * @generated
	 */
	String getAlarmFaultFamily();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultFamily()
	 * @see #getAlarmFaultFamily()
	 * @see #setAlarmFaultFamily(String)
	 * @generated
	 */
	void unsetAlarmFaultFamily();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmFaultFamily <em>Alarm Fault Family</em>}' attribute is set.
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
	 * @see baciCodeGen.BACI.BACIPackage#getROEnum_AlarmFaultMember()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_fault_member'"
	 * @generated
	 */
	String getAlarmFaultMember();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmFaultMember()
	 * @see #getAlarmFaultMember()
	 * @see #setAlarmFaultMember(String)
	 * @generated
	 */
	void unsetAlarmFaultMember();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmFaultMember <em>Alarm Fault Member</em>}' attribute is set.
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
	 * @see baciCodeGen.BACI.BACIPackage#getROEnum_AlarmLevel()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='alarm_level'"
	 * @generated
	 */
	int getAlarmLevel();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmLevel <em>Alarm Level</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmLevel <em>Alarm Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmLevel()
	 * @see #getAlarmLevel()
	 * @see #setAlarmLevel(int)
	 * @generated
	 */
	void unsetAlarmLevel();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmLevel <em>Alarm Level</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Alarm Off</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comma-separated list of enumeration indexes, mapping
	 * into the values for the enumeration that correspond to alarm  OFF.
	 * For example 1,4 would mean that enumerations whose indexes are
	 * 1 and 4 correspond to the property alarm state set to OFF
	 * The value of this characteristic is the complement of alarm_on and is actually
	 * not necessary in the code but is defined here to provide a more clear configuration documentation.
	 * NOTE: In C++ BACI implementation enumerations values are
	 * indexs starting from 0 mapped into the enumeration definitions.
	 * Since CORBA does not provide any standard mapping between enumerations
	 * and index numbers, this might not be true for other implementations of 
	 * properties. Check with the implementation specific documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm Off</em>' attribute.
	 * @see #isSetAlarmOff()
	 * @see #unsetAlarmOff()
	 * @see #setAlarmOff(String)
	 * @see baciCodeGen.BACI.BACIPackage#getROEnum_AlarmOff()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_off'"
	 * @generated
	 */
	String getAlarmOff();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmOff <em>Alarm Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm Off</em>' attribute.
	 * @see #isSetAlarmOff()
	 * @see #unsetAlarmOff()
	 * @see #getAlarmOff()
	 * @generated
	 */
	void setAlarmOff(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmOff <em>Alarm Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmOff()
	 * @see #getAlarmOff()
	 * @see #setAlarmOff(String)
	 * @generated
	 */
	void unsetAlarmOff();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmOff <em>Alarm Off</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Off</em>' attribute is set.
	 * @see #unsetAlarmOff()
	 * @see #getAlarmOff()
	 * @see #setAlarmOff(String)
	 * @generated
	 */
	boolean isSetAlarmOff();

	/**
	 * Returns the value of the '<em><b>Alarm On</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comma-separated list of enumeration indexes, mapping
	 * into the values for the enumeration that correspond to alarm  ON.
	 * For example 0,2,3 would mean that enumerations whose indexes are
	 * 0,2 and 3 correspond to the property alarm state set to ON.
	 * NOTE: In C++ BACI implementation enumerations values are
	 * indexs starting from 0 mapped into the enumeration definitions.
	 * Since CORBA does not provide any standard mapping between enumerations
	 * and index numbers, this might not be true for other implementations of 
	 * properties. Check with the implementation specific documentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm On</em>' attribute.
	 * @see #isSetAlarmOn()
	 * @see #unsetAlarmOn()
	 * @see #setAlarmOn(String)
	 * @see baciCodeGen.BACI.BACIPackage#getROEnum_AlarmOn()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='alarm_on'"
	 * @generated
	 */
	String getAlarmOn();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmOn <em>Alarm On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm On</em>' attribute.
	 * @see #isSetAlarmOn()
	 * @see #unsetAlarmOn()
	 * @see #getAlarmOn()
	 * @generated
	 */
	void setAlarmOn(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmOn <em>Alarm On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmOn()
	 * @see #getAlarmOn()
	 * @see #setAlarmOn(String)
	 * @generated
	 */
	void unsetAlarmOn();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmOn <em>Alarm On</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm On</em>' attribute is set.
	 * @see #unsetAlarmOn()
	 * @see #getAlarmOn()
	 * @see #setAlarmOn(String)
	 * @generated
	 */
	boolean isSetAlarmOn();

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
	 * @see baciCodeGen.BACI.BACIPackage#getROEnum_AlarmTimerTrig()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='alarm_timer_trig'"
	 * @generated
	 */
	double getAlarmTimerTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	void unsetAlarmTimerTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.ROEnum#getAlarmTimerTrig <em>Alarm Timer Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alarm Timer Trig</em>' attribute is set.
	 * @see #unsetAlarmTimerTrig()
	 * @see #getAlarmTimerTrig()
	 * @see #setAlarmTimerTrig(double)
	 * @generated
	 */
	boolean isSetAlarmTimerTrig();

} // ROEnum
