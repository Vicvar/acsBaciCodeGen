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
 *   <li>{@link baciCodeGen.DevIO#getReadArguments <em>Read Arguments</em>}</li>
 *   <li>{@link baciCodeGen.DevIO#getWriteArguments <em>Write Arguments</em>}</li>
 *   <li>{@link baciCodeGen.DevIO#getCommonArguments <em>Common Arguments</em>}</li>
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
	 * @model
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
	 * Returns the value of the '<em><b>Read Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.ReadArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Arguments</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_ReadArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReadArgument> getReadArguments();

	/**
	 * Returns the value of the '<em><b>Write Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.WriteArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Arguments</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_WriteArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<WriteArgument> getWriteArguments();

	/**
	 * Returns the value of the '<em><b>Common Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.CommonArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Arguments</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getDevIO_CommonArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommonArgument> getCommonArguments();

} // DevIO
