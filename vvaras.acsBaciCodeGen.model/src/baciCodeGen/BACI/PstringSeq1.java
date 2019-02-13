/**
 */
package baciCodeGen.BACI;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pstring Seq1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base schema for a property representing a sequence of String values.
 * The values defined for the Characteristics apply to each single element of the sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.PstringSeq1#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PstringSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACI.PstringSeq1#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getPstringSeq1()
 * @model extendedMetaData="name='PstringSeq' kind='empty'"
 * @generated
 */
public interface PstringSeq1 extends PstringSeq {
	/**
	 * Returns the value of the '<em><b>Archive Delta</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.          
	 * NOTE: This is normally not used, since the concept or "delta" does not really match well with the concept of a bit patterns. The charasteristic is defined because used in the template implementation of properties in C++. It might be possible to remove it using less generic templates.                                        
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #setArchiveDelta(String)
	 * @see baciCodeGen.BACI.BACIPackage#getPstringSeq1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	String getArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PstringSeq1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @generated
	 */
	void setArchiveDelta(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.PstringSeq1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(String)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PstringSeq1#getArchiveDelta <em>Archive Delta</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Delta</em>' attribute is set.
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(String)
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
	 * NOTE: This is normally not used, since the concept or "delta" does not really match well with the concept of a bit patterns. The charasteristic is defined because used in the template implementation of properties in C++. It might be possible to remove it using less generic templates.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta Percent</em>' attribute.
	 * @see #isSetArchiveDeltaPercent()
	 * @see #unsetArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @see baciCodeGen.BACI.BACIPackage#getPstringSeq1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PstringSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.PstringSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PstringSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
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
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a description of this characteristic, see documentation 
	 * of the Plong propery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(String)
	 * @see baciCodeGen.BACI.BACIPackage#getPstringSeq1_DefaultValue()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.PstringSeq1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.PstringSeq1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.PstringSeq1#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(String)
	 * @generated
	 */
	boolean isSetDefaultValue();

} // PstringSeq1
