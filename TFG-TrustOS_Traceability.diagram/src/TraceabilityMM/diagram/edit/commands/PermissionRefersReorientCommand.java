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
public class PermissionRefersReorientCommand extends EditElementCommand {

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
	public PermissionRefersReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof TraceabilityMM.Permission) {
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
		if (!(oldEnd instanceof TraceabilityMM.Property && newEnd instanceof TraceabilityMM.Permission)) {
			return false;
		}
		return TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPermissionRefers_4005(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TraceabilityMM.Property && newEnd instanceof TraceabilityMM.Property)) {
			return false;
		}
		return TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistPermissionRefers_4005(getOldSource(), getNewTarget());
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
		getOldSource().getRefers().remove(getOldTarget());
		getNewSource().getRefers().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getRefers().remove(getOldTarget());
		getOldSource().getRefers().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Permission getOldSource() {
		return (TraceabilityMM.Permission) referenceOwner;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Permission getNewSource() {
		return (TraceabilityMM.Permission) newEnd;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Property getOldTarget() {
		return (TraceabilityMM.Property) oldEnd;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Property getNewTarget() {
		return (TraceabilityMM.Property) newEnd;
	}
}
