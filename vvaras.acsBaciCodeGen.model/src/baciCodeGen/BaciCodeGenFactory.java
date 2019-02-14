/**
 */
package baciCodeGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see baciCodeGen.BaciCodeGenPackage
 * @generated
 */
public interface BaciCodeGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaciCodeGenFactory eINSTANCE = baciCodeGen.impl.BaciCodeGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Characteristic Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Component</em>'.
	 * @generated
	 */
	CharacteristicComponent createCharacteristicComponent();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Used Dev IOs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used Dev IOs</em>'.
	 * @generated
	 */
	UsedDevIOs createUsedDevIOs();

	/**
	 * Returns a new object of class '<em>Dev IO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dev IO</em>'.
	 * @generated
	 */
	DevIO createDevIO();

	/**
	 * Returns a new object of class '<em>Property Specific Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Specific Variable</em>'.
	 * @generated
	 */
	PropertySpecificVariable createPropertySpecificVariable();

	/**
	 * Returns a new object of class '<em>Common Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Variable</em>'.
	 * @generated
	 */
	CommonVariable createCommonVariable();

	/**
	 * Returns a new object of class '<em>Auxiliary Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auxiliary Variable</em>'.
	 * @generated
	 */
	AuxiliaryVariable createAuxiliaryVariable();

	/**
	 * Returns a new object of class '<em>Used Baci Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Used Baci Types</em>'.
	 * @generated
	 */
	UsedBaciTypes createUsedBaciTypes();

	/**
	 * Returns a new object of class '<em>Baci Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Baci Type</em>'.
	 * @generated
	 */
	BaciType createBaciType();

	/**
	 * Returns a new object of class '<em>Component Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instances</em>'.
	 * @generated
	 */
	ComponentInstances createComponentInstances();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Attribute Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Values</em>'.
	 * @generated
	 */
	AttributeValues createAttributeValues();

	/**
	 * Returns a new object of class '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value</em>'.
	 * @generated
	 */
	AttributeValue createAttributeValue();

	/**
	 * Returns a new object of class '<em>Characteristic Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Values</em>'.
	 * @generated
	 */
	CharacteristicValues createCharacteristicValues();

	/**
	 * Returns a new object of class '<em>Characteristic Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic Value</em>'.
	 * @generated
	 */
	CharacteristicValue createCharacteristicValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BaciCodeGenPackage getBaciCodeGenPackage();

} //BaciCodeGenFactory
