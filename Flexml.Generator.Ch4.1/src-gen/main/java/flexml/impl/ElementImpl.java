/**
 */
package flexml.impl;

import flexml.Attribute;
import flexml.Child;
import flexml.Element;
import flexml.FlexmlPackage;

import flexml.collections.ListOfPermutation;
import flexml.collections.Permutation;
import flexml.gentest.Counter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testcases.TcElement;
import testcases.TestcasesFactory;
import testcases.TestcasesPackage;
import testcases.collections.ListOfListOfSubtree;
import testcases.collections.ListOfSubtree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flexml.impl.ElementImpl#getAliasNames <em>Alias Names</em>}</li>
 *   <li>{@link flexml.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link flexml.impl.ElementImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link flexml.impl.ElementImpl#getHasText <em>Has Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends NamedObjectImpl implements Element {
	/**
	 * The cached value of the '{@link #getAliasNames() <em>Alias Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliasNames;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Child> children;

	/**
	 * The default value of the '{@link #getHasText() <em>Has Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasText()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHasText() <em>Has Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasText()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasText = HAS_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlexmlPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliasNames() {
		if (aliasNames == null) {
			aliasNames = new EDataTypeUniqueEList<String>(String.class, this, FlexmlPackage.ELEMENT__ALIAS_NAMES);
		}
		return aliasNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FlexmlPackage.ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Child> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<Child>(Child.class, this, FlexmlPackage.ELEMENT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasText() {
		return hasText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasText(Boolean newHasText) {
		Boolean oldHasText = hasText;
		hasText = newHasText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlexmlPackage.ELEMENT__HAS_TEXT, oldHasText, hasText));
	}

	/**
	 * Erzeugt zum Element die Liste aller möglichen Unterbäume
	 * @generated NOT
	 */
	@Override
	public ListOfSubtree createTestdataSubtrees() {
        ListOfSubtree result = new ListOfSubtree();

    	// Create all possible permutations of the child elements
        ListOfPermutation lopPermutationsOfAllChildren  = createChildPermutations(0);
        
    	/*
    	For each permutation in the list of permutations:
    		For each child in the permutation:
    			Create a list of possible subtrees
    	*/
    	
        ListOfListOfSubtree lolosSubtreePermutations = lopPermutationsOfAllChildren.transformIntoSubtreePermutations(); 
    	
    	// If we do not have children, return a list containing only ourself
    	if (lolosSubtreePermutations.isEmpty()) {
    		result.add(instantiateToTestElement());
    	} else {
    		// For every possible subtree: Create an instance with the elements of the subtree as children
    		for (ListOfSubtree losCur: lolosSubtreePermutations.getList()) {
    			TcElement curElement = instantiateToTestElement();
    			curElement.attachAsChildren(losCur);
    			result.add(curElement);
    		}
    	}
        
        return result;
	}

	/**
	 Recursively create a list of all child permutations of the current element
	[[A], [A, B], [A, A, B], ...]
	
	 self                : Element
	 inCurChildIndex     : The index of the child that is being permutated
	 returns             : ListOfPermutation
	 * @generated NOT
	 */
	@Override
	public ListOfPermutation createChildPermutations(int inCurChildIndex) {
		// If we have no more children, return an empty list
		if (inCurChildIndex >= getChildren().size()) {
			return new ListOfPermutation();
		}

		Child curChild = getChildren().get(inCurChildIndex);
		ListOfPermutation lopChildPermutations = curChild.getPermutations(); 

		/*
		If there are no more children
		*/
		if (inCurChildIndex >= getChildren().size() - 1) {
			return lopChildPermutations;
			}

		/*
		If there are more children
			create the permutation for each element of childPermutation with the child permutations
		*/
		ListOfPermutation lopResult = new ListOfPermutation();
		for (Permutation curPermutation :  lopChildPermutations.getList()) {
			// Create permutations for all remaining children
			ListOfPermutation lopTailPermutations  = createChildPermutations(inCurChildIndex + 1);
			ListOfPermutation lopCombinedPermutations = curPermutation.permutate(lopTailPermutations); 
			lopResult.addAll(lopCombinedPermutations);
		}
		return lopResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TcElement instantiateToTestElement() {
        TestcasesPackage tcP = TestcasesPackage.eINSTANCE;

        TestcasesFactory tcFactory = TestcasesFactory.eINSTANCE;
		
		TcElement result = tcFactory.createTcElement();
		result.setName(getName());
		result.setObjectId(Counter.nextCount());
		
		if ((null != getHasText()) && getHasText()) {
			result.setText(String.format("Here is some text for element %s %d", result.getName(), result.getObjectId()));
		}
		for (Attribute curAttribute: getAttributes()) {
			result.getAttributes().add(curAttribute.instantiateToTestAttribute(result.getObjectId()));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlexmlPackage.ELEMENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FlexmlPackage.ELEMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case FlexmlPackage.ELEMENT__ALIAS_NAMES:
				return getAliasNames();
			case FlexmlPackage.ELEMENT__ATTRIBUTES:
				return getAttributes();
			case FlexmlPackage.ELEMENT__CHILDREN:
				return getChildren();
			case FlexmlPackage.ELEMENT__HAS_TEXT:
				return getHasText();
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
			case FlexmlPackage.ELEMENT__ALIAS_NAMES:
				getAliasNames().clear();
				getAliasNames().addAll((Collection<? extends String>)newValue);
				return;
			case FlexmlPackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FlexmlPackage.ELEMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Child>)newValue);
				return;
			case FlexmlPackage.ELEMENT__HAS_TEXT:
				setHasText((Boolean)newValue);
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
			case FlexmlPackage.ELEMENT__ALIAS_NAMES:
				getAliasNames().clear();
				return;
			case FlexmlPackage.ELEMENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FlexmlPackage.ELEMENT__CHILDREN:
				getChildren().clear();
				return;
			case FlexmlPackage.ELEMENT__HAS_TEXT:
				setHasText(HAS_TEXT_EDEFAULT);
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
			case FlexmlPackage.ELEMENT__ALIAS_NAMES:
				return aliasNames != null && !aliasNames.isEmpty();
			case FlexmlPackage.ELEMENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FlexmlPackage.ELEMENT__CHILDREN:
				return children != null && !children.isEmpty();
			case FlexmlPackage.ELEMENT__HAS_TEXT:
				return HAS_TEXT_EDEFAULT == null ? hasText != null : !HAS_TEXT_EDEFAULT.equals(hasText);
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
		result.append(" (aliasNames: ");
		result.append(aliasNames);
		result.append(", hasText: ");
		result.append(hasText);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
