/**
 */
package testcases.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testcases.ListOfTestcase;
import testcases.Testcase;
import testcases.TestcasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Of Testcase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link testcases.impl.ListOfTestcaseImpl#getTestcase <em>Testcase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListOfTestcaseImpl extends EObjectImpl implements ListOfTestcase {
	/**
	 * The cached value of the '{@link #getTestcase() <em>Testcase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestcase()
	 * @generated
	 * @ordered
	 */
	protected EList<Testcase> testcase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfTestcaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestcasesPackage.Literals.LIST_OF_TESTCASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Testcase> getTestcase() {
		if (testcase == null) {
			testcase = new EObjectContainmentEList<Testcase>(Testcase.class, this, TestcasesPackage.LIST_OF_TESTCASE__TESTCASE);
		}
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestcasesPackage.LIST_OF_TESTCASE__TESTCASE:
				return ((InternalEList<?>)getTestcase()).basicRemove(otherEnd, msgs);
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
			case TestcasesPackage.LIST_OF_TESTCASE__TESTCASE:
				return getTestcase();
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
			case TestcasesPackage.LIST_OF_TESTCASE__TESTCASE:
				getTestcase().clear();
				getTestcase().addAll((Collection<? extends Testcase>)newValue);
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
			case TestcasesPackage.LIST_OF_TESTCASE__TESTCASE:
				getTestcase().clear();
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
			case TestcasesPackage.LIST_OF_TESTCASE__TESTCASE:
				return testcase != null && !testcase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListOfTestcaseImpl
