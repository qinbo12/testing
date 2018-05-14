package com.jdom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.CDATA;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 * 生成jdom
 * @author qinbo
 *
 */
public class CreateJDomTest {
	public static void main(String[] args) {
		//1.生成根节点
		Element rss = new Element("rss");
		//添加属性
		rss.setAttribute("version", "2.0");
		//添加子节点和节点内容
		Element channel = new Element("channel");
		Element title = new Element("title");
		//取消转义
		CDATA cdata = new CDATA("<国内最新新闻>");
		title.addContent(cdata);
		
		channel.addContent(title);
		rss.addContent(channel);
		//2.生成Document
		Document document = new Document(rss);
		//3.生成xml
		try {
			//设置xml生成格式
			Format format = Format.getPrettyFormat();
			//设置换行
			//format.setIndent("");
			
			XMLOutputter outputter = new XMLOutputter(format);
			outputter.output(document, new FileOutputStream(new File("xml/jdom.xml")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
