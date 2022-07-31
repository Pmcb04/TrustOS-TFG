/**
 */
package TraceabilityMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getAttribute()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/attribute.svg'"
 * @generated
 */
public interface Attribute extends Property {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link TraceabilityMM.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see TraceabilityMM.EType
	 * @see #setType(EType)
	 * @see TraceabilityMM.TraceabilityMMPackage#getAttribute_Type()
	 * @model required="true"
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see TraceabilityMM.EType
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

} // Attribute
