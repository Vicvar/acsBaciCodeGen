/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.*;

import org.eclipse.emf.ecore.EClass;
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
public class BACIPropertiesFactoryImpl extends EFactoryImpl implements BACIPropertiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BACIPropertiesFactory init() {
		try {
			BACIPropertiesFactory theBACIPropertiesFactory = (BACIPropertiesFactory)EPackage.Registry.INSTANCE.getEFactory(BACIPropertiesPackage.eNS_URI);
			if (theBACIPropertiesFactory != null) {
				return theBACIPropertiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BACIPropertiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACIPropertiesFactoryImpl() {
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
			case BACIPropertiesPackage.CHARACTERISTIC_COMPONENT: return createCharacteristicComponent();
			case BACIPropertiesPackage.CHARACTERISTIC_MODEL: return createCharacteristicModel();
			case BACIPropertiesPackage.PBOOLEAN: return createPboolean();
			case BACIPropertiesPackage.PBOOLEAN1: return createPboolean1();
			case BACIPropertiesPackage.PBOOLEAN_SEQ: return createPbooleanSeq();
			case BACIPropertiesPackage.PBOOLEAN_SEQ1: return createPbooleanSeq1();
			case BACIPropertiesPackage.PDOUBLE: return createPdouble();
			case BACIPropertiesPackage.PDOUBLE1: return createPdouble1();
			case BACIPropertiesPackage.PDOUBLE_SEQ: return createPdoubleSeq();
			case BACIPropertiesPackage.PDOUBLE_SEQ1: return createPdoubleSeq1();
			case BACIPropertiesPackage.PENUM: return createPEnum();
			case BACIPropertiesPackage.PENUM1: return createPEnum1();
			case BACIPropertiesPackage.PFLOAT: return createPfloat();
			case BACIPropertiesPackage.PFLOAT1: return createPfloat1();
			case BACIPropertiesPackage.PFLOAT_SEQ: return createPfloatSeq();
			case BACIPropertiesPackage.PFLOAT_SEQ1: return createPfloatSeq1();
			case BACIPropertiesPackage.PLONG: return createPlong();
			case BACIPropertiesPackage.PLONG1: return createPlong1();
			case BACIPropertiesPackage.PLONG_LONG: return createPlongLong();
			case BACIPropertiesPackage.PLONG_LONG1: return createPlongLong1();
			case BACIPropertiesPackage.PLONG_SEQ: return createPlongSeq();
			case BACIPropertiesPackage.PLONG_SEQ1: return createPlongSeq1();
			case BACIPropertiesPackage.PPATTERN: return createPpattern();
			case BACIPropertiesPackage.PPATTERN1: return createPpattern1();
			case BACIPropertiesPackage.PROPERTY: return createProperty();
			case BACIPropertiesPackage.PSTRING: return createPstring();
			case BACIPropertiesPackage.PSTRING1: return createPstring1();
			case BACIPropertiesPackage.PSTRING_SEQ: return createPstringSeq();
			case BACIPropertiesPackage.PSTRING_SEQ1: return createPstringSeq1();
			case BACIPropertiesPackage.PU_LONG: return createPuLong();
			case BACIPropertiesPackage.PU_LONG1: return createPuLong1();
			case BACIPropertiesPackage.PU_LONG_LONG: return createPuLongLong();
			case BACIPropertiesPackage.PU_LONG_LONG1: return createPuLongLong1();
			case BACIPropertiesPackage.PU_LONG_SEQ: return createPuLongSeq();
			case BACIPropertiesPackage.PU_LONG_SEQ1: return createPuLongSeq1();
			case BACIPropertiesPackage.ROBOOLEAN: return createROboolean();
			case BACIPropertiesPackage.ROBOOLEAN_SEQ: return createRObooleanSeq();
			case BACIPropertiesPackage.RODOUBLE: return createROdouble();
			case BACIPropertiesPackage.RODOUBLE_SEQ: return createROdoubleSeq();
			case BACIPropertiesPackage.RO_ENUM: return createROEnum();
			case BACIPropertiesPackage.ROFLOAT: return createROfloat();
			case BACIPropertiesPackage.ROFLOAT_SEQ: return createROfloatSeq();
			case BACIPropertiesPackage.ROLONG: return createROlong();
			case BACIPropertiesPackage.ROLONG_LONG: return createROlongLong();
			case BACIPropertiesPackage.ROLONG_SEQ: return createROlongSeq();
			case BACIPropertiesPackage.ROPATTERN: return createROpattern();
			case BACIPropertiesPackage.ROSTRING: return createROstring();
			case BACIPropertiesPackage.ROSTRING_SEQ: return createROstringSeq();
			case BACIPropertiesPackage.ROU_LONG: return createROuLong();
			case BACIPropertiesPackage.ROU_LONG_LONG: return createROuLongLong();
			case BACIPropertiesPackage.ROU_LONG_SEQ: return createROuLongSeq();
			case BACIPropertiesPackage.RWBOOLEAN: return createRWboolean();
			case BACIPropertiesPackage.RWBOOLEAN_SEQ: return createRWbooleanSeq();
			case BACIPropertiesPackage.RWDOUBLE: return createRWdouble();
			case BACIPropertiesPackage.RWDOUBLE_SEQ: return createRWdoubleSeq();
			case BACIPropertiesPackage.RW_ENUM: return createRWEnum();
			case BACIPropertiesPackage.RWFLOAT: return createRWfloat();
			case BACIPropertiesPackage.RWFLOAT_SEQ: return createRWfloatSeq();
			case BACIPropertiesPackage.RWLONG: return createRWlong();
			case BACIPropertiesPackage.RWLONG_LONG: return createRWlongLong();
			case BACIPropertiesPackage.RWLONG_SEQ: return createRWlongSeq();
			case BACIPropertiesPackage.RWPATTERN: return createRWpattern();
			case BACIPropertiesPackage.RWSTRING: return createRWstring();
			case BACIPropertiesPackage.RWU_LONG: return createRWuLong();
			case BACIPropertiesPackage.RWU_LONG_LONG: return createRWuLongLong();
			case BACIPropertiesPackage.RWU_LONG_SEQ: return createRWuLongSeq();
			case BACIPropertiesPackage.TYPELESS_PROPERTY: return createTypelessProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public CharacteristicModel createCharacteristicModel() {
		CharacteristicModelImpl characteristicModel = new CharacteristicModelImpl();
		return characteristicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pboolean createPboolean() {
		PbooleanImpl pboolean = new PbooleanImpl();
		return pboolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pboolean1 createPboolean1() {
		Pboolean1Impl pboolean1 = new Pboolean1Impl();
		return pboolean1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PbooleanSeq createPbooleanSeq() {
		PbooleanSeqImpl pbooleanSeq = new PbooleanSeqImpl();
		return pbooleanSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PbooleanSeq1 createPbooleanSeq1() {
		PbooleanSeq1Impl pbooleanSeq1 = new PbooleanSeq1Impl();
		return pbooleanSeq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pdouble createPdouble() {
		PdoubleImpl pdouble = new PdoubleImpl();
		return pdouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pdouble1 createPdouble1() {
		Pdouble1Impl pdouble1 = new Pdouble1Impl();
		return pdouble1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PdoubleSeq createPdoubleSeq() {
		PdoubleSeqImpl pdoubleSeq = new PdoubleSeqImpl();
		return pdoubleSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PdoubleSeq1 createPdoubleSeq1() {
		PdoubleSeq1Impl pdoubleSeq1 = new PdoubleSeq1Impl();
		return pdoubleSeq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEnum createPEnum() {
		PEnumImpl pEnum = new PEnumImpl();
		return pEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEnum1 createPEnum1() {
		PEnum1Impl pEnum1 = new PEnum1Impl();
		return pEnum1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pfloat createPfloat() {
		PfloatImpl pfloat = new PfloatImpl();
		return pfloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pfloat1 createPfloat1() {
		Pfloat1Impl pfloat1 = new Pfloat1Impl();
		return pfloat1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfloatSeq createPfloatSeq() {
		PfloatSeqImpl pfloatSeq = new PfloatSeqImpl();
		return pfloatSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PfloatSeq1 createPfloatSeq1() {
		PfloatSeq1Impl pfloatSeq1 = new PfloatSeq1Impl();
		return pfloatSeq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plong createPlong() {
		PlongImpl plong = new PlongImpl();
		return plong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plong1 createPlong1() {
		Plong1Impl plong1 = new Plong1Impl();
		return plong1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlongLong createPlongLong() {
		PlongLongImpl plongLong = new PlongLongImpl();
		return plongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlongLong1 createPlongLong1() {
		PlongLong1Impl plongLong1 = new PlongLong1Impl();
		return plongLong1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlongSeq createPlongSeq() {
		PlongSeqImpl plongSeq = new PlongSeqImpl();
		return plongSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlongSeq1 createPlongSeq1() {
		PlongSeq1Impl plongSeq1 = new PlongSeq1Impl();
		return plongSeq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ppattern createPpattern() {
		PpatternImpl ppattern = new PpatternImpl();
		return ppattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ppattern1 createPpattern1() {
		Ppattern1Impl ppattern1 = new Ppattern1Impl();
		return ppattern1;
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
	public Pstring createPstring() {
		PstringImpl pstring = new PstringImpl();
		return pstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pstring1 createPstring1() {
		Pstring1Impl pstring1 = new Pstring1Impl();
		return pstring1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PstringSeq createPstringSeq() {
		PstringSeqImpl pstringSeq = new PstringSeqImpl();
		return pstringSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PstringSeq1 createPstringSeq1() {
		PstringSeq1Impl pstringSeq1 = new PstringSeq1Impl();
		return pstringSeq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuLong createPuLong() {
		PuLongImpl puLong = new PuLongImpl();
		return puLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuLong1 createPuLong1() {
		PuLong1Impl puLong1 = new PuLong1Impl();
		return puLong1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuLongLong createPuLongLong() {
		PuLongLongImpl puLongLong = new PuLongLongImpl();
		return puLongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuLongLong1 createPuLongLong1() {
		PuLongLong1Impl puLongLong1 = new PuLongLong1Impl();
		return puLongLong1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuLongSeq createPuLongSeq() {
		PuLongSeqImpl puLongSeq = new PuLongSeqImpl();
		return puLongSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PuLongSeq1 createPuLongSeq1() {
		PuLongSeq1Impl puLongSeq1 = new PuLongSeq1Impl();
		return puLongSeq1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROboolean createROboolean() {
		RObooleanImpl rOboolean = new RObooleanImpl();
		return rOboolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RObooleanSeq createRObooleanSeq() {
		RObooleanSeqImpl rObooleanSeq = new RObooleanSeqImpl();
		return rObooleanSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROdouble createROdouble() {
		ROdoubleImpl rOdouble = new ROdoubleImpl();
		return rOdouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROdoubleSeq createROdoubleSeq() {
		ROdoubleSeqImpl rOdoubleSeq = new ROdoubleSeqImpl();
		return rOdoubleSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROEnum createROEnum() {
		ROEnumImpl roEnum = new ROEnumImpl();
		return roEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROfloat createROfloat() {
		ROfloatImpl rOfloat = new ROfloatImpl();
		return rOfloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROfloatSeq createROfloatSeq() {
		ROfloatSeqImpl rOfloatSeq = new ROfloatSeqImpl();
		return rOfloatSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROlong createROlong() {
		ROlongImpl rOlong = new ROlongImpl();
		return rOlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROlongLong createROlongLong() {
		ROlongLongImpl rOlongLong = new ROlongLongImpl();
		return rOlongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROlongSeq createROlongSeq() {
		ROlongSeqImpl rOlongSeq = new ROlongSeqImpl();
		return rOlongSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROpattern createROpattern() {
		ROpatternImpl rOpattern = new ROpatternImpl();
		return rOpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROstring createROstring() {
		ROstringImpl rOstring = new ROstringImpl();
		return rOstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROstringSeq createROstringSeq() {
		ROstringSeqImpl rOstringSeq = new ROstringSeqImpl();
		return rOstringSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROuLong createROuLong() {
		ROuLongImpl rOuLong = new ROuLongImpl();
		return rOuLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROuLongLong createROuLongLong() {
		ROuLongLongImpl rOuLongLong = new ROuLongLongImpl();
		return rOuLongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROuLongSeq createROuLongSeq() {
		ROuLongSeqImpl rOuLongSeq = new ROuLongSeqImpl();
		return rOuLongSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWboolean createRWboolean() {
		RWbooleanImpl rWboolean = new RWbooleanImpl();
		return rWboolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWbooleanSeq createRWbooleanSeq() {
		RWbooleanSeqImpl rWbooleanSeq = new RWbooleanSeqImpl();
		return rWbooleanSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWdouble createRWdouble() {
		RWdoubleImpl rWdouble = new RWdoubleImpl();
		return rWdouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWdoubleSeq createRWdoubleSeq() {
		RWdoubleSeqImpl rWdoubleSeq = new RWdoubleSeqImpl();
		return rWdoubleSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWEnum createRWEnum() {
		RWEnumImpl rwEnum = new RWEnumImpl();
		return rwEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWfloat createRWfloat() {
		RWfloatImpl rWfloat = new RWfloatImpl();
		return rWfloat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWfloatSeq createRWfloatSeq() {
		RWfloatSeqImpl rWfloatSeq = new RWfloatSeqImpl();
		return rWfloatSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWlong createRWlong() {
		RWlongImpl rWlong = new RWlongImpl();
		return rWlong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWlongLong createRWlongLong() {
		RWlongLongImpl rWlongLong = new RWlongLongImpl();
		return rWlongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWlongSeq createRWlongSeq() {
		RWlongSeqImpl rWlongSeq = new RWlongSeqImpl();
		return rWlongSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWpattern createRWpattern() {
		RWpatternImpl rWpattern = new RWpatternImpl();
		return rWpattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWstring createRWstring() {
		RWstringImpl rWstring = new RWstringImpl();
		return rWstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWuLong createRWuLong() {
		RWuLongImpl rWuLong = new RWuLongImpl();
		return rWuLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWuLongLong createRWuLongLong() {
		RWuLongLongImpl rWuLongLong = new RWuLongLongImpl();
		return rWuLongLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWuLongSeq createRWuLongSeq() {
		RWuLongSeqImpl rWuLongSeq = new RWuLongSeqImpl();
		return rWuLongSeq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypelessProperty createTypelessProperty() {
		TypelessPropertyImpl typelessProperty = new TypelessPropertyImpl();
		return typelessProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACIPropertiesPackage getBACIPropertiesPackage() {
		return (BACIPropertiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BACIPropertiesPackage getPackage() {
		return BACIPropertiesPackage.eINSTANCE;
	}

} //BACIPropertiesFactoryImpl
