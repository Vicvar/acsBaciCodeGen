/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.Instance#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.Instance#getContainingComponentInstances <em>Containing Component Instances</em>}</li>
 *   <li>{@link baciCodeGen.Instance#getInstanceAttributes <em>Instance Attributes</em>}</li>
 *   <li>{@link baciCodeGen.Instance#getInstanceCharacteristics <em>Instance Characteristics</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
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
	 * @see baciCodeGen.BaciCodeGenPackage#getInstance_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link baciCodeGen.Instance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Containing Component Instances</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.ComponentInstances#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Component Instances</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Component Instances</em>' container reference.
	 * @see #setContainingComponentInstances(ComponentInstances)
	 * @see baciCodeGen.BaciCodeGenPackage#getInstance_ContainingComponentInstances()
	 * @see baciCodeGen.ComponentInstances#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	ComponentInstances getContainingComponentInstances();

	/**
	 * Sets the value of the '{@link baciCodeGen.Instance#getContainingComponentInstances <em>Containing Component Instances</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Component Instances</em>' container reference.
	 * @see #getContainingComponentInstances()
	 * @generated
	 */
	void setContainingComponentInstances(ComponentInstances value);

	/**
	 * Returns the value of the '<em><b>Instance Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Attributes</em>' containment reference list.
	 * @see #isSetInstanceAttributes()
	 * @see #unsetInstanceAttributes()
	 * @see baciCodeGen.BaciCodeGenPackage#getInstance_InstanceAttributes()
	 * @model containment="true" unsettable="true" derived="true"
	 * @generated
	 */
	EList<AttributeValue> getInstanceAttributes();

	/**
	 * Unsets the value of the '{@link baciCodeGen.Instance#getInstanceAttributes <em>Instance Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceAttributes()
	 * @see #getInstanceAttributes()
	 * @generated
	 */
	void unsetInstanceAttributes();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.Instance#getInstanceAttributes <em>Instance Attributes</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Attributes</em>' containment reference list is set.
	 * @see #unsetInstanceAttributes()
	 * @see #getInstanceAttributes()
	 * @generated
	 */
	boolean isSetInstanceAttributes();

	/**
	 * Returns the value of the '<em><b>Instance Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.CharacteristicValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Characteristics</em>' containment reference list.
	 * @see #isSetInstanceCharacteristics()
	 * @see #unsetInstanceCharacteristics()
	 * @see baciCodeGen.BaciCodeGenPackage#getInstance_InstanceCharacteristics()
	 * @model containment="true" unsettable="true" derived="true"
	 * @generated
	 */
	EList<CharacteristicValue> getInstanceCharacteristics();

	/**
	 * Unsets the value of the '{@link baciCodeGen.Instance#getInstanceCharacteristics <em>Instance Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceCharacteristics()
	 * @see #getInstanceCharacteristics()
	 * @generated
	 */
	void unsetInstanceCharacteristics();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.Instance#getInstanceCharacteristics <em>Instance Characteristics</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Characteristics</em>' containment reference list is set.
	 * @see #unsetInstanceCharacteristics()
	 * @see #getInstanceCharacteristics()
	 * @generated
	 */
	boolean isSetInstanceCharacteristics();

} // Instance
