/*
* 
*/
package TraceabilityMM.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class TraceabilityMMNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem
				&& !isOwnView(((TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup group = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup) element;
			return TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem navigatorItem = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/TraceabilityMM?System", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.System_1000);
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?Transaction", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001);
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?Product", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002);
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?TransactionConf", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003);
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?ProductConf", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2004);
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?Edit", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010);
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?Create", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011);
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?View", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012);
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?Permission", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013);
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?RolConf", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014);
		case TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/TraceabilityMM?TemporalTransaction", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TemporalTransaction_2016);
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/TraceabilityMM?Attribute", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001);
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/TraceabilityMM?Object", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002);
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/TraceabilityMM?Attribute", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3003);
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/TraceabilityMM?Object", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004);
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/TraceabilityMM?Value", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Value_3005);
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/TraceabilityMM?Transaction?transactionconf", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001);
		case TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/TraceabilityMM?Transaction?next_product", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002);
		case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/TraceabilityMM?Product?productconf", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4003);
		case TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/TraceabilityMM?Product?next_transaction", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004);
		case TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/TraceabilityMM?Permission?refers", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005);
		case TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/TraceabilityMM?RolConf?permissions", //$NON-NLS-1$
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.isKnownElementType(elementType)) {
			image = TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup group = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem navigatorItem = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_2001Text(view);
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_2002Text(view);
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return getTransactionConf_2003Text(view);
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return getProductConf_2004Text(view);
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return getEdit_2010Text(view);
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2011Text(view);
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2012Text(view);
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return getPermission_2013Text(view);
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			return getRolConf_2014Text(view);
		case TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart.VISUAL_ID:
			return getTemporalTransaction_2016Text(view);
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return getObject_3002Text(view);
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003Text(view);
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return getObject_3004Text(view);
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return getValue_3005Text(view);
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			return getTransactionTransactionconf_4001Text(view);
		case TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID:
			return getTransactionNext_product_4002Text(view);
		case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
			return getProductProductconf_4003Text(view);
		case TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID:
			return getProductNext_transaction_4004Text(view);
		case TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID:
			return getPermissionRefers_4005Text(view);
		case TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID:
			return getRolConfPermissions_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getSystem_1000Text(View view) {
		TraceabilityMM.System domainModelElement = (TraceabilityMM.System) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransaction_2001Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.TransactionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProduct_2002Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.ProductNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransactionConf_2003Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.TransactionConfTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProductConf_2004Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2004,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.ProductConfTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEdit_2010Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.EditNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreate_2011Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.CreateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getView_2012Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.ViewNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPermission_2013Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.PermissionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolConf_2014Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.RolConfTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTemporalTransaction_2016Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TemporalTransaction_2016,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.TemporalTransactionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3001Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.AttributeIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3002Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.ObjectIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3003Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3003,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.AttributeId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getObject_3004Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.ObjectId2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValue_3005Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Value_3005,
				view.getElement() != null ? view.getElement() : view,
				TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
						.getType(TraceabilityMM.diagram.edit.parts.ValueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransactionTransactionconf_4001Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransactionNext_product_4002Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProductProductconf_4003Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getProductNext_transaction_4004Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPermissionRefers_4005Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolConfPermissions_4008Text(View view) {
		IParser parser = TraceabilityMM.diagram.providers.TraceabilityMMParserProvider.getParser(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getModelID(view));
	}

}
