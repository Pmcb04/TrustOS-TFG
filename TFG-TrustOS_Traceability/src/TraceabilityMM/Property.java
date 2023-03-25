/**
 */
package TraceabilityMM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TraceabilityMM.Property#getId <em>Id</em>}</li>
 *   <li>{@link TraceabilityMM.Property#getTitle <em>Title</em>}</li>
 *   <li>{@link TraceabilityMM.Property#getAllow <em>Allow</em>}</li>
 * </ul>
 *
 * @see TraceabilityMM.TraceabilityMMPackage#getProperty()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='propertiesAllow'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot propertiesAllow=' (self.oclContainer().oclIsTypeOf(ProductConf) or self.oclContainer().oclIsTypeOf(TransactionConf)) implies self.allow-&gt;size() &gt; 0'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see TraceabilityMM.TraceabilityMMPackage#getProperty_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Property#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Allow</b></em>' reference list.
	 * The list contents are of type {@link TraceabilityMM.Permission}.
	 * It is bidirectional and its opposite is '{@link TraceabilityMM.Permission#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow</em>' reference list.
	 * @see TraceabilityMM.TraceabilityMMPackage#getProperty_Allow()
	 * @see TraceabilityMM.Permission#getRefers
	 * @model opposite="refers"
	 * @generated
	 */
	EList<Permission> getAllow();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see TraceabilityMM.TraceabilityMMPackage#getProperty_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link TraceabilityMM.Property#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // Property
