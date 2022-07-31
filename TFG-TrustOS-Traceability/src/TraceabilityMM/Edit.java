/**
 */
package TraceabilityMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Edit#isEdit_all <em>Edit all</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getEdit()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/edit.svg'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface Edit extends Permission {
	/**
	 * Returns the value of the '<em><b>Edit all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit all</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit all</em>' attribute.
	 * @see #setEdit_all(boolean)
	 * @see TraceabilityMM.TraceabilityMMPackage#getEdit_Edit_all()
	 * @model
	 * @generated
	 */
	boolean isEdit_all();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Edit#isEdit_all <em>Edit all</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit all</em>' attribute.
	 * @see #isEdit_all()
	 * @generated
	 */
	void setEdit_all(boolean value);

} // Edit
