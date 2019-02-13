/**
 */
package baciCodeGen.BACI;

import baciCodeGen.BaciCharacteristics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RWdouble Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Read Write sequence of Double values.
 * The values defined for the Characteristics apply to each single element of the sequence. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.RWdoubleSeq#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link baciCodeGen.BACI.RWdoubleSeq#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getRWdoubleSeq()
 * @model extendedMetaData="name='RWdoubleSeq' kind='empty'"
 * @generated
 */
public interface RWdoubleSeq extends PdoubleSeq1, BaciCharacteristics {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"1.7976931348623157E+308"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery. The definition apply here to each single value in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #setMaxValue(double)
	 * @see baciCodeGen.BACI.BACIPackage#getRWdoubleSeq_MaxValue()
	 * @model default="1.7976931348623157E+308" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='max_value'"
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.RWdoubleSeq#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #isSetMaxValue()
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.RWdoubleSeq#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	void unsetMaxValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.RWdoubleSeq#getMaxValue <em>Max Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Value</em>' attribute is set.
	 * @see #unsetMaxValue()
	 * @see #getMaxValue()
	 * @see #setMaxValue(double)
	 * @generated
	 */
	boolean isSetMaxValue();

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"-1.7976931348623157E+308"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation of the RWlong propery. The definition apply here to each single value in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #setMinValue(double)
	 * @see baciCodeGen.BACI.BACIPackage#getRWdoubleSeq_MinValue()
	 * @model default="-1.7976931348623157E+308" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='min_value'"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.RWdoubleSeq#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #isSetMinValue()
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.RWdoubleSeq#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	void unsetMinValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.RWdoubleSeq#getMinValue <em>Min Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Value</em>' attribute is set.
	 * @see #unsetMinValue()
	 * @see #getMinValue()
	 * @see #setMinValue(double)
	 * @generated
	 */
	boolean isSetMinValue();

} // RWdoubleSeq
