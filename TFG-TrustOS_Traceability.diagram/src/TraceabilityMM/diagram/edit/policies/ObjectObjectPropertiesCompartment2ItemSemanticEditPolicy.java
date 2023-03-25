/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ObjectObjectPropertiesCompartment2ItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ObjectObjectPropertiesCompartment2ItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3003 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.Attribute2CreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.Object2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
