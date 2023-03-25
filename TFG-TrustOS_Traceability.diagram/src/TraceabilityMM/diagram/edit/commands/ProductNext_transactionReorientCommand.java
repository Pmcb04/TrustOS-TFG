/*
 * 
 */
package TraceabilityMM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ProductNext_transactionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ProductNext_transactionReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof TraceabilityMM.Product) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof TraceabilityMM.Transaction && newEnd instanceof TraceabilityMM.Product)) {
			return false;
		}
		return TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistProductNext_transaction_4004(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TraceabilityMM.Transaction && newEnd instanceof TraceabilityMM.Transaction)) {
			return false;
		}
		return TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistProductNext_transaction_4004(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getNext_transaction().remove(getOldTarget());
		getNewSource().getNext_transaction().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getNext_transaction().remove(getOldTarget());
		getOldSource().getNext_transaction().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Product getOldSource() {
		return (TraceabilityMM.Product) referenceOwner;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Product getNewSource() {
		return (TraceabilityMM.Product) newEnd;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Transaction getOldTarget() {
		return (TraceabilityMM.Transaction) oldEnd;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Transaction getNewTarget() {
		return (TraceabilityMM.Transaction) newEnd;
	}
}
