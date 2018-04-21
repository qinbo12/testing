package com.l07.test1;

public class Test2 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		Integer n = new Integer(10);//×°Ïä
		int n1 = n.intValue();//²ğÏä
		double n2 = n.doubleValue();
		t.t1(n);
		
		Integer n3 = Integer.valueOf(10);
		Integer n4 = Integer.valueOf("1000");
		int n5 = n4.intValue();
		
		int n6 = Integer.parseInt("10");
		
		System.out.println(Character.isDigit('a'));
	}
} 
