/**
 */
package baciCodeGen.BACIProperties;

import baciCodeGen.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RWu Long Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Write sequence of Unsigned Long values.
 * The values defined for the Characteristics apply to each single element of the sequence. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.RWuLongSeq#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.RWuLongSeq#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWuLongSeq()
 * @model extendedMetaData="name='RWuLongSeq' kind='empty'"
 * @generated
 */
public interface RWuLongSeq extends PuLongSeq1, PropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"4294967295"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery. The definition apply here to each single value in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWuLongSeq_MaxValue()
	 * @model default="4294967295" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='max_value'"
	 * @generated
	 */
	long getMaxValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(long)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(long)
	 * @generated
	 */
	boolean isSetMaxValue();

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery. The definition apply here to each single value in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWuLongSeq_MinValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='attribute' name='min_value'"
	 * @generated
	 */
	long getMinValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(long value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(long)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(long)
	 * @generated
	 */
	boolean isSetMinValue();

} // RWuLongSeq
