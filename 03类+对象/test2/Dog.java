package com.l03.test2;

public class Dog {
	public String kind = null;
	public String name = null;
	public String color = null;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String k, String c) {
		kind = k;
		color = c;
	} 
	
	public void dogFunction() {
		if("���ǹ�".equals(kind)) {
			System.out.println("���һ�Ժ");
		} else if("��ʿ��".equals(kind)) {
			System.out.println("��������");
		} else if("������".equals(kind)) {
			System.out.println("����Я��");
		}
	}
	public void showDog() {
		System.out.println("�������֣�" + name + "����ɫ��" + color );
	}
}
