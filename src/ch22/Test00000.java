package ch22;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class Test00000 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        factory.setValidating(true);
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();

        File file = new File("my.xml");
        Document doc = builder.parse(file);

        XPathFactory xPathFactory = XPathFactory.newDefaultInstance();
        XPath xPath = xPathFactory.newXPath();
        String username = xPath.evaluate("/students/student/name",doc);
        String username1 = xPath.evaluate("/students/student[2]/name",doc);
        System.out.println(username);
        System.out.println(username1);
    }
}

