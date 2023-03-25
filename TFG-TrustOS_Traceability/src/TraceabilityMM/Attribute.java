/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Attribute#getValues <em>Values</em>}</li>
 *   <li>{@link TraceabilityMM.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getAttribute()
 * @model annotation="gmf.node label='id' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/attribute.svg' tool.name='Attribute' tool.description='Create a attribute in a configuration'"
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

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link TraceabilityMM.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getAttribute_Values()
	 * @model containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='list'"
	 * @generated
	 */
	EList<Value> getValues();

} // Attribute
