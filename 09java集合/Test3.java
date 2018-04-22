package com.l11.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Student s1 = new Student("∂£µ±", 500);
		Student s2 = new Student("¥Û–€", 12);
		Student s3 = new Student("æ≤œ„", 10);
		Student s4 = new Student("≈÷ª¢", 14);
		Student s5 = new Student("–°∑Ú", 13);
		Student s6 = new Student("¥Û–€∞÷", 45);
		
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5); 
		set.add(s6);
		
		System.out.println(set.size());
		set.add(s6);
		System.out.println(set.size());
		
		for (Student student : set) {
			System.out.println(student.toString());
		}
	}

}
