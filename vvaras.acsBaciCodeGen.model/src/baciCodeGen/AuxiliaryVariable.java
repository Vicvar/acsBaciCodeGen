/**
 */
package baciCodeGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auxiliary Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.AuxiliaryVariable#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getAuxiliaryVariable()
 * @model
 * @generated
 */
public interface AuxiliaryVariable extends DevIOVariable {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getAuxiliaryVariable_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link baciCodeGen.AuxiliaryVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // AuxiliaryVariable
