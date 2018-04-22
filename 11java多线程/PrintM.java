package com.l17.test1;

public class PrintM {
	public void print(String name) {
		try {
			System.out.print("[");
			Thread.currentThread().sleep(1000);
			System.out.println(name + "]");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 