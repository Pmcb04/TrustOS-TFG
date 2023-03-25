/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.ProductConf#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getProductConf()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 *        annotation="gmf.node label='type' border.width='0' border.color='0,174,102' border.style='solid' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/productConf.svg' tool.name='Product Configuration' tool.description='Create a configuration for product'"
 * @generated
 */
public interface ProductConf extends Asset {

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Product}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Product#getProductconf <em>Productconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getProductConf_Product()
	 * @see TraceabilityMM.Product#getProductconf
	 * @model opposite="productconf" required="true"
	 * @generated
	 */
	EList<Product> getProduct();
} // ProductConf
