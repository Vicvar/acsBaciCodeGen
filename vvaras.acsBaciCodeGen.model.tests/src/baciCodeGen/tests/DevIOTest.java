/**
 */
package baciCodeGen.tests;

import baciCodeGen.BaciCodeGenFactory;
import baciCodeGen.DevIO;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dev IO</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevIOTest extends TestCase {

	/**
	 * The fixture for this Dev IO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevIO fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevIOTest.class);
	}

	/**
	 * Constructs a new Dev IO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevIOTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dev IO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DevIO fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dev IO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevIO getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaciCodeGenFactory.eINSTANCE.createDevIO());
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

} //DevIOTest
