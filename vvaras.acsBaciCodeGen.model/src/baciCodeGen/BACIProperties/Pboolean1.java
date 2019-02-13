/**
 */
package baciCodeGen.BACIProperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pboolean1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base schema for Boolean Properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#isArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#isDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#isMinDeltaTrig <em>Min Delta Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.Pboolean1#isMinStep <em>Min Step</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1()
 * @model extendedMetaData="name='Pboolean' kind='empty'"
 * @generated
 */
public interface Pboolean1 extends Pboolean {
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
	 * @see #setArchiveDelta(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	boolean isArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #isArchiveDelta()
	 * @generated
	 */
	void setArchiveDelta(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #isArchiveDelta()
	 * @see #setArchiveDelta(boolean)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isArchiveDelta <em>Archive Delta</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Delta</em>' attribute is set.
	 * @see #unsetArchiveDelta()
	 * @see #isArchiveDelta()
	 * @see #setArchiveDelta(boolean)
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
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
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
	 * @see #setDefaultValue(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_DefaultValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	boolean isDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #isDefaultValue()
	 * @generated
	 */
	void setDefaultValue(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #isDefaultValue()
	 * @see #setDefaultValue(boolean)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #isDefaultValue()
	 * @see #setDefaultValue(boolean)
	 * @generated
	 */
	boolean isSetDefaultValue();

	/**
	 * Returns the value of the '<em><b>Graph Max</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #setGraphMax(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_GraphMax()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='graph_max'"
	 * @generated
	 */
	boolean isGraphMax();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #isGraphMax()
	 * @generated
	 */
	void setGraphMax(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMax()
	 * @see #isGraphMax()
	 * @see #setGraphMax(boolean)
	 * @generated
	 */
	void unsetGraphMax();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMax <em>Graph Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Max</em>' attribute is set.
	 * @see #unsetGraphMax()
	 * @see #isGraphMax()
	 * @see #setGraphMax(boolean)
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
	 * @see #setGraphMin(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_GraphMin()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='graph_min'"
	 * @generated
	 */
	boolean isGraphMin();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #isGraphMin()
	 * @generated
	 */
	void setGraphMin(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMin()
	 * @see #isGraphMin()
	 * @see #setGraphMin(boolean)
	 * @generated
	 */
	void unsetGraphMin();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMin <em>Graph Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Graph Min</em>' attribute is set.
	 * @see #unsetGraphMin()
	 * @see #isGraphMin()
	 * @see #setGraphMin(boolean)
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
	 * @see #setMinDeltaTrig(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_MinDeltaTrig()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='min_delta_trig'"
	 * @generated
	 */
	boolean isMinDeltaTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Delta Trig</em>' attribute.
	 * @see #isSetMinDeltaTrig()
	 * @see #unsetMinDeltaTrig()
	 * @see #isMinDeltaTrig()
	 * @generated
	 */
	void setMinDeltaTrig(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinDeltaTrig()
	 * @see #isMinDeltaTrig()
	 * @see #setMinDeltaTrig(boolean)
	 * @generated
	 */
	void unsetMinDeltaTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isMinDeltaTrig <em>Min Delta Trig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Delta Trig</em>' attribute is set.
	 * @see #unsetMinDeltaTrig()
	 * @see #isMinDeltaTrig()
	 * @see #setMinDeltaTrig(boolean)
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
	 * @see #setMinStep(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPboolean1_MinStep()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='min_step'"
	 * @generated
	 */
	boolean isMinStep();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #isMinStep()
	 * @generated
	 */
	void setMinStep(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinStep()
	 * @see #isMinStep()
	 * @see #setMinStep(boolean)
	 * @generated
	 */
	void unsetMinStep();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.Pboolean1#isMinStep <em>Min Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Step</em>' attribute is set.
	 * @see #unsetMinStep()
	 * @see #isMinStep()
	 * @see #setMinStep(boolean)
	 * @generated
	 */
	boolean isSetMinStep();

} // Pboolean1
