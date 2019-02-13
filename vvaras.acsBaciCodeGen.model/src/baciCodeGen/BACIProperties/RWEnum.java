/**
 */
package baciCodeGen.BACIProperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RW Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Write Enumeration Property. Used to handle enumerations of values defined by the user.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.RWEnum#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.RWEnum#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWEnum()
 * @model extendedMetaData="name='RWEnum' kind='empty'"
 * @generated
 */
public interface RWEnum extends PEnum1 {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(int)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWEnum_MaxValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='max_value'"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWEnum#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWEnum#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWEnum#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	boolean isSetMaxValue();

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(int)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getRWEnum_MinValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='min_value'"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.RWEnum#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.RWEnum#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.RWEnum#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	boolean isSetMinValue();

} // RWEnum
