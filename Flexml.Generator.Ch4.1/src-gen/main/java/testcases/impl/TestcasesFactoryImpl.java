/**
 */
package testcases.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import testcases.*;

import testcases.collections.ListOfListOfSubtree;
import testcases.collections.ListOfSubtree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestcasesFactoryImpl extends EFactoryImpl implements TestcasesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestcasesFactory init() {
		try {
			TestcasesFactory theTestcasesFactory = (TestcasesFactory)EPackage.Registry.INSTANCE.getEFactory(TestcasesPackage.eNS_URI);
			if (theTestcasesFactory != null) {
				return theTestcasesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestcasesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestcasesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TestcasesPackage.TC_ATTRIBUTE: return createTcAttribute();
			case TestcasesPackage.TC_ELEMENT: return createTcElement();
			case TestcasesPackage.TESTCASE: return createTestcase();
			case TestcasesPackage.LIST_OF_TESTCASE: return createListOfTestcase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TestcasesPackage.LIST_OF_SUBTREE:
				return createListOfSubtreeFromString(eDataType, initialValue);
			case TestcasesPackage.LIST_OF_LIST_OF_SUBTREE:
				return createListOfListOfSubtreeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TestcasesPackage.LIST_OF_SUBTREE:
				return convertListOfSubtreeToString(eDataType, instanceValue);
			case TestcasesPackage.LIST_OF_LIST_OF_SUBTREE:
				return convertListOfListOfSubtreeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TcAttribute createTcAttribute() {
		TcAttributeImpl tcAttribute = new TcAttributeImpl();
		return tcAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TcElement createTcElement() {
		TcElementImpl tcElement = new TcElementImpl();
		return tcElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Testcase createTestcase() {
		TestcaseImpl testcase = new TestcaseImpl();
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListOfTestcase createListOfTestcase() {
		ListOfTestcaseImpl listOfTestcase = new ListOfTestcaseImpl();
		return listOfTestcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfSubtree createListOfSubtreeFromString(EDataType eDataType, String initialValue) {
		return (ListOfSubtree)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOfSubtreeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfListOfSubtree createListOfListOfSubtreeFromString(EDataType eDataType, String initialValue) {
		return (ListOfListOfSubtree)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListOfListOfSubtreeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestcasesPackage getTestcasesPackage() {
		return (TestcasesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestcasesPackage getPackage() {
		return TestcasesPackage.eINSTANCE;
	}

} //TestcasesFactoryImpl
