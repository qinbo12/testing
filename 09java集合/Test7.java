package com.l10.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test7 {

	public static void main(String[] args) {
		Student s1 = new Student("∂£µ±", 500);
		Student s2 = new Student("¥Û–€", 12);
		Student s3 = new Student("æ≤œ„", 10);
		Student s4 = new Student("≈÷ª¢", 14);
		Student s5 = new Student("–°∑Ú", 13);
		Student s6 = new Student("¥Û–€∞÷", 45);
		
		Collection c1 = new ArrayList();
		System.out.println(c1.isEmpty());
		c1.add(s1);
		c1.add(s2);
		c1.add(s3);
		c1.add(s4);
		c1.add(s5); 
		c1.add(s5);
		
		Collection c2 = new ArrayList();
		c2.add(s1);
		c2.add(s2);
		//c2.add(s6); 
		c2.add(null);
		c2.add(null);
		
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		System.out.println(c1.remove(s5));
		System.out.println(c1.size());
		
		Iterator i1 = c1.iterator();
		while(i1.hasNext()) {
			Student temp = (Student)i1.next();
			System.out.println(temp.toString());
		}
		
		System.out.println(c1.contains(s1));
		System.out.println(c1.containsAll(c2));
		
		//c1.removeAll(c2);
		c1.retainAll(c2);
		
		Iterator i2 = c1.iterator();
		while(i2.hasNext()) {
			Student temp = (Student)i2.next();
			System.out.println(temp.toString());
		}
		
		c1.clear();
		System.out.println(c1.isEmpty());
		
		System.out.println(c2.size());
		c2.remove(null);
		System.out.println(c2.size());
	}

}
