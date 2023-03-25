/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.TransactionConf#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link TraceabilityMM.TransactionConf#isFinal <em>Final</em>}</li>
 *   <li>{@link TraceabilityMM.TransactionConf#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link TraceabilityMM.TransactionConf#isIsTransactionInfinite <em>Is Transaction Infinite</em>}</li>
 *   <li>{@link TraceabilityMM.TransactionConf#isIsTransactionFinal <em>Is Transaction Final</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getTransactionConf()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 *        annotation="gmf.node label='type' border.width='0' border.color='0,38,175' border.style='solid' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/transactionConf.svg' tool.name='Transaction Configuration' tool.description='Create a configuration for transaction'"
 * @generated
 */
public interface TransactionConf extends Asset {

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(int)
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransactionConf_Repeat()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRepeat();

	/**
	 * Sets the value of the '{@link TraceabilityMM.TransactionConf#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(int value);

	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Transaction}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Transaction#getTransactionconf <em>Transactionconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransactionConf_Transaction()
	 * @see TraceabilityMM.Transaction#getTransactionconf
	 * @model opposite="transactionconf" required="true"
	 * @generated
	 */
	EList<Transaction> getTransaction();

	/**
	 * Returns the value of the '<em><b>Is Transaction Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transaction Infinite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transaction Infinite</em>' attribute.
	 * @see #setIsTransactionInfinite(boolean)
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransactionConf_IsTransactionInfinite()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.repeat = -1'"
	 * @generated
	 */
	boolean isIsTransactionInfinite();

	/**
	 * Sets the value of the '{@link TraceabilityMM.TransactionConf#isIsTransactionInfinite <em>Is Transaction Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transaction Infinite</em>' attribute.
	 * @see #isIsTransactionInfinite()
	 * @generated
	 */
	void setIsTransactionInfinite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Transaction Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Transaction Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Transaction Final</em>' attribute.
	 * @see #setIsTransactionFinal(boolean)
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransactionConf_IsTransactionFinal()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.final'"
	 * @generated
	 */
	boolean isIsTransactionFinal();

	/**
	 * Sets the value of the '{@link TraceabilityMM.TransactionConf#isIsTransactionFinal <em>Is Transaction Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transaction Final</em>' attribute.
	 * @see #isIsTransactionFinal()
	 * @generated
	 */
	void setIsTransactionFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see TraceabilityMM.TraceabilityMMPackage#getTransactionConf_Final()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link TraceabilityMM.TransactionConf#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);
} // TransactionConf
