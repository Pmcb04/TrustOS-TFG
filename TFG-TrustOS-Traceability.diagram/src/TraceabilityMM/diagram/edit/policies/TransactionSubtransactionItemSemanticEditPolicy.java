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
public class TransactionSubtransactionItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransactionSubtransactionItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionSubtransaction_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
