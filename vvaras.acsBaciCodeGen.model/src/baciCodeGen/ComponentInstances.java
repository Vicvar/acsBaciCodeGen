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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getComponentInstances_Instances()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instance> getInstances();

} // ComponentInstances
