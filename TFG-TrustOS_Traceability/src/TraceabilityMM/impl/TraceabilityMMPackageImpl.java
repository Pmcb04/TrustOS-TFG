/**
 */
package TraceabilityMM.impl;

import TraceabilityMM.Asset;
import TraceabilityMM.Attribute;
import TraceabilityMM.Counter;
import TraceabilityMM.Create;
import TraceabilityMM.EType;
import TraceabilityMM.Edit;
import TraceabilityMM.Node;
import TraceabilityMM.Permission;
import TraceabilityMM.Product;
import TraceabilityMM.ProductConf;
import TraceabilityMM.Property;
import TraceabilityMM.Rol;
import TraceabilityMM.RolConf;
import TraceabilityMM.TraceabilityMMFactory;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;
import TraceabilityMM.TransactionConf;
import TraceabilityMM.Value;
import TraceabilityMM.View;

import TraceabilityMM.util.TraceabilityMMValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
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
	private EClass rolConfEClass = null;

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
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTraceabilityMMPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TraceabilityMMValidator.INSTANCE;
				 }
			 });

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
	public EClass getRolConf() {
		return rolConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolConf_Permissions() {
		return (EReference)rolConfEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getTransactionConf_Repeat() {
		return (EAttribute)transactionConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionConf_Transaction() {
		return (EReference)transactionConfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionConf_IsTransactionInfinite() {
		return (EAttribute)transactionConfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionConf_IsTransactionFinal() {
		return (EAttribute)transactionConfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionConf_Final() {
		return (EAttribute)transactionConfEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute)systemEClass.getEStructuralFeatures().get(3);
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
	public EReference getSystem_Permissions() {
		return (EReference)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Nodes() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getPermission_Name() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPermission_Refers() {
		return (EReference)permissionEClass.getEStructuralFeatures().get(0);
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
	public EClass getProductConf() {
		return productConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductConf_Product() {
		return (EReference)productConfEClass.getEStructuralFeatures().get(0);
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
	public EReference getTransaction_Previous_product() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Next_product() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(1);
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
	public EReference getProduct_Next_transaction() {
		return (EReference)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Previous_transaction() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Values() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAsset_Type() {
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
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Id() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Allow() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Title() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Name() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
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
		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__TRANSACTIONCONF);
		createEReference(transactionEClass, TRANSACTION__NEXT_PRODUCT);
		createEReference(transactionEClass, TRANSACTION__PREVIOUS_PRODUCT);

		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__PRODUCTCONF);
		createEReference(productEClass, PRODUCT__PREVIOUS_TRANSACTION);
		createEReference(productEClass, PRODUCT__NEXT_TRANSACTION);

		transactionConfEClass = createEClass(TRANSACTION_CONF);
		createEAttribute(transactionConfEClass, TRANSACTION_CONF__REPEAT);
		createEAttribute(transactionConfEClass, TRANSACTION_CONF__FINAL);
		createEReference(transactionConfEClass, TRANSACTION_CONF__TRANSACTION);
		createEAttribute(transactionConfEClass, TRANSACTION_CONF__IS_TRANSACTION_INFINITE);
		createEAttribute(transactionConfEClass, TRANSACTION_CONF__IS_TRANSACTION_FINAL);

		productConfEClass = createEClass(PRODUCT_CONF);
		createEReference(productConfEClass, PRODUCT_CONF__PRODUCT);

		rolConfEClass = createEClass(ROL_CONF);
		createEReference(rolConfEClass, ROL_CONF__PERMISSIONS);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__TYPE);
		createEReference(assetEClass, ASSET__PROPERTIES);

		permissionEClass = createEClass(PERMISSION);
		createEReference(permissionEClass, PERMISSION__REFERS);
		createEAttribute(permissionEClass, PERMISSION__NAME);

		editEClass = createEClass(EDIT);

		createEClass = createEClass(CREATE);

		viewEClass = createEClass(VIEW);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__NODES);
		createEReference(systemEClass, SYSTEM__ASSETS);
		createEReference(systemEClass, SYSTEM__PERMISSIONS);
		createEAttribute(systemEClass, SYSTEM__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__ID);
		createEAttribute(propertyEClass, PROPERTY__TITLE);
		createEReference(propertyEClass, PROPERTY__ALLOW);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__VALUES);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__PROPERTIES);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__NAME);

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
		transactionEClass.getESuperTypes().add(this.getNode());
		productEClass.getESuperTypes().add(this.getNode());
		transactionConfEClass.getESuperTypes().add(this.getAsset());
		productConfEClass.getESuperTypes().add(this.getAsset());
		rolConfEClass.getESuperTypes().add(this.getAsset());
		editEClass.getESuperTypes().add(this.getPermission());
		createEClass.getESuperTypes().add(this.getPermission());
		viewEClass.getESuperTypes().add(this.getPermission());
		attributeEClass.getESuperTypes().add(this.getProperty());
		objectEClass.getESuperTypes().add(this.getProperty());

		// Initialize classes and features; add operations and parameters
		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Transactionconf(), this.getTransactionConf(), this.getTransactionConf_Transaction(), "transactionconf", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Next_product(), this.getProduct(), this.getProduct_Previous_transaction(), "next_product", null, 1, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Previous_product(), this.getProduct(), this.getProduct_Next_transaction(), "previous_product", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_Productconf(), this.getProductConf(), this.getProductConf_Product(), "productconf", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Previous_transaction(), this.getTransaction(), this.getTransaction_Next_product(), "previous_transaction", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Next_transaction(), this.getTransaction(), this.getTransaction_Previous_product(), "next_transaction", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionConfEClass, TransactionConf.class, "TransactionConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransactionConf_Repeat(), ecorePackage.getEInt(), "repeat", "1", 1, 1, TransactionConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionConf_Final(), ecorePackage.getEBoolean(), "final", "false", 1, 1, TransactionConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransactionConf_Transaction(), this.getTransaction(), this.getTransaction_Transactionconf(), "transaction", null, 1, -1, TransactionConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionConf_IsTransactionInfinite(), ecorePackage.getEBoolean(), "isTransactionInfinite", null, 1, 1, TransactionConf.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransactionConf_IsTransactionFinal(), ecorePackage.getEBoolean(), "isTransactionFinal", null, 1, 1, TransactionConf.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(productConfEClass, ProductConf.class, "ProductConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductConf_Product(), this.getProduct(), this.getProduct_Productconf(), "product", null, 1, -1, ProductConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolConfEClass, RolConf.class, "RolConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRolConf_Permissions(), this.getPermission(), null, "permissions", null, 1, -1, RolConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Type(), ecorePackage.getEString(), "type", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Properties(), this.getProperty(), null, "properties", null, 1, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPermission_Refers(), this.getProperty(), this.getProperty_Allow(), "refers", null, 1, -1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermission_Name(), ecorePackage.getEString(), "name", null, 1, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editEClass, Edit.class, "Edit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemEClass, TraceabilityMM.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Nodes(), this.getNode(), null, "nodes", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Assets(), this.getAsset(), null, "assets", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, TraceabilityMM.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Id(), ecorePackage.getEString(), "id", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Title(), ecorePackage.getEString(), "title", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Allow(), this.getPermission(), this.getPermission_Refers(), "allow", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Values(), this.getValue(), null, "values", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.getEType(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectEClass, TraceabilityMM.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Properties(), this.getProperty(), null, "properties", null, 2, -1, TraceabilityMM.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eTypeEEnum, EType.class, "EType");
		addEEnumLiteral(eTypeEEnum, EType.STRING);
		addEEnumLiteral(eTypeEEnum, EType.NUMBER);
		addEEnumLiteral(eTypeEEnum, EType.DECIMAL);
		addEEnumLiteral(eTypeEEnum, EType.BOOLEAN);
		addEEnumLiteral(eTypeEEnum, EType.DATE);
		addEEnumLiteral(eTypeEEnum, EType.EMAIL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
		// gmf.link
		createGmf_2Annotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// gmf.compartment
		createGmf_3Annotations();
		// emf.gen
		createEmfAnnotations();
		// gmf.diagram
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
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (productConfEClass,
		   source,
		   new String[] {
			   "constraints", "transactionsFinals"
		   });
		addAnnotation
		  (rolConfEClass,
		   source,
		   new String[] {
			   "constraints", "onePermissionTotal noMoreOneEdit noMoreOneView noMoreOneCreate"
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "constraints", "propertiesAllow"
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
		addAnnotation
		  (transactionConfEClass,
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
		  (permissionEClass,
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
		  (createEClass,
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
		  (systemEClass,
		   source,
		   new String[] {
			   "archetype", "Role"
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
		  (transactionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/transaction.svg",
			   "tool.name", "Transaction",
			   "tool.description", "Create a transaction"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/product.svg",
			   "tool.name", "Product",
			   "tool.description", "Create a product"
		   });
		addAnnotation
		  (transactionConfEClass,
		   source,
		   new String[] {
			   "label", "type",
			   "border.width", "0",
			   "border.color", "0,38,175",
			   "border.style", "solid",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/transactionConf.svg",
			   "tool.name", "Transaction Configuration",
			   "tool.description", "Create a configuration for transaction"
		   });
		addAnnotation
		  (productConfEClass,
		   source,
		   new String[] {
			   "label", "type",
			   "border.width", "0",
			   "border.color", "0,174,102",
			   "border.style", "solid",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/productConf.svg",
			   "tool.name", "Product Configuration",
			   "tool.description", "Create a configuration for product"
		   });
		addAnnotation
		  (rolConfEClass,
		   source,
		   new String[] {
			   "label", "type",
			   "border.width", "0",
			   "border.color", "220,31,31",
			   "border.style", "solid",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/rolConf.svg",
			   "tool.name", "Rol Configuration",
			   "tool.description", "Create a configuration for rol"
		   });
		addAnnotation
		  (permissionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/permission.svg",
			   "tool.name", "Permission to do all",
			   "tool.description", "Create a permission to do all for a rol"
		   });
		addAnnotation
		  (editEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/edit.svg",
			   "tool.name", "Permission to edit",
			   "tool.description", "Create a permission to edit for a rol"
		   });
		addAnnotation
		  (createEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/create.svg",
			   "tool.name", "Permission to create",
			   "tool.description", "Create a permission to create for a rol"
		   });
		addAnnotation
		  (viewEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/view.svg",
			   "tool.name", "Permission to view",
			   "tool.description", "Create a permission to view for a rol"
		   });
		addAnnotation
		  (attributeEClass,
		   source,
		   new String[] {
			   "label", "id",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/attribute.svg",
			   "tool.name", "Attribute",
			   "tool.description", "Create a attribute in a configuration"
		   });
		addAnnotation
		  (objectEClass,
		   source,
		   new String[] {
			   "label", "id",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/objet.svg",
			   "tool.name", "Object",
			   "tool.description", "Create a object of attributes in a configuration"
		   });
		addAnnotation
		  (valueEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "figure", "svg",
			   "svg.uri", "platform:/plugin/TFG-TrustOS_Traceability/icons/SVG/value.svg",
			   "tool.name", "Value of attribute",
			   "tool.description", "Create a value of one attribute"
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
	protected void createGmf_4Annotations() {
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
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getTransaction_Transactionconf(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,38,175",
			   "tool.name", "Transaction configuration",
			   "tool.description", "Link a transaction to it configuration"
		   });
		addAnnotation
		  (getTransaction_Next_product(),
		   source,
		   new String[] {
			   "source", "previous_transaction",
			   "target", "next_product",
			   "target.decoration", "filledclosedarrow",
			   "style", "solid",
			   "color", "0,0,0",
			   "tool.name", "Next product",
			   "tool.description", "Link the transaction to next product"
		   });
		addAnnotation
		  (getProduct_Productconf(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,174,102"
		   });
		addAnnotation
		  (getProduct_Productconf(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "0,174,102",
			   "tool.name", "Product configuration",
			   "tool.description", "Link a product to it configuration"
		   });
		addAnnotation
		  (getProduct_Next_transaction(),
		   source,
		   new String[] {
			   "source", "previous_product",
			   "target", "next_transaction",
			   "target.decoration", "filledclosedarrow",
			   "style", "solid",
			   "color", "0,0,0",
			   "tool.name", "Next transaction",
			   "tool.description", "Link the product to next transaction"
		   });
		addAnnotation
		  (getRolConf_Permissions(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "220,31,31",
			   "tool.name", "Permission of a rol",
			   "tool.description", "Link the rol to it permissions"
		   });
		addAnnotation
		  (getPermission_Refers(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "style", "dash",
			   "color", "192,192,192",
			   "tool.name", "Properties allow",
			   "tool.description", "Link the properties that the permission allow"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getTransactionConf_IsTransactionInfinite(),
		   source,
		   new String[] {
			   "derivation", "self.repeat = -1"
		   });
		addAnnotation
		  (getTransactionConf_IsTransactionFinal(),
		   source,
		   new String[] {
			   "derivation", "self.final"
		   });
		addAnnotation
		  (productConfEClass,
		   source,
		   new String[] {
			   "transactionsFinals", "self.product.next_transaction.transactionconf->select(isTransactionInfinite)->size() >= 1 implies self.product.next_transaction.transactionconf->select(isTransactionFinal)->size() >= 1"
		   });
		addAnnotation
		  (rolConfEClass,
		   source,
		   new String[] {
			   "onePermissionTotal", "self.permissions->selectByType(Permission)->size() <= 1",
			   "noMoreOneEdit", "self.permissions->selectByType(Edit)->size() <= 1",
			   "noMoreOneView", "self.permissions->selectByType(View)->size() <= 1",
			   "noMoreOneCreate", "self.permissions->selectByType(Create)->size() <= 1"
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "propertiesAllow", " (self.oclContainer().oclIsTypeOf(ProductConf) or self.oclContainer().oclIsTypeOf(TransactionConf)) implies self.allow->size() > 0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getAsset_Properties(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "list"
		   });
		addAnnotation
		  (getAttribute_Values(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "list"
		   });
		addAnnotation
		  (getObject_Properties(),
		   source,
		   new String[] {
			   "collapsible", "true",
			   "layout", "list"
		   });
	}

} //TraceabilityMMPackageImpl
