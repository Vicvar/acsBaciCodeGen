/**
 */
package baciCodeGen.BACI.tests;

import baciCodeGen.BACI.BACIFactory;
import baciCodeGen.BACI.ROfloat;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ROfloat</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ROfloatTest extends Pfloat1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ROfloatTest.class);
	}

	/**
	 * Constructs a new ROfloat test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROfloatTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ROfloat test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ROfloat getFixture() {
		return (ROfloat)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIFactory.eINSTANCE.createROfloat());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ROfloatTest
