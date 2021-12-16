/**
 */
package flexml;

import flexml.collections.ListOfPermutation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flexml.Child#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link flexml.Child#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see flexml.FlexmlPackage#getChild()
 * @model annotation="exeed label='return \'&lt;\'+self.child.name+\'&gt;\' + \' (\' +self.multiplicity + \')\';' classIcon='link'"
 * @generated
 */
public interface Child extends EObject {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link flexml.Multiplicity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see flexml.Multiplicity
	 * @see #setMultiplicity(Multiplicity)
	 * @see flexml.FlexmlPackage#getChild_Multiplicity()
	 * @model
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link flexml.Child#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see flexml.Multiplicity
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Element)
	 * @see flexml.FlexmlPackage#getChild_Child()
	 * @model
	 * @generated
	 */
	Element getChild();

	/**
	 * Sets the value of the '{@link flexml.Child#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Element value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="flexml.ListOfPermutation"
	 * @generated
	 */
	ListOfPermutation getPermutations();

} // Child
