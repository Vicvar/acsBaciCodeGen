/**
 */
package baciCodeGen.BACIProperties.tests;

import baciCodeGen.BACIProperties.BACIPropertiesFactory;
import baciCodeGen.BACIProperties.RWdoubleSeq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RWdouble Seq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RWdoubleSeqTest extends PdoubleSeq1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RWdoubleSeqTest.class);
	}

	/**
	 * Constructs a new RWdouble Seq test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWdoubleSeqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RWdouble Seq test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RWdoubleSeq getFixture() {
		return (RWdoubleSeq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIPropertiesFactory.eINSTANCE.createRWdoubleSeq());
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

} //RWdoubleSeqTest
