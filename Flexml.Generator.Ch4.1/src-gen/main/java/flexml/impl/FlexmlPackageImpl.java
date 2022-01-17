/**
 */
package flexml.impl;

import flexml.Attribute;
import flexml.Child;
import flexml.Definition;
import flexml.Element;
import flexml.FlexmlFactory;
import flexml.FlexmlPackage;
import flexml.Multiplicity;
import flexml.NamedObject;

import flexml.collections.ListOfPermutation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import testcases.TestcasesPackage;

import testcases.impl.TestcasesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlexmlPackageImpl extends EPackageImpl implements FlexmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listOfPermutationEDataType = null;

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
	 * @see flexml.FlexmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlexmlPackageImpl() {
		super(eNS_URI, FlexmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlexmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlexmlPackage init() {
		if (isInited) return (FlexmlPackage)EPackage.Registry.INSTANCE.getEPackage(FlexmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlexmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlexmlPackageImpl theFlexmlPackage = registeredFlexmlPackage instanceof FlexmlPackageImpl ? (FlexmlPackageImpl)registeredFlexmlPackage : new FlexmlPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestcasesPackage.eNS_URI);
		TestcasesPackageImpl theTestcasesPackage = (TestcasesPackageImpl)(registeredPackage instanceof TestcasesPackageImpl ? registeredPackage : TestcasesPackage.eINSTANCE);

		// Create package meta-data objects
		theFlexmlPackage.createPackageContents();
		theTestcasesPackage.createPackageContents();

		// Initialize created meta-data
		theFlexmlPackage.initializePackageContents();
		theTestcasesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlexmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlexmlPackage.eNS_URI, theFlexmlPackage);
		return theFlexmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedObject() {
		return namedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedObject_Name() {
		return (EAttribute)namedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedObject_Desc() {
		return (EAttribute)namedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_AliasNames() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Attributes() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Children() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_HasText() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChild() {
		return childEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChild_Multiplicity() {
		return (EAttribute)childEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChild_Child() {
		return (EReference)childEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_Root() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinition_Elements() {
		return (EReference)definitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiplicity() {
		return multiplicityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getListOfPermutation() {
		return listOfPermutationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlexmlFactory getFlexmlFactory() {
		return (FlexmlFactory)getEFactoryInstance();
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
		namedObjectEClass = createEClass(NAMED_OBJECT);
		createEAttribute(namedObjectEClass, NAMED_OBJECT__NAME);
		createEAttribute(namedObjectEClass, NAMED_OBJECT__DESC);

		attributeEClass = createEClass(ATTRIBUTE);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ALIAS_NAMES);
		createEReference(elementEClass, ELEMENT__ATTRIBUTES);
		createEReference(elementEClass, ELEMENT__CHILDREN);
		createEAttribute(elementEClass, ELEMENT__HAS_TEXT);

		childEClass = createEClass(CHILD);
		createEAttribute(childEClass, CHILD__MULTIPLICITY);
		createEReference(childEClass, CHILD__CHILD);

		definitionEClass = createEClass(DEFINITION);
		createEReference(definitionEClass, DEFINITION__ROOT);
		createEReference(definitionEClass, DEFINITION__ELEMENTS);

		// Create enums
		multiplicityEEnum = createEEnum(MULTIPLICITY);

		// Create data types
		listOfPermutationEDataType = createEDataType(LIST_OF_PERMUTATION);
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

		// Obtain other dependent packages
		TestcasesPackage theTestcasesPackage = (TestcasesPackage)EPackage.Registry.INSTANCE.getEPackage(TestcasesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeEClass.getESuperTypes().add(this.getNamedObject());
		elementEClass.getESuperTypes().add(this.getNamedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(namedObjectEClass, NamedObject.class, "NamedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedObject_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, NamedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(attributeEClass, theTestcasesPackage.getTcAttribute(), "instantiateToTestAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "inParentId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_AliasNames(), ecorePackage.getEString(), "aliasNames", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Children(), this.getChild(), null, "children", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_HasText(), ecorePackage.getEBooleanObject(), "hasText", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(elementEClass, theTestcasesPackage.getListOfSubtree(), "createTestdataSubtrees", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(elementEClass, this.getListOfPermutation(), "createChildPermutations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "inCurChildIndex", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(elementEClass, theTestcasesPackage.getTcElement(), "instantiateToTestElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(childEClass, Child.class, "Child", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChild_Multiplicity(), this.getMultiplicity(), "multiplicity", null, 0, 1, Child.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChild_Child(), this.getElement(), null, "child", null, 0, 1, Child.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(childEClass, this.getListOfPermutation(), "getPermutations", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinition_Root(), this.getElement(), null, "root", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinition_Elements(), this.getElement(), null, "elements", null, 1, -1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(multiplicityEEnum, Multiplicity.class, "Multiplicity");
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_OR_ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ZERO_OR_MANY);
		addEEnumLiteral(multiplicityEEnum, Multiplicity.ONE_OR_MANY);

		// Initialize data types
		initEDataType(listOfPermutationEDataType, ListOfPermutation.class, "ListOfPermutation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// exeed
		createExeedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>exeed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExeedAnnotations() {
		String source = "exeed";
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "label", "\r\nvar str : String;\r\nstr = \'<\' + self.name + \'>\';\r\n// concat aliases, if set\r\nif (not self.aliasName.isEmpty()) {\r\n str = str + \' (\' + self.aliasName.concat + \')\';\t\r\n}\r\nreturn  str;",
			   "classIcon", "class"
		   });
		addAnnotation
		  (childEClass,
		   source,
		   new String[] {
			   "label", "return \'<\'+self.child.name+\'>\' + \' (\' +self.multiplicity + \')\';",
			   "classIcon", "link"
		   });
		addAnnotation
		  (definitionEClass,
		   source,
		   new String[] {
			   "classIcon", "model"
		   });
	}

} //FlexmlPackageImpl
