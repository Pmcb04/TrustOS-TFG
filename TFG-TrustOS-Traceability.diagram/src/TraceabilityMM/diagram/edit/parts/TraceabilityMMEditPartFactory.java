/*
 * 
 */
package TraceabilityMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class TraceabilityMMEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {

			case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.SystemEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolAssetIDEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolAssetIDEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionConfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionConfAssetIDEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionConfAssetIDEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductConfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductConfAssetIDEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductConfAssetIDEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ViewEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ViewNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.CreateEditPart(view);

			case TraceabilityMM.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.CreateNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.EditEditPart(view);

			case TraceabilityMM.diagram.edit.parts.EditNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.EditNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.PermissionEditPart(view);

			case TraceabilityMM.diagram.edit.parts.PermissionNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.PermissionNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeEditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.Attribute2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeName2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeName2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.Object2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectName2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectName2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolRolPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolRolPropertiesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart(
						view);

			case TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabelEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolAccessEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel3EditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel4EditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionNextEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel5EditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel6EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel7EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductNextEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel8EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel8EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
