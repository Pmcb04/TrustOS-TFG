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
	public static final IElementType System_1000 = getElementType("TFG-TrustOS-Traceability.diagram.System_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_2001 = getElementType("TFG-TrustOS-Traceability.diagram.Rol_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransactionConf_2002 = getElementType(
			"TFG-TrustOS-Traceability.diagram.TransactionConf_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ProductConf_2003 = getElementType(
			"TFG-TrustOS-Traceability.diagram.ProductConf_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType View_2004 = getElementType("TFG-TrustOS-Traceability.diagram.View_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Create_2005 = getElementType("TFG-TrustOS-Traceability.diagram.Create_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Edit_2006 = getElementType("TFG-TrustOS-Traceability.diagram.Edit_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transaction_2007 = getElementType(
			"TFG-TrustOS-Traceability.diagram.Transaction_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Product_2010 = getElementType("TFG-TrustOS-Traceability.diagram.Product_2010"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Permission_2009 = getElementType(
			"TFG-TrustOS-Traceability.diagram.Permission_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3001 = getElementType("TFG-TrustOS-Traceability.diagram.Attribute_3001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Object_3002 = getElementType("TFG-TrustOS-Traceability.diagram.Object_3002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Attribute_3003 = getElementType("TFG-TrustOS-Traceability.diagram.Attribute_3003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Object_3004 = getElementType("TFG-TrustOS-Traceability.diagram.Object_3004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType RolPermissions_4004 = getElementType(
			"TFG-TrustOS-Traceability.diagram.RolPermissions_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType RolAccess_4005 = getElementType("TFG-TrustOS-Traceability.diagram.RolAccess_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType PermissionProperty_4006 = getElementType(
			"TFG-TrustOS-Traceability.diagram.PermissionProperty_4006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TransactionTransactionconf_4007 = getElementType(
			"TFG-TrustOS-Traceability.diagram.TransactionTransactionconf_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TransactionNext_4003 = getElementType(
			"TFG-TrustOS-Traceability.diagram.TransactionNext_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType TransactionSubtransaction_4009 = getElementType(
			"TFG-TrustOS-Traceability.diagram.TransactionSubtransaction_4009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ProductProductconf_4008 = getElementType(
			"TFG-TrustOS-Traceability.diagram.ProductProductconf_4008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ProductNext_4002 = getElementType(
			"TFG-TrustOS-Traceability.diagram.ProductNext_4002"); //$NON-NLS-1$

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

			elements.put(Rol_2001, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getRol());

			elements.put(TransactionConf_2002, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransactionConf());

			elements.put(ProductConf_2003, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProductConf());

			elements.put(View_2004, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getView());

			elements.put(Create_2005, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getCreate());

			elements.put(Edit_2006, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getEdit());

			elements.put(Transaction_2007, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction());

			elements.put(Product_2010, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct());

			elements.put(Permission_2009, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission());

			elements.put(Attribute_3001, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute());

			elements.put(Object_3002, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject());

			elements.put(Attribute_3003, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute());

			elements.put(Object_3004, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject());

			elements.put(RolPermissions_4004, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getRol_Permissions());

			elements.put(RolAccess_4005, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getRol_Access());

			elements.put(PermissionProperty_4006,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission_Property());

			elements.put(TransactionTransactionconf_4007,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction_Transactionconf());

			elements.put(TransactionNext_4003, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction_Next());

			elements.put(TransactionSubtransaction_4009,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction_Subtransaction());

			elements.put(ProductProductconf_4008,
					TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct_Productconf());

			elements.put(ProductNext_4002, TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct_Next());
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
			KNOWN_ELEMENT_TYPES.add(Rol_2001);
			KNOWN_ELEMENT_TYPES.add(TransactionConf_2002);
			KNOWN_ELEMENT_TYPES.add(ProductConf_2003);
			KNOWN_ELEMENT_TYPES.add(View_2004);
			KNOWN_ELEMENT_TYPES.add(Create_2005);
			KNOWN_ELEMENT_TYPES.add(Edit_2006);
			KNOWN_ELEMENT_TYPES.add(Transaction_2007);
			KNOWN_ELEMENT_TYPES.add(Product_2010);
			KNOWN_ELEMENT_TYPES.add(Permission_2009);
			KNOWN_ELEMENT_TYPES.add(Attribute_3001);
			KNOWN_ELEMENT_TYPES.add(Object_3002);
			KNOWN_ELEMENT_TYPES.add(Attribute_3003);
			KNOWN_ELEMENT_TYPES.add(Object_3004);
			KNOWN_ELEMENT_TYPES.add(RolPermissions_4004);
			KNOWN_ELEMENT_TYPES.add(RolAccess_4005);
			KNOWN_ELEMENT_TYPES.add(PermissionProperty_4006);
			KNOWN_ELEMENT_TYPES.add(TransactionTransactionconf_4007);
			KNOWN_ELEMENT_TYPES.add(TransactionNext_4003);
			KNOWN_ELEMENT_TYPES.add(TransactionSubtransaction_4009);
			KNOWN_ELEMENT_TYPES.add(ProductProductconf_4008);
			KNOWN_ELEMENT_TYPES.add(ProductNext_4002);
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
		case TraceabilityMM.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return Rol_2001;
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return TransactionConf_2002;
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return ProductConf_2003;
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return View_2004;
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return Create_2005;
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return Edit_2006;
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return Transaction_2007;
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return Product_2010;
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return Permission_2009;
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3001;
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return Object_3002;
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return Attribute_3003;
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return Object_3004;
		case TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID:
			return RolPermissions_4004;
		case TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
			return RolAccess_4005;
		case TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID:
			return PermissionProperty_4006;
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			return TransactionTransactionconf_4007;
		case TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID:
			return TransactionNext_4003;
		case TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID:
			return TransactionSubtransaction_4009;
		case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
			return ProductProductconf_4008;
		case TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID:
			return ProductNext_4002;
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
