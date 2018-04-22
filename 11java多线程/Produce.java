package com.l18.test1;

/**
 * 生成数字线程
 */
public class Produce implements Runnable {
	private int i = 0;
	private Number number = null;
	
	public Produce(Number n) {
		this.number = n;
		Thread t = new Thread(this, "produce");
		t.start();
	}
	public void run() {
		for(int j = 0; j < 10; j++) {
			this.number.putNum(i++);
		}
	} 
}
