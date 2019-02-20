/**
 */
package baciCodeGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dev IO Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.DevIOVariable#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.DevIOVariable#getType <em>Type</em>}</li>
 *   <li>{@link baciCodeGen.DevIOVariable#isIsRead <em>Is Read</em>}</li>
 *   <li>{@link baciCodeGen.DevIOVariable#isIsWrite <em>Is Write</em>}</li>
 *   <li>{@link baciCodeGen.DevIOVariable#isIsPropertySpecific <em>Is Property Specific</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getDevIOVariable()
 * @model
 * @generated
 */
public interface DevIOVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIOVariable_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIOVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIOVariable_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIOVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIOVariable_IsRead()
	 * @model
	 * @generated
	 */
	boolean isIsRead();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIOVariable#isIsRead <em>Is Read</em>}' attribute.
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
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIOVariable_IsWrite()
	 * @model
	 * @generated
	 */
	boolean isIsWrite();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIOVariable#isIsWrite <em>Is Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Write</em>' attribute.
	 * @see #isIsWrite()
	 * @generated
	 */
	void setIsWrite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Property Specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Property Specific</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Property Specific</em>' attribute.
	 * @see #setIsPropertySpecific(boolean)
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIOVariable_IsPropertySpecific()
	 * @model
	 * @generated
	 */
	boolean isIsPropertySpecific();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIOVariable#isIsPropertySpecific <em>Is Property Specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Property Specific</em>' attribute.
	 * @see #isIsPropertySpecific()
	 * @generated
	 */
	void setIsPropertySpecific(boolean value);

} // DevIOVariable
