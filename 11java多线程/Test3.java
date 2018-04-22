package com.l17.test1;

public class Test3 extends Thread {

	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("aaaaa");
				Thread.currentThread().sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
 