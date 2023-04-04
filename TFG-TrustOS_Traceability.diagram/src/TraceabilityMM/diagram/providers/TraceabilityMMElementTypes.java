/*
 * 
 */
package TraceabilityMM.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class TraceabilityMMElementTypes {

	/**
	* @generated
	*/
	private TraceabilityMMElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType System_1000 = getElementType("TFG-TrustOS_Traceability.diagram.System_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TemporalTransaction_2016 = getElementType(
			"TFG-TrustOS_Traceability.diagram.TemporalTransaction_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transaction_2001 = getElementType(
			"TFG-TrustOS_Traceability.diagram.Transaction_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Product_2002 = getElementType("TFG-TrustOS_Traceability.diagram.Product_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransactionConf_2003 = getElementType(
			"TFG-TrustOS_Traceability.diagram.TransactionConf_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProductConf_2004 = getElementType(
			"TFG-TrustOS_Traceability.diagram.ProductConf_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RolConf_2014 = getElementType("TFG-TrustOS_Traceability.diagram.RolConf_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Edit_2010 = getElementType("TFG-TrustOS_Traceability.diagram.Edit_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Create_2011 = getElementType("TFG-TrustOS_Traceability.diagram.Create_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType View_2012 = getElementType("TFG-TrustOS_Traceability.diagram.View_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Permission_2013 = getElementType(
			"TFG-TrustOS_Traceability.diagram.Permission_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3001 = getElementType("TFG-TrustOS_Traceability.diagram.Attribute_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Value_3005 = getElementType("TFG-TrustOS_Traceability.diagram.Value_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3002 = getElementType("TFG-TrustOS_Traceability.diagram.Object_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3003 = getElementType("TFG-TrustOS_Traceability.diagram.Attribute_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Object_3004 = getElementType("TFG-TrustOS_Traceability.diagram.Object_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransactionTransactionconf_4001 = getElementType(
			"TFG-TrustOS_Traceability.diagram.TransactionTransactionconf_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransactionNext_product_4002 = getElementType(
			"TFG-TrustOS_Traceability.diagram.TransactionNext_product_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProductProductconf_4003 = getElementType(
			"TFG-TrustOS_Traceability.diagram.ProductProductconf_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProductNext_transaction_4004 = getElementType(
			"TFG-TrustOS_Traceability.diagram.ProductNext_transaction_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RolConfPermissions_4008 = getElementType(
			"TFG-TrustOS_Traceability.diagram.RolConfPermissions_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PermissionRefers_4005 = getElementType(
			"TFG-TrustOS_Traceability.diagram.PermissionRefers_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(System_1000, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getSystem());

			elements.put(TemporalTransaction_2016,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTemporalTransaction());

			elements.put(Transaction_2001, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction());

			elements.put(Product_2002, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct());

			elements.put(TransactionConf_2003, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransactionConf());

			elements.put(ProductConf_2004, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProductConf());

			elements.put(RolConf_2014, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getRolConf());

			elements.put(Edit_2010, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getEdit());

			elements.put(Create_2011, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getCreate());

			elements.put(View_2012, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getView());

			elements.put(Permission_2013, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission());

			elements.put(Attribute_3001, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute());

			elements.put(Value_3005, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getValue());

			elements.put(Object_3002, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject());

			elements.put(Attribute_3003, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute());

			elements.put(Object_3004, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject());

			elements.put(TransactionTransactionconf_4001,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction_Transactionconf());

			elements.put(TransactionNext_product_4002,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction_Next_product());

			elements.put(ProductProductconf_4003,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct_Productconf());

			elements.put(ProductNext_transaction_4004,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct_Next_transaction());

			elements.put(RolConfPermissions_4008,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getRolConf_Permissions());

			elements.put(PermissionRefers_4005, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Refers());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(TemporalTransaction_2016);
			KNOWN_ELEMENT_TYPES.add(Transaction_2001);
			KNOWN_ELEMENT_TYPES.add(Product_2002);
			KNOWN_ELEMENT_TYPES.add(TransactionConf_2003);
			KNOWN_ELEMENT_TYPES.add(ProductConf_2004);
			KNOWN_ELEMENT_TYPES.add(RolConf_2014);
			KNOWN_ELEMENT_TYPES.add(Edit_2010);
			KNOWN_ELEMENT_TYPES.add(Create_2011);
			KNOWN_ELEMENT_TYPES.add(View_2012);
			KNOWN_ELEMENT_TYPES.add(Permission_2013);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(Value_3005);
			KNOWN_ELEMENT_TYPES.add(Object_3002);
			KNOWN_ELEMENT_TYPES.add(Attribute_3003);
			KNOWN_ELEMENT_TYPES.add(Object_3004);
			KNOWN_ELEMENT_TYPES.add(TransactionTransactionconf_4001);
			KNOWN_ELEMENT_TYPES.add(TransactionNext_product_4002);
			KNOWN_ELEMENT_TYPES.add(ProductProductconf_4003);
			KNOWN_ELEMENT_TYPES.add(ProductNext_transaction_4004);
			KNOWN_ELEMENT_TYPES.add(RolConfPermissions_4008);
			KNOWN_ELEMENT_TYPES.add(PermissionRefers_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return System_1000;
		case TraceabilityMM.diagram.edit.parts.TemporalTransactionEditPart.VISUAL_ID:
			return TemporalTransaction_2016;
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return Transaction_2001;
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return Product_2002;
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return TransactionConf_2003;
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return ProductConf_2004;
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			return RolConf_2014;
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return Edit_2010;
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return Create_2011;
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return View_2012;
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return Permission_2013;
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3001;
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return Value_3005;
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return Object_3002;
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return Attribute_3003;
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return Object_3004;
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			return TransactionTransactionconf_4001;
		case TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID:
			return TransactionNext_product_4002;
		case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
			return ProductProductconf_4003;
		case TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID:
			return ProductNext_transaction_4004;
		case TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID:
			return RolConfPermissions_4008;
		case TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID:
			return PermissionRefers_4005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getElement(elementTypeAdapter);
		}
	};

}
