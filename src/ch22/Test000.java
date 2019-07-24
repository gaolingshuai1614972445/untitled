package ch22;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Test000 {
    public static void main(String[] args) throws IOException, XMLStreamException, ParserConfigurationException, TransformerException {
//        DataOutputStream dos =
//        new DataOutputStream(new FileOutputStream("abc.dat"));
//        DataInputStream dis =
//                new DataInputStream(new FileInputStream("abc.dat"));
//        dos.writeInt(1);
//        dos.writeBytes("ssss");
//        dos.writeBoolean(true);
//        System.out.println(dis.readInt()/3);/* / 1 可以对文件相应类型进行计算
//
//      */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory .setNamespaceAware(false);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        Element root = doc.createElement("students");
        Element child = doc.createElement("student");

        doc.appendChild(root);
        root.appendChild(child);

        Transformer t = TransformerFactory.newDefaultInstance().newTransformer();
        t.transform(new DOMSource(doc),
                new StreamResult(new FileOutputStream(new File("ooooo.xml"))));
            }
        }


