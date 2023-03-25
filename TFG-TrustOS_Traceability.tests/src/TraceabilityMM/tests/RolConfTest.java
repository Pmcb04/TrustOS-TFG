/**
 */
package TraceabilityMM.tests;

import TraceabilityMM.RolConf;
import TraceabilityMM.TraceabilityMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rol Conf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RolConfTest extends AssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RolConfTest.class);
	}

	/**
	 * Constructs a new Rol Conf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolConfTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rol Conf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RolConf getFixture() {
		return (RolConf)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceabilityMMFactory.eINSTANCE.createRolConf());
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

} //RolConfTest
