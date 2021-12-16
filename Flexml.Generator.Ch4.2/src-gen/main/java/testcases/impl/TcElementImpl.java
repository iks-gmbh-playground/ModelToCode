/**
 */
package testcases.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import flexml.gentest.Counter;
import testcases.TcAttribute;
import testcases.TcElement;
import testcases.TestcasesFactory;
import testcases.TestcasesPackage;

import testcases.collections.ListOfSubtree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tc Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testcases.impl.TcElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link testcases.impl.TcElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link testcases.impl.TcElementImpl#getChild <em>Child</em>}</li>
 *   <li>{@link testcases.impl.TcElementImpl#getText <em>Text</em>}</li>
 *   <li>{@link testcases.impl.TcElementImpl#getObjectId <em>Object Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcElementImpl extends EObjectImpl implements TcElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<TcAttribute> attribute;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<TcElement> child;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OBJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectId() <em>Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectId()
	 * @generated
	 * @ordered
	 */
	protected Integer objectId = OBJECT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcasesPackage.Literals.TC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesPackage.TC_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TcAttribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<TcAttribute>(TcAttribute.class, this, TestcasesPackage.TC_ELEMENT__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TcElement> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<TcElement>(TcElement.class, this, TestcasesPackage.TC_ELEMENT__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesPackage.TC_ELEMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getObjectId() {
		return objectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectId(Integer newObjectId) {
		Integer oldObjectId = objectId;
		objectId = newObjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestcasesPackage.TC_ELEMENT__OBJECT_ID, oldObjectId, objectId));
	}

	/**
	 * Add a deep copy of each subtree as a child
	 * @param inListOfSubtrees : The list of subtrees
	 * 
	 * @generated NOT
	 */
	@Override
	public void attachAsChildren(ListOfSubtree inListOfSubtrees) {
		for (TcElement curSubtree : inListOfSubtrees.getList()) {
			getChild().add(curSubtree.deepCopy());
		}
	}

	/**
	 * Create a deep copy of an instance (recusively)
	 * @generated NOT
	 */
	@Override
	public TcElement deepCopy() {
        TestcasesPackage tcP = TestcasesPackage.eINSTANCE;
        TestcasesFactory tcFactory = TestcasesFactory.eINSTANCE;
		
		TcElement result = tcFactory.createTcElement();
		result.setName(getName());
		result.setObjectId(Counter.nextCount());
		if ((null != getText()) && ! getText().isEmpty()) {
			result.setText(String.format("Here is some text for element %s %d", result.getName(), result.getObjectId()));	
		} 
		for (TcAttribute curAttribute : getAttribute()) {
			result.getAttribute().add(curAttribute.deepCopy(result.getObjectId()));
		}
		for (TcElement curChild : getChild()) {
			result.getChild().add(curChild.deepCopy());
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
			case TestcasesPackage.TC_ELEMENT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case TestcasesPackage.TC_ELEMENT__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
			case TestcasesPackage.TC_ELEMENT__NAME:
				return getName();
			case TestcasesPackage.TC_ELEMENT__ATTRIBUTE:
				return getAttribute();
			case TestcasesPackage.TC_ELEMENT__CHILD:
				return getChild();
			case TestcasesPackage.TC_ELEMENT__TEXT:
				return getText();
			case TestcasesPackage.TC_ELEMENT__OBJECT_ID:
				return getObjectId();
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
			case TestcasesPackage.TC_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case TestcasesPackage.TC_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends TcAttribute>)newValue);
				return;
			case TestcasesPackage.TC_ELEMENT__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends TcElement>)newValue);
				return;
			case TestcasesPackage.TC_ELEMENT__TEXT:
				setText((String)newValue);
				return;
			case TestcasesPackage.TC_ELEMENT__OBJECT_ID:
				setObjectId((Integer)newValue);
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
			case TestcasesPackage.TC_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestcasesPackage.TC_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case TestcasesPackage.TC_ELEMENT__CHILD:
				getChild().clear();
				return;
			case TestcasesPackage.TC_ELEMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TestcasesPackage.TC_ELEMENT__OBJECT_ID:
				setObjectId(OBJECT_ID_EDEFAULT);
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
			case TestcasesPackage.TC_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestcasesPackage.TC_ELEMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case TestcasesPackage.TC_ELEMENT__CHILD:
				return child != null && !child.isEmpty();
			case TestcasesPackage.TC_ELEMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TestcasesPackage.TC_ELEMENT__OBJECT_ID:
				return OBJECT_ID_EDEFAULT == null ? objectId != null : !OBJECT_ID_EDEFAULT.equals(objectId);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", text: ");
		result.append(text);
		result.append(", objectId: ");
		result.append(objectId);
		result.append(')');
		return result.toString();
	}

} //TcElementImpl
