/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dev IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.DevIO#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.DevIO#getRequiredLibraries <em>Required Libraries</em>}</li>
 *   <li>{@link baciCodeGen.DevIO#getPropertySpecificVariables <em>Property Specific Variables</em>}</li>
 *   <li>{@link baciCodeGen.DevIO#getCommonVariables <em>Common Variables</em>}</li>
 *   <li>{@link baciCodeGen.DevIO#getAuxiliaryVariables <em>Auxiliary Variables</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getDevIO()
 * @model
 * @generated
 */
public interface DevIO extends EObject {
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
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Required Libraries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Libraries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Libraries</em>' attribute.
	 * @see #setRequiredLibraries(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_RequiredLibraries()
	 * @model
	 * @generated
	 */
	String getRequiredLibraries();

	/**
	 * Sets the value of the '{@link baciCodeGen.DevIO#getRequiredLibraries <em>Required Libraries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Libraries</em>' attribute.
	 * @see #getRequiredLibraries()
	 * @generated
	 */
	void setRequiredLibraries(String value);

	/**
	 * Returns the value of the '<em><b>Property Specific Variables</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.PropertySpecificVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Specific Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Specific Variables</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_PropertySpecificVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertySpecificVariable> getPropertySpecificVariables();

	/**
	 * Returns the value of the '<em><b>Common Variables</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.CommonVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Variables</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_CommonVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommonVariable> getCommonVariables();

	/**
	 * Returns the value of the '<em><b>Auxiliary Variables</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.AuxiliaryVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auxiliary Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxiliary Variables</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_AuxiliaryVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<AuxiliaryVariable> getAuxiliaryVariables();

} // DevIO
