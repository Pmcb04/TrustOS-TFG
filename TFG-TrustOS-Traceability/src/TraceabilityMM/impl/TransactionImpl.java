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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link TraceabilityMM.impl.TransactionImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionImpl#getNext <em>Next</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionImpl#getSubtransaction <em>Subtransaction</em>}</li>
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
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> next;

	/**
	 * The cached value of the '{@link #getSubtransaction() <em>Subtransaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> subtransaction;

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
	public void setTransactionconf(TransactionConf newTransactionconf) {
		TransactionConf oldTransactionconf = transactionconf;
		transactionconf = newTransactionconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF, oldTransactionconf, transactionconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, TraceabilityMMPackage.TRANSACTION__PREVIOUS, TraceabilityMMPackage.PRODUCT__NEXT);
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<Product>(Product.class, this, TraceabilityMMPackage.TRANSACTION__NEXT, TraceabilityMMPackage.PRODUCT__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getSubtransaction() {
		if (subtransaction == null) {
			subtransaction = new EObjectResolvingEList<Transaction>(Transaction.class, this, TraceabilityMMPackage.TRANSACTION__SUBTRANSACTION);
		}
		return subtransaction;
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
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevious()).basicAdd(otherEnd, msgs);
			case TraceabilityMMPackage.TRANSACTION__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
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
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS:
				return ((InternalEList<?>)getPrevious()).basicRemove(otherEnd, msgs);
			case TraceabilityMMPackage.TRANSACTION__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
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
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS:
				return getPrevious();
			case TraceabilityMMPackage.TRANSACTION__NEXT:
				return getNext();
			case TraceabilityMMPackage.TRANSACTION__SUBTRANSACTION:
				return getSubtransaction();
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
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS:
				getPrevious().clear();
				getPrevious().addAll((Collection<? extends Product>)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Product>)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION__SUBTRANSACTION:
				getSubtransaction().clear();
				getSubtransaction().addAll((Collection<? extends Transaction>)newValue);
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
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS:
				getPrevious().clear();
				return;
			case TraceabilityMMPackage.TRANSACTION__NEXT:
				getNext().clear();
				return;
			case TraceabilityMMPackage.TRANSACTION__SUBTRANSACTION:
				getSubtransaction().clear();
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
			case TraceabilityMMPackage.TRANSACTION__PREVIOUS:
				return previous != null && !previous.isEmpty();
			case TraceabilityMMPackage.TRANSACTION__NEXT:
				return next != null && !next.isEmpty();
			case TraceabilityMMPackage.TRANSACTION__SUBTRANSACTION:
				return subtransaction != null && !subtransaction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
