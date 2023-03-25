/**
 */
package TraceabilityMM.util;

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
import TraceabilityMM.RolConf;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;
import TraceabilityMM.TransactionConf;
import TraceabilityMM.Value;
import TraceabilityMM.View;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see TraceabilityMM.TraceabilityMMPackage
 * @generated
 */
public class TraceabilityMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TraceabilityMMValidator INSTANCE = new TraceabilityMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "TraceabilityMM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityMMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TraceabilityMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TraceabilityMMPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case TraceabilityMMPackage.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case TraceabilityMMPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case TraceabilityMMPackage.TRANSACTION_CONF:
				return validateTransactionConf((TransactionConf)value, diagnostics, context);
			case TraceabilityMMPackage.PRODUCT_CONF:
				return validateProductConf((ProductConf)value, diagnostics, context);
			case TraceabilityMMPackage.ROL_CONF:
				return validateRolConf((RolConf)value, diagnostics, context);
			case TraceabilityMMPackage.ASSET:
				return validateAsset((Asset)value, diagnostics, context);
			case TraceabilityMMPackage.PERMISSION:
				return validatePermission((Permission)value, diagnostics, context);
			case TraceabilityMMPackage.EDIT:
				return validateEdit((Edit)value, diagnostics, context);
			case TraceabilityMMPackage.CREATE:
				return validateCreate((Create)value, diagnostics, context);
			case TraceabilityMMPackage.VIEW:
				return validateView((View)value, diagnostics, context);
			case TraceabilityMMPackage.SYSTEM:
				return validateSystem((TraceabilityMM.System)value, diagnostics, context);
			case TraceabilityMMPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case TraceabilityMMPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case TraceabilityMMPackage.OBJECT:
				return validateObject((TraceabilityMM.Object)value, diagnostics, context);
			case TraceabilityMMPackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case TraceabilityMMPackage.ETYPE:
				return validateEType((EType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionConf(TransactionConf transactionConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionConf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystem(TraceabilityMM.System system, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(system, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission(Permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(permission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateView(View view, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(view, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreate(Create create, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(create, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdit(Edit edit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(edit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductConf(ProductConf productConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productConf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productConf, diagnostics, context);
		if (result || diagnostics != null) result &= validateProductConf_transactionsFinals(productConf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the transactionsFinals constraint of '<em>Product Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRODUCT_CONF__TRANSACTIONS_FINALS__EEXPRESSION = "self.product.next_transaction.transactionconf->select(isTransactionInfinite)->size() >= 1 implies self.product.next_transaction.transactionconf->select(isTransactionFinal)->size() >= 1";

	/**
	 * Validates the transactionsFinals constraint of '<em>Product Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductConf_transactionsFinals(ProductConf productConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TraceabilityMMPackage.Literals.PRODUCT_CONF,
				 productConf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "transactionsFinals",
				 PRODUCT_CONF__TRANSACTIONS_FINALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transaction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_propertiesAllow(attribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObject(TraceabilityMM.Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(object, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(object, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(object, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_propertiesAllow(object, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsset(Asset asset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateProperty_propertiesAllow(property, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the propertiesAllow constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROPERTY__PROPERTIES_ALLOW__EEXPRESSION = " (self.oclContainer().oclIsTypeOf(ProductConf) or self.oclContainer().oclIsTypeOf(TransactionConf)) implies self.allow->size() > 0";

	/**
	 * Validates the propertiesAllow constraint of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty_propertiesAllow(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TraceabilityMMPackage.Literals.PROPERTY,
				 property,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "propertiesAllow",
				 PROPERTY__PROPERTIES_ALLOW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolConf(RolConf rolConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rolConf, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRolConf_onePermissionTotal(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRolConf_noMoreOneEdit(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRolConf_noMoreOneView(rolConf, diagnostics, context);
		if (result || diagnostics != null) result &= validateRolConf_noMoreOneCreate(rolConf, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onePermissionTotal constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROL_CONF__ONE_PERMISSION_TOTAL__EEXPRESSION = "self.permissions->selectByType(Permission)->size() <= 1";

	/**
	 * Validates the onePermissionTotal constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolConf_onePermissionTotal(RolConf rolConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TraceabilityMMPackage.Literals.ROL_CONF,
				 rolConf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onePermissionTotal",
				 ROL_CONF__ONE_PERMISSION_TOTAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noMoreOneEdit constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROL_CONF__NO_MORE_ONE_EDIT__EEXPRESSION = "self.permissions->selectByType(Edit)->size() <= 1";

	/**
	 * Validates the noMoreOneEdit constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolConf_noMoreOneEdit(RolConf rolConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TraceabilityMMPackage.Literals.ROL_CONF,
				 rolConf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noMoreOneEdit",
				 ROL_CONF__NO_MORE_ONE_EDIT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noMoreOneView constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROL_CONF__NO_MORE_ONE_VIEW__EEXPRESSION = "self.permissions->selectByType(View)->size() <= 1";

	/**
	 * Validates the noMoreOneView constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolConf_noMoreOneView(RolConf rolConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TraceabilityMMPackage.Literals.ROL_CONF,
				 rolConf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noMoreOneView",
				 ROL_CONF__NO_MORE_ONE_VIEW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noMoreOneCreate constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROL_CONF__NO_MORE_ONE_CREATE__EEXPRESSION = "self.permissions->selectByType(Create)->size() <= 1";

	/**
	 * Validates the noMoreOneCreate constraint of '<em>Rol Conf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRolConf_noMoreOneCreate(RolConf rolConf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TraceabilityMMPackage.Literals.ROL_CONF,
				 rolConf,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noMoreOneCreate",
				 ROL_CONF__NO_MORE_ONE_CREATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEType(EType eType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TraceabilityMMValidator
