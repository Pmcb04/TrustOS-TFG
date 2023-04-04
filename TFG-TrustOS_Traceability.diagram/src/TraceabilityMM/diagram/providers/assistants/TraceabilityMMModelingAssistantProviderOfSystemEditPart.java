/*
 * 
 */
package TraceabilityMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TraceabilityMMModelingAssistantProviderOfSystemEditPart
		extends TraceabilityMM.diagram.providers.TraceabilityMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TemporalTransaction_2016);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2004);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013);
		return types;
	}

}
