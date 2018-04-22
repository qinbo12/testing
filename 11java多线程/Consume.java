package com.l18.test1;

/**
 * 消费数字线程
 */
public class Consume implements Runnable {
	private Number number = null;
	
	public Consume(Number n) {
		this.number = n;
		Thread t = new Thread(this, "consume");
		t.start();
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			this.number.getNum();	
		}
	}
}
 