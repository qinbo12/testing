package com.l08.test1;

public class Test2 {

	public static void main(String[] args) {
		
		String str = null;
		int[] num = {1, 2, 3};
		
//		try {
//			System.out.println("程序开始");
//			System.out.println(10 / 0);
//			System.out.println(str.length());
//			System.out.println(num[3]);
//			System.out.println("程序结束");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		 
		try {
			System.out.println("程序开始");
			System.out.println(str.length());
			System.out.println(10 / 0);
			System.out.println(num[3]);
			System.out.println("程序结束");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("aaa");
		System.out.println("bbb");
	}

}
