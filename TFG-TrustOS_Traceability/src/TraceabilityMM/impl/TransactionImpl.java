/**
 */
package TraceabilityMM.impl;

import TraceabilityMM.Product;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;
import TraceabilityMM.TransactionConf;

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
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.impl.TransactionImpl#getTransactionconf <em>Transactionconf</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionImpl#getNext_product <em>Next product</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionImpl#getPrevious_product <em>Previous product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends NodeImpl implements Transaction {
	/**
	 * The cached value of the '{@link #getTransactionconf() <em>Transactionconf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionconf()
	 * @generated
	 * @ordered
	 */
	protected TransactionConf transactionconf;

	/**
	 * The cached value of the '{@link #getNext_product() <em>Next product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext_product()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> next_product;

	/**
	 * The cached value of the '{@link #getPrevious_product() <em>Previous product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious_product()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> previous_product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityMMPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConf getTransactionconf() {
		if (transactionconf != null && transactionconf.eIsProxy()) {
			InternalEObject oldTransactionconf = (InternalEObject)transactionconf;
			transactionconf = (TransactionConf)eResolveProxy(oldTransactionconf);
			if (transactionconf != oldTransactionconf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF, oldTransactionconf, transactionconf));
			}
		}
		return transactionconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionConf basicGetTransactionconf() {
		return transactionconf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionconf(TransactionConf newTransactionconf, NotificationChain msgs) {
		TransactionConf oldTransactionconf = transactionconf;
		transactionconf = newTransactionconf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF, oldTransactionconf, newTransactionconf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionconf(TransactionConf newTransactionconf) {
		if (newTransactionconf != transactionconf) {
			NotificationChain msgs = null;
			if (transactionconf != null)
				msgs = ((InternalEObject)transactionconf).eInverseRemove(this, TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION, TransactionConf.class, msgs);
			if (newTransactionconf != null)
				msgs = ((InternalEObject)newTransactionconf).eInverseAdd(this, TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION, TransactionConf.class, msgs);
			msgs = basicSetTransactionconf(newTransactionconf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF, newTransactionconf, newTransactionconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getPrevious_product() {
		if (previous_product == null) {
			previous_product = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT, TraceabilityMMPackage.PRODUCT__NEXT_TRANSACTION);
		}
		return previous_product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getNext_product() {
		if (next_product == null) {
			next_product = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT, TraceabilityMMPackage.PRODUCT__PREVIOUS_TRANSACTION);
		}
		return next_product;
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
			case TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF:
				if (transactionconf != null)
					msgs = ((InternalEObject)transactionconf).eInverseRemove(this, TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION, TransactionConf.class, msgs);
				return basicSetTransactionconf((TransactionConf)otherEnd, msgs);
			case TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext_product()).basicAdd(otherEnd, msgs);
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevious_product()).basicAdd(otherEnd, msgs);
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
			case TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF:
				return basicSetTransactionconf(null, msgs);
			case TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT:
				return ((InternalEList<?>)getNext_product()).basicRemove(otherEnd, msgs);
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT:
				return ((InternalEList<?>)getPrevious_product()).basicRemove(otherEnd, msgs);
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
			case TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF:
				if (resolve) return getTransactionconf();
				return basicGetTransactionconf();
			case TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT:
				return getNext_product();
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT:
				return getPrevious_product();
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
			case TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF:
				setTransactionconf((TransactionConf)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT:
				getNext_product().clear();
				getNext_product().addAll((Collection<? extends Product>)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT:
				getPrevious_product().clear();
				getPrevious_product().addAll((Collection<? extends Product>)newValue);
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
			case TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF:
				setTransactionconf((TransactionConf)null);
				return;
			case TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT:
				getNext_product().clear();
				return;
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT:
				getPrevious_product().clear();
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
			case TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF:
				return transactionconf != null;
			case TraceabilityMMPackage.TRANSACTION__NEXT_PRODUCT:
				return next_product != null && !next_product.isEmpty();
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS_PRODUCT:
				return previous_product != null && !previous_product.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
