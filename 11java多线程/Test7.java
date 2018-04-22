package com.l17.test1;

public class Test7 implements Runnable {
	private Thread t = null;
	
	public Test7() {
		this.t = new Thread(this);
		this.t.start();
	}

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
 