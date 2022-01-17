/**
 */
package testcases.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testcases.ListOfTestcase;
import testcases.TcAttribute;
import testcases.TcElement;
import testcases.Testcase;
import testcases.TestcasesFactory;
import testcases.TestcasesPackage;

import testcases.collections.ListOfListOfSubtree;
import testcases.collections.ListOfSubtree;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestcasesPackageImpl extends EPackageImpl implements TestcasesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testcaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfTestcaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfSubtreeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfListOfSubtreeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see testcases.TestcasesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestcasesPackageImpl() {
		super(eNS_URI, TestcasesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TestcasesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestcasesPackage init() {
		if (isInited) return (TestcasesPackage)EPackage.Registry.INSTANCE.getEPackage(TestcasesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestcasesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestcasesPackageImpl theTestcasesPackage = registeredTestcasesPackage instanceof TestcasesPackageImpl ? (TestcasesPackageImpl)registeredTestcasesPackage : new TestcasesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTestcasesPackage.createPackageContents();

		// Initialize created meta-data
		theTestcasesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestcasesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestcasesPackage.eNS_URI, theTestcasesPackage);
		return theTestcasesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTcAttribute() {
		return tcAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcAttribute_Name() {
		return (EAttribute)tcAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcAttribute_Value() {
		return (EAttribute)tcAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTcElement() {
		return tcElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcElement_Name() {
		return (EAttribute)tcElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTcElement_Attributes() {
		return (EReference)tcElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTcElement_Children() {
		return (EReference)tcElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcElement_Text() {
		return (EAttribute)tcElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcElement_ObjectId() {
		return (EAttribute)tcElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestcase() {
		return testcaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestcase_Root() {
		return (EReference)testcaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestcase_Name() {
		return (EAttribute)testcaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListOfTestcase() {
		return listOfTestcaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListOfTestcase_Testcases() {
		return (EReference)listOfTestcaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getListOfSubtree() {
		return listOfSubtreeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getListOfListOfSubtree() {
		return listOfListOfSubtreeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestcasesFactory getTestcasesFactory() {
		return (TestcasesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tcAttributeEClass = createEClass(TC_ATTRIBUTE);
		createEAttribute(tcAttributeEClass, TC_ATTRIBUTE__NAME);
		createEAttribute(tcAttributeEClass, TC_ATTRIBUTE__VALUE);

		tcElementEClass = createEClass(TC_ELEMENT);
		createEAttribute(tcElementEClass, TC_ELEMENT__NAME);
		createEReference(tcElementEClass, TC_ELEMENT__ATTRIBUTES);
		createEReference(tcElementEClass, TC_ELEMENT__CHILDREN);
		createEAttribute(tcElementEClass, TC_ELEMENT__TEXT);
		createEAttribute(tcElementEClass, TC_ELEMENT__OBJECT_ID);

		testcaseEClass = createEClass(TESTCASE);
		createEReference(testcaseEClass, TESTCASE__ROOT);
		createEAttribute(testcaseEClass, TESTCASE__NAME);

		listOfTestcaseEClass = createEClass(LIST_OF_TESTCASE);
		createEReference(listOfTestcaseEClass, LIST_OF_TESTCASE__TESTCASES);

		// Create data types
		listOfSubtreeEDataType = createEDataType(LIST_OF_SUBTREE);
		listOfListOfSubtreeEDataType = createEDataType(LIST_OF_LIST_OF_SUBTREE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(tcAttributeEClass, TcAttribute.class, "TcAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, TcAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, TcAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(tcAttributeEClass, this.getTcAttribute(), "deepCopy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "inParentId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tcElementEClass, TcElement.class, "TcElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcElement_Attributes(), this.getTcAttribute(), null, "attributes", null, 0, -1, TcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcElement_Children(), this.getTcElement(), null, "children", null, 0, -1, TcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcElement_Text(), ecorePackage.getEString(), "text", null, 0, 1, TcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcElement_ObjectId(), ecorePackage.getEIntegerObject(), "objectId", null, 0, 1, TcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(tcElementEClass, null, "attachAsChildren", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getListOfSubtree(), "inListOfSubtrees", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(tcElementEClass, this.getTcElement(), "deepCopy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(testcaseEClass, Testcase.class, "Testcase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestcase_Root(), this.getTcElement(), null, "root", null, 0, 1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestcase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Testcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listOfTestcaseEClass, ListOfTestcase.class, "ListOfTestcase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListOfTestcase_Testcases(), this.getTestcase(), null, "testcases", null, 1, -1, ListOfTestcase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(listOfSubtreeEDataType, ListOfSubtree.class, "ListOfSubtree", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listOfListOfSubtreeEDataType, ListOfListOfSubtree.class, "ListOfListOfSubtree", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TestcasesPackageImpl
