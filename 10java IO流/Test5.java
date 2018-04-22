package com.l16.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) {
		BufferedReader read = null;
		BufferedWriter writer = null;
		
		try {
			read = new BufferedReader(new FileReader("./a.txt"));
			writer = new BufferedWriter(new FileWriter("./e.txt"));
			
			String info = null;
			while((info = read.readLine()) != null) {
				System.out.println(info);
				writer.write(info + "\n");
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
