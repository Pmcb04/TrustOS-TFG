/**
 */
package TraceabilityMM.impl;

import TraceabilityMM.Asset;
import TraceabilityMM.Attribute;
import TraceabilityMM.Create;
import TraceabilityMM.EType;
import TraceabilityMM.Edit;
import TraceabilityMM.Node;
import TraceabilityMM.Permission;
import TraceabilityMM.Product;
import TraceabilityMM.ProductConf;
import TraceabilityMM.Property;
import TraceabilityMM.Rol;
import TraceabilityMM.TraceabilityMMFactory;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;
import TraceabilityMM.TransactionConf;
import TraceabilityMM.View;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityMMPackageImpl extends EPackageImpl implements TraceabilityMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TraceabilityMM.TraceabilityMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraceabilityMMPackageImpl() {
		super(eNS_URI, TraceabilityMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TraceabilityMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraceabilityMMPackage init() {
		if (isInited) return (TraceabilityMMPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTraceabilityMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TraceabilityMMPackageImpl theTraceabilityMMPackage = registeredTraceabilityMMPackage instanceof TraceabilityMMPackageImpl ? (TraceabilityMMPackageImpl)registeredTraceabilityMMPackage : new TraceabilityMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTraceabilityMMPackage.createPackageContents();

		// Initialize created meta-data
		theTraceabilityMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraceabilityMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraceabilityMMPackage.eNS_URI, theTraceabilityMMPackage);
		return theTraceabilityMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRol() {
		return rolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Permissions() {
		return (EReference)rolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRol_Access() {
		return (EReference)rolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Mutable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionConf() {
		return transactionConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Assets() {
		return (EReference)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Roles() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Permissions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Nodes() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Property() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_Name() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_View_all() {
		return (EAttribute)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdit() {
		return editEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdit_Edit_all() {
		return (EAttribute)editEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductConf() {
		return productConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Transactionconf() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Previous() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Next() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Subtransaction() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Productconf() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Next() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Previous() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Properties() {
		return (EReference)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_AssetID() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsset_Properties() {
		return (EReference)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEType() {
		return eTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityMMFactory getTraceabilityMMFactory() {
		return (TraceabilityMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rolEClass = createEClass(ROL);
		createEReference(rolEClass, ROL__PERMISSIONS);
		createEReference(rolEClass, ROL__ACCESS);

		transactionConfEClass = createEClass(TRANSACTION_CONF);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__ASSETS);
		createEReference(systemEClass, SYSTEM__ROLES);
		createEReference(systemEClass, SYSTEM__PERMISSIONS);
		createEReference(systemEClass, SYSTEM__NODES);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__PROPERTY);
		createEAttribute(permissionEClass, PERMISSION__NAME);

		viewEClass = createEClass(VIEW);
		createEAttribute(viewEClass, VIEW__VIEW_ALL);

		createEClass = createEClass(CREATE);

		editEClass = createEClass(EDIT);
		createEAttribute(editEClass, EDIT__EDIT_ALL);

		productConfEClass = createEClass(PRODUCT_CONF);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__TRANSACTIONCONF);
		createEReference(transactionEClass, TRANSACTION__PREVIOUS);
		createEReference(transactionEClass, TRANSACTION__NEXT);
		createEReference(transactionEClass, TRANSACTION__SUBTRANSACTION);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__PRODUCTCONF);
		createEReference(productEClass, PRODUCT__NEXT);
		createEReference(productEClass, PRODUCT__PREVIOUS);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__PROPERTIES);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ASSET_ID);
		createEReference(assetEClass, ASSET__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__MUTABLE);

		// Create enums
		eTypeEEnum = createEEnum(ETYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rolEClass.getESuperTypes().add(this.getAsset());
		transactionConfEClass.getESuperTypes().add(this.getAsset());
		viewEClass.getESuperTypes().add(this.getPermission());
		createEClass.getESuperTypes().add(this.getPermission());
		editEClass.getESuperTypes().add(this.getPermission());
		productConfEClass.getESuperTypes().add(this.getAsset());
		transactionEClass.getESuperTypes().add(this.getNode());
		productEClass.getESuperTypes().add(this.getNode());
		attributeEClass.getESuperTypes().add(this.getProperty());
		objectEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(rolEClass, Rol.class, "Rol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRol_Permissions(), this.getPermission(), null, "permissions", null, 1, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRol_Access(), this.getNode(), null, "access", null, 1, -1, Rol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionConfEClass, TransactionConf.class, "TransactionConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, TraceabilityMM.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Assets(), this.getAsset(), null, "assets", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Roles(), this.getRol(), null, "roles", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Nodes(), this.getNode(), null, "nodes", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermission_Property(), this.getProperty(), null, "property", null, 1, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getView_View_all(), ecorePackage.getEBoolean(), "view_all", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(editEClass, Edit.class, "Edit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdit_Edit_all(), ecorePackage.getEBoolean(), "edit_all", null, 0, 1, Edit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productConfEClass, ProductConf.class, "ProductConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Transactionconf(), this.getTransactionConf(), null, "transactionconf", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Previous(), this.getProduct(), this.getProduct_Next(), "previous", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Next(), this.getProduct(), this.getProduct_Previous(), "next", null, 1, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Subtransaction(), this.getTransaction(), null, "subtransaction", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Productconf(), this.getProductConf(), null, "productconf", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Next(), this.getTransaction(), this.getTransaction_Previous(), "next", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Previous(), this.getTransaction(), this.getTransaction_Next(), "previous", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), this.getEType(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, TraceabilityMM.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Properties(), this.getProperty(), null, "properties", null, 2, -1, TraceabilityMM.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_AssetID(), ecorePackage.getEString(), "assetID", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Properties(), this.getProperty(), null, "properties", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Mutable(), ecorePackage.getEBoolean(), "mutable", "true", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.STRING);
		addEEnumLiteral(eTypeEEnum, EType.NUMBER);
		addEEnumLiteral(eTypeEEnum, EType.BOOLEAN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
		// gmf.link
		createGmf_2Annotations();
		// emf.gen
		createEmfAnnotations();
		// gmf.diagram
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
			   "archetype", "MomentInterval"
		   });
		addAnnotation
		  (transactionConfEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
		   });
		addAnnotation
		  (permissionEClass,
		   source,
		   new String[] {
			   "archetype", "MomentInterval"
		   });
		addAnnotation
		  (viewEClass,
		   source,
		   new String[] {
			   "archetype", "MomentInterval"
		   });
		addAnnotation
		  (createEClass,
		   source,
		   new String[] {
			   "archetype", "MomentInterval"
		   });
		addAnnotation
		  (editEClass,
		   source,
		   new String[] {
			   "archetype", "MomentInterval"
		   });
		addAnnotation
		  (productConfEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (transactionEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "archetype", "Description"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (rolEClass,
		   source,
		   new String[] {
			   "label", "assetID",
			   "border.width", "0",
			   "border.color", "220,31,31",
			   "border.style", "solid"
		   });
		addAnnotation
		  (transactionConfEClass,
		   source,
		   new String[] {
			   "label", "assetID",
			   "border.width", "0",
			   "border.color", "0,38,174",
			   "border.style", "solid"
		   });
		addAnnotation
		  (permissionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/permission.svg"
		   });
		addAnnotation
		  (viewEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/view.svg"
		   });
		addAnnotation
		  (createEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/create.svg"
		   });
		addAnnotation
		  (editEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/edit.svg"
		   });
		addAnnotation
		  (productConfEClass,
		   source,
		   new String[] {
			   "label", "assetID",
			   "border.width", "0",
			   "border.color", "0,174,101",
			   "border.style", "solid"
		   });
		addAnnotation
		  (transactionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/transaction.svg"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/product.svg"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS-Traceability/icons/SVG/attribute.svg"
		   });
		addAnnotation
		  (objectEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "border.width", "0",
			   "border.color", "236,239,66",
			   "border.style", "solid"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getRol_Permissions(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "220,31,31"
		   });
		addAnnotation
		  (getRol_Access(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "220,31,31"
		   });
		addAnnotation
		  (getPermission_Property(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "141,28,167"
		   });
		addAnnotation
		  (getTransaction_Transactionconf(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,38,174"
		   });
		addAnnotation
		  (getTransaction_Next(),
		   source,
		   new String[] {
			   "source", "previous",
			   "source.decoration", "closedarrow",
			   "target", "next",
			   "target.decoration", "filledclosedarrow",
			   "style", "solid"
		   });
		addAnnotation
		  (getTransaction_Subtransaction(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,38,174"
		   });
		addAnnotation
		  (getProduct_Productconf(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,174,101"
		   });
		addAnnotation
		  (getProduct_Next(),
		   source,
		   new String[] {
			   "source", "previous",
			   "source.decoration", "closedarrow",
			   "target", "next",
			   "target.decoration", "filledclosedarrow",
			   "style", "solid"
		   });
	}

	/**
	 * Initializes the annotations for <b>emf.gen</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmfAnnotations() {
		String source = "emf.gen";
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "fileExtensions", "trustd"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (systemEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "diagram.extension", "trust",
			   "model.extension", "trustd"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getObject_Properties(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
		addAnnotation
		  (getAsset_Properties(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "free"
		   });
	}

} //TraceabilityMMPackageImpl
