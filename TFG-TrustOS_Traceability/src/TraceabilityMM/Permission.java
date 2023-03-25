/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Permission#getRefers <em>Refers</em>}</li>
 *   <li>{@link TraceabilityMM.Permission#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getPermission()
 * @model annotation="gmf.node label='name' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/permission.svg' tool.name='Permission to do all' tool.description='Create a permission to do all for a rol'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface Permission extends EObject {
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
	 * @see TraceabilityMM.TraceabilityMMPackage#getPermission_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Permission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Refers</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Property}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Property#getAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getPermission_Refers()
	 * @see TraceabilityMM.Property#getAllow
	 * @model opposite="allow" required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='192,192,192' tool.name='Properties allow' tool.description='Link the properties that the permission allow'"
	 * @generated
	 */
	EList<Property> getRefers();

} // Permission
