package com.doucument;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * 生成XML
 * @author qinbo
 *
 */
public class CreateDOMXML {
	public static void main(String[] args) {
		try {
			//创建DocumentBuilderFactery对象
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//创建DocumentBuilder对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			//创建根节点
			Document document = db.newDocument();
			//创建bookstore节点
			Element bookstore = document.createElement("bookstore");
			
			//创建book节点
			Element book = document.createElement("book");
			//设置book的属性
			book.setAttribute("id", "1");
			
			//将book节点添加到bookstore节点中
			bookstore.appendChild(book);
			//将bookstore添加到根节点中
			document.appendChild(bookstore);
			
			//创建TransformerFactory对象
			TransformerFactory transformerFactory = TransformerFactory.newInstance(); 
			try {
				//创建Transformer对象
				Transformer transformer = transformerFactory.newTransformer();
				//格式化xml
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.transform(new DOMSource(document), new StreamResult(new File("xml/book1.xml")));
			} catch (TransformerConfigurationException e) {
				e.printStackTrace();
			} catch (TransformerException e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
}
