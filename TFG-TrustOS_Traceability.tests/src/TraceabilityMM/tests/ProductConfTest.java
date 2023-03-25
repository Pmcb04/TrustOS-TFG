/**
 */
package TraceabilityMM.tests;

import TraceabilityMM.ProductConf;
import TraceabilityMM.TraceabilityMMFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Product Conf</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductConfTest extends AssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProductConfTest.class);
	}

	/**
	 * Constructs a new Product Conf test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductConfTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Product Conf test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProductConf getFixture() {
		return (ProductConf)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceabilityMMFactory.eINSTANCE.createProductConf());
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

} //ProductConfTest
