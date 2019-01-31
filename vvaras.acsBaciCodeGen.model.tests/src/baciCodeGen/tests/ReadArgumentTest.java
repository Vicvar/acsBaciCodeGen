/**
 */
package baciCodeGen.tests;

import baciCodeGen.BaciCodeGenFactory;
import baciCodeGen.ReadArgument;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Read Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadArgumentTest extends DevIOArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReadArgumentTest.class);
	}

	/**
	 * Constructs a new Read Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Read Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReadArgument getFixture() {
		return (ReadArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaciCodeGenFactory.eINSTANCE.createReadArgument());
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

} //ReadArgumentTest
