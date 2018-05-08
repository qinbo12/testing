package com.jdom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.bean.Book;

/**
 * JDom解析xml
 * @author qinbo
 *
 */
public class JDomTest {
	//使用List集合存储Book数据
	private static List<Book> lsBook = new ArrayList<Book>();
	
	public static void main(String[] args) {
		//实例化SAXBuilder对象
		SAXBuilder builder = new SAXBuilder();
		try {
			//使用InputStream加载xml
			InputStream in = new FileInputStream("xml/books.xml");
			//修改文件编码方式
//			InputStreamReader ins = new InputStreamReader(in, "UTF-8");
			//实例化Document对象
			//Document document = builder.build(ins);
			Document document = builder.build(in);
			//获取根节点
			Element books = document.getRootElement();
			//获取子节点及属性
			List<Element> lsElement = books.getChildren();
			for (Element book : lsElement) {
				//实例化Book对象
				Book bk = new Book();
				
				System.out.println("===========开始解析第" + (lsElement.indexOf(book) + 1) + "书============");
				//判断节点是否有属性
				if(book.hasAttributes()) {
					//获取节点的属性
					List<Attribute> lsAttr = book.getAttributes();
					for (Attribute attribute : lsAttr) {
						System.out.print("属性名：" + attribute.getName());
						System.out.println(" ---属性值：" + attribute.getValue());
						
						if("id".equals(attribute.getName())) {
							bk.setId(attribute.getName());
						}
					}
				}
				
				//获取book的子节点
				List<Element> lsBooks = book.getChildren();
				for (Element element : lsBooks) {
					//获取标签名称
					String name = element.getName();
					System.out.println("节点名：" + name + " ---节点值：" + element.getText());
				
					if("name".equals(element.getName())) {
						bk.setName(element.getText());
					} else if("author".equals(element.getName())) {
						bk.setAuthor(element.getText());
					} else if("year".equals(element.getName())) {
						bk.setYear(element.getText());
					} else if("price".equals(element.getName())) {
						bk.setPrice(element.getText());
					}
				}
				
				System.out.println("===========结束解析第" + (lsElement.indexOf(book) + 1) + "书============");
				
				lsBook.add(bk);
				for (Book bok : lsBook) {
					System.out.println(bok.toString());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
