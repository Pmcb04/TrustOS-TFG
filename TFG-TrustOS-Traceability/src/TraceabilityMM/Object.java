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
 * @model annotation="gmf.node label='name' border.width='0' border.color='236,239,66' border.style='solid'"
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
	 *        annotation="gmf.compartment collapsible='true' layout='free'"
	 * @generated
	 */
	EList<Property> getProperties();

} // Object
