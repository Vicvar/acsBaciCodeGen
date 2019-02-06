/**
 */
package baciCodeGen.tests;

import baciCodeGen.AuxiliaryVariable;
import baciCodeGen.BaciCodeGenFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Auxiliary Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuxiliaryVariableTest extends DevIOVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuxiliaryVariableTest.class);
	}

	/**
	 * Constructs a new Auxiliary Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxiliaryVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Auxiliary Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AuxiliaryVariable getFixture() {
		return (AuxiliaryVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaciCodeGenFactory.eINSTANCE.createAuxiliaryVariable());
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

} //AuxiliaryVariableTest
