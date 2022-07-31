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
 *   <li>{@link TraceabilityMM.Product#getNext <em>Next</em>}</li>
 *   <li>{@link TraceabilityMM.Product#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getProduct()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/product.svg'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Product extends Node {
	/**
	 * Returns the value of the '<em><b>Productconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productconf</em>' reference.
	 * @see #setProductconf(ProductConf)
	 * @see TraceabilityMM.TraceabilityMMPackage#getProduct_Productconf()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,174,101'"
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
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Transaction}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Transaction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getProduct_Next()
	 * @see TraceabilityMM.Transaction#getPrevious
	 * @model opposite="previous"
	 *        annotation="gmf.link source='previous' source.decoration='closedarrow' target='next' target.decoration='filledclosedarrow' style='solid'"
	 * @generated
	 */
	EList<Transaction> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Transaction}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Transaction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getProduct_Previous()
	 * @see TraceabilityMM.Transaction#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Transaction> getPrevious();

} // Product
