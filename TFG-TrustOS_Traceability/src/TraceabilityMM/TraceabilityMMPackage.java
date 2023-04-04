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
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
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
	int ASSET = 6;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.RolConfImpl <em>Rol Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.RolConfImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getRolConf()
	 * @generated
	 */
	int ROL_CONF = 5;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.TransactionConfImpl <em>Transaction Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.TransactionConfImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTransactionConf()
	 * @generated
	 */
	int TRANSACTION_CONF = 3;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.SystemImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 11;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.PermissionImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 7;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ViewImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 10;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.CreateImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 9;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.EditImpl <em>Edit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.EditImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getEdit()
	 * @generated
	 */
	int EDIT = 8;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ProductConfImpl <em>Product Conf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ProductConfImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProductConf()
	 * @generated
	 */
	int PRODUCT_CONF = 4;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.NodeImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

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
	int TRANSACTION = 1;

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
	 * The feature id for the '<em><b>Next product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__NEXT_PRODUCT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__PREVIOUS_PRODUCT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ProductImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

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
	 * The feature id for the '<em><b>Previous transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PREVIOUS_TRANSACTION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NEXT_TRANSACTION = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__TYPE = 0;

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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__TYPE = ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__REPEAT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__FINAL = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__TRANSACTION = ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Transaction Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__IS_TRANSACTION_INFINITE = ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Transaction Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF__IS_TRANSACTION_FINAL = ASSET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transaction Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_CONF_FEATURE_COUNT = ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF__TYPE = ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF__PRODUCT = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Product Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONF_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.PropertyImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 12;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.AttributeImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 13;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ObjectImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 14;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.ValueImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_CONF__TYPE = ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_CONF__PROPERTIES = ASSET__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_CONF__PERMISSIONS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rol Conf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROL_CONF_FEATURE_COUNT = ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__REFERS = 0;

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
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT__REFERS = PERMISSION__REFERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT__NAME = PERMISSION__NAME;

	/**
	 * The number of structural features of the '<em>Edit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__REFERS = PERMISSION__REFERS;

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
	 * The feature id for the '<em><b>Refers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__REFERS = PERMISSION__REFERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = PERMISSION__NAME;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = PERMISSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NODES = 0;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ASSETS = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PERMISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ALLOW = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TITLE = PROPERTY__TITLE;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ALLOW = PROPERTY__ALLOW;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUES = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TITLE = PROPERTY__TITLE;

	/**
	 * The feature id for the '<em><b>Allow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ALLOW = PROPERTY__ALLOW;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link TraceabilityMM.impl.TemporalTransactionImpl <em>Temporal Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.impl.TemporalTransactionImpl
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTemporalTransaction()
	 * @generated
	 */
	int TEMPORAL_TRANSACTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_TRANSACTION__NAME = TRANSACTION__NAME;

	/**
	 * The feature id for the '<em><b>Transactionconf</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_TRANSACTION__TRANSACTIONCONF = TRANSACTION__TRANSACTIONCONF;

	/**
	 * The feature id for the '<em><b>Next product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_TRANSACTION__NEXT_PRODUCT = TRANSACTION__NEXT_PRODUCT;

	/**
	 * The feature id for the '<em><b>Previous product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_TRANSACTION__PREVIOUS_PRODUCT = TRANSACTION__PREVIOUS_PRODUCT;

	/**
	 * The number of structural features of the '<em>Temporal Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link TraceabilityMM.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TraceabilityMM.EType
	 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 17;


	/**
	 * Returns the meta object for class '{@link TraceabilityMM.RolConf <em>Rol Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rol Conf</em>'.
	 * @see TraceabilityMM.RolConf
	 * @generated
	 */
	EClass getRolConf();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.RolConf#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see TraceabilityMM.RolConf#getPermissions()
	 * @see #getRolConf()
	 * @generated
	 */
	EReference getRolConf_Permissions();

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
	 * Returns the meta object for the attribute '{@link TraceabilityMM.TransactionConf#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see TraceabilityMM.TransactionConf#getRepeat()
	 * @see #getTransactionConf()
	 * @generated
	 */
	EAttribute getTransactionConf_Repeat();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.TransactionConf#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transaction</em>'.
	 * @see TraceabilityMM.TransactionConf#getTransaction()
	 * @see #getTransactionConf()
	 * @generated
	 */
	EReference getTransactionConf_Transaction();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.TransactionConf#isIsTransactionInfinite <em>Is Transaction Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transaction Infinite</em>'.
	 * @see TraceabilityMM.TransactionConf#isIsTransactionInfinite()
	 * @see #getTransactionConf()
	 * @generated
	 */
	EAttribute getTransactionConf_IsTransactionInfinite();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.TransactionConf#isIsTransactionFinal <em>Is Transaction Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Transaction Final</em>'.
	 * @see TraceabilityMM.TransactionConf#isIsTransactionFinal()
	 * @see #getTransactionConf()
	 * @generated
	 */
	EAttribute getTransactionConf_IsTransactionFinal();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.TransactionConf#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see TraceabilityMM.TransactionConf#isFinal()
	 * @see #getTransactionConf()
	 * @generated
	 */
	EAttribute getTransactionConf_Final();

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
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Permission#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refers</em>'.
	 * @see TraceabilityMM.Permission#getRefers()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Refers();

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
	 * Returns the meta object for class '{@link TraceabilityMM.ProductConf <em>Product Conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Conf</em>'.
	 * @see TraceabilityMM.ProductConf
	 * @generated
	 */
	EClass getProductConf();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.ProductConf#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product</em>'.
	 * @see TraceabilityMM.ProductConf#getProduct()
	 * @see #getProductConf()
	 * @generated
	 */
	EReference getProductConf_Product();

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
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Transaction#getPrevious_product <em>Previous product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous product</em>'.
	 * @see TraceabilityMM.Transaction#getPrevious_product()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Previous_product();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Transaction#getNext_product <em>Next product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next product</em>'.
	 * @see TraceabilityMM.Transaction#getNext_product()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Next_product();

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
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Product#getNext_transaction <em>Next transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next transaction</em>'.
	 * @see TraceabilityMM.Product#getNext_transaction()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Next_transaction();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Product#getPrevious_transaction <em>Previous transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous transaction</em>'.
	 * @see TraceabilityMM.Product#getPrevious_transaction()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Previous_transaction();

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
	 * Returns the meta object for the containment reference list '{@link TraceabilityMM.Attribute#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see TraceabilityMM.Attribute#getValues()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Values();

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
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Asset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TraceabilityMM.Asset#getType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Type();

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
	 * Returns the meta object for class '{@link TraceabilityMM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see TraceabilityMM.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Property#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see TraceabilityMM.Property#getId()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Id();

	/**
	 * Returns the meta object for the reference list '{@link TraceabilityMM.Property#getAllow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allow</em>'.
	 * @see TraceabilityMM.Property#getAllow()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Allow();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Property#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see TraceabilityMM.Property#getTitle()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Title();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see TraceabilityMM.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link TraceabilityMM.Value#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TraceabilityMM.Value#getName()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Name();

	/**
	 * Returns the meta object for class '{@link TraceabilityMM.TemporalTransaction <em>Temporal Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Transaction</em>'.
	 * @see TraceabilityMM.TemporalTransaction
	 * @generated
	 */
	EClass getTemporalTransaction();

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
		 * The meta object literal for the '{@link TraceabilityMM.impl.RolConfImpl <em>Rol Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.RolConfImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getRolConf()
		 * @generated
		 */
		EClass ROL_CONF = eINSTANCE.getRolConf();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROL_CONF__PERMISSIONS = eINSTANCE.getRolConf_Permissions();

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
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_CONF__REPEAT = eINSTANCE.getTransactionConf_Repeat();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_CONF__TRANSACTION = eINSTANCE.getTransactionConf_Transaction();

		/**
		 * The meta object literal for the '<em><b>Is Transaction Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_CONF__IS_TRANSACTION_INFINITE = eINSTANCE.getTransactionConf_IsTransactionInfinite();

		/**
		 * The meta object literal for the '<em><b>Is Transaction Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_CONF__IS_TRANSACTION_FINAL = eINSTANCE.getTransactionConf_IsTransactionFinal();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_CONF__FINAL = eINSTANCE.getTransactionConf_Final();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

		/**
		 * The meta object literal for the '<em><b>Refers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__REFERS = eINSTANCE.getPermission_Refers();

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
		 * The meta object literal for the '{@link TraceabilityMM.impl.ProductConfImpl <em>Product Conf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.ProductConfImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getProductConf()
		 * @generated
		 */
		EClass PRODUCT_CONF = eINSTANCE.getProductConf();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONF__PRODUCT = eINSTANCE.getProductConf_Product();

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
		 * The meta object literal for the '<em><b>Previous product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__PREVIOUS_PRODUCT = eINSTANCE.getTransaction_Previous_product();

		/**
		 * The meta object literal for the '<em><b>Next product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__NEXT_PRODUCT = eINSTANCE.getTransaction_Next_product();

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
		 * The meta object literal for the '<em><b>Next transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__NEXT_TRANSACTION = eINSTANCE.getProduct_Next_transaction();

		/**
		 * The meta object literal for the '<em><b>Previous transaction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PREVIOUS_TRANSACTION = eINSTANCE.getProduct_Previous_transaction();

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
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VALUES = eINSTANCE.getAttribute_Values();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__TYPE = eINSTANCE.getAsset_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROPERTIES = eINSTANCE.getAsset_Properties();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ID = eINSTANCE.getProperty_Id();

		/**
		 * The meta object literal for the '<em><b>Allow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ALLOW = eINSTANCE.getProperty_Allow();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TITLE = eINSTANCE.getProperty_Title();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.ValueImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__NAME = eINSTANCE.getValue_Name();

		/**
		 * The meta object literal for the '{@link TraceabilityMM.impl.TemporalTransactionImpl <em>Temporal Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TraceabilityMM.impl.TemporalTransactionImpl
		 * @see TraceabilityMM.impl.TraceabilityMMPackageImpl#getTemporalTransaction()
		 * @generated
		 */
		EClass TEMPORAL_TRANSACTION = eINSTANCE.getTemporalTransaction();

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
