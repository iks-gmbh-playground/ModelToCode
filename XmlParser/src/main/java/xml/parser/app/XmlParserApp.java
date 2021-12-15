/**
 * 
 */
package xml.parser.app;

import java.io.File;

import xml.elements.FileElement;
import xml.parser.XmlParser;

/**
 * 
 *
 */
public class XmlParserApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File folder = new File(args[0]);
		
		 for (final File fileEntry : folder.listFiles()) {
		        if (fileEntry.isFile()) {
		        	System.out.println(fileEntry.getName());
		        	XmlParser parser = new XmlParser(fileEntry.getAbsolutePath());
		        	FileElement fe = parser.parse();
		        	System.out.println(fe.toString());
		        } else {
		            
		        }
		    }		
		

	}

}
