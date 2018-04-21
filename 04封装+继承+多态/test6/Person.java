package com.l05.test5;

public class Person {
	public String name = null;
	public int age = -1;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showMe() {
		System.out.println(name + "/" + age);
	}
}
  