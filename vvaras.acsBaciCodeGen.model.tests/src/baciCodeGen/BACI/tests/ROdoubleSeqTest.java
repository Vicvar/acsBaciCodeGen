/**
 */
package baciCodeGen.BACI.tests;

import baciCodeGen.BACI.BACIFactory;
import baciCodeGen.BACI.ROdoubleSeq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ROdouble Seq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ROdoubleSeqTest extends PdoubleSeq1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ROdoubleSeqTest.class);
	}

	/**
	 * Constructs a new ROdouble Seq test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROdoubleSeqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ROdouble Seq test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ROdoubleSeq getFixture() {
		return (ROdoubleSeq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIFactory.eINSTANCE.createROdoubleSeq());
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

} //ROdoubleSeqTest
