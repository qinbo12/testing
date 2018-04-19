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
		if("大狼狗".equals(kind)) {
			System.out.println("看家护院");
		} else if("哈士奇".equals(kind)) {
			System.out.println("可以溜溜");
		} else if("吉娃娃".equals(kind)) {
			System.out.println("随身携带");
		}
	}
	public void showDog() {
		System.out.println("狗的名字：" + name + "，颜色：" + color );
	}
}
