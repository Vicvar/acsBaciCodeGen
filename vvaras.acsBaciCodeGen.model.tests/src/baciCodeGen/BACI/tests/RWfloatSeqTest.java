/**
 */
package baciCodeGen.BACI.tests;

import baciCodeGen.BACI.BACIFactory;
import baciCodeGen.BACI.RWfloatSeq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RWfloat Seq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RWfloatSeqTest extends PfloatSeq1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RWfloatSeqTest.class);
	}

	/**
	 * Constructs a new RWfloat Seq test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWfloatSeqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RWfloat Seq test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RWfloatSeq getFixture() {
		return (RWfloatSeq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIFactory.eINSTANCE.createRWfloatSeq());
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

} //RWfloatSeqTest
