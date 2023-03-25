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
public class TraceabilityMMModelingAssistantProviderOfRolConfEditPart
		extends TraceabilityMM.diagram.providers.TraceabilityMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TraceabilityMM.diagram.edit.parts.RolConfEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TraceabilityMM.diagram.edit.parts.RolConfEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TraceabilityMM.diagram.edit.parts.RolConfEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TraceabilityMM.diagram.edit.parts.RolConfEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.EditEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.CreateEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.ViewEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.PermissionEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TraceabilityMM.diagram.edit.parts.RolConfEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TraceabilityMM.diagram.edit.parts.RolConfEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013);
		}
		return types;
	}

}
