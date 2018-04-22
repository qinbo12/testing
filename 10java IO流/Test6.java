package com.l16.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test6 {

	public static void main(String[] args) {
		String[] names = new String[]{"jack", "rose", "tom"};
		int[] age = new int[]{22, 18, 40};
		
		DataInputStream in = null;
		DataOutputStream out = null;
		
		try {
			out = new DataOutputStream(new FileOutputStream("./f.txt"));
			for(int i = 0; i < 3; i++) {
				out.writeUTF(names[i]);
				out.writeInt(age[i]); 
			}
			in = new DataInputStream(new FileInputStream("./f.txt"));
			for(int i = 0; i < 3; i++) {
				System.out.println(in.readUTF());
				System.out.println(in.readInt() + 1);
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
