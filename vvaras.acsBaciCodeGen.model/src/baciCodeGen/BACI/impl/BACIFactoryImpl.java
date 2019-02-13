/**
 */
package baciCodeGen.BACI.impl;

import baciCodeGen.BACI.*;

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
public class BACIFactoryImpl extends EFactoryImpl implements BACIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BACIFactory init() {
		try {
			BACIFactory theBACIFactory = (BACIFactory)EPackage.Registry.INSTANCE.getEFactory(BACIPackage.eNS_URI);
			if (theBACIFactory != null) {
				return theBACIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BACIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACIFactoryImpl() {
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
			case BACIPackage.CHARACTERISTIC_COMPONENT: return createCharacteristicComponent();
			case BACIPackage.CHARACTERISTIC_MODEL: return createCharacteristicModel();
			case BACIPackage.PBOOLEAN: return createPboolean();
			case BACIPackage.PBOOLEAN1: return createPboolean1();
			case BACIPackage.PBOOLEAN_SEQ: return createPbooleanSeq();
			case BACIPackage.PBOOLEAN_SEQ1: return createPbooleanSeq1();
			case BACIPackage.PDOUBLE: return createPdouble();
			case BACIPackage.PDOUBLE1: return createPdouble1();
			case BACIPackage.PDOUBLE_SEQ: return createPdoubleSeq();
			case BACIPackage.PDOUBLE_SEQ1: return createPdoubleSeq1();
			case BACIPackage.PENUM: return createPEnum();
			case BACIPackage.PENUM1: return createPEnum1();
			case BACIPackage.PFLOAT: return createPfloat();
			case BACIPackage.PFLOAT1: return createPfloat1();
			case BACIPackage.PFLOAT_SEQ: return createPfloatSeq();
			case BACIPackage.PFLOAT_SEQ1: return createPfloatSeq1();
			case BACIPackage.PLONG: return createPlong();
			case BACIPackage.PLONG1: return createPlong1();
			case BACIPackage.PLONG_LONG: return createPlongLong();
			case BACIPackage.PLONG_LONG1: return createPlongLong1();
			case BACIPackage.PLONG_SEQ: return createPlongSeq();
			case BACIPackage.PLONG_SEQ1: return createPlongSeq1();
			case BACIPackage.PPATTERN: return createPpattern();
			case BACIPackage.PPATTERN1: return createPpattern1();
			case BACIPackage.PROPERTY: return createProperty();
			case BACIPackage.PSTRING: return createPstring();
			case BACIPackage.PSTRING1: return createPstring1();
			case BACIPackage.PSTRING_SEQ: return createPstringSeq();
			case BACIPackage.PSTRING_SEQ1: return createPstringSeq1();
			case BACIPackage.PU_LONG: return createPuLong();
			case BACIPackage.PU_LONG1: return createPuLong1();
			case BACIPackage.PU_LONG_LONG: return createPuLongLong();
			case BACIPackage.PU_LONG_LONG1: return createPuLongLong1();
			case BACIPackage.PU_LONG_SEQ: return createPuLongSeq();
			case BACIPackage.PU_LONG_SEQ1: return createPuLongSeq1();
			case BACIPackage.ROBOOLEAN: return createROboolean();
			case BACIPackage.ROBOOLEAN_SEQ: return createRObooleanSeq();
			case BACIPackage.RODOUBLE: return createROdouble();
			case BACIPackage.RODOUBLE_SEQ: return createROdoubleSeq();
			case BACIPackage.RO_ENUM: return createROEnum();
			case BACIPackage.ROFLOAT: return createROfloat();
			case BACIPackage.ROFLOAT_SEQ: return createROfloatSeq();
			case BACIPackage.ROLONG: return createROlong();
			case BACIPackage.ROLONG_LONG: return createROlongLong();
			case BACIPackage.ROLONG_SEQ: return createROlongSeq();
			case BACIPackage.ROPATTERN: return createROpattern();
			case BACIPackage.ROSTRING: return createROstring();
			case BACIPackage.ROSTRING_SEQ: return createROstringSeq();
			case BACIPackage.ROU_LONG: return createROuLong();
			case BACIPackage.ROU_LONG_LONG: return createROuLongLong();
			case BACIPackage.ROU_LONG_SEQ: return createROuLongSeq();
			case BACIPackage.RWBOOLEAN: return createRWboolean();
			case BACIPackage.RWBOOLEAN_SEQ: return createRWbooleanSeq();
			case BACIPackage.RWDOUBLE: return createRWdouble();
			case BACIPackage.RWDOUBLE_SEQ: return createRWdoubleSeq();
			case BACIPackage.RW_ENUM: return createRWEnum();
			case BACIPackage.RWFLOAT: return createRWfloat();
			case BACIPackage.RWFLOAT_SEQ: return createRWfloatSeq();
			case BACIPackage.RWLONG: return createRWlong();
			case BACIPackage.RWLONG_LONG: return createRWlongLong();
			case BACIPackage.RWLONG_SEQ: return createRWlongSeq();
			case BACIPackage.RWPATTERN: return createRWpattern();
			case BACIPackage.RWSTRING: return createRWstring();
			case BACIPackage.RWU_LONG: return createRWuLong();
			case BACIPackage.RWU_LONG_LONG: return createRWuLongLong();
			case BACIPackage.RWU_LONG_SEQ: return createRWuLongSeq();
			case BACIPackage.TYPELESS_PROPERTY: return createTypelessProperty();
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
	public BACIPackage getBACIPackage() {
		return (BACIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BACIPackage getPackage() {
		return BACIPackage.eINSTANCE;
	}

} //BACIFactoryImpl
