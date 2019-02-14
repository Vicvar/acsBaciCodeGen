/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.CharacteristicValues#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicValues#getInstanceCharacteristics <em>Instance Characteristics</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicValues#getContainingInstance <em>Containing Instance</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicValues()
 * @model
 * @generated
 */
public interface CharacteristicValues extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicValues_PropertyName()
	 * @model derived="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicValues#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

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
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicValues_InstanceCharacteristics()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	EList<CharacteristicValue> getInstanceCharacteristics();
	
	/**
	 * Overloads getInstanceCaracteristics() to generate Characteristics based on each property.
	 * @generated NOT
	 */
	EList<CharacteristicValue> getInstanceCharacteristics(Property p);

	/**
	 * Unsets the value of the '{@link baciCodeGen.CharacteristicValues#getInstanceCharacteristics <em>Instance Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceCharacteristics()
	 * @see #getInstanceCharacteristics()
	 * @generated
	 */
	void unsetInstanceCharacteristics();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.CharacteristicValues#getInstanceCharacteristics <em>Instance Characteristics</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Characteristics</em>' containment reference list is set.
	 * @see #unsetInstanceCharacteristics()
	 * @see #getInstanceCharacteristics()
	 * @generated
	 */
	boolean isSetInstanceCharacteristics();

	/**
	 * Returns the value of the '<em><b>Containing Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.Instance#getCharacteristicValuesContainer <em>Characteristic Values Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Instance</em>' container reference.
	 * @see #setContainingInstance(Instance)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicValues_ContainingInstance()
	 * @see baciCodeGen.Instance#getCharacteristicValuesContainer
	 * @model opposite="characteristicValuesContainer" transient="false"
	 * @generated
	 */
	Instance getContainingInstance();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicValues#getContainingInstance <em>Containing Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Instance</em>' container reference.
	 * @see #getContainingInstance()
	 * @generated
	 */
	void setContainingInstance(Instance value);

} // CharacteristicValues
