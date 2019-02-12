/**
 */
package baciCodeGen.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>baciCodeGen</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaciCodeGenTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new BaciCodeGenTests("baciCodeGen Tests");
		suite.addTestSuite(InstanceTest.class);
		suite.addTestSuite(CharacteristicTest.class);
		suite.addTestSuite(BaciTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciCodeGenTests(String name) {
		super(name);
	}

} //BaciCodeGenTests
