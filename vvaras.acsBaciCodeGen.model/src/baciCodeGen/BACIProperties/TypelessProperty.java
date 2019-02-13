/**
 */
package baciCodeGen.BACIProperties;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typeless Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines Characteristics common to all properties, independently from their type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMaxInt <em>Archive Max Int</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMechanism <em>Archive Mechanism</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMinInt <em>Archive Min Int</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getArchivePriority <em>Archive Priority</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#isArchiveSuppress <em>Archive Suppress</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getDefaultTimerTrig <em>Default Timer Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getFormat <em>Format</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#isInitializeDevio <em>Initialize Devio</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getMinTimerTrig <em>Min Timer Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getResolution <em>Resolution</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.TypelessProperty#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty()
 * @model extendedMetaData="name='TypelessProperty' kind='empty'"
 * @generated
 */
public interface TypelessProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Archive Max Int</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The maximum amount of time (in seconds and fractions of seconds) allowed 
	 * to pass between two consecutive submissions to the log. 
	 * If the time exceeds the value specified here, the log entry should be generated 
	 * even though the value of the parameter has not changed sufficiently.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Max Int</em>' attribute.
	 * @see #isSetArchiveMaxInt()
	 * @see #unsetArchiveMaxInt()
	 * @see #setArchiveMaxInt(double)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_ArchiveMaxInt()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_max_int'"
	 * @generated
	 */
	double getArchiveMaxInt();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMaxInt <em>Archive Max Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Max Int</em>' attribute.
	 * @see #isSetArchiveMaxInt()
	 * @see #unsetArchiveMaxInt()
	 * @see #getArchiveMaxInt()
	 * @generated
	 */
	void setArchiveMaxInt(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMaxInt <em>Archive Max Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveMaxInt()
	 * @see #getArchiveMaxInt()
	 * @see #setArchiveMaxInt(double)
	 * @generated
	 */
	void unsetArchiveMaxInt();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMaxInt <em>Archive Max Int</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Max Int</em>' attribute is set.
	 * @see #unsetArchiveMaxInt()
	 * @see #getArchiveMaxInt()
	 * @see #setArchiveMaxInt(double)
	 * @generated
	 */
	boolean isSetArchiveMaxInt();

	/**
	 * Returns the value of the '<em><b>Archive Mechanism</b></em>' attribute.
	 * The default value is <code>"monitor_collector"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The attribute archive_mechanism can be used to specify which mechanism should be taken for 
	 * 						archiving the property. In this way a system that uses ACS can define its own archiving mechanism. 
	 * 						ACS provides support for archiving properties through notification channel (notification_channel). ALMA SW provides in ARCHIVE subsytem additional
	 * 						 mechanism: monitor collector (monitor_collector). From ACS 9.0 monitor collector is also default mechanism for archiving properties.
	 * 						 Depend on the implementation of the archiving mechanism all or just some of archive_XYZ attributes can be used for its configuration.
	 * 						 Notification channel uses all (three), meanwhile the monitor collector uses only archive_max_int.
	 * 					    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Mechanism</em>' attribute.
	 * @see #isSetArchiveMechanism()
	 * @see #unsetArchiveMechanism()
	 * @see #setArchiveMechanism(String)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_ArchiveMechanism()
	 * @model default="monitor_collector" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='archive_mechanism'"
	 * @generated
	 */
	String getArchiveMechanism();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMechanism <em>Archive Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Mechanism</em>' attribute.
	 * @see #isSetArchiveMechanism()
	 * @see #unsetArchiveMechanism()
	 * @see #getArchiveMechanism()
	 * @generated
	 */
	void setArchiveMechanism(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMechanism <em>Archive Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveMechanism()
	 * @see #getArchiveMechanism()
	 * @see #setArchiveMechanism(String)
	 * @generated
	 */
	void unsetArchiveMechanism();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMechanism <em>Archive Mechanism</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Mechanism</em>' attribute is set.
	 * @see #unsetArchiveMechanism()
	 * @see #getArchiveMechanism()
	 * @see #setArchiveMechanism(String)
	 * @generated
	 */
	boolean isSetArchiveMechanism();

	/**
	 * Returns the value of the '<em><b>Archive Min Int</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The minimum amount of time (in seconds and fractions of seconds) allowed to pass 
	 * between two consecutive submissions to the log. 
	 * If the time is smaller than the value specified here, the log entry is not submitted, 
	 * even though the value of the parameter has changed.
	 * This characteristic is used for archive monitors and is independent from the min_timer_trig characteristic, that is instead used for user defined monitors.                      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Min Int</em>' attribute.
	 * @see #isSetArchiveMinInt()
	 * @see #unsetArchiveMinInt()
	 * @see #setArchiveMinInt(double)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_ArchiveMinInt()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_min_int'"
	 * @generated
	 */
	double getArchiveMinInt();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMinInt <em>Archive Min Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Min Int</em>' attribute.
	 * @see #isSetArchiveMinInt()
	 * @see #unsetArchiveMinInt()
	 * @see #getArchiveMinInt()
	 * @generated
	 */
	void setArchiveMinInt(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMinInt <em>Archive Min Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveMinInt()
	 * @see #getArchiveMinInt()
	 * @see #setArchiveMinInt(double)
	 * @generated
	 */
	void unsetArchiveMinInt();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMinInt <em>Archive Min Int</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Min Int</em>' attribute is set.
	 * @see #unsetArchiveMinInt()
	 * @see #getArchiveMinInt()
	 * @see #setArchiveMinInt(double)
	 * @generated
	 */
	boolean isSetArchiveMinInt();

	/**
	 * Returns the value of the '<em><b>Archive Priority</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * The priority of the log entry that will carry the information required for archiving the parameter's value.
	 * Default is 3 (LM_INFO). If the priority exceeds the value specified in the logging proxy's MaxCachePriority,
	 * the archiving data will be transmitted to the centralized logger immediately.
	 *  If it is below MinCachePriority, the data will be ignored. 
	 *  If it is somewhere in-between, it will be cached locally until a sufficient amount of log entries 
	 *  is collected for transmission to the centralized logger.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Priority</em>' attribute.
	 * @see #isSetArchivePriority()
	 * @see #unsetArchivePriority()
	 * @see #setArchivePriority(int)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_ArchivePriority()
	 * @model default="3" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='archive_priority'"
	 * @generated
	 */
	int getArchivePriority();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchivePriority <em>Archive Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Priority</em>' attribute.
	 * @see #isSetArchivePriority()
	 * @see #unsetArchivePriority()
	 * @see #getArchivePriority()
	 * @generated
	 */
	void setArchivePriority(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchivePriority <em>Archive Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchivePriority()
	 * @see #getArchivePriority()
	 * @see #setArchivePriority(int)
	 * @generated
	 */
	void unsetArchivePriority();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchivePriority <em>Archive Priority</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Priority</em>' attribute is set.
	 * @see #unsetArchivePriority()
	 * @see #getArchivePriority()
	 * @see #setArchivePriority(int)
	 * @generated
	 */
	boolean isSetArchivePriority();

	/**
	 * Returns the value of the '<em><b>Archive Suppress</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 						The attribute archive_suppress can be used to enable, disable archiving of the property w/o changing the 
	 * 						other values of archiving like archive_max_int, and archive_min_int.
	 * 					    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Suppress</em>' attribute.
	 * @see #isSetArchiveSuppress()
	 * @see #unsetArchiveSuppress()
	 * @see #setArchiveSuppress(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_ArchiveSuppress()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='archive_suppress'"
	 * @generated
	 */
	boolean isArchiveSuppress();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#isArchiveSuppress <em>Archive Suppress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Suppress</em>' attribute.
	 * @see #isSetArchiveSuppress()
	 * @see #unsetArchiveSuppress()
	 * @see #isArchiveSuppress()
	 * @generated
	 */
	void setArchiveSuppress(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#isArchiveSuppress <em>Archive Suppress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveSuppress()
	 * @see #isArchiveSuppress()
	 * @see #setArchiveSuppress(boolean)
	 * @generated
	 */
	void unsetArchiveSuppress();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#isArchiveSuppress <em>Archive Suppress</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Suppress</em>' attribute is set.
	 * @see #unsetArchiveSuppress()
	 * @see #isArchiveSuppress()
	 * @see #setArchiveSuppress(boolean)
	 * @generated
	 */
	boolean isSetArchiveSuppress();

	/**
	 * Returns the value of the '<em><b>Default Timer Trig</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a timer is created without requiring a specific time interval, this is the value used.
	 * Normally, the value of a property has an intrisic change rate that should be specified here (in seconds and fractions of seconds).
	 * In this way applications can always get a reasonable update frequency without having to "guess" how often they have to request a value and without oversampling.
	 * This is particularly useful for GUI applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Timer Trig</em>' attribute.
	 * @see #isSetDefaultTimerTrig()
	 * @see #unsetDefaultTimerTrig()
	 * @see #setDefaultTimerTrig(double)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_DefaultTimerTrig()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='default_timer_trig'"
	 * @generated
	 */
	double getDefaultTimerTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getDefaultTimerTrig <em>Default Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Timer Trig</em>' attribute.
	 * @see #isSetDefaultTimerTrig()
	 * @see #unsetDefaultTimerTrig()
	 * @see #getDefaultTimerTrig()
	 * @generated
	 */
	void setDefaultTimerTrig(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getDefaultTimerTrig <em>Default Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultTimerTrig()
	 * @see #getDefaultTimerTrig()
	 * @see #setDefaultTimerTrig(double)
	 * @generated
	 */
	void unsetDefaultTimerTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getDefaultTimerTrig <em>Default Timer Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Timer Trig</em>' attribute is set.
	 * @see #unsetDefaultTimerTrig()
	 * @see #getDefaultTimerTrig()
	 * @see #setDefaultTimerTrig(double)
	 * @generated
	 */
	boolean isSetDefaultTimerTrig();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Description of the function and purpose of the Property.
	 * Used in panels and to provide short help and documentation about the specific property.
	 *       						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_Description()
	 * @model default="-" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "C printf" format to be used to display the value of the Property.
	 * To be used by applications that dynamically build a string or a printout
	 * of the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(String)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_Format()
	 * @model default="-" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='format'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(String)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(String)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Initialize Devio</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It is used to initialize the devIO of the property if it is true. It uses the "default_value" characteristic to initialize the devIO.
	 * The default it is false/0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialize Devio</em>' attribute.
	 * @see #isSetInitializeDevio()
	 * @see #unsetInitializeDevio()
	 * @see #setInitializeDevio(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_InitializeDevio()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='initialize_devio'"
	 * @generated
	 */
	boolean isInitializeDevio();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#isInitializeDevio <em>Initialize Devio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize Devio</em>' attribute.
	 * @see #isSetInitializeDevio()
	 * @see #unsetInitializeDevio()
	 * @see #isInitializeDevio()
	 * @generated
	 */
	void setInitializeDevio(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#isInitializeDevio <em>Initialize Devio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitializeDevio()
	 * @see #isInitializeDevio()
	 * @see #setInitializeDevio(boolean)
	 * @generated
	 */
	void unsetInitializeDevio();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#isInitializeDevio <em>Initialize Devio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initialize Devio</em>' attribute is set.
	 * @see #unsetInitializeDevio()
	 * @see #isInitializeDevio()
	 * @see #setInitializeDevio(boolean)
	 * @generated
	 */
	boolean isSetInitializeDevio();

	/**
	 * Returns the value of the '<em><b>Min Timer Trig</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimun allowed time interval (in seconds and fractions of second) for values published by timers.
	 * Independently from the requested time interval or from the frequency of change in case of monitors on changes, no values will be published less than min_timer_trig seconds from a previously published values.
	 * This characteristic is ment to limit bandwidth and avoit floading the system with 
	 * new values.
	 * This characteristic is used for user defined monitors and is independent from the min_timer_trig characteristic, that is equivalently used for archive monitors.                      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Timer Trig</em>' attribute.
	 * @see #isSetMinTimerTrig()
	 * @see #unsetMinTimerTrig()
	 * @see #setMinTimerTrig(double)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_MinTimerTrig()
	 * @model default="0.001" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='min_timer_trig'"
	 * @generated
	 */
	double getMinTimerTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getMinTimerTrig <em>Min Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Timer Trig</em>' attribute.
	 * @see #isSetMinTimerTrig()
	 * @see #unsetMinTimerTrig()
	 * @see #getMinTimerTrig()
	 * @generated
	 */
	void setMinTimerTrig(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getMinTimerTrig <em>Min Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinTimerTrig()
	 * @see #getMinTimerTrig()
	 * @see #setMinTimerTrig(double)
	 * @generated
	 */
	void unsetMinTimerTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getMinTimerTrig <em>Min Timer Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Timer Trig</em>' attribute is set.
	 * @see #unsetMinTimerTrig()
	 * @see #getMinTimerTrig()
	 * @see #setMinTimerTrig(double)
	 * @generated
	 */
	boolean isSetMinTimerTrig();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The default value is <code>"65535"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bit pattern representing the significant bits in the property's value.
	 * For example a long is represented by 64 bits, but a physical device 
	 * might deliver a value consisting only of 24 bits.
	 * In that case the resolution attribute has only the first 24 bits up.
	 * The remaining 8 bits shall be ignored by the application. 
	 * This attribute is useful for example for returning the resolution of analog-digital conversion 
	 * The specific usage must be documented case by case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #setResolution(BigInteger)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_Resolution()
	 * @model default="65535" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='resolution'"
	 * @generated
	 */
	BigInteger getResolution();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(BigInteger value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResolution()
	 * @see #getResolution()
	 * @see #setResolution(BigInteger)
	 * @generated
	 */
	void unsetResolution();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getResolution <em>Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resolution</em>' attribute is set.
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @see #setResolution(BigInteger)
	 * @generated
	 */
	boolean isSetResolution();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The default value is <code>"-"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string representing the units (normally base SI units or combinations of SI units) of the quantity represented by the property. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #setUnits(String)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getTypelessProperty_Units()
	 * @model default="-" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnits()
	 * @see #getUnits()
	 * @see #setUnits(String)
	 * @generated
	 */
	void unsetUnits();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.TypelessProperty#getUnits <em>Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Units</em>' attribute is set.
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @see #setUnits(String)
	 * @generated
	 */
	boolean isSetUnits();

} // TypelessProperty
