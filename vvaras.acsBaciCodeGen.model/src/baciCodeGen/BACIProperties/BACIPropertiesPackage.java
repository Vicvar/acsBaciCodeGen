/**
 */
package baciCodeGen.BACIProperties;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * <!-- begin-model-doc -->
 * 
 * This schema describes the Configuration Database types for the Component/Property/Characteristic design patterns (BACI).
 * It contains the definitions for the Characteristic Component types and for all defined Property types.
 * 
 * To keep the documentation easier to maintain and avoiding replication of documentation, the schemas for the Long Property are fully documented.
 * The other Properties only document their differences with respect to the Long Property.
 * 		
 * <!-- end-model-doc -->
 * @see baciCodeGen.BACIProperties.BACIPropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface BACIPropertiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BACIProperties";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:schemas-cosylab-com:BACI:1.0";

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
	BACIPropertiesPackage eINSTANCE = baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.CharacteristicModelImpl <em>Characteristic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.CharacteristicModelImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getCharacteristicModel()
	 * @generated
	 */
	int CHARACTERISTIC_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Characteristic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Characteristic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl <em>Characteristic Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getCharacteristicComponent()
	 * @generated
	 */
	int CHARACTERISTIC_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Action Thread Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE = CHARACTERISTIC_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring Thread Stack Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE = CHARACTERISTIC_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recent Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__RECENT_COMMAND = CHARACTERISTIC_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Recent Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP = CHARACTERISTIC_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Characteristic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT_FEATURE_COUNT = CHARACTERISTIC_MODEL_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Characteristic Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_COMPONENT_OPERATION_COUNT = CHARACTERISTIC_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PropertyImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 24;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CHARACTERISTIC_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = CHARACTERISTIC_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl <em>Typeless Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.TypelessPropertyImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getTypelessProperty()
	 * @generated
	 */
	int TYPELESS_PROPERTY = 66;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__ARCHIVE_MAX_INT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__ARCHIVE_MECHANISM = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__ARCHIVE_MIN_INT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__ARCHIVE_PRIORITY = PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__ARCHIVE_SUPPRESS = PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG = PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__DESCRIPTION = PROPERTY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__FORMAT = PROPERTY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__INITIALIZE_DEVIO = PROPERTY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__MIN_TIMER_TRIG = PROPERTY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__RESOLUTION = PROPERTY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY__UNITS = PROPERTY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Typeless Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Typeless Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPELESS_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PbooleanImpl <em>Pboolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PbooleanImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPboolean()
	 * @generated
	 */
	int PBOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pboolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pboolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl <em>Pboolean1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.Pboolean1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPboolean1()
	 * @generated
	 */
	int PBOOLEAN1 = 3;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_MAX_INT = PBOOLEAN__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_MECHANISM = PBOOLEAN__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_MIN_INT = PBOOLEAN__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_PRIORITY = PBOOLEAN__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_SUPPRESS = PBOOLEAN__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__DEFAULT_TIMER_TRIG = PBOOLEAN__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__DESCRIPTION = PBOOLEAN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__FORMAT = PBOOLEAN__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__INITIALIZE_DEVIO = PBOOLEAN__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__MIN_TIMER_TRIG = PBOOLEAN__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__RESOLUTION = PBOOLEAN__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__UNITS = PBOOLEAN__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_DELTA = PBOOLEAN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__ARCHIVE_DELTA_PERCENT = PBOOLEAN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__DEFAULT_VALUE = PBOOLEAN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__GRAPH_MAX = PBOOLEAN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__GRAPH_MIN = PBOOLEAN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__MIN_DELTA_TRIG = PBOOLEAN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1__MIN_STEP = PBOOLEAN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pboolean1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1_FEATURE_COUNT = PBOOLEAN_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pboolean1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN1_OPERATION_COUNT = PBOOLEAN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PbooleanSeqImpl <em>Pboolean Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PbooleanSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPbooleanSeq()
	 * @generated
	 */
	int PBOOLEAN_SEQ = 4;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pboolean Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pboolean Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PbooleanSeq1Impl <em>Pboolean Seq1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PbooleanSeq1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPbooleanSeq1()
	 * @generated
	 */
	int PBOOLEAN_SEQ1 = 5;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_MAX_INT = PBOOLEAN_SEQ__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_MECHANISM = PBOOLEAN_SEQ__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_MIN_INT = PBOOLEAN_SEQ__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_PRIORITY = PBOOLEAN_SEQ__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_SUPPRESS = PBOOLEAN_SEQ__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__DEFAULT_TIMER_TRIG = PBOOLEAN_SEQ__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__DESCRIPTION = PBOOLEAN_SEQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__FORMAT = PBOOLEAN_SEQ__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__INITIALIZE_DEVIO = PBOOLEAN_SEQ__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__MIN_TIMER_TRIG = PBOOLEAN_SEQ__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__RESOLUTION = PBOOLEAN_SEQ__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__UNITS = PBOOLEAN_SEQ__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_DELTA = PBOOLEAN_SEQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__ARCHIVE_DELTA_PERCENT = PBOOLEAN_SEQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__DEFAULT_VALUE = PBOOLEAN_SEQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__GRAPH_MAX = PBOOLEAN_SEQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__GRAPH_MIN = PBOOLEAN_SEQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__MIN_DELTA_TRIG = PBOOLEAN_SEQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1__MIN_STEP = PBOOLEAN_SEQ_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pboolean Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1_FEATURE_COUNT = PBOOLEAN_SEQ_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pboolean Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PBOOLEAN_SEQ1_OPERATION_COUNT = PBOOLEAN_SEQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PdoubleImpl <em>Pdouble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PdoubleImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdouble()
	 * @generated
	 */
	int PDOUBLE = 6;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pdouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pdouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.Pdouble1Impl <em>Pdouble1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.Pdouble1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdouble1()
	 * @generated
	 */
	int PDOUBLE1 = 7;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_MAX_INT = PDOUBLE__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_MECHANISM = PDOUBLE__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_MIN_INT = PDOUBLE__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_PRIORITY = PDOUBLE__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_SUPPRESS = PDOUBLE__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__DEFAULT_TIMER_TRIG = PDOUBLE__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__DESCRIPTION = PDOUBLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__FORMAT = PDOUBLE__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__INITIALIZE_DEVIO = PDOUBLE__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__MIN_TIMER_TRIG = PDOUBLE__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__RESOLUTION = PDOUBLE__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__UNITS = PDOUBLE__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_DELTA = PDOUBLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__ARCHIVE_DELTA_PERCENT = PDOUBLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__DEFAULT_VALUE = PDOUBLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__GRAPH_MAX = PDOUBLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__GRAPH_MIN = PDOUBLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__MIN_DELTA_TRIG = PDOUBLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1__MIN_STEP = PDOUBLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pdouble1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1_FEATURE_COUNT = PDOUBLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pdouble1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE1_OPERATION_COUNT = PDOUBLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PdoubleSeqImpl <em>Pdouble Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PdoubleSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdoubleSeq()
	 * @generated
	 */
	int PDOUBLE_SEQ = 8;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pdouble Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pdouble Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PdoubleSeq1Impl <em>Pdouble Seq1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PdoubleSeq1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdoubleSeq1()
	 * @generated
	 */
	int PDOUBLE_SEQ1 = 9;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_MAX_INT = PDOUBLE_SEQ__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_MECHANISM = PDOUBLE_SEQ__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_MIN_INT = PDOUBLE_SEQ__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_PRIORITY = PDOUBLE_SEQ__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_SUPPRESS = PDOUBLE_SEQ__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__DEFAULT_TIMER_TRIG = PDOUBLE_SEQ__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__DESCRIPTION = PDOUBLE_SEQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__FORMAT = PDOUBLE_SEQ__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__INITIALIZE_DEVIO = PDOUBLE_SEQ__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__MIN_TIMER_TRIG = PDOUBLE_SEQ__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__RESOLUTION = PDOUBLE_SEQ__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__UNITS = PDOUBLE_SEQ__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_DELTA = PDOUBLE_SEQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__ARCHIVE_DELTA_PERCENT = PDOUBLE_SEQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__DEFAULT_VALUE = PDOUBLE_SEQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__GRAPH_MAX = PDOUBLE_SEQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__GRAPH_MIN = PDOUBLE_SEQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__MIN_DELTA_TRIG = PDOUBLE_SEQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1__MIN_STEP = PDOUBLE_SEQ_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pdouble Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1_FEATURE_COUNT = PDOUBLE_SEQ_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pdouble Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDOUBLE_SEQ1_OPERATION_COUNT = PDOUBLE_SEQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PEnumImpl <em>PEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PEnumImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPEnum()
	 * @generated
	 */
	int PENUM = 10;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>PEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PEnum1Impl <em>PEnum1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PEnum1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPEnum1()
	 * @generated
	 */
	int PENUM1 = 11;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_MAX_INT = PENUM__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_MECHANISM = PENUM__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_MIN_INT = PENUM__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_PRIORITY = PENUM__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_SUPPRESS = PENUM__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__DEFAULT_TIMER_TRIG = PENUM__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__DESCRIPTION = PENUM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__FORMAT = PENUM__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__INITIALIZE_DEVIO = PENUM__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__MIN_TIMER_TRIG = PENUM__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__RESOLUTION = PENUM__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__UNITS = PENUM__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_DELTA = PENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__ARCHIVE_DELTA_PERCENT = PENUM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__CONDITION = PENUM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__DEFAULT_VALUE = PENUM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__GRAPH_MAX = PENUM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__GRAPH_MIN = PENUM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>States Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1__STATES_DESCRIPTION = PENUM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>PEnum1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1_FEATURE_COUNT = PENUM_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>PEnum1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENUM1_OPERATION_COUNT = PENUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PfloatImpl <em>Pfloat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PfloatImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloat()
	 * @generated
	 */
	int PFLOAT = 12;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pfloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pfloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.Pfloat1Impl <em>Pfloat1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.Pfloat1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloat1()
	 * @generated
	 */
	int PFLOAT1 = 13;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_MAX_INT = PFLOAT__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_MECHANISM = PFLOAT__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_MIN_INT = PFLOAT__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_PRIORITY = PFLOAT__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_SUPPRESS = PFLOAT__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__DEFAULT_TIMER_TRIG = PFLOAT__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__DESCRIPTION = PFLOAT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__FORMAT = PFLOAT__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__INITIALIZE_DEVIO = PFLOAT__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__MIN_TIMER_TRIG = PFLOAT__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__RESOLUTION = PFLOAT__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__UNITS = PFLOAT__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_DELTA = PFLOAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__ARCHIVE_DELTA_PERCENT = PFLOAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__DEFAULT_VALUE = PFLOAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__GRAPH_MAX = PFLOAT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__GRAPH_MIN = PFLOAT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__MIN_DELTA_TRIG = PFLOAT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1__MIN_STEP = PFLOAT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pfloat1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1_FEATURE_COUNT = PFLOAT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pfloat1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT1_OPERATION_COUNT = PFLOAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PfloatSeqImpl <em>Pfloat Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PfloatSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloatSeq()
	 * @generated
	 */
	int PFLOAT_SEQ = 14;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pfloat Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pfloat Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PfloatSeq1Impl <em>Pfloat Seq1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PfloatSeq1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloatSeq1()
	 * @generated
	 */
	int PFLOAT_SEQ1 = 15;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_MAX_INT = PFLOAT_SEQ__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_MECHANISM = PFLOAT_SEQ__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_MIN_INT = PFLOAT_SEQ__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_PRIORITY = PFLOAT_SEQ__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_SUPPRESS = PFLOAT_SEQ__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__DEFAULT_TIMER_TRIG = PFLOAT_SEQ__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__DESCRIPTION = PFLOAT_SEQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__FORMAT = PFLOAT_SEQ__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__INITIALIZE_DEVIO = PFLOAT_SEQ__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__MIN_TIMER_TRIG = PFLOAT_SEQ__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__RESOLUTION = PFLOAT_SEQ__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__UNITS = PFLOAT_SEQ__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_DELTA = PFLOAT_SEQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__ARCHIVE_DELTA_PERCENT = PFLOAT_SEQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__DEFAULT_VALUE = PFLOAT_SEQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__GRAPH_MAX = PFLOAT_SEQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__GRAPH_MIN = PFLOAT_SEQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__MIN_DELTA_TRIG = PFLOAT_SEQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1__MIN_STEP = PFLOAT_SEQ_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pfloat Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1_FEATURE_COUNT = PFLOAT_SEQ_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pfloat Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFLOAT_SEQ1_OPERATION_COUNT = PFLOAT_SEQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PlongImpl <em>Plong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PlongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlong()
	 * @generated
	 */
	int PLONG = 16;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Plong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.Plong1Impl <em>Plong1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.Plong1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlong1()
	 * @generated
	 */
	int PLONG1 = 17;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_MAX_INT = PLONG__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_MECHANISM = PLONG__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_MIN_INT = PLONG__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_PRIORITY = PLONG__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_SUPPRESS = PLONG__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__DEFAULT_TIMER_TRIG = PLONG__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__DESCRIPTION = PLONG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__FORMAT = PLONG__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__INITIALIZE_DEVIO = PLONG__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__MIN_TIMER_TRIG = PLONG__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__RESOLUTION = PLONG__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__UNITS = PLONG__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_DELTA = PLONG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__ARCHIVE_DELTA_PERCENT = PLONG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__DEFAULT_VALUE = PLONG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__GRAPH_MAX = PLONG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__GRAPH_MIN = PLONG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__MIN_DELTA_TRIG = PLONG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1__MIN_STEP = PLONG_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Plong1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1_FEATURE_COUNT = PLONG_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Plong1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG1_OPERATION_COUNT = PLONG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PlongLongImpl <em>Plong Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PlongLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongLong()
	 * @generated
	 */
	int PLONG_LONG = 18;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Plong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PlongLong1Impl <em>Plong Long1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PlongLong1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongLong1()
	 * @generated
	 */
	int PLONG_LONG1 = 19;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_MAX_INT = PLONG_LONG__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_MECHANISM = PLONG_LONG__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_MIN_INT = PLONG_LONG__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_PRIORITY = PLONG_LONG__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_SUPPRESS = PLONG_LONG__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__DEFAULT_TIMER_TRIG = PLONG_LONG__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__DESCRIPTION = PLONG_LONG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__FORMAT = PLONG_LONG__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__INITIALIZE_DEVIO = PLONG_LONG__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__MIN_TIMER_TRIG = PLONG_LONG__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__RESOLUTION = PLONG_LONG__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__UNITS = PLONG_LONG__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_DELTA = PLONG_LONG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__ARCHIVE_DELTA_PERCENT = PLONG_LONG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__DEFAULT_VALUE = PLONG_LONG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__GRAPH_MAX = PLONG_LONG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__GRAPH_MIN = PLONG_LONG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__MIN_DELTA_TRIG = PLONG_LONG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1__MIN_STEP = PLONG_LONG_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Plong Long1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1_FEATURE_COUNT = PLONG_LONG_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Plong Long1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_LONG1_OPERATION_COUNT = PLONG_LONG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PlongSeqImpl <em>Plong Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PlongSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongSeq()
	 * @generated
	 */
	int PLONG_SEQ = 20;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Plong Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plong Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PlongSeq1Impl <em>Plong Seq1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PlongSeq1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongSeq1()
	 * @generated
	 */
	int PLONG_SEQ1 = 21;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_MAX_INT = PLONG_SEQ__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_MECHANISM = PLONG_SEQ__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_MIN_INT = PLONG_SEQ__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_PRIORITY = PLONG_SEQ__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_SUPPRESS = PLONG_SEQ__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__DEFAULT_TIMER_TRIG = PLONG_SEQ__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__DESCRIPTION = PLONG_SEQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__FORMAT = PLONG_SEQ__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__INITIALIZE_DEVIO = PLONG_SEQ__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__MIN_TIMER_TRIG = PLONG_SEQ__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__RESOLUTION = PLONG_SEQ__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__UNITS = PLONG_SEQ__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_DELTA = PLONG_SEQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__ARCHIVE_DELTA_PERCENT = PLONG_SEQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__DEFAULT_VALUE = PLONG_SEQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__GRAPH_MAX = PLONG_SEQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__GRAPH_MIN = PLONG_SEQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__MIN_DELTA_TRIG = PLONG_SEQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1__MIN_STEP = PLONG_SEQ_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Plong Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1_FEATURE_COUNT = PLONG_SEQ_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Plong Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLONG_SEQ1_OPERATION_COUNT = PLONG_SEQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PpatternImpl <em>Ppattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PpatternImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPpattern()
	 * @generated
	 */
	int PPATTERN = 22;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Ppattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ppattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl <em>Ppattern1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.Ppattern1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPpattern1()
	 * @generated
	 */
	int PPATTERN1 = 23;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_MAX_INT = PPATTERN__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_MECHANISM = PPATTERN__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_MIN_INT = PPATTERN__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_PRIORITY = PPATTERN__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_SUPPRESS = PPATTERN__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__DEFAULT_TIMER_TRIG = PPATTERN__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__DESCRIPTION = PPATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__FORMAT = PPATTERN__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__INITIALIZE_DEVIO = PPATTERN__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__MIN_TIMER_TRIG = PPATTERN__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__RESOLUTION = PPATTERN__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__UNITS = PPATTERN__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_DELTA = PPATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__ARCHIVE_DELTA_PERCENT = PPATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bit Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__BIT_DESCRIPTION = PPATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__DEFAULT_VALUE = PPATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__MIN_STEP = PPATTERN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>When Cleared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__WHEN_CLEARED = PPATTERN_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>When Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1__WHEN_SET = PPATTERN_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ppattern1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1_FEATURE_COUNT = PPATTERN_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Ppattern1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PPATTERN1_OPERATION_COUNT = PPATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PstringImpl <em>Pstring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PstringImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstring()
	 * @generated
	 */
	int PSTRING = 25;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.Pstring1Impl <em>Pstring1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.Pstring1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstring1()
	 * @generated
	 */
	int PSTRING1 = 26;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_MAX_INT = PSTRING__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_MECHANISM = PSTRING__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_MIN_INT = PSTRING__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_PRIORITY = PSTRING__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_SUPPRESS = PSTRING__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__DEFAULT_TIMER_TRIG = PSTRING__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__DESCRIPTION = PSTRING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__FORMAT = PSTRING__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__INITIALIZE_DEVIO = PSTRING__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__MIN_TIMER_TRIG = PSTRING__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__RESOLUTION = PSTRING__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__UNITS = PSTRING__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_DELTA = PSTRING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__ARCHIVE_DELTA_PERCENT = PSTRING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1__DEFAULT_VALUE = PSTRING_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pstring1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1_FEATURE_COUNT = PSTRING_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pstring1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING1_OPERATION_COUNT = PSTRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PstringSeqImpl <em>Pstring Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PstringSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstringSeq()
	 * @generated
	 */
	int PSTRING_SEQ = 27;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pstring Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pstring Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PstringSeq1Impl <em>Pstring Seq1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PstringSeq1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstringSeq1()
	 * @generated
	 */
	int PSTRING_SEQ1 = 28;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_MAX_INT = PSTRING_SEQ__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_MECHANISM = PSTRING_SEQ__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_MIN_INT = PSTRING_SEQ__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_PRIORITY = PSTRING_SEQ__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_SUPPRESS = PSTRING_SEQ__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__DEFAULT_TIMER_TRIG = PSTRING_SEQ__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__DESCRIPTION = PSTRING_SEQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__FORMAT = PSTRING_SEQ__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__INITIALIZE_DEVIO = PSTRING_SEQ__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__MIN_TIMER_TRIG = PSTRING_SEQ__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__RESOLUTION = PSTRING_SEQ__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__UNITS = PSTRING_SEQ__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_DELTA = PSTRING_SEQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__ARCHIVE_DELTA_PERCENT = PSTRING_SEQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1__DEFAULT_VALUE = PSTRING_SEQ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pstring Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1_FEATURE_COUNT = PSTRING_SEQ_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pstring Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSTRING_SEQ1_OPERATION_COUNT = PSTRING_SEQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PuLongImpl <em>Pu Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PuLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLong()
	 * @generated
	 */
	int PU_LONG = 29;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pu Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pu Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PuLong1Impl <em>Pu Long1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PuLong1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLong1()
	 * @generated
	 */
	int PU_LONG1 = 30;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_MAX_INT = PU_LONG__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_MECHANISM = PU_LONG__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_MIN_INT = PU_LONG__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_PRIORITY = PU_LONG__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_SUPPRESS = PU_LONG__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__DEFAULT_TIMER_TRIG = PU_LONG__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__DESCRIPTION = PU_LONG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__FORMAT = PU_LONG__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__INITIALIZE_DEVIO = PU_LONG__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__MIN_TIMER_TRIG = PU_LONG__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__RESOLUTION = PU_LONG__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__UNITS = PU_LONG__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_DELTA = PU_LONG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__ARCHIVE_DELTA_PERCENT = PU_LONG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__DEFAULT_VALUE = PU_LONG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__GRAPH_MAX = PU_LONG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__GRAPH_MIN = PU_LONG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__MIN_DELTA_TRIG = PU_LONG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1__MIN_STEP = PU_LONG_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pu Long1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1_FEATURE_COUNT = PU_LONG_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pu Long1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG1_OPERATION_COUNT = PU_LONG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PuLongLongImpl <em>Pu Long Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PuLongLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongLong()
	 * @generated
	 */
	int PU_LONG_LONG = 31;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pu Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pu Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PuLongLong1Impl <em>Pu Long Long1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PuLongLong1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongLong1()
	 * @generated
	 */
	int PU_LONG_LONG1 = 32;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_MAX_INT = PU_LONG_LONG__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_MECHANISM = PU_LONG_LONG__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_MIN_INT = PU_LONG_LONG__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_PRIORITY = PU_LONG_LONG__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_SUPPRESS = PU_LONG_LONG__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__DEFAULT_TIMER_TRIG = PU_LONG_LONG__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__DESCRIPTION = PU_LONG_LONG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__FORMAT = PU_LONG_LONG__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__INITIALIZE_DEVIO = PU_LONG_LONG__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__MIN_TIMER_TRIG = PU_LONG_LONG__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__RESOLUTION = PU_LONG_LONG__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__UNITS = PU_LONG_LONG__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_DELTA = PU_LONG_LONG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__ARCHIVE_DELTA_PERCENT = PU_LONG_LONG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__DEFAULT_VALUE = PU_LONG_LONG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__GRAPH_MAX = PU_LONG_LONG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__GRAPH_MIN = PU_LONG_LONG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__MIN_DELTA_TRIG = PU_LONG_LONG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1__MIN_STEP = PU_LONG_LONG_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pu Long Long1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1_FEATURE_COUNT = PU_LONG_LONG_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pu Long Long1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_LONG1_OPERATION_COUNT = PU_LONG_LONG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PuLongSeqImpl <em>Pu Long Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PuLongSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongSeq()
	 * @generated
	 */
	int PU_LONG_SEQ = 33;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__ARCHIVE_MAX_INT = TYPELESS_PROPERTY__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__ARCHIVE_MECHANISM = TYPELESS_PROPERTY__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__ARCHIVE_MIN_INT = TYPELESS_PROPERTY__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__ARCHIVE_PRIORITY = TYPELESS_PROPERTY__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__ARCHIVE_SUPPRESS = TYPELESS_PROPERTY__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__DEFAULT_TIMER_TRIG = TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__DESCRIPTION = TYPELESS_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__FORMAT = TYPELESS_PROPERTY__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__INITIALIZE_DEVIO = TYPELESS_PROPERTY__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__MIN_TIMER_TRIG = TYPELESS_PROPERTY__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__RESOLUTION = TYPELESS_PROPERTY__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ__UNITS = TYPELESS_PROPERTY__UNITS;

	/**
	 * The number of structural features of the '<em>Pu Long Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ_FEATURE_COUNT = TYPELESS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pu Long Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ_OPERATION_COUNT = TYPELESS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.PuLongSeq1Impl <em>Pu Long Seq1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.PuLongSeq1Impl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongSeq1()
	 * @generated
	 */
	int PU_LONG_SEQ1 = 34;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_MAX_INT = PU_LONG_SEQ__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_MECHANISM = PU_LONG_SEQ__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_MIN_INT = PU_LONG_SEQ__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_PRIORITY = PU_LONG_SEQ__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_SUPPRESS = PU_LONG_SEQ__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__DEFAULT_TIMER_TRIG = PU_LONG_SEQ__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__DESCRIPTION = PU_LONG_SEQ__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__FORMAT = PU_LONG_SEQ__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__INITIALIZE_DEVIO = PU_LONG_SEQ__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__MIN_TIMER_TRIG = PU_LONG_SEQ__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__RESOLUTION = PU_LONG_SEQ__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__UNITS = PU_LONG_SEQ__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_DELTA = PU_LONG_SEQ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__ARCHIVE_DELTA_PERCENT = PU_LONG_SEQ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__DEFAULT_VALUE = PU_LONG_SEQ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__GRAPH_MAX = PU_LONG_SEQ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__GRAPH_MIN = PU_LONG_SEQ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__MIN_DELTA_TRIG = PU_LONG_SEQ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1__MIN_STEP = PU_LONG_SEQ_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Pu Long Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1_FEATURE_COUNT = PU_LONG_SEQ_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Pu Long Seq1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PU_LONG_SEQ1_OPERATION_COUNT = PU_LONG_SEQ_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RObooleanImpl <em>ROboolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RObooleanImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROboolean()
	 * @generated
	 */
	int ROBOOLEAN = 35;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_MAX_INT = PBOOLEAN1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_MECHANISM = PBOOLEAN1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_MIN_INT = PBOOLEAN1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_PRIORITY = PBOOLEAN1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_SUPPRESS = PBOOLEAN1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__DEFAULT_TIMER_TRIG = PBOOLEAN1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__DESCRIPTION = PBOOLEAN1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__FORMAT = PBOOLEAN1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__INITIALIZE_DEVIO = PBOOLEAN1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__MIN_TIMER_TRIG = PBOOLEAN1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__RESOLUTION = PBOOLEAN1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__UNITS = PBOOLEAN1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_DELTA = PBOOLEAN1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ARCHIVE_DELTA_PERCENT = PBOOLEAN1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__DEFAULT_VALUE = PBOOLEAN1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__GRAPH_MAX = PBOOLEAN1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__GRAPH_MIN = PBOOLEAN1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__MIN_DELTA_TRIG = PBOOLEAN1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__MIN_STEP = PBOOLEAN1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ALARM_FAULT_FAMILY = PBOOLEAN1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ALARM_FAULT_MEMBER = PBOOLEAN1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ALARM_LEVEL = PBOOLEAN1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ALARM_ON = PBOOLEAN1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN__ALARM_TIMER_TRIG = PBOOLEAN1_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ROboolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_FEATURE_COUNT = PBOOLEAN1_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ROboolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_OPERATION_COUNT = PBOOLEAN1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RObooleanSeqImpl <em>ROboolean Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RObooleanSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRObooleanSeq()
	 * @generated
	 */
	int ROBOOLEAN_SEQ = 36;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_MAX_INT = PBOOLEAN_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_MECHANISM = PBOOLEAN_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_MIN_INT = PBOOLEAN_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_PRIORITY = PBOOLEAN_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_SUPPRESS = PBOOLEAN_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__DEFAULT_TIMER_TRIG = PBOOLEAN_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__DESCRIPTION = PBOOLEAN_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__FORMAT = PBOOLEAN_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__INITIALIZE_DEVIO = PBOOLEAN_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__MIN_TIMER_TRIG = PBOOLEAN_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__RESOLUTION = PBOOLEAN_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__UNITS = PBOOLEAN_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_DELTA = PBOOLEAN_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ARCHIVE_DELTA_PERCENT = PBOOLEAN_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__DEFAULT_VALUE = PBOOLEAN_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__GRAPH_MAX = PBOOLEAN_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__GRAPH_MIN = PBOOLEAN_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__MIN_DELTA_TRIG = PBOOLEAN_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__MIN_STEP = PBOOLEAN_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ALARM_FAULT_FAMILY = PBOOLEAN_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ALARM_FAULT_MEMBER = PBOOLEAN_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ALARM_LEVEL = PBOOLEAN_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ALARM_ON = PBOOLEAN_SEQ1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ__ALARM_TIMER_TRIG = PBOOLEAN_SEQ1_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ROboolean Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ_FEATURE_COUNT = PBOOLEAN_SEQ1_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>ROboolean Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOOLEAN_SEQ_OPERATION_COUNT = PBOOLEAN_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROdoubleImpl <em>ROdouble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROdoubleImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROdouble()
	 * @generated
	 */
	int RODOUBLE = 37;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_MAX_INT = PDOUBLE1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_MECHANISM = PDOUBLE1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_MIN_INT = PDOUBLE1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_PRIORITY = PDOUBLE1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_SUPPRESS = PDOUBLE1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__DEFAULT_TIMER_TRIG = PDOUBLE1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__DESCRIPTION = PDOUBLE1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__FORMAT = PDOUBLE1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__INITIALIZE_DEVIO = PDOUBLE1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__MIN_TIMER_TRIG = PDOUBLE1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__RESOLUTION = PDOUBLE1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__UNITS = PDOUBLE1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_DELTA = PDOUBLE1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ARCHIVE_DELTA_PERCENT = PDOUBLE1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__DEFAULT_VALUE = PDOUBLE1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__GRAPH_MAX = PDOUBLE1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__GRAPH_MIN = PDOUBLE1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__MIN_DELTA_TRIG = PDOUBLE1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__MIN_STEP = PDOUBLE1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_FAULT_FAMILY = PDOUBLE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_FAULT_MEMBER = PDOUBLE1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_HIGH_OFF = PDOUBLE1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_HIGH_ON = PDOUBLE1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_LEVEL = PDOUBLE1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_LOW_OFF = PDOUBLE1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_LOW_ON = PDOUBLE1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE__ALARM_TIMER_TRIG = PDOUBLE1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROdouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_FEATURE_COUNT = PDOUBLE1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROdouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_OPERATION_COUNT = PDOUBLE1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROdoubleSeqImpl <em>ROdouble Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROdoubleSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROdoubleSeq()
	 * @generated
	 */
	int RODOUBLE_SEQ = 38;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_MAX_INT = PDOUBLE_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_MECHANISM = PDOUBLE_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_MIN_INT = PDOUBLE_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_PRIORITY = PDOUBLE_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_SUPPRESS = PDOUBLE_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__DEFAULT_TIMER_TRIG = PDOUBLE_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__DESCRIPTION = PDOUBLE_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__FORMAT = PDOUBLE_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__INITIALIZE_DEVIO = PDOUBLE_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__MIN_TIMER_TRIG = PDOUBLE_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__RESOLUTION = PDOUBLE_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__UNITS = PDOUBLE_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_DELTA = PDOUBLE_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ARCHIVE_DELTA_PERCENT = PDOUBLE_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__DEFAULT_VALUE = PDOUBLE_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__GRAPH_MAX = PDOUBLE_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__GRAPH_MIN = PDOUBLE_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__MIN_DELTA_TRIG = PDOUBLE_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__MIN_STEP = PDOUBLE_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_FAULT_FAMILY = PDOUBLE_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_FAULT_MEMBER = PDOUBLE_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_HIGH_OFF = PDOUBLE_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_HIGH_ON = PDOUBLE_SEQ1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_LEVEL = PDOUBLE_SEQ1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_LOW_OFF = PDOUBLE_SEQ1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_LOW_ON = PDOUBLE_SEQ1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ__ALARM_TIMER_TRIG = PDOUBLE_SEQ1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROdouble Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ_FEATURE_COUNT = PDOUBLE_SEQ1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROdouble Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RODOUBLE_SEQ_OPERATION_COUNT = PDOUBLE_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROEnumImpl <em>RO Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROEnumImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROEnum()
	 * @generated
	 */
	int RO_ENUM = 39;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_MAX_INT = PENUM1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_MECHANISM = PENUM1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_MIN_INT = PENUM1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_PRIORITY = PENUM1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_SUPPRESS = PENUM1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__DEFAULT_TIMER_TRIG = PENUM1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__DESCRIPTION = PENUM1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__FORMAT = PENUM1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__INITIALIZE_DEVIO = PENUM1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__MIN_TIMER_TRIG = PENUM1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__RESOLUTION = PENUM1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__UNITS = PENUM1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_DELTA = PENUM1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ARCHIVE_DELTA_PERCENT = PENUM1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__CONDITION = PENUM1__CONDITION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__DEFAULT_VALUE = PENUM1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__GRAPH_MAX = PENUM1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__GRAPH_MIN = PENUM1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>States Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__STATES_DESCRIPTION = PENUM1__STATES_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ALARM_FAULT_FAMILY = PENUM1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ALARM_FAULT_MEMBER = PENUM1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ALARM_LEVEL = PENUM1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ALARM_OFF = PENUM1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ALARM_ON = PENUM1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM__ALARM_TIMER_TRIG = PENUM1_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>RO Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM_FEATURE_COUNT = PENUM1_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>RO Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RO_ENUM_OPERATION_COUNT = PENUM1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROfloatImpl <em>ROfloat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROfloatImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROfloat()
	 * @generated
	 */
	int ROFLOAT = 40;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_MAX_INT = PFLOAT1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_MECHANISM = PFLOAT1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_MIN_INT = PFLOAT1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_PRIORITY = PFLOAT1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_SUPPRESS = PFLOAT1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__DEFAULT_TIMER_TRIG = PFLOAT1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__DESCRIPTION = PFLOAT1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__FORMAT = PFLOAT1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__INITIALIZE_DEVIO = PFLOAT1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__MIN_TIMER_TRIG = PFLOAT1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__RESOLUTION = PFLOAT1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__UNITS = PFLOAT1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_DELTA = PFLOAT1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ARCHIVE_DELTA_PERCENT = PFLOAT1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__DEFAULT_VALUE = PFLOAT1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__GRAPH_MAX = PFLOAT1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__GRAPH_MIN = PFLOAT1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__MIN_DELTA_TRIG = PFLOAT1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__MIN_STEP = PFLOAT1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_FAULT_FAMILY = PFLOAT1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_FAULT_MEMBER = PFLOAT1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_HIGH_OFF = PFLOAT1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_HIGH_ON = PFLOAT1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_LEVEL = PFLOAT1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_LOW_OFF = PFLOAT1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_LOW_ON = PFLOAT1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT__ALARM_TIMER_TRIG = PFLOAT1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROfloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_FEATURE_COUNT = PFLOAT1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROfloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_OPERATION_COUNT = PFLOAT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROfloatSeqImpl <em>ROfloat Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROfloatSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROfloatSeq()
	 * @generated
	 */
	int ROFLOAT_SEQ = 41;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_MAX_INT = PFLOAT_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_MECHANISM = PFLOAT_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_MIN_INT = PFLOAT_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_PRIORITY = PFLOAT_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_SUPPRESS = PFLOAT_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__DEFAULT_TIMER_TRIG = PFLOAT_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__DESCRIPTION = PFLOAT_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__FORMAT = PFLOAT_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__INITIALIZE_DEVIO = PFLOAT_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__MIN_TIMER_TRIG = PFLOAT_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__RESOLUTION = PFLOAT_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__UNITS = PFLOAT_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_DELTA = PFLOAT_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ARCHIVE_DELTA_PERCENT = PFLOAT_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__DEFAULT_VALUE = PFLOAT_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__GRAPH_MAX = PFLOAT_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__GRAPH_MIN = PFLOAT_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__MIN_DELTA_TRIG = PFLOAT_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__MIN_STEP = PFLOAT_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_FAULT_FAMILY = PFLOAT_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_FAULT_MEMBER = PFLOAT_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_HIGH_OFF = PFLOAT_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_HIGH_ON = PFLOAT_SEQ1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_LEVEL = PFLOAT_SEQ1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_LOW_OFF = PFLOAT_SEQ1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_LOW_ON = PFLOAT_SEQ1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ__ALARM_TIMER_TRIG = PFLOAT_SEQ1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROfloat Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ_FEATURE_COUNT = PFLOAT_SEQ1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROfloat Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROFLOAT_SEQ_OPERATION_COUNT = PFLOAT_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROlongImpl <em>ROlong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROlongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROlong()
	 * @generated
	 */
	int ROLONG = 42;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_MAX_INT = PLONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_MECHANISM = PLONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_MIN_INT = PLONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_PRIORITY = PLONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_SUPPRESS = PLONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__DEFAULT_TIMER_TRIG = PLONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__DESCRIPTION = PLONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__FORMAT = PLONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__INITIALIZE_DEVIO = PLONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__MIN_TIMER_TRIG = PLONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__RESOLUTION = PLONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__UNITS = PLONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_DELTA = PLONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ARCHIVE_DELTA_PERCENT = PLONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__DEFAULT_VALUE = PLONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__GRAPH_MAX = PLONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__GRAPH_MIN = PLONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__MIN_DELTA_TRIG = PLONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__MIN_STEP = PLONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_FAULT_FAMILY = PLONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_FAULT_MEMBER = PLONG1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_HIGH_OFF = PLONG1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_HIGH_ON = PLONG1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_LEVEL = PLONG1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_LOW_OFF = PLONG1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_LOW_ON = PLONG1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG__ALARM_TIMER_TRIG = PLONG1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROlong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_FEATURE_COUNT = PLONG1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROlong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_OPERATION_COUNT = PLONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROlongLongImpl <em>ROlong Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROlongLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROlongLong()
	 * @generated
	 */
	int ROLONG_LONG = 43;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_MAX_INT = PLONG_LONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_MECHANISM = PLONG_LONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_MIN_INT = PLONG_LONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_PRIORITY = PLONG_LONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_SUPPRESS = PLONG_LONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__DEFAULT_TIMER_TRIG = PLONG_LONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__DESCRIPTION = PLONG_LONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__FORMAT = PLONG_LONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__INITIALIZE_DEVIO = PLONG_LONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__MIN_TIMER_TRIG = PLONG_LONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__RESOLUTION = PLONG_LONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__UNITS = PLONG_LONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_DELTA = PLONG_LONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ARCHIVE_DELTA_PERCENT = PLONG_LONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__DEFAULT_VALUE = PLONG_LONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__GRAPH_MAX = PLONG_LONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__GRAPH_MIN = PLONG_LONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__MIN_DELTA_TRIG = PLONG_LONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__MIN_STEP = PLONG_LONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_FAULT_FAMILY = PLONG_LONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_FAULT_MEMBER = PLONG_LONG1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_HIGH_OFF = PLONG_LONG1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_HIGH_ON = PLONG_LONG1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_LEVEL = PLONG_LONG1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_LOW_OFF = PLONG_LONG1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_LOW_ON = PLONG_LONG1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG__ALARM_TIMER_TRIG = PLONG_LONG1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROlong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG_FEATURE_COUNT = PLONG_LONG1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROlong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_LONG_OPERATION_COUNT = PLONG_LONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROlongSeqImpl <em>ROlong Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROlongSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROlongSeq()
	 * @generated
	 */
	int ROLONG_SEQ = 44;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_MAX_INT = PLONG_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_MECHANISM = PLONG_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_MIN_INT = PLONG_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_PRIORITY = PLONG_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_SUPPRESS = PLONG_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__DEFAULT_TIMER_TRIG = PLONG_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__DESCRIPTION = PLONG_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__FORMAT = PLONG_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__INITIALIZE_DEVIO = PLONG_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__MIN_TIMER_TRIG = PLONG_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__RESOLUTION = PLONG_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__UNITS = PLONG_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_DELTA = PLONG_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ARCHIVE_DELTA_PERCENT = PLONG_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__DEFAULT_VALUE = PLONG_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__GRAPH_MAX = PLONG_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__GRAPH_MIN = PLONG_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__MIN_DELTA_TRIG = PLONG_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__MIN_STEP = PLONG_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_FAULT_FAMILY = PLONG_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_FAULT_MEMBER = PLONG_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_HIGH_OFF = PLONG_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_HIGH_ON = PLONG_SEQ1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_LEVEL = PLONG_SEQ1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_LOW_OFF = PLONG_SEQ1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_LOW_ON = PLONG_SEQ1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ__ALARM_TIMER_TRIG = PLONG_SEQ1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROlong Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ_FEATURE_COUNT = PLONG_SEQ1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROlong Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLONG_SEQ_OPERATION_COUNT = PLONG_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROpatternImpl <em>ROpattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROpatternImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROpattern()
	 * @generated
	 */
	int ROPATTERN = 45;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_MAX_INT = PPATTERN1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_MECHANISM = PPATTERN1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_MIN_INT = PPATTERN1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_PRIORITY = PPATTERN1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_SUPPRESS = PPATTERN1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__DEFAULT_TIMER_TRIG = PPATTERN1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__DESCRIPTION = PPATTERN1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__FORMAT = PPATTERN1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__INITIALIZE_DEVIO = PPATTERN1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__MIN_TIMER_TRIG = PPATTERN1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__RESOLUTION = PPATTERN1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__UNITS = PPATTERN1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_DELTA = PPATTERN1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ARCHIVE_DELTA_PERCENT = PPATTERN1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Bit Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__BIT_DESCRIPTION = PPATTERN1__BIT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__DEFAULT_VALUE = PPATTERN1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__MIN_STEP = PPATTERN1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>When Cleared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__WHEN_CLEARED = PPATTERN1__WHEN_CLEARED;

	/**
	 * The feature id for the '<em><b>When Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__WHEN_SET = PPATTERN1__WHEN_SET;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ALARM_FAULT_FAMILY = PPATTERN1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ALARM_FAULT_MEMBER = PPATTERN1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ALARM_LEVEL = PPATTERN1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ALARM_MASK = PPATTERN1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ALARM_TIMER_TRIG = PPATTERN1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN__ALARM_TRIGGER = PPATTERN1_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ROpattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN_FEATURE_COUNT = PPATTERN1_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>ROpattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROPATTERN_OPERATION_COUNT = PPATTERN1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROstringImpl <em>ROstring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROstringImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROstring()
	 * @generated
	 */
	int ROSTRING = 46;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_MAX_INT = PSTRING1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_MECHANISM = PSTRING1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_MIN_INT = PSTRING1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_PRIORITY = PSTRING1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_SUPPRESS = PSTRING1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__DEFAULT_TIMER_TRIG = PSTRING1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__DESCRIPTION = PSTRING1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__FORMAT = PSTRING1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__INITIALIZE_DEVIO = PSTRING1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__MIN_TIMER_TRIG = PSTRING1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__RESOLUTION = PSTRING1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__UNITS = PSTRING1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_DELTA = PSTRING1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ARCHIVE_DELTA_PERCENT = PSTRING1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__DEFAULT_VALUE = PSTRING1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ALARM_FAULT_FAMILY = PSTRING1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ALARM_FAULT_MEMBER = PSTRING1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ALARM_LEVEL = PSTRING1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING__ALARM_TIMER_TRIG = PSTRING1_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ROstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_FEATURE_COUNT = PSTRING1_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>ROstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_OPERATION_COUNT = PSTRING1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROstringSeqImpl <em>ROstring Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROstringSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROstringSeq()
	 * @generated
	 */
	int ROSTRING_SEQ = 47;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_MAX_INT = PSTRING_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_MECHANISM = PSTRING_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_MIN_INT = PSTRING_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_PRIORITY = PSTRING_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_SUPPRESS = PSTRING_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__DEFAULT_TIMER_TRIG = PSTRING_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__DESCRIPTION = PSTRING_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__FORMAT = PSTRING_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__INITIALIZE_DEVIO = PSTRING_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__MIN_TIMER_TRIG = PSTRING_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__RESOLUTION = PSTRING_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__UNITS = PSTRING_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_DELTA = PSTRING_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__ARCHIVE_DELTA_PERCENT = PSTRING_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ__DEFAULT_VALUE = PSTRING_SEQ1__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>ROstring Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ_FEATURE_COUNT = PSTRING_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ROstring Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROSTRING_SEQ_OPERATION_COUNT = PSTRING_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROuLongImpl <em>ROu Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROuLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROuLong()
	 * @generated
	 */
	int ROU_LONG = 48;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_MAX_INT = PU_LONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_MECHANISM = PU_LONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_MIN_INT = PU_LONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_PRIORITY = PU_LONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_SUPPRESS = PU_LONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__DEFAULT_TIMER_TRIG = PU_LONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__DESCRIPTION = PU_LONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__FORMAT = PU_LONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__INITIALIZE_DEVIO = PU_LONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__MIN_TIMER_TRIG = PU_LONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__RESOLUTION = PU_LONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__UNITS = PU_LONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_DELTA = PU_LONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ARCHIVE_DELTA_PERCENT = PU_LONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__DEFAULT_VALUE = PU_LONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__GRAPH_MAX = PU_LONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__GRAPH_MIN = PU_LONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__MIN_DELTA_TRIG = PU_LONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__MIN_STEP = PU_LONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_FAULT_FAMILY = PU_LONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_FAULT_MEMBER = PU_LONG1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_HIGH_OFF = PU_LONG1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_HIGH_ON = PU_LONG1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_LEVEL = PU_LONG1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_LOW_OFF = PU_LONG1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_LOW_ON = PU_LONG1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG__ALARM_TIMER_TRIG = PU_LONG1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROu Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_FEATURE_COUNT = PU_LONG1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROu Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_OPERATION_COUNT = PU_LONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROuLongLongImpl <em>ROu Long Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROuLongLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROuLongLong()
	 * @generated
	 */
	int ROU_LONG_LONG = 49;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_MAX_INT = PU_LONG_LONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_MECHANISM = PU_LONG_LONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_MIN_INT = PU_LONG_LONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_PRIORITY = PU_LONG_LONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_SUPPRESS = PU_LONG_LONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__DEFAULT_TIMER_TRIG = PU_LONG_LONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__DESCRIPTION = PU_LONG_LONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__FORMAT = PU_LONG_LONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__INITIALIZE_DEVIO = PU_LONG_LONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__MIN_TIMER_TRIG = PU_LONG_LONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__RESOLUTION = PU_LONG_LONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__UNITS = PU_LONG_LONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_DELTA = PU_LONG_LONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ARCHIVE_DELTA_PERCENT = PU_LONG_LONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__DEFAULT_VALUE = PU_LONG_LONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__GRAPH_MAX = PU_LONG_LONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__GRAPH_MIN = PU_LONG_LONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__MIN_DELTA_TRIG = PU_LONG_LONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__MIN_STEP = PU_LONG_LONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_FAULT_FAMILY = PU_LONG_LONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_FAULT_MEMBER = PU_LONG_LONG1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_HIGH_OFF = PU_LONG_LONG1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_HIGH_ON = PU_LONG_LONG1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_LEVEL = PU_LONG_LONG1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_LOW_OFF = PU_LONG_LONG1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_LOW_ON = PU_LONG_LONG1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG__ALARM_TIMER_TRIG = PU_LONG_LONG1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROu Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG_FEATURE_COUNT = PU_LONG_LONG1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROu Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_LONG_OPERATION_COUNT = PU_LONG_LONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.ROuLongSeqImpl <em>ROu Long Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.ROuLongSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROuLongSeq()
	 * @generated
	 */
	int ROU_LONG_SEQ = 50;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_MAX_INT = PU_LONG_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_MECHANISM = PU_LONG_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_MIN_INT = PU_LONG_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_PRIORITY = PU_LONG_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_SUPPRESS = PU_LONG_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__DEFAULT_TIMER_TRIG = PU_LONG_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__DESCRIPTION = PU_LONG_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__FORMAT = PU_LONG_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__INITIALIZE_DEVIO = PU_LONG_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__MIN_TIMER_TRIG = PU_LONG_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__RESOLUTION = PU_LONG_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__UNITS = PU_LONG_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_DELTA = PU_LONG_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ARCHIVE_DELTA_PERCENT = PU_LONG_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__DEFAULT_VALUE = PU_LONG_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__GRAPH_MAX = PU_LONG_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__GRAPH_MIN = PU_LONG_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__MIN_DELTA_TRIG = PU_LONG_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__MIN_STEP = PU_LONG_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Alarm Fault Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_FAULT_FAMILY = PU_LONG_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alarm Fault Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_FAULT_MEMBER = PU_LONG_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm High Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_HIGH_OFF = PU_LONG_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm High On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_HIGH_ON = PU_LONG_SEQ1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alarm Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_LEVEL = PU_LONG_SEQ1_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alarm Low Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_LOW_OFF = PU_LONG_SEQ1_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alarm Low On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_LOW_ON = PU_LONG_SEQ1_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alarm Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ__ALARM_TIMER_TRIG = PU_LONG_SEQ1_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ROu Long Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ_FEATURE_COUNT = PU_LONG_SEQ1_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>ROu Long Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROU_LONG_SEQ_OPERATION_COUNT = PU_LONG_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWbooleanImpl <em>RWboolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWbooleanImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWboolean()
	 * @generated
	 */
	int RWBOOLEAN = 51;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_MAX_INT = PBOOLEAN1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_MECHANISM = PBOOLEAN1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_MIN_INT = PBOOLEAN1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_PRIORITY = PBOOLEAN1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_SUPPRESS = PBOOLEAN1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__DEFAULT_TIMER_TRIG = PBOOLEAN1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__DESCRIPTION = PBOOLEAN1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__FORMAT = PBOOLEAN1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__INITIALIZE_DEVIO = PBOOLEAN1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__MIN_TIMER_TRIG = PBOOLEAN1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__RESOLUTION = PBOOLEAN1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__UNITS = PBOOLEAN1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_DELTA = PBOOLEAN1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__ARCHIVE_DELTA_PERCENT = PBOOLEAN1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__DEFAULT_VALUE = PBOOLEAN1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__GRAPH_MAX = PBOOLEAN1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__GRAPH_MIN = PBOOLEAN1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__MIN_DELTA_TRIG = PBOOLEAN1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__MIN_STEP = PBOOLEAN1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__MAX_VALUE = PBOOLEAN1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN__MIN_VALUE = PBOOLEAN1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWboolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_FEATURE_COUNT = PBOOLEAN1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWboolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_OPERATION_COUNT = PBOOLEAN1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWbooleanSeqImpl <em>RWboolean Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWbooleanSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWbooleanSeq()
	 * @generated
	 */
	int RWBOOLEAN_SEQ = 52;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_MAX_INT = PBOOLEAN_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_MECHANISM = PBOOLEAN_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_MIN_INT = PBOOLEAN_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_PRIORITY = PBOOLEAN_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_SUPPRESS = PBOOLEAN_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__DEFAULT_TIMER_TRIG = PBOOLEAN_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__DESCRIPTION = PBOOLEAN_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__FORMAT = PBOOLEAN_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__INITIALIZE_DEVIO = PBOOLEAN_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__MIN_TIMER_TRIG = PBOOLEAN_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__RESOLUTION = PBOOLEAN_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__UNITS = PBOOLEAN_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_DELTA = PBOOLEAN_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__ARCHIVE_DELTA_PERCENT = PBOOLEAN_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__DEFAULT_VALUE = PBOOLEAN_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__GRAPH_MAX = PBOOLEAN_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__GRAPH_MIN = PBOOLEAN_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__MIN_DELTA_TRIG = PBOOLEAN_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__MIN_STEP = PBOOLEAN_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__MAX_VALUE = PBOOLEAN_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ__MIN_VALUE = PBOOLEAN_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWboolean Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ_FEATURE_COUNT = PBOOLEAN_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWboolean Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWBOOLEAN_SEQ_OPERATION_COUNT = PBOOLEAN_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWdoubleImpl <em>RWdouble</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWdoubleImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWdouble()
	 * @generated
	 */
	int RWDOUBLE = 53;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_MAX_INT = PDOUBLE1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_MECHANISM = PDOUBLE1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_MIN_INT = PDOUBLE1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_PRIORITY = PDOUBLE1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_SUPPRESS = PDOUBLE1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__DEFAULT_TIMER_TRIG = PDOUBLE1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__DESCRIPTION = PDOUBLE1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__FORMAT = PDOUBLE1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__INITIALIZE_DEVIO = PDOUBLE1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__MIN_TIMER_TRIG = PDOUBLE1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__RESOLUTION = PDOUBLE1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__UNITS = PDOUBLE1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_DELTA = PDOUBLE1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__ARCHIVE_DELTA_PERCENT = PDOUBLE1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__DEFAULT_VALUE = PDOUBLE1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__GRAPH_MAX = PDOUBLE1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__GRAPH_MIN = PDOUBLE1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__MIN_DELTA_TRIG = PDOUBLE1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__MIN_STEP = PDOUBLE1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__MAX_VALUE = PDOUBLE1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE__MIN_VALUE = PDOUBLE1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWdouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_FEATURE_COUNT = PDOUBLE1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWdouble</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_OPERATION_COUNT = PDOUBLE1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWdoubleSeqImpl <em>RWdouble Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWdoubleSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWdoubleSeq()
	 * @generated
	 */
	int RWDOUBLE_SEQ = 54;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_MAX_INT = PDOUBLE_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_MECHANISM = PDOUBLE_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_MIN_INT = PDOUBLE_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_PRIORITY = PDOUBLE_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_SUPPRESS = PDOUBLE_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__DEFAULT_TIMER_TRIG = PDOUBLE_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__DESCRIPTION = PDOUBLE_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__FORMAT = PDOUBLE_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__INITIALIZE_DEVIO = PDOUBLE_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__MIN_TIMER_TRIG = PDOUBLE_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__RESOLUTION = PDOUBLE_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__UNITS = PDOUBLE_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_DELTA = PDOUBLE_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__ARCHIVE_DELTA_PERCENT = PDOUBLE_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__DEFAULT_VALUE = PDOUBLE_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__GRAPH_MAX = PDOUBLE_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__GRAPH_MIN = PDOUBLE_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__MIN_DELTA_TRIG = PDOUBLE_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__MIN_STEP = PDOUBLE_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__MAX_VALUE = PDOUBLE_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ__MIN_VALUE = PDOUBLE_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWdouble Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ_FEATURE_COUNT = PDOUBLE_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWdouble Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWDOUBLE_SEQ_OPERATION_COUNT = PDOUBLE_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWEnumImpl <em>RW Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWEnumImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWEnum()
	 * @generated
	 */
	int RW_ENUM = 55;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_MAX_INT = PENUM1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_MECHANISM = PENUM1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_MIN_INT = PENUM1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_PRIORITY = PENUM1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_SUPPRESS = PENUM1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__DEFAULT_TIMER_TRIG = PENUM1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__DESCRIPTION = PENUM1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__FORMAT = PENUM1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__INITIALIZE_DEVIO = PENUM1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__MIN_TIMER_TRIG = PENUM1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__RESOLUTION = PENUM1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__UNITS = PENUM1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_DELTA = PENUM1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__ARCHIVE_DELTA_PERCENT = PENUM1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__CONDITION = PENUM1__CONDITION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__DEFAULT_VALUE = PENUM1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__GRAPH_MAX = PENUM1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__GRAPH_MIN = PENUM1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>States Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__STATES_DESCRIPTION = PENUM1__STATES_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__MAX_VALUE = PENUM1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM__MIN_VALUE = PENUM1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RW Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM_FEATURE_COUNT = PENUM1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RW Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RW_ENUM_OPERATION_COUNT = PENUM1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWfloatImpl <em>RWfloat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWfloatImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWfloat()
	 * @generated
	 */
	int RWFLOAT = 56;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_MAX_INT = PFLOAT1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_MECHANISM = PFLOAT1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_MIN_INT = PFLOAT1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_PRIORITY = PFLOAT1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_SUPPRESS = PFLOAT1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__DEFAULT_TIMER_TRIG = PFLOAT1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__DESCRIPTION = PFLOAT1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__FORMAT = PFLOAT1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__INITIALIZE_DEVIO = PFLOAT1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__MIN_TIMER_TRIG = PFLOAT1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__RESOLUTION = PFLOAT1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__UNITS = PFLOAT1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_DELTA = PFLOAT1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__ARCHIVE_DELTA_PERCENT = PFLOAT1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__DEFAULT_VALUE = PFLOAT1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__GRAPH_MAX = PFLOAT1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__GRAPH_MIN = PFLOAT1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__MIN_DELTA_TRIG = PFLOAT1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__MIN_STEP = PFLOAT1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__MAX_VALUE = PFLOAT1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT__MIN_VALUE = PFLOAT1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWfloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_FEATURE_COUNT = PFLOAT1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWfloat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_OPERATION_COUNT = PFLOAT1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWfloatSeqImpl <em>RWfloat Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWfloatSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWfloatSeq()
	 * @generated
	 */
	int RWFLOAT_SEQ = 57;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_MAX_INT = PFLOAT_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_MECHANISM = PFLOAT_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_MIN_INT = PFLOAT_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_PRIORITY = PFLOAT_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_SUPPRESS = PFLOAT_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__DEFAULT_TIMER_TRIG = PFLOAT_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__DESCRIPTION = PFLOAT_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__FORMAT = PFLOAT_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__INITIALIZE_DEVIO = PFLOAT_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__MIN_TIMER_TRIG = PFLOAT_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__RESOLUTION = PFLOAT_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__UNITS = PFLOAT_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_DELTA = PFLOAT_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__ARCHIVE_DELTA_PERCENT = PFLOAT_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__DEFAULT_VALUE = PFLOAT_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__GRAPH_MAX = PFLOAT_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__GRAPH_MIN = PFLOAT_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__MIN_DELTA_TRIG = PFLOAT_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__MIN_STEP = PFLOAT_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__MAX_VALUE = PFLOAT_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ__MIN_VALUE = PFLOAT_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWfloat Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ_FEATURE_COUNT = PFLOAT_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWfloat Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWFLOAT_SEQ_OPERATION_COUNT = PFLOAT_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWlongImpl <em>RWlong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWlongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWlong()
	 * @generated
	 */
	int RWLONG = 58;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_MAX_INT = PLONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_MECHANISM = PLONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_MIN_INT = PLONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_PRIORITY = PLONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_SUPPRESS = PLONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__DEFAULT_TIMER_TRIG = PLONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__DESCRIPTION = PLONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__FORMAT = PLONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__INITIALIZE_DEVIO = PLONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__MIN_TIMER_TRIG = PLONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__RESOLUTION = PLONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__UNITS = PLONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_DELTA = PLONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__ARCHIVE_DELTA_PERCENT = PLONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__DEFAULT_VALUE = PLONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__GRAPH_MAX = PLONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__GRAPH_MIN = PLONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__MIN_DELTA_TRIG = PLONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__MIN_STEP = PLONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__MAX_VALUE = PLONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG__MIN_VALUE = PLONG1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWlong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_FEATURE_COUNT = PLONG1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWlong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_OPERATION_COUNT = PLONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWlongLongImpl <em>RWlong Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWlongLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWlongLong()
	 * @generated
	 */
	int RWLONG_LONG = 59;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_MAX_INT = PLONG_LONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_MECHANISM = PLONG_LONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_MIN_INT = PLONG_LONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_PRIORITY = PLONG_LONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_SUPPRESS = PLONG_LONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__DEFAULT_TIMER_TRIG = PLONG_LONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__DESCRIPTION = PLONG_LONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__FORMAT = PLONG_LONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__INITIALIZE_DEVIO = PLONG_LONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__MIN_TIMER_TRIG = PLONG_LONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__RESOLUTION = PLONG_LONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__UNITS = PLONG_LONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_DELTA = PLONG_LONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__ARCHIVE_DELTA_PERCENT = PLONG_LONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__DEFAULT_VALUE = PLONG_LONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__GRAPH_MAX = PLONG_LONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__GRAPH_MIN = PLONG_LONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__MIN_DELTA_TRIG = PLONG_LONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__MIN_STEP = PLONG_LONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__MAX_VALUE = PLONG_LONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG__MIN_VALUE = PLONG_LONG1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWlong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG_FEATURE_COUNT = PLONG_LONG1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWlong Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_LONG_OPERATION_COUNT = PLONG_LONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWlongSeqImpl <em>RWlong Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWlongSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWlongSeq()
	 * @generated
	 */
	int RWLONG_SEQ = 60;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_MAX_INT = PLONG_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_MECHANISM = PLONG_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_MIN_INT = PLONG_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_PRIORITY = PLONG_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_SUPPRESS = PLONG_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__DEFAULT_TIMER_TRIG = PLONG_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__DESCRIPTION = PLONG_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__FORMAT = PLONG_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__INITIALIZE_DEVIO = PLONG_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__MIN_TIMER_TRIG = PLONG_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__RESOLUTION = PLONG_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__UNITS = PLONG_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_DELTA = PLONG_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__ARCHIVE_DELTA_PERCENT = PLONG_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__DEFAULT_VALUE = PLONG_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__GRAPH_MAX = PLONG_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__GRAPH_MIN = PLONG_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__MIN_DELTA_TRIG = PLONG_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__MIN_STEP = PLONG_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__MAX_VALUE = PLONG_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ__MIN_VALUE = PLONG_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWlong Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ_FEATURE_COUNT = PLONG_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWlong Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWLONG_SEQ_OPERATION_COUNT = PLONG_SEQ1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWpatternImpl <em>RWpattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWpatternImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWpattern()
	 * @generated
	 */
	int RWPATTERN = 61;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_MAX_INT = PPATTERN1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_MECHANISM = PPATTERN1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_MIN_INT = PPATTERN1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_PRIORITY = PPATTERN1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_SUPPRESS = PPATTERN1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__DEFAULT_TIMER_TRIG = PPATTERN1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__DESCRIPTION = PPATTERN1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__FORMAT = PPATTERN1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__INITIALIZE_DEVIO = PPATTERN1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__MIN_TIMER_TRIG = PPATTERN1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__RESOLUTION = PPATTERN1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__UNITS = PPATTERN1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_DELTA = PPATTERN1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__ARCHIVE_DELTA_PERCENT = PPATTERN1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Bit Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__BIT_DESCRIPTION = PPATTERN1__BIT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__DEFAULT_VALUE = PPATTERN1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__MIN_STEP = PPATTERN1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>When Cleared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__WHEN_CLEARED = PPATTERN1__WHEN_CLEARED;

	/**
	 * The feature id for the '<em><b>When Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN__WHEN_SET = PPATTERN1__WHEN_SET;

	/**
	 * The number of structural features of the '<em>RWpattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN_FEATURE_COUNT = PPATTERN1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RWpattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWPATTERN_OPERATION_COUNT = PPATTERN1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWstringImpl <em>RWstring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWstringImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWstring()
	 * @generated
	 */
	int RWSTRING = 62;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_MAX_INT = PSTRING1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_MECHANISM = PSTRING1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_MIN_INT = PSTRING1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_PRIORITY = PSTRING1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_SUPPRESS = PSTRING1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__DEFAULT_TIMER_TRIG = PSTRING1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__DESCRIPTION = PSTRING1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__FORMAT = PSTRING1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__INITIALIZE_DEVIO = PSTRING1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__MIN_TIMER_TRIG = PSTRING1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__RESOLUTION = PSTRING1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__UNITS = PSTRING1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_DELTA = PSTRING1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__ARCHIVE_DELTA_PERCENT = PSTRING1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING__DEFAULT_VALUE = PSTRING1__DEFAULT_VALUE;

	/**
	 * The number of structural features of the '<em>RWstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING_FEATURE_COUNT = PSTRING1_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RWstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWSTRING_OPERATION_COUNT = PSTRING1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWuLongImpl <em>RWu Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWuLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWuLong()
	 * @generated
	 */
	int RWU_LONG = 63;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_MAX_INT = PU_LONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_MECHANISM = PU_LONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_MIN_INT = PU_LONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_PRIORITY = PU_LONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_SUPPRESS = PU_LONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__DEFAULT_TIMER_TRIG = PU_LONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__DESCRIPTION = PU_LONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__FORMAT = PU_LONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__INITIALIZE_DEVIO = PU_LONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__MIN_TIMER_TRIG = PU_LONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__RESOLUTION = PU_LONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__UNITS = PU_LONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_DELTA = PU_LONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__ARCHIVE_DELTA_PERCENT = PU_LONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__DEFAULT_VALUE = PU_LONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__GRAPH_MAX = PU_LONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__GRAPH_MIN = PU_LONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__MIN_DELTA_TRIG = PU_LONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__MIN_STEP = PU_LONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__MAX_VALUE = PU_LONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG__MIN_VALUE = PU_LONG1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWu Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_FEATURE_COUNT = PU_LONG1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWu Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_OPERATION_COUNT = PU_LONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWuLongLongImpl <em>RWu Long Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWuLongLongImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWuLongLong()
	 * @generated
	 */
	int RWU_LONG_LONG = 64;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_MAX_INT = PU_LONG_LONG1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_MECHANISM = PU_LONG_LONG1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_MIN_INT = PU_LONG_LONG1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_PRIORITY = PU_LONG_LONG1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_SUPPRESS = PU_LONG_LONG1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__DEFAULT_TIMER_TRIG = PU_LONG_LONG1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__DESCRIPTION = PU_LONG_LONG1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__FORMAT = PU_LONG_LONG1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__INITIALIZE_DEVIO = PU_LONG_LONG1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__MIN_TIMER_TRIG = PU_LONG_LONG1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__RESOLUTION = PU_LONG_LONG1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__UNITS = PU_LONG_LONG1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_DELTA = PU_LONG_LONG1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__ARCHIVE_DELTA_PERCENT = PU_LONG_LONG1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__DEFAULT_VALUE = PU_LONG_LONG1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__GRAPH_MAX = PU_LONG_LONG1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__GRAPH_MIN = PU_LONG_LONG1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__MIN_DELTA_TRIG = PU_LONG_LONG1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__MIN_STEP = PU_LONG_LONG1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__MAX_VALUE = PU_LONG_LONG1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG__MIN_VALUE = PU_LONG_LONG1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWu Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG_FEATURE_COUNT = PU_LONG_LONG1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWu Long Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_LONG_OPERATION_COUNT = PU_LONG_LONG1_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link baciCodeGen.BACIProperties.impl.RWuLongSeqImpl <em>RWu Long Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see baciCodeGen.BACIProperties.impl.RWuLongSeqImpl
	 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWuLongSeq()
	 * @generated
	 */
	int RWU_LONG_SEQ = 65;

	/**
	 * The feature id for the '<em><b>Archive Max Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_MAX_INT = PU_LONG_SEQ1__ARCHIVE_MAX_INT;

	/**
	 * The feature id for the '<em><b>Archive Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_MECHANISM = PU_LONG_SEQ1__ARCHIVE_MECHANISM;

	/**
	 * The feature id for the '<em><b>Archive Min Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_MIN_INT = PU_LONG_SEQ1__ARCHIVE_MIN_INT;

	/**
	 * The feature id for the '<em><b>Archive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_PRIORITY = PU_LONG_SEQ1__ARCHIVE_PRIORITY;

	/**
	 * The feature id for the '<em><b>Archive Suppress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_SUPPRESS = PU_LONG_SEQ1__ARCHIVE_SUPPRESS;

	/**
	 * The feature id for the '<em><b>Default Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__DEFAULT_TIMER_TRIG = PU_LONG_SEQ1__DEFAULT_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__DESCRIPTION = PU_LONG_SEQ1__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__FORMAT = PU_LONG_SEQ1__FORMAT;

	/**
	 * The feature id for the '<em><b>Initialize Devio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__INITIALIZE_DEVIO = PU_LONG_SEQ1__INITIALIZE_DEVIO;

	/**
	 * The feature id for the '<em><b>Min Timer Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__MIN_TIMER_TRIG = PU_LONG_SEQ1__MIN_TIMER_TRIG;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__RESOLUTION = PU_LONG_SEQ1__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__UNITS = PU_LONG_SEQ1__UNITS;

	/**
	 * The feature id for the '<em><b>Archive Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_DELTA = PU_LONG_SEQ1__ARCHIVE_DELTA;

	/**
	 * The feature id for the '<em><b>Archive Delta Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__ARCHIVE_DELTA_PERCENT = PU_LONG_SEQ1__ARCHIVE_DELTA_PERCENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__DEFAULT_VALUE = PU_LONG_SEQ1__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Graph Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__GRAPH_MAX = PU_LONG_SEQ1__GRAPH_MAX;

	/**
	 * The feature id for the '<em><b>Graph Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__GRAPH_MIN = PU_LONG_SEQ1__GRAPH_MIN;

	/**
	 * The feature id for the '<em><b>Min Delta Trig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__MIN_DELTA_TRIG = PU_LONG_SEQ1__MIN_DELTA_TRIG;

	/**
	 * The feature id for the '<em><b>Min Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__MIN_STEP = PU_LONG_SEQ1__MIN_STEP;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__MAX_VALUE = PU_LONG_SEQ1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ__MIN_VALUE = PU_LONG_SEQ1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>RWu Long Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ_FEATURE_COUNT = PU_LONG_SEQ1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>RWu Long Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RWU_LONG_SEQ_OPERATION_COUNT = PU_LONG_SEQ1_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.CharacteristicComponent <em>Characteristic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Component</em>'.
	 * @see baciCodeGen.BACIProperties.CharacteristicComponent
	 * @generated
	 */
	EClass getCharacteristicComponent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.CharacteristicComponent#getActionThreadStackSize <em>Action Thread Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Thread Stack Size</em>'.
	 * @see baciCodeGen.BACIProperties.CharacteristicComponent#getActionThreadStackSize()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_ActionThreadStackSize();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.CharacteristicComponent#getMonitoringThreadStackSize <em>Monitoring Thread Stack Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Thread Stack Size</em>'.
	 * @see baciCodeGen.BACIProperties.CharacteristicComponent#getMonitoringThreadStackSize()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_MonitoringThreadStackSize();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.CharacteristicComponent#getRecentCommand <em>Recent Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recent Command</em>'.
	 * @see baciCodeGen.BACIProperties.CharacteristicComponent#getRecentCommand()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_RecentCommand();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.CharacteristicComponent#getRecentTimeStamp <em>Recent Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recent Time Stamp</em>'.
	 * @see baciCodeGen.BACIProperties.CharacteristicComponent#getRecentTimeStamp()
	 * @see #getCharacteristicComponent()
	 * @generated
	 */
	EAttribute getCharacteristicComponent_RecentTimeStamp();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.CharacteristicModel <em>Characteristic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic Model</em>'.
	 * @see baciCodeGen.BACIProperties.CharacteristicModel
	 * @generated
	 */
	EClass getCharacteristicModel();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pboolean <em>Pboolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pboolean</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean
	 * @generated
	 */
	EClass getPboolean();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pboolean1 <em>Pboolean1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pboolean1</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1
	 * @generated
	 */
	EClass getPboolean1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#isArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#isArchiveDelta()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#getArchiveDeltaPercent()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#isDefaultValue()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#isGraphMax()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#isGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#isGraphMin()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#isMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#isMinDeltaTrig()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pboolean1#isMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.Pboolean1#isMinStep()
	 * @see #getPboolean1()
	 * @generated
	 */
	EAttribute getPboolean1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PbooleanSeq <em>Pboolean Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pboolean Seq</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq
	 * @generated
	 */
	EClass getPbooleanSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PbooleanSeq1 <em>Pboolean Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pboolean Seq1</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1
	 * @generated
	 */
	EClass getPbooleanSeq1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#isArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#isArchiveDelta()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#getArchiveDeltaPercent()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#isDefaultValue()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#isGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#isGraphMax()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#isGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#isGraphMin()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#isMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#isMinDeltaTrig()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PbooleanSeq1#isMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1#isMinStep()
	 * @see #getPbooleanSeq1()
	 * @generated
	 */
	EAttribute getPbooleanSeq1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pdouble <em>Pdouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pdouble</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble
	 * @generated
	 */
	EClass getPdouble();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pdouble1 <em>Pdouble1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pdouble1</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1
	 * @generated
	 */
	EClass getPdouble1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getArchiveDelta()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getArchiveDeltaPercent()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getDefaultValue()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getGraphMax()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getGraphMin()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getMinDeltaTrig()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pdouble1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.Pdouble1#getMinStep()
	 * @see #getPdouble1()
	 * @generated
	 */
	EAttribute getPdouble1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PdoubleSeq <em>Pdouble Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pdouble Seq</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq
	 * @generated
	 */
	EClass getPdoubleSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PdoubleSeq1 <em>Pdouble Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pdouble Seq1</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1
	 * @generated
	 */
	EClass getPdoubleSeq1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getArchiveDelta()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getArchiveDeltaPercent()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getDefaultValue()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getGraphMax()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getGraphMin()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getMinDeltaTrig()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PdoubleSeq1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1#getMinStep()
	 * @see #getPdoubleSeq1()
	 * @generated
	 */
	EAttribute getPdoubleSeq1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PEnum <em>PEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PEnum</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum
	 * @generated
	 */
	EClass getPEnum();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PEnum1 <em>PEnum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PEnum1</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1
	 * @generated
	 */
	EClass getPEnum1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getArchiveDelta()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getArchiveDeltaPercent()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getCondition()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_Condition();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getDefaultValue()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getGraphMax()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getGraphMin()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PEnum1#getStatesDescription <em>States Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>States Description</em>'.
	 * @see baciCodeGen.BACIProperties.PEnum1#getStatesDescription()
	 * @see #getPEnum1()
	 * @generated
	 */
	EAttribute getPEnum1_StatesDescription();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pfloat <em>Pfloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pfloat</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat
	 * @generated
	 */
	EClass getPfloat();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pfloat1 <em>Pfloat1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pfloat1</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1
	 * @generated
	 */
	EClass getPfloat1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getArchiveDelta()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getArchiveDeltaPercent()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getDefaultValue()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getGraphMax()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getGraphMin()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getMinDeltaTrig()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pfloat1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.Pfloat1#getMinStep()
	 * @see #getPfloat1()
	 * @generated
	 */
	EAttribute getPfloat1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PfloatSeq <em>Pfloat Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pfloat Seq</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq
	 * @generated
	 */
	EClass getPfloatSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PfloatSeq1 <em>Pfloat Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pfloat Seq1</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1
	 * @generated
	 */
	EClass getPfloatSeq1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getArchiveDelta()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getArchiveDeltaPercent()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getDefaultValue()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getGraphMax()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getGraphMin()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getMinDeltaTrig()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PfloatSeq1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1#getMinStep()
	 * @see #getPfloatSeq1()
	 * @generated
	 */
	EAttribute getPfloatSeq1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Plong <em>Plong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plong</em>'.
	 * @see baciCodeGen.BACIProperties.Plong
	 * @generated
	 */
	EClass getPlong();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Plong1 <em>Plong1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plong1</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1
	 * @generated
	 */
	EClass getPlong1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getArchiveDelta()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getArchiveDeltaPercent()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getDefaultValue()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getGraphMax()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getGraphMin()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getMinDeltaTrig()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Plong1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.Plong1#getMinStep()
	 * @see #getPlong1()
	 * @generated
	 */
	EAttribute getPlong1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PlongLong <em>Plong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plong Long</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong
	 * @generated
	 */
	EClass getPlongLong();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PlongLong1 <em>Plong Long1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plong Long1</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1
	 * @generated
	 */
	EClass getPlongLong1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getArchiveDelta()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getArchiveDeltaPercent()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getDefaultValue()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getGraphMax()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getGraphMin()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getMinDeltaTrig()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongLong1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PlongLong1#getMinStep()
	 * @see #getPlongLong1()
	 * @generated
	 */
	EAttribute getPlongLong1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PlongSeq <em>Plong Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plong Seq</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq
	 * @generated
	 */
	EClass getPlongSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PlongSeq1 <em>Plong Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plong Seq1</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1
	 * @generated
	 */
	EClass getPlongSeq1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getArchiveDelta()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getArchiveDeltaPercent()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getDefaultValue()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getGraphMax()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getGraphMin()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getMinDeltaTrig()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PlongSeq1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PlongSeq1#getMinStep()
	 * @see #getPlongSeq1()
	 * @generated
	 */
	EAttribute getPlongSeq1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Ppattern <em>Ppattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ppattern</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern
	 * @generated
	 */
	EClass getPpattern();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Ppattern1 <em>Ppattern1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ppattern1</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1
	 * @generated
	 */
	EClass getPpattern1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getArchiveDelta()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getArchiveDeltaPercent()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getBitDescription <em>Bit Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Description</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getBitDescription()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_BitDescription();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getDefaultValue()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getMinStep()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_MinStep();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getWhenCleared <em>When Cleared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Cleared</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getWhenCleared()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_WhenCleared();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Ppattern1#getWhenSet <em>When Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Set</em>'.
	 * @see baciCodeGen.BACIProperties.Ppattern1#getWhenSet()
	 * @see #getPpattern1()
	 * @generated
	 */
	EAttribute getPpattern1_WhenSet();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see baciCodeGen.BACIProperties.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pstring <em>Pstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pstring</em>'.
	 * @see baciCodeGen.BACIProperties.Pstring
	 * @generated
	 */
	EClass getPstring();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.Pstring1 <em>Pstring1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pstring1</em>'.
	 * @see baciCodeGen.BACIProperties.Pstring1
	 * @generated
	 */
	EClass getPstring1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pstring1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.Pstring1#getArchiveDelta()
	 * @see #getPstring1()
	 * @generated
	 */
	EAttribute getPstring1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pstring1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.Pstring1#getArchiveDeltaPercent()
	 * @see #getPstring1()
	 * @generated
	 */
	EAttribute getPstring1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.Pstring1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.Pstring1#getDefaultValue()
	 * @see #getPstring1()
	 * @generated
	 */
	EAttribute getPstring1_DefaultValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PstringSeq <em>Pstring Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pstring Seq</em>'.
	 * @see baciCodeGen.BACIProperties.PstringSeq
	 * @generated
	 */
	EClass getPstringSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PstringSeq1 <em>Pstring Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pstring Seq1</em>'.
	 * @see baciCodeGen.BACIProperties.PstringSeq1
	 * @generated
	 */
	EClass getPstringSeq1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PstringSeq1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PstringSeq1#getArchiveDelta()
	 * @see #getPstringSeq1()
	 * @generated
	 */
	EAttribute getPstringSeq1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PstringSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PstringSeq1#getArchiveDeltaPercent()
	 * @see #getPstringSeq1()
	 * @generated
	 */
	EAttribute getPstringSeq1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PstringSeq1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PstringSeq1#getDefaultValue()
	 * @see #getPstringSeq1()
	 * @generated
	 */
	EAttribute getPstringSeq1_DefaultValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PuLong <em>Pu Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Long</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong
	 * @generated
	 */
	EClass getPuLong();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PuLong1 <em>Pu Long1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Long1</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1
	 * @generated
	 */
	EClass getPuLong1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getArchiveDelta()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getArchiveDeltaPercent()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getDefaultValue()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getGraphMax()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getGraphMin()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getMinDeltaTrig()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLong1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PuLong1#getMinStep()
	 * @see #getPuLong1()
	 * @generated
	 */
	EAttribute getPuLong1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PuLongLong <em>Pu Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Long Long</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong
	 * @generated
	 */
	EClass getPuLongLong();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PuLongLong1 <em>Pu Long Long1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Long Long1</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1
	 * @generated
	 */
	EClass getPuLongLong1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getArchiveDelta()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getArchiveDeltaPercent()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getDefaultValue()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getGraphMax()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getGraphMin()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getMinDeltaTrig()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongLong1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongLong1#getMinStep()
	 * @see #getPuLongLong1()
	 * @generated
	 */
	EAttribute getPuLongLong1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PuLongSeq <em>Pu Long Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Long Seq</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq
	 * @generated
	 */
	EClass getPuLongSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.PuLongSeq1 <em>Pu Long Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pu Long Seq1</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1
	 * @generated
	 */
	EClass getPuLongSeq1();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getArchiveDelta <em>Archive Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getArchiveDelta()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_ArchiveDelta();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getArchiveDeltaPercent <em>Archive Delta Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Delta Percent</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getArchiveDeltaPercent()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_ArchiveDeltaPercent();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getDefaultValue()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getGraphMax <em>Graph Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Max</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getGraphMax()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_GraphMax();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getGraphMin <em>Graph Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Graph Min</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getGraphMin()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_GraphMin();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getMinDeltaTrig <em>Min Delta Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Delta Trig</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getMinDeltaTrig()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_MinDeltaTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.PuLongSeq1#getMinStep <em>Min Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Step</em>'.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1#getMinStep()
	 * @see #getPuLongSeq1()
	 * @generated
	 */
	EAttribute getPuLongSeq1_MinStep();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROboolean <em>ROboolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROboolean</em>'.
	 * @see baciCodeGen.BACIProperties.ROboolean
	 * @generated
	 */
	EClass getROboolean();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROboolean#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROboolean#getAlarmFaultFamily()
	 * @see #getROboolean()
	 * @generated
	 */
	EAttribute getROboolean_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROboolean#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROboolean#getAlarmFaultMember()
	 * @see #getROboolean()
	 * @generated
	 */
	EAttribute getROboolean_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROboolean#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROboolean#getAlarmLevel()
	 * @see #getROboolean()
	 * @generated
	 */
	EAttribute getROboolean_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROboolean#isAlarmOn <em>Alarm On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm On</em>'.
	 * @see baciCodeGen.BACIProperties.ROboolean#isAlarmOn()
	 * @see #getROboolean()
	 * @generated
	 */
	EAttribute getROboolean_AlarmOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROboolean#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROboolean#getAlarmTimerTrig()
	 * @see #getROboolean()
	 * @generated
	 */
	EAttribute getROboolean_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RObooleanSeq <em>ROboolean Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROboolean Seq</em>'.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq
	 * @generated
	 */
	EClass getRObooleanSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RObooleanSeq#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq#getAlarmFaultFamily()
	 * @see #getRObooleanSeq()
	 * @generated
	 */
	EAttribute getRObooleanSeq_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RObooleanSeq#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq#getAlarmFaultMember()
	 * @see #getRObooleanSeq()
	 * @generated
	 */
	EAttribute getRObooleanSeq_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RObooleanSeq#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq#getAlarmLevel()
	 * @see #getRObooleanSeq()
	 * @generated
	 */
	EAttribute getRObooleanSeq_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RObooleanSeq#isAlarmOn <em>Alarm On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm On</em>'.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq#isAlarmOn()
	 * @see #getRObooleanSeq()
	 * @generated
	 */
	EAttribute getRObooleanSeq_AlarmOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RObooleanSeq#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq#getAlarmTimerTrig()
	 * @see #getRObooleanSeq()
	 * @generated
	 */
	EAttribute getRObooleanSeq_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROdouble <em>ROdouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROdouble</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble
	 * @generated
	 */
	EClass getROdouble();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmFaultFamily()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmFaultMember()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmHighOff()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmHighOn()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmLevel()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmLowOff()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmLowOn()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdouble#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROdouble#getAlarmTimerTrig()
	 * @see #getROdouble()
	 * @generated
	 */
	EAttribute getROdouble_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROdoubleSeq <em>ROdouble Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROdouble Seq</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq
	 * @generated
	 */
	EClass getROdoubleSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmFaultFamily()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmFaultMember()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmHighOff()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmHighOn()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmLevel()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmLowOff()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmLowOn()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq#getAlarmTimerTrig()
	 * @see #getROdoubleSeq()
	 * @generated
	 */
	EAttribute getROdoubleSeq_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROEnum <em>RO Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RO Enum</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum
	 * @generated
	 */
	EClass getROEnum();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROEnum#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum#getAlarmFaultFamily()
	 * @see #getROEnum()
	 * @generated
	 */
	EAttribute getROEnum_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROEnum#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum#getAlarmFaultMember()
	 * @see #getROEnum()
	 * @generated
	 */
	EAttribute getROEnum_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROEnum#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum#getAlarmLevel()
	 * @see #getROEnum()
	 * @generated
	 */
	EAttribute getROEnum_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROEnum#getAlarmOff <em>Alarm Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum#getAlarmOff()
	 * @see #getROEnum()
	 * @generated
	 */
	EAttribute getROEnum_AlarmOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROEnum#getAlarmOn <em>Alarm On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm On</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum#getAlarmOn()
	 * @see #getROEnum()
	 * @generated
	 */
	EAttribute getROEnum_AlarmOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROEnum#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROEnum#getAlarmTimerTrig()
	 * @see #getROEnum()
	 * @generated
	 */
	EAttribute getROEnum_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROfloat <em>ROfloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROfloat</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat
	 * @generated
	 */
	EClass getROfloat();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmFaultFamily()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmFaultMember()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmHighOff()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmHighOn()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmLevel()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmLowOff()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmLowOn()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloat#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloat#getAlarmTimerTrig()
	 * @see #getROfloat()
	 * @generated
	 */
	EAttribute getROfloat_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROfloatSeq <em>ROfloat Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROfloat Seq</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq
	 * @generated
	 */
	EClass getROfloatSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmFaultFamily()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmFaultMember()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmHighOff()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmHighOn()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmLevel()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmLowOff()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmLowOn()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROfloatSeq#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq#getAlarmTimerTrig()
	 * @see #getROfloatSeq()
	 * @generated
	 */
	EAttribute getROfloatSeq_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROlong <em>ROlong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROlong</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong
	 * @generated
	 */
	EClass getROlong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmFaultFamily()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmFaultMember()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmHighOff()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmHighOn()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmLevel()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmLowOff()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmLowOn()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROlong#getAlarmTimerTrig()
	 * @see #getROlong()
	 * @generated
	 */
	EAttribute getROlong_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROlongLong <em>ROlong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROlong Long</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong
	 * @generated
	 */
	EClass getROlongLong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmFaultFamily()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmFaultMember()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmHighOff()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmHighOn()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmLevel()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmLowOff()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmLowOn()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongLong#getAlarmTimerTrig()
	 * @see #getROlongLong()
	 * @generated
	 */
	EAttribute getROlongLong_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROlongSeq <em>ROlong Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROlong Seq</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq
	 * @generated
	 */
	EClass getROlongSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmFaultFamily()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmFaultMember()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmHighOff()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmHighOn()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmLevel()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmLowOff()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmLowOn()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROlongSeq#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROlongSeq#getAlarmTimerTrig()
	 * @see #getROlongSeq()
	 * @generated
	 */
	EAttribute getROlongSeq_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROpattern <em>ROpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROpattern</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern
	 * @generated
	 */
	EClass getROpattern();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROpattern#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern#getAlarmFaultFamily()
	 * @see #getROpattern()
	 * @generated
	 */
	EAttribute getROpattern_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROpattern#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern#getAlarmFaultMember()
	 * @see #getROpattern()
	 * @generated
	 */
	EAttribute getROpattern_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROpattern#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern#getAlarmLevel()
	 * @see #getROpattern()
	 * @generated
	 */
	EAttribute getROpattern_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROpattern#getAlarmMask <em>Alarm Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Mask</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern#getAlarmMask()
	 * @see #getROpattern()
	 * @generated
	 */
	EAttribute getROpattern_AlarmMask();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROpattern#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern#getAlarmTimerTrig()
	 * @see #getROpattern()
	 * @generated
	 */
	EAttribute getROpattern_AlarmTimerTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROpattern#getAlarmTrigger <em>Alarm Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Trigger</em>'.
	 * @see baciCodeGen.BACIProperties.ROpattern#getAlarmTrigger()
	 * @see #getROpattern()
	 * @generated
	 */
	EAttribute getROpattern_AlarmTrigger();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROstring <em>ROstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROstring</em>'.
	 * @see baciCodeGen.BACIProperties.ROstring
	 * @generated
	 */
	EClass getROstring();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROstring#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROstring#getAlarmFaultFamily()
	 * @see #getROstring()
	 * @generated
	 */
	EAttribute getROstring_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROstring#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROstring#getAlarmFaultMember()
	 * @see #getROstring()
	 * @generated
	 */
	EAttribute getROstring_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROstring#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROstring#getAlarmLevel()
	 * @see #getROstring()
	 * @generated
	 */
	EAttribute getROstring_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROstring#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROstring#getAlarmTimerTrig()
	 * @see #getROstring()
	 * @generated
	 */
	EAttribute getROstring_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROstringSeq <em>ROstring Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROstring Seq</em>'.
	 * @see baciCodeGen.BACIProperties.ROstringSeq
	 * @generated
	 */
	EClass getROstringSeq();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROuLong <em>ROu Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROu Long</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong
	 * @generated
	 */
	EClass getROuLong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmFaultFamily()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmFaultMember()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmHighOff()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmHighOn()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmLevel()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmLowOff()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmLowOn()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLong#getAlarmTimerTrig()
	 * @see #getROuLong()
	 * @generated
	 */
	EAttribute getROuLong_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROuLongLong <em>ROu Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROu Long Long</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong
	 * @generated
	 */
	EClass getROuLongLong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmFaultFamily()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmFaultMember()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmHighOff()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmHighOn()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmLevel()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmLowOff()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmLowOn()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongLong#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongLong#getAlarmTimerTrig()
	 * @see #getROuLongLong()
	 * @generated
	 */
	EAttribute getROuLongLong_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.ROuLongSeq <em>ROu Long Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROu Long Seq</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq
	 * @generated
	 */
	EClass getROuLongSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmFaultFamily <em>Alarm Fault Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Family</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmFaultFamily()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmFaultFamily();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmFaultMember <em>Alarm Fault Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Fault Member</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmFaultMember()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmFaultMember();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmHighOff <em>Alarm High Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmHighOff()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmHighOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmHighOn <em>Alarm High On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm High On</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmHighOn()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmHighOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmLevel <em>Alarm Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Level</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmLevel()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmLevel();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmLowOff <em>Alarm Low Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low Off</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmLowOff()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmLowOff();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmLowOn <em>Alarm Low On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Low On</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmLowOn()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmLowOn();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.ROuLongSeq#getAlarmTimerTrig <em>Alarm Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alarm Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq#getAlarmTimerTrig()
	 * @see #getROuLongSeq()
	 * @generated
	 */
	EAttribute getROuLongSeq_AlarmTimerTrig();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWboolean <em>RWboolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWboolean</em>'.
	 * @see baciCodeGen.BACIProperties.RWboolean
	 * @generated
	 */
	EClass getRWboolean();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWboolean#isMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWboolean#isMaxValue()
	 * @see #getRWboolean()
	 * @generated
	 */
	EAttribute getRWboolean_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWboolean#isMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWboolean#isMinValue()
	 * @see #getRWboolean()
	 * @generated
	 */
	EAttribute getRWboolean_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWbooleanSeq <em>RWboolean Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWboolean Seq</em>'.
	 * @see baciCodeGen.BACIProperties.RWbooleanSeq
	 * @generated
	 */
	EClass getRWbooleanSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWbooleanSeq#isMaxValue()
	 * @see #getRWbooleanSeq()
	 * @generated
	 */
	EAttribute getRWbooleanSeq_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWbooleanSeq#isMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWbooleanSeq#isMinValue()
	 * @see #getRWbooleanSeq()
	 * @generated
	 */
	EAttribute getRWbooleanSeq_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWdouble <em>RWdouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWdouble</em>'.
	 * @see baciCodeGen.BACIProperties.RWdouble
	 * @generated
	 */
	EClass getRWdouble();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWdouble#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWdouble#getMaxValue()
	 * @see #getRWdouble()
	 * @generated
	 */
	EAttribute getRWdouble_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWdouble#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWdouble#getMinValue()
	 * @see #getRWdouble()
	 * @generated
	 */
	EAttribute getRWdouble_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWdoubleSeq <em>RWdouble Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWdouble Seq</em>'.
	 * @see baciCodeGen.BACIProperties.RWdoubleSeq
	 * @generated
	 */
	EClass getRWdoubleSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWdoubleSeq#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWdoubleSeq#getMaxValue()
	 * @see #getRWdoubleSeq()
	 * @generated
	 */
	EAttribute getRWdoubleSeq_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWdoubleSeq#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWdoubleSeq#getMinValue()
	 * @see #getRWdoubleSeq()
	 * @generated
	 */
	EAttribute getRWdoubleSeq_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWEnum <em>RW Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RW Enum</em>'.
	 * @see baciCodeGen.BACIProperties.RWEnum
	 * @generated
	 */
	EClass getRWEnum();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWEnum#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWEnum#getMaxValue()
	 * @see #getRWEnum()
	 * @generated
	 */
	EAttribute getRWEnum_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWEnum#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWEnum#getMinValue()
	 * @see #getRWEnum()
	 * @generated
	 */
	EAttribute getRWEnum_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWfloat <em>RWfloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWfloat</em>'.
	 * @see baciCodeGen.BACIProperties.RWfloat
	 * @generated
	 */
	EClass getRWfloat();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWfloat#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWfloat#getMaxValue()
	 * @see #getRWfloat()
	 * @generated
	 */
	EAttribute getRWfloat_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWfloat#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWfloat#getMinValue()
	 * @see #getRWfloat()
	 * @generated
	 */
	EAttribute getRWfloat_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWfloatSeq <em>RWfloat Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWfloat Seq</em>'.
	 * @see baciCodeGen.BACIProperties.RWfloatSeq
	 * @generated
	 */
	EClass getRWfloatSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWfloatSeq#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWfloatSeq#getMaxValue()
	 * @see #getRWfloatSeq()
	 * @generated
	 */
	EAttribute getRWfloatSeq_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWfloatSeq#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWfloatSeq#getMinValue()
	 * @see #getRWfloatSeq()
	 * @generated
	 */
	EAttribute getRWfloatSeq_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWlong <em>RWlong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWlong</em>'.
	 * @see baciCodeGen.BACIProperties.RWlong
	 * @generated
	 */
	EClass getRWlong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWlong#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWlong#getMaxValue()
	 * @see #getRWlong()
	 * @generated
	 */
	EAttribute getRWlong_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWlong#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWlong#getMinValue()
	 * @see #getRWlong()
	 * @generated
	 */
	EAttribute getRWlong_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWlongLong <em>RWlong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWlong Long</em>'.
	 * @see baciCodeGen.BACIProperties.RWlongLong
	 * @generated
	 */
	EClass getRWlongLong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWlongLong#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWlongLong#getMaxValue()
	 * @see #getRWlongLong()
	 * @generated
	 */
	EAttribute getRWlongLong_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWlongLong#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWlongLong#getMinValue()
	 * @see #getRWlongLong()
	 * @generated
	 */
	EAttribute getRWlongLong_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWlongSeq <em>RWlong Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWlong Seq</em>'.
	 * @see baciCodeGen.BACIProperties.RWlongSeq
	 * @generated
	 */
	EClass getRWlongSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWlongSeq#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWlongSeq#getMaxValue()
	 * @see #getRWlongSeq()
	 * @generated
	 */
	EAttribute getRWlongSeq_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWlongSeq#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWlongSeq#getMinValue()
	 * @see #getRWlongSeq()
	 * @generated
	 */
	EAttribute getRWlongSeq_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWpattern <em>RWpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWpattern</em>'.
	 * @see baciCodeGen.BACIProperties.RWpattern
	 * @generated
	 */
	EClass getRWpattern();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWstring <em>RWstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWstring</em>'.
	 * @see baciCodeGen.BACIProperties.RWstring
	 * @generated
	 */
	EClass getRWstring();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWuLong <em>RWu Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWu Long</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLong
	 * @generated
	 */
	EClass getRWuLong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWuLong#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLong#getMaxValue()
	 * @see #getRWuLong()
	 * @generated
	 */
	EAttribute getRWuLong_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWuLong#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLong#getMinValue()
	 * @see #getRWuLong()
	 * @generated
	 */
	EAttribute getRWuLong_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWuLongLong <em>RWu Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWu Long Long</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLongLong
	 * @generated
	 */
	EClass getRWuLongLong();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWuLongLong#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLongLong#getMaxValue()
	 * @see #getRWuLongLong()
	 * @generated
	 */
	EAttribute getRWuLongLong_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWuLongLong#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLongLong#getMinValue()
	 * @see #getRWuLongLong()
	 * @generated
	 */
	EAttribute getRWuLongLong_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.RWuLongSeq <em>RWu Long Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RWu Long Seq</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLongSeq
	 * @generated
	 */
	EClass getRWuLongSeq();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLongSeq#getMaxValue()
	 * @see #getRWuLongSeq()
	 * @generated
	 */
	EAttribute getRWuLongSeq_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.RWuLongSeq#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see baciCodeGen.BACIProperties.RWuLongSeq#getMinValue()
	 * @see #getRWuLongSeq()
	 * @generated
	 */
	EAttribute getRWuLongSeq_MinValue();

	/**
	 * Returns the meta object for class '{@link baciCodeGen.BACIProperties.TypelessProperty <em>Typeless Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typeless Property</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty
	 * @generated
	 */
	EClass getTypelessProperty();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMaxInt <em>Archive Max Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Max Int</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getArchiveMaxInt()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_ArchiveMaxInt();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMechanism <em>Archive Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Mechanism</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getArchiveMechanism()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_ArchiveMechanism();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchiveMinInt <em>Archive Min Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Min Int</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getArchiveMinInt()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_ArchiveMinInt();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getArchivePriority <em>Archive Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Priority</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getArchivePriority()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_ArchivePriority();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#isArchiveSuppress <em>Archive Suppress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Suppress</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#isArchiveSuppress()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_ArchiveSuppress();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getDefaultTimerTrig <em>Default Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getDefaultTimerTrig()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_DefaultTimerTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getDescription()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getFormat()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_Format();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#isInitializeDevio <em>Initialize Devio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialize Devio</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#isInitializeDevio()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_InitializeDevio();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getMinTimerTrig <em>Min Timer Trig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Timer Trig</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getMinTimerTrig()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_MinTimerTrig();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getResolution()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link baciCodeGen.BACIProperties.TypelessProperty#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see baciCodeGen.BACIProperties.TypelessProperty#getUnits()
	 * @see #getTypelessProperty()
	 * @generated
	 */
	EAttribute getTypelessProperty_Units();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BACIPropertiesFactory getBACIPropertiesFactory();

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
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl <em>Characteristic Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.CharacteristicComponentImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getCharacteristicComponent()
		 * @generated
		 */
		EClass CHARACTERISTIC_COMPONENT = eINSTANCE.getCharacteristicComponent();

		/**
		 * The meta object literal for the '<em><b>Action Thread Stack Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE = eINSTANCE.getCharacteristicComponent_ActionThreadStackSize();

		/**
		 * The meta object literal for the '<em><b>Monitoring Thread Stack Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE = eINSTANCE.getCharacteristicComponent_MonitoringThreadStackSize();

		/**
		 * The meta object literal for the '<em><b>Recent Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__RECENT_COMMAND = eINSTANCE.getCharacteristicComponent_RecentCommand();

		/**
		 * The meta object literal for the '<em><b>Recent Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP = eINSTANCE.getCharacteristicComponent_RecentTimeStamp();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.CharacteristicModelImpl <em>Characteristic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.CharacteristicModelImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getCharacteristicModel()
		 * @generated
		 */
		EClass CHARACTERISTIC_MODEL = eINSTANCE.getCharacteristicModel();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PbooleanImpl <em>Pboolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PbooleanImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPboolean()
		 * @generated
		 */
		EClass PBOOLEAN = eINSTANCE.getPboolean();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl <em>Pboolean1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.Pboolean1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPboolean1()
		 * @generated
		 */
		EClass PBOOLEAN1 = eINSTANCE.getPboolean1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__ARCHIVE_DELTA = eINSTANCE.getPboolean1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPboolean1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__DEFAULT_VALUE = eINSTANCE.getPboolean1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__GRAPH_MAX = eINSTANCE.getPboolean1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__GRAPH_MIN = eINSTANCE.getPboolean1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__MIN_DELTA_TRIG = eINSTANCE.getPboolean1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN1__MIN_STEP = eINSTANCE.getPboolean1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PbooleanSeqImpl <em>Pboolean Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PbooleanSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPbooleanSeq()
		 * @generated
		 */
		EClass PBOOLEAN_SEQ = eINSTANCE.getPbooleanSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PbooleanSeq1Impl <em>Pboolean Seq1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PbooleanSeq1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPbooleanSeq1()
		 * @generated
		 */
		EClass PBOOLEAN_SEQ1 = eINSTANCE.getPbooleanSeq1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__ARCHIVE_DELTA = eINSTANCE.getPbooleanSeq1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPbooleanSeq1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__DEFAULT_VALUE = eINSTANCE.getPbooleanSeq1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__GRAPH_MAX = eINSTANCE.getPbooleanSeq1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__GRAPH_MIN = eINSTANCE.getPbooleanSeq1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__MIN_DELTA_TRIG = eINSTANCE.getPbooleanSeq1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PBOOLEAN_SEQ1__MIN_STEP = eINSTANCE.getPbooleanSeq1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PdoubleImpl <em>Pdouble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PdoubleImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdouble()
		 * @generated
		 */
		EClass PDOUBLE = eINSTANCE.getPdouble();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.Pdouble1Impl <em>Pdouble1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.Pdouble1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdouble1()
		 * @generated
		 */
		EClass PDOUBLE1 = eINSTANCE.getPdouble1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__ARCHIVE_DELTA = eINSTANCE.getPdouble1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPdouble1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__DEFAULT_VALUE = eINSTANCE.getPdouble1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__GRAPH_MAX = eINSTANCE.getPdouble1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__GRAPH_MIN = eINSTANCE.getPdouble1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__MIN_DELTA_TRIG = eINSTANCE.getPdouble1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE1__MIN_STEP = eINSTANCE.getPdouble1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PdoubleSeqImpl <em>Pdouble Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PdoubleSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdoubleSeq()
		 * @generated
		 */
		EClass PDOUBLE_SEQ = eINSTANCE.getPdoubleSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PdoubleSeq1Impl <em>Pdouble Seq1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PdoubleSeq1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPdoubleSeq1()
		 * @generated
		 */
		EClass PDOUBLE_SEQ1 = eINSTANCE.getPdoubleSeq1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__ARCHIVE_DELTA = eINSTANCE.getPdoubleSeq1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPdoubleSeq1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__DEFAULT_VALUE = eINSTANCE.getPdoubleSeq1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__GRAPH_MAX = eINSTANCE.getPdoubleSeq1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__GRAPH_MIN = eINSTANCE.getPdoubleSeq1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__MIN_DELTA_TRIG = eINSTANCE.getPdoubleSeq1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PDOUBLE_SEQ1__MIN_STEP = eINSTANCE.getPdoubleSeq1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PEnumImpl <em>PEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PEnumImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPEnum()
		 * @generated
		 */
		EClass PENUM = eINSTANCE.getPEnum();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PEnum1Impl <em>PEnum1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PEnum1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPEnum1()
		 * @generated
		 */
		EClass PENUM1 = eINSTANCE.getPEnum1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__ARCHIVE_DELTA = eINSTANCE.getPEnum1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPEnum1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__CONDITION = eINSTANCE.getPEnum1_Condition();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__DEFAULT_VALUE = eINSTANCE.getPEnum1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__GRAPH_MAX = eINSTANCE.getPEnum1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__GRAPH_MIN = eINSTANCE.getPEnum1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>States Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENUM1__STATES_DESCRIPTION = eINSTANCE.getPEnum1_StatesDescription();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PfloatImpl <em>Pfloat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PfloatImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloat()
		 * @generated
		 */
		EClass PFLOAT = eINSTANCE.getPfloat();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.Pfloat1Impl <em>Pfloat1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.Pfloat1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloat1()
		 * @generated
		 */
		EClass PFLOAT1 = eINSTANCE.getPfloat1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__ARCHIVE_DELTA = eINSTANCE.getPfloat1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPfloat1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__DEFAULT_VALUE = eINSTANCE.getPfloat1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__GRAPH_MAX = eINSTANCE.getPfloat1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__GRAPH_MIN = eINSTANCE.getPfloat1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__MIN_DELTA_TRIG = eINSTANCE.getPfloat1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT1__MIN_STEP = eINSTANCE.getPfloat1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PfloatSeqImpl <em>Pfloat Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PfloatSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloatSeq()
		 * @generated
		 */
		EClass PFLOAT_SEQ = eINSTANCE.getPfloatSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PfloatSeq1Impl <em>Pfloat Seq1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PfloatSeq1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPfloatSeq1()
		 * @generated
		 */
		EClass PFLOAT_SEQ1 = eINSTANCE.getPfloatSeq1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__ARCHIVE_DELTA = eINSTANCE.getPfloatSeq1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPfloatSeq1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__DEFAULT_VALUE = eINSTANCE.getPfloatSeq1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__GRAPH_MAX = eINSTANCE.getPfloatSeq1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__GRAPH_MIN = eINSTANCE.getPfloatSeq1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__MIN_DELTA_TRIG = eINSTANCE.getPfloatSeq1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFLOAT_SEQ1__MIN_STEP = eINSTANCE.getPfloatSeq1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PlongImpl <em>Plong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PlongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlong()
		 * @generated
		 */
		EClass PLONG = eINSTANCE.getPlong();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.Plong1Impl <em>Plong1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.Plong1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlong1()
		 * @generated
		 */
		EClass PLONG1 = eINSTANCE.getPlong1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__ARCHIVE_DELTA = eINSTANCE.getPlong1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPlong1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__DEFAULT_VALUE = eINSTANCE.getPlong1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__GRAPH_MAX = eINSTANCE.getPlong1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__GRAPH_MIN = eINSTANCE.getPlong1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__MIN_DELTA_TRIG = eINSTANCE.getPlong1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG1__MIN_STEP = eINSTANCE.getPlong1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PlongLongImpl <em>Plong Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PlongLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongLong()
		 * @generated
		 */
		EClass PLONG_LONG = eINSTANCE.getPlongLong();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PlongLong1Impl <em>Plong Long1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PlongLong1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongLong1()
		 * @generated
		 */
		EClass PLONG_LONG1 = eINSTANCE.getPlongLong1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__ARCHIVE_DELTA = eINSTANCE.getPlongLong1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPlongLong1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__DEFAULT_VALUE = eINSTANCE.getPlongLong1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__GRAPH_MAX = eINSTANCE.getPlongLong1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__GRAPH_MIN = eINSTANCE.getPlongLong1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__MIN_DELTA_TRIG = eINSTANCE.getPlongLong1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_LONG1__MIN_STEP = eINSTANCE.getPlongLong1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PlongSeqImpl <em>Plong Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PlongSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongSeq()
		 * @generated
		 */
		EClass PLONG_SEQ = eINSTANCE.getPlongSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PlongSeq1Impl <em>Plong Seq1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PlongSeq1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPlongSeq1()
		 * @generated
		 */
		EClass PLONG_SEQ1 = eINSTANCE.getPlongSeq1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__ARCHIVE_DELTA = eINSTANCE.getPlongSeq1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPlongSeq1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__DEFAULT_VALUE = eINSTANCE.getPlongSeq1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__GRAPH_MAX = eINSTANCE.getPlongSeq1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__GRAPH_MIN = eINSTANCE.getPlongSeq1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__MIN_DELTA_TRIG = eINSTANCE.getPlongSeq1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLONG_SEQ1__MIN_STEP = eINSTANCE.getPlongSeq1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PpatternImpl <em>Ppattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PpatternImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPpattern()
		 * @generated
		 */
		EClass PPATTERN = eINSTANCE.getPpattern();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl <em>Ppattern1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.Ppattern1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPpattern1()
		 * @generated
		 */
		EClass PPATTERN1 = eINSTANCE.getPpattern1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__ARCHIVE_DELTA = eINSTANCE.getPpattern1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPpattern1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Bit Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__BIT_DESCRIPTION = eINSTANCE.getPpattern1_BitDescription();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__DEFAULT_VALUE = eINSTANCE.getPpattern1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__MIN_STEP = eINSTANCE.getPpattern1_MinStep();

		/**
		 * The meta object literal for the '<em><b>When Cleared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__WHEN_CLEARED = eINSTANCE.getPpattern1_WhenCleared();

		/**
		 * The meta object literal for the '<em><b>When Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PPATTERN1__WHEN_SET = eINSTANCE.getPpattern1_WhenSet();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PropertyImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PstringImpl <em>Pstring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PstringImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstring()
		 * @generated
		 */
		EClass PSTRING = eINSTANCE.getPstring();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.Pstring1Impl <em>Pstring1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.Pstring1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstring1()
		 * @generated
		 */
		EClass PSTRING1 = eINSTANCE.getPstring1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING1__ARCHIVE_DELTA = eINSTANCE.getPstring1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPstring1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING1__DEFAULT_VALUE = eINSTANCE.getPstring1_DefaultValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PstringSeqImpl <em>Pstring Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PstringSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstringSeq()
		 * @generated
		 */
		EClass PSTRING_SEQ = eINSTANCE.getPstringSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PstringSeq1Impl <em>Pstring Seq1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PstringSeq1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPstringSeq1()
		 * @generated
		 */
		EClass PSTRING_SEQ1 = eINSTANCE.getPstringSeq1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING_SEQ1__ARCHIVE_DELTA = eINSTANCE.getPstringSeq1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING_SEQ1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPstringSeq1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSTRING_SEQ1__DEFAULT_VALUE = eINSTANCE.getPstringSeq1_DefaultValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PuLongImpl <em>Pu Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PuLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLong()
		 * @generated
		 */
		EClass PU_LONG = eINSTANCE.getPuLong();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PuLong1Impl <em>Pu Long1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PuLong1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLong1()
		 * @generated
		 */
		EClass PU_LONG1 = eINSTANCE.getPuLong1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__ARCHIVE_DELTA = eINSTANCE.getPuLong1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPuLong1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__DEFAULT_VALUE = eINSTANCE.getPuLong1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__GRAPH_MAX = eINSTANCE.getPuLong1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__GRAPH_MIN = eINSTANCE.getPuLong1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__MIN_DELTA_TRIG = eINSTANCE.getPuLong1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG1__MIN_STEP = eINSTANCE.getPuLong1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PuLongLongImpl <em>Pu Long Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PuLongLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongLong()
		 * @generated
		 */
		EClass PU_LONG_LONG = eINSTANCE.getPuLongLong();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PuLongLong1Impl <em>Pu Long Long1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PuLongLong1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongLong1()
		 * @generated
		 */
		EClass PU_LONG_LONG1 = eINSTANCE.getPuLongLong1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__ARCHIVE_DELTA = eINSTANCE.getPuLongLong1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPuLongLong1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__DEFAULT_VALUE = eINSTANCE.getPuLongLong1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__GRAPH_MAX = eINSTANCE.getPuLongLong1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__GRAPH_MIN = eINSTANCE.getPuLongLong1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__MIN_DELTA_TRIG = eINSTANCE.getPuLongLong1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_LONG1__MIN_STEP = eINSTANCE.getPuLongLong1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PuLongSeqImpl <em>Pu Long Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PuLongSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongSeq()
		 * @generated
		 */
		EClass PU_LONG_SEQ = eINSTANCE.getPuLongSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.PuLongSeq1Impl <em>Pu Long Seq1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.PuLongSeq1Impl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getPuLongSeq1()
		 * @generated
		 */
		EClass PU_LONG_SEQ1 = eINSTANCE.getPuLongSeq1();

		/**
		 * The meta object literal for the '<em><b>Archive Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__ARCHIVE_DELTA = eINSTANCE.getPuLongSeq1_ArchiveDelta();

		/**
		 * The meta object literal for the '<em><b>Archive Delta Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__ARCHIVE_DELTA_PERCENT = eINSTANCE.getPuLongSeq1_ArchiveDeltaPercent();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__DEFAULT_VALUE = eINSTANCE.getPuLongSeq1_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Graph Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__GRAPH_MAX = eINSTANCE.getPuLongSeq1_GraphMax();

		/**
		 * The meta object literal for the '<em><b>Graph Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__GRAPH_MIN = eINSTANCE.getPuLongSeq1_GraphMin();

		/**
		 * The meta object literal for the '<em><b>Min Delta Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__MIN_DELTA_TRIG = eINSTANCE.getPuLongSeq1_MinDeltaTrig();

		/**
		 * The meta object literal for the '<em><b>Min Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PU_LONG_SEQ1__MIN_STEP = eINSTANCE.getPuLongSeq1_MinStep();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RObooleanImpl <em>ROboolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RObooleanImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROboolean()
		 * @generated
		 */
		EClass ROBOOLEAN = eINSTANCE.getROboolean();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN__ALARM_FAULT_FAMILY = eINSTANCE.getROboolean_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN__ALARM_FAULT_MEMBER = eINSTANCE.getROboolean_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN__ALARM_LEVEL = eINSTANCE.getROboolean_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN__ALARM_ON = eINSTANCE.getROboolean_AlarmOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN__ALARM_TIMER_TRIG = eINSTANCE.getROboolean_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RObooleanSeqImpl <em>ROboolean Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RObooleanSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRObooleanSeq()
		 * @generated
		 */
		EClass ROBOOLEAN_SEQ = eINSTANCE.getRObooleanSeq();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN_SEQ__ALARM_FAULT_FAMILY = eINSTANCE.getRObooleanSeq_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN_SEQ__ALARM_FAULT_MEMBER = eINSTANCE.getRObooleanSeq_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN_SEQ__ALARM_LEVEL = eINSTANCE.getRObooleanSeq_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN_SEQ__ALARM_ON = eINSTANCE.getRObooleanSeq_AlarmOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOOLEAN_SEQ__ALARM_TIMER_TRIG = eINSTANCE.getRObooleanSeq_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROdoubleImpl <em>ROdouble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROdoubleImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROdouble()
		 * @generated
		 */
		EClass RODOUBLE = eINSTANCE.getROdouble();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_FAULT_FAMILY = eINSTANCE.getROdouble_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_FAULT_MEMBER = eINSTANCE.getROdouble_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_HIGH_OFF = eINSTANCE.getROdouble_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_HIGH_ON = eINSTANCE.getROdouble_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_LEVEL = eINSTANCE.getROdouble_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_LOW_OFF = eINSTANCE.getROdouble_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_LOW_ON = eINSTANCE.getROdouble_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE__ALARM_TIMER_TRIG = eINSTANCE.getROdouble_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROdoubleSeqImpl <em>ROdouble Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROdoubleSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROdoubleSeq()
		 * @generated
		 */
		EClass RODOUBLE_SEQ = eINSTANCE.getROdoubleSeq();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_FAULT_FAMILY = eINSTANCE.getROdoubleSeq_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_FAULT_MEMBER = eINSTANCE.getROdoubleSeq_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_HIGH_OFF = eINSTANCE.getROdoubleSeq_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_HIGH_ON = eINSTANCE.getROdoubleSeq_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_LEVEL = eINSTANCE.getROdoubleSeq_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_LOW_OFF = eINSTANCE.getROdoubleSeq_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_LOW_ON = eINSTANCE.getROdoubleSeq_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RODOUBLE_SEQ__ALARM_TIMER_TRIG = eINSTANCE.getROdoubleSeq_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROEnumImpl <em>RO Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROEnumImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROEnum()
		 * @generated
		 */
		EClass RO_ENUM = eINSTANCE.getROEnum();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RO_ENUM__ALARM_FAULT_FAMILY = eINSTANCE.getROEnum_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RO_ENUM__ALARM_FAULT_MEMBER = eINSTANCE.getROEnum_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RO_ENUM__ALARM_LEVEL = eINSTANCE.getROEnum_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RO_ENUM__ALARM_OFF = eINSTANCE.getROEnum_AlarmOff();

		/**
		 * The meta object literal for the '<em><b>Alarm On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RO_ENUM__ALARM_ON = eINSTANCE.getROEnum_AlarmOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RO_ENUM__ALARM_TIMER_TRIG = eINSTANCE.getROEnum_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROfloatImpl <em>ROfloat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROfloatImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROfloat()
		 * @generated
		 */
		EClass ROFLOAT = eINSTANCE.getROfloat();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_FAULT_FAMILY = eINSTANCE.getROfloat_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_FAULT_MEMBER = eINSTANCE.getROfloat_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_HIGH_OFF = eINSTANCE.getROfloat_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_HIGH_ON = eINSTANCE.getROfloat_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_LEVEL = eINSTANCE.getROfloat_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_LOW_OFF = eINSTANCE.getROfloat_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_LOW_ON = eINSTANCE.getROfloat_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT__ALARM_TIMER_TRIG = eINSTANCE.getROfloat_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROfloatSeqImpl <em>ROfloat Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROfloatSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROfloatSeq()
		 * @generated
		 */
		EClass ROFLOAT_SEQ = eINSTANCE.getROfloatSeq();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_FAULT_FAMILY = eINSTANCE.getROfloatSeq_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_FAULT_MEMBER = eINSTANCE.getROfloatSeq_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_HIGH_OFF = eINSTANCE.getROfloatSeq_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_HIGH_ON = eINSTANCE.getROfloatSeq_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_LEVEL = eINSTANCE.getROfloatSeq_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_LOW_OFF = eINSTANCE.getROfloatSeq_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_LOW_ON = eINSTANCE.getROfloatSeq_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROFLOAT_SEQ__ALARM_TIMER_TRIG = eINSTANCE.getROfloatSeq_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROlongImpl <em>ROlong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROlongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROlong()
		 * @generated
		 */
		EClass ROLONG = eINSTANCE.getROlong();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_FAULT_FAMILY = eINSTANCE.getROlong_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_FAULT_MEMBER = eINSTANCE.getROlong_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_HIGH_OFF = eINSTANCE.getROlong_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_HIGH_ON = eINSTANCE.getROlong_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_LEVEL = eINSTANCE.getROlong_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_LOW_OFF = eINSTANCE.getROlong_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_LOW_ON = eINSTANCE.getROlong_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG__ALARM_TIMER_TRIG = eINSTANCE.getROlong_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROlongLongImpl <em>ROlong Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROlongLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROlongLong()
		 * @generated
		 */
		EClass ROLONG_LONG = eINSTANCE.getROlongLong();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_FAULT_FAMILY = eINSTANCE.getROlongLong_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_FAULT_MEMBER = eINSTANCE.getROlongLong_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_HIGH_OFF = eINSTANCE.getROlongLong_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_HIGH_ON = eINSTANCE.getROlongLong_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_LEVEL = eINSTANCE.getROlongLong_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_LOW_OFF = eINSTANCE.getROlongLong_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_LOW_ON = eINSTANCE.getROlongLong_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_LONG__ALARM_TIMER_TRIG = eINSTANCE.getROlongLong_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROlongSeqImpl <em>ROlong Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROlongSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROlongSeq()
		 * @generated
		 */
		EClass ROLONG_SEQ = eINSTANCE.getROlongSeq();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_FAULT_FAMILY = eINSTANCE.getROlongSeq_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_FAULT_MEMBER = eINSTANCE.getROlongSeq_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_HIGH_OFF = eINSTANCE.getROlongSeq_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_HIGH_ON = eINSTANCE.getROlongSeq_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_LEVEL = eINSTANCE.getROlongSeq_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_LOW_OFF = eINSTANCE.getROlongSeq_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_LOW_ON = eINSTANCE.getROlongSeq_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLONG_SEQ__ALARM_TIMER_TRIG = eINSTANCE.getROlongSeq_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROpatternImpl <em>ROpattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROpatternImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROpattern()
		 * @generated
		 */
		EClass ROPATTERN = eINSTANCE.getROpattern();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROPATTERN__ALARM_FAULT_FAMILY = eINSTANCE.getROpattern_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROPATTERN__ALARM_FAULT_MEMBER = eINSTANCE.getROpattern_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROPATTERN__ALARM_LEVEL = eINSTANCE.getROpattern_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROPATTERN__ALARM_MASK = eINSTANCE.getROpattern_AlarmMask();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROPATTERN__ALARM_TIMER_TRIG = eINSTANCE.getROpattern_AlarmTimerTrig();

		/**
		 * The meta object literal for the '<em><b>Alarm Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROPATTERN__ALARM_TRIGGER = eINSTANCE.getROpattern_AlarmTrigger();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROstringImpl <em>ROstring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROstringImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROstring()
		 * @generated
		 */
		EClass ROSTRING = eINSTANCE.getROstring();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROSTRING__ALARM_FAULT_FAMILY = eINSTANCE.getROstring_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROSTRING__ALARM_FAULT_MEMBER = eINSTANCE.getROstring_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROSTRING__ALARM_LEVEL = eINSTANCE.getROstring_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROSTRING__ALARM_TIMER_TRIG = eINSTANCE.getROstring_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROstringSeqImpl <em>ROstring Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROstringSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROstringSeq()
		 * @generated
		 */
		EClass ROSTRING_SEQ = eINSTANCE.getROstringSeq();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROuLongImpl <em>ROu Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROuLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROuLong()
		 * @generated
		 */
		EClass ROU_LONG = eINSTANCE.getROuLong();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_FAULT_FAMILY = eINSTANCE.getROuLong_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_FAULT_MEMBER = eINSTANCE.getROuLong_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_HIGH_OFF = eINSTANCE.getROuLong_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_HIGH_ON = eINSTANCE.getROuLong_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_LEVEL = eINSTANCE.getROuLong_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_LOW_OFF = eINSTANCE.getROuLong_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_LOW_ON = eINSTANCE.getROuLong_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG__ALARM_TIMER_TRIG = eINSTANCE.getROuLong_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROuLongLongImpl <em>ROu Long Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROuLongLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROuLongLong()
		 * @generated
		 */
		EClass ROU_LONG_LONG = eINSTANCE.getROuLongLong();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_FAULT_FAMILY = eINSTANCE.getROuLongLong_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_FAULT_MEMBER = eINSTANCE.getROuLongLong_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_HIGH_OFF = eINSTANCE.getROuLongLong_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_HIGH_ON = eINSTANCE.getROuLongLong_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_LEVEL = eINSTANCE.getROuLongLong_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_LOW_OFF = eINSTANCE.getROuLongLong_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_LOW_ON = eINSTANCE.getROuLongLong_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_LONG__ALARM_TIMER_TRIG = eINSTANCE.getROuLongLong_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.ROuLongSeqImpl <em>ROu Long Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.ROuLongSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getROuLongSeq()
		 * @generated
		 */
		EClass ROU_LONG_SEQ = eINSTANCE.getROuLongSeq();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_FAULT_FAMILY = eINSTANCE.getROuLongSeq_AlarmFaultFamily();

		/**
		 * The meta object literal for the '<em><b>Alarm Fault Member</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_FAULT_MEMBER = eINSTANCE.getROuLongSeq_AlarmFaultMember();

		/**
		 * The meta object literal for the '<em><b>Alarm High Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_HIGH_OFF = eINSTANCE.getROuLongSeq_AlarmHighOff();

		/**
		 * The meta object literal for the '<em><b>Alarm High On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_HIGH_ON = eINSTANCE.getROuLongSeq_AlarmHighOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_LEVEL = eINSTANCE.getROuLongSeq_AlarmLevel();

		/**
		 * The meta object literal for the '<em><b>Alarm Low Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_LOW_OFF = eINSTANCE.getROuLongSeq_AlarmLowOff();

		/**
		 * The meta object literal for the '<em><b>Alarm Low On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_LOW_ON = eINSTANCE.getROuLongSeq_AlarmLowOn();

		/**
		 * The meta object literal for the '<em><b>Alarm Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROU_LONG_SEQ__ALARM_TIMER_TRIG = eINSTANCE.getROuLongSeq_AlarmTimerTrig();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWbooleanImpl <em>RWboolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWbooleanImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWboolean()
		 * @generated
		 */
		EClass RWBOOLEAN = eINSTANCE.getRWboolean();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWBOOLEAN__MAX_VALUE = eINSTANCE.getRWboolean_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWBOOLEAN__MIN_VALUE = eINSTANCE.getRWboolean_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWbooleanSeqImpl <em>RWboolean Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWbooleanSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWbooleanSeq()
		 * @generated
		 */
		EClass RWBOOLEAN_SEQ = eINSTANCE.getRWbooleanSeq();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWBOOLEAN_SEQ__MAX_VALUE = eINSTANCE.getRWbooleanSeq_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWBOOLEAN_SEQ__MIN_VALUE = eINSTANCE.getRWbooleanSeq_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWdoubleImpl <em>RWdouble</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWdoubleImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWdouble()
		 * @generated
		 */
		EClass RWDOUBLE = eINSTANCE.getRWdouble();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWDOUBLE__MAX_VALUE = eINSTANCE.getRWdouble_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWDOUBLE__MIN_VALUE = eINSTANCE.getRWdouble_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWdoubleSeqImpl <em>RWdouble Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWdoubleSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWdoubleSeq()
		 * @generated
		 */
		EClass RWDOUBLE_SEQ = eINSTANCE.getRWdoubleSeq();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWDOUBLE_SEQ__MAX_VALUE = eINSTANCE.getRWdoubleSeq_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWDOUBLE_SEQ__MIN_VALUE = eINSTANCE.getRWdoubleSeq_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWEnumImpl <em>RW Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWEnumImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWEnum()
		 * @generated
		 */
		EClass RW_ENUM = eINSTANCE.getRWEnum();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RW_ENUM__MAX_VALUE = eINSTANCE.getRWEnum_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RW_ENUM__MIN_VALUE = eINSTANCE.getRWEnum_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWfloatImpl <em>RWfloat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWfloatImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWfloat()
		 * @generated
		 */
		EClass RWFLOAT = eINSTANCE.getRWfloat();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWFLOAT__MAX_VALUE = eINSTANCE.getRWfloat_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWFLOAT__MIN_VALUE = eINSTANCE.getRWfloat_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWfloatSeqImpl <em>RWfloat Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWfloatSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWfloatSeq()
		 * @generated
		 */
		EClass RWFLOAT_SEQ = eINSTANCE.getRWfloatSeq();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWFLOAT_SEQ__MAX_VALUE = eINSTANCE.getRWfloatSeq_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWFLOAT_SEQ__MIN_VALUE = eINSTANCE.getRWfloatSeq_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWlongImpl <em>RWlong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWlongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWlong()
		 * @generated
		 */
		EClass RWLONG = eINSTANCE.getRWlong();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWLONG__MAX_VALUE = eINSTANCE.getRWlong_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWLONG__MIN_VALUE = eINSTANCE.getRWlong_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWlongLongImpl <em>RWlong Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWlongLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWlongLong()
		 * @generated
		 */
		EClass RWLONG_LONG = eINSTANCE.getRWlongLong();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWLONG_LONG__MAX_VALUE = eINSTANCE.getRWlongLong_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWLONG_LONG__MIN_VALUE = eINSTANCE.getRWlongLong_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWlongSeqImpl <em>RWlong Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWlongSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWlongSeq()
		 * @generated
		 */
		EClass RWLONG_SEQ = eINSTANCE.getRWlongSeq();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWLONG_SEQ__MAX_VALUE = eINSTANCE.getRWlongSeq_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWLONG_SEQ__MIN_VALUE = eINSTANCE.getRWlongSeq_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWpatternImpl <em>RWpattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWpatternImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWpattern()
		 * @generated
		 */
		EClass RWPATTERN = eINSTANCE.getRWpattern();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWstringImpl <em>RWstring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWstringImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWstring()
		 * @generated
		 */
		EClass RWSTRING = eINSTANCE.getRWstring();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWuLongImpl <em>RWu Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWuLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWuLong()
		 * @generated
		 */
		EClass RWU_LONG = eINSTANCE.getRWuLong();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWU_LONG__MAX_VALUE = eINSTANCE.getRWuLong_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWU_LONG__MIN_VALUE = eINSTANCE.getRWuLong_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWuLongLongImpl <em>RWu Long Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWuLongLongImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWuLongLong()
		 * @generated
		 */
		EClass RWU_LONG_LONG = eINSTANCE.getRWuLongLong();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWU_LONG_LONG__MAX_VALUE = eINSTANCE.getRWuLongLong_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWU_LONG_LONG__MIN_VALUE = eINSTANCE.getRWuLongLong_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.RWuLongSeqImpl <em>RWu Long Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.RWuLongSeqImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getRWuLongSeq()
		 * @generated
		 */
		EClass RWU_LONG_SEQ = eINSTANCE.getRWuLongSeq();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWU_LONG_SEQ__MAX_VALUE = eINSTANCE.getRWuLongSeq_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RWU_LONG_SEQ__MIN_VALUE = eINSTANCE.getRWuLongSeq_MinValue();

		/**
		 * The meta object literal for the '{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl <em>Typeless Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see baciCodeGen.BACIProperties.impl.TypelessPropertyImpl
		 * @see baciCodeGen.BACIProperties.impl.BACIPropertiesPackageImpl#getTypelessProperty()
		 * @generated
		 */
		EClass TYPELESS_PROPERTY = eINSTANCE.getTypelessProperty();

		/**
		 * The meta object literal for the '<em><b>Archive Max Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__ARCHIVE_MAX_INT = eINSTANCE.getTypelessProperty_ArchiveMaxInt();

		/**
		 * The meta object literal for the '<em><b>Archive Mechanism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__ARCHIVE_MECHANISM = eINSTANCE.getTypelessProperty_ArchiveMechanism();

		/**
		 * The meta object literal for the '<em><b>Archive Min Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__ARCHIVE_MIN_INT = eINSTANCE.getTypelessProperty_ArchiveMinInt();

		/**
		 * The meta object literal for the '<em><b>Archive Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__ARCHIVE_PRIORITY = eINSTANCE.getTypelessProperty_ArchivePriority();

		/**
		 * The meta object literal for the '<em><b>Archive Suppress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__ARCHIVE_SUPPRESS = eINSTANCE.getTypelessProperty_ArchiveSuppress();

		/**
		 * The meta object literal for the '<em><b>Default Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG = eINSTANCE.getTypelessProperty_DefaultTimerTrig();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__DESCRIPTION = eINSTANCE.getTypelessProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__FORMAT = eINSTANCE.getTypelessProperty_Format();

		/**
		 * The meta object literal for the '<em><b>Initialize Devio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__INITIALIZE_DEVIO = eINSTANCE.getTypelessProperty_InitializeDevio();

		/**
		 * The meta object literal for the '<em><b>Min Timer Trig</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__MIN_TIMER_TRIG = eINSTANCE.getTypelessProperty_MinTimerTrig();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__RESOLUTION = eINSTANCE.getTypelessProperty_Resolution();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPELESS_PROPERTY__UNITS = eINSTANCE.getTypelessProperty_Units();

	}

} //BACIPropertiesPackage
