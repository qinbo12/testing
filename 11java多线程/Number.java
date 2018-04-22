package com.l18.test1;

public class Number {
	private int num = -1;
	private boolean numOk = false;
	/**
	 * 生成数字方法
	 * @param n 生成的数字
	 */
	public synchronized void putNum(int n) {
		if(numOk) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("putNum()方法发生线程终断异常！");
				e.printStackTrace();
			}
		}
		this.num = n;
		this.numOk = true;
		System.out.println("生成数字：" + this.num);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		notifyAll(); 
	}
	/**
	 * 得到数字方法
	 * @return 得到的数字
	 */
	public synchronized void getNum() {
		if(!numOk) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("getNum()方法发生线程终断异常！");
				e.printStackTrace();
			}
		}
		System.out.println("得到数字：" + this.num);
		this.numOk = false;
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		notifyAll();
	}
}
