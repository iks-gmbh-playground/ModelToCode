/**
 */
package testcases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import testcases.collections.ListOfSubtree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tc Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testcases.TcElement#getName <em>Name</em>}</li>
 *   <li>{@link testcases.TcElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link testcases.TcElement#getChildren <em>Children</em>}</li>
 *   <li>{@link testcases.TcElement#getText <em>Text</em>}</li>
 *   <li>{@link testcases.TcElement#getObjectId <em>Object Id</em>}</li>
 * </ul>
 *
 * @see testcases.TestcasesPackage#getTcElement()
 * @model
 * @generated
 */
public interface TcElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testcases.TestcasesPackage#getTcElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testcases.TcElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link testcases.TcAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see testcases.TestcasesPackage#getTcElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link testcases.TcElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see testcases.TestcasesPackage#getTcElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcElement> getChildren();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see testcases.TestcasesPackage#getTcElement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link testcases.TcElement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id</em>' attribute.
	 * @see #setObjectId(Integer)
	 * @see testcases.TestcasesPackage#getTcElement_ObjectId()
	 * @model
	 * @generated
	 */
	Integer getObjectId();

	/**
	 * Sets the value of the '{@link testcases.TcElement#getObjectId <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Id</em>' attribute.
	 * @see #getObjectId()
	 * @generated
	 */
	void setObjectId(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model inListOfSubtreesDataType="testcases.ListOfSubtree"
	 * @generated
	 */
	void attachAsChildren(ListOfSubtree inListOfSubtrees);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TcElement deepCopy();

} // TcElement
