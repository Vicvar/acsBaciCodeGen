/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesFactory;
import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.CharacteristicComponent;
import baciCodeGen.BACIProperties.CharacteristicModel;
import baciCodeGen.BACIProperties.PEnum;
import baciCodeGen.BACIProperties.PEnum1;
import baciCodeGen.BACIProperties.Pboolean;
import baciCodeGen.BACIProperties.Pboolean1;
import baciCodeGen.BACIProperties.PbooleanSeq;
import baciCodeGen.BACIProperties.PbooleanSeq1;
import baciCodeGen.BACIProperties.Pdouble;
import baciCodeGen.BACIProperties.Pdouble1;
import baciCodeGen.BACIProperties.PdoubleSeq;
import baciCodeGen.BACIProperties.PdoubleSeq1;
import baciCodeGen.BACIProperties.Pfloat;
import baciCodeGen.BACIProperties.Pfloat1;
import baciCodeGen.BACIProperties.PfloatSeq;
import baciCodeGen.BACIProperties.PfloatSeq1;
import baciCodeGen.BACIProperties.Plong;
import baciCodeGen.BACIProperties.Plong1;
import baciCodeGen.BACIProperties.PlongLong;
import baciCodeGen.BACIProperties.PlongLong1;
import baciCodeGen.BACIProperties.PlongSeq;
import baciCodeGen.BACIProperties.PlongSeq1;
import baciCodeGen.BACIProperties.Ppattern;
import baciCodeGen.BACIProperties.Ppattern1;
import baciCodeGen.BACIProperties.Property;
import baciCodeGen.BACIProperties.Pstring;
import baciCodeGen.BACIProperties.Pstring1;
import baciCodeGen.BACIProperties.PstringSeq;
import baciCodeGen.BACIProperties.PstringSeq1;
import baciCodeGen.BACIProperties.PuLong;
import baciCodeGen.BACIProperties.PuLong1;
import baciCodeGen.BACIProperties.PuLongLong;
import baciCodeGen.BACIProperties.PuLongLong1;
import baciCodeGen.BACIProperties.PuLongSeq;
import baciCodeGen.BACIProperties.PuLongSeq1;
import baciCodeGen.BACIProperties.ROEnum;
import baciCodeGen.BACIProperties.ROboolean;
import baciCodeGen.BACIProperties.RObooleanSeq;
import baciCodeGen.BACIProperties.ROdouble;
import baciCodeGen.BACIProperties.ROdoubleSeq;
import baciCodeGen.BACIProperties.ROfloat;
import baciCodeGen.BACIProperties.ROfloatSeq;
import baciCodeGen.BACIProperties.ROlong;
import baciCodeGen.BACIProperties.ROlongLong;
import baciCodeGen.BACIProperties.ROlongSeq;
import baciCodeGen.BACIProperties.ROpattern;
import baciCodeGen.BACIProperties.ROstring;
import baciCodeGen.BACIProperties.ROstringSeq;
import baciCodeGen.BACIProperties.ROuLong;
import baciCodeGen.BACIProperties.ROuLongLong;
import baciCodeGen.BACIProperties.ROuLongSeq;
import baciCodeGen.BACIProperties.RWEnum;
import baciCodeGen.BACIProperties.RWboolean;
import baciCodeGen.BACIProperties.RWbooleanSeq;
import baciCodeGen.BACIProperties.RWdouble;
import baciCodeGen.BACIProperties.RWdoubleSeq;
import baciCodeGen.BACIProperties.RWfloat;
import baciCodeGen.BACIProperties.RWfloatSeq;
import baciCodeGen.BACIProperties.RWlong;
import baciCodeGen.BACIProperties.RWlongLong;
import baciCodeGen.BACIProperties.RWlongSeq;
import baciCodeGen.BACIProperties.RWpattern;
import baciCodeGen.BACIProperties.RWstring;
import baciCodeGen.BACIProperties.RWuLong;
import baciCodeGen.BACIProperties.RWuLongLong;
import baciCodeGen.BACIProperties.RWuLongSeq;
import baciCodeGen.BACIProperties.TypelessProperty;

import baciCodeGen.BaciCodeGenPackage;

import baciCodeGen.impl.BaciCodeGenPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BACIPropertiesPackageImpl extends EPackageImpl implements BACIPropertiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characteristicModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pbooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pboolean1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pbooleanSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pbooleanSeq1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdouble1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdoubleSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdoubleSeq1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEnum1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfloat1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfloatSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pfloatSeq1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plong1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plongLong1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plongSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plongSeq1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ppattern1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pstring1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pstringSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pstringSeq1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puLong1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puLongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puLongLong1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puLongSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puLongSeq1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rObooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rObooleanSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOdoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOdoubleSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOfloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOfloatSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOlongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOlongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOlongSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOpatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOstringSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOuLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOuLongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rOuLongSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWbooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWbooleanSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWdoubleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWdoubleSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rwEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWfloatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWfloatSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWlongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWlongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWlongSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWpatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWuLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWuLongLongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rWuLongSeqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typelessPropertyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BACIPropertiesPackageImpl() {
		super(eNS_URI, BACIPropertiesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BACIPropertiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BACIPropertiesPackage init() {
		if (isInited) return (BACIPropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(BACIPropertiesPackage.eNS_URI);

		// Obtain or create and register package
		BACIPropertiesPackageImpl theBACIPropertiesPackage = (BACIPropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BACIPropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BACIPropertiesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BaciCodeGenPackageImpl theBaciCodeGenPackage = (BaciCodeGenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BaciCodeGenPackage.eNS_URI) instanceof BaciCodeGenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BaciCodeGenPackage.eNS_URI) : BaciCodeGenPackage.eINSTANCE);

		// Create package meta-data objects
		theBACIPropertiesPackage.createPackageContents();
		theBaciCodeGenPackage.createPackageContents();

		// Initialize created meta-data
		theBACIPropertiesPackage.initializePackageContents();
		theBaciCodeGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBACIPropertiesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BACIPropertiesPackage.eNS_URI, theBACIPropertiesPackage);
		return theBACIPropertiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicComponent() {
		return characteristicComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicComponent_ActionThreadStackSize() {
		return (EAttribute)characteristicComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicComponent_MonitoringThreadStackSize() {
		return (EAttribute)characteristicComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicComponent_RecentCommand() {
		return (EAttribute)characteristicComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacteristicComponent_RecentTimeStamp() {
		return (EAttribute)characteristicComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacteristicModel() {
		return characteristicModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPboolean() {
		return pbooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPboolean1() {
		return pboolean1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_ArchiveDelta() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_ArchiveDeltaPercent() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_DefaultValue() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_GraphMax() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_GraphMin() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_MinDeltaTrig() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPboolean1_MinStep() {
		return (EAttribute)pboolean1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPbooleanSeq() {
		return pbooleanSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPbooleanSeq1() {
		return pbooleanSeq1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_ArchiveDelta() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_ArchiveDeltaPercent() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_DefaultValue() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_GraphMax() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_GraphMin() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_MinDeltaTrig() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPbooleanSeq1_MinStep() {
		return (EAttribute)pbooleanSeq1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPdouble() {
		return pdoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPdouble1() {
		return pdouble1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_ArchiveDelta() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_ArchiveDeltaPercent() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_DefaultValue() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_GraphMax() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_GraphMin() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_MinDeltaTrig() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdouble1_MinStep() {
		return (EAttribute)pdouble1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPdoubleSeq() {
		return pdoubleSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPdoubleSeq1() {
		return pdoubleSeq1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_ArchiveDelta() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_ArchiveDeltaPercent() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_DefaultValue() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_GraphMax() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_GraphMin() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_MinDeltaTrig() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPdoubleSeq1_MinStep() {
		return (EAttribute)pdoubleSeq1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPEnum() {
		return pEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPEnum1() {
		return pEnum1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_ArchiveDelta() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_ArchiveDeltaPercent() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_Condition() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_DefaultValue() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_GraphMax() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_GraphMin() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPEnum1_StatesDescription() {
		return (EAttribute)pEnum1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPfloat() {
		return pfloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPfloat1() {
		return pfloat1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_ArchiveDelta() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_ArchiveDeltaPercent() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_DefaultValue() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_GraphMax() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_GraphMin() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_MinDeltaTrig() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloat1_MinStep() {
		return (EAttribute)pfloat1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPfloatSeq() {
		return pfloatSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPfloatSeq1() {
		return pfloatSeq1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_ArchiveDelta() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_ArchiveDeltaPercent() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_DefaultValue() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_GraphMax() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_GraphMin() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_MinDeltaTrig() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPfloatSeq1_MinStep() {
		return (EAttribute)pfloatSeq1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlong() {
		return plongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlong1() {
		return plong1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_ArchiveDelta() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_ArchiveDeltaPercent() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_DefaultValue() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_GraphMax() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_GraphMin() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_MinDeltaTrig() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlong1_MinStep() {
		return (EAttribute)plong1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlongLong() {
		return plongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlongLong1() {
		return plongLong1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_ArchiveDelta() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_ArchiveDeltaPercent() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_DefaultValue() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_GraphMax() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_GraphMin() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_MinDeltaTrig() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongLong1_MinStep() {
		return (EAttribute)plongLong1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlongSeq() {
		return plongSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlongSeq1() {
		return plongSeq1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_ArchiveDelta() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_ArchiveDeltaPercent() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_DefaultValue() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_GraphMax() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_GraphMin() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_MinDeltaTrig() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlongSeq1_MinStep() {
		return (EAttribute)plongSeq1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPpattern() {
		return ppatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPpattern1() {
		return ppattern1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_ArchiveDelta() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_ArchiveDeltaPercent() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_BitDescription() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_DefaultValue() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_MinStep() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_WhenCleared() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPpattern1_WhenSet() {
		return (EAttribute)ppattern1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPstring() {
		return pstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPstring1() {
		return pstring1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPstring1_ArchiveDelta() {
		return (EAttribute)pstring1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPstring1_ArchiveDeltaPercent() {
		return (EAttribute)pstring1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPstring1_DefaultValue() {
		return (EAttribute)pstring1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPstringSeq() {
		return pstringSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPstringSeq1() {
		return pstringSeq1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPstringSeq1_ArchiveDelta() {
		return (EAttribute)pstringSeq1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPstringSeq1_ArchiveDeltaPercent() {
		return (EAttribute)pstringSeq1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPstringSeq1_DefaultValue() {
		return (EAttribute)pstringSeq1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuLong() {
		return puLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuLong1() {
		return puLong1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_ArchiveDelta() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_ArchiveDeltaPercent() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_DefaultValue() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_GraphMax() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_GraphMin() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_MinDeltaTrig() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLong1_MinStep() {
		return (EAttribute)puLong1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuLongLong() {
		return puLongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuLongLong1() {
		return puLongLong1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_ArchiveDelta() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_ArchiveDeltaPercent() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_DefaultValue() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_GraphMax() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_GraphMin() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_MinDeltaTrig() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongLong1_MinStep() {
		return (EAttribute)puLongLong1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuLongSeq() {
		return puLongSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPuLongSeq1() {
		return puLongSeq1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_ArchiveDelta() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_ArchiveDeltaPercent() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_DefaultValue() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_GraphMax() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_GraphMin() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_MinDeltaTrig() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPuLongSeq1_MinStep() {
		return (EAttribute)puLongSeq1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROboolean() {
		return rObooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROboolean_AlarmFaultFamily() {
		return (EAttribute)rObooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROboolean_AlarmFaultMember() {
		return (EAttribute)rObooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROboolean_AlarmLevel() {
		return (EAttribute)rObooleanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROboolean_AlarmOn() {
		return (EAttribute)rObooleanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROboolean_AlarmTimerTrig() {
		return (EAttribute)rObooleanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRObooleanSeq() {
		return rObooleanSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRObooleanSeq_AlarmFaultFamily() {
		return (EAttribute)rObooleanSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRObooleanSeq_AlarmFaultMember() {
		return (EAttribute)rObooleanSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRObooleanSeq_AlarmLevel() {
		return (EAttribute)rObooleanSeqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRObooleanSeq_AlarmOn() {
		return (EAttribute)rObooleanSeqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRObooleanSeq_AlarmTimerTrig() {
		return (EAttribute)rObooleanSeqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROdouble() {
		return rOdoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmFaultFamily() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmFaultMember() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmHighOff() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmHighOn() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmLevel() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmLowOff() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmLowOn() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdouble_AlarmTimerTrig() {
		return (EAttribute)rOdoubleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROdoubleSeq() {
		return rOdoubleSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmFaultFamily() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmFaultMember() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmHighOff() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmHighOn() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmLevel() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmLowOff() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmLowOn() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROdoubleSeq_AlarmTimerTrig() {
		return (EAttribute)rOdoubleSeqEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROEnum() {
		return roEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROEnum_AlarmFaultFamily() {
		return (EAttribute)roEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROEnum_AlarmFaultMember() {
		return (EAttribute)roEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROEnum_AlarmLevel() {
		return (EAttribute)roEnumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROEnum_AlarmOff() {
		return (EAttribute)roEnumEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROEnum_AlarmOn() {
		return (EAttribute)roEnumEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROEnum_AlarmTimerTrig() {
		return (EAttribute)roEnumEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROfloat() {
		return rOfloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmFaultFamily() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmFaultMember() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmHighOff() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmHighOn() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmLevel() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmLowOff() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmLowOn() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloat_AlarmTimerTrig() {
		return (EAttribute)rOfloatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROfloatSeq() {
		return rOfloatSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmFaultFamily() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmFaultMember() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmHighOff() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmHighOn() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmLevel() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmLowOff() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmLowOn() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROfloatSeq_AlarmTimerTrig() {
		return (EAttribute)rOfloatSeqEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROlong() {
		return rOlongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmFaultFamily() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmFaultMember() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmHighOff() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmHighOn() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmLevel() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmLowOff() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmLowOn() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlong_AlarmTimerTrig() {
		return (EAttribute)rOlongEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROlongLong() {
		return rOlongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmFaultFamily() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmFaultMember() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmHighOff() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmHighOn() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmLevel() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmLowOff() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmLowOn() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongLong_AlarmTimerTrig() {
		return (EAttribute)rOlongLongEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROlongSeq() {
		return rOlongSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmFaultFamily() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmFaultMember() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmHighOff() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmHighOn() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmLevel() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmLowOff() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmLowOn() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROlongSeq_AlarmTimerTrig() {
		return (EAttribute)rOlongSeqEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROpattern() {
		return rOpatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROpattern_AlarmFaultFamily() {
		return (EAttribute)rOpatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROpattern_AlarmFaultMember() {
		return (EAttribute)rOpatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROpattern_AlarmLevel() {
		return (EAttribute)rOpatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROpattern_AlarmMask() {
		return (EAttribute)rOpatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROpattern_AlarmTimerTrig() {
		return (EAttribute)rOpatternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROpattern_AlarmTrigger() {
		return (EAttribute)rOpatternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROstring() {
		return rOstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROstring_AlarmFaultFamily() {
		return (EAttribute)rOstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROstring_AlarmFaultMember() {
		return (EAttribute)rOstringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROstring_AlarmLevel() {
		return (EAttribute)rOstringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROstring_AlarmTimerTrig() {
		return (EAttribute)rOstringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROstringSeq() {
		return rOstringSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROuLong() {
		return rOuLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmFaultFamily() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmFaultMember() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmHighOff() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmHighOn() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmLevel() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmLowOff() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmLowOn() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLong_AlarmTimerTrig() {
		return (EAttribute)rOuLongEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROuLongLong() {
		return rOuLongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmFaultFamily() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmFaultMember() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmHighOff() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmHighOn() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmLevel() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmLowOff() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmLowOn() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongLong_AlarmTimerTrig() {
		return (EAttribute)rOuLongLongEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROuLongSeq() {
		return rOuLongSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmFaultFamily() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmFaultMember() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmHighOff() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmHighOn() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmLevel() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmLowOff() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmLowOn() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getROuLongSeq_AlarmTimerTrig() {
		return (EAttribute)rOuLongSeqEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWboolean() {
		return rWbooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWboolean_MaxValue() {
		return (EAttribute)rWbooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWboolean_MinValue() {
		return (EAttribute)rWbooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWbooleanSeq() {
		return rWbooleanSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWbooleanSeq_MaxValue() {
		return (EAttribute)rWbooleanSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWbooleanSeq_MinValue() {
		return (EAttribute)rWbooleanSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWdouble() {
		return rWdoubleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWdouble_MaxValue() {
		return (EAttribute)rWdoubleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWdouble_MinValue() {
		return (EAttribute)rWdoubleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWdoubleSeq() {
		return rWdoubleSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWdoubleSeq_MaxValue() {
		return (EAttribute)rWdoubleSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWdoubleSeq_MinValue() {
		return (EAttribute)rWdoubleSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWEnum() {
		return rwEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWEnum_MaxValue() {
		return (EAttribute)rwEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWEnum_MinValue() {
		return (EAttribute)rwEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWfloat() {
		return rWfloatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWfloat_MaxValue() {
		return (EAttribute)rWfloatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWfloat_MinValue() {
		return (EAttribute)rWfloatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWfloatSeq() {
		return rWfloatSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWfloatSeq_MaxValue() {
		return (EAttribute)rWfloatSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWfloatSeq_MinValue() {
		return (EAttribute)rWfloatSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWlong() {
		return rWlongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWlong_MaxValue() {
		return (EAttribute)rWlongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWlong_MinValue() {
		return (EAttribute)rWlongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWlongLong() {
		return rWlongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWlongLong_MaxValue() {
		return (EAttribute)rWlongLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWlongLong_MinValue() {
		return (EAttribute)rWlongLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWlongSeq() {
		return rWlongSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWlongSeq_MaxValue() {
		return (EAttribute)rWlongSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWlongSeq_MinValue() {
		return (EAttribute)rWlongSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWpattern() {
		return rWpatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWstring() {
		return rWstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWuLong() {
		return rWuLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWuLong_MaxValue() {
		return (EAttribute)rWuLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWuLong_MinValue() {
		return (EAttribute)rWuLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWuLongLong() {
		return rWuLongLongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWuLongLong_MaxValue() {
		return (EAttribute)rWuLongLongEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWuLongLong_MinValue() {
		return (EAttribute)rWuLongLongEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRWuLongSeq() {
		return rWuLongSeqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWuLongSeq_MaxValue() {
		return (EAttribute)rWuLongSeqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRWuLongSeq_MinValue() {
		return (EAttribute)rWuLongSeqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypelessProperty() {
		return typelessPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_ArchiveMaxInt() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_ArchiveMechanism() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_ArchiveMinInt() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_ArchivePriority() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_ArchiveSuppress() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_DefaultTimerTrig() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_Description() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_Format() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_InitializeDevio() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_MinTimerTrig() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_Resolution() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypelessProperty_Units() {
		return (EAttribute)typelessPropertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACIPropertiesFactory getBACIPropertiesFactory() {
		return (BACIPropertiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		characteristicComponentEClass = createEClass(CHARACTERISTIC_COMPONENT);
		createEAttribute(characteristicComponentEClass, CHARACTERISTIC_COMPONENT__ACTION_THREAD_STACK_SIZE);
		createEAttribute(characteristicComponentEClass, CHARACTERISTIC_COMPONENT__MONITORING_THREAD_STACK_SIZE);
		createEAttribute(characteristicComponentEClass, CHARACTERISTIC_COMPONENT__RECENT_COMMAND);
		createEAttribute(characteristicComponentEClass, CHARACTERISTIC_COMPONENT__RECENT_TIME_STAMP);

		characteristicModelEClass = createEClass(CHARACTERISTIC_MODEL);

		pbooleanEClass = createEClass(PBOOLEAN);

		pboolean1EClass = createEClass(PBOOLEAN1);
		createEAttribute(pboolean1EClass, PBOOLEAN1__ARCHIVE_DELTA);
		createEAttribute(pboolean1EClass, PBOOLEAN1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pboolean1EClass, PBOOLEAN1__DEFAULT_VALUE);
		createEAttribute(pboolean1EClass, PBOOLEAN1__GRAPH_MAX);
		createEAttribute(pboolean1EClass, PBOOLEAN1__GRAPH_MIN);
		createEAttribute(pboolean1EClass, PBOOLEAN1__MIN_DELTA_TRIG);
		createEAttribute(pboolean1EClass, PBOOLEAN1__MIN_STEP);

		pbooleanSeqEClass = createEClass(PBOOLEAN_SEQ);

		pbooleanSeq1EClass = createEClass(PBOOLEAN_SEQ1);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__ARCHIVE_DELTA);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__DEFAULT_VALUE);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__GRAPH_MAX);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__GRAPH_MIN);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__MIN_DELTA_TRIG);
		createEAttribute(pbooleanSeq1EClass, PBOOLEAN_SEQ1__MIN_STEP);

		pdoubleEClass = createEClass(PDOUBLE);

		pdouble1EClass = createEClass(PDOUBLE1);
		createEAttribute(pdouble1EClass, PDOUBLE1__ARCHIVE_DELTA);
		createEAttribute(pdouble1EClass, PDOUBLE1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pdouble1EClass, PDOUBLE1__DEFAULT_VALUE);
		createEAttribute(pdouble1EClass, PDOUBLE1__GRAPH_MAX);
		createEAttribute(pdouble1EClass, PDOUBLE1__GRAPH_MIN);
		createEAttribute(pdouble1EClass, PDOUBLE1__MIN_DELTA_TRIG);
		createEAttribute(pdouble1EClass, PDOUBLE1__MIN_STEP);

		pdoubleSeqEClass = createEClass(PDOUBLE_SEQ);

		pdoubleSeq1EClass = createEClass(PDOUBLE_SEQ1);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__ARCHIVE_DELTA);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__DEFAULT_VALUE);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__GRAPH_MAX);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__GRAPH_MIN);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__MIN_DELTA_TRIG);
		createEAttribute(pdoubleSeq1EClass, PDOUBLE_SEQ1__MIN_STEP);

		pEnumEClass = createEClass(PENUM);

		pEnum1EClass = createEClass(PENUM1);
		createEAttribute(pEnum1EClass, PENUM1__ARCHIVE_DELTA);
		createEAttribute(pEnum1EClass, PENUM1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pEnum1EClass, PENUM1__CONDITION);
		createEAttribute(pEnum1EClass, PENUM1__DEFAULT_VALUE);
		createEAttribute(pEnum1EClass, PENUM1__GRAPH_MAX);
		createEAttribute(pEnum1EClass, PENUM1__GRAPH_MIN);
		createEAttribute(pEnum1EClass, PENUM1__STATES_DESCRIPTION);

		pfloatEClass = createEClass(PFLOAT);

		pfloat1EClass = createEClass(PFLOAT1);
		createEAttribute(pfloat1EClass, PFLOAT1__ARCHIVE_DELTA);
		createEAttribute(pfloat1EClass, PFLOAT1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pfloat1EClass, PFLOAT1__DEFAULT_VALUE);
		createEAttribute(pfloat1EClass, PFLOAT1__GRAPH_MAX);
		createEAttribute(pfloat1EClass, PFLOAT1__GRAPH_MIN);
		createEAttribute(pfloat1EClass, PFLOAT1__MIN_DELTA_TRIG);
		createEAttribute(pfloat1EClass, PFLOAT1__MIN_STEP);

		pfloatSeqEClass = createEClass(PFLOAT_SEQ);

		pfloatSeq1EClass = createEClass(PFLOAT_SEQ1);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__ARCHIVE_DELTA);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__DEFAULT_VALUE);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__GRAPH_MAX);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__GRAPH_MIN);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__MIN_DELTA_TRIG);
		createEAttribute(pfloatSeq1EClass, PFLOAT_SEQ1__MIN_STEP);

		plongEClass = createEClass(PLONG);

		plong1EClass = createEClass(PLONG1);
		createEAttribute(plong1EClass, PLONG1__ARCHIVE_DELTA);
		createEAttribute(plong1EClass, PLONG1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(plong1EClass, PLONG1__DEFAULT_VALUE);
		createEAttribute(plong1EClass, PLONG1__GRAPH_MAX);
		createEAttribute(plong1EClass, PLONG1__GRAPH_MIN);
		createEAttribute(plong1EClass, PLONG1__MIN_DELTA_TRIG);
		createEAttribute(plong1EClass, PLONG1__MIN_STEP);

		plongLongEClass = createEClass(PLONG_LONG);

		plongLong1EClass = createEClass(PLONG_LONG1);
		createEAttribute(plongLong1EClass, PLONG_LONG1__ARCHIVE_DELTA);
		createEAttribute(plongLong1EClass, PLONG_LONG1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(plongLong1EClass, PLONG_LONG1__DEFAULT_VALUE);
		createEAttribute(plongLong1EClass, PLONG_LONG1__GRAPH_MAX);
		createEAttribute(plongLong1EClass, PLONG_LONG1__GRAPH_MIN);
		createEAttribute(plongLong1EClass, PLONG_LONG1__MIN_DELTA_TRIG);
		createEAttribute(plongLong1EClass, PLONG_LONG1__MIN_STEP);

		plongSeqEClass = createEClass(PLONG_SEQ);

		plongSeq1EClass = createEClass(PLONG_SEQ1);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__ARCHIVE_DELTA);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__DEFAULT_VALUE);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__GRAPH_MAX);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__GRAPH_MIN);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__MIN_DELTA_TRIG);
		createEAttribute(plongSeq1EClass, PLONG_SEQ1__MIN_STEP);

		ppatternEClass = createEClass(PPATTERN);

		ppattern1EClass = createEClass(PPATTERN1);
		createEAttribute(ppattern1EClass, PPATTERN1__ARCHIVE_DELTA);
		createEAttribute(ppattern1EClass, PPATTERN1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(ppattern1EClass, PPATTERN1__BIT_DESCRIPTION);
		createEAttribute(ppattern1EClass, PPATTERN1__DEFAULT_VALUE);
		createEAttribute(ppattern1EClass, PPATTERN1__MIN_STEP);
		createEAttribute(ppattern1EClass, PPATTERN1__WHEN_CLEARED);
		createEAttribute(ppattern1EClass, PPATTERN1__WHEN_SET);

		propertyEClass = createEClass(PROPERTY);

		pstringEClass = createEClass(PSTRING);

		pstring1EClass = createEClass(PSTRING1);
		createEAttribute(pstring1EClass, PSTRING1__ARCHIVE_DELTA);
		createEAttribute(pstring1EClass, PSTRING1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pstring1EClass, PSTRING1__DEFAULT_VALUE);

		pstringSeqEClass = createEClass(PSTRING_SEQ);

		pstringSeq1EClass = createEClass(PSTRING_SEQ1);
		createEAttribute(pstringSeq1EClass, PSTRING_SEQ1__ARCHIVE_DELTA);
		createEAttribute(pstringSeq1EClass, PSTRING_SEQ1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(pstringSeq1EClass, PSTRING_SEQ1__DEFAULT_VALUE);

		puLongEClass = createEClass(PU_LONG);

		puLong1EClass = createEClass(PU_LONG1);
		createEAttribute(puLong1EClass, PU_LONG1__ARCHIVE_DELTA);
		createEAttribute(puLong1EClass, PU_LONG1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(puLong1EClass, PU_LONG1__DEFAULT_VALUE);
		createEAttribute(puLong1EClass, PU_LONG1__GRAPH_MAX);
		createEAttribute(puLong1EClass, PU_LONG1__GRAPH_MIN);
		createEAttribute(puLong1EClass, PU_LONG1__MIN_DELTA_TRIG);
		createEAttribute(puLong1EClass, PU_LONG1__MIN_STEP);

		puLongLongEClass = createEClass(PU_LONG_LONG);

		puLongLong1EClass = createEClass(PU_LONG_LONG1);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__ARCHIVE_DELTA);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__DEFAULT_VALUE);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__GRAPH_MAX);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__GRAPH_MIN);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__MIN_DELTA_TRIG);
		createEAttribute(puLongLong1EClass, PU_LONG_LONG1__MIN_STEP);

		puLongSeqEClass = createEClass(PU_LONG_SEQ);

		puLongSeq1EClass = createEClass(PU_LONG_SEQ1);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__ARCHIVE_DELTA);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__ARCHIVE_DELTA_PERCENT);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__DEFAULT_VALUE);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__GRAPH_MAX);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__GRAPH_MIN);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__MIN_DELTA_TRIG);
		createEAttribute(puLongSeq1EClass, PU_LONG_SEQ1__MIN_STEP);

		rObooleanEClass = createEClass(ROBOOLEAN);
		createEAttribute(rObooleanEClass, ROBOOLEAN__ALARM_FAULT_FAMILY);
		createEAttribute(rObooleanEClass, ROBOOLEAN__ALARM_FAULT_MEMBER);
		createEAttribute(rObooleanEClass, ROBOOLEAN__ALARM_LEVEL);
		createEAttribute(rObooleanEClass, ROBOOLEAN__ALARM_ON);
		createEAttribute(rObooleanEClass, ROBOOLEAN__ALARM_TIMER_TRIG);

		rObooleanSeqEClass = createEClass(ROBOOLEAN_SEQ);
		createEAttribute(rObooleanSeqEClass, ROBOOLEAN_SEQ__ALARM_FAULT_FAMILY);
		createEAttribute(rObooleanSeqEClass, ROBOOLEAN_SEQ__ALARM_FAULT_MEMBER);
		createEAttribute(rObooleanSeqEClass, ROBOOLEAN_SEQ__ALARM_LEVEL);
		createEAttribute(rObooleanSeqEClass, ROBOOLEAN_SEQ__ALARM_ON);
		createEAttribute(rObooleanSeqEClass, ROBOOLEAN_SEQ__ALARM_TIMER_TRIG);

		rOdoubleEClass = createEClass(RODOUBLE);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_FAULT_FAMILY);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_FAULT_MEMBER);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_HIGH_OFF);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_HIGH_ON);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_LEVEL);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_LOW_OFF);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_LOW_ON);
		createEAttribute(rOdoubleEClass, RODOUBLE__ALARM_TIMER_TRIG);

		rOdoubleSeqEClass = createEClass(RODOUBLE_SEQ);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_FAULT_FAMILY);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_FAULT_MEMBER);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_HIGH_OFF);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_HIGH_ON);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_LEVEL);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_LOW_OFF);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_LOW_ON);
		createEAttribute(rOdoubleSeqEClass, RODOUBLE_SEQ__ALARM_TIMER_TRIG);

		roEnumEClass = createEClass(RO_ENUM);
		createEAttribute(roEnumEClass, RO_ENUM__ALARM_FAULT_FAMILY);
		createEAttribute(roEnumEClass, RO_ENUM__ALARM_FAULT_MEMBER);
		createEAttribute(roEnumEClass, RO_ENUM__ALARM_LEVEL);
		createEAttribute(roEnumEClass, RO_ENUM__ALARM_OFF);
		createEAttribute(roEnumEClass, RO_ENUM__ALARM_ON);
		createEAttribute(roEnumEClass, RO_ENUM__ALARM_TIMER_TRIG);

		rOfloatEClass = createEClass(ROFLOAT);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_FAULT_FAMILY);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_FAULT_MEMBER);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_HIGH_OFF);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_HIGH_ON);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_LEVEL);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_LOW_OFF);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_LOW_ON);
		createEAttribute(rOfloatEClass, ROFLOAT__ALARM_TIMER_TRIG);

		rOfloatSeqEClass = createEClass(ROFLOAT_SEQ);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_FAULT_FAMILY);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_FAULT_MEMBER);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_HIGH_OFF);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_HIGH_ON);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_LEVEL);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_LOW_OFF);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_LOW_ON);
		createEAttribute(rOfloatSeqEClass, ROFLOAT_SEQ__ALARM_TIMER_TRIG);

		rOlongEClass = createEClass(ROLONG);
		createEAttribute(rOlongEClass, ROLONG__ALARM_FAULT_FAMILY);
		createEAttribute(rOlongEClass, ROLONG__ALARM_FAULT_MEMBER);
		createEAttribute(rOlongEClass, ROLONG__ALARM_HIGH_OFF);
		createEAttribute(rOlongEClass, ROLONG__ALARM_HIGH_ON);
		createEAttribute(rOlongEClass, ROLONG__ALARM_LEVEL);
		createEAttribute(rOlongEClass, ROLONG__ALARM_LOW_OFF);
		createEAttribute(rOlongEClass, ROLONG__ALARM_LOW_ON);
		createEAttribute(rOlongEClass, ROLONG__ALARM_TIMER_TRIG);

		rOlongLongEClass = createEClass(ROLONG_LONG);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_FAULT_FAMILY);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_FAULT_MEMBER);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_HIGH_OFF);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_HIGH_ON);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_LEVEL);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_LOW_OFF);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_LOW_ON);
		createEAttribute(rOlongLongEClass, ROLONG_LONG__ALARM_TIMER_TRIG);

		rOlongSeqEClass = createEClass(ROLONG_SEQ);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_FAULT_FAMILY);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_FAULT_MEMBER);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_HIGH_OFF);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_HIGH_ON);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_LEVEL);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_LOW_OFF);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_LOW_ON);
		createEAttribute(rOlongSeqEClass, ROLONG_SEQ__ALARM_TIMER_TRIG);

		rOpatternEClass = createEClass(ROPATTERN);
		createEAttribute(rOpatternEClass, ROPATTERN__ALARM_FAULT_FAMILY);
		createEAttribute(rOpatternEClass, ROPATTERN__ALARM_FAULT_MEMBER);
		createEAttribute(rOpatternEClass, ROPATTERN__ALARM_LEVEL);
		createEAttribute(rOpatternEClass, ROPATTERN__ALARM_MASK);
		createEAttribute(rOpatternEClass, ROPATTERN__ALARM_TIMER_TRIG);
		createEAttribute(rOpatternEClass, ROPATTERN__ALARM_TRIGGER);

		rOstringEClass = createEClass(ROSTRING);
		createEAttribute(rOstringEClass, ROSTRING__ALARM_FAULT_FAMILY);
		createEAttribute(rOstringEClass, ROSTRING__ALARM_FAULT_MEMBER);
		createEAttribute(rOstringEClass, ROSTRING__ALARM_LEVEL);
		createEAttribute(rOstringEClass, ROSTRING__ALARM_TIMER_TRIG);

		rOstringSeqEClass = createEClass(ROSTRING_SEQ);

		rOuLongEClass = createEClass(ROU_LONG);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_FAULT_FAMILY);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_FAULT_MEMBER);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_HIGH_OFF);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_HIGH_ON);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_LEVEL);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_LOW_OFF);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_LOW_ON);
		createEAttribute(rOuLongEClass, ROU_LONG__ALARM_TIMER_TRIG);

		rOuLongLongEClass = createEClass(ROU_LONG_LONG);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_FAULT_FAMILY);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_FAULT_MEMBER);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_HIGH_OFF);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_HIGH_ON);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_LEVEL);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_LOW_OFF);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_LOW_ON);
		createEAttribute(rOuLongLongEClass, ROU_LONG_LONG__ALARM_TIMER_TRIG);

		rOuLongSeqEClass = createEClass(ROU_LONG_SEQ);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_FAULT_FAMILY);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_FAULT_MEMBER);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_HIGH_OFF);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_HIGH_ON);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_LEVEL);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_LOW_OFF);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_LOW_ON);
		createEAttribute(rOuLongSeqEClass, ROU_LONG_SEQ__ALARM_TIMER_TRIG);

		rWbooleanEClass = createEClass(RWBOOLEAN);
		createEAttribute(rWbooleanEClass, RWBOOLEAN__MAX_VALUE);
		createEAttribute(rWbooleanEClass, RWBOOLEAN__MIN_VALUE);

		rWbooleanSeqEClass = createEClass(RWBOOLEAN_SEQ);
		createEAttribute(rWbooleanSeqEClass, RWBOOLEAN_SEQ__MAX_VALUE);
		createEAttribute(rWbooleanSeqEClass, RWBOOLEAN_SEQ__MIN_VALUE);

		rWdoubleEClass = createEClass(RWDOUBLE);
		createEAttribute(rWdoubleEClass, RWDOUBLE__MAX_VALUE);
		createEAttribute(rWdoubleEClass, RWDOUBLE__MIN_VALUE);

		rWdoubleSeqEClass = createEClass(RWDOUBLE_SEQ);
		createEAttribute(rWdoubleSeqEClass, RWDOUBLE_SEQ__MAX_VALUE);
		createEAttribute(rWdoubleSeqEClass, RWDOUBLE_SEQ__MIN_VALUE);

		rwEnumEClass = createEClass(RW_ENUM);
		createEAttribute(rwEnumEClass, RW_ENUM__MAX_VALUE);
		createEAttribute(rwEnumEClass, RW_ENUM__MIN_VALUE);

		rWfloatEClass = createEClass(RWFLOAT);
		createEAttribute(rWfloatEClass, RWFLOAT__MAX_VALUE);
		createEAttribute(rWfloatEClass, RWFLOAT__MIN_VALUE);

		rWfloatSeqEClass = createEClass(RWFLOAT_SEQ);
		createEAttribute(rWfloatSeqEClass, RWFLOAT_SEQ__MAX_VALUE);
		createEAttribute(rWfloatSeqEClass, RWFLOAT_SEQ__MIN_VALUE);

		rWlongEClass = createEClass(RWLONG);
		createEAttribute(rWlongEClass, RWLONG__MAX_VALUE);
		createEAttribute(rWlongEClass, RWLONG__MIN_VALUE);

		rWlongLongEClass = createEClass(RWLONG_LONG);
		createEAttribute(rWlongLongEClass, RWLONG_LONG__MAX_VALUE);
		createEAttribute(rWlongLongEClass, RWLONG_LONG__MIN_VALUE);

		rWlongSeqEClass = createEClass(RWLONG_SEQ);
		createEAttribute(rWlongSeqEClass, RWLONG_SEQ__MAX_VALUE);
		createEAttribute(rWlongSeqEClass, RWLONG_SEQ__MIN_VALUE);

		rWpatternEClass = createEClass(RWPATTERN);

		rWstringEClass = createEClass(RWSTRING);

		rWuLongEClass = createEClass(RWU_LONG);
		createEAttribute(rWuLongEClass, RWU_LONG__MAX_VALUE);
		createEAttribute(rWuLongEClass, RWU_LONG__MIN_VALUE);

		rWuLongLongEClass = createEClass(RWU_LONG_LONG);
		createEAttribute(rWuLongLongEClass, RWU_LONG_LONG__MAX_VALUE);
		createEAttribute(rWuLongLongEClass, RWU_LONG_LONG__MIN_VALUE);

		rWuLongSeqEClass = createEClass(RWU_LONG_SEQ);
		createEAttribute(rWuLongSeqEClass, RWU_LONG_SEQ__MAX_VALUE);
		createEAttribute(rWuLongSeqEClass, RWU_LONG_SEQ__MIN_VALUE);

		typelessPropertyEClass = createEClass(TYPELESS_PROPERTY);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__ARCHIVE_MAX_INT);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__ARCHIVE_MECHANISM);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__ARCHIVE_MIN_INT);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__ARCHIVE_PRIORITY);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__ARCHIVE_SUPPRESS);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__DESCRIPTION);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__FORMAT);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__INITIALIZE_DEVIO);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__MIN_TIMER_TRIG);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__RESOLUTION);
		createEAttribute(typelessPropertyEClass, TYPELESS_PROPERTY__UNITS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		BaciCodeGenPackage theBaciCodeGenPackage = (BaciCodeGenPackage)EPackage.Registry.INSTANCE.getEPackage(BaciCodeGenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		characteristicComponentEClass.getESuperTypes().add(this.getCharacteristicModel());
		pbooleanEClass.getESuperTypes().add(this.getTypelessProperty());
		pboolean1EClass.getESuperTypes().add(this.getPboolean());
		pbooleanSeqEClass.getESuperTypes().add(this.getTypelessProperty());
		pbooleanSeq1EClass.getESuperTypes().add(this.getPbooleanSeq());
		pdoubleEClass.getESuperTypes().add(this.getTypelessProperty());
		pdouble1EClass.getESuperTypes().add(this.getPdouble());
		pdoubleSeqEClass.getESuperTypes().add(this.getTypelessProperty());
		pdoubleSeq1EClass.getESuperTypes().add(this.getPdoubleSeq());
		pEnumEClass.getESuperTypes().add(this.getTypelessProperty());
		pEnum1EClass.getESuperTypes().add(this.getPEnum());
		pfloatEClass.getESuperTypes().add(this.getTypelessProperty());
		pfloat1EClass.getESuperTypes().add(this.getPfloat());
		pfloatSeqEClass.getESuperTypes().add(this.getTypelessProperty());
		pfloatSeq1EClass.getESuperTypes().add(this.getPfloatSeq());
		plongEClass.getESuperTypes().add(this.getTypelessProperty());
		plong1EClass.getESuperTypes().add(this.getPlong());
		plongLongEClass.getESuperTypes().add(this.getTypelessProperty());
		plongLong1EClass.getESuperTypes().add(this.getPlongLong());
		plongSeqEClass.getESuperTypes().add(this.getTypelessProperty());
		plongSeq1EClass.getESuperTypes().add(this.getPlongSeq());
		ppatternEClass.getESuperTypes().add(this.getTypelessProperty());
		ppattern1EClass.getESuperTypes().add(this.getPpattern());
		propertyEClass.getESuperTypes().add(this.getCharacteristicModel());
		pstringEClass.getESuperTypes().add(this.getTypelessProperty());
		pstring1EClass.getESuperTypes().add(this.getPstring());
		pstringSeqEClass.getESuperTypes().add(this.getTypelessProperty());
		pstringSeq1EClass.getESuperTypes().add(this.getPstringSeq());
		puLongEClass.getESuperTypes().add(this.getTypelessProperty());
		puLong1EClass.getESuperTypes().add(this.getPuLong());
		puLongLongEClass.getESuperTypes().add(this.getTypelessProperty());
		puLongLong1EClass.getESuperTypes().add(this.getPuLongLong());
		puLongSeqEClass.getESuperTypes().add(this.getTypelessProperty());
		puLongSeq1EClass.getESuperTypes().add(this.getPuLongSeq());
		rObooleanEClass.getESuperTypes().add(this.getPboolean1());
		rObooleanEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rObooleanSeqEClass.getESuperTypes().add(this.getPbooleanSeq1());
		rObooleanSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOdoubleEClass.getESuperTypes().add(this.getPdouble1());
		rOdoubleEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOdoubleSeqEClass.getESuperTypes().add(this.getPdoubleSeq1());
		rOdoubleSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		roEnumEClass.getESuperTypes().add(this.getPEnum1());
		rOfloatEClass.getESuperTypes().add(this.getPfloat1());
		rOfloatEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOfloatSeqEClass.getESuperTypes().add(this.getPfloatSeq1());
		rOfloatSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOlongEClass.getESuperTypes().add(this.getPlong1());
		rOlongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOlongLongEClass.getESuperTypes().add(this.getPlongLong1());
		rOlongLongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOlongSeqEClass.getESuperTypes().add(this.getPlongSeq1());
		rOlongSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOpatternEClass.getESuperTypes().add(this.getPpattern1());
		rOpatternEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOstringEClass.getESuperTypes().add(this.getPstring1());
		rOstringEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOstringSeqEClass.getESuperTypes().add(this.getPstringSeq1());
		rOstringSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOuLongEClass.getESuperTypes().add(this.getPuLong1());
		rOuLongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOuLongLongEClass.getESuperTypes().add(this.getPuLongLong1());
		rOuLongLongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rOuLongSeqEClass.getESuperTypes().add(this.getPuLongSeq1());
		rOuLongSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWbooleanEClass.getESuperTypes().add(this.getPboolean1());
		rWbooleanEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWbooleanSeqEClass.getESuperTypes().add(this.getPbooleanSeq1());
		rWbooleanSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWdoubleEClass.getESuperTypes().add(this.getPdouble1());
		rWdoubleEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWdoubleSeqEClass.getESuperTypes().add(this.getPdoubleSeq1());
		rWdoubleSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rwEnumEClass.getESuperTypes().add(this.getPEnum1());
		rWfloatEClass.getESuperTypes().add(this.getPfloat1());
		rWfloatEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWfloatSeqEClass.getESuperTypes().add(this.getPfloatSeq1());
		rWfloatSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWlongEClass.getESuperTypes().add(this.getPlong1());
		rWlongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWlongLongEClass.getESuperTypes().add(this.getPlongLong1());
		rWlongLongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWlongSeqEClass.getESuperTypes().add(this.getPlongSeq1());
		rWlongSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWpatternEClass.getESuperTypes().add(this.getPpattern1());
		rWpatternEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWstringEClass.getESuperTypes().add(this.getPstring1());
		rWstringEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWuLongEClass.getESuperTypes().add(this.getPuLong1());
		rWuLongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWuLongLongEClass.getESuperTypes().add(this.getPuLongLong1());
		rWuLongLongEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		rWuLongSeqEClass.getESuperTypes().add(this.getPuLongSeq1());
		rWuLongSeqEClass.getESuperTypes().add(theBaciCodeGenPackage.getPropertyDefinition());
		typelessPropertyEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(characteristicComponentEClass, CharacteristicComponent.class, "CharacteristicComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacteristicComponent_ActionThreadStackSize(), theXMLTypePackage.getUnsignedLong(), "actionThreadStackSize", "1024", 0, 1, CharacteristicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicComponent_MonitoringThreadStackSize(), theXMLTypePackage.getUnsignedLong(), "monitoringThreadStackSize", "2048", 0, 1, CharacteristicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicComponent_RecentCommand(), theXMLTypePackage.getString(), "recentCommand", "", 0, 1, CharacteristicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacteristicComponent_RecentTimeStamp(), theXMLTypePackage.getString(), "recentTimeStamp", "", 0, 1, CharacteristicComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characteristicModelEClass, CharacteristicModel.class, "CharacteristicModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pbooleanEClass, Pboolean.class, "Pboolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pboolean1EClass, Pboolean1.class, "Pboolean1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPboolean1_ArchiveDelta(), theXMLTypePackage.getBoolean(), "archiveDelta", "0", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPboolean1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPboolean1_DefaultValue(), theXMLTypePackage.getBoolean(), "defaultValue", "0", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPboolean1_GraphMax(), theXMLTypePackage.getBoolean(), "graphMax", "1", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPboolean1_GraphMin(), theXMLTypePackage.getBoolean(), "graphMin", "0", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPboolean1_MinDeltaTrig(), theXMLTypePackage.getBoolean(), "minDeltaTrig", "0", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPboolean1_MinStep(), theXMLTypePackage.getBoolean(), "minStep", "0", 0, 1, Pboolean1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pbooleanSeqEClass, PbooleanSeq.class, "PbooleanSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pbooleanSeq1EClass, PbooleanSeq1.class, "PbooleanSeq1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPbooleanSeq1_ArchiveDelta(), theXMLTypePackage.getBoolean(), "archiveDelta", "0", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPbooleanSeq1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPbooleanSeq1_DefaultValue(), theXMLTypePackage.getBoolean(), "defaultValue", "0", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPbooleanSeq1_GraphMax(), theXMLTypePackage.getBoolean(), "graphMax", "1", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPbooleanSeq1_GraphMin(), theXMLTypePackage.getBoolean(), "graphMin", "0", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPbooleanSeq1_MinDeltaTrig(), theXMLTypePackage.getBoolean(), "minDeltaTrig", "0", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPbooleanSeq1_MinStep(), theXMLTypePackage.getBoolean(), "minStep", "0", 0, 1, PbooleanSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdoubleEClass, Pdouble.class, "Pdouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdouble1EClass, Pdouble1.class, "Pdouble1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPdouble1_ArchiveDelta(), theXMLTypePackage.getDouble(), "archiveDelta", "0", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdouble1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdouble1_DefaultValue(), theXMLTypePackage.getDouble(), "defaultValue", "0.0", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdouble1_GraphMax(), theXMLTypePackage.getDouble(), "graphMax", "1.7976931348623157E+308", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdouble1_GraphMin(), theXMLTypePackage.getDouble(), "graphMin", "-1.7976931348623157E+308", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdouble1_MinDeltaTrig(), theXMLTypePackage.getDouble(), "minDeltaTrig", "0", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdouble1_MinStep(), theXMLTypePackage.getDouble(), "minStep", "0.0", 0, 1, Pdouble1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdoubleSeqEClass, PdoubleSeq.class, "PdoubleSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdoubleSeq1EClass, PdoubleSeq1.class, "PdoubleSeq1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPdoubleSeq1_ArchiveDelta(), theXMLTypePackage.getDouble(), "archiveDelta", "0.0", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdoubleSeq1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdoubleSeq1_DefaultValue(), theXMLTypePackage.getDouble(), "defaultValue", "0.0", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdoubleSeq1_GraphMax(), theXMLTypePackage.getDouble(), "graphMax", "1.7976931348623157E+308", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdoubleSeq1_GraphMin(), theXMLTypePackage.getDouble(), "graphMin", "-1.7976931348623157E+308", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdoubleSeq1_MinDeltaTrig(), theXMLTypePackage.getDouble(), "minDeltaTrig", "0", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdoubleSeq1_MinStep(), theXMLTypePackage.getDouble(), "minStep", "0", 0, 1, PdoubleSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pEnumEClass, PEnum.class, "PEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pEnum1EClass, PEnum1.class, "PEnum1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPEnum1_ArchiveDelta(), theXMLTypePackage.getInt(), "archiveDelta", "0", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEnum1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEnum1_Condition(), theXMLTypePackage.getString(), "condition", "", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEnum1_DefaultValue(), theXMLTypePackage.getInt(), "defaultValue", "0", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEnum1_GraphMax(), theXMLTypePackage.getInt(), "graphMax", "0", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEnum1_GraphMin(), theXMLTypePackage.getInt(), "graphMin", "0", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPEnum1_StatesDescription(), theXMLTypePackage.getString(), "statesDescription", "", 0, 1, PEnum1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pfloatEClass, Pfloat.class, "Pfloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pfloat1EClass, Pfloat1.class, "Pfloat1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPfloat1_ArchiveDelta(), theXMLTypePackage.getFloat(), "archiveDelta", "0", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloat1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloat1_DefaultValue(), theXMLTypePackage.getFloat(), "defaultValue", "0.0", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloat1_GraphMax(), theXMLTypePackage.getFloat(), "graphMax", "3.4028234663852886E+38", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloat1_GraphMin(), theXMLTypePackage.getFloat(), "graphMin", "-3.4028234663852886E+38", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloat1_MinDeltaTrig(), theXMLTypePackage.getFloat(), "minDeltaTrig", "0", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloat1_MinStep(), theXMLTypePackage.getFloat(), "minStep", "0.0", 0, 1, Pfloat1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pfloatSeqEClass, PfloatSeq.class, "PfloatSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pfloatSeq1EClass, PfloatSeq1.class, "PfloatSeq1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPfloatSeq1_ArchiveDelta(), theXMLTypePackage.getFloat(), "archiveDelta", "0.0", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloatSeq1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloatSeq1_DefaultValue(), theXMLTypePackage.getFloat(), "defaultValue", "0.0", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloatSeq1_GraphMax(), theXMLTypePackage.getFloat(), "graphMax", "3.4028234663852886E+38", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloatSeq1_GraphMin(), theXMLTypePackage.getFloat(), "graphMin", "-3.4028234663852886E+38", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloatSeq1_MinDeltaTrig(), theXMLTypePackage.getFloat(), "minDeltaTrig", "0", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPfloatSeq1_MinStep(), theXMLTypePackage.getFloat(), "minStep", "0", 0, 1, PfloatSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plongEClass, Plong.class, "Plong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plong1EClass, Plong1.class, "Plong1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlong1_ArchiveDelta(), theXMLTypePackage.getInt(), "archiveDelta", "0", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlong1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlong1_DefaultValue(), theXMLTypePackage.getInt(), "defaultValue", "0", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlong1_GraphMax(), theXMLTypePackage.getInt(), "graphMax", "2147483647", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlong1_GraphMin(), theXMLTypePackage.getInt(), "graphMin", "-2147483648", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlong1_MinDeltaTrig(), theXMLTypePackage.getInt(), "minDeltaTrig", "0", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlong1_MinStep(), theXMLTypePackage.getInt(), "minStep", "0", 0, 1, Plong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plongLongEClass, PlongLong.class, "PlongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plongLong1EClass, PlongLong1.class, "PlongLong1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlongLong1_ArchiveDelta(), theXMLTypePackage.getInt(), "archiveDelta", "0", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongLong1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongLong1_DefaultValue(), theXMLTypePackage.getLong(), "defaultValue", "0", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongLong1_GraphMax(), theXMLTypePackage.getLong(), "graphMax", "9223372036854775807", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongLong1_GraphMin(), theXMLTypePackage.getLong(), "graphMin", "-9223372036854775808", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongLong1_MinDeltaTrig(), theXMLTypePackage.getLong(), "minDeltaTrig", "0", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongLong1_MinStep(), theXMLTypePackage.getLong(), "minStep", "0", 0, 1, PlongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plongSeqEClass, PlongSeq.class, "PlongSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plongSeq1EClass, PlongSeq1.class, "PlongSeq1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlongSeq1_ArchiveDelta(), theXMLTypePackage.getInt(), "archiveDelta", "0", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongSeq1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongSeq1_DefaultValue(), theXMLTypePackage.getInt(), "defaultValue", "0", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongSeq1_GraphMax(), theXMLTypePackage.getInt(), "graphMax", "2147483647", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongSeq1_GraphMin(), theXMLTypePackage.getInt(), "graphMin", "-2147483648", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongSeq1_MinDeltaTrig(), theXMLTypePackage.getInt(), "minDeltaTrig", "0", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlongSeq1_MinStep(), theXMLTypePackage.getInt(), "minStep", "0", 0, 1, PlongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ppatternEClass, Ppattern.class, "Ppattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ppattern1EClass, Ppattern1.class, "Ppattern1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPpattern1_ArchiveDelta(), theXMLTypePackage.getUnsignedLong(), "archiveDelta", "0", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPpattern1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPpattern1_BitDescription(), theXMLTypePackage.getString(), "bitDescription", "", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPpattern1_DefaultValue(), theXMLTypePackage.getUnsignedLong(), "defaultValue", "0", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPpattern1_MinStep(), theXMLTypePackage.getUnsignedLong(), "minStep", "0", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPpattern1_WhenCleared(), theXMLTypePackage.getString(), "whenCleared", "", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPpattern1_WhenSet(), theXMLTypePackage.getString(), "whenSet", "", 0, 1, Ppattern1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pstringEClass, Pstring.class, "Pstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pstring1EClass, Pstring1.class, "Pstring1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPstring1_ArchiveDelta(), theXMLTypePackage.getString(), "archiveDelta", "0", 0, 1, Pstring1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPstring1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, Pstring1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPstring1_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", "", 0, 1, Pstring1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pstringSeqEClass, PstringSeq.class, "PstringSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pstringSeq1EClass, PstringSeq1.class, "PstringSeq1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPstringSeq1_ArchiveDelta(), theXMLTypePackage.getString(), "archiveDelta", "0", 0, 1, PstringSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPstringSeq1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PstringSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPstringSeq1_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", "", 0, 1, PstringSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puLongEClass, PuLong.class, "PuLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(puLong1EClass, PuLong1.class, "PuLong1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuLong1_ArchiveDelta(), theXMLTypePackage.getUnsignedInt(), "archiveDelta", "0", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLong1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLong1_DefaultValue(), theXMLTypePackage.getUnsignedInt(), "defaultValue", "0", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLong1_GraphMax(), theXMLTypePackage.getUnsignedInt(), "graphMax", "4294967295", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLong1_GraphMin(), theXMLTypePackage.getUnsignedInt(), "graphMin", "0", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLong1_MinDeltaTrig(), theXMLTypePackage.getUnsignedInt(), "minDeltaTrig", "0", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLong1_MinStep(), theXMLTypePackage.getUnsignedInt(), "minStep", "0", 0, 1, PuLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puLongLongEClass, PuLongLong.class, "PuLongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(puLongLong1EClass, PuLongLong1.class, "PuLongLong1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuLongLong1_ArchiveDelta(), theXMLTypePackage.getUnsignedLong(), "archiveDelta", "0", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongLong1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongLong1_DefaultValue(), theXMLTypePackage.getUnsignedLong(), "defaultValue", "0", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongLong1_GraphMax(), theXMLTypePackage.getUnsignedLong(), "graphMax", "18446744073709551615", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongLong1_GraphMin(), theXMLTypePackage.getUnsignedLong(), "graphMin", "0", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongLong1_MinDeltaTrig(), theXMLTypePackage.getUnsignedLong(), "minDeltaTrig", "0", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongLong1_MinStep(), theXMLTypePackage.getUnsignedLong(), "minStep", "0", 0, 1, PuLongLong1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puLongSeqEClass, PuLongSeq.class, "PuLongSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(puLongSeq1EClass, PuLongSeq1.class, "PuLongSeq1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPuLongSeq1_ArchiveDelta(), theXMLTypePackage.getUnsignedInt(), "archiveDelta", "0", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongSeq1_ArchiveDeltaPercent(), theXMLTypePackage.getDouble(), "archiveDeltaPercent", "0", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongSeq1_DefaultValue(), theXMLTypePackage.getUnsignedInt(), "defaultValue", "0", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongSeq1_GraphMax(), theXMLTypePackage.getUnsignedInt(), "graphMax", "4294967295", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongSeq1_GraphMin(), theXMLTypePackage.getUnsignedInt(), "graphMin", "0", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongSeq1_MinDeltaTrig(), theXMLTypePackage.getUnsignedInt(), "minDeltaTrig", "0", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPuLongSeq1_MinStep(), theXMLTypePackage.getUnsignedInt(), "minStep", "0", 0, 1, PuLongSeq1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rObooleanEClass, ROboolean.class, "ROboolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROboolean_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROboolean_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROboolean_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROboolean_AlarmOn(), theXMLTypePackage.getBoolean(), "alarmOn", "true", 0, 1, ROboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROboolean_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rObooleanSeqEClass, RObooleanSeq.class, "RObooleanSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRObooleanSeq_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, RObooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRObooleanSeq_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, RObooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRObooleanSeq_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, RObooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRObooleanSeq_AlarmOn(), theXMLTypePackage.getBoolean(), "alarmOn", "true", 0, 1, RObooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRObooleanSeq_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, RObooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOdoubleEClass, ROdouble.class, "ROdouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROdouble_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmHighOff(), theXMLTypePackage.getDouble(), "alarmHighOff", "0.0", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmHighOn(), theXMLTypePackage.getDouble(), "alarmHighOn", "0.0", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmLowOff(), theXMLTypePackage.getDouble(), "alarmLowOff", "0.0", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmLowOn(), theXMLTypePackage.getDouble(), "alarmLowOn", "0.0", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdouble_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOdoubleSeqEClass, ROdoubleSeq.class, "ROdoubleSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROdoubleSeq_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmHighOff(), theXMLTypePackage.getDouble(), "alarmHighOff", "0.0", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmHighOn(), theXMLTypePackage.getDouble(), "alarmHighOn", "0.0", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmLowOff(), theXMLTypePackage.getDouble(), "alarmLowOff", "0.0", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmLowOn(), theXMLTypePackage.getDouble(), "alarmLowOn", "0.0", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROdoubleSeq_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roEnumEClass, ROEnum.class, "ROEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROEnum_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROEnum_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROEnum_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROEnum_AlarmOff(), theXMLTypePackage.getString(), "alarmOff", "", 0, 1, ROEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROEnum_AlarmOn(), theXMLTypePackage.getString(), "alarmOn", "", 0, 1, ROEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROEnum_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOfloatEClass, ROfloat.class, "ROfloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROfloat_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmHighOff(), theXMLTypePackage.getFloat(), "alarmHighOff", "0.0", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmHighOn(), theXMLTypePackage.getFloat(), "alarmHighOn", "0.0", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmLowOff(), theXMLTypePackage.getFloat(), "alarmLowOff", "0.0", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmLowOn(), theXMLTypePackage.getFloat(), "alarmLowOn", "0.0", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloat_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOfloatSeqEClass, ROfloatSeq.class, "ROfloatSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROfloatSeq_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmHighOff(), theXMLTypePackage.getFloat(), "alarmHighOff", "0.0", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmHighOn(), theXMLTypePackage.getFloat(), "alarmHighOn", "0.0", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmLowOff(), theXMLTypePackage.getFloat(), "alarmLowOff", "0.0", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmLowOn(), theXMLTypePackage.getFloat(), "alarmLowOn", "0.0", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROfloatSeq_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOlongEClass, ROlong.class, "ROlong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROlong_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmHighOff(), theXMLTypePackage.getInt(), "alarmHighOff", "0", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmHighOn(), theXMLTypePackage.getInt(), "alarmHighOn", "0", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmLowOff(), theXMLTypePackage.getInt(), "alarmLowOff", "0", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmLowOn(), theXMLTypePackage.getInt(), "alarmLowOn", "0", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlong_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOlongLongEClass, ROlongLong.class, "ROlongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROlongLong_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmHighOff(), theXMLTypePackage.getLong(), "alarmHighOff", "0", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmHighOn(), theXMLTypePackage.getLong(), "alarmHighOn", "0", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmLowOff(), theXMLTypePackage.getLong(), "alarmLowOff", "0", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmLowOn(), theXMLTypePackage.getLong(), "alarmLowOn", "0", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongLong_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOlongSeqEClass, ROlongSeq.class, "ROlongSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROlongSeq_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmHighOff(), theXMLTypePackage.getInt(), "alarmHighOff", "0", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmHighOn(), theXMLTypePackage.getInt(), "alarmHighOn", "0", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmLowOff(), theXMLTypePackage.getInt(), "alarmLowOff", "0", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmLowOn(), theXMLTypePackage.getInt(), "alarmLowOn", "0", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROlongSeq_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOpatternEClass, ROpattern.class, "ROpattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROpattern_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROpattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROpattern_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROpattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROpattern_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROpattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROpattern_AlarmMask(), theXMLTypePackage.getUnsignedLong(), "alarmMask", "0", 0, 1, ROpattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROpattern_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROpattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROpattern_AlarmTrigger(), theXMLTypePackage.getUnsignedLong(), "alarmTrigger", "0", 0, 1, ROpattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOstringEClass, ROstring.class, "ROstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROstring_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROstring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROstring_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROstring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROstring_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROstring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROstring_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROstring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOstringSeqEClass, ROstringSeq.class, "ROstringSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rOuLongEClass, ROuLong.class, "ROuLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROuLong_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmHighOff(), theXMLTypePackage.getUnsignedInt(), "alarmHighOff", "0", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmHighOn(), theXMLTypePackage.getUnsignedInt(), "alarmHighOn", "0", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmLowOff(), theXMLTypePackage.getUnsignedInt(), "alarmLowOff", "0", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmLowOn(), theXMLTypePackage.getUnsignedInt(), "alarmLowOn", "0", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLong_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOuLongLongEClass, ROuLongLong.class, "ROuLongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROuLongLong_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmHighOff(), theXMLTypePackage.getUnsignedLong(), "alarmHighOff", "0", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmHighOn(), theXMLTypePackage.getUnsignedLong(), "alarmHighOn", "0", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmLowOff(), theXMLTypePackage.getUnsignedLong(), "alarmLowOff", "0", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmLowOn(), theXMLTypePackage.getUnsignedLong(), "alarmLowOn", "0", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongLong_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rOuLongSeqEClass, ROuLongSeq.class, "ROuLongSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getROuLongSeq_AlarmFaultFamily(), theXMLTypePackage.getString(), "alarmFaultFamily", "", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmFaultMember(), theXMLTypePackage.getString(), "alarmFaultMember", "", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmHighOff(), theXMLTypePackage.getUnsignedInt(), "alarmHighOff", "0", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmHighOn(), theXMLTypePackage.getUnsignedInt(), "alarmHighOn", "0", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmLevel(), theXMLTypePackage.getInt(), "alarmLevel", "0", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmLowOff(), theXMLTypePackage.getUnsignedInt(), "alarmLowOff", "0", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmLowOn(), theXMLTypePackage.getUnsignedInt(), "alarmLowOn", "0", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getROuLongSeq_AlarmTimerTrig(), theXMLTypePackage.getDouble(), "alarmTimerTrig", "0.0", 0, 1, ROuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWbooleanEClass, RWboolean.class, "RWboolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWboolean_MaxValue(), theXMLTypePackage.getBoolean(), "maxValue", "true", 0, 1, RWboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWboolean_MinValue(), theXMLTypePackage.getBoolean(), "minValue", "false", 0, 1, RWboolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWbooleanSeqEClass, RWbooleanSeq.class, "RWbooleanSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWbooleanSeq_MaxValue(), theXMLTypePackage.getBoolean(), "maxValue", "true", 0, 1, RWbooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWbooleanSeq_MinValue(), theXMLTypePackage.getBoolean(), "minValue", "false", 0, 1, RWbooleanSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWdoubleEClass, RWdouble.class, "RWdouble", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWdouble_MaxValue(), theXMLTypePackage.getDouble(), "maxValue", "1.7976931348623157E+308", 0, 1, RWdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWdouble_MinValue(), theXMLTypePackage.getDouble(), "minValue", "-1.7976931348623157E+308", 0, 1, RWdouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWdoubleSeqEClass, RWdoubleSeq.class, "RWdoubleSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWdoubleSeq_MaxValue(), theXMLTypePackage.getDouble(), "maxValue", "1.7976931348623157E+308", 0, 1, RWdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWdoubleSeq_MinValue(), theXMLTypePackage.getDouble(), "minValue", "-1.7976931348623157E+308", 0, 1, RWdoubleSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rwEnumEClass, RWEnum.class, "RWEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWEnum_MaxValue(), theXMLTypePackage.getInt(), "maxValue", "0", 0, 1, RWEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWEnum_MinValue(), theXMLTypePackage.getInt(), "minValue", "0", 0, 1, RWEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWfloatEClass, RWfloat.class, "RWfloat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWfloat_MaxValue(), theXMLTypePackage.getFloat(), "maxValue", "3.4028234663852886E+38", 0, 1, RWfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWfloat_MinValue(), theXMLTypePackage.getFloat(), "minValue", "-3.4028234663852886E+38", 0, 1, RWfloat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWfloatSeqEClass, RWfloatSeq.class, "RWfloatSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWfloatSeq_MaxValue(), theXMLTypePackage.getFloat(), "maxValue", "3.4028234663852886E+38", 0, 1, RWfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWfloatSeq_MinValue(), theXMLTypePackage.getFloat(), "minValue", "-3.4028234663852886E+38", 0, 1, RWfloatSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWlongEClass, RWlong.class, "RWlong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWlong_MaxValue(), theXMLTypePackage.getInt(), "maxValue", "2147483647", 0, 1, RWlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWlong_MinValue(), theXMLTypePackage.getInt(), "minValue", "-2147483648", 0, 1, RWlong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWlongLongEClass, RWlongLong.class, "RWlongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWlongLong_MaxValue(), theXMLTypePackage.getLong(), "maxValue", "9223372036854775807", 0, 1, RWlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWlongLong_MinValue(), theXMLTypePackage.getLong(), "minValue", "-9223372036854775808", 0, 1, RWlongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWlongSeqEClass, RWlongSeq.class, "RWlongSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWlongSeq_MaxValue(), theXMLTypePackage.getInt(), "maxValue", "2147483647", 0, 1, RWlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWlongSeq_MinValue(), theXMLTypePackage.getInt(), "minValue", "-2147483648", 0, 1, RWlongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWpatternEClass, RWpattern.class, "RWpattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rWstringEClass, RWstring.class, "RWstring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rWuLongEClass, RWuLong.class, "RWuLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWuLong_MaxValue(), theXMLTypePackage.getUnsignedInt(), "maxValue", "4294967295", 0, 1, RWuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWuLong_MinValue(), theXMLTypePackage.getUnsignedInt(), "minValue", "0", 0, 1, RWuLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWuLongLongEClass, RWuLongLong.class, "RWuLongLong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWuLongLong_MaxValue(), theXMLTypePackage.getUnsignedLong(), "maxValue", "18446744073709551615", 0, 1, RWuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWuLongLong_MinValue(), theXMLTypePackage.getUnsignedLong(), "minValue", "0", 0, 1, RWuLongLong.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rWuLongSeqEClass, RWuLongSeq.class, "RWuLongSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRWuLongSeq_MaxValue(), theXMLTypePackage.getUnsignedInt(), "maxValue", "4294967295", 0, 1, RWuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRWuLongSeq_MinValue(), theXMLTypePackage.getUnsignedInt(), "minValue", "0", 0, 1, RWuLongSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typelessPropertyEClass, TypelessProperty.class, "TypelessProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypelessProperty_ArchiveMaxInt(), theXMLTypePackage.getDouble(), "archiveMaxInt", "0.0", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_ArchiveMechanism(), theXMLTypePackage.getString(), "archiveMechanism", "monitor_collector", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_ArchiveMinInt(), theXMLTypePackage.getDouble(), "archiveMinInt", "0.0", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_ArchivePriority(), theXMLTypePackage.getInt(), "archivePriority", "3", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_ArchiveSuppress(), theXMLTypePackage.getBoolean(), "archiveSuppress", "false", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_DefaultTimerTrig(), theXMLTypePackage.getDouble(), "defaultTimerTrig", "1.0", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_Description(), theXMLTypePackage.getString(), "description", "-", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_Format(), theXMLTypePackage.getString(), "format", "-", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_InitializeDevio(), theXMLTypePackage.getBoolean(), "initializeDevio", "0", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_MinTimerTrig(), theXMLTypePackage.getDouble(), "minTimerTrig", "0.001", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_Resolution(), theXMLTypePackage.getUnsignedLong(), "resolution", "65535", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypelessProperty_Units(), theXMLTypePackage.getString(), "units", "-", 0, 1, TypelessProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (characteristicComponentEClass, 
		   source, 
		   new String[] {
			 "name", "CharacteristicComponent",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getCharacteristicComponent_ActionThreadStackSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actionThreadStackSize"
		   });	
		addAnnotation
		  (getCharacteristicComponent_MonitoringThreadStackSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "monitoringThreadStackSize"
		   });	
		addAnnotation
		  (getCharacteristicComponent_RecentCommand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "recentCommand"
		   });	
		addAnnotation
		  (getCharacteristicComponent_RecentTimeStamp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "recentTimeStamp"
		   });	
		addAnnotation
		  (characteristicModelEClass, 
		   source, 
		   new String[] {
			 "name", "CharacteristicModel",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pbooleanEClass, 
		   source, 
		   new String[] {
			 "name", "Pboolean_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pboolean1EClass, 
		   source, 
		   new String[] {
			 "name", "Pboolean",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPboolean1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPboolean1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPboolean1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPboolean1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPboolean1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPboolean1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPboolean1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (pbooleanSeqEClass, 
		   source, 
		   new String[] {
			 "name", "PbooleanSeq_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pbooleanSeq1EClass, 
		   source, 
		   new String[] {
			 "name", "PbooleanSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPbooleanSeq1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPbooleanSeq1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPbooleanSeq1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPbooleanSeq1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPbooleanSeq1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPbooleanSeq1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPbooleanSeq1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (pdoubleEClass, 
		   source, 
		   new String[] {
			 "name", "Pdouble_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pdouble1EClass, 
		   source, 
		   new String[] {
			 "name", "Pdouble",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPdouble1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPdouble1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPdouble1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPdouble1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPdouble1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPdouble1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPdouble1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (pdoubleSeqEClass, 
		   source, 
		   new String[] {
			 "name", "PdoubleSeq_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pdoubleSeq1EClass, 
		   source, 
		   new String[] {
			 "name", "PdoubleSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPdoubleSeq1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPdoubleSeq1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPdoubleSeq1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPdoubleSeq1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPdoubleSeq1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPdoubleSeq1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPdoubleSeq1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (pEnumEClass, 
		   source, 
		   new String[] {
			 "name", "PEnum_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pEnum1EClass, 
		   source, 
		   new String[] {
			 "name", "PEnum",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPEnum1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPEnum1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPEnum1_Condition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "condition"
		   });	
		addAnnotation
		  (getPEnum1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPEnum1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPEnum1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPEnum1_StatesDescription(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "statesDescription"
		   });	
		addAnnotation
		  (pfloatEClass, 
		   source, 
		   new String[] {
			 "name", "Pfloat_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pfloat1EClass, 
		   source, 
		   new String[] {
			 "name", "Pfloat",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPfloat1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPfloat1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPfloat1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPfloat1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPfloat1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPfloat1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPfloat1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (pfloatSeqEClass, 
		   source, 
		   new String[] {
			 "name", "PfloatSeq_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pfloatSeq1EClass, 
		   source, 
		   new String[] {
			 "name", "PfloatSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPfloatSeq1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPfloatSeq1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPfloatSeq1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPfloatSeq1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPfloatSeq1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPfloatSeq1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPfloatSeq1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (plongEClass, 
		   source, 
		   new String[] {
			 "name", "Plong_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (plong1EClass, 
		   source, 
		   new String[] {
			 "name", "Plong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPlong1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPlong1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPlong1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPlong1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPlong1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPlong1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPlong1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (plongLongEClass, 
		   source, 
		   new String[] {
			 "name", "PlongLong_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (plongLong1EClass, 
		   source, 
		   new String[] {
			 "name", "PlongLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPlongLong1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPlongLong1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPlongLong1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPlongLong1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPlongLong1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPlongLong1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPlongLong1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (plongSeqEClass, 
		   source, 
		   new String[] {
			 "name", "PlongSeq_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (plongSeq1EClass, 
		   source, 
		   new String[] {
			 "name", "PlongSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPlongSeq1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPlongSeq1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPlongSeq1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPlongSeq1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPlongSeq1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPlongSeq1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPlongSeq1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (ppatternEClass, 
		   source, 
		   new String[] {
			 "name", "Ppattern_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (ppattern1EClass, 
		   source, 
		   new String[] {
			 "name", "Ppattern",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPpattern1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPpattern1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPpattern1_BitDescription(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bitDescription"
		   });	
		addAnnotation
		  (getPpattern1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPpattern1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (getPpattern1_WhenCleared(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "whenCleared"
		   });	
		addAnnotation
		  (getPpattern1_WhenSet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "whenSet"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "name", "Property",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pstringEClass, 
		   source, 
		   new String[] {
			 "name", "Pstring_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pstring1EClass, 
		   source, 
		   new String[] {
			 "name", "Pstring",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPstring1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPstring1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPstring1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (pstringSeqEClass, 
		   source, 
		   new String[] {
			 "name", "PstringSeq_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (pstringSeq1EClass, 
		   source, 
		   new String[] {
			 "name", "PstringSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPstringSeq1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPstringSeq1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPstringSeq1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (puLongEClass, 
		   source, 
		   new String[] {
			 "name", "PuLong_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (puLong1EClass, 
		   source, 
		   new String[] {
			 "name", "PuLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPuLong1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPuLong1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPuLong1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPuLong1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPuLong1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPuLong1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPuLong1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (puLongLongEClass, 
		   source, 
		   new String[] {
			 "name", "PuLongLong_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (puLongLong1EClass, 
		   source, 
		   new String[] {
			 "name", "PuLongLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPuLongLong1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPuLongLong1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPuLongLong1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPuLongLong1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPuLongLong1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPuLongLong1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPuLongLong1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (puLongSeqEClass, 
		   source, 
		   new String[] {
			 "name", "PuLongSeq_",
			 "kind", "empty"
		   });	
		addAnnotation
		  (puLongSeq1EClass, 
		   source, 
		   new String[] {
			 "name", "PuLongSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPuLongSeq1_ArchiveDelta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta"
		   });	
		addAnnotation
		  (getPuLongSeq1_ArchiveDeltaPercent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_delta_percent"
		   });	
		addAnnotation
		  (getPuLongSeq1_DefaultValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_value"
		   });	
		addAnnotation
		  (getPuLongSeq1_GraphMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_max"
		   });	
		addAnnotation
		  (getPuLongSeq1_GraphMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "graph_min"
		   });	
		addAnnotation
		  (getPuLongSeq1_MinDeltaTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_delta_trig"
		   });	
		addAnnotation
		  (getPuLongSeq1_MinStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_step"
		   });	
		addAnnotation
		  (rObooleanEClass, 
		   source, 
		   new String[] {
			 "name", "ROboolean",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROboolean_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROboolean_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROboolean_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROboolean_AlarmOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_on"
		   });	
		addAnnotation
		  (getROboolean_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rObooleanSeqEClass, 
		   source, 
		   new String[] {
			 "name", "RObooleanSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRObooleanSeq_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getRObooleanSeq_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getRObooleanSeq_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getRObooleanSeq_AlarmOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_on"
		   });	
		addAnnotation
		  (getRObooleanSeq_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOdoubleEClass, 
		   source, 
		   new String[] {
			 "name", "ROdouble",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROdouble_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROdouble_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROdouble_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROdouble_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROdouble_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROdouble_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROdouble_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROdouble_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOdoubleSeqEClass, 
		   source, 
		   new String[] {
			 "name", "ROdoubleSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROdoubleSeq_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (roEnumEClass, 
		   source, 
		   new String[] {
			 "name", "ROEnum",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROEnum_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROEnum_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROEnum_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROEnum_AlarmOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_off"
		   });	
		addAnnotation
		  (getROEnum_AlarmOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_on"
		   });	
		addAnnotation
		  (getROEnum_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOfloatEClass, 
		   source, 
		   new String[] {
			 "name", "ROfloat",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROfloat_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROfloat_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROfloat_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROfloat_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROfloat_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROfloat_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROfloat_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROfloat_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOfloatSeqEClass, 
		   source, 
		   new String[] {
			 "name", "ROfloatSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROfloatSeq_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOlongEClass, 
		   source, 
		   new String[] {
			 "name", "ROlong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROlong_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROlong_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROlong_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROlong_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROlong_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROlong_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROlong_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROlong_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOlongLongEClass, 
		   source, 
		   new String[] {
			 "name", "ROlongLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROlongLong_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROlongLong_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROlongLong_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROlongLong_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROlongLong_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROlongLong_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROlongLong_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROlongLong_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOlongSeqEClass, 
		   source, 
		   new String[] {
			 "name", "ROlongSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROlongSeq_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOpatternEClass, 
		   source, 
		   new String[] {
			 "name", "ROpattern",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROpattern_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROpattern_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROpattern_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROpattern_AlarmMask(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_mask"
		   });	
		addAnnotation
		  (getROpattern_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (getROpattern_AlarmTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_trigger"
		   });	
		addAnnotation
		  (rOstringEClass, 
		   source, 
		   new String[] {
			 "name", "ROstring",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROstring_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROstring_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROstring_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROstring_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOstringSeqEClass, 
		   source, 
		   new String[] {
			 "name", "ROstringSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (rOuLongEClass, 
		   source, 
		   new String[] {
			 "name", "ROuLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROuLong_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROuLong_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROuLong_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROuLong_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROuLong_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROuLong_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROuLong_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROuLong_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOuLongLongEClass, 
		   source, 
		   new String[] {
			 "name", "ROuLongLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROuLongLong_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rOuLongSeqEClass, 
		   source, 
		   new String[] {
			 "name", "ROuLongSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmFaultFamily(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_family"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmFaultMember(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_fault_member"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmHighOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_off"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmHighOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_high_on"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_level"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmLowOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_off"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmLowOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_low_on"
		   });	
		addAnnotation
		  (getROuLongSeq_AlarmTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alarm_timer_trig"
		   });	
		addAnnotation
		  (rWbooleanEClass, 
		   source, 
		   new String[] {
			 "name", "RWboolean",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWboolean_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWboolean_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWbooleanSeqEClass, 
		   source, 
		   new String[] {
			 "name", "RWbooleanSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWbooleanSeq_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWbooleanSeq_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWdoubleEClass, 
		   source, 
		   new String[] {
			 "name", "RWdouble",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWdouble_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWdouble_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWdoubleSeqEClass, 
		   source, 
		   new String[] {
			 "name", "RWdoubleSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWdoubleSeq_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWdoubleSeq_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rwEnumEClass, 
		   source, 
		   new String[] {
			 "name", "RWEnum",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWEnum_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWEnum_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWfloatEClass, 
		   source, 
		   new String[] {
			 "name", "RWfloat",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWfloat_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWfloat_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWfloatSeqEClass, 
		   source, 
		   new String[] {
			 "name", "RWfloatSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWfloatSeq_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWfloatSeq_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWlongEClass, 
		   source, 
		   new String[] {
			 "name", "RWlong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWlong_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWlong_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWlongLongEClass, 
		   source, 
		   new String[] {
			 "name", "RWlongLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWlongLong_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWlongLong_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWlongSeqEClass, 
		   source, 
		   new String[] {
			 "name", "RWlongSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWlongSeq_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWlongSeq_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWpatternEClass, 
		   source, 
		   new String[] {
			 "name", "RWpattern",
			 "kind", "empty"
		   });	
		addAnnotation
		  (rWstringEClass, 
		   source, 
		   new String[] {
			 "name", "RWstring",
			 "kind", "empty"
		   });	
		addAnnotation
		  (rWuLongEClass, 
		   source, 
		   new String[] {
			 "name", "RWuLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWuLong_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWuLong_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWuLongLongEClass, 
		   source, 
		   new String[] {
			 "name", "RWuLongLong",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWuLongLong_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWuLongLong_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (rWuLongSeqEClass, 
		   source, 
		   new String[] {
			 "name", "RWuLongSeq",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getRWuLongSeq_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "max_value"
		   });	
		addAnnotation
		  (getRWuLongSeq_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_value"
		   });	
		addAnnotation
		  (typelessPropertyEClass, 
		   source, 
		   new String[] {
			 "name", "TypelessProperty",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTypelessProperty_ArchiveMaxInt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_max_int"
		   });	
		addAnnotation
		  (getTypelessProperty_ArchiveMechanism(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_mechanism"
		   });	
		addAnnotation
		  (getTypelessProperty_ArchiveMinInt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_min_int"
		   });	
		addAnnotation
		  (getTypelessProperty_ArchivePriority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_priority"
		   });	
		addAnnotation
		  (getTypelessProperty_ArchiveSuppress(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive_suppress"
		   });	
		addAnnotation
		  (getTypelessProperty_DefaultTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "default_timer_trig"
		   });	
		addAnnotation
		  (getTypelessProperty_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });	
		addAnnotation
		  (getTypelessProperty_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format"
		   });	
		addAnnotation
		  (getTypelessProperty_InitializeDevio(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "initialize_devio"
		   });	
		addAnnotation
		  (getTypelessProperty_MinTimerTrig(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "min_timer_trig"
		   });	
		addAnnotation
		  (getTypelessProperty_Resolution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resolution"
		   });	
		addAnnotation
		  (getTypelessProperty_Units(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "units"
		   });
	}

} //BACIPropertiesPackageImpl
