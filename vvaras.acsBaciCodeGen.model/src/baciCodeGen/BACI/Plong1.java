/**
 */
package baciCodeGen.BACI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plong1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base schema for Long Properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.Plong1#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Plong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Plong1#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Plong1#getGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Plong1#getGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Plong1#getMinDeltaTrig <em>Min Delta Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Plong1#getMinStep <em>Min Step</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getPlong1()
 * @model extendedMetaData="name='Plong' kind='empty'"
 * @generated
 */
public interface Plong1 extends Plong {
	/**
	 * Returns the value of the '<em><b>Archive Delta</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Same type and units as parameter Property. Defines what a change in parameter value is.
	 * If the value changes for less than the amount specified here, no log entry is generated.
	 *                                        
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #setArchiveDelta(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	int getArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @generated
	 */
	void setArchiveDelta(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(int)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getArchiveDelta <em>Archive Delta</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Delta</em>' attribute is set.
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(int)
	 * @generated
	 */
	boolean isSetArchiveDelta();

	/**
	 * Returns the value of the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * A percentage value of double type. Defines what a percentual change in parameter value is.
	 * If the value changes percentually less than the amount specified here, no log entry is generated.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta Percent</em>' attribute.
	 * @see #isSetArchiveDeltaPercent()
	 * @see #unsetArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Delta Percent</em>' attribute.
	 * @see #isSetArchiveDeltaPercent()
	 * @see #unsetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @generated
	 */
	void setArchiveDeltaPercent(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Delta Percent</em>' attribute is set.
	 * @see #unsetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	boolean isSetArchiveDeltaPercent();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * The default value for this property, used when the property is not initialised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_DefaultValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(int)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(int)
	 * @generated
	 */
	boolean isSetDefaultValue();

	/**
	 * Returns the value of the '<em><b>Graph Max</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * This characteristic represents the miximum value that the property will ever reach.
	 * The name come from the fact that it normally represents the recommended maximum for charts and gauges that display the value, but the actual meaning is wider.
	 * It should not be confused with the max_value characteristic of writable properties. The max_value represents the maximum value that can be SET, but the actual value reached by the property can in many case be higher (and defined by graph_max).
	 * For example while a device moves to the maximum allowerd set position, there can be an overshoot. Typically devices of this kind have a soft and an hard upper limit.
	 * TODO: It might be better to rename this characteristic to better express the actual meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #setGraphMax(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_GraphMax()
	 * @model default="2147483647" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='graph_max'"
	 * @generated
	 */
	int getGraphMax();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #getGraphMax()
	 * @generated
	 */
	void setGraphMax(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMax()
	 * @see #getGraphMax()
	 * @see #setGraphMax(int)
	 * @generated
	 */
	void unsetGraphMax();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getGraphMax <em>Graph Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Max</em>' attribute is set.
	 * @see #unsetGraphMax()
	 * @see #getGraphMax()
	 * @see #setGraphMax(int)
	 * @generated
	 */
	boolean isSetGraphMax();

	/**
	 * Returns the value of the '<em><b>Graph Min</b></em>' attribute.
	 * The default value is <code>"-2147483648"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * This characteristic represents the minimum value that the property will ever reach.
	 * The name come from the fact that it normally represents the recommended minimum for charts and gauges that display the value, but the actual meaning is wider.
	 * It should not be confused with the min_value characteristic of writable properties. The min_value represents the minimum value that can be SET, but the actual value reached by the property can in many case be lower (and defined by graph_min).
	 * For example while a device moves to the minimum allowerd set position, there can be an overshoot. Typically devices of this kind have a soft and an hard lower limit.
	 * TODO: It might be better to rename this characteristic to better express the actual meaning. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #setGraphMin(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_GraphMin()
	 * @model default="-2147483648" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='graph_min'"
	 * @generated
	 */
	int getGraphMin();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #getGraphMin()
	 * @generated
	 */
	void setGraphMin(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMin()
	 * @see #getGraphMin()
	 * @see #setGraphMin(int)
	 * @generated
	 */
	void unsetGraphMin();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getGraphMin <em>Graph Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Min</em>' attribute is set.
	 * @see #unsetGraphMin()
	 * @see #getGraphMin()
	 * @see #setGraphMin(int)
	 * @generated
	 */
	boolean isSetGraphMin();

	/**
	 * Returns the value of the '<em><b>Min Delta Trig</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * Minimum change in value (with respect to the last value published) that will trigger an on-change monitor.
	 * For a change smaller than this value, no motir will be triggered.
	 * Important to filter out small random oscillations of the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Delta Trig</em>' attribute.
	 * @see #isSetMinDeltaTrig()
	 * @see #unsetMinDeltaTrig()
	 * @see #setMinDeltaTrig(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_MinDeltaTrig()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='min_delta_trig'"
	 * @generated
	 */
	int getMinDeltaTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delta Trig</em>' attribute.
	 * @see #isSetMinDeltaTrig()
	 * @see #unsetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @generated
	 */
	void setMinDeltaTrig(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @see #setMinDeltaTrig(int)
	 * @generated
	 */
	void unsetMinDeltaTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Delta Trig</em>' attribute is set.
	 * @see #unsetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @see #setMinDeltaTrig(int)
	 * @generated
	 */
	boolean isSetMinDeltaTrig();

	/**
	 * Returns the value of the '<em><b>Min Step</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * This is the minimum step increment and decrement for the property.
	 * It is typically used by increment and decrement methods.
	 * A typical case is an "increment button", used to increment stepwise the value of a writable property by clicking on it.
	 * It can also be used to draw proper scale tags on a graph.
	 * When connecting to physical devices, this characteristic is often related to the
	 * resolution of the device and, therefore, to the resolution characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #setMinStep(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlong1_MinStep()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='min_step'"
	 * @generated
	 */
	int getMinStep();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Plong1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @generated
	 */
	void setMinStep(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Plong1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(int)
	 * @generated
	 */
	void unsetMinStep();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Plong1#getMinStep <em>Min Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Step</em>' attribute is set.
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(int)
	 * @generated
	 */
	boolean isSetMinStep();

} // Plong1
