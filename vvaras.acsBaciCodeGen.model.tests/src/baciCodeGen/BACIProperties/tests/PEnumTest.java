/**
 */
package baciCodeGen.BACIProperties.tests;

import baciCodeGen.BACIProperties.BACIPropertiesFactory;
import baciCodeGen.BACIProperties.PEnum;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>PEnum</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PEnumTest extends TypelessPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PEnumTest.class);
	}

	/**
	 * Constructs a new PEnum test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEnumTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this PEnum test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PEnum getFixture() {
		return (PEnum)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIPropertiesFactory.eINSTANCE.createPEnum());
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

} //PEnumTest
