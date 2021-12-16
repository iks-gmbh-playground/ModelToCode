/**
 */
package flexml.impl;

import flexml.Attribute;
import flexml.FlexmlPackage;

import org.eclipse.emf.ecore.EClass;

import testcases.TcAttribute;
import testcases.TestcasesFactory;
import testcases.TestcasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AttributeImpl extends NamedObjectImpl implements Attribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlexmlPackage.Literals.ATTRIBUTE;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public TcAttribute instantiateToTestAttribute(int inParentId) {
        TestcasesPackage tcP = TestcasesPackage.eINSTANCE;
        TestcasesFactory tcFactory = TestcasesFactory.eINSTANCE;
		
        TcAttribute concreteAttribute = tcFactory.createTcAttribute();
		concreteAttribute.setName(getName());
		concreteAttribute.setValue(String.format("Value for %s %d", getName(), inParentId)); 
		return concreteAttribute;
	}

} //AttributeImpl
