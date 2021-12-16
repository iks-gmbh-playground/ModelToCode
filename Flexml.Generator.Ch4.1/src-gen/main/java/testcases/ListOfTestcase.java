/**
 */
package testcases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Testcase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testcases.ListOfTestcase#getTestcase <em>Testcase</em>}</li>
 * </ul>
 *
 * @see testcases.TestcasesPackage#getListOfTestcase()
 * @model
 * @generated
 */
public interface ListOfTestcase extends EObject {
	/**
	 * Returns the value of the '<em><b>Testcase</b></em>' containment reference list.
	 * The list contents are of type {@link testcases.Testcase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testcase</em>' containment reference list.
	 * @see testcases.TestcasesPackage#getListOfTestcase_Testcase()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Testcase> getTestcase();

} // ListOfTestcase
