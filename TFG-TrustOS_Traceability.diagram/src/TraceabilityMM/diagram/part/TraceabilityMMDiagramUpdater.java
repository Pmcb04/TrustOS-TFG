/*
* 
*/
package TraceabilityMM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class TraceabilityMMDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getSemanticChildren(View view) {
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID:
			return getTransactionConfTransactionConfPropertiesCompartment_7001SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartmentEditPart.VISUAL_ID:
			return getAttributeAttributeValuesCompartment_7006SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID:
			return getObjectObjectPropertiesCompartment_7004SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.AttributeAttributeValuesCompartment2EditPart.VISUAL_ID:
			return getAttributeAttributeValuesCompartment_7007SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID:
			return getObjectObjectPropertiesCompartment_7005SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID:
			return getProductConfProductConfPropertiesCompartment_7002SemanticChildren(view);
		case TraceabilityMM.diagram.edit.parts.RolConfRolConfPropertiesCompartmentEditPart.VISUAL_ID:
			return getRolConfRolConfPropertiesCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.System modelElement = (TraceabilityMM.System) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			TraceabilityMM.Node childElement = (TraceabilityMM.Node) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAssets().iterator(); it.hasNext();) {
			TraceabilityMM.Asset childElement = (TraceabilityMM.Asset) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPermissions().iterator(); it.hasNext();) {
			TraceabilityMM.Permission childElement = (TraceabilityMM.Permission) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getTransactionConfTransactionConfPropertiesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.TransactionConf modelElement = (TraceabilityMM.TransactionConf) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it.hasNext();) {
			TraceabilityMM.Property childElement = (TraceabilityMM.Property) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getAttributeAttributeValuesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.Attribute modelElement = (TraceabilityMM.Attribute) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getValues().iterator(); it.hasNext();) {
			TraceabilityMM.Value childElement = (TraceabilityMM.Value) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getObjectObjectPropertiesCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.Object modelElement = (TraceabilityMM.Object) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it.hasNext();) {
			TraceabilityMM.Property childElement = (TraceabilityMM.Property) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getAttributeAttributeValuesCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.Attribute modelElement = (TraceabilityMM.Attribute) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getValues().iterator(); it.hasNext();) {
			TraceabilityMM.Value childElement = (TraceabilityMM.Value) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getObjectObjectPropertiesCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.Object modelElement = (TraceabilityMM.Object) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it.hasNext();) {
			TraceabilityMM.Property childElement = (TraceabilityMM.Property) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getProductConfProductConfPropertiesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.ProductConf modelElement = (TraceabilityMM.ProductConf) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it.hasNext();) {
			TraceabilityMM.Property childElement = (TraceabilityMM.Property) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getRolConfRolConfPropertiesCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TraceabilityMM.RolConf modelElement = (TraceabilityMM.RolConf) containerView.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it.hasNext();) {
			TraceabilityMM.Property childElement = (TraceabilityMM.Property) it.next();
			int visualID = TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getContainedLinks(View view) {
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {
		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_2001ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_2002ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return getTransactionConf_2003ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return getProductConf_2004ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			return getRolConf_2014ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return getEdit_2010ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2011ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2012ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return getPermission_2013ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return getValue_3005ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return getObject_3002ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003ContainedLinks(view);
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return getObject_3004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingLinks(View view) {
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_2001IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_2002IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return getTransactionConf_2003IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return getProductConf_2004IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			return getRolConf_2014IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return getEdit_2010IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2011IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2012IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return getPermission_2013IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return getValue_3005IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return getObject_3002IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003IncomingLinks(view);
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return getObject_3004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingLinks(View view) {
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {
		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return getTransaction_2001OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_2002OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID:
			return getTransactionConf_2003OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID:
			return getProductConf_2004OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.RolConfEditPart.VISUAL_ID:
			return getRolConf_2014OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID:
			return getEdit_2010OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID:
			return getCreate_2011OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID:
			return getView_2012OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID:
			return getPermission_2013OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ValueEditPart.VISUAL_ID:
			return getValue_3005OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID:
			return getObject_3002OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003OutgoingLinks(view);
		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID:
			return getObject_3004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getTransaction_2001ContainedLinks(
			View view) {
		TraceabilityMM.Transaction modelElement = (TraceabilityMM.Transaction) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transaction_Transactionconf_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transaction_Next_product_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getProduct_2002ContainedLinks(
			View view) {
		TraceabilityMM.Product modelElement = (TraceabilityMM.Product) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Productconf_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Next_transaction_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getTransactionConf_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getProductConf_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getRolConf_2014ContainedLinks(
			View view) {
		TraceabilityMM.RolConf modelElement = (TraceabilityMM.RolConf) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RolConf_Permissions_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getEdit_2010ContainedLinks(View view) {
		TraceabilityMM.Edit modelElement = (TraceabilityMM.Edit) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getCreate_2011ContainedLinks(
			View view) {
		TraceabilityMM.Create modelElement = (TraceabilityMM.Create) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getView_2012ContainedLinks(View view) {
		TraceabilityMM.View modelElement = (TraceabilityMM.View) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getPermission_2013ContainedLinks(
			View view) {
		TraceabilityMM.Permission modelElement = (TraceabilityMM.Permission) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getValue_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getObject_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getAttribute_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getObject_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getTransaction_2001IncomingLinks(
			View view) {
		TraceabilityMM.Transaction modelElement = (TraceabilityMM.Transaction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Product_Next_transaction_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getProduct_2002IncomingLinks(
			View view) {
		TraceabilityMM.Product modelElement = (TraceabilityMM.Product) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Transaction_Next_product_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getTransactionConf_2003IncomingLinks(
			View view) {
		TraceabilityMM.TransactionConf modelElement = (TraceabilityMM.TransactionConf) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(
				getIncomingFeatureModelFacetLinks_Transaction_Transactionconf_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getProductConf_2004IncomingLinks(
			View view) {
		TraceabilityMM.ProductConf modelElement = (TraceabilityMM.ProductConf) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Product_Productconf_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getRolConf_2014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getEdit_2010IncomingLinks(View view) {
		TraceabilityMM.Edit modelElement = (TraceabilityMM.Edit) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RolConf_Permissions_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getCreate_2011IncomingLinks(
			View view) {
		TraceabilityMM.Create modelElement = (TraceabilityMM.Create) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RolConf_Permissions_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getView_2012IncomingLinks(View view) {
		TraceabilityMM.View modelElement = (TraceabilityMM.View) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RolConf_Permissions_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getPermission_2013IncomingLinks(
			View view) {
		TraceabilityMM.Permission modelElement = (TraceabilityMM.Permission) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_RolConf_Permissions_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		TraceabilityMM.Attribute modelElement = (TraceabilityMM.Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Permission_Refers_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getValue_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getObject_3002IncomingLinks(
			View view) {
		TraceabilityMM.Object modelElement = (TraceabilityMM.Object) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Permission_Refers_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getAttribute_3003IncomingLinks(
			View view) {
		TraceabilityMM.Attribute modelElement = (TraceabilityMM.Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Permission_Refers_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getObject_3004IncomingLinks(
			View view) {
		TraceabilityMM.Object modelElement = (TraceabilityMM.Object) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Permission_Refers_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getTransaction_2001OutgoingLinks(
			View view) {
		TraceabilityMM.Transaction modelElement = (TraceabilityMM.Transaction) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Transaction_Transactionconf_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Transaction_Next_product_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getProduct_2002OutgoingLinks(
			View view) {
		TraceabilityMM.Product modelElement = (TraceabilityMM.Product) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Productconf_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Product_Next_transaction_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getTransactionConf_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getProductConf_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getRolConf_2014OutgoingLinks(
			View view) {
		TraceabilityMM.RolConf modelElement = (TraceabilityMM.RolConf) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_RolConf_Permissions_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getEdit_2010OutgoingLinks(View view) {
		TraceabilityMM.Edit modelElement = (TraceabilityMM.Edit) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getCreate_2011OutgoingLinks(
			View view) {
		TraceabilityMM.Create modelElement = (TraceabilityMM.Create) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getView_2012OutgoingLinks(View view) {
		TraceabilityMM.View modelElement = (TraceabilityMM.View) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getPermission_2013OutgoingLinks(
			View view) {
		TraceabilityMM.Permission modelElement = (TraceabilityMM.Permission) view.getElement();
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getValue_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getObject_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getAttribute_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getObject_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Transaction_Transactionconf_4001(
			TraceabilityMM.TransactionConf target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceabilityMM.TraceabilityMMPackage.eINSTANCE
					.getTransaction_Transactionconf()) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(setting.getEObject(), target,
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001,
						TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Transaction_Next_product_4002(
			TraceabilityMM.Product target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceabilityMM.TraceabilityMMPackage.eINSTANCE
					.getTransaction_Next_product()) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(setting.getEObject(), target,
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002,
						TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Product_Productconf_4003(
			TraceabilityMM.ProductConf target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceabilityMM.TraceabilityMMPackage.eINSTANCE
					.getProduct_Productconf()) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(setting.getEObject(), target,
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4003,
						TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Product_Next_transaction_4004(
			TraceabilityMM.Transaction target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceabilityMM.TraceabilityMMPackage.eINSTANCE
					.getProduct_Next_transaction()) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(setting.getEObject(), target,
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004,
						TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingFeatureModelFacetLinks_RolConf_Permissions_4008(
			TraceabilityMM.Permission target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceabilityMM.TraceabilityMMPackage.eINSTANCE
					.getRolConf_Permissions()) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(setting.getEObject(), target,
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008,
						TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Permission_Refers_4005(
			TraceabilityMM.Property target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == TraceabilityMM.TraceabilityMMPackage.eINSTANCE
					.getPermission_Refers()) {
				result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(setting.getEObject(), target,
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005,
						TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transaction_Transactionconf_4001(
			TraceabilityMM.Transaction source) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		TraceabilityMM.TransactionConf destination = source.getTransactionconf();
		if (destination == null) {
			return result;
		}
		result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(source, destination,
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001,
				TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Transaction_Next_product_4002(
			TraceabilityMM.Transaction source) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getNext_product().iterator(); destinations.hasNext();) {
			TraceabilityMM.Product destination = (TraceabilityMM.Product) destinations.next();
			result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(source, destination,
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002,
					TraceabilityMM.diagram.edit.parts.TransactionNext_productEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Product_Productconf_4003(
			TraceabilityMM.Product source) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		TraceabilityMM.ProductConf destination = source.getProductconf();
		if (destination == null) {
			return result;
		}
		result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(source, destination,
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4003,
				TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Product_Next_transaction_4004(
			TraceabilityMM.Product source) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getNext_transaction().iterator(); destinations.hasNext();) {
			TraceabilityMM.Transaction destination = (TraceabilityMM.Transaction) destinations.next();
			result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(source, destination,
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004,
					TraceabilityMM.diagram.edit.parts.ProductNext_transactionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_RolConf_Permissions_4008(
			TraceabilityMM.RolConf source) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getPermissions().iterator(); destinations.hasNext();) {
			TraceabilityMM.Permission destination = (TraceabilityMM.Permission) destinations.next();
			result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(source, destination,
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008,
					TraceabilityMM.diagram.edit.parts.RolConfPermissionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Permission_Refers_4005(
			TraceabilityMM.Permission source) {
		LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> result = new LinkedList<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getRefers().iterator(); destinations.hasNext();) {
			TraceabilityMM.Property destination = (TraceabilityMM.Property) destinations.next();
			result.add(new TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor(source, destination,
					TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005,
					TraceabilityMM.diagram.edit.parts.PermissionRefersEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<TraceabilityMM.diagram.part.TraceabilityMMNodeDescriptor> getSemanticChildren(View view) {
			return TraceabilityMMDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getContainedLinks(View view) {
			return TraceabilityMMDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getIncomingLinks(View view) {
			return TraceabilityMMDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<TraceabilityMM.diagram.part.TraceabilityMMLinkDescriptor> getOutgoingLinks(View view) {
			return TraceabilityMMDiagramUpdater.getOutgoingLinks(view);
		}
	};

}