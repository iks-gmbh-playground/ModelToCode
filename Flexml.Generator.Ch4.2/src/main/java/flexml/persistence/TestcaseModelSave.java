package flexml.persistence;

import flexml.FlexmlPackage;
import testcases.ListOfTestcase;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class TestcaseModelSave {
	private static final String resourcePath = "model/FlexibleXmlTestcasesJava.model"; 
	
	public static void save(ListOfTestcase inList) {
		FlexmlPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("model", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.createResource(URI.createURI(resourcePath));
        resource.getContents().add(inList);

        // now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }	}
}
