package com.l05.test3;

public class Test1 {
	public static String s0 = null;
	public String s1 = null;
	public String s2 = null;
	
	
	public static void t0() {
		System.out.println(s0);
	}
	public void t1() {
		
	}
	public void t2() {
		this.t1();
		t0(); 
		System.out.println(s0);
	}
}
 