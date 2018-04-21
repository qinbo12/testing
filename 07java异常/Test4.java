package com.l08.test1;

public class Test4 {

	public static void main(String[] args) {
		Test3 t = new Test3();
//		try {
//			t.t3();
//		} catch (Exception e) {
//			System.out.println("Test4发生了问题！");
//			e.printStackTrace();
//		}
		
		try {
			t.t3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("=================");
			System.out.println(e.toString());
			System.out.println("=================");
			e.printStackTrace();
		}
	} 

}
