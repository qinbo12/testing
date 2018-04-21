package com.l05.test6;

public class PersonTest2 {
	public void test(Person p1, Person p2) {
		Person temp = null;
		temp = p1;
		p1 = p2;
		p2 = temp;
	}
}
 