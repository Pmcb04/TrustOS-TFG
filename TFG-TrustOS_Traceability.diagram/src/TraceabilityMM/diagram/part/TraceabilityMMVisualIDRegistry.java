/*
* 
*/
package TraceabilityMM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TraceabilityMMVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "TFG-TrustOS_Traceability.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID.equals(view.getType())) {
				return TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				TraceabilityMM.diagram.part.TraceabilityMMDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getSystem().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((TraceabilityMM.System) domainElement)) {
			return TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getModelID(containerView);
		if (!TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID.equals(containerModelID)
				&& !"trustd".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransaction().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProduct().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getTransactionConf()
					.isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getProductConf().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getRolConf().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getEdit().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getCreate().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getView().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getPermission().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getValue().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			if (TraceabilityMM.TraceabilityMMPackage.eINSTANCE.getObject().isSuperTypeOf(domainElement.eClass())) {
				return TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getModelID(containerView);
		if (!TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID.equals(containerModelID)
				&& !"trustd".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.TransactionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ProductNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.TransactionConfTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ProductConfTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.RolConfTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.EditNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.CreateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ViewNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.PermissionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.AttributeIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ValueNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ObjectIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.AttributeId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ObjectId2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID:
			if (TraceabilityMM.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(TraceabilityMM.System element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return false;
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
