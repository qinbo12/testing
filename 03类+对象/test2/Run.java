package com.l03.test2;

public class Run {

	public static void main(String[] args) {
		Dog dog = new Dog("���ǹ�", "��ɫ");
		Person person = new Person("����", "��");
		person.buyDog(dog);
		person.setDogName("С��");
		
		person.walk();
	}
 
}
