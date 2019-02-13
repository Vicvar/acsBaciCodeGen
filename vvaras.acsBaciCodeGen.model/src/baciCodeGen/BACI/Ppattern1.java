/**
 */
package baciCodeGen.BACI;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ppattern1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * pattern stands for an unsigned long long. The typedef pattern is used because this type will mostly be used to encode a pattern of status bits. The type pattern can be used also for raw binary data. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getBitDescription <em>Bit Description</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getMinStep <em>Min Step</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getWhenCleared <em>When Cleared</em>}</li>
 *   <li>{@link baciCodeGen.BACI.Ppattern1#getWhenSet <em>When Set</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getPpattern1()
 * @model extendedMetaData="name='Ppattern' kind='empty'"
 * @generated
 */
public interface Ppattern1 extends Ppattern {
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
	 * @see #setArchiveDelta(BigInteger)
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	BigInteger getArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @generated
	 */
	void setArchiveDelta(BigInteger value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(BigInteger)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getArchiveDelta <em>Archive Delta</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Archive Delta</em>' attribute is set.
	 * @see #unsetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(BigInteger)
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
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Bit Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This characteristic is a comma separated list of strings, each describing one of the bits in the pattern (in that order).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bit Description</em>' attribute.
	 * @see #isSetBitDescription()
	 * @see #unsetBitDescription()
	 * @see #setBitDescription(String)
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_BitDescription()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='bitDescription'"
	 * @generated
	 */
	String getBitDescription();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getBitDescription <em>Bit Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Description</em>' attribute.
	 * @see #isSetBitDescription()
	 * @see #unsetBitDescription()
	 * @see #getBitDescription()
	 * @generated
	 */
	void setBitDescription(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getBitDescription <em>Bit Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBitDescription()
	 * @see #getBitDescription()
	 * @see #setBitDescription(String)
	 * @generated
	 */
	void unsetBitDescription();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getBitDescription <em>Bit Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bit Description</em>' attribute is set.
	 * @see #unsetBitDescription()
	 * @see #getBitDescription()
	 * @see #setBitDescription(String)
	 * @generated
	 */
	boolean isSetBitDescription();

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
	 * @see #setDefaultValue(BigInteger)
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_DefaultValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	BigInteger getDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(BigInteger value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(BigInteger)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getDefaultValue <em>Default Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' attribute is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(BigInteger)
	 * @generated
	 */
	boolean isSetDefaultValue();

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
	 * @see #setMinStep(BigInteger)
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_MinStep()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='min_step'"
	 * @generated
	 */
	BigInteger getMinStep();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Step</em>' attribute.
	 * @see #isSetMinStep()
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @generated
	 */
	void setMinStep(BigInteger value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getMinStep <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(BigInteger)
	 * @generated
	 */
	void unsetMinStep();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getMinStep <em>Min Step</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Step</em>' attribute is set.
	 * @see #unsetMinStep()
	 * @see #getMinStep()
	 * @see #setMinStep(BigInteger)
	 * @generated
	 */
	boolean isSetMinStep();

	/**
	 * Returns the value of the '<em><b>When Cleared</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This characteristic is a comma separated list of integer values, each representing a color code starting from 0 to be used when the corresponding bit is cleared. To be used by GUIs to display the status of the bits with a proper color code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Cleared</em>' attribute.
	 * @see #isSetWhenCleared()
	 * @see #unsetWhenCleared()
	 * @see #setWhenCleared(String)
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_WhenCleared()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='whenCleared'"
	 * @generated
	 */
	String getWhenCleared();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getWhenCleared <em>When Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Cleared</em>' attribute.
	 * @see #isSetWhenCleared()
	 * @see #unsetWhenCleared()
	 * @see #getWhenCleared()
	 * @generated
	 */
	void setWhenCleared(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getWhenCleared <em>When Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWhenCleared()
	 * @see #getWhenCleared()
	 * @see #setWhenCleared(String)
	 * @generated
	 */
	void unsetWhenCleared();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getWhenCleared <em>When Cleared</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>When Cleared</em>' attribute is set.
	 * @see #unsetWhenCleared()
	 * @see #getWhenCleared()
	 * @see #setWhenCleared(String)
	 * @generated
	 */
	boolean isSetWhenCleared();

	/**
	 * Returns the value of the '<em><b>When Set</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This characteristic is a comma separated list of integer values, each representing a color code starting from 0 to be used when the corresponding bit is set. To be used by GUIs to display the status of the bits with a proper color code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Set</em>' attribute.
	 * @see #isSetWhenSet()
	 * @see #unsetWhenSet()
	 * @see #setWhenSet(String)
	 * @see baciCodeGen.BACI.BACIPackage#getPpattern1_WhenSet()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='whenSet'"
	 * @generated
	 */
	String getWhenSet();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.Ppattern1#getWhenSet <em>When Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Set</em>' attribute.
	 * @see #isSetWhenSet()
	 * @see #unsetWhenSet()
	 * @see #getWhenSet()
	 * @generated
	 */
	void setWhenSet(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.Ppattern1#getWhenSet <em>When Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWhenSet()
	 * @see #getWhenSet()
	 * @see #setWhenSet(String)
	 * @generated
	 */
	void unsetWhenSet();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.Ppattern1#getWhenSet <em>When Set</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>When Set</em>' attribute is set.
	 * @see #unsetWhenSet()
	 * @see #getWhenSet()
	 * @see #setWhenSet(String)
	 * @generated
	 */
	boolean isSetWhenSet();

} // Ppattern1
