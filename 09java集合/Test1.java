package com.l11.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student("∂£µ±", 500);
		Student s2 = new Student("¥Û–€", 12);
		Student s3 = new Student("æ≤œ„", 10);
		Student s4 = new Student("≈÷ª¢", 14);
		Student s5 = new Student("–°∑Ú", 13);
		Student s6 = new Student("¥Û–€∞÷", 45);
		
		List list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4); 
		list.add(s5);
		list.add(s6);
		
//		System.out.println(list.size());
//		list.add(s6);
//		System.out.println(list.size());
//		list.add(null);
//		list.add(null);
//		System.out.println(list.size());
		
		Iterator i1 = list.iterator();
		while(i1.hasNext()) {
			Student temp = (Student)i1.next();
			System.out.println(temp.toString());
		}
		System.out.println("====================");
		for(int i = 0; i < list.size(); i++) {
			Student temp = (Student)list.get(i);
			System.out.println(temp.toString());
		}
		
		list.set(2, s1);
		System.out.println("====================");
		for(int i = 0; i < list.size(); i++) {
			Student temp = (Student)list.get(i);
			System.out.println(temp.toString());
		}
		
		for (Object object : list) {
			Student temp = (Student)object;
			System.out.println(temp.toString());
			//System.out.println(((Student)object).toString());
		}
	}

}
