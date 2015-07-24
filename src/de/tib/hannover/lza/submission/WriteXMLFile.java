package de.tib.hannover.lza.submission;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class WriteXMLFile {
	
	private static Logger LOG = LoggerFactory.getLogger(WriteXMLFile.class);
	
	public void main(String xmlTragetFolder,String identifier, String creator,String title, String date,String isPartOf, String hasPart, String description ) {

		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			
		

			// root elements
			Document doc = docBuilder.newDocument();
			doc.setXmlStandalone(false);
			Element rootElement = doc.createElement("dc:record");
					
			rootElement.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			rootElement.setAttribute("xmlns:dcterms", "http://purl.org/dc/terms/");
			rootElement.setAttribute("xmlns:dc",	"http://purl.org/dc/elements/1.1/");
			
			
			//rootElement.setAttributeNS("","http://purl.org/dc/terms/", "http://purl.org/dc/terms/");
			doc.appendChild(rootElement);
			
			Element identifier1 = doc.createElement("dc:Identifier");
			if (identifier == null) {
					identifier=" no dc:Identifier ";
			}
			identifier1.appendChild(doc.createTextNode(identifier));
			rootElement.appendChild(identifier1);
			
			
			Element creator1 = doc.createElement("dc:creator");
			if (creator == null) {
					creator =" no dc:creator";
				}
			creator1.appendChild(doc.createTextNode(creator));
			rootElement.appendChild(creator1);
			
			Element title1= doc.createElement("dc:title");
			if (title == null) {
				title =" no dc:title";
				}
			title1.appendChild(doc.createTextNode(title));
			rootElement.appendChild(title1);
			
			Element date1= doc.createElement("dc:date");
			if (date == null) {
				date =" no dc:date";
				}
			date1.appendChild(doc.createTextNode(date));
			rootElement.appendChild(date1);
			
			Element isPartOf1= doc.createElement("dcterms:isPartOf");
			if (isPartOf == null) {
				isPartOf =" no dcterms:isPartOf";
				}
			isPartOf1.appendChild(doc.createTextNode(isPartOf));
			rootElement.appendChild(isPartOf1);
			
			Element hasPart1= doc.createElement("dcterms:hasPart");
			if (hasPart == null) {
				hasPart =" no dcterms:hasPart";
				}
			hasPart1.appendChild(doc.createTextNode(hasPart));
			rootElement.appendChild(hasPart1);
			
			Element description1= doc.createElement("dc:description");
			if (description == null) {
				description =" no dc:description";
				}
			description1.appendChild(doc.createTextNode(description));
			rootElement.appendChild(description1);
			
			
			
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result1 = new StreamResult(new File(xmlTragetFolder));

			// Output to console for testing
			// StreamResult result1 = new StreamResult(System.out);

			transformer.transform(source, result1);
			
//			if(LOG.isDebugEnabled());
//			LOG.debug("Creating dc.xml: " +" sucessfull");
		

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
//			if(LOG.isDebugEnabled())
//				LOG.debug("Creating dc.xml: " + pce);
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
//			if(LOG.isDebugEnabled())
//				LOG.debug("Creating dc.xml: " + tfe);
		}

	}
}
