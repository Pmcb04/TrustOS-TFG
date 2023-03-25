/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RolConfRolConfPropertiesCompartmentItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RolConfRolConfPropertiesCompartmentItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.AttributeCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ObjectCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
