package com.dom4jtest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 创建dom4j xml
 * @author qinbo
 *
 */
public class CreateDom4jTest {
	public static void main(String[] args) {
		//1.创建Document对象
		Document document = DocumentHelper.createDocument();
		//2.添加根节点
		Element rss = document.addElement("rss");
		//向rss中添加属性
		rss.addAttribute("version", "2.0");
		//3.生成子节点及节点内容
		Element channel = rss.addElement("channel");
		Element title = channel.addElement("title");
		title.addText("国内最新新闻");
		
		//4.设置生成xml的格式
		OutputFormat format = OutputFormat.createPrettyPrint();
		
		//5.生成xml文件
		File file = new File("xml/dom4j.xml");
		try {
			XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
			//设置转义是否生效，默认是true生效
			writer.setEscapeText(false);
			writer.write(document);
			writer.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
