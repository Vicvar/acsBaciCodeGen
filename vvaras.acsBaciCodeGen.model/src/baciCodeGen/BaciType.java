/**
 */
package baciCodeGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baci Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BaciType#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.BaciType#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link baciCodeGen.BaciType#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link baciCodeGen.BaciType#getSeqType <em>Seq Type</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getBaciType()
 * @model
 * @generated
 */
public interface BaciType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see baciCodeGen.BaciCodeGenPackage#getBaciType_Name()
	 * @model id="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * The literals are from the enumeration {@link baciCodeGen.AccessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see baciCodeGen.AccessType
	 * @see #setAccessType(AccessType)
	 * @see baciCodeGen.BaciCodeGenPackage#getBaciType_AccessType()
	 * @model
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link baciCodeGen.BaciType#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see baciCodeGen.AccessType
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Basic Type</b></em>' attribute.
	 * The literals are from the enumeration {@link baciCodeGen.BasicType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Type</em>' attribute.
	 * @see baciCodeGen.BasicType
	 * @see #setBasicType(BasicType)
	 * @see baciCodeGen.BaciCodeGenPackage#getBaciType_BasicType()
	 * @model
	 * @generated
	 */
	BasicType getBasicType();

	/**
	 * Sets the value of the '{@link baciCodeGen.BaciType#getBasicType <em>Basic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Type</em>' attribute.
	 * @see baciCodeGen.BasicType
	 * @see #getBasicType()
	 * @generated
	 */
	void setBasicType(BasicType value);

	/**
	 * Returns the value of the '<em><b>Seq Type</b></em>' attribute.
	 * The literals are from the enumeration {@link baciCodeGen.SeqType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Type</em>' attribute.
	 * @see baciCodeGen.SeqType
	 * @see #setSeqType(SeqType)
	 * @see baciCodeGen.BaciCodeGenPackage#getBaciType_SeqType()
	 * @model
	 * @generated
	 */
	SeqType getSeqType();

	/**
	 * Sets the value of the '{@link baciCodeGen.BaciType#getSeqType <em>Seq Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Type</em>' attribute.
	 * @see baciCodeGen.SeqType
	 * @see #getSeqType()
	 * @generated
	 */
	void setSeqType(SeqType value);

} // BaciType
