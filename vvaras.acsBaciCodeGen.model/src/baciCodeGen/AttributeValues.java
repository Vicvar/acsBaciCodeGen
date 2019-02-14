/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.AttributeValues#getInstanceAttributes <em>Instance Attributes</em>}</li>
 *   <li>{@link baciCodeGen.AttributeValues#getContainingInstance <em>Containing Instance</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getAttributeValues()
 * @model
 * @generated
 */
public interface AttributeValues extends EObject {
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
	 * @see baciCodeGen.BaciCodeGenPackage#getAttributeValues_InstanceAttributes()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	EList<AttributeValue> getInstanceAttributes();

	/**
	 * Unsets the value of the '{@link baciCodeGen.AttributeValues#getInstanceAttributes <em>Instance Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceAttributes()
	 * @see #getInstanceAttributes()
	 * @generated
	 */
	void unsetInstanceAttributes();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.AttributeValues#getInstanceAttributes <em>Instance Attributes</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Attributes</em>' containment reference list is set.
	 * @see #unsetInstanceAttributes()
	 * @see #getInstanceAttributes()
	 * @generated
	 */
	boolean isSetInstanceAttributes();

	/**
	 * Returns the value of the '<em><b>Containing Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.Instance#getAttributeValuesContainer <em>Attribute Values Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Instance</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Instance</em>' container reference.
	 * @see #setContainingInstance(Instance)
	 * @see baciCodeGen.BaciCodeGenPackage#getAttributeValues_ContainingInstance()
	 * @see baciCodeGen.Instance#getAttributeValuesContainer
	 * @model opposite="attributeValuesContainer" transient="false"
	 * @generated
	 */
	Instance getContainingInstance();

	/**
	 * Sets the value of the '{@link baciCodeGen.AttributeValues#getContainingInstance <em>Containing Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Instance</em>' container reference.
	 * @see #getContainingInstance()
	 * @generated
	 */
	void setContainingInstance(Instance value);

} // AttributeValues
