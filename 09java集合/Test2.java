package com.l11.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student("∂£µ±", 500);
		Student s2 = new Student("¥Û–€", 12);
		Student s3 = new Student("æ≤œ„", 10);
		Student s4 = new Student("≈÷ª¢", 14);
		Student s5 = new Student("–°∑Ú", 13);
		Student s6 = new Student("¥Û–€∞÷", 45);
		
		Vector<Student> list = new Vector<Student>();
		//ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3); 
		list.add(s4);
		list.add(s5);
		list.add(s6);
	
		
		Iterator<Student> i1 = list.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next().toString());
		}
		System.out.println("=============================");
		for(Student temp : list) {
			System.out.println(temp.toString());
		}
	}

}
