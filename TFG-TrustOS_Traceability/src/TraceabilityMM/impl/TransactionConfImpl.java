/**
 */
package TraceabilityMM.impl;

import TraceabilityMM.Counter;
import TraceabilityMM.TraceabilityMMPackage;
import TraceabilityMM.Transaction;
import TraceabilityMM.TransactionConf;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.impl.TransactionConfImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionConfImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionConfImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionConfImpl#isIsTransactionInfinite <em>Is Transaction Infinite</em>}</li>
 *   <li>{@link TraceabilityMM.impl.TransactionConfImpl#isIsTransactionFinal <em>Is Transaction Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionConfImpl extends AssetImpl implements TransactionConf {
	/**
	 * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final int REPEAT_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected int repeat = REPEAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTransaction() <em>Transaction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransaction()
	 * @generated
	 * @ordered
	 */
	protected EList<Transaction> transaction;
	/**
	 * The cached setting delegate for the '{@link #isIsTransactionInfinite() <em>Is Transaction Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransactionInfinite()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_TRANSACTION_INFINITE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TraceabilityMMPackage.Literals.TRANSACTION_CONF__IS_TRANSACTION_INFINITE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #isIsTransactionFinal() <em>Is Transaction Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTransactionFinal()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate IS_TRANSACTION_FINAL__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TraceabilityMMPackage.Literals.TRANSACTION_CONF__IS_TRANSACTION_FINAL).getSettingDelegate();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionConfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityMMPackage.Literals.TRANSACTION_CONF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(int newRepeat) {
		int oldRepeat = repeat;
		repeat = newRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.TRANSACTION_CONF__REPEAT, oldRepeat, repeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transaction> getTransaction() {
		if (transaction == null) {
			transaction = new EObjectWithInverseResolvingEList<Transaction>(Transaction.class, this, TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION, TraceabilityMMPackage.TRANSACTION__TRANSACTIONCONF);
		}
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTransactionInfinite() {
		return (Boolean)IS_TRANSACTION_INFINITE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransactionInfinite(boolean newIsTransactionInfinite) {
		IS_TRANSACTION_INFINITE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsTransactionInfinite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTransactionFinal() {
		return (Boolean)IS_TRANSACTION_FINAL__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTransactionFinal(boolean newIsTransactionFinal) {
		IS_TRANSACTION_FINAL__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIsTransactionFinal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityMMPackage.TRANSACTION_CONF__FINAL, oldFinal, final_));
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
			case TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransaction()).basicAdd(otherEnd, msgs);
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
			case TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION:
				return ((InternalEList<?>)getTransaction()).basicRemove(otherEnd, msgs);
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
			case TraceabilityMMPackage.TRANSACTION_CONF__REPEAT:
				return getRepeat();
			case TraceabilityMMPackage.TRANSACTION_CONF__FINAL:
				return isFinal();
			case TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION:
				return getTransaction();
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_INFINITE:
				return isIsTransactionInfinite();
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_FINAL:
				return isIsTransactionFinal();
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
			case TraceabilityMMPackage.TRANSACTION_CONF__REPEAT:
				setRepeat((Integer)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__FINAL:
				setFinal((Boolean)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION:
				getTransaction().clear();
				getTransaction().addAll((Collection<? extends Transaction>)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_INFINITE:
				setIsTransactionInfinite((Boolean)newValue);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_FINAL:
				setIsTransactionFinal((Boolean)newValue);
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
			case TraceabilityMMPackage.TRANSACTION_CONF__REPEAT:
				setRepeat(REPEAT_EDEFAULT);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION:
				getTransaction().clear();
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_INFINITE:
				IS_TRANSACTION_INFINITE__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_FINAL:
				IS_TRANSACTION_FINAL__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case TraceabilityMMPackage.TRANSACTION_CONF__REPEAT:
				return repeat != REPEAT_EDEFAULT;
			case TraceabilityMMPackage.TRANSACTION_CONF__FINAL:
				return final_ != FINAL_EDEFAULT;
			case TraceabilityMMPackage.TRANSACTION_CONF__TRANSACTION:
				return transaction != null && !transaction.isEmpty();
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_INFINITE:
				return IS_TRANSACTION_INFINITE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TraceabilityMMPackage.TRANSACTION_CONF__IS_TRANSACTION_FINAL:
				return IS_TRANSACTION_FINAL__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (repeat: ");
		result.append(repeat);
		result.append(", final: ");
		result.append(final_);
		result.append(')');
		return result.toString();
	}

} //TransactionConfImpl
