
/*
 * 
 */
package TraceabilityMM.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class TraceabilityMMPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(TraceabilityMM.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createObject2CreationTool());
		paletteContainer.add(createPermissiontocreate3CreationTool());
		paletteContainer.add(createPermissiontodoall4CreationTool());
		paletteContainer.add(createPermissiontoedit5CreationTool());
		paletteContainer.add(createPermissiontoview6CreationTool());
		paletteContainer.add(createProduct7CreationTool());
		paletteContainer.add(createProductConfiguration8CreationTool());
		paletteContainer.add(createRolConfiguration9CreationTool());
		paletteContainer.add(createTransaction10CreationTool());
		paletteContainer.add(createTransactionConfiguration11CreationTool());
		paletteContainer.add(createValueofattribute12CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				TraceabilityMM.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createNextproduct1CreationTool());
		paletteContainer.add(createNexttransaction2CreationTool());
		paletteContainer.add(createPermissionofarol3CreationTool());
		paletteContainer.add(createProductconf4CreationTool());
		paletteContainer.add(createPropertiesallow5CreationTool());
		paletteContainer.add(createTransactionconfiguration6CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3003);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Attribute1CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Attribute1CreationTool_desc, types);
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Attribute_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObject2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Object2CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Object2CreationTool_desc, types);
		entry.setId("createObject2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermissiontocreate3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Permissiontocreate3CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permissiontocreate3CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011));
		entry.setId("createPermissiontocreate3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermissiontodoall4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Permissiontodoall4CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permissiontodoall4CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013));
		entry.setId("createPermissiontodoall4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermissiontoedit5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Permissiontoedit5CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permissiontoedit5CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010));
		entry.setId("createPermissiontoedit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermissiontoview6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Permissiontoview6CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permissiontoview6CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012));
		entry.setId("createPermissiontoview6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProduct7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Product7CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Product7CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002));
		entry.setId("createProduct7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProductConfiguration8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.ProductConfiguration8CreationTool_title,
				TraceabilityMM.diagram.part.Messages.ProductConfiguration8CreationTool_desc, Collections
						.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2004));
		entry.setId("createProductConfiguration8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRolConfiguration9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.RolConfiguration9CreationTool_title,
				TraceabilityMM.diagram.part.Messages.RolConfiguration9CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014));
		entry.setId("createRolConfiguration9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConf_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransaction10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Transaction10CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Transaction10CreationTool_desc, Collections
						.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001));
		entry.setId("createTransaction10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransactionConfiguration11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.TransactionConfiguration11CreationTool_title,
				TraceabilityMM.diagram.part.Messages.TransactionConfiguration11CreationTool_desc,
				Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003));
		entry.setId("createTransactionConfiguration11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValueofattribute12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Valueofattribute12CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Valueofattribute12CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Value_3005));
		entry.setId("createValueofattribute12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Value_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNextproduct1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Nextproduct1CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Nextproduct1CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002));
		entry.setId("createNextproduct1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_product_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNexttransaction2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Nexttransaction2CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Nexttransaction2CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004));
		entry.setId("createNexttransaction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_transaction_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermissionofarol3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Permissionofarol3CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permissionofarol3CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008));
		entry.setId("createPermissionofarol3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolConfPermissions_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProductconf4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Productconf4CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Productconf4CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4003));
		entry.setId("createProductconf4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPropertiesallow5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Propertiesallow5CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Propertiesallow5CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005));
		entry.setId("createPropertiesallow5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionRefers_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransactionconfiguration6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Transactionconfiguration6CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Transactionconfiguration6CreationTool_desc,
				Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001));
		entry.setId("createTransactionconfiguration6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
