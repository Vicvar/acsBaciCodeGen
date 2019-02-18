/**
 */
package baciCodeGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.CommonVariable#isIsRead <em>Is Read</em>}</li>
 *   <li>{@link baciCodeGen.CommonVariable#isIsWrite <em>Is Write</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getCommonVariable()
 * @model
 * @generated
 */
public interface CommonVariable extends DevIOVariable {
	/**
	 * Returns the value of the '<em><b>Is Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read</em>' attribute.
	 * @see #setIsRead(boolean)
	 * @see baciCodeGen.BaciCodeGenPackage#getCommonVariable_IsRead()
	 * @model
	 * @generated
	 */
	boolean isIsRead();

	/**
	 * Sets the value of the '{@link baciCodeGen.CommonVariable#isIsRead <em>Is Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read</em>' attribute.
	 * @see #isIsRead()
	 * @generated
	 */
	void setIsRead(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Write</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Write</em>' attribute.
	 * @see #setIsWrite(boolean)
	 * @see baciCodeGen.BaciCodeGenPackage#getCommonVariable_IsWrite()
	 * @model
	 * @generated
	 */
	boolean isIsWrite();

	/**
	 * Sets the value of the '{@link baciCodeGen.CommonVariable#isIsWrite <em>Is Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Write</em>' attribute.
	 * @see #isIsWrite()
	 * @generated
	 */
	void setIsWrite(boolean value);

} // CommonVariable
