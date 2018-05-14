package com.dom4jtest;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Dom4j解析xml
 * @author qinbo
 *
 */
public class Dom4jTest {
	public static void main(String[] args) {
		//实例化SAXReader对象
		SAXReader saxReader = new SAXReader();
		try {
			//加载xml
			Document document = saxReader.read(new File("xml/books.xml"));
			//获取根节点
			Element bookStore = document.getRootElement();
			//遍历根节点
			Iterator<Element> iterator =  bookStore.elementIterator();
			while(iterator.hasNext()) {
				System.out.println("============开始解析某一本书========");
				//获取子节点
				Element book = iterator.next();
				//判断子节点是否有属性
				if(book.attributeCount() > 0) {
					//获取属性
					List<Attribute> lsAttributes = book.attributes();
					for (Attribute attribute : lsAttributes) {
						System.out.println("属性名：" + attribute.getName() 
								+ " ----属性值：" + attribute.getValue());
					}
				}
				
				//获取book的子节点
				Iterator<Element> iteratorBook =  book.elementIterator();
				while(iteratorBook.hasNext()) {
					Element node = iteratorBook.next();
					System.out.println("节点名：" + node.getName() 
							+ " ----节点值：" + node.getText());
				}
				System.out.println("============结束解析某一本书========");
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
