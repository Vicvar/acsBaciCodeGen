/**
 */
package baciCodeGen.BACI.util;

import baciCodeGen.BACI.*;

import baciCodeGen.BaciCharacteristics;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see baciCodeGen.BACI.BACIPackage
 * @generated
 */
public class BACISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BACIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACISwitch() {
		if (modelPackage == null) {
			modelPackage = BACIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BACIPackage.CHARACTERISTIC_COMPONENT: {
				CharacteristicComponent characteristicComponent = (CharacteristicComponent)theEObject;
				T result = caseCharacteristicComponent(characteristicComponent);
				if (result == null) result = caseCharacteristicModel(characteristicComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.CHARACTERISTIC_MODEL: {
				CharacteristicModel characteristicModel = (CharacteristicModel)theEObject;
				T result = caseCharacteristicModel(characteristicModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PBOOLEAN: {
				Pboolean pboolean = (Pboolean)theEObject;
				T result = casePboolean(pboolean);
				if (result == null) result = caseTypelessProperty(pboolean);
				if (result == null) result = caseProperty(pboolean);
				if (result == null) result = caseCharacteristicModel(pboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PBOOLEAN1: {
				Pboolean1 pboolean1 = (Pboolean1)theEObject;
				T result = casePboolean1(pboolean1);
				if (result == null) result = casePboolean(pboolean1);
				if (result == null) result = caseTypelessProperty(pboolean1);
				if (result == null) result = caseProperty(pboolean1);
				if (result == null) result = caseCharacteristicModel(pboolean1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PBOOLEAN_SEQ: {
				PbooleanSeq pbooleanSeq = (PbooleanSeq)theEObject;
				T result = casePbooleanSeq(pbooleanSeq);
				if (result == null) result = caseTypelessProperty(pbooleanSeq);
				if (result == null) result = caseProperty(pbooleanSeq);
				if (result == null) result = caseCharacteristicModel(pbooleanSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PBOOLEAN_SEQ1: {
				PbooleanSeq1 pbooleanSeq1 = (PbooleanSeq1)theEObject;
				T result = casePbooleanSeq1(pbooleanSeq1);
				if (result == null) result = casePbooleanSeq(pbooleanSeq1);
				if (result == null) result = caseTypelessProperty(pbooleanSeq1);
				if (result == null) result = caseProperty(pbooleanSeq1);
				if (result == null) result = caseCharacteristicModel(pbooleanSeq1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PDOUBLE: {
				Pdouble pdouble = (Pdouble)theEObject;
				T result = casePdouble(pdouble);
				if (result == null) result = caseTypelessProperty(pdouble);
				if (result == null) result = caseProperty(pdouble);
				if (result == null) result = caseCharacteristicModel(pdouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PDOUBLE1: {
				Pdouble1 pdouble1 = (Pdouble1)theEObject;
				T result = casePdouble1(pdouble1);
				if (result == null) result = casePdouble(pdouble1);
				if (result == null) result = caseTypelessProperty(pdouble1);
				if (result == null) result = caseProperty(pdouble1);
				if (result == null) result = caseCharacteristicModel(pdouble1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PDOUBLE_SEQ: {
				PdoubleSeq pdoubleSeq = (PdoubleSeq)theEObject;
				T result = casePdoubleSeq(pdoubleSeq);
				if (result == null) result = caseTypelessProperty(pdoubleSeq);
				if (result == null) result = caseProperty(pdoubleSeq);
				if (result == null) result = caseCharacteristicModel(pdoubleSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PDOUBLE_SEQ1: {
				PdoubleSeq1 pdoubleSeq1 = (PdoubleSeq1)theEObject;
				T result = casePdoubleSeq1(pdoubleSeq1);
				if (result == null) result = casePdoubleSeq(pdoubleSeq1);
				if (result == null) result = caseTypelessProperty(pdoubleSeq1);
				if (result == null) result = caseProperty(pdoubleSeq1);
				if (result == null) result = caseCharacteristicModel(pdoubleSeq1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PENUM: {
				PEnum pEnum = (PEnum)theEObject;
				T result = casePEnum(pEnum);
				if (result == null) result = caseTypelessProperty(pEnum);
				if (result == null) result = caseProperty(pEnum);
				if (result == null) result = caseCharacteristicModel(pEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PENUM1: {
				PEnum1 pEnum1 = (PEnum1)theEObject;
				T result = casePEnum1(pEnum1);
				if (result == null) result = casePEnum(pEnum1);
				if (result == null) result = caseTypelessProperty(pEnum1);
				if (result == null) result = caseProperty(pEnum1);
				if (result == null) result = caseCharacteristicModel(pEnum1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PFLOAT: {
				Pfloat pfloat = (Pfloat)theEObject;
				T result = casePfloat(pfloat);
				if (result == null) result = caseTypelessProperty(pfloat);
				if (result == null) result = caseProperty(pfloat);
				if (result == null) result = caseCharacteristicModel(pfloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PFLOAT1: {
				Pfloat1 pfloat1 = (Pfloat1)theEObject;
				T result = casePfloat1(pfloat1);
				if (result == null) result = casePfloat(pfloat1);
				if (result == null) result = caseTypelessProperty(pfloat1);
				if (result == null) result = caseProperty(pfloat1);
				if (result == null) result = caseCharacteristicModel(pfloat1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PFLOAT_SEQ: {
				PfloatSeq pfloatSeq = (PfloatSeq)theEObject;
				T result = casePfloatSeq(pfloatSeq);
				if (result == null) result = caseTypelessProperty(pfloatSeq);
				if (result == null) result = caseProperty(pfloatSeq);
				if (result == null) result = caseCharacteristicModel(pfloatSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PFLOAT_SEQ1: {
				PfloatSeq1 pfloatSeq1 = (PfloatSeq1)theEObject;
				T result = casePfloatSeq1(pfloatSeq1);
				if (result == null) result = casePfloatSeq(pfloatSeq1);
				if (result == null) result = caseTypelessProperty(pfloatSeq1);
				if (result == null) result = caseProperty(pfloatSeq1);
				if (result == null) result = caseCharacteristicModel(pfloatSeq1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PLONG: {
				Plong plong = (Plong)theEObject;
				T result = casePlong(plong);
				if (result == null) result = caseTypelessProperty(plong);
				if (result == null) result = caseProperty(plong);
				if (result == null) result = caseCharacteristicModel(plong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PLONG1: {
				Plong1 plong1 = (Plong1)theEObject;
				T result = casePlong1(plong1);
				if (result == null) result = casePlong(plong1);
				if (result == null) result = caseTypelessProperty(plong1);
				if (result == null) result = caseProperty(plong1);
				if (result == null) result = caseCharacteristicModel(plong1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PLONG_LONG: {
				PlongLong plongLong = (PlongLong)theEObject;
				T result = casePlongLong(plongLong);
				if (result == null) result = caseTypelessProperty(plongLong);
				if (result == null) result = caseProperty(plongLong);
				if (result == null) result = caseCharacteristicModel(plongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PLONG_LONG1: {
				PlongLong1 plongLong1 = (PlongLong1)theEObject;
				T result = casePlongLong1(plongLong1);
				if (result == null) result = casePlongLong(plongLong1);
				if (result == null) result = caseTypelessProperty(plongLong1);
				if (result == null) result = caseProperty(plongLong1);
				if (result == null) result = caseCharacteristicModel(plongLong1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PLONG_SEQ: {
				PlongSeq plongSeq = (PlongSeq)theEObject;
				T result = casePlongSeq(plongSeq);
				if (result == null) result = caseTypelessProperty(plongSeq);
				if (result == null) result = caseProperty(plongSeq);
				if (result == null) result = caseCharacteristicModel(plongSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PLONG_SEQ1: {
				PlongSeq1 plongSeq1 = (PlongSeq1)theEObject;
				T result = casePlongSeq1(plongSeq1);
				if (result == null) result = casePlongSeq(plongSeq1);
				if (result == null) result = caseTypelessProperty(plongSeq1);
				if (result == null) result = caseProperty(plongSeq1);
				if (result == null) result = caseCharacteristicModel(plongSeq1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PPATTERN: {
				Ppattern ppattern = (Ppattern)theEObject;
				T result = casePpattern(ppattern);
				if (result == null) result = caseTypelessProperty(ppattern);
				if (result == null) result = caseProperty(ppattern);
				if (result == null) result = caseCharacteristicModel(ppattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PPATTERN1: {
				Ppattern1 ppattern1 = (Ppattern1)theEObject;
				T result = casePpattern1(ppattern1);
				if (result == null) result = casePpattern(ppattern1);
				if (result == null) result = caseTypelessProperty(ppattern1);
				if (result == null) result = caseProperty(ppattern1);
				if (result == null) result = caseCharacteristicModel(ppattern1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseCharacteristicModel(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PSTRING: {
				Pstring pstring = (Pstring)theEObject;
				T result = casePstring(pstring);
				if (result == null) result = caseTypelessProperty(pstring);
				if (result == null) result = caseProperty(pstring);
				if (result == null) result = caseCharacteristicModel(pstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PSTRING1: {
				Pstring1 pstring1 = (Pstring1)theEObject;
				T result = casePstring1(pstring1);
				if (result == null) result = casePstring(pstring1);
				if (result == null) result = caseTypelessProperty(pstring1);
				if (result == null) result = caseProperty(pstring1);
				if (result == null) result = caseCharacteristicModel(pstring1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PSTRING_SEQ: {
				PstringSeq pstringSeq = (PstringSeq)theEObject;
				T result = casePstringSeq(pstringSeq);
				if (result == null) result = caseTypelessProperty(pstringSeq);
				if (result == null) result = caseProperty(pstringSeq);
				if (result == null) result = caseCharacteristicModel(pstringSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PSTRING_SEQ1: {
				PstringSeq1 pstringSeq1 = (PstringSeq1)theEObject;
				T result = casePstringSeq1(pstringSeq1);
				if (result == null) result = casePstringSeq(pstringSeq1);
				if (result == null) result = caseTypelessProperty(pstringSeq1);
				if (result == null) result = caseProperty(pstringSeq1);
				if (result == null) result = caseCharacteristicModel(pstringSeq1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PU_LONG: {
				PuLong puLong = (PuLong)theEObject;
				T result = casePuLong(puLong);
				if (result == null) result = caseTypelessProperty(puLong);
				if (result == null) result = caseProperty(puLong);
				if (result == null) result = caseCharacteristicModel(puLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PU_LONG1: {
				PuLong1 puLong1 = (PuLong1)theEObject;
				T result = casePuLong1(puLong1);
				if (result == null) result = casePuLong(puLong1);
				if (result == null) result = caseTypelessProperty(puLong1);
				if (result == null) result = caseProperty(puLong1);
				if (result == null) result = caseCharacteristicModel(puLong1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PU_LONG_LONG: {
				PuLongLong puLongLong = (PuLongLong)theEObject;
				T result = casePuLongLong(puLongLong);
				if (result == null) result = caseTypelessProperty(puLongLong);
				if (result == null) result = caseProperty(puLongLong);
				if (result == null) result = caseCharacteristicModel(puLongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PU_LONG_LONG1: {
				PuLongLong1 puLongLong1 = (PuLongLong1)theEObject;
				T result = casePuLongLong1(puLongLong1);
				if (result == null) result = casePuLongLong(puLongLong1);
				if (result == null) result = caseTypelessProperty(puLongLong1);
				if (result == null) result = caseProperty(puLongLong1);
				if (result == null) result = caseCharacteristicModel(puLongLong1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PU_LONG_SEQ: {
				PuLongSeq puLongSeq = (PuLongSeq)theEObject;
				T result = casePuLongSeq(puLongSeq);
				if (result == null) result = caseTypelessProperty(puLongSeq);
				if (result == null) result = caseProperty(puLongSeq);
				if (result == null) result = caseCharacteristicModel(puLongSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.PU_LONG_SEQ1: {
				PuLongSeq1 puLongSeq1 = (PuLongSeq1)theEObject;
				T result = casePuLongSeq1(puLongSeq1);
				if (result == null) result = casePuLongSeq(puLongSeq1);
				if (result == null) result = caseTypelessProperty(puLongSeq1);
				if (result == null) result = caseProperty(puLongSeq1);
				if (result == null) result = caseCharacteristicModel(puLongSeq1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROBOOLEAN: {
				ROboolean rOboolean = (ROboolean)theEObject;
				T result = caseROboolean(rOboolean);
				if (result == null) result = casePboolean1(rOboolean);
				if (result == null) result = caseBaciCharacteristics(rOboolean);
				if (result == null) result = casePboolean(rOboolean);
				if (result == null) result = caseTypelessProperty(rOboolean);
				if (result == null) result = caseProperty(rOboolean);
				if (result == null) result = caseCharacteristicModel(rOboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROBOOLEAN_SEQ: {
				RObooleanSeq rObooleanSeq = (RObooleanSeq)theEObject;
				T result = caseRObooleanSeq(rObooleanSeq);
				if (result == null) result = casePbooleanSeq1(rObooleanSeq);
				if (result == null) result = caseBaciCharacteristics(rObooleanSeq);
				if (result == null) result = casePbooleanSeq(rObooleanSeq);
				if (result == null) result = caseTypelessProperty(rObooleanSeq);
				if (result == null) result = caseProperty(rObooleanSeq);
				if (result == null) result = caseCharacteristicModel(rObooleanSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RODOUBLE: {
				ROdouble rOdouble = (ROdouble)theEObject;
				T result = caseROdouble(rOdouble);
				if (result == null) result = casePdouble1(rOdouble);
				if (result == null) result = caseBaciCharacteristics(rOdouble);
				if (result == null) result = casePdouble(rOdouble);
				if (result == null) result = caseTypelessProperty(rOdouble);
				if (result == null) result = caseProperty(rOdouble);
				if (result == null) result = caseCharacteristicModel(rOdouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RODOUBLE_SEQ: {
				ROdoubleSeq rOdoubleSeq = (ROdoubleSeq)theEObject;
				T result = caseROdoubleSeq(rOdoubleSeq);
				if (result == null) result = casePdoubleSeq1(rOdoubleSeq);
				if (result == null) result = caseBaciCharacteristics(rOdoubleSeq);
				if (result == null) result = casePdoubleSeq(rOdoubleSeq);
				if (result == null) result = caseTypelessProperty(rOdoubleSeq);
				if (result == null) result = caseProperty(rOdoubleSeq);
				if (result == null) result = caseCharacteristicModel(rOdoubleSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RO_ENUM: {
				ROEnum roEnum = (ROEnum)theEObject;
				T result = caseROEnum(roEnum);
				if (result == null) result = casePEnum1(roEnum);
				if (result == null) result = casePEnum(roEnum);
				if (result == null) result = caseTypelessProperty(roEnum);
				if (result == null) result = caseProperty(roEnum);
				if (result == null) result = caseCharacteristicModel(roEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROFLOAT: {
				ROfloat rOfloat = (ROfloat)theEObject;
				T result = caseROfloat(rOfloat);
				if (result == null) result = casePfloat1(rOfloat);
				if (result == null) result = caseBaciCharacteristics(rOfloat);
				if (result == null) result = casePfloat(rOfloat);
				if (result == null) result = caseTypelessProperty(rOfloat);
				if (result == null) result = caseProperty(rOfloat);
				if (result == null) result = caseCharacteristicModel(rOfloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROFLOAT_SEQ: {
				ROfloatSeq rOfloatSeq = (ROfloatSeq)theEObject;
				T result = caseROfloatSeq(rOfloatSeq);
				if (result == null) result = casePfloatSeq1(rOfloatSeq);
				if (result == null) result = caseBaciCharacteristics(rOfloatSeq);
				if (result == null) result = casePfloatSeq(rOfloatSeq);
				if (result == null) result = caseTypelessProperty(rOfloatSeq);
				if (result == null) result = caseProperty(rOfloatSeq);
				if (result == null) result = caseCharacteristicModel(rOfloatSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROLONG: {
				ROlong rOlong = (ROlong)theEObject;
				T result = caseROlong(rOlong);
				if (result == null) result = casePlong1(rOlong);
				if (result == null) result = caseBaciCharacteristics(rOlong);
				if (result == null) result = casePlong(rOlong);
				if (result == null) result = caseTypelessProperty(rOlong);
				if (result == null) result = caseProperty(rOlong);
				if (result == null) result = caseCharacteristicModel(rOlong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROLONG_LONG: {
				ROlongLong rOlongLong = (ROlongLong)theEObject;
				T result = caseROlongLong(rOlongLong);
				if (result == null) result = casePlongLong1(rOlongLong);
				if (result == null) result = caseBaciCharacteristics(rOlongLong);
				if (result == null) result = casePlongLong(rOlongLong);
				if (result == null) result = caseTypelessProperty(rOlongLong);
				if (result == null) result = caseProperty(rOlongLong);
				if (result == null) result = caseCharacteristicModel(rOlongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROLONG_SEQ: {
				ROlongSeq rOlongSeq = (ROlongSeq)theEObject;
				T result = caseROlongSeq(rOlongSeq);
				if (result == null) result = casePlongSeq1(rOlongSeq);
				if (result == null) result = caseBaciCharacteristics(rOlongSeq);
				if (result == null) result = casePlongSeq(rOlongSeq);
				if (result == null) result = caseTypelessProperty(rOlongSeq);
				if (result == null) result = caseProperty(rOlongSeq);
				if (result == null) result = caseCharacteristicModel(rOlongSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROPATTERN: {
				ROpattern rOpattern = (ROpattern)theEObject;
				T result = caseROpattern(rOpattern);
				if (result == null) result = casePpattern1(rOpattern);
				if (result == null) result = caseBaciCharacteristics(rOpattern);
				if (result == null) result = casePpattern(rOpattern);
				if (result == null) result = caseTypelessProperty(rOpattern);
				if (result == null) result = caseProperty(rOpattern);
				if (result == null) result = caseCharacteristicModel(rOpattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROSTRING: {
				ROstring rOstring = (ROstring)theEObject;
				T result = caseROstring(rOstring);
				if (result == null) result = casePstring1(rOstring);
				if (result == null) result = caseBaciCharacteristics(rOstring);
				if (result == null) result = casePstring(rOstring);
				if (result == null) result = caseTypelessProperty(rOstring);
				if (result == null) result = caseProperty(rOstring);
				if (result == null) result = caseCharacteristicModel(rOstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROSTRING_SEQ: {
				ROstringSeq rOstringSeq = (ROstringSeq)theEObject;
				T result = caseROstringSeq(rOstringSeq);
				if (result == null) result = casePstringSeq1(rOstringSeq);
				if (result == null) result = caseBaciCharacteristics(rOstringSeq);
				if (result == null) result = casePstringSeq(rOstringSeq);
				if (result == null) result = caseTypelessProperty(rOstringSeq);
				if (result == null) result = caseProperty(rOstringSeq);
				if (result == null) result = caseCharacteristicModel(rOstringSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROU_LONG: {
				ROuLong rOuLong = (ROuLong)theEObject;
				T result = caseROuLong(rOuLong);
				if (result == null) result = casePuLong1(rOuLong);
				if (result == null) result = caseBaciCharacteristics(rOuLong);
				if (result == null) result = casePuLong(rOuLong);
				if (result == null) result = caseTypelessProperty(rOuLong);
				if (result == null) result = caseProperty(rOuLong);
				if (result == null) result = caseCharacteristicModel(rOuLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROU_LONG_LONG: {
				ROuLongLong rOuLongLong = (ROuLongLong)theEObject;
				T result = caseROuLongLong(rOuLongLong);
				if (result == null) result = casePuLongLong1(rOuLongLong);
				if (result == null) result = caseBaciCharacteristics(rOuLongLong);
				if (result == null) result = casePuLongLong(rOuLongLong);
				if (result == null) result = caseTypelessProperty(rOuLongLong);
				if (result == null) result = caseProperty(rOuLongLong);
				if (result == null) result = caseCharacteristicModel(rOuLongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.ROU_LONG_SEQ: {
				ROuLongSeq rOuLongSeq = (ROuLongSeq)theEObject;
				T result = caseROuLongSeq(rOuLongSeq);
				if (result == null) result = casePuLongSeq1(rOuLongSeq);
				if (result == null) result = caseBaciCharacteristics(rOuLongSeq);
				if (result == null) result = casePuLongSeq(rOuLongSeq);
				if (result == null) result = caseTypelessProperty(rOuLongSeq);
				if (result == null) result = caseProperty(rOuLongSeq);
				if (result == null) result = caseCharacteristicModel(rOuLongSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWBOOLEAN: {
				RWboolean rWboolean = (RWboolean)theEObject;
				T result = caseRWboolean(rWboolean);
				if (result == null) result = casePboolean1(rWboolean);
				if (result == null) result = caseBaciCharacteristics(rWboolean);
				if (result == null) result = casePboolean(rWboolean);
				if (result == null) result = caseTypelessProperty(rWboolean);
				if (result == null) result = caseProperty(rWboolean);
				if (result == null) result = caseCharacteristicModel(rWboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWBOOLEAN_SEQ: {
				RWbooleanSeq rWbooleanSeq = (RWbooleanSeq)theEObject;
				T result = caseRWbooleanSeq(rWbooleanSeq);
				if (result == null) result = casePbooleanSeq1(rWbooleanSeq);
				if (result == null) result = caseBaciCharacteristics(rWbooleanSeq);
				if (result == null) result = casePbooleanSeq(rWbooleanSeq);
				if (result == null) result = caseTypelessProperty(rWbooleanSeq);
				if (result == null) result = caseProperty(rWbooleanSeq);
				if (result == null) result = caseCharacteristicModel(rWbooleanSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWDOUBLE: {
				RWdouble rWdouble = (RWdouble)theEObject;
				T result = caseRWdouble(rWdouble);
				if (result == null) result = casePdouble1(rWdouble);
				if (result == null) result = caseBaciCharacteristics(rWdouble);
				if (result == null) result = casePdouble(rWdouble);
				if (result == null) result = caseTypelessProperty(rWdouble);
				if (result == null) result = caseProperty(rWdouble);
				if (result == null) result = caseCharacteristicModel(rWdouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWDOUBLE_SEQ: {
				RWdoubleSeq rWdoubleSeq = (RWdoubleSeq)theEObject;
				T result = caseRWdoubleSeq(rWdoubleSeq);
				if (result == null) result = casePdoubleSeq1(rWdoubleSeq);
				if (result == null) result = caseBaciCharacteristics(rWdoubleSeq);
				if (result == null) result = casePdoubleSeq(rWdoubleSeq);
				if (result == null) result = caseTypelessProperty(rWdoubleSeq);
				if (result == null) result = caseProperty(rWdoubleSeq);
				if (result == null) result = caseCharacteristicModel(rWdoubleSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RW_ENUM: {
				RWEnum rwEnum = (RWEnum)theEObject;
				T result = caseRWEnum(rwEnum);
				if (result == null) result = casePEnum1(rwEnum);
				if (result == null) result = casePEnum(rwEnum);
				if (result == null) result = caseTypelessProperty(rwEnum);
				if (result == null) result = caseProperty(rwEnum);
				if (result == null) result = caseCharacteristicModel(rwEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWFLOAT: {
				RWfloat rWfloat = (RWfloat)theEObject;
				T result = caseRWfloat(rWfloat);
				if (result == null) result = casePfloat1(rWfloat);
				if (result == null) result = caseBaciCharacteristics(rWfloat);
				if (result == null) result = casePfloat(rWfloat);
				if (result == null) result = caseTypelessProperty(rWfloat);
				if (result == null) result = caseProperty(rWfloat);
				if (result == null) result = caseCharacteristicModel(rWfloat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWFLOAT_SEQ: {
				RWfloatSeq rWfloatSeq = (RWfloatSeq)theEObject;
				T result = caseRWfloatSeq(rWfloatSeq);
				if (result == null) result = casePfloatSeq1(rWfloatSeq);
				if (result == null) result = caseBaciCharacteristics(rWfloatSeq);
				if (result == null) result = casePfloatSeq(rWfloatSeq);
				if (result == null) result = caseTypelessProperty(rWfloatSeq);
				if (result == null) result = caseProperty(rWfloatSeq);
				if (result == null) result = caseCharacteristicModel(rWfloatSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWLONG: {
				RWlong rWlong = (RWlong)theEObject;
				T result = caseRWlong(rWlong);
				if (result == null) result = casePlong1(rWlong);
				if (result == null) result = caseBaciCharacteristics(rWlong);
				if (result == null) result = casePlong(rWlong);
				if (result == null) result = caseTypelessProperty(rWlong);
				if (result == null) result = caseProperty(rWlong);
				if (result == null) result = caseCharacteristicModel(rWlong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWLONG_LONG: {
				RWlongLong rWlongLong = (RWlongLong)theEObject;
				T result = caseRWlongLong(rWlongLong);
				if (result == null) result = casePlongLong1(rWlongLong);
				if (result == null) result = caseBaciCharacteristics(rWlongLong);
				if (result == null) result = casePlongLong(rWlongLong);
				if (result == null) result = caseTypelessProperty(rWlongLong);
				if (result == null) result = caseProperty(rWlongLong);
				if (result == null) result = caseCharacteristicModel(rWlongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWLONG_SEQ: {
				RWlongSeq rWlongSeq = (RWlongSeq)theEObject;
				T result = caseRWlongSeq(rWlongSeq);
				if (result == null) result = casePlongSeq1(rWlongSeq);
				if (result == null) result = caseBaciCharacteristics(rWlongSeq);
				if (result == null) result = casePlongSeq(rWlongSeq);
				if (result == null) result = caseTypelessProperty(rWlongSeq);
				if (result == null) result = caseProperty(rWlongSeq);
				if (result == null) result = caseCharacteristicModel(rWlongSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWPATTERN: {
				RWpattern rWpattern = (RWpattern)theEObject;
				T result = caseRWpattern(rWpattern);
				if (result == null) result = casePpattern1(rWpattern);
				if (result == null) result = caseBaciCharacteristics(rWpattern);
				if (result == null) result = casePpattern(rWpattern);
				if (result == null) result = caseTypelessProperty(rWpattern);
				if (result == null) result = caseProperty(rWpattern);
				if (result == null) result = caseCharacteristicModel(rWpattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWSTRING: {
				RWstring rWstring = (RWstring)theEObject;
				T result = caseRWstring(rWstring);
				if (result == null) result = casePstring1(rWstring);
				if (result == null) result = caseBaciCharacteristics(rWstring);
				if (result == null) result = casePstring(rWstring);
				if (result == null) result = caseTypelessProperty(rWstring);
				if (result == null) result = caseProperty(rWstring);
				if (result == null) result = caseCharacteristicModel(rWstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWU_LONG: {
				RWuLong rWuLong = (RWuLong)theEObject;
				T result = caseRWuLong(rWuLong);
				if (result == null) result = casePuLong1(rWuLong);
				if (result == null) result = caseBaciCharacteristics(rWuLong);
				if (result == null) result = casePuLong(rWuLong);
				if (result == null) result = caseTypelessProperty(rWuLong);
				if (result == null) result = caseProperty(rWuLong);
				if (result == null) result = caseCharacteristicModel(rWuLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWU_LONG_LONG: {
				RWuLongLong rWuLongLong = (RWuLongLong)theEObject;
				T result = caseRWuLongLong(rWuLongLong);
				if (result == null) result = casePuLongLong1(rWuLongLong);
				if (result == null) result = caseBaciCharacteristics(rWuLongLong);
				if (result == null) result = casePuLongLong(rWuLongLong);
				if (result == null) result = caseTypelessProperty(rWuLongLong);
				if (result == null) result = caseProperty(rWuLongLong);
				if (result == null) result = caseCharacteristicModel(rWuLongLong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.RWU_LONG_SEQ: {
				RWuLongSeq rWuLongSeq = (RWuLongSeq)theEObject;
				T result = caseRWuLongSeq(rWuLongSeq);
				if (result == null) result = casePuLongSeq1(rWuLongSeq);
				if (result == null) result = caseBaciCharacteristics(rWuLongSeq);
				if (result == null) result = casePuLongSeq(rWuLongSeq);
				if (result == null) result = caseTypelessProperty(rWuLongSeq);
				if (result == null) result = caseProperty(rWuLongSeq);
				if (result == null) result = caseCharacteristicModel(rWuLongSeq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BACIPackage.TYPELESS_PROPERTY: {
				TypelessProperty typelessProperty = (TypelessProperty)theEObject;
				T result = caseTypelessProperty(typelessProperty);
				if (result == null) result = caseProperty(typelessProperty);
				if (result == null) result = caseCharacteristicModel(typelessProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicComponent(CharacteristicComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristicModel(CharacteristicModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pboolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pboolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePboolean(Pboolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pboolean1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pboolean1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePboolean1(Pboolean1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pboolean Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pboolean Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePbooleanSeq(PbooleanSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pboolean Seq1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pboolean Seq1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePbooleanSeq1(PbooleanSeq1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pdouble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pdouble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePdouble(Pdouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pdouble1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pdouble1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePdouble1(Pdouble1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pdouble Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pdouble Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePdoubleSeq(PdoubleSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pdouble Seq1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pdouble Seq1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePdoubleSeq1(PdoubleSeq1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEnum(PEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PEnum1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PEnum1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePEnum1(PEnum1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfloat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfloat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePfloat(Pfloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfloat1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfloat1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePfloat1(Pfloat1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfloat Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfloat Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePfloatSeq(PfloatSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pfloat Seq1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pfloat Seq1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePfloatSeq1(PfloatSeq1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlong(Plong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plong1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plong1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlong1(Plong1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plong Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plong Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlongLong(PlongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plong Long1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plong Long1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlongLong1(PlongLong1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plong Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plong Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlongSeq(PlongSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plong Seq1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plong Seq1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlongSeq1(PlongSeq1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ppattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ppattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePpattern(Ppattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ppattern1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ppattern1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePpattern1(Ppattern1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pstring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pstring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePstring(Pstring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pstring1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pstring1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePstring1(Pstring1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pstring Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pstring Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePstringSeq(PstringSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pstring Seq1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pstring Seq1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePstringSeq1(PstringSeq1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuLong(PuLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Long1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Long1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuLong1(PuLong1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Long Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Long Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuLongLong(PuLongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Long Long1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Long Long1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuLongLong1(PuLongLong1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Long Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Long Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuLongSeq(PuLongSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pu Long Seq1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pu Long Seq1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePuLongSeq1(PuLongSeq1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROboolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROboolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROboolean(ROboolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROboolean Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROboolean Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRObooleanSeq(RObooleanSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROdouble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROdouble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROdouble(ROdouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROdouble Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROdouble Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROdoubleSeq(ROdoubleSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RO Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RO Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROEnum(ROEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROfloat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROfloat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROfloat(ROfloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROfloat Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROfloat Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROfloatSeq(ROfloatSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROlong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROlong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROlong(ROlong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROlong Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROlong Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROlongLong(ROlongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROlong Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROlong Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROlongSeq(ROlongSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROpattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROpattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROpattern(ROpattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROstring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROstring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROstring(ROstring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROstring Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROstring Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROstringSeq(ROstringSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROu Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROu Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROuLong(ROuLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROu Long Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROu Long Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROuLongLong(ROuLongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROu Long Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROu Long Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROuLongSeq(ROuLongSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWboolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWboolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWboolean(RWboolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWboolean Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWboolean Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWbooleanSeq(RWbooleanSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWdouble</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWdouble</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWdouble(RWdouble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWdouble Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWdouble Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWdoubleSeq(RWdoubleSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RW Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RW Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWEnum(RWEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWfloat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWfloat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWfloat(RWfloat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWfloat Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWfloat Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWfloatSeq(RWfloatSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWlong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWlong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWlong(RWlong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWlong Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWlong Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWlongLong(RWlongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWlong Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWlong Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWlongSeq(RWlongSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWpattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWpattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWpattern(RWpattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWstring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWstring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWstring(RWstring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWu Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWu Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWuLong(RWuLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWu Long Long</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWu Long Long</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWuLongLong(RWuLongLong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RWu Long Seq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RWu Long Seq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRWuLongSeq(RWuLongSeq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typeless Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typeless Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypelessProperty(TypelessProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baci Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baci Characteristics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaciCharacteristics(BaciCharacteristics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BACISwitch
