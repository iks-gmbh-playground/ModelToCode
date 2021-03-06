package flexml.persistence;

import flexml.Definition;
import flexml.FlexmlPackage;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ParserModelLoad {
	private static final String resourcePath = "model/FlexibleXmlParser.model"; 
	
	public Definition load() {
		FlexmlPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("model", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI(resourcePath), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Definition myDef = (Definition) resource.getContents().get(0);
        return myDef;
	}
}
