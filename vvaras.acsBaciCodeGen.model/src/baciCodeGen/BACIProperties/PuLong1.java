/**
 */
package baciCodeGen.BACIProperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pu Long1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base schema for Unsigned Long Properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getMinDeltaTrig <em>Min Delta Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PuLong1#getMinStep <em>Min Step</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1()
 * @model extendedMetaData="name='PuLong' kind='empty'"
 * @generated
 */
public interface PuLong1 extends PuLong {
	/**
	 * Returns the value of the '<em><b>Archive Delta</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.                                      
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #setArchiveDelta(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	long getArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @generated
	 */
	void setArchiveDelta(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(long)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDelta <em>Archive Delta</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Delta</em>' attribute is set.
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(long)
	 * @generated
	 */
	boolean isSetArchiveDelta();

	/**
	 * Returns the value of the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta Percent</em>' attribute.
	 * @see #isSetArchiveDeltaPercent()
	 * @see #unsetArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_DefaultValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	long getDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(long)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(long)
	 * @generated
	 */
	boolean isSetDefaultValue();

	/**
	 * Returns the value of the '<em><b>Graph Max</b></em>' attribute.
	 * The default value is <code>"4294967295"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #setGraphMax(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_GraphMax()
	 * @model default="4294967295" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='graph_max'"
	 * @generated
	 */
	long getGraphMax();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #getGraphMax()
	 * @generated
	 */
	void setGraphMax(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMax()
	 * @see #getGraphMax()
	 * @see #setGraphMax(long)
	 * @generated
	 */
	void unsetGraphMax();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMax <em>Graph Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Max</em>' attribute is set.
	 * @see #unsetGraphMax()
	 * @see #getGraphMax()
	 * @see #setGraphMax(long)
	 * @generated
	 */
	boolean isSetGraphMax();

	/**
	 * Returns the value of the '<em><b>Graph Min</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #setGraphMin(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_GraphMin()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='graph_min'"
	 * @generated
	 */
	long getGraphMin();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #getGraphMin()
	 * @generated
	 */
	void setGraphMin(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMin()
	 * @see #getGraphMin()
	 * @see #setGraphMin(long)
	 * @generated
	 */
	void unsetGraphMin();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMin <em>Graph Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Min</em>' attribute is set.
	 * @see #unsetGraphMin()
	 * @see #getGraphMin()
	 * @see #setGraphMin(long)
	 * @generated
	 */
	boolean isSetGraphMin();

	/**
	 * Returns the value of the '<em><b>Min Delta Trig</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Delta Trig</em>' attribute.
	 * @see #isSetMinDeltaTrig()
	 * @see #unsetMinDeltaTrig()
	 * @see #setMinDeltaTrig(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_MinDeltaTrig()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='min_delta_trig'"
	 * @generated
	 */
	long getMinDeltaTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delta Trig</em>' attribute.
	 * @see #isSetMinDeltaTrig()
	 * @see #unsetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @generated
	 */
	void setMinDeltaTrig(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @see #setMinDeltaTrig(long)
	 * @generated
	 */
	void unsetMinDeltaTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Delta Trig</em>' attribute is set.
	 * @see #unsetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @see #setMinDeltaTrig(long)
	 * @generated
	 */
	boolean isSetMinDeltaTrig();

	/**
	 * Returns the value of the '<em><b>Min Step</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #setMinStep(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPuLong1_MinStep()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='min_step'"
	 * @generated
	 */
	long getMinStep();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @generated
	 */
	void setMinStep(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(long)
	 * @generated
	 */
	void unsetMinStep();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PuLong1#getMinStep <em>Min Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Step</em>' attribute is set.
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(long)
	 * @generated
	 */
	boolean isSetMinStep();

} // PuLong1
