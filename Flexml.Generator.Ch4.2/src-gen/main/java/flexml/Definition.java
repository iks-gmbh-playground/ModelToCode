/**
 */
package flexml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flexml.Definition#getRoot <em>Root</em>}</li>
 *   <li>{@link flexml.Definition#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see flexml.FlexmlPackage#getDefinition()
 * @model annotation="exeed classIcon='model'"
 * @generated
 */
public interface Definition extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Element)
	 * @see flexml.FlexmlPackage#getDefinition_Root()
	 * @model containment="true"
	 * @generated
	 */
	Element getRoot();

	/**
	 * Sets the value of the '{@link flexml.Definition#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Element value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link flexml.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see flexml.FlexmlPackage#getDefinition_Element()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElement();

} // Definition
