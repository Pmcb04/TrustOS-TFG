/**
 */
package TraceabilityMM.impl;

import TraceabilityMM.Attribute;
import TraceabilityMM.Counter;
import TraceabilityMM.Create;
import TraceabilityMM.EType;
import TraceabilityMM.Edit;
import TraceabilityMM.Permission;
import TraceabilityMM.Product;
import TraceabilityMM.ProductConf;
import TraceabilityMM.Rol;
import TraceabilityMM.RolConf;
import TraceabilityMM.TemporalTransaction;
import TraceabilityMM.TermporalTransaction;
import TraceabilityMM.TraceabilityMMFactory;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;
import TraceabilityMM.TransactionConf;
import TraceabilityMM.Value;
import TraceabilityMM.View;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityMMFactoryImpl extends EFactoryImpl implements TraceabilityMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TraceabilityMMFactory init() {
		try {
			TraceabilityMMFactory theTraceabilityMMFactory = (TraceabilityMMFactory)EPackage.Registry.INSTANCE.getEFactory(TraceabilityMMPackage.eNS_URI);
			if (theTraceabilityMMFactory != null) {
				return theTraceabilityMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TraceabilityMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TraceabilityMMPackage.TRANSACTION: return createTransaction();
			case TraceabilityMMPackage.PRODUCT: return createProduct();
			case TraceabilityMMPackage.TRANSACTION_CONF: return createTransactionConf();
			case TraceabilityMMPackage.PRODUCT_CONF: return createProductConf();
			case TraceabilityMMPackage.ROL_CONF: return createRolConf();
			case TraceabilityMMPackage.PERMISSION: return createPermission();
			case TraceabilityMMPackage.EDIT: return createEdit();
			case TraceabilityMMPackage.CREATE: return createCreate();
			case TraceabilityMMPackage.VIEW: return createView();
			case TraceabilityMMPackage.SYSTEM: return createSystem();
			case TraceabilityMMPackage.ATTRIBUTE: return createAttribute();
			case TraceabilityMMPackage.OBJECT: return createObject();
			case TraceabilityMMPackage.VALUE: return createValue();
			case TraceabilityMMPackage.TEMPORAL_TRANSACTION: return createTemporalTransaction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TraceabilityMMPackage.ETYPE:
				return createETypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TraceabilityMMPackage.ETYPE:
				return convertETypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolConf createRolConf() {
		RolConfImpl rolConf = new RolConfImpl();
		return rolConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConf createTransactionConf() {
		TransactionConfImpl transactionConf = new TransactionConfImpl();
		return transactionConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityMM.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edit createEdit() {
		EditImpl edit = new EditImpl();
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductConf createProductConf() {
		ProductConfImpl productConf = new ProductConfImpl();
		return productConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityMM.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalTransaction createTemporalTransaction() {
		TemporalTransactionImpl temporalTransaction = new TemporalTransactionImpl();
		return temporalTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType createETypeFromString(EDataType eDataType, String initialValue) {
		EType result = EType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityMMPackage getTraceabilityMMPackage() {
		return (TraceabilityMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TraceabilityMMPackage getPackage() {
		return TraceabilityMMPackage.eINSTANCE;
	}

} //TraceabilityMMFactoryImpl
