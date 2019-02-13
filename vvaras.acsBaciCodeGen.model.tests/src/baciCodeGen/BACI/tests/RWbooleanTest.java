/**
 */
package baciCodeGen.BACI.tests;

import baciCodeGen.BACI.BACIFactory;
import baciCodeGen.BACI.RWboolean;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RWboolean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RWbooleanTest extends Pboolean1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RWbooleanTest.class);
	}

	/**
	 * Constructs a new RWboolean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWbooleanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RWboolean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RWboolean getFixture() {
		return (RWboolean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIFactory.eINSTANCE.createRWboolean());
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

} //RWbooleanTest
