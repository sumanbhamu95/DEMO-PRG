package tst1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

public class XmlExample1 {

	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilderFactory db=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		
		dBuilder=db.newDocumentBuilder();
		Document doc=dBuilder.newDocument();
		//add elements to Document
		
		// TODO Auto-generated method stub

	}

}
