package com.l03.test1;

public class Person {
	public String name = null;
	public String city = null;
	public String sex = null;
	public int age = -1;
	
	public Person() {
		System.out.println("0");
	}
	public Person(int a) {
		System.out.println("1"); 
	}
	public Person(int a, int b) {
		System.out.println("2");
	}
	public Person(String n, String c, String s, int a) {
		name = n;
		city = c;
		sex = s;
		age = a;
	}
	public void eat(String type) {
		System.out.println("我吃饭的方式：" + type);
	}
	public void sleep(String type) {
		System.out.println("我睡觉的方式：" + type);
	}
	public void think(String type) {
		System.out.println("我思考的方式：" + type);
	}
	public void showMe() {
		System.out.println("我叫" + name + "，来自于" + city + "，我" + age + "岁");
	}
}
