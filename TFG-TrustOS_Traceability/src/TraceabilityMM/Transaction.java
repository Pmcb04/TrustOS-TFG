/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Transaction#getTransactionconf <em>Transactionconf</em>}</li>
 *   <li>{@link TraceabilityMM.Transaction#getNext_product <em>Next product</em>}</li>
 *   <li>{@link TraceabilityMM.Transaction#getPrevious_product <em>Previous product</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/transaction.svg' tool.name='Transaction' tool.description='Create a transaction'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Transaction extends Node {
	/**
	 * Returns the value of the '<em><b>Transactionconf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.TransactionConf#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactionconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactionconf</em>' reference.
	 * @see #setTransactionconf(TransactionConf)
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Transactionconf()
	 * @see TraceabilityMM.TransactionConf#getTransaction
	 * @model opposite="transaction" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,38,175' tool.name='Transaction configuration' tool.description='Link a transaction to it configuration'"
	 * @generated
	 */
	TransactionConf getTransactionconf();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Transaction#getTransactionconf <em>Transactionconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transactionconf</em>' reference.
	 * @see #getTransactionconf()
	 * @generated
	 */
	void setTransactionconf(TransactionConf value);

	/**
	 * Returns the value of the '<em><b>Previous product</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Product}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Product#getNext_transaction <em>Next transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous product</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Previous_product()
	 * @see TraceabilityMM.Product#getNext_transaction
	 * @model opposite="next_transaction"
	 * @generated
	 */
	EList<Product> getPrevious_product();

	/**
	 * Returns the value of the '<em><b>Next product</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Product}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Product#getPrevious_transaction <em>Previous transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next product</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Next_product()
	 * @see TraceabilityMM.Product#getPrevious_transaction
	 * @model opposite="previous_transaction" required="true"
	 *        annotation="gmf.link source='previous_transaction' target='next_product' target.decoration='filledclosedarrow' style='solid' color='0,0,0' tool.name='Next product' tool.description='Link the transaction to next product'"
	 * @generated
	 */
	EList<Product> getNext_product();

} // Transaction
