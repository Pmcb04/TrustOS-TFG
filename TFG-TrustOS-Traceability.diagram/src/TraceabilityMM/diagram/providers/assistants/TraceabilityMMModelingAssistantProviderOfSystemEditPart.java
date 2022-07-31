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
		List<IElementType> types = new ArrayList<IElementType>(9);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Rol_2001);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2002);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2003);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2004);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2005);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2006);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2007);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2010);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2009);
		return types;
	}

}
