/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AttributeAttributeValuesCompartment2ItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AttributeAttributeValuesCompartment2ItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Value_3005 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ValueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
