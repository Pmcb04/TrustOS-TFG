/*
 * 
 */
package TraceabilityMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TraceabilityMMModelingAssistantProviderOfRolEditPart
		extends TraceabilityMM.diagram.providers.TraceabilityMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TraceabilityMM.diagram.edit.parts.RolEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TraceabilityMM.diagram.edit.parts.RolEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TraceabilityMM.diagram.edit.parts.RolEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TraceabilityMM.diagram.edit.parts.RolEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.ViewEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.CreateEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.EditEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.PermissionEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.TransactionEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.ProductEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TraceabilityMM.diagram.edit.parts.RolEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TraceabilityMM.diagram.edit.parts.RolEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2004);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2005);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2006);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2009);
		} else if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2007);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2010);
		}
		return types;
	}

}
