/*
* 
*/
package TraceabilityMM.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SystemItemSemanticEditPolicy
		extends TraceabilityMM.diagram.edit.policies.TraceabilityMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SystemItemSemanticEditPolicy() {
		super(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.System_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TemporalTransaction_2016 == req
				.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TemporalTransactionCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ProductCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.TransactionConfCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2004 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ProductConfCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.RolConfCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.EditCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.CreateCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.ViewCreateCommand(req));
		}
		if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013 == req.getElementType()) {
			return getGEFWrapper(new TraceabilityMM.diagram.edit.commands.PermissionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
