/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Baci Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BaciTypeContainer#getBaciTypes <em>Baci Types</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getBaciTypeContainer()
 * @model
 * @generated
 */
public interface BaciTypeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Baci Types</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.BaciType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baci Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baci Types</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getBaciTypeContainer_BaciTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaciType> getBaciTypes();

} // BaciTypeContainer
