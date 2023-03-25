/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Rol#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link TraceabilityMM.Rol#getRolconf <em>Rolconf</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getRol()
 * @model annotation="gmf.node label='assetID' label.icon='false' figure='svg' svg.uri='platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/rol.svg'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface Rol extends Node {
	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getRol_Permissions()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='211,18,192'"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Rolconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolconf</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolconf</em>' reference.
	 * @see #setRolconf(RolConf)
	 * @see TraceabilityMM.TraceabilityMMPackage#getRol_Rolconf()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='220,31,31'"
	 * @generated
	 */
	RolConf getRolconf();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Rol#getRolconf <em>Rolconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolconf</em>' reference.
	 * @see #getRolconf()
	 * @generated
	 */
	void setRolconf(RolConf value);

} // Rol
