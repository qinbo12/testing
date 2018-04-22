package com.l16.test1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

	public static void main(String[] args) {
		FileReader reader = null;
		FileWriter writer = null;
		 
		try {
			reader = new FileReader("./a.txt");
			writer = new FileWriter("./d.txt");
			
			int info = -2;
			while((info = reader.read()) != -1) {
				System.out.print((char)info);
				writer.write(info);
				writer.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
