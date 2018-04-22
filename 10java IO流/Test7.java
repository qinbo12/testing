package com.l16.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test7 {
	public static void main(String[] args) {
		Person p = new Person("jack", "ÄÐ");
		
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("./g.txt"));
			
			out.writeObject(p);
			out.flush();
			
			in = new ObjectInputStream(new FileInputStream("./g.txt"));
			Person temp = (Person)in.readObject();
			System.out.println(temp.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
