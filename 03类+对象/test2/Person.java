package com.l03.test2;

public class Person {
	public String name = null;
	public String sex = null;
	public Dog dog = null;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String n, String s) {
		name = n;
		sex = s;
	} 
	
	public void buyDog(Dog d) {
		dog = d;
	}
	
	public void walk() {
		showMe();
		dog.showDog();
		dog.dogFunction();
	}
	public void showMe() {
		System.out.println("Œ“Ω–£∫" + name + "£¨Œ“" + sex + "…˙");
	}
	public void setDogName(String n) {
		dog.name = n;
	}
	
}
