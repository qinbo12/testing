package com.l16.test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test8 {

	public static void main(String[] args) {
		BufferedReader sysReader = null;
		BufferedWriter writer = null;
		
		try {
			sysReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./h.txt")));
			while(true) {
				String info = sysReader.readLine();
				System.out.println(info);
				writer.write(info + "\n"); 
				writer.flush();
				if("ты╪Ш".equals(info)) {
					break;
				}
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
