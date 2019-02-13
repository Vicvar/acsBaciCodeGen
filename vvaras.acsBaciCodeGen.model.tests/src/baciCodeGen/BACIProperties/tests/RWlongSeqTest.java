/**
 */
package baciCodeGen.BACIProperties.tests;

import baciCodeGen.BACIProperties.BACIPropertiesFactory;
import baciCodeGen.BACIProperties.RWlongSeq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RWlong Seq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RWlongSeqTest extends PlongSeq1Test {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RWlongSeqTest.class);
	}

	/**
	 * Constructs a new RWlong Seq test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWlongSeqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RWlong Seq test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RWlongSeq getFixture() {
		return (RWlongSeq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIPropertiesFactory.eINSTANCE.createRWlongSeq());
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

} //RWlongSeqTest
