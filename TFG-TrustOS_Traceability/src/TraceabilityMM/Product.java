/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Product#getProductconf <em>Productconf</em>}</li>
 *   <li>{@link TraceabilityMM.Product#getPrevious_transaction <em>Previous transaction</em>}</li>
 *   <li>{@link TraceabilityMM.Product#getNext_transaction <em>Next transaction</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getProduct()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' label.placement='external' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/product.svg' tool.name='Product' tool.description='Create a product'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Product extends Node {
	/**
	 * Returns the value of the '<em><b>Productconf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.ProductConf#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productconf</em>' reference.
	 * @see #setProductconf(ProductConf)
	 * @see TraceabilityMM.TraceabilityMMPackage#getProduct_Productconf()
	 * @see TraceabilityMM.ProductConf#getProduct
	 * @model opposite="product" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,174,102' tool.name='Product configuration' tool.description='Link a product to it configuration'"
	 * @generated
	 */
	ProductConf getProductconf();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Product#getProductconf <em>Productconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productconf</em>' reference.
	 * @see #getProductconf()
	 * @generated
	 */
	void setProductconf(ProductConf value);

	/**
	 * Returns the value of the '<em><b>Next transaction</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Transaction}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Transaction#getPrevious_product <em>Previous product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next transaction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next transaction</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getProduct_Next_transaction()
	 * @see TraceabilityMM.Transaction#getPrevious_product
	 * @model opposite="previous_product"
	 *        annotation="gmf.link source='previous_product' target='next_transaction' target.decoration='filledclosedarrow' style='solid' color='0,0,0' tool.name='Next transaction' tool.description='Link the product to next transaction'"
	 * @generated
	 */
	EList<Transaction> getNext_transaction();

	/**
	 * Returns the value of the '<em><b>Previous transaction</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Transaction}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Transaction#getNext_product <em>Next product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous transaction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous transaction</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getProduct_Previous_transaction()
	 * @see TraceabilityMM.Transaction#getNext_product
	 * @model opposite="next_product"
	 * @generated
	 */
	EList<Transaction> getPrevious_transaction();

} // Product
