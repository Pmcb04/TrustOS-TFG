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
	private IParser rolAssetID_5001Parser;

	/**
	* @generated
	*/
	private IParser getRolAssetID_5001Parser() {
		if (rolAssetID_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAsset_AssetID() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			rolAssetID_5001Parser = parser;
		}
		return rolAssetID_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser transactionConfAssetID_5002Parser;

	/**
	* @generated
	*/
	private IParser getTransactionConfAssetID_5002Parser() {
		if (transactionConfAssetID_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAsset_AssetID() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			transactionConfAssetID_5002Parser = parser;
		}
		return transactionConfAssetID_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser productConfAssetID_5003Parser;

	/**
	* @generated
	*/
	private IParser getProductConfAssetID_5003Parser() {
		if (productConfAssetID_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAsset_AssetID() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			productConfAssetID_5003Parser = parser;
		}
		return productConfAssetID_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser viewName_5004Parser;

	/**
	* @generated
	*/
	private IParser getViewName_5004Parser() {
		if (viewName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			viewName_5004Parser = parser;
		}
		return viewName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser createName_5005Parser;

	/**
	* @generated
	*/
	private IParser getCreateName_5005Parser() {
		if (createName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			createName_5005Parser = parser;
		}
		return createName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser editName_5006Parser;

	/**
	* @generated
	*/
	private IParser getEditName_5006Parser() {
		if (editName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			editName_5006Parser = parser;
		}
		return editName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser transactionName_5007Parser;

	/**
	* @generated
	*/
	private IParser getTransactionName_5007Parser() {
		if (transactionName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getNode_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			transactionName_5007Parser = parser;
		}
		return transactionName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser productName_5010Parser;

	/**
	* @generated
	*/
	private IParser getProductName_5010Parser() {
		if (productName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getNode_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			productName_5010Parser = parser;
		}
		return productName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser permissionName_5009Parser;

	/**
	* @generated
	*/
	private IParser getPermissionName_5009Parser() {
		if (permissionName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			permissionName_5009Parser = parser;
		}
		return permissionName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5011Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5011Parser() {
		if (attributeName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			attributeName_5011Parser = parser;
		}
		return attributeName_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5012Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5012Parser() {
		if (objectName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			objectName_5012Parser = parser;
		}
		return objectName_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5013Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5013Parser() {
		if (attributeName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			attributeName_5013Parser = parser;
		}
		return attributeName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser objectName_5014Parser;

	/**
	* @generated
	*/
	private IParser getObjectName_5014Parser() {
		if (objectName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProperty_Name() };
			TraceabilityMM.diagram.parsers.MessageFormatParser parser = new TraceabilityMM.diagram.parsers.MessageFormatParser(
					features);
			objectName_5014Parser = parser;
		}
		return objectName_5014Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TraceabilityMM.diagram.edit.parts.RolAssetIDEditPart.VISUAL_ID:
			return getRolAssetID_5001Parser();
		case TraceabilityMM.diagram.edit.parts.TransactionConfAssetIDEditPart.VISUAL_ID:
			return getTransactionConfAssetID_5002Parser();
		case TraceabilityMM.diagram.edit.parts.ProductConfAssetIDEditPart.VISUAL_ID:
			return getProductConfAssetID_5003Parser();
		case TraceabilityMM.diagram.edit.parts.ViewNameEditPart.VISUAL_ID:
			return getViewName_5004Parser();
		case TraceabilityMM.diagram.edit.parts.CreateNameEditPart.VISUAL_ID:
			return getCreateName_5005Parser();
		case TraceabilityMM.diagram.edit.parts.EditNameEditPart.VISUAL_ID:
			return getEditName_5006Parser();
		case TraceabilityMM.diagram.edit.parts.TransactionNameEditPart.VISUAL_ID:
			return getTransactionName_5007Parser();
		case TraceabilityMM.diagram.edit.parts.ProductNameEditPart.VISUAL_ID:
			return getProductName_5010Parser();
		case TraceabilityMM.diagram.edit.parts.PermissionNameEditPart.VISUAL_ID:
			return getPermissionName_5009Parser();
		case TraceabilityMM.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5011Parser();
		case TraceabilityMM.diagram.edit.parts.ObjectNameEditPart.VISUAL_ID:
			return getObjectName_5012Parser();
		case TraceabilityMM.diagram.edit.parts.AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_5013Parser();
		case TraceabilityMM.diagram.edit.parts.ObjectName2EditPart.VISUAL_ID:
			return getObjectName_5014Parser();
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
