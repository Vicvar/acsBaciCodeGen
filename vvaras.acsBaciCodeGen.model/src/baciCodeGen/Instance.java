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
 *   <li>{@link baciCodeGen.Instance#getAttributeValuesContainer <em>Attribute Values Container</em>}</li>
 *   <li>{@link baciCodeGen.Instance#getCharacteristicValuesContainer <em>Characteristic Values Container</em>}</li>
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
	 * Returns the value of the '<em><b>Attribute Values Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.AttributeValues#getContainingInstance <em>Containing Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Values Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Values Container</em>' containment reference.
	 * @see #isSetAttributeValuesContainer()
	 * @see #unsetAttributeValuesContainer()
	 * @see #setAttributeValuesContainer(AttributeValues)
	 * @see baciCodeGen.BaciCodeGenPackage#getInstance_AttributeValuesContainer()
	 * @see baciCodeGen.AttributeValues#getContainingInstance
	 * @model opposite="containingInstance" containment="true" unsettable="true" required="true" derived="true"
	 * @generated
	 */
	AttributeValues getAttributeValuesContainer();

	/**
	 * Sets the value of the '{@link baciCodeGen.Instance#getAttributeValuesContainer <em>Attribute Values Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Values Container</em>' containment reference.
	 * @see #isSetAttributeValuesContainer()
	 * @see #unsetAttributeValuesContainer()
	 * @see #getAttributeValuesContainer()
	 * @generated
	 */
	void setAttributeValuesContainer(AttributeValues value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.Instance#getAttributeValuesContainer <em>Attribute Values Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeValuesContainer()
	 * @see #getAttributeValuesContainer()
	 * @see #setAttributeValuesContainer(AttributeValues)
	 * @generated
	 */
	void unsetAttributeValuesContainer();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.Instance#getAttributeValuesContainer <em>Attribute Values Container</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Values Container</em>' containment reference is set.
	 * @see #unsetAttributeValuesContainer()
	 * @see #getAttributeValuesContainer()
	 * @see #setAttributeValuesContainer(AttributeValues)
	 * @generated
	 */
	boolean isSetAttributeValuesContainer();

	/**
	 * Returns the value of the '<em><b>Characteristic Values Container</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.CharacteristicValues}.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.CharacteristicValues#getContainingInstance <em>Containing Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic Values Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic Values Container</em>' containment reference list.
	 * @see #isSetCharacteristicValuesContainer()
	 * @see #unsetCharacteristicValuesContainer()
	 * @see baciCodeGen.BaciCodeGenPackage#getInstance_CharacteristicValuesContainer()
	 * @see baciCodeGen.CharacteristicValues#getContainingInstance
	 * @model opposite="containingInstance" containment="true" unsettable="true" derived="true"
	 * @generated
	 */
	EList<CharacteristicValues> getCharacteristicValuesContainer();

	/**
	 * Unsets the value of the '{@link baciCodeGen.Instance#getCharacteristicValuesContainer <em>Characteristic Values Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCharacteristicValuesContainer()
	 * @see #getCharacteristicValuesContainer()
	 * @generated
	 */
	void unsetCharacteristicValuesContainer();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.Instance#getCharacteristicValuesContainer <em>Characteristic Values Container</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Characteristic Values Container</em>' containment reference list is set.
	 * @see #unsetCharacteristicValuesContainer()
	 * @see #getCharacteristicValuesContainer()
	 * @generated
	 */
	boolean isSetCharacteristicValuesContainer();

} // Instance
