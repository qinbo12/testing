package com.l17.test1;

public class Test4 extends Thread {

	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("bbbbb");
				Thread.currentThread().sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
 