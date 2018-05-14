package com.doucument;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * DOM解析XML
 * @author qinbo
 *
 */
public class DOMXMLAnalysis {
	public static void main(String[] args) {
		try {
			//创建DocumentBuilderFactery对象
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			//创建DocumentBuilder对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			//创建DocumentBuilder对象的parse方法加载books.xml文件到当前目录下
			Document document = db.parse("xml/books.xml");
			
			//获取book集合
			NodeList nodeList = document.getElementsByTagName("book");
			System.out.println("共有" + nodeList.getLength() + "本书");
			//遍历book集合
			for (int i = 0; i < nodeList.getLength(); i++) {
				System.out.println("==========开始遍历第" + (i+1) + "本书的内容==========");
				/**
				 * 获取属性方法一
				 */
				//通过NodeList的item(index)获取Node
				Node book = nodeList.item(i);
				//获取Node的属性值
				NamedNodeMap attrs = book.getAttributes();
				System.out.println("第" + (i + 1) + "本书共有" + attrs.getLength() + "个属性");
				
				//遍历NamedNodeMap属性
				for (int j = 0; j < attrs.getLength(); j++) {
					//通过item(index)获取属性
					Node attr = attrs.item(j);
					System.out.print("属性名：" + attr.getNodeName());
					System.out.println("--属性值：" + attr.getNodeValue());
				}
				
				/**
				 * 获取属性方法二
				 */
				//通过强制类型转换获取Element对象（标签对象）
//				Element bookElement = (Element) nodeList.item(i);
				//获取属性值
//				String elementValue = bookElement.getAttribute("id");
//				System.out.println("id属性的属性值为" + elementValue);
				
				/**
				 * 通过getChildNodes()获取子节点
				 */
				NodeList childNode = book.getChildNodes();
				System.out.println("第" + (i + 1) + "共有" + childNode.getLength() + "个子节点");
				//遍历子节点内容
				for (int j = 0; j < childNode.getLength(); j++) {
					//获取子节点
					Node node = childNode.item(j);
					//判断子节点属性   ELEMENT_NODE(ElEMENT)  ATTRIBUTE_NODE(Attr)	TEXT_NODE(Text)
					if(node.getNodeType() == Node.ELEMENT_NODE) {
						//获取Element节点的名称
						System.out.print("第" + (j + 1) + "个节点名：" + node.getNodeName());
						//获取Element节点的节点值
//						System.out.println("--节点值：" + node.getFirstChild().getNodeValue());
						System.out.println("--节点值：" + node.getTextContent());
					}
				}
				
				System.out.println("==========结束遍历第" + (i+1) + "本书的内容==========");
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
