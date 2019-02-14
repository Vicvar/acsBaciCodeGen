/**
 */
package baciCodeGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getModule <em>Module</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getContainer <em>Container</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getActions <em>Actions</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getProperties <em>Properties</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getUsedBaciTypes <em>Used Baci Types</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getUsedDevIOs <em>Used Dev IOs</em>}</li>
 *   <li>{@link baciCodeGen.CharacteristicComponent#getComponentInstances <em>Component Instances</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent()
 * @model
 * @generated
 */
public interface CharacteristicComponent extends EObject {
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
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Module()
	 * @model required="true"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(String)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Container()
	 * @model required="true"
	 * @generated
	 */
	String getContainer();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link baciCodeGen.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Used Baci Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Baci Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Baci Types</em>' containment reference.
	 * @see #setUsedBaciTypes(UsedBaciTypes)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_UsedBaciTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UsedBaciTypes getUsedBaciTypes();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getUsedBaciTypes <em>Used Baci Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Baci Types</em>' containment reference.
	 * @see #getUsedBaciTypes()
	 * @generated
	 */
	void setUsedBaciTypes(UsedBaciTypes value);

	/**
	 * Returns the value of the '<em><b>Used Dev IOs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Dev IOs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Dev IOs</em>' containment reference.
	 * @see #setUsedDevIOs(UsedDevIOs)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_UsedDevIOs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UsedDevIOs getUsedDevIOs();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getUsedDevIOs <em>Used Dev IOs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Dev IOs</em>' containment reference.
	 * @see #getUsedDevIOs()
	 * @generated
	 */
	void setUsedDevIOs(UsedDevIOs value);

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link baciCodeGen.ComponentInstances#getContainingCaracteristicComponent <em>Containing Caracteristic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instances</em>' containment reference.
	 * @see #setComponentInstances(ComponentInstances)
	 * @see baciCodeGen.BaciCodeGenPackage#getCharacteristicComponent_ComponentInstances()
	 * @see baciCodeGen.ComponentInstances#getContainingCaracteristicComponent
	 * @model opposite="containingCaracteristicComponent" containment="true" required="true"
	 * @generated
	 */
	ComponentInstances getComponentInstances();

	/**
	 * Sets the value of the '{@link baciCodeGen.CharacteristicComponent#getComponentInstances <em>Component Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instances</em>' containment reference.
	 * @see #getComponentInstances()
	 * @generated
	 */
	void setComponentInstances(ComponentInstances value);

} // CharacteristicComponent
