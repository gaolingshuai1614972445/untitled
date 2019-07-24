package ch22;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class iii流解析器 {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DefaultHandler handler = new DefaultHandler(){
            @Override
            public void startDocument() throws SAXException {
                super.startDocument();
                System.out.println("文档开始被处理");
            }

            @Override
            public void endDocument() throws SAXException {
                super.endDocument();
                System.out.println("文档处理结束");
            }

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                super.startElement(uri, localName, qName, attributes);
                System.out.println("<"+qName+">");
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException {
                super.endElement(uri, localName, qName);
                System.out.println("</"+qName+">");

            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException {
                super.characters(ch, start, length);
                System.out.println(new String(ch,start,length));
                //打印文档里的内容，不加这个重写的方法只打印文档里的标签
            }
        };
        SAXParserFactory factory = SAXParserFactory.newDefaultInstance();
        SAXParser saxParser = factory.newSAXParser();
        InputStream inputStream = Files.newInputStream(Path.of("my.xml"));
        saxParser.parse(inputStream,handler);

    }
}
