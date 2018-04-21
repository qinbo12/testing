package com.l07.test2;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ok");
		
		Object o = new Object();
		o.equals("aa");
		System.out.println(o.toString());
		
		ObjectTest ot = new ObjectTest();
		System.out.println(ot.toString());
		
		Student s1 = new Student("ÆÕ¾©", "ÄÐ");
		Student s2 = new Student("ÆÕ¾©", "ÄÐ");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	} 

}
