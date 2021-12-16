package flexml.gentest;

import flexml.Definition;
import flexml.Element;
import flexml.persistence.EMFModelLoad;
import flexml.persistence.EMFModelSave;
import testcases.ListOfTestcase;
import testcases.TcElement;
import testcases.Testcase;
import testcases.TestcasesFactory;
import testcases.TestcasesPackage;
import testcases.collections.ListOfSubtree;

public class GenTestCases {

	public static void main(String[] args) {
        TestcasesPackage tcP = TestcasesPackage.eINSTANCE;
        TestcasesFactory tcFactory = TestcasesFactory.eINSTANCE;
		
		// Load domain model
        EMFModelLoad loader = new EMFModelLoad();
        Definition myDef = loader.load();
		
		// Generate all test cases
        Element root = myDef.getRoot();
        ListOfSubtree los = root.createTestdataSubtrees();
        
        ListOfTestcase lot = tcFactory.createListOfTestcase(); 
        
        int cnt = 1;
        for (TcElement curRoot : los.getList()) {
        	String tcName = String.format("Testcase%03d", cnt ++);
        	Testcase tc = tcFactory.createTestcase();
        	tc.setName(tcName);
        	tc.setRoot(curRoot);
        	lot.getTestcase().add(tc);
        }

        System.out.println(String.format("Count %d",cnt-1));
		EMFModelSave.save(lot);
	}

}
