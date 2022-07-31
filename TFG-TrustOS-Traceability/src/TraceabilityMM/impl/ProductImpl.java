/**
 */
package TraceabilityMM.impl;

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
 *   <li>{@link TraceabilityMM.impl.ProductImpl#getNext <em>Next</em>}</li>
 *   <li>{@link TraceabilityMM.impl.ProductImpl#getPrevious <em>Previous</em>}</li>
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> previous;

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
	public void setProductconf(ProductConf newProductconf) {
		ProductConf oldProductconf = productconf;
		productconf = newProductconf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.PRODUCT__PRODUCTCONF, oldProductconf, productconf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<Transaction>(Transaction.class, this, TraceabilityMMPackage.PRODUCT__NEXT, TraceabilityMMPackage.TRANSACTION__PREVIOUS);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getPrevious() {
		if (previous == null) {
			previous = new EObjectWithInverseResolvingEList.ManyInverse<Transaction>(Transaction.class, this, TraceabilityMMPackage.PRODUCT__PREVIOUS, TraceabilityMMPackage.TRANSACTION__NEXT);
		}
		return previous;
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
			case TraceabilityMMPackage.PRODUCT__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
			case TraceabilityMMPackage.PRODUCT__PREVIOUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrevious()).basicAdd(otherEnd, msgs);
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
			case TraceabilityMMPackage.PRODUCT__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case TraceabilityMMPackage.PRODUCT__PREVIOUS:
				return ((InternalEList<?>)getPrevious()).basicRemove(otherEnd, msgs);
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
			case TraceabilityMMPackage.PRODUCT__NEXT:
				return getNext();
			case TraceabilityMMPackage.PRODUCT__PREVIOUS:
				return getPrevious();
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
			case TraceabilityMMPackage.PRODUCT__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Transaction>)newValue);
				return;
			case TraceabilityMMPackage.PRODUCT__PREVIOUS:
				getPrevious().clear();
				getPrevious().addAll((Collection<? extends Transaction>)newValue);
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
			case TraceabilityMMPackage.PRODUCT__NEXT:
				getNext().clear();
				return;
			case TraceabilityMMPackage.PRODUCT__PREVIOUS:
				getPrevious().clear();
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
			case TraceabilityMMPackage.PRODUCT__NEXT:
				return next != null && !next.isEmpty();
			case TraceabilityMMPackage.PRODUCT__PREVIOUS:
				return previous != null && !previous.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
