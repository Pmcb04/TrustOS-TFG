/*
* 
*/
package TraceabilityMM.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class TraceabilityMMNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public TraceabilityMMNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem> result = new ArrayList<TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup group = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) {
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem navigatorItem = (TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getVisualID(view)) {

		case TraceabilityMM.diagram.edit.parts.SystemEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup links = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_System_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.RolEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Rol_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolRolPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolRolPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionConf_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.TransactionConfTransactionConfPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_ProductConf_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.ProductConfProductConfPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_View_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_View_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Create_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Create_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Edit_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Edit_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Transaction_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Transaction_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Permission_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Permission_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Product_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup outgoinglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Product_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Attribute_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Object_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Attribute_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup incominglinks = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_Object_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getType(
							TraceabilityMM.diagram.edit.parts.ObjectObjectPropertiesCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.ProductNextEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_ProductNext_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_ProductNext_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.TransactionNextEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionNext_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionNext_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.RolPermissionsEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_RolPermissions_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_RolPermissions_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.RolAccessEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_RolAccess_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_RolAccess_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.PermissionPropertyEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_PermissionProperty_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_PermissionProperty_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ObjectEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.Attribute2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.Object2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ViewEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.CreateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.EditEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.PermissionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.TransactionTransactionconfEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionTransactionconf_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionTransactionconf_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionConfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.ProductProductconfEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_ProductProductconf_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_ProductProductconf_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductConfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.ProductEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TraceabilityMM.diagram.edit.parts.TransactionSubtransactionEditPart.VISUAL_ID: {
			LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem> result = new LinkedList<TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup target = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionSubtransaction_4009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup source = new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorGroup(
					TraceabilityMM.diagram.part.Messages.NavigatorGroupName_TransactionSubtransaction_4009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry
							.getType(TraceabilityMM.diagram.edit.parts.TransactionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return TraceabilityMM.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(TraceabilityMM.diagram.part.TraceabilityMMVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem> result = new ArrayList<TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<TraceabilityMM.diagram.navigator.TraceabilityMMNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem) {
			TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem abstractNavigatorItem = (TraceabilityMM.diagram.navigator.TraceabilityMMAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
