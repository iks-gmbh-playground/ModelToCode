/**
 */
package testcases;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testcases.TestcasesFactory
 * @model kind="package"
 * @generated
 */
public interface TestcasesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testcases";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://test.flexible.xml/version1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "t";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestcasesPackage eINSTANCE = testcases.impl.TestcasesPackageImpl.init();

	/**
	 * The meta object id for the '{@link testcases.impl.TcAttributeImpl <em>Tc Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcases.impl.TcAttributeImpl
	 * @see testcases.impl.TestcasesPackageImpl#getTcAttribute()
	 * @generated
	 */
	int TC_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tc Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link testcases.impl.TcElementImpl <em>Tc Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcases.impl.TcElementImpl
	 * @see testcases.impl.TestcasesPackageImpl#getTcElement()
	 * @generated
	 */
	int TC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ELEMENT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ELEMENT__CHILDREN = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ELEMENT__TEXT = 3;

	/**
	 * The feature id for the '<em><b>Object Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ELEMENT__OBJECT_ID = 4;

	/**
	 * The number of structural features of the '<em>Tc Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TC_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link testcases.impl.TestcaseImpl <em>Testcase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcases.impl.TestcaseImpl
	 * @see testcases.impl.TestcasesPackageImpl#getTestcase()
	 * @generated
	 */
	int TESTCASE = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Testcase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTCASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link testcases.impl.ListOfTestcaseImpl <em>List Of Testcase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcases.impl.ListOfTestcaseImpl
	 * @see testcases.impl.TestcasesPackageImpl#getListOfTestcase()
	 * @generated
	 */
	int LIST_OF_TESTCASE = 3;

	/**
	 * The feature id for the '<em><b>Testcases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TESTCASE__TESTCASES = 0;

	/**
	 * The number of structural features of the '<em>List Of Testcase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_TESTCASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>List Of Subtree</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcases.collections.ListOfSubtree
	 * @see testcases.impl.TestcasesPackageImpl#getListOfSubtree()
	 * @generated
	 */
	int LIST_OF_SUBTREE = 4;

	/**
	 * The meta object id for the '<em>List Of List Of Subtree</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testcases.collections.ListOfListOfSubtree
	 * @see testcases.impl.TestcasesPackageImpl#getListOfListOfSubtree()
	 * @generated
	 */
	int LIST_OF_LIST_OF_SUBTREE = 5;


	/**
	 * Returns the meta object for class '{@link testcases.TcAttribute <em>Tc Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tc Attribute</em>'.
	 * @see testcases.TcAttribute
	 * @generated
	 */
	EClass getTcAttribute();

	/**
	 * Returns the meta object for the attribute '{@link testcases.TcAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testcases.TcAttribute#getName()
	 * @see #getTcAttribute()
	 * @generated
	 */
	EAttribute getTcAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link testcases.TcAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see testcases.TcAttribute#getValue()
	 * @see #getTcAttribute()
	 * @generated
	 */
	EAttribute getTcAttribute_Value();

	/**
	 * Returns the meta object for class '{@link testcases.TcElement <em>Tc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tc Element</em>'.
	 * @see testcases.TcElement
	 * @generated
	 */
	EClass getTcElement();

	/**
	 * Returns the meta object for the attribute '{@link testcases.TcElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testcases.TcElement#getName()
	 * @see #getTcElement()
	 * @generated
	 */
	EAttribute getTcElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link testcases.TcElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see testcases.TcElement#getAttributes()
	 * @see #getTcElement()
	 * @generated
	 */
	EReference getTcElement_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link testcases.TcElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see testcases.TcElement#getChildren()
	 * @see #getTcElement()
	 * @generated
	 */
	EReference getTcElement_Children();

	/**
	 * Returns the meta object for the attribute '{@link testcases.TcElement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see testcases.TcElement#getText()
	 * @see #getTcElement()
	 * @generated
	 */
	EAttribute getTcElement_Text();

	/**
	 * Returns the meta object for the attribute '{@link testcases.TcElement#getObjectId <em>Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Id</em>'.
	 * @see testcases.TcElement#getObjectId()
	 * @see #getTcElement()
	 * @generated
	 */
	EAttribute getTcElement_ObjectId();

	/**
	 * Returns the meta object for class '{@link testcases.Testcase <em>Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testcase</em>'.
	 * @see testcases.Testcase
	 * @generated
	 */
	EClass getTestcase();

	/**
	 * Returns the meta object for the containment reference '{@link testcases.Testcase#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see testcases.Testcase#getRoot()
	 * @see #getTestcase()
	 * @generated
	 */
	EReference getTestcase_Root();

	/**
	 * Returns the meta object for the attribute '{@link testcases.Testcase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see testcases.Testcase#getName()
	 * @see #getTestcase()
	 * @generated
	 */
	EAttribute getTestcase_Name();

	/**
	 * Returns the meta object for class '{@link testcases.ListOfTestcase <em>List Of Testcase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Testcase</em>'.
	 * @see testcases.ListOfTestcase
	 * @generated
	 */
	EClass getListOfTestcase();

	/**
	 * Returns the meta object for the containment reference list '{@link testcases.ListOfTestcase#getTestcases <em>Testcases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testcases</em>'.
	 * @see testcases.ListOfTestcase#getTestcases()
	 * @see #getListOfTestcase()
	 * @generated
	 */
	EReference getListOfTestcase_Testcases();

	/**
	 * Returns the meta object for data type '{@link testcases.collections.ListOfSubtree <em>List Of Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Of Subtree</em>'.
	 * @see testcases.collections.ListOfSubtree
	 * @model instanceClass="testcases.collections.ListOfSubtree"
	 * @generated
	 */
	EDataType getListOfSubtree();

	/**
	 * Returns the meta object for data type '{@link testcases.collections.ListOfListOfSubtree <em>List Of List Of Subtree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Of List Of Subtree</em>'.
	 * @see testcases.collections.ListOfListOfSubtree
	 * @model instanceClass="testcases.collections.ListOfListOfSubtree"
	 * @generated
	 */
	EDataType getListOfListOfSubtree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestcasesFactory getTestcasesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testcases.impl.TcAttributeImpl <em>Tc Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcases.impl.TcAttributeImpl
		 * @see testcases.impl.TestcasesPackageImpl#getTcAttribute()
		 * @generated
		 */
		EClass TC_ATTRIBUTE = eINSTANCE.getTcAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_ATTRIBUTE__NAME = eINSTANCE.getTcAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_ATTRIBUTE__VALUE = eINSTANCE.getTcAttribute_Value();

		/**
		 * The meta object literal for the '{@link testcases.impl.TcElementImpl <em>Tc Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcases.impl.TcElementImpl
		 * @see testcases.impl.TestcasesPackageImpl#getTcElement()
		 * @generated
		 */
		EClass TC_ELEMENT = eINSTANCE.getTcElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_ELEMENT__NAME = eINSTANCE.getTcElement_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TC_ELEMENT__ATTRIBUTES = eINSTANCE.getTcElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TC_ELEMENT__CHILDREN = eINSTANCE.getTcElement_Children();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_ELEMENT__TEXT = eINSTANCE.getTcElement_Text();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TC_ELEMENT__OBJECT_ID = eINSTANCE.getTcElement_ObjectId();

		/**
		 * The meta object literal for the '{@link testcases.impl.TestcaseImpl <em>Testcase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcases.impl.TestcaseImpl
		 * @see testcases.impl.TestcasesPackageImpl#getTestcase()
		 * @generated
		 */
		EClass TESTCASE = eINSTANCE.getTestcase();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTCASE__ROOT = eINSTANCE.getTestcase_Root();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTCASE__NAME = eINSTANCE.getTestcase_Name();

		/**
		 * The meta object literal for the '{@link testcases.impl.ListOfTestcaseImpl <em>List Of Testcase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcases.impl.ListOfTestcaseImpl
		 * @see testcases.impl.TestcasesPackageImpl#getListOfTestcase()
		 * @generated
		 */
		EClass LIST_OF_TESTCASE = eINSTANCE.getListOfTestcase();

		/**
		 * The meta object literal for the '<em><b>Testcases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_OF_TESTCASE__TESTCASES = eINSTANCE.getListOfTestcase_Testcases();

		/**
		 * The meta object literal for the '<em>List Of Subtree</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcases.collections.ListOfSubtree
		 * @see testcases.impl.TestcasesPackageImpl#getListOfSubtree()
		 * @generated
		 */
		EDataType LIST_OF_SUBTREE = eINSTANCE.getListOfSubtree();

		/**
		 * The meta object literal for the '<em>List Of List Of Subtree</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testcases.collections.ListOfListOfSubtree
		 * @see testcases.impl.TestcasesPackageImpl#getListOfListOfSubtree()
		 * @generated
		 */
		EDataType LIST_OF_LIST_OF_SUBTREE = eINSTANCE.getListOfListOfSubtree();

	}

} //TestcasesPackage
