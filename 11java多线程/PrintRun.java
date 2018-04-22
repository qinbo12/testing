package com.l17.test1;

public class PrintRun {

	public static void main(String[] args) {
		PrintM pm = new PrintM();
		Student s1 = new Student("rose", pm);
		Student s2 = new Student("jack", pm);
		Student s3 = new Student("tom", pm);
		s1.start();
		s2.start();
		s3.start();
	}

}
 