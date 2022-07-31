/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link TraceabilityMM.Rol#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getRol()
 * @model annotation="gmf.node label='assetID' border.width='0' border.color='220,31,31' border.style='solid'"
 *        annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='MomentInterval'"
 * @generated
 */
public interface Rol extends Asset {
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
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='220,31,31'"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getRol_Access()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='220,31,31'"
	 * @generated
	 */
	EList<Node> getAccess();

} // Rol
