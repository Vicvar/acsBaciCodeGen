/**
 */
package baciCodeGen.BACI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plong Seq1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base schema for a property representing a sequence of Long values.
 * The values defined for the Characteristics apply to each single element of the sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PlongSeq1#getMinStep <em>Min Step</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1()
 * @model extendedMetaData="name='PlongSeq' kind='empty'"
 * @generated
 */
public interface PlongSeq1 extends PlongSeq {
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
	 * @see #setArchiveDelta(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	int getArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getArchiveDelta <em>Archive Delta</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(int)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getArchiveDelta <em>Archive Delta</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta Percent</em>' attribute.
	 * @see #isSetArchiveDeltaPercent()
	 * @see #unsetArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
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
	 * @see #setDefaultValue(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_DefaultValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(int)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getDefaultValue <em>Default Value</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #setGraphMax(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_GraphMax()
	 * @model default="2147483647" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='graph_max'"
	 * @generated
	 */
	int getGraphMax();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getGraphMax <em>Graph Max</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMax()
	 * @see #getGraphMax()
	 * @see #setGraphMax(int)
	 * @generated
	 */
	void unsetGraphMax();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getGraphMax <em>Graph Max</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #setGraphMin(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_GraphMin()
	 * @model default="-2147483648" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='graph_min'"
	 * @generated
	 */
	int getGraphMin();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getGraphMin <em>Graph Min</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMin()
	 * @see #getGraphMin()
	 * @see #setGraphMin(int)
	 * @generated
	 */
	void unsetGraphMin();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getGraphMin <em>Graph Min</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Delta Trig</em>' attribute.
	 * @see #isSetMinDeltaTrig()
	 * @see #unsetMinDeltaTrig()
	 * @see #setMinDeltaTrig(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_MinDeltaTrig()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='min_delta_trig'"
	 * @generated
	 */
	int getMinDeltaTrig();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinDeltaTrig()
	 * @see #getMinDeltaTrig()
	 * @see #setMinDeltaTrig(int)
	 * @generated
	 */
	void unsetMinDeltaTrig();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}' attribute is set.
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
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #setMinStep(int)
	 * @see baciCodeGen.BACI.BACIPackage#getPlongSeq1_MinStep()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='min_step'"
	 * @generated
	 */
	int getMinStep();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getMinStep <em>Min Step</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PlongSeq1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(int)
	 * @generated
	 */
	void unsetMinStep();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PlongSeq1#getMinStep <em>Min Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Step</em>' attribute is set.
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(int)
	 * @generated
	 */
	boolean isSetMinStep();

} // PlongSeq1
