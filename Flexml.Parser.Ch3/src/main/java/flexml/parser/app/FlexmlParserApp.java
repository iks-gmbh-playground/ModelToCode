/**
 * 
 */
package flexml.parser.app;

import java.io.File;

import flexml.elements.FileElement;
import flexml.parser.FlexmlParser;

/**
 * 
 *
 */
public class FlexmlParserApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File folder = new File(args[0]);
		
		 for (final File fileEntry : folder.listFiles()) {
		        if (fileEntry.isFile()) {
		        	System.out.println(fileEntry.getName());
		        	FlexmlParser parser = new FlexmlParser(fileEntry.getAbsolutePath());
		        	FileElement fe = parser.parse();
		        	System.out.println(fe.toString());
		        } else {
		            
		        }
		    }		
		

	}

}
