/**
 */
package flexml;

import flexml.collections.ListOfPermutation;

import org.eclipse.emf.common.util.EList;

import testcases.TcElement;

import testcases.collections.ListOfSubtree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flexml.Element#getAliasNames <em>Alias Names</em>}</li>
 *   <li>{@link flexml.Element#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link flexml.Element#getChildren <em>Children</em>}</li>
 *   <li>{@link flexml.Element#getHasText <em>Has Text</em>}</li>
 * </ul>
 *
 * @see flexml.FlexmlPackage#getElement()
 * @model annotation="exeed label='\r\nvar str : String;\r\nstr = \'&lt;\' + self.name + \'&gt;\';\r\n// concat aliases, if set\r\nif (not self.aliasName.isEmpty()) {\r\n str = str + \' (\' + self.aliasName.concat + \')\';\t\r\n}\r\nreturn  str;' classIcon='class'"
 * @generated
 */
public interface Element extends NamedObject {
	/**
	 * Returns the value of the '<em><b>Alias Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias Names</em>' attribute list.
	 * @see flexml.FlexmlPackage#getElement_AliasNames()
	 * @model
	 * @generated
	 */
	EList<String> getAliasNames();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link flexml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see flexml.FlexmlPackage#getElement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link flexml.Child}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see flexml.FlexmlPackage#getElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Child> getChildren();

	/**
	 * Returns the value of the '<em><b>Has Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Text</em>' attribute.
	 * @see #setHasText(Boolean)
	 * @see flexml.FlexmlPackage#getElement_HasText()
	 * @model
	 * @generated
	 */
	Boolean getHasText();

	/**
	 * Sets the value of the '{@link flexml.Element#getHasText <em>Has Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Text</em>' attribute.
	 * @see #getHasText()
	 * @generated
	 */
	void setHasText(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="testcases.ListOfSubtree"
	 * @generated
	 */
	ListOfSubtree createTestdataSubtrees();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="flexml.ListOfPermutation"
	 * @generated
	 */
	ListOfPermutation createChildPermutations(int inCurChildIndex);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TcElement instantiateToTestElement();

} // Element
