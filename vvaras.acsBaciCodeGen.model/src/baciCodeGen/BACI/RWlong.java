/**
 */
package baciCodeGen.BACI;

import baciCodeGen.BaciCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RWlong</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Write Long Property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.RWlong#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACI.RWlong#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getRWlong()
 * @model extendedMetaData="name='RWlong' kind='empty'"
 * @generated
 */
public interface RWlong extends Plong1, BaciCharacteristics {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"2147483647"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * This characteristic represents the maximum value that can be used to SET a writable property.
	 * It should not be confused with the graph_max characteristic. The max_value represents the maximum value that can be SET, but the actual value reached by the property can in many case be higher (and defined by graph_max).
	 * For example while a device moves to the maximum allowerd set position, there can be an overshoot. Typically devices of this kind have a soft and an hard upper limit.
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(int)
	 * @see baciCodeGen.BACI.BACIPackage#getRWlong_MaxValue()
	 * @model default="2147483647" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='max_value'"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.RWlong#getMaxValue <em>Max Value</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.RWlong#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(int)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.RWlong#getMaxValue <em>Max Value</em>}' attribute is set.
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
	 * The default value is <code>"-2147483648"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Same type and units as parameter Property
	 * This characteristic represents the minimum value that can be used to SET a writable property.
	 * It should not be confused with the graph_min characteristic. The min_value represents the minimum value that can be SET, but the actual value reached by the property can in many case be lower (and defined by graph_min).
	 * For example while a device moves to the minimum allowerd set position, there can be an overshoot. Typically devices of this kind have a soft and an hard lower limit.
	 *  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(int)
	 * @see baciCodeGen.BACI.BACIPackage#getRWlong_MinValue()
	 * @model default="-2147483648" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='min_value'"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.RWlong#getMinValue <em>Min Value</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.RWlong#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.RWlong#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(int)
	 * @generated
	 */
	boolean isSetMinValue();

} // RWlong
