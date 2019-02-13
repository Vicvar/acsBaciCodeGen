/**
 */
package baciCodeGen.BACIProperties.tests;

import baciCodeGen.BACIProperties.BACIPropertiesFactory;
import baciCodeGen.BACIProperties.TypelessProperty;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Typeless Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypelessPropertyTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TypelessPropertyTest.class);
	}

	/**
	 * Constructs a new Typeless Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypelessPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Typeless Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TypelessProperty getFixture() {
		return (TypelessProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BACIPropertiesFactory.eINSTANCE.createTypelessProperty());
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

} //TypelessPropertyTest
