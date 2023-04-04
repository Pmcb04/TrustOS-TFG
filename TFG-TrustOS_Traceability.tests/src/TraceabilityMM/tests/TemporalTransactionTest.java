/**
 */
package TraceabilityMM.tests;

import TraceabilityMM.TemporalTransaction;
import TraceabilityMM.TraceabilityMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Transaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalTransactionTest extends TransactionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalTransactionTest.class);
	}

	/**
	 * Constructs a new Temporal Transaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalTransactionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Temporal Transaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TemporalTransaction getFixture() {
		return (TemporalTransaction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceabilityMMFactory.eINSTANCE.createTemporalTransaction());
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

} //TemporalTransactionTest
