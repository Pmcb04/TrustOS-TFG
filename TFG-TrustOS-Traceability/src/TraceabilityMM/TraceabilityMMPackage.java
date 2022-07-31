/**
 */
package TraceabilityMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TraceabilityMM.TraceabilityMMFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TraceabilityMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/TraceabilityMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TraceabilityMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityMMPackage eINSTANCE = TraceabilityMM.impl.TraceabilityMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.AssetImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 13;

	/**
	 * The feature id for the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_ID = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.RolImpl <em>Rol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.RolImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getRol()
	 * @generated
	 */
	int ROL = 0;

	/**
	 * The feature id for the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ASSET_ID = ASSET__ASSET_ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__PERMISSIONS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL__ACCESS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.PropertyImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.TransactionConfImpl <em>Transaction Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.TransactionConfImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTransactionConf()
	 * @generated
	 */
	int TRANSACTION_CONF = 1;

	/**
	 * The feature id for the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__ASSET_ID = ASSET__ASSET_ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Transaction Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.SystemImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ASSETS = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROLES = 2;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PERMISSIONS = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NODES = 4;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.PermissionImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ViewImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PROPERTY = PERMISSION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = PERMISSION__NAME;

	/**
	 * The feature id for the '<em><b>View all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__VIEW_ALL = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.CreateImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 5;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__PROPERTY = PERMISSION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = PERMISSION__NAME;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.EditImpl <em>Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.EditImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getEdit()
	 * @generated
	 */
	int EDIT = 6;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT__PROPERTY = PERMISSION__PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT__NAME = PERMISSION__NAME;

	/**
	 * The feature id for the '<em><b>Edit all</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT__EDIT_ALL = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ProductConfImpl <em>Product Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ProductConfImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProductConf()
	 * @generated
	 */
	int PRODUCT_CONF = 7;

	/**
	 * The feature id for the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF__ASSET_ID = ASSET__ASSET_ID;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Product Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF_FEATURE_COUNT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.NodeImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.TransactionImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Transactionconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__TRANSACTIONCONF = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PREVIOUS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NEXT = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subtransaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__SUBTRANSACTION = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ProductImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Productconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTCONF = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NEXT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PREVIOUS = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__MUTABLE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.AttributeImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MUTABLE = PROPERTY__MUTABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ObjectImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Mutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MUTABLE = PROPERTY__MUTABLE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PROPERTIES = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.EType
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 15;


	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Rol <em>Rol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol</em>'.
	 * @see TraceabilityMM.Rol
	 * @generated
	 */
	EClass getRol();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Rol#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see TraceabilityMM.Rol#getPermissions()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Rol#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access</em>'.
	 * @see TraceabilityMM.Rol#getAccess()
	 * @see #getRol()
	 * @generated
	 */
	EReference getRol_Access();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see TraceabilityMM.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TraceabilityMM.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Property#isMutable <em>Mutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutable</em>'.
	 * @see TraceabilityMM.Property#isMutable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Mutable();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.TransactionConf <em>Transaction Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Conf</em>'.
	 * @see TraceabilityMM.TransactionConf
	 * @generated
	 */
	EClass getTransactionConf();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see TraceabilityMM.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TraceabilityMM.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.System#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see TraceabilityMM.System#getAssets()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Assets();

	/**
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.System#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see TraceabilityMM.System#getRoles()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.System#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see TraceabilityMM.System#getPermissions()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Permissions();

	/**
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.System#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see TraceabilityMM.System#getNodes()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Nodes();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see TraceabilityMM.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Permission#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Property</em>'.
	 * @see TraceabilityMM.Permission#getProperty()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Property();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Permission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TraceabilityMM.Permission#getName()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Name();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see TraceabilityMM.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.View#isView_all <em>View all</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View all</em>'.
	 * @see TraceabilityMM.View#isView_all()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_View_all();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see TraceabilityMM.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Edit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit</em>'.
	 * @see TraceabilityMM.Edit
	 * @generated
	 */
	EClass getEdit();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Edit#isEdit_all <em>Edit all</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit all</em>'.
	 * @see TraceabilityMM.Edit#isEdit_all()
	 * @see #getEdit()
	 * @generated
	 */
	EAttribute getEdit_Edit_all();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.ProductConf <em>Product Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Conf</em>'.
	 * @see TraceabilityMM.ProductConf
	 * @generated
	 */
	EClass getProductConf();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see TraceabilityMM.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link TraceabilityMM.Transaction#getTransactionconf <em>Transactionconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transactionconf</em>'.
	 * @see TraceabilityMM.Transaction#getTransactionconf()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Transactionconf();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Transaction#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see TraceabilityMM.Transaction#getPrevious()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Previous();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Transaction#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see TraceabilityMM.Transaction#getNext()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Next();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Transaction#getSubtransaction <em>Subtransaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtransaction</em>'.
	 * @see TraceabilityMM.Transaction#getSubtransaction()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Subtransaction();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see TraceabilityMM.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the reference '{@link TraceabilityMM.Product#getProductconf <em>Productconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Productconf</em>'.
	 * @see TraceabilityMM.Product#getProductconf()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Productconf();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Product#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see TraceabilityMM.Product#getNext()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Next();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Product#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see TraceabilityMM.Product#getPrevious()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Previous();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see TraceabilityMM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TraceabilityMM.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see TraceabilityMM.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.Object#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see TraceabilityMM.Object#getProperties()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Properties();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see TraceabilityMM.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TraceabilityMM.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see TraceabilityMM.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Asset#getAssetID <em>Asset ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset ID</em>'.
	 * @see TraceabilityMM.Asset#getAssetID()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetID();

	/**
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.Asset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see TraceabilityMM.Asset#getProperties()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Properties();

	/**
	 * Returns the meta object for enum '{@link TraceabilityMM.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see TraceabilityMM.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityMMFactory getTraceabilityMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.RolImpl <em>Rol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.RolImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getRol()
		 * @generated
		 */
		EClass ROL = eINSTANCE.getRol();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__PERMISSIONS = eINSTANCE.getRol_Permissions();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL__ACCESS = eINSTANCE.getRol_Access();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.PropertyImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Mutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__MUTABLE = eINSTANCE.getProperty_Mutable();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.TransactionConfImpl <em>Transaction Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.TransactionConfImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTransactionConf()
		 * @generated
		 */
		EClass TRANSACTION_CONF = eINSTANCE.getTransactionConf();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.SystemImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ASSETS = eINSTANCE.getSystem_Assets();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ROLES = eINSTANCE.getSystem_Roles();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PERMISSIONS = eINSTANCE.getSystem_Permissions();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__NODES = eINSTANCE.getSystem_Nodes();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.PermissionImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__PROPERTY = eINSTANCE.getPermission_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.ViewImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>View all</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__VIEW_ALL = eINSTANCE.getView_View_all();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.CreateImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.EditImpl <em>Edit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.EditImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getEdit()
		 * @generated
		 */
		EClass EDIT = eINSTANCE.getEdit();

		/**
		 * The meta object literal for the '<em><b>Edit all</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT__EDIT_ALL = eINSTANCE.getEdit_Edit_all();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.ProductConfImpl <em>Product Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.ProductConfImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProductConf()
		 * @generated
		 */
		EClass PRODUCT_CONF = eINSTANCE.getProductConf();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.TransactionImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();

		/**
		 * The meta object literal for the '<em><b>Transactionconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__TRANSACTIONCONF = eINSTANCE.getTransaction_Transactionconf();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__PREVIOUS = eINSTANCE.getTransaction_Previous();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__NEXT = eINSTANCE.getTransaction_Next();

		/**
		 * The meta object literal for the '<em><b>Subtransaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__SUBTRANSACTION = eINSTANCE.getTransaction_Subtransaction();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.ProductImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Productconf</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCTCONF = eINSTANCE.getProduct_Productconf();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__NEXT = eINSTANCE.getProduct_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PREVIOUS = eINSTANCE.getProduct_Previous();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.AttributeImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.ObjectImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__PROPERTIES = eINSTANCE.getObject_Properties();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.NodeImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.AssetImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Asset ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_ID = eINSTANCE.getAsset_AssetID();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROPERTIES = eINSTANCE.getAsset_Properties();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.EType
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

	}

} //TraceabilityMMPackage
