/**
 */
package baciCodeGen.BACIProperties;

import baciCodeGen.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RWboolean Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Write sequence of boolean values.
 * The values defined for the Characteristics apply to each single element of the sequence. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWbooleanSeq()
 * @model extendedMetaData="name='RWbooleanSeq' kind='empty'"
 * @generated
 */
public interface RWbooleanSeq extends PbooleanSeq1, PropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery. The definition apply here to each single value in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWbooleanSeq_MaxValue()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='max_value'"
	 * @generated
	 */
	boolean isMaxValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #isMaxValue()
	 * @generated
	 */
	void setMaxValue(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #isMaxValue()
	 * @see #setMaxValue(boolean)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #isMaxValue()
	 * @see #setMaxValue(boolean)
	 * @generated
	 */
	boolean isSetMaxValue();

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery. The definition apply here to each single value in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(boolean)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWbooleanSeq_MinValue()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='min_value'"
	 * @generated
	 */
	boolean isMinValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #isMinValue()
	 * @generated
	 */
	void setMinValue(boolean value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #isMinValue()
	 * @see #setMinValue(boolean)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #isMinValue()
	 * @see #setMinValue(boolean)
	 * @generated
	 */
	boolean isSetMinValue();

} // RWbooleanSeq
