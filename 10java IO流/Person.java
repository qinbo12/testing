package com.l16.test1;

import java.io.Serializable;

public class Person implements Serializable {
	private String name = null;
	private String sex = null;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}
 
	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + "]";
	}
}
