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
 *   <li>{@link TraceabilityMM.Transaction#getPrevious <em>Previous</em>}</li>
 *   <li>{@link TraceabilityMM.Transaction#getNext <em>Next</em>}</li>
 *   <li>{@link TraceabilityMM.Transaction#getSubtransaction <em>Subtransaction</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/transaction.svg'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Description'"
 * @generated
 */
public interface Transaction extends Node {
	/**
	 * Returns the value of the '<em><b>Transactionconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transactionconf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactionconf</em>' reference.
	 * @see #setTransactionconf(TransactionConf)
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Transactionconf()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='0,38,174'"
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
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Product}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Product#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Previous()
	 * @see TraceabilityMM.Product#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<Product> getPrevious();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Product}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Product#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Next()
	 * @see TraceabilityMM.Product#getPrevious
	 * @model opposite="previous" required="true"
	 *        annotation="gmf.link source='previous' source.decoration='closedarrow' target='next' target.decoration='filledclosedarrow' style='solid'"
	 * @generated
	 */
	EList<Product> getNext();

	/**
	 * Returns the value of the '<em><b>Subtransaction</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Transaction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtransaction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtransaction</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransaction_Subtransaction()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash' color='0,38,174'"
	 * @generated
	 */
	EList<Transaction> getSubtransaction();

} // Transaction
