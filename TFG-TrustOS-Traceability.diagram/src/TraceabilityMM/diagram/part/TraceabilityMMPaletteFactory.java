
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
		paletteContainer.add(createCreate2CreationTool());
		paletteContainer.add(createEdit3CreationTool());
		paletteContainer.add(createObject4CreationTool());
		paletteContainer.add(createPermission5CreationTool());
		paletteContainer.add(createProduct6CreationTool());
		paletteContainer.add(createProductConf7CreationTool());
		paletteContainer.add(createRol8CreationTool());
		paletteContainer.add(createTransaction9CreationTool());
		paletteContainer.add(createTransactionConf10CreationTool());
		paletteContainer.add(createView11CreationTool());
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
		paletteContainer.add(createAccess1CreationTool());
		paletteContainer.add(createNext2CreationTool());
		paletteContainer.add(createNext3CreationTool());
		paletteContainer.add(createPermissions4CreationTool());
		paletteContainer.add(createProductconf5CreationTool());
		paletteContainer.add(createProperty6CreationTool());
		paletteContainer.add(createSubtransaction7CreationTool());
		paletteContainer.add(createTransactionconf8CreationTool());
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
	private ToolEntry createCreate2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Create2CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Create2CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2005));
		entry.setId("createCreate2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Create_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEdit3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Edit3CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Edit3CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2006));
		entry.setId("createEdit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Edit_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createObject4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002);
		types.add(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3004);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Object4CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Object4CreationTool_desc, types);
		entry.setId("createObject4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Object_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermission5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Permission5CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permission5CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2009));
		entry.setId("createPermission5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Permission_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProduct6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Product6CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Product6CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2010));
		entry.setId("createProduct6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Product_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProductConf7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.ProductConf7CreationTool_title,
				TraceabilityMM.diagram.part.Messages.ProductConf7CreationTool_desc, Collections
						.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2003));
		entry.setId("createProductConf7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductConf_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Rol8CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Rol8CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Rol_2001));
		entry.setId("createRol8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Rol_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransaction9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.Transaction9CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Transaction9CreationTool_desc, Collections
						.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2007));
		entry.setId("createTransaction9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.Transaction_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransactionConf10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.TransactionConf10CreationTool_title,
				TraceabilityMM.diagram.part.Messages.TransactionConf10CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2002));
		entry.setId("createTransactionConf10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionConf_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createView11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				TraceabilityMM.diagram.part.Messages.View11CreationTool_title,
				TraceabilityMM.diagram.part.Messages.View11CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2004));
		entry.setId("createView11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.View_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAccess1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Access1CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Access1CreationTool_desc,
				Collections.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005));
		entry.setId("createAccess1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolAccess_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNext2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Next2CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Next2CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_4003));
		entry.setId("createNext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionNext_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNext3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Next3CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Next3CreationTool_desc, Collections
						.singletonList(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_4002));
		entry.setId("createNext3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductNext_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPermissions4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Permissions4CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Permissions4CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004));
		entry.setId("createPermissions4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes
				.getImageDescriptor(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.RolPermissions_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProductconf5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Productconf5CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Productconf5CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4008));
		entry.setId("createProductconf5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.ProductProductconf_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createProperty6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Property6CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Property6CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionProperty_4006));
		entry.setId("createProperty6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.PermissionProperty_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSubtransaction7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Subtransaction7CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Subtransaction7CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionSubtransaction_4009));
		entry.setId("createSubtransaction7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionSubtransaction_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransactionconf8CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				TraceabilityMM.diagram.part.Messages.Transactionconf8CreationTool_title,
				TraceabilityMM.diagram.part.Messages.Transactionconf8CreationTool_desc, Collections.singletonList(
						TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4007));
		entry.setId("createTransactionconf8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.getImageDescriptor(
				TraceabilityMM.diagram.providers.TraceabilityMMElementTypes.TransactionTransactionconf_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
