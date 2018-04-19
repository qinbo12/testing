package com.l03.test2;

public class Run {

	public static void main(String[] args) {
		Dog dog = new Dog("大狼狗", "黑色");
		Person person = new Person("张三", "男");
		person.buyDog(dog);
		person.setDogName("小黑");
		
		person.walk();
	}
 
}
