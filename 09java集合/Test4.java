package com.l11.test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		Student s1 = new Student("∂£µ±", 500);
		Student s2 = new Student("¥Û–€", 12);
		Student s3 = new Student("æ≤œ„", 10);
		Student s4 = new Student("≈÷ª¢", 14);
		Student s5 = new Student("–°∑Ú", 13);
		Student s6 = new Student("¥Û–€∞÷", 45);
		
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("dd", s1);
		map.put("dx", s2);
		map.put("jx", s3); 
		map.put(null, null);
		
		System.out.println(map.size());
		
//		Student jx = map.get("jx");
//		System.out.println(jx.toString());
//		
//		Set<String> kSet = map.keySet();
//		Iterator<String> ki = kSet.iterator();
//		while(ki.hasNext()) {
//			String key = ki.next();
//			System.out.print(key + "::");
//			Student value = map.get(key);
//			System.out.println(value.toString());
//		}
//		System.out.println("===========================");
//		Collection<Student> values = map.values();
//		for (Student temp : values) {
//			System.out.println(temp.toString());
//		}
//		System.out.println("===========================");
//		Set<Entry<String, Student>> eSet = map.entrySet();
//		Iterator<Entry<String, Student>> ei = eSet.iterator();
//		while(ei.hasNext()) {
//			Entry<String, Student> entry = ei.next();
//			System.out.print(entry.getKey() + "::");
//			System.out.println(entry.getValue().toString());
//		}
	}

}
