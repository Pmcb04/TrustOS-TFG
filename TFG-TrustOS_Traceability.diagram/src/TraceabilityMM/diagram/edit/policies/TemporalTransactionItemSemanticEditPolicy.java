/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TemporalTransactionItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TemporalTransactionItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TemporalTransaction_2016);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(
					incomingLink) == TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(
					outgoingLink) == TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(
					outgoingLink) == TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionTransactionconfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionNext_productCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001 == req
				.getElementType()) {
			return null;
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002 == req
				.getElementType()) {
			return null;
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ProductNext_transactionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			return getGEFWrapper(
					new TraceabilityMM.diagram.edit.commands.TransactionTransactionconfReorientCommand(req));
		case TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID:
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionNext_productReorientCommand(req));
		case TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID:
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ProductNext_transactionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}