/**
 */
package baciCodeGen.BACI.tests;

import baciCodeGen.BACI.BACIFactory;
import baciCodeGen.BACI.RWuLongSeq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RWu Long Seq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RWuLongSeqTest extends PuLongSeq1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RWuLongSeqTest.class);
	}

	/**
	 * Constructs a new RWu Long Seq test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWuLongSeqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RWu Long Seq test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RWuLongSeq getFixture() {
		return (RWuLongSeq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIFactory.eINSTANCE.createRWuLongSeq());
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

} //RWuLongSeqTest
