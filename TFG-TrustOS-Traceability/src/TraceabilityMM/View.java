/**
 */
package TraceabilityMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.View#isView_all <em>View all</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getView()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/view.svg'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface View extends Permission {
	/**
	 * Returns the value of the '<em><b>View all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View all</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View all</em>' attribute.
	 * @see #setView_all(boolean)
	 * @see TraceabilityMM.TraceabilityMMPackage#getView_View_all()
	 * @model
	 * @generated
	 */
	boolean isView_all();

	/**
	 * Sets the value of the '{@link TraceabilityMM.View#isView_all <em>View all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View all</em>' attribute.
	 * @see #isView_all()
	 * @generated
	 */
	void setView_all(boolean value);

} // View
