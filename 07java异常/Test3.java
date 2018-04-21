package com.l08.test1;

public class Test3 {
	public void t3() throws NullPointerException {
		String str = null;
		int[] num = {1, 2, 3};
		
		System.out.println("程序开始");
		
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			throw e;
		} finally {
			System.out.println("程序结束");
		}

		
		System.out.println("程序结束");
	}
} 
