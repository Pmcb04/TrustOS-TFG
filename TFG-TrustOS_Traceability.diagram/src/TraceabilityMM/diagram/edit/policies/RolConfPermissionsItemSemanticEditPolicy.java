/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class RolConfPermissionsItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RolConfPermissionsItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
