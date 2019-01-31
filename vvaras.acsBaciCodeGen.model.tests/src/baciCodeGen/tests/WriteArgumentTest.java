/**
 */
package baciCodeGen.tests;

import baciCodeGen.BaciCodeGenFactory;
import baciCodeGen.WriteArgument;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Write Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WriteArgumentTest extends DevIOArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WriteArgumentTest.class);
	}

	/**
	 * Constructs a new Write Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Write Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WriteArgument getFixture() {
		return (WriteArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaciCodeGenFactory.eINSTANCE.createWriteArgument());
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

} //WriteArgumentTest
