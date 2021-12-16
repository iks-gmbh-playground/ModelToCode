package flexml.parser;

import javax.xml.stream.*;
import javax.xml.stream.events.*;
import javax.xml.transform.stream.StreamSource;

import flexml.elements.FileElement;
import flexml.parser.FileParser;

/**
 * @author Jan
 *
 */
public class XmlParser {
	private XMLEventReader evRd;
	private boolean valid = false;
	private FileElement result = null;

	public XmlParser(String inFilename) {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		try {
			evRd = inputFactory.createXMLEventReader(new StreamSource(inFilename));
			valid = true;
			eventLoop(evRd);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}

	public FileElement parse() {
		eventLoop(evRd);
		return result;
	}
	
	public  boolean isValid() {
		return valid;		
	}
	
	private void eventLoop(XMLEventReader inEventReader) {
		while (inEventReader.hasNext()) {
			try {
				handleEvent(inEventReader, inEventReader.nextEvent());				
			} catch (XMLStreamException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void handleEvent(XMLEventReader inEventReader, XMLEvent inEvent) {
		if (inEvent.isStartDocument()) {
			handleStartDocument(inEventReader);
		} else if (inEvent.isEndDocument()) {
			handleEndDocument();
		} else if (inEvent.isStartElement()) {
			handleStartElement(inEventReader, inEvent);
		} else if (inEvent.isEndElement()) {
			handleEndElement(inEvent);
		} else if (inEvent.isCharacters()) {
			handleCharacters(inEvent);
		}
	}
	
	private void handleStartDocument(XMLEventReader inEventReader) {
		
	}
	
	private void handleEndDocument() {
		
	}
	
	private void handleStartElement(XMLEventReader inEventReader, XMLEvent inEvent) {
		StartElement start = inEvent.asStartElement();
		switch (start.getName().getLocalPart()) {
		case "file":
			result = new FileParser().parseFileElement(inEventReader, inEvent);
			break;
			
		default:
		}
	}
	
	private void handleEndElement(XMLEvent inEvent) {
		
	}

	private void handleCharacters(XMLEvent inEvent) {
		
	}
	
}
