package com.l08.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int m, n;
		Scanner s = new Scanner(System.in);
		m = 10;
		n = 2;
		System.out.println("aaa");
		try { 
			System.out.println(m / n);
		} catch(ArithmeticException e) {
			System.out.println(m / 1);
		}
		String str = "ok";
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] num = {1, 2, 3};
		try {
			System.out.println(num[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bbb");
	}

}
