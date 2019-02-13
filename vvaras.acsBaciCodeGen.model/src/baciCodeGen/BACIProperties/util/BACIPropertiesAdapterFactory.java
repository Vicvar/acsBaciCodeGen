/**
 */
package baciCodeGen.BACIProperties.util;

import baciCodeGen.BACIProperties.*;

import baciCodeGen.PropertyDefinition;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see baciCodeGen.BACIProperties.BACIPropertiesPackage
 * @generated
 */
public class BACIPropertiesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BACIPropertiesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACIPropertiesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BACIPropertiesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BACIPropertiesSwitch<Adapter> modelSwitch =
		new BACIPropertiesSwitch<Adapter>() {
			@Override
			public Adapter caseCharacteristicComponent(CharacteristicComponent object) {
				return createCharacteristicComponentAdapter();
			}
			@Override
			public Adapter caseCharacteristicModel(CharacteristicModel object) {
				return createCharacteristicModelAdapter();
			}
			@Override
			public Adapter casePboolean(Pboolean object) {
				return createPbooleanAdapter();
			}
			@Override
			public Adapter casePboolean1(Pboolean1 object) {
				return createPboolean1Adapter();
			}
			@Override
			public Adapter casePbooleanSeq(PbooleanSeq object) {
				return createPbooleanSeqAdapter();
			}
			@Override
			public Adapter casePbooleanSeq1(PbooleanSeq1 object) {
				return createPbooleanSeq1Adapter();
			}
			@Override
			public Adapter casePdouble(Pdouble object) {
				return createPdoubleAdapter();
			}
			@Override
			public Adapter casePdouble1(Pdouble1 object) {
				return createPdouble1Adapter();
			}
			@Override
			public Adapter casePdoubleSeq(PdoubleSeq object) {
				return createPdoubleSeqAdapter();
			}
			@Override
			public Adapter casePdoubleSeq1(PdoubleSeq1 object) {
				return createPdoubleSeq1Adapter();
			}
			@Override
			public Adapter casePEnum(PEnum object) {
				return createPEnumAdapter();
			}
			@Override
			public Adapter casePEnum1(PEnum1 object) {
				return createPEnum1Adapter();
			}
			@Override
			public Adapter casePfloat(Pfloat object) {
				return createPfloatAdapter();
			}
			@Override
			public Adapter casePfloat1(Pfloat1 object) {
				return createPfloat1Adapter();
			}
			@Override
			public Adapter casePfloatSeq(PfloatSeq object) {
				return createPfloatSeqAdapter();
			}
			@Override
			public Adapter casePfloatSeq1(PfloatSeq1 object) {
				return createPfloatSeq1Adapter();
			}
			@Override
			public Adapter casePlong(Plong object) {
				return createPlongAdapter();
			}
			@Override
			public Adapter casePlong1(Plong1 object) {
				return createPlong1Adapter();
			}
			@Override
			public Adapter casePlongLong(PlongLong object) {
				return createPlongLongAdapter();
			}
			@Override
			public Adapter casePlongLong1(PlongLong1 object) {
				return createPlongLong1Adapter();
			}
			@Override
			public Adapter casePlongSeq(PlongSeq object) {
				return createPlongSeqAdapter();
			}
			@Override
			public Adapter casePlongSeq1(PlongSeq1 object) {
				return createPlongSeq1Adapter();
			}
			@Override
			public Adapter casePpattern(Ppattern object) {
				return createPpatternAdapter();
			}
			@Override
			public Adapter casePpattern1(Ppattern1 object) {
				return createPpattern1Adapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter casePstring(Pstring object) {
				return createPstringAdapter();
			}
			@Override
			public Adapter casePstring1(Pstring1 object) {
				return createPstring1Adapter();
			}
			@Override
			public Adapter casePstringSeq(PstringSeq object) {
				return createPstringSeqAdapter();
			}
			@Override
			public Adapter casePstringSeq1(PstringSeq1 object) {
				return createPstringSeq1Adapter();
			}
			@Override
			public Adapter casePuLong(PuLong object) {
				return createPuLongAdapter();
			}
			@Override
			public Adapter casePuLong1(PuLong1 object) {
				return createPuLong1Adapter();
			}
			@Override
			public Adapter casePuLongLong(PuLongLong object) {
				return createPuLongLongAdapter();
			}
			@Override
			public Adapter casePuLongLong1(PuLongLong1 object) {
				return createPuLongLong1Adapter();
			}
			@Override
			public Adapter casePuLongSeq(PuLongSeq object) {
				return createPuLongSeqAdapter();
			}
			@Override
			public Adapter casePuLongSeq1(PuLongSeq1 object) {
				return createPuLongSeq1Adapter();
			}
			@Override
			public Adapter caseROboolean(ROboolean object) {
				return createRObooleanAdapter();
			}
			@Override
			public Adapter caseRObooleanSeq(RObooleanSeq object) {
				return createRObooleanSeqAdapter();
			}
			@Override
			public Adapter caseROdouble(ROdouble object) {
				return createROdoubleAdapter();
			}
			@Override
			public Adapter caseROdoubleSeq(ROdoubleSeq object) {
				return createROdoubleSeqAdapter();
			}
			@Override
			public Adapter caseROEnum(ROEnum object) {
				return createROEnumAdapter();
			}
			@Override
			public Adapter caseROfloat(ROfloat object) {
				return createROfloatAdapter();
			}
			@Override
			public Adapter caseROfloatSeq(ROfloatSeq object) {
				return createROfloatSeqAdapter();
			}
			@Override
			public Adapter caseROlong(ROlong object) {
				return createROlongAdapter();
			}
			@Override
			public Adapter caseROlongLong(ROlongLong object) {
				return createROlongLongAdapter();
			}
			@Override
			public Adapter caseROlongSeq(ROlongSeq object) {
				return createROlongSeqAdapter();
			}
			@Override
			public Adapter caseROpattern(ROpattern object) {
				return createROpatternAdapter();
			}
			@Override
			public Adapter caseROstring(ROstring object) {
				return createROstringAdapter();
			}
			@Override
			public Adapter caseROstringSeq(ROstringSeq object) {
				return createROstringSeqAdapter();
			}
			@Override
			public Adapter caseROuLong(ROuLong object) {
				return createROuLongAdapter();
			}
			@Override
			public Adapter caseROuLongLong(ROuLongLong object) {
				return createROuLongLongAdapter();
			}
			@Override
			public Adapter caseROuLongSeq(ROuLongSeq object) {
				return createROuLongSeqAdapter();
			}
			@Override
			public Adapter caseRWboolean(RWboolean object) {
				return createRWbooleanAdapter();
			}
			@Override
			public Adapter caseRWbooleanSeq(RWbooleanSeq object) {
				return createRWbooleanSeqAdapter();
			}
			@Override
			public Adapter caseRWdouble(RWdouble object) {
				return createRWdoubleAdapter();
			}
			@Override
			public Adapter caseRWdoubleSeq(RWdoubleSeq object) {
				return createRWdoubleSeqAdapter();
			}
			@Override
			public Adapter caseRWEnum(RWEnum object) {
				return createRWEnumAdapter();
			}
			@Override
			public Adapter caseRWfloat(RWfloat object) {
				return createRWfloatAdapter();
			}
			@Override
			public Adapter caseRWfloatSeq(RWfloatSeq object) {
				return createRWfloatSeqAdapter();
			}
			@Override
			public Adapter caseRWlong(RWlong object) {
				return createRWlongAdapter();
			}
			@Override
			public Adapter caseRWlongLong(RWlongLong object) {
				return createRWlongLongAdapter();
			}
			@Override
			public Adapter caseRWlongSeq(RWlongSeq object) {
				return createRWlongSeqAdapter();
			}
			@Override
			public Adapter caseRWpattern(RWpattern object) {
				return createRWpatternAdapter();
			}
			@Override
			public Adapter caseRWstring(RWstring object) {
				return createRWstringAdapter();
			}
			@Override
			public Adapter caseRWuLong(RWuLong object) {
				return createRWuLongAdapter();
			}
			@Override
			public Adapter caseRWuLongLong(RWuLongLong object) {
				return createRWuLongLongAdapter();
			}
			@Override
			public Adapter caseRWuLongSeq(RWuLongSeq object) {
				return createRWuLongSeqAdapter();
			}
			@Override
			public Adapter caseTypelessProperty(TypelessProperty object) {
				return createTypelessPropertyAdapter();
			}
			@Override
			public Adapter casePropertyDefinition(PropertyDefinition object) {
				return createPropertyDefinitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.CharacteristicComponent <em>Characteristic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.CharacteristicComponent
	 * @generated
	 */
	public Adapter createCharacteristicComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.CharacteristicModel <em>Characteristic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.CharacteristicModel
	 * @generated
	 */
	public Adapter createCharacteristicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pboolean <em>Pboolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pboolean
	 * @generated
	 */
	public Adapter createPbooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pboolean1 <em>Pboolean1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pboolean1
	 * @generated
	 */
	public Adapter createPboolean1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PbooleanSeq <em>Pboolean Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq
	 * @generated
	 */
	public Adapter createPbooleanSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PbooleanSeq1 <em>Pboolean Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PbooleanSeq1
	 * @generated
	 */
	public Adapter createPbooleanSeq1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pdouble <em>Pdouble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pdouble
	 * @generated
	 */
	public Adapter createPdoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pdouble1 <em>Pdouble1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pdouble1
	 * @generated
	 */
	public Adapter createPdouble1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PdoubleSeq <em>Pdouble Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq
	 * @generated
	 */
	public Adapter createPdoubleSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PdoubleSeq1 <em>Pdouble Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PdoubleSeq1
	 * @generated
	 */
	public Adapter createPdoubleSeq1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PEnum <em>PEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PEnum
	 * @generated
	 */
	public Adapter createPEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PEnum1 <em>PEnum1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PEnum1
	 * @generated
	 */
	public Adapter createPEnum1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pfloat <em>Pfloat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pfloat
	 * @generated
	 */
	public Adapter createPfloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pfloat1 <em>Pfloat1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pfloat1
	 * @generated
	 */
	public Adapter createPfloat1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PfloatSeq <em>Pfloat Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PfloatSeq
	 * @generated
	 */
	public Adapter createPfloatSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PfloatSeq1 <em>Pfloat Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PfloatSeq1
	 * @generated
	 */
	public Adapter createPfloatSeq1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Plong <em>Plong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Plong
	 * @generated
	 */
	public Adapter createPlongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Plong1 <em>Plong1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Plong1
	 * @generated
	 */
	public Adapter createPlong1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PlongLong <em>Plong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PlongLong
	 * @generated
	 */
	public Adapter createPlongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PlongLong1 <em>Plong Long1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PlongLong1
	 * @generated
	 */
	public Adapter createPlongLong1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PlongSeq <em>Plong Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PlongSeq
	 * @generated
	 */
	public Adapter createPlongSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PlongSeq1 <em>Plong Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PlongSeq1
	 * @generated
	 */
	public Adapter createPlongSeq1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Ppattern <em>Ppattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Ppattern
	 * @generated
	 */
	public Adapter createPpatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Ppattern1 <em>Ppattern1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Ppattern1
	 * @generated
	 */
	public Adapter createPpattern1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pstring <em>Pstring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pstring
	 * @generated
	 */
	public Adapter createPstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.Pstring1 <em>Pstring1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.Pstring1
	 * @generated
	 */
	public Adapter createPstring1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PstringSeq <em>Pstring Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PstringSeq
	 * @generated
	 */
	public Adapter createPstringSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PstringSeq1 <em>Pstring Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PstringSeq1
	 * @generated
	 */
	public Adapter createPstringSeq1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PuLong <em>Pu Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PuLong
	 * @generated
	 */
	public Adapter createPuLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PuLong1 <em>Pu Long1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PuLong1
	 * @generated
	 */
	public Adapter createPuLong1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PuLongLong <em>Pu Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PuLongLong
	 * @generated
	 */
	public Adapter createPuLongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PuLongLong1 <em>Pu Long Long1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PuLongLong1
	 * @generated
	 */
	public Adapter createPuLongLong1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PuLongSeq <em>Pu Long Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PuLongSeq
	 * @generated
	 */
	public Adapter createPuLongSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.PuLongSeq1 <em>Pu Long Seq1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.PuLongSeq1
	 * @generated
	 */
	public Adapter createPuLongSeq1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROboolean <em>ROboolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROboolean
	 * @generated
	 */
	public Adapter createRObooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RObooleanSeq <em>ROboolean Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RObooleanSeq
	 * @generated
	 */
	public Adapter createRObooleanSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROdouble <em>ROdouble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROdouble
	 * @generated
	 */
	public Adapter createROdoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROdoubleSeq <em>ROdouble Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROdoubleSeq
	 * @generated
	 */
	public Adapter createROdoubleSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROEnum <em>RO Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROEnum
	 * @generated
	 */
	public Adapter createROEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROfloat <em>ROfloat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROfloat
	 * @generated
	 */
	public Adapter createROfloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROfloatSeq <em>ROfloat Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROfloatSeq
	 * @generated
	 */
	public Adapter createROfloatSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROlong <em>ROlong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROlong
	 * @generated
	 */
	public Adapter createROlongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROlongLong <em>ROlong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROlongLong
	 * @generated
	 */
	public Adapter createROlongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROlongSeq <em>ROlong Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROlongSeq
	 * @generated
	 */
	public Adapter createROlongSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROpattern <em>ROpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROpattern
	 * @generated
	 */
	public Adapter createROpatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROstring <em>ROstring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROstring
	 * @generated
	 */
	public Adapter createROstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROstringSeq <em>ROstring Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROstringSeq
	 * @generated
	 */
	public Adapter createROstringSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROuLong <em>ROu Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROuLong
	 * @generated
	 */
	public Adapter createROuLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROuLongLong <em>ROu Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROuLongLong
	 * @generated
	 */
	public Adapter createROuLongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.ROuLongSeq <em>ROu Long Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.ROuLongSeq
	 * @generated
	 */
	public Adapter createROuLongSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWboolean <em>RWboolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWboolean
	 * @generated
	 */
	public Adapter createRWbooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWbooleanSeq <em>RWboolean Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWbooleanSeq
	 * @generated
	 */
	public Adapter createRWbooleanSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWdouble <em>RWdouble</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWdouble
	 * @generated
	 */
	public Adapter createRWdoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWdoubleSeq <em>RWdouble Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWdoubleSeq
	 * @generated
	 */
	public Adapter createRWdoubleSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWEnum <em>RW Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWEnum
	 * @generated
	 */
	public Adapter createRWEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWfloat <em>RWfloat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWfloat
	 * @generated
	 */
	public Adapter createRWfloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWfloatSeq <em>RWfloat Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWfloatSeq
	 * @generated
	 */
	public Adapter createRWfloatSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWlong <em>RWlong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWlong
	 * @generated
	 */
	public Adapter createRWlongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWlongLong <em>RWlong Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWlongLong
	 * @generated
	 */
	public Adapter createRWlongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWlongSeq <em>RWlong Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWlongSeq
	 * @generated
	 */
	public Adapter createRWlongSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWpattern <em>RWpattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWpattern
	 * @generated
	 */
	public Adapter createRWpatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWstring <em>RWstring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWstring
	 * @generated
	 */
	public Adapter createRWstringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWuLong <em>RWu Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWuLong
	 * @generated
	 */
	public Adapter createRWuLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWuLongLong <em>RWu Long Long</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWuLongLong
	 * @generated
	 */
	public Adapter createRWuLongLongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.RWuLongSeq <em>RWu Long Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.RWuLongSeq
	 * @generated
	 */
	public Adapter createRWuLongSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BACIProperties.TypelessProperty <em>Typeless Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BACIProperties.TypelessProperty
	 * @generated
	 */
	public Adapter createTypelessPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.PropertyDefinition
	 * @generated
	 */
	public Adapter createPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BACIPropertiesAdapterFactory
