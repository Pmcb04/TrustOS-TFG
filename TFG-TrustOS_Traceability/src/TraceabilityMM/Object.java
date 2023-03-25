/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Object#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getObject()
 * @model annotation="gmf.node label='id' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/objet.svg' tool.name='Object' tool.description='Create a object of attributes in a configuration'"
 * @generated
 */
public interface Object extends Property {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link TraceabilityMM.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getObject_Properties()
	 * @model containment="true" lower="2"
	 *        annotation="gmf.compartment collapsible='true' layout='list'"
	 * @generated
	 */
	EList<Property> getProperties();

} // Object
