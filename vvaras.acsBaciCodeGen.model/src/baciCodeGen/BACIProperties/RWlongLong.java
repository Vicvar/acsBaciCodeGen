/**
 */
package baciCodeGen.BACIProperties;

import baciCodeGen.PropertyDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RWlong Long</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Write Long Long Property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.RWlongLong#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.RWlongLong#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWlongLong()
 * @model extendedMetaData="name='RWlongLong' kind='empty'"
 * @generated
 */
public interface RWlongLong extends PlongLong1, PropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"9223372036854775807"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWlongLong_MaxValue()
	 * @model default="9223372036854775807" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='max_value'"
	 * @generated
	 */
	long getMaxValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWlongLong#getMaxValue <em>Max Value</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWlongLong#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(long)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWlongLong#getMaxValue <em>Max Value</em>}' attribute is set.
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
	 * The default value is <code>"-9223372036854775808"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(long)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWlongLong_MinValue()
	 * @model default="-9223372036854775808" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='attribute' name='min_value'"
	 * @generated
	 */
	long getMinValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWlongLong#getMinValue <em>Min Value</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWlongLong#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(long)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWlongLong#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(long)
	 * @generated
	 */
	boolean isSetMinValue();

} // RWlongLong
