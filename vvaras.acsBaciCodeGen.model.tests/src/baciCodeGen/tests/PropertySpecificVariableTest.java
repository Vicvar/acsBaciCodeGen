/**
 */
package baciCodeGen.tests;

import baciCodeGen.BaciCodeGenFactory;
import baciCodeGen.PropertySpecificVariable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Specific Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertySpecificVariableTest extends DevIOVariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertySpecificVariableTest.class);
	}

	/**
	 * Constructs a new Property Specific Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertySpecificVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Specific Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertySpecificVariable getFixture() {
		return (PropertySpecificVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BaciCodeGenFactory.eINSTANCE.createPropertySpecificVariable());
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

} //PropertySpecificVariableTest
