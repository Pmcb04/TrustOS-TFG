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
public class RolConfPermissionsReorientCommand extends EditElementCommand {

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
	public RolConfPermissionsReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof TraceabilityMM.RolConf) {
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
		if (!(oldEnd instanceof TraceabilityMM.Permission && newEnd instanceof TraceabilityMM.RolConf)) {
			return false;
		}
		return TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolConfPermissions_4008(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TraceabilityMM.Permission && newEnd instanceof TraceabilityMM.Permission)) {
			return false;
		}
		return TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolConfPermissions_4008(getOldSource(), getNewTarget());
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
		getOldSource().getPermissions().remove(getOldTarget());
		getNewSource().getPermissions().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getPermissions().remove(getOldTarget());
		getOldSource().getPermissions().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.RolConf getOldSource() {
		return (TraceabilityMM.RolConf) referenceOwner;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.RolConf getNewSource() {
		return (TraceabilityMM.RolConf) newEnd;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Permission getOldTarget() {
		return (TraceabilityMM.Permission) oldEnd;
	}

	/**
	* @generated
	*/
	protected TraceabilityMM.Permission getNewTarget() {
		return (TraceabilityMM.Permission) newEnd;
	}
}
