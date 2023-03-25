/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rol Conf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.RolConf#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getRolConf()
 * @model annotation="gmf.node label='type' border.width='0' border.color='220,31,31' border.style='solid' svg.uri='platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/rolConf.svg' tool.name='Rol Configuration' tool.description='Create a configuration for rol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='onePermissionTotal noMoreOneEdit noMoreOneView noMoreOneCreate'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot onePermissionTotal='self.permissions-&gt;selectByType(Permission)-&gt;size() &lt;= 1' noMoreOneEdit='self.permissions-&gt;selectByType(Edit)-&gt;size() &lt;= 1' noMoreOneView='self.permissions-&gt;selectByType(View)-&gt;size() &lt;= 1' noMoreOneCreate='self.permissions-&gt;selectByType(Create)-&gt;size() &lt;= 1'"
 * @generated
 */
public interface RolConf extends Asset {

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
	 * @see TraceabilityMM.TraceabilityMMPackage#getRolConf_Permissions()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash' color='220,31,31' tool.name='Permission of a rol' tool.description='Link the rol to it permissions'"
	 * @generated
	 */
	EList<Permission> getPermissions();
} // RolConf
