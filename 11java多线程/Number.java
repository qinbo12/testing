package com.l18.test1;

public class Number {
	private int num = -1;
	private boolean numOk = false;
	/**
	 * �������ַ���
	 * @param n ���ɵ�����
	 */
	public synchronized void putNum(int n) {
		if(numOk) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("putNum()���������߳��ն��쳣��");
				e.printStackTrace();
			}
		}
		this.num = n;
		this.numOk = true;
		System.out.println("�������֣�" + this.num);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		notifyAll(); 
	}
	/**
	 * �õ����ַ���
	 * @return �õ�������
	 */
	public synchronized void getNum() {
		if(!numOk) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("getNum()���������߳��ն��쳣��");
				e.printStackTrace();
			}
		}
		System.out.println("�õ����֣�" + this.num);
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
