/*
 * 
 */
package TraceabilityMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TraceabilityMMModelingAssistantProviderOfTransactionConfEditPart
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

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TraceabilityMM.diagram.edit.parts.TransactionConfEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TraceabilityMM.diagram.edit.parts.TransactionConfEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TraceabilityMM.diagram.edit.parts.TransactionConfEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TraceabilityMM.diagram.edit.parts.TransactionConfEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001) {
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TemporalTransaction_2016);
			types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001);
		}
		return types;
	}

}
