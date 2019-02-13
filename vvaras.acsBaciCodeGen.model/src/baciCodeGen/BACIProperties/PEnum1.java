/**
 */
package baciCodeGen.BACIProperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PEnum1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base schema for Enumeration Properties
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getCondition <em>Condition</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.PEnum1#getStatesDescription <em>States Description</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1()
 * @model extendedMetaData="name='PEnum' kind='empty'"
 * @generated
 */
public interface PEnum1 extends PEnum {
	/**
	 * Returns the value of the '<em><b>Archive Delta</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * Same type and units as parameter Property. Defines what a change in parameter value is.
	 * If the value changes for less than the amount specified here, no log entry is generated.
	 *                                        
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Archive Delta</em>' attribute.
	 * @see #isSetArchiveDelta()
	 * @see #unsetArchiveDelta()
	 * @see #setArchiveDelta(int)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_ArchiveDelta()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='archive_delta'"
	 * @generated
	 */
	int getArchiveDelta();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDelta <em>Archive Delta</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDelta <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDelta()
	 * @see #getArchiveDelta()
	 * @see #setArchiveDelta(int)
	 * @generated
	 */
	void unsetArchiveDelta();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDelta <em>Archive Delta</em>}' attribute is set.
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
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_ArchiveDeltaPercent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='archive_delta_percent'"
	 * @generated
	 */
	double getArchiveDeltaPercent();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchiveDeltaPercent()
	 * @see #getArchiveDeltaPercent()
	 * @see #setArchiveDeltaPercent(double)
	 * @generated
	 */
	void unsetArchiveDeltaPercent();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comma-separated list  of  integer values for the elements of the enumeration. This is used, for example, by ABeans widgets to associate colors to values in the enumeration, like when displaying the enumeration through colored leds. There are as many entries as allowed values in the enumeration. Not widely used by applications a part from a few specific ABeans widgets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #setCondition(String)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_Condition()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #isSetCondition()
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	void unsetCondition();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getCondition <em>Condition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition</em>' attribute is set.
	 * @see #unsetCondition()
	 * @see #getCondition()
	 * @see #setCondition(String)
	 * @generated
	 */
	boolean isSetCondition();

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
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_DefaultValue()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='default_value'"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(int)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getDefaultValue <em>Default Value</em>}' attribute is set.
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
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Max</em>' attribute.
	 * @see #isSetGraphMax()
	 * @see #unsetGraphMax()
	 * @see #setGraphMax(int)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_GraphMax()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='graph_max'"
	 * @generated
	 */
	int getGraphMax();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMax <em>Graph Max</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMax <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMax()
	 * @see #getGraphMax()
	 * @see #setGraphMax(int)
	 * @generated
	 */
	void unsetGraphMax();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMax <em>Graph Max</em>}' attribute is set.
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
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph Min</em>' attribute.
	 * @see #isSetGraphMin()
	 * @see #unsetGraphMin()
	 * @see #setGraphMin(int)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_GraphMin()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='graph_min'"
	 * @generated
	 */
	int getGraphMin();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMin <em>Graph Min</em>}' attribute.
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
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMin <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGraphMin()
	 * @see #getGraphMin()
	 * @see #setGraphMin(int)
	 * @generated
	 */
	void unsetGraphMin();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMin <em>Graph Min</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>States Description</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comma-separated list  of mnemonics for the elements of the enumeration. This is used, for example, by ABeans widgets to build a display list of the available definitions. The name comes from the fact that these enumerations are normally used to represent states of state machines. There are as many entries as allowed values in the enumeration. Very convenient when using ABeans widgets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>States Description</em>' attribute.
	 * @see #isSetStatesDescription()
	 * @see #unsetStatesDescription()
	 * @see #setStatesDescription(String)
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#getPEnum1_StatesDescription()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='statesDescription'"
	 * @generated
	 */
	String getStatesDescription();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getStatesDescription <em>States Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>States Description</em>' attribute.
	 * @see #isSetStatesDescription()
	 * @see #unsetStatesDescription()
	 * @see #getStatesDescription()
	 * @generated
	 */
	void setStatesDescription(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getStatesDescription <em>States Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatesDescription()
	 * @see #getStatesDescription()
	 * @see #setStatesDescription(String)
	 * @generated
	 */
	void unsetStatesDescription();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACIProperties.PEnum1#getStatesDescription <em>States Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>States Description</em>' attribute is set.
	 * @see #unsetStatesDescription()
	 * @see #getStatesDescription()
	 * @see #setStatesDescription(String)
	 * @generated
	 */
	boolean isSetStatesDescription();

} // PEnum1
