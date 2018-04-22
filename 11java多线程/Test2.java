package com.l17.test1;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("main¿ªÊ¼£¡");
		Test3 t3 = new Test3();
		Test4 t4 = new Test4();
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
		t3.start();
		t4.start();
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
		
		//Thread t5 = new Thread(new Test5());
		//new Test7();
		//Thread t6 = new Thread(new Test6());
		//t5.start();
		//t6.start(); 
		
		System.out.println("main½áÊø£¡");
		try {
			t3.join();
			t4.join();
			System.out.println(t3.isAlive());
			System.out.println(t4.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
