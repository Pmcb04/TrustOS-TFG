/**
 */
package TraceabilityMM.impl;

import TraceabilityMM.Counter;
import TraceabilityMM.Product;
import TraceabilityMM.ProductConf;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.impl.ProductImpl#getProductconf <em>Productconf</em>}</li>
 *   <li>{@link TraceabilityMM.impl.ProductImpl#getPrevious_transaction <em>Previous transaction</em>}</li>
 *   <li>{@link TraceabilityMM.impl.ProductImpl#getNext_transaction <em>Next transaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends NodeImpl implements Product {
	/**
	 * The cached value of the '{@link #getProductconf() <em>Productconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductconf()
	 * @generated
	 * @ordered
	 */
	protected ProductConf productconf;

	/**
	 * The cached value of the '{@link #getPrevious_transaction() <em>Previous transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_transaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> previous_transaction;

	/**
	 * The cached value of the '{@link #getNext_transaction() <em>Next transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext_transaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> next_transaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityMMPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductConf getProductconf() {
		if (productconf != null && productconf.eIsProxy()) {
			InternalEObject oldProductconf = (InternalEObject)productconf;
			productconf = (ProductConf)eResolveProxy(oldProductconf);
			if (productconf != oldProductconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityMMPackage.PRODUCT__PRODUCTCONF, oldProductconf, productconf));
			}
		}
		return productconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductConf basicGetProductconf() {
		return productconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductconf(ProductConf newProductconf, NotificationChain msgs) {
		ProductConf oldProductconf = productconf;
		productconf = newProductconf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.PRODUCT__PRODUCTCONF, oldProductconf, newProductconf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductconf(ProductConf newProductconf) {
		if (newProductconf != productconf) {
			NotificationChain msgs = null;
			if (productconf != null)
				msgs = ((InternalEObject)productconf).eInverseRemove(this, TraceabilityMMPackage.PRODUCT_CONF__PRODUCT, ProductConf.class, msgs);
			if (newProductconf != null)
				msgs = ((InternalEObject)newProductconf).eInverseAdd(this, TraceabilityMMPackage.PRODUCT_CONF__PRODUCT, ProductConf.class, msgs);
			msgs = basicSetProductconf(newProductconf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.PRODUCT__PRODUCTCONF, newProductconf, newProductconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getNext_transaction() {
		if (next_transaction == null) {
			next_transaction = new EObjectWithInverseResolvingEList.ManyInverse<Transaction>(Transaction.class, this, TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION, TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT);
		}
		return next_transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getPrevious_transaction() {
		if (previous_transaction == null) {
			previous_transaction = new EObjectWithInverseResolvingEList.ManyInverse<Transaction>(Transaction.class, this, TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION, TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT);
		}
		return previous_transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityMMPackage.PRODUCT__PRODUCTCONF:
				if (productconf != null)
					msgs = ((InternalEObject)productconf).eInverseRemove(this, TraceabilityMMPackage.PRODUCT_CONF__PRODUCT, ProductConf.class, msgs);
				return basicSetProductconf((ProductConf)otherEnd, msgs);
			case TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevious_transaction()).basicAdd(otherEnd, msgs);
			case TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext_transaction()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityMMPackage.PRODUCT__PRODUCTCONF:
				return basicSetProductconf(null, msgs);
			case TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION:
				return ((InternalEList<?>)getPrevious_transaction()).basicRemove(otherEnd, msgs);
			case TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION:
				return ((InternalEList<?>)getNext_transaction()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityMMPackage.PRODUCT__PRODUCTCONF:
				if (resolve) return getProductconf();
				return basicGetProductconf();
			case TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION:
				return getPrevious_transaction();
			case TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION:
				return getNext_transaction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TraceabilityMMPackage.PRODUCT__PRODUCTCONF:
				setProductconf((ProductConf)newValue);
				return;
			case TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION:
				getPrevious_transaction().clear();
				getPrevious_transaction().addAll((Collection<? extends Transaction>)newValue);
				return;
			case TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION:
				getNext_transaction().clear();
				getNext_transaction().addAll((Collection<? extends Transaction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TraceabilityMMPackage.PRODUCT__PRODUCTCONF:
				setProductconf((ProductConf)null);
				return;
			case TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION:
				getPrevious_transaction().clear();
				return;
			case TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION:
				getNext_transaction().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TraceabilityMMPackage.PRODUCT__PRODUCTCONF:
				return productconf != null;
			case TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION:
				return previous_transaction != null && !previous_transaction.isEmpty();
			case TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION:
				return next_transaction != null && !next_transaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
