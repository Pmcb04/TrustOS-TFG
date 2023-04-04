/*
 * 
 */
package TraceabilityMM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TraceabilityMMParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser temporalTransactionName_5026Parser;

	/**
	* @generated
	*/
	private IParser getTemporalTransactionName_5026Parser() {
		if (temporalTransactionName_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getNode_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			temporalTransactionName_5026Parser = parser;
		}
		return temporalTransactionName_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser transactionName_5001Parser;

	/**
	* @generated
	*/
	private IParser getTransactionName_5001Parser() {
		if (transactionName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getNode_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			transactionName_5001Parser = parser;
		}
		return transactionName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser productName_5002Parser;

	/**
	* @generated
	*/
	private IParser getProductName_5002Parser() {
		if (productName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getNode_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			productName_5002Parser = parser;
		}
		return productName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser transactionConfType_5003Parser;

	/**
	* @generated
	*/
	private IParser getTransactionConfType_5003Parser() {
		if (transactionConfType_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAsset_Type() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			transactionConfType_5003Parser = parser;
		}
		return transactionConfType_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser productConfType_5004Parser;

	/**
	* @generated
	*/
	private IParser getProductConfType_5004Parser() {
		if (productConfType_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAsset_Type() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			productConfType_5004Parser = parser;
		}
		return productConfType_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser rolConfType_5019Parser;

	/**
	* @generated
	*/
	private IParser getRolConfType_5019Parser() {
		if (rolConfType_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAsset_Type() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			rolConfType_5019Parser = parser;
		}
		return rolConfType_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser editName_5011Parser;

	/**
	* @generated
	*/
	private IParser getEditName_5011Parser() {
		if (editName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			editName_5011Parser = parser;
		}
		return editName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser createName_5012Parser;

	/**
	* @generated
	*/
	private IParser getCreateName_5012Parser() {
		if (createName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			createName_5012Parser = parser;
		}
		return createName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser viewName_5013Parser;

	/**
	* @generated
	*/
	private IParser getViewName_5013Parser() {
		if (viewName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			viewName_5013Parser = parser;
		}
		return viewName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser permissionName_5014Parser;

	/**
	* @generated
	*/
	private IParser getPermissionName_5014Parser() {
		if (permissionName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			permissionName_5014Parser = parser;
		}
		return permissionName_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeId_5020Parser;

	/**
	* @generated
	*/
	private IParser getAttributeId_5020Parser() {
		if (attributeId_5020Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Id() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			attributeId_5020Parser = parser;
		}
		return attributeId_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser valueName_5024Parser;

	/**
	* @generated
	*/
	private IParser getValueName_5024Parser() {
		if (valueName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getValue_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			valueName_5024Parser = parser;
		}
		return valueName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser objectId_5021Parser;

	/**
	* @generated
	*/
	private IParser getObjectId_5021Parser() {
		if (objectId_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Id() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			objectId_5021Parser = parser;
		}
		return objectId_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeId_5022Parser;

	/**
	* @generated
	*/
	private IParser getAttributeId_5022Parser() {
		if (attributeId_5022Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Id() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			attributeId_5022Parser = parser;
		}
		return attributeId_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser objectId_5023Parser;

	/**
	* @generated
	*/
	private IParser getObjectId_5023Parser() {
		if (objectId_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Id() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			objectId_5023Parser = parser;
		}
		return objectId_5023Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TraceabilityMM.diagram.edit.parts.TemporalTransactionNameEditPart.VISUAL_ID:
			return getTemporalTransactionName_5026Parser();
		case TraceabilityMM.diagram.edit.parts.TransactionNameEditPart.VISUAL_ID:
			return getTransactionName_5001Parser();
		case TraceabilityMM.diagram.edit.parts.ProductNameEditPart.VISUAL_ID:
			return getProductName_5002Parser();
		case TraceabilityMM.diagram.edit.parts.TransactionConfTypeEditPart.VISUAL_ID:
			return getTransactionConfType_5003Parser();
		case TraceabilityMM.diagram.edit.parts.ProductConfTypeEditPart.VISUAL_ID:
			return getProductConfType_5004Parser();
		case TraceabilityMM.diagram.edit.parts.RolConfTypeEditPart.VISUAL_ID:
			return getRolConfType_5019Parser();
		case TraceabilityMM.diagram.edit.parts.EditNameEditPart.VISUAL_ID:
			return getEditName_5011Parser();
		case TraceabilityMM.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
			return getCreateName_5012Parser();
		case TraceabilityMM.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
			return getViewName_5013Parser();
		case TraceabilityMM.diagram.edit.parts.PermissionNameEditPart.VISUAL_ID:
			return getPermissionName_5014Parser();
		case TraceabilityMM.diagram.edit.parts.AttributeIdEditPart.VISUAL_ID:
			return getAttributeId_5020Parser();
		case TraceabilityMM.diagram.edit.parts.ValueNameEditPart.VISUAL_ID:
			return getValueName_5024Parser();
		case TraceabilityMM.diagram.edit.parts.ObjectIdEditPart.VISUAL_ID:
			return getObjectId_5021Parser();
		case TraceabilityMM.diagram.edit.parts.AttributeId2EditPart.VISUAL_ID:
			return getAttributeId_5022Parser();
		case TraceabilityMM.diagram.edit.parts.ObjectId2EditPart.VISUAL_ID:
			return getObjectId_5023Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
