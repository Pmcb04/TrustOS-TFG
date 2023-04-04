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
public class TraceabilityMMModelingAssistantProviderOfTemporalTransactionEditPart
		extends TraceabilityMM.diagram.providers.TraceabilityMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.TransactionConfEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001);
		}
		if (targetEditPart instanceof TraceabilityMM.diagram.edit.parts.ProductEditPart) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003);
		} else if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002);
		}
		return types;
	}

}
