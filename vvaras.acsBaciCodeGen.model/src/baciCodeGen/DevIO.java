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
 *   <li>{@link baciCodeGen.DevIO#getDevIOVariables <em>Dev IO Variables</em>}</li>
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
	 * @model id="true" required="true"
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
	 * Returns the value of the '<em><b>Dev IO Variables</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.DevIOVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dev IO Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev IO Variables</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_DevIOVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<DevIOVariable> getDevIOVariables();

} // DevIO
