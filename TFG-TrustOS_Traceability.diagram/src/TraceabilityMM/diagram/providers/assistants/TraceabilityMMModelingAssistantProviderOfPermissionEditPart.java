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
public class TraceabilityMMModelingAssistantProviderOfPermissionEditPart
		extends TraceabilityMM.diagram.providers.TraceabilityMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TraceabilityMM.diagram.edit.parts.PermissionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TraceabilityMM.diagram.edit.parts.PermissionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TraceabilityMM.diagram.edit.parts.PermissionEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			TraceabilityMM.diagram.edit.parts.PermissionEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.AttributeEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.ObjectEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.Attribute2EditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.Object2EditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TraceabilityMM.diagram.edit.parts.PermissionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TraceabilityMM.diagram.edit.parts.PermissionEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3003);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TraceabilityMM.diagram.edit.parts.PermissionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TraceabilityMM.diagram.edit.parts.PermissionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TraceabilityMM.diagram.edit.parts.PermissionEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TraceabilityMM.diagram.edit.parts.PermissionEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014);
		}
		return types;
	}

}
