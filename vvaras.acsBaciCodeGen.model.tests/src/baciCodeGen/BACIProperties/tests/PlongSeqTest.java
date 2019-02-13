/**
 */
package baciCodeGen.BACIProperties.tests;

import baciCodeGen.BACIProperties.BACIPropertiesFactory;
import baciCodeGen.BACIProperties.PlongSeq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Plong Seq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlongSeqTest extends TypelessPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlongSeqTest.class);
	}

	/**
	 * Constructs a new Plong Seq test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlongSeqTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Plong Seq test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlongSeq getFixture() {
		return (PlongSeq)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIPropertiesFactory.eINSTANCE.createPlongSeq());
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

} //PlongSeqTest
