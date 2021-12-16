/**
 */
package testcases;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testcases.TestcasesPackage
 * @generated
 */
public interface TestcasesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestcasesFactory eINSTANCE = testcases.impl.TestcasesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tc Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tc Attribute</em>'.
	 * @generated
	 */
	TcAttribute createTcAttribute();

	/**
	 * Returns a new object of class '<em>Tc Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tc Element</em>'.
	 * @generated
	 */
	TcElement createTcElement();

	/**
	 * Returns a new object of class '<em>Testcase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testcase</em>'.
	 * @generated
	 */
	Testcase createTestcase();

	/**
	 * Returns a new object of class '<em>List Of Testcase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Testcase</em>'.
	 * @generated
	 */
	ListOfTestcase createListOfTestcase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestcasesPackage getTestcasesPackage();

} //TestcasesFactory
