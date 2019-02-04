/**
 */
package baciCodeGen.impl;

import baciCodeGen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaciCodeGenFactoryImpl extends EFactoryImpl implements BaciCodeGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BaciCodeGenFactory init() {
		try {
			BaciCodeGenFactory theBaciCodeGenFactory = (BaciCodeGenFactory)EPackage.Registry.INSTANCE.getEFactory(BaciCodeGenPackage.eNS_URI);
			if (theBaciCodeGenFactory != null) {
				return theBaciCodeGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BaciCodeGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciCodeGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT: return createCharacteristicComponent();
			case BaciCodeGenPackage.PROPERTY: return createProperty();
			case BaciCodeGenPackage.ACTION: return createAction();
			case BaciCodeGenPackage.PARAMETER: return createParameter();
			case BaciCodeGenPackage.CHARACTERISTIC: return createCharacteristic();
			case BaciCodeGenPackage.ATTRIBUTE: return createAttribute();
			case BaciCodeGenPackage.USED_DEV_IOS: return createUsedDevIOs();
			case BaciCodeGenPackage.DEV_IO: return createDevIO();
			case BaciCodeGenPackage.READ_ARGUMENT: return createReadArgument();
			case BaciCodeGenPackage.WRITE_ARGUMENT: return createWriteArgument();
			case BaciCodeGenPackage.COMMON_ARGUMENT: return createCommonArgument();
			case BaciCodeGenPackage.USED_BACI_TYPES: return createUsedBaciTypes();
			case BaciCodeGenPackage.BACI_TYPE: return createBaciType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BaciCodeGenPackage.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case BaciCodeGenPackage.BASIC_TYPE:
				return createBasicTypeFromString(eDataType, initialValue);
			case BaciCodeGenPackage.SEQ_TYPE:
				return createSeqTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BaciCodeGenPackage.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case BaciCodeGenPackage.BASIC_TYPE:
				return convertBasicTypeToString(eDataType, instanceValue);
			case BaciCodeGenPackage.SEQ_TYPE:
				return convertSeqTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicComponent createCharacteristicComponent() {
		CharacteristicComponentImpl characteristicComponent = new CharacteristicComponentImpl();
		return characteristicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic createCharacteristic() {
		CharacteristicImpl characteristic = new CharacteristicImpl();
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedDevIOs createUsedDevIOs() {
		UsedDevIOsImpl usedDevIOs = new UsedDevIOsImpl();
		return usedDevIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevIO createDevIO() {
		DevIOImpl devIO = new DevIOImpl();
		return devIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadArgument createReadArgument() {
		ReadArgumentImpl readArgument = new ReadArgumentImpl();
		return readArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteArgument createWriteArgument() {
		WriteArgumentImpl writeArgument = new WriteArgumentImpl();
		return writeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonArgument createCommonArgument() {
		CommonArgumentImpl commonArgument = new CommonArgumentImpl();
		return commonArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedBaciTypes createUsedBaciTypes() {
		UsedBaciTypesImpl usedBaciTypes = new UsedBaciTypesImpl();
		return usedBaciTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciType createBaciType() {
		BaciTypeImpl baciType = new BaciTypeImpl();
		return baciType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType createBasicTypeFromString(EDataType eDataType, String initialValue) {
		BasicType result = BasicType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasicTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqType createSeqTypeFromString(EDataType eDataType, String initialValue) {
		SeqType result = SeqType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeqTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciCodeGenPackage getBaciCodeGenPackage() {
		return (BaciCodeGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BaciCodeGenPackage getPackage() {
		return BaciCodeGenPackage.eINSTANCE;
	}

} //BaciCodeGenFactoryImpl
