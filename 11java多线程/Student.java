package com.l17.test1;

public class Student extends Thread {
	private String name = null;
	private PrintM pm = null;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, PrintM pm) {
		this.name = name;
		this.pm = pm;
	}

	@Override
	public void run() {
		
		synchronized(this.pm) {
			this.pm.print(this.name);
		}
		 
	}
	
}
