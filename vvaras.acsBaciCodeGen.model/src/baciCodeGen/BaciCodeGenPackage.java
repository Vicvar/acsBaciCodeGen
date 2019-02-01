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
	 * The feature id for the '<em><b>Component Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__ATTRIBUTES = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__PROPERTIES = 7;

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
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHARACTERISTICS = 1;

	/**
	 * The feature id for the '<em><b>Baci Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__BACI_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Dev IO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DEV_IO = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
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
	 * The meta object id for the '{@link baciCodeGen.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.CharacteristicImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link baciCodeGen.impl.UsedDevIOsImpl <em>Used Dev IOs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.UsedDevIOsImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getUsedDevIOs()
	 * @generated
	 */
	int USED_DEV_IOS = 5;

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
	int DEV_IO = 6;

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
	 * The feature id for the '<em><b>Read Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__READ_ARGUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Write Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__WRITE_ARGUMENTS = 3;

	/**
	 * The feature id for the '<em><b>Common Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO__COMMON_ARGUMENTS = 4;

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
	 * The meta object id for the '{@link baciCodeGen.impl.DevIOArgumentImpl <em>Dev IO Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.DevIOArgumentImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getDevIOArgument()
	 * @generated
	 */
	int DEV_IO_ARGUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_ARGUMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Property Specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_ARGUMENT__PROPERTY_SPECIFIC = 2;

	/**
	 * The number of structural features of the '<em>Dev IO Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_ARGUMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dev IO Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_IO_ARGUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.ReadArgumentImpl <em>Read Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.ReadArgumentImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getReadArgument()
	 * @generated
	 */
	int READ_ARGUMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ARGUMENT__NAME = DEV_IO_ARGUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ARGUMENT__TYPE = DEV_IO_ARGUMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Property Specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ARGUMENT__PROPERTY_SPECIFIC = DEV_IO_ARGUMENT__PROPERTY_SPECIFIC;

	/**
	 * The number of structural features of the '<em>Read Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ARGUMENT_FEATURE_COUNT = DEV_IO_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_ARGUMENT_OPERATION_COUNT = DEV_IO_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.WriteArgumentImpl <em>Write Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.WriteArgumentImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getWriteArgument()
	 * @generated
	 */
	int WRITE_ARGUMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ARGUMENT__NAME = DEV_IO_ARGUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ARGUMENT__TYPE = DEV_IO_ARGUMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Property Specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ARGUMENT__PROPERTY_SPECIFIC = DEV_IO_ARGUMENT__PROPERTY_SPECIFIC;

	/**
	 * The number of structural features of the '<em>Write Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ARGUMENT_FEATURE_COUNT = DEV_IO_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_ARGUMENT_OPERATION_COUNT = DEV_IO_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.CommonArgumentImpl <em>Common Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.CommonArgumentImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCommonArgument()
	 * @generated
	 */
	int COMMON_ARGUMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ARGUMENT__NAME = DEV_IO_ARGUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ARGUMENT__TYPE = DEV_IO_ARGUMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Property Specific</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ARGUMENT__PROPERTY_SPECIFIC = DEV_IO_ARGUMENT__PROPERTY_SPECIFIC;

	/**
	 * The number of structural features of the '<em>Common Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ARGUMENT_FEATURE_COUNT = DEV_IO_ARGUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Common Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_ARGUMENT_OPERATION_COUNT = DEV_IO_ARGUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.impl.UsedBaciTypesImpl <em>Used Baci Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.impl.UsedBaciTypesImpl
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getUsedBaciTypes()
	 * @generated
	 */
	int USED_BACI_TYPES = 11;

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
	int BACI_TYPE = 12;

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
	 * The number of structural features of the '<em>Baci Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Baci Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACI_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.AccessType
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 13;

	/**
	 * The meta object id for the '{@link baciCodeGen.BasicType <em>Basic Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BasicType
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getBasicType()
	 * @generated
	 */
	int BASIC_TYPE = 14;

	/**
	 * The meta object id for the '{@link baciCodeGen.SeqType <em>Seq Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.SeqType
	 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getSeqType()
	 * @generated
	 */
	int SEQ_TYPE = 15;


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
	 * Returns the meta object for the attribute '{@link baciCodeGen.CharacteristicComponent#getComponentNumber <em>Component Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Number</em>'.
	 * @see baciCodeGen.CharacteristicComponent#getComponentNumber()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_ComponentNumber();

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
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.Property#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see baciCodeGen.Property#getCharacteristics()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Characteristics();

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
	 * Returns the meta object for the attribute '{@link baciCodeGen.Action#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see baciCodeGen.Action#getParameters()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Parameters();

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
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.DevIO#getReadArguments <em>Read Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Read Arguments</em>'.
	 * @see baciCodeGen.DevIO#getReadArguments()
	 * @see #getDevIO()
	 * @generated
	 */
	EReference getDevIO_ReadArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.DevIO#getWriteArguments <em>Write Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Write Arguments</em>'.
	 * @see baciCodeGen.DevIO#getWriteArguments()
	 * @see #getDevIO()
	 * @generated
	 */
	EReference getDevIO_WriteArguments();

	/**
	 * Returns the meta object for the containment reference list '{@link baciCodeGen.DevIO#getCommonArguments <em>Common Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Common Arguments</em>'.
	 * @see baciCodeGen.DevIO#getCommonArguments()
	 * @see #getDevIO()
	 * @generated
	 */
	EReference getDevIO_CommonArguments();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.ReadArgument <em>Read Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Argument</em>'.
	 * @see baciCodeGen.ReadArgument
	 * @generated
	 */
	EClass getReadArgument();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.WriteArgument <em>Write Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Argument</em>'.
	 * @see baciCodeGen.WriteArgument
	 * @generated
	 */
	EClass getWriteArgument();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.CommonArgument <em>Common Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Argument</em>'.
	 * @see baciCodeGen.CommonArgument
	 * @generated
	 */
	EClass getCommonArgument();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.DevIOArgument <em>Dev IO Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev IO Argument</em>'.
	 * @see baciCodeGen.DevIOArgument
	 * @generated
	 */
	EClass getDevIOArgument();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIOArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see baciCodeGen.DevIOArgument#getName()
	 * @see #getDevIOArgument()
	 * @generated
	 */
	EAttribute getDevIOArgument_Name();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIOArgument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see baciCodeGen.DevIOArgument#getType()
	 * @see #getDevIOArgument()
	 * @generated
	 */
	EAttribute getDevIOArgument_Type();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.DevIOArgument#isPropertySpecific <em>Property Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Specific</em>'.
	 * @see baciCodeGen.DevIOArgument#isPropertySpecific()
	 * @see #getDevIOArgument()
	 * @generated
	 */
	EAttribute getDevIOArgument_PropertySpecific();

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
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__MODULE = eINSTANCE.getCharacteristicComponent_Module();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__NAME = eINSTANCE.getCharacteristicComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__PREFIX = eINSTANCE.getCharacteristicComponent_Prefix();

		/**
		 * The meta object literal for the '<em><b>Component Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER = eINSTANCE.getCharacteristicComponent_ComponentNumber();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__CONTAINER = eINSTANCE.getCharacteristicComponent_Container();

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
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC_COMPONENT__ACTIONS = eINSTANCE.getCharacteristicComponent_Actions();

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
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__CHARACTERISTICS = eINSTANCE.getProperty_Characteristics();

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
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PARAMETERS = eINSTANCE.getAction_Parameters();

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
		 * The meta object literal for the '<em><b>Read Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEV_IO__READ_ARGUMENTS = eINSTANCE.getDevIO_ReadArguments();

		/**
		 * The meta object literal for the '<em><b>Write Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEV_IO__WRITE_ARGUMENTS = eINSTANCE.getDevIO_WriteArguments();

		/**
		 * The meta object literal for the '<em><b>Common Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEV_IO__COMMON_ARGUMENTS = eINSTANCE.getDevIO_CommonArguments();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.ReadArgumentImpl <em>Read Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.ReadArgumentImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getReadArgument()
		 * @generated
		 */
		EClass READ_ARGUMENT = eINSTANCE.getReadArgument();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.WriteArgumentImpl <em>Write Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.WriteArgumentImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getWriteArgument()
		 * @generated
		 */
		EClass WRITE_ARGUMENT = eINSTANCE.getWriteArgument();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.CommonArgumentImpl <em>Common Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.CommonArgumentImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getCommonArgument()
		 * @generated
		 */
		EClass COMMON_ARGUMENT = eINSTANCE.getCommonArgument();

		/**
		 * The meta object literal for the '{@link baciCodeGen.impl.DevIOArgumentImpl <em>Dev IO Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.impl.DevIOArgumentImpl
		 * @see baciCodeGen.impl.BaciCodeGenPackageImpl#getDevIOArgument()
		 * @generated
		 */
		EClass DEV_IO_ARGUMENT = eINSTANCE.getDevIOArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO_ARGUMENT__NAME = eINSTANCE.getDevIOArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO_ARGUMENT__TYPE = eINSTANCE.getDevIOArgument_Type();

		/**
		 * The meta object literal for the '<em><b>Property Specific</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_IO_ARGUMENT__PROPERTY_SPECIFIC = eINSTANCE.getDevIOArgument_PropertySpecific();

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
