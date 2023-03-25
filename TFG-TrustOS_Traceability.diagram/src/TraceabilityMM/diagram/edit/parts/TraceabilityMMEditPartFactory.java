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

			case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionConfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionConfTypeEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionConfTypeEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductConfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductConfTypeEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductConfTypeEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolConfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolConfTypeEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolConfTypeEditPart(view);

			case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.EditEditPart(view);

			case TraceabilityMM.diagram.edit.parts.EditNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.EditNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.CreateEditPart(view);

			case TraceabilityMM.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.CreateNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ViewEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ViewNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.PermissionEditPart(view);

			case TraceabilityMM.diagram.edit.parts.PermissionNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.PermissionNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeEditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeIdEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeIdEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ValueEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ValueNameEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ValueNameEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectIdEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectIdEditPart(view);

			case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.Attribute2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeId2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeId2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.Object2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectId2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectId2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart(
						view);

			case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabelEditPart(view);

			case TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel2EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel3EditPart(view);

			case TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel4EditPart(view);

			case TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel5EditPart(view);

			case TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart(view);

			case TraceabilityMM.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new TraceabilityMM.diagram.edit.parts.WrappingLabel6EditPart(view);

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
