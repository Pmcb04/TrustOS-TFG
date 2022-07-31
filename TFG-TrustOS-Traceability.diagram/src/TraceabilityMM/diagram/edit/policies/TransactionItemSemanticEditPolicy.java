/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
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
public class TransactionItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransactionItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2007);
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
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
					.getVisualID(incomingLink) == TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(
					incomingLink) == TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
					.getVisualID(incomingLink) == TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID) {
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
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
					.getVisualID(outgoingLink) == TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(
					outgoingLink) == TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID) {
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
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005 == req.getElementType()) {
			return null;
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4007 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionTransactionconfCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_4003 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionNextCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionSubtransaction_4009 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionSubtransactionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.RolAccessCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4007 == req
				.getElementType()) {
			return null;
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_4003 == req.getElementType()) {
			return null;
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionSubtransaction_4009 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionSubtransactionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_4002 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ProductNextCreateCommand(req, req.getSource(),
					req.getTarget()));
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
		case TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.RolAccessReorientCommand(req));
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			return getGEFWrapper(
					new TraceabilityMM.diagram.edit.commands.TransactionTransactionconfReorientCommand(req));
		case TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID:
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionNextReorientCommand(req));
		case TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID:
			return getGEFWrapper(
					new TraceabilityMM.diagram.edit.commands.TransactionSubtransactionReorientCommand(req));
		case TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID:
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ProductNextReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
