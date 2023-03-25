/**
 */
package TraceabilityMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Counter#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link TraceabilityMM.Counter#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getCounter()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/counter.svg'"
 * @generated
 */
public interface Counter extends EObject {
	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(int)
	 * @see TraceabilityMM.TraceabilityMMPackage#getCounter_Repeat()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getRepeat();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Counter#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TraceabilityMM.TraceabilityMMPackage#getCounter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Counter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Counter
