package com.l17.test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test1 {

	public static void main(String[] args) {
		File f1 = new File("c:/a.txt");
		try {
			if(f1.exists()) {
				System.out.println("文件已存在，不能创建！");
			} else {
				f1.createNewFile();
				System.out.println("创建成功！");
			}
			System.out.println(f1.isFile()); 
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getName());
			System.out.println(f1.getParent());
		} catch (IOException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			RandomAccessFile accessFile = new RandomAccessFile("./a.txt", "rw");
			while(accessFile.getFilePointer() < accessFile.length()) {
				System.out.println(accessFile.readLine());
			}
			accessFile.seek(3);
			accessFile.writeBytes("www");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
