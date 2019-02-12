/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.ComponentInstances#getInstances <em>Instances</em>}</li>
 *   <li>{@link baciCodeGen.ComponentInstances#getContainingCaracteristicComponent <em>Containing Caracteristic Component</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getComponentInstances()
 * @model
 * @generated
 */
public interface ComponentInstances extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.Instance}.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.Instance#getContainingComponentInstances <em>Containing Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getComponentInstances_Instances()
	 * @see baciCodeGen.Instance#getContainingComponentInstances
	 * @model opposite="containingComponentInstances" containment="true" required="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Containing Caracteristic Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.CharacteristicComponent#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Caracteristic Component</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Caracteristic Component</em>' container reference.
	 * @see #setContainingCaracteristicComponent(CharacteristicComponent)
	 * @see baciCodeGen.BaciCodeGenPackage#getComponentInstances_ContainingCaracteristicComponent()
	 * @see baciCodeGen.CharacteristicComponent#getComponentInstances
	 * @model opposite="componentInstances" required="true" transient="false"
	 * @generated
	 */
	CharacteristicComponent getContainingCaracteristicComponent();

	/**
	 * Sets the value of the '{@link baciCodeGen.ComponentInstances#getContainingCaracteristicComponent <em>Containing Caracteristic Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Caracteristic Component</em>' container reference.
	 * @see #getContainingCaracteristicComponent()
	 * @generated
	 */
	void setContainingCaracteristicComponent(CharacteristicComponent value);

} // ComponentInstances
