/**
 */
package baciCodeGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see baciCodeGen.BaciCodeGenFactory
 * @model kind="package"
 * @generated
 */
public interface BaciCodeGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "baciCodeGen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://vvaras/acsBaciCodeGen/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vvaras.acsBaciCodeGen.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaciCodeGenPackage eINSTANCE = baciCodeGen.impl.BaciCodeGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.CharacteristicComponentImpl <em>Characteristic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.CharacteristicComponentImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCharacteristicComponent()
	 * @generated
	 */
	int CHARACTERISTIC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__MODULE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES = 7;

	/**
	 * The feature id for the '<em><b>Used Baci Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__USED_BACI_TYPES = 8;

	/**
	 * The feature id for the '<em><b>Used Dev IOs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__USED_DEV_IOS = 9;

	/**
	 * The number of structural features of the '<em>Characteristic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Characteristic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.PropertyImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Baci Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BACI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Dev IO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEV_IO = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.ActionImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.ParameterImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.AttributeImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.ComponentInstancesImpl <em>Component Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.ComponentInstancesImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getComponentInstances()
	 * @generated
	 */
	int COMPONENT_INSTANCES = 5;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCES__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Containing Caracteristic Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Component Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.InstanceImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Containing Component Instances</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONTAINING_COMPONENT_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Instance Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__INSTANCE_CHARACTERISTICS = 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.CharacteristicImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.UsedDevIOsImpl <em>Used Dev IOs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.UsedDevIOsImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getUsedDevIOs()
	 * @generated
	 */
	int USED_DEV_IOS = 8;

	/**
	 * The feature id for the '<em><b>Dev IOs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_DEV_IOS__DEV_IOS = 0;

	/**
	 * The number of structural features of the '<em>Used Dev IOs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_DEV_IOS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Used Dev IOs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_DEV_IOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.DevIOImpl <em>Dev IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.DevIOImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getDevIO()
	 * @generated
	 */
	int DEV_IO = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required Libraries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__REQUIRED_LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Property Specific Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__PROPERTY_SPECIFIC_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Common Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__COMMON_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Auxiliary Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__AUXILIARY_VARIABLES = 4;

	/**
	 * The number of structural features of the '<em>Dev IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dev IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.DevIOVariableImpl <em>Dev IO Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.DevIOVariableImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getDevIOVariable()
	 * @generated
	 */
	int DEV_IO_VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Dev IO Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dev IO Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.PropertySpecificVariableImpl <em>Property Specific Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.PropertySpecificVariableImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getPropertySpecificVariable()
	 * @generated
	 */
	int PROPERTY_SPECIFIC_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_VARIABLE__NAME = DEV_IO_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_VARIABLE__TYPE = DEV_IO_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Is Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_VARIABLE__IS_READ = DEV_IO_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_VARIABLE__IS_WRITE = DEV_IO_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Specific Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_VARIABLE_FEATURE_COUNT = DEV_IO_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property Specific Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_SPECIFIC_VARIABLE_OPERATION_COUNT = DEV_IO_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.CommonVariableImpl <em>Common Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.CommonVariableImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCommonVariable()
	 * @generated
	 */
	int COMMON_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE__NAME = DEV_IO_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE__TYPE = DEV_IO_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Is Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE__IS_READ = DEV_IO_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE__IS_WRITE = DEV_IO_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE__VALUE = DEV_IO_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Common Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE_FEATURE_COUNT = DEV_IO_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Common Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_VARIABLE_OPERATION_COUNT = DEV_IO_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.AuxiliaryVariableImpl <em>Auxiliary Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.AuxiliaryVariableImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAuxiliaryVariable()
	 * @generated
	 */
	int AUXILIARY_VARIABLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__NAME = DEV_IO_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__TYPE = DEV_IO_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE__VALUE = DEV_IO_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Auxiliary Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE_FEATURE_COUNT = DEV_IO_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auxiliary Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_VARIABLE_OPERATION_COUNT = DEV_IO_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.UsedBaciTypesImpl <em>Used Baci Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.UsedBaciTypesImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getUsedBaciTypes()
	 * @generated
	 */
	int USED_BACI_TYPES = 14;

	/**
	 * The feature id for the '<em><b>Baci Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BACI_TYPES__BACI_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Used Baci Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BACI_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Used Baci Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USED_BACI_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.BaciTypeImpl <em>Baci Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.BaciTypeImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBaciType()
	 * @generated
	 */
	int BACI_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE__ACCESS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Basic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE__BASIC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Seq Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE__SEQ_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Baci Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE__BACI_CHARACTERISTICS = 4;

	/**
	 * The number of structural features of the '<em>Baci Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Baci Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BaciCharacteristics <em>Baci Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BaciCharacteristics
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBaciCharacteristics()
	 * @generated
	 */
	int BACI_CHARACTERISTICS = 16;

	/**
	 * The number of structural features of the '<em>Baci Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_CHARACTERISTICS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Baci Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_CHARACTERISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.AccessType
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 17;

	/**
	 * The meta object id for the '{@link baciCodeGen.BasicType <em>Basic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BasicType
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 18;

	/**
	 * The meta object id for the '{@link baciCodeGen.SeqType <em>Seq Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.SeqType
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getSeqType()
	 * @generated
	 */
	int SEQ_TYPE = 19;


	/**
	 * Returns the meta object for class '{@link baciCodeGen.CharacteristicComponent <em>Characteristic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Component</em>'.
	 * @see baciCodeGen.CharacteristicComponent
	 * @generated
	 */
	EClass getCharacteristicComponent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CharacteristicComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getName()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CharacteristicComponent#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getModule()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_Module();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CharacteristicComponent#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getPrefix()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CharacteristicComponent#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getContainer()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.CharacteristicComponent#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getActions()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EReference getCharacteristicComponent_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.CharacteristicComponent#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getAttributes()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EReference getCharacteristicComponent_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.CharacteristicComponent#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getProperties()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EReference getCharacteristicComponent_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link baciCodeGen.CharacteristicComponent#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Instances</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getComponentInstances()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EReference getCharacteristicComponent_ComponentInstances();

	/**
	 * Returns the meta object for the containment reference '{@link baciCodeGen.CharacteristicComponent#getUsedBaciTypes <em>Used Baci Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Baci Types</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getUsedBaciTypes()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EReference getCharacteristicComponent_UsedBaciTypes();

	/**
	 * Returns the meta object for the containment reference '{@link baciCodeGen.CharacteristicComponent#getUsedDevIOs <em>Used Dev IOs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Used Dev IOs</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getUsedDevIOs()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EReference getCharacteristicComponent_UsedDevIOs();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see baciCodeGen.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link baciCodeGen.Property#getBaciType <em>Baci Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baci Type</em>'.
	 * @see baciCodeGen.Property#getBaciType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_BaciType();

	/**
	 * Returns the meta object for the reference '{@link baciCodeGen.Property#getDevIO <em>Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dev IO</em>'.
	 * @see baciCodeGen.Property#getDevIO()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_DevIO();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see baciCodeGen.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see baciCodeGen.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see baciCodeGen.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Parameters();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see baciCodeGen.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see baciCodeGen.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see baciCodeGen.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see baciCodeGen.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Attribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see baciCodeGen.Attribute#isRequired()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Required();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see baciCodeGen.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.ComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instances</em>'.
	 * @see baciCodeGen.ComponentInstances
	 * @generated
	 */
	EClass getComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.ComponentInstances#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see baciCodeGen.ComponentInstances#getInstances()
	 * @see #getComponentInstances()
	 * @generated
	 */
	EReference getComponentInstances_Instances();

	/**
	 * Returns the meta object for the container reference '{@link baciCodeGen.ComponentInstances#getContainingCaracteristicComponent <em>Containing Caracteristic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Caracteristic Component</em>'.
	 * @see baciCodeGen.ComponentInstances#getContainingCaracteristicComponent()
	 * @see #getComponentInstances()
	 * @generated
	 */
	EReference getComponentInstances_ContainingCaracteristicComponent();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see baciCodeGen.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Instance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.Instance#getName()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Name();

	/**
	 * Returns the meta object for the container reference '{@link baciCodeGen.Instance#getContainingComponentInstances <em>Containing Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Component Instances</em>'.
	 * @see baciCodeGen.Instance#getContainingComponentInstances()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_ContainingComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.Instance#getInstanceCharacteristics <em>Instance Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Characteristics</em>'.
	 * @see baciCodeGen.Instance#getInstanceCharacteristics()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_InstanceCharacteristics();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see baciCodeGen.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Characteristic#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see baciCodeGen.Characteristic#getID()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_ID();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Characteristic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.Characteristic#getName()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.Characteristic#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see baciCodeGen.Characteristic#getValue()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Value();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.UsedDevIOs <em>Used Dev IOs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Dev IOs</em>'.
	 * @see baciCodeGen.UsedDevIOs
	 * @generated
	 */
	EClass getUsedDevIOs();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.UsedDevIOs#getDevIOs <em>Dev IOs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dev IOs</em>'.
	 * @see baciCodeGen.UsedDevIOs#getDevIOs()
	 * @see #getUsedDevIOs()
	 * @generated
	 */
	EReference getUsedDevIOs_DevIOs();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.DevIO <em>Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev IO</em>'.
	 * @see baciCodeGen.DevIO
	 * @generated
	 */
	EClass getDevIO();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.DevIO#getName()
	 * @see #getDevIO()
	 * @generated
	 */
	EAttribute getDevIO_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIO#getRequiredLibraries <em>Required Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Libraries</em>'.
	 * @see baciCodeGen.DevIO#getRequiredLibraries()
	 * @see #getDevIO()
	 * @generated
	 */
	EAttribute getDevIO_RequiredLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.DevIO#getPropertySpecificVariables <em>Property Specific Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Specific Variables</em>'.
	 * @see baciCodeGen.DevIO#getPropertySpecificVariables()
	 * @see #getDevIO()
	 * @generated
	 */
	EReference getDevIO_PropertySpecificVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.DevIO#getCommonVariables <em>Common Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Common Variables</em>'.
	 * @see baciCodeGen.DevIO#getCommonVariables()
	 * @see #getDevIO()
	 * @generated
	 */
	EReference getDevIO_CommonVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.DevIO#getAuxiliaryVariables <em>Auxiliary Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Auxiliary Variables</em>'.
	 * @see baciCodeGen.DevIO#getAuxiliaryVariables()
	 * @see #getDevIO()
	 * @generated
	 */
	EReference getDevIO_AuxiliaryVariables();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.PropertySpecificVariable <em>Property Specific Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Specific Variable</em>'.
	 * @see baciCodeGen.PropertySpecificVariable
	 * @generated
	 */
	EClass getPropertySpecificVariable();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.PropertySpecificVariable#isIsRead <em>Is Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read</em>'.
	 * @see baciCodeGen.PropertySpecificVariable#isIsRead()
	 * @see #getPropertySpecificVariable()
	 * @generated
	 */
	EAttribute getPropertySpecificVariable_IsRead();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.PropertySpecificVariable#isIsWrite <em>Is Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Write</em>'.
	 * @see baciCodeGen.PropertySpecificVariable#isIsWrite()
	 * @see #getPropertySpecificVariable()
	 * @generated
	 */
	EAttribute getPropertySpecificVariable_IsWrite();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.CommonVariable <em>Common Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Variable</em>'.
	 * @see baciCodeGen.CommonVariable
	 * @generated
	 */
	EClass getCommonVariable();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CommonVariable#isIsRead <em>Is Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Read</em>'.
	 * @see baciCodeGen.CommonVariable#isIsRead()
	 * @see #getCommonVariable()
	 * @generated
	 */
	EAttribute getCommonVariable_IsRead();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CommonVariable#isIsWrite <em>Is Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Write</em>'.
	 * @see baciCodeGen.CommonVariable#isIsWrite()
	 * @see #getCommonVariable()
	 * @generated
	 */
	EAttribute getCommonVariable_IsWrite();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.CommonVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see baciCodeGen.CommonVariable#getValue()
	 * @see #getCommonVariable()
	 * @generated
	 */
	EAttribute getCommonVariable_Value();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.AuxiliaryVariable <em>Auxiliary Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Variable</em>'.
	 * @see baciCodeGen.AuxiliaryVariable
	 * @generated
	 */
	EClass getAuxiliaryVariable();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.AuxiliaryVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see baciCodeGen.AuxiliaryVariable#getValue()
	 * @see #getAuxiliaryVariable()
	 * @generated
	 */
	EAttribute getAuxiliaryVariable_Value();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.DevIOVariable <em>Dev IO Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev IO Variable</em>'.
	 * @see baciCodeGen.DevIOVariable
	 * @generated
	 */
	EClass getDevIOVariable();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIOVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.DevIOVariable#getName()
	 * @see #getDevIOVariable()
	 * @generated
	 */
	EAttribute getDevIOVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIOVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see baciCodeGen.DevIOVariable#getType()
	 * @see #getDevIOVariable()
	 * @generated
	 */
	EAttribute getDevIOVariable_Type();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.UsedBaciTypes <em>Used Baci Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Used Baci Types</em>'.
	 * @see baciCodeGen.UsedBaciTypes
	 * @generated
	 */
	EClass getUsedBaciTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.UsedBaciTypes#getBaciTypes <em>Baci Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Baci Types</em>'.
	 * @see baciCodeGen.UsedBaciTypes#getBaciTypes()
	 * @see #getUsedBaciTypes()
	 * @generated
	 */
	EReference getUsedBaciTypes_BaciTypes();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BaciType <em>Baci Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baci Type</em>'.
	 * @see baciCodeGen.BaciType
	 * @generated
	 */
	EClass getBaciType();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BaciType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.BaciType#getName()
	 * @see #getBaciType()
	 * @generated
	 */
	EAttribute getBaciType_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BaciType#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Type</em>'.
	 * @see baciCodeGen.BaciType#getAccessType()
	 * @see #getBaciType()
	 * @generated
	 */
	EAttribute getBaciType_AccessType();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BaciType#getBasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic Type</em>'.
	 * @see baciCodeGen.BaciType#getBasicType()
	 * @see #getBaciType()
	 * @generated
	 */
	EAttribute getBaciType_BasicType();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BaciType#getSeqType <em>Seq Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Type</em>'.
	 * @see baciCodeGen.BaciType#getSeqType()
	 * @see #getBaciType()
	 * @generated
	 */
	EAttribute getBaciType_SeqType();

	/**
	 * Returns the meta object for the containment reference '{@link baciCodeGen.BaciType#getBaciCharacteristics <em>Baci Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Baci Characteristics</em>'.
	 * @see baciCodeGen.BaciType#getBaciCharacteristics()
	 * @see #getBaciType()
	 * @generated
	 */
	EReference getBaciType_BaciCharacteristics();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BaciCharacteristics <em>Baci Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baci Characteristics</em>'.
	 * @see baciCodeGen.BaciCharacteristics
	 * @generated
	 */
	EClass getBaciCharacteristics();

	/**
	 * Returns the meta object for enum '{@link baciCodeGen.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see baciCodeGen.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link baciCodeGen.BasicType <em>Basic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basic Type</em>'.
	 * @see baciCodeGen.BasicType
	 * @generated
	 */
	EEnum getBasicType();

	/**
	 * Returns the meta object for enum '{@link baciCodeGen.SeqType <em>Seq Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seq Type</em>'.
	 * @see baciCodeGen.SeqType
	 * @generated
	 */
	EEnum getSeqType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaciCodeGenFactory getBaciCodeGenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.CharacteristicComponentImpl <em>Characteristic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.CharacteristicComponentImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCharacteristicComponent()
		 * @generated
		 */
		EClass CHARACTERISTIC_COMPONENT = eINSTANCE.getCharacteristicComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__NAME = eINSTANCE.getCharacteristicComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__MODULE = eINSTANCE.getCharacteristicComponent_Module();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__PREFIX = eINSTANCE.getCharacteristicComponent_Prefix();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__CONTAINER = eINSTANCE.getCharacteristicComponent_Container();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__ACTIONS = eINSTANCE.getCharacteristicComponent_Actions();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__ATTRIBUTES = eINSTANCE.getCharacteristicComponent_Attributes();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__PROPERTIES = eINSTANCE.getCharacteristicComponent_Properties();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES = eINSTANCE.getCharacteristicComponent_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Used Baci Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__USED_BACI_TYPES = eINSTANCE.getCharacteristicComponent_UsedBaciTypes();

		/**
		 * The meta object literal for the '<em><b>Used Dev IOs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__USED_DEV_IOS = eINSTANCE.getCharacteristicComponent_UsedDevIOs();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.PropertyImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Baci Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__BACI_TYPE = eINSTANCE.getProperty_BaciType();

		/**
		 * The meta object literal for the '<em><b>Dev IO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__DEV_IO = eINSTANCE.getProperty_DevIO();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.ActionImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.ParameterImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.AttributeImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.ComponentInstancesImpl <em>Component Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.ComponentInstancesImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getComponentInstances()
		 * @generated
		 */
		EClass COMPONENT_INSTANCES = eINSTANCE.getComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCES__INSTANCES = eINSTANCE.getComponentInstances_Instances();

		/**
		 * The meta object literal for the '<em><b>Containing Caracteristic Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT = eINSTANCE.getComponentInstances_ContainingCaracteristicComponent();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.InstanceImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__NAME = eINSTANCE.getInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Containing Component Instances</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CONTAINING_COMPONENT_INSTANCES = eINSTANCE.getInstance_ContainingComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Instance Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__INSTANCE_CHARACTERISTICS = eINSTANCE.getInstance_InstanceCharacteristics();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.CharacteristicImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__ID = eINSTANCE.getCharacteristic_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__NAME = eINSTANCE.getCharacteristic_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__VALUE = eINSTANCE.getCharacteristic_Value();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.UsedDevIOsImpl <em>Used Dev IOs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.UsedDevIOsImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getUsedDevIOs()
		 * @generated
		 */
		EClass USED_DEV_IOS = eINSTANCE.getUsedDevIOs();

		/**
		 * The meta object literal for the '<em><b>Dev IOs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_DEV_IOS__DEV_IOS = eINSTANCE.getUsedDevIOs_DevIOs();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.DevIOImpl <em>Dev IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.DevIOImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getDevIO()
		 * @generated
		 */
		EClass DEV_IO = eINSTANCE.getDevIO();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO__NAME = eINSTANCE.getDevIO_Name();

		/**
		 * The meta object literal for the '<em><b>Required Libraries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO__REQUIRED_LIBRARIES = eINSTANCE.getDevIO_RequiredLibraries();

		/**
		 * The meta object literal for the '<em><b>Property Specific Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEV_IO__PROPERTY_SPECIFIC_VARIABLES = eINSTANCE.getDevIO_PropertySpecificVariables();

		/**
		 * The meta object literal for the '<em><b>Common Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEV_IO__COMMON_VARIABLES = eINSTANCE.getDevIO_CommonVariables();

		/**
		 * The meta object literal for the '<em><b>Auxiliary Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEV_IO__AUXILIARY_VARIABLES = eINSTANCE.getDevIO_AuxiliaryVariables();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.PropertySpecificVariableImpl <em>Property Specific Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.PropertySpecificVariableImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getPropertySpecificVariable()
		 * @generated
		 */
		EClass PROPERTY_SPECIFIC_VARIABLE = eINSTANCE.getPropertySpecificVariable();

		/**
		 * The meta object literal for the '<em><b>Is Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_SPECIFIC_VARIABLE__IS_READ = eINSTANCE.getPropertySpecificVariable_IsRead();

		/**
		 * The meta object literal for the '<em><b>Is Write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_SPECIFIC_VARIABLE__IS_WRITE = eINSTANCE.getPropertySpecificVariable_IsWrite();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.CommonVariableImpl <em>Common Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.CommonVariableImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCommonVariable()
		 * @generated
		 */
		EClass COMMON_VARIABLE = eINSTANCE.getCommonVariable();

		/**
		 * The meta object literal for the '<em><b>Is Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VARIABLE__IS_READ = eINSTANCE.getCommonVariable_IsRead();

		/**
		 * The meta object literal for the '<em><b>Is Write</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VARIABLE__IS_WRITE = eINSTANCE.getCommonVariable_IsWrite();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_VARIABLE__VALUE = eINSTANCE.getCommonVariable_Value();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.AuxiliaryVariableImpl <em>Auxiliary Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.AuxiliaryVariableImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAuxiliaryVariable()
		 * @generated
		 */
		EClass AUXILIARY_VARIABLE = eINSTANCE.getAuxiliaryVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUXILIARY_VARIABLE__VALUE = eINSTANCE.getAuxiliaryVariable_Value();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.DevIOVariableImpl <em>Dev IO Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.DevIOVariableImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getDevIOVariable()
		 * @generated
		 */
		EClass DEV_IO_VARIABLE = eINSTANCE.getDevIOVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO_VARIABLE__NAME = eINSTANCE.getDevIOVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO_VARIABLE__TYPE = eINSTANCE.getDevIOVariable_Type();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.UsedBaciTypesImpl <em>Used Baci Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.UsedBaciTypesImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getUsedBaciTypes()
		 * @generated
		 */
		EClass USED_BACI_TYPES = eINSTANCE.getUsedBaciTypes();

		/**
		 * The meta object literal for the '<em><b>Baci Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USED_BACI_TYPES__BACI_TYPES = eINSTANCE.getUsedBaciTypes_BaciTypes();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.BaciTypeImpl <em>Baci Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.BaciTypeImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBaciType()
		 * @generated
		 */
		EClass BACI_TYPE = eINSTANCE.getBaciType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACI_TYPE__NAME = eINSTANCE.getBaciType_Name();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACI_TYPE__ACCESS_TYPE = eINSTANCE.getBaciType_AccessType();

		/**
		 * The meta object literal for the '<em><b>Basic Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACI_TYPE__BASIC_TYPE = eINSTANCE.getBaciType_BasicType();

		/**
		 * The meta object literal for the '<em><b>Seq Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACI_TYPE__SEQ_TYPE = eINSTANCE.getBaciType_SeqType();

		/**
		 * The meta object literal for the '<em><b>Baci Characteristics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACI_TYPE__BACI_CHARACTERISTICS = eINSTANCE.getBaciType_BaciCharacteristics();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BaciCharacteristics <em>Baci Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BaciCharacteristics
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBaciCharacteristics()
		 * @generated
		 */
		EClass BACI_CHARACTERISTICS = eINSTANCE.getBaciCharacteristics();

		/**
		 * The meta object literal for the '{@link baciCodeGen.AccessType <em>Access Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.AccessType
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAccessType()
		 * @generated
		 */
		EEnum ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BasicType <em>Basic Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BasicType
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBasicType()
		 * @generated
		 */
		EEnum BASIC_TYPE = eINSTANCE.getBasicType();

		/**
		 * The meta object literal for the '{@link baciCodeGen.SeqType <em>Seq Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.SeqType
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getSeqType()
		 * @generated
		 */
		EEnum SEQ_TYPE = eINSTANCE.getSeqType();

	}

} //BaciCodeGenPackage
