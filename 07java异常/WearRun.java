package com.l08.test1;

public class WearRun {
	public static void main(String[] args) {
		Student s = new Student("Ƥ��");
		try {
			s.showMe();
		} catch (WearException e) {
			System.out.println(e.getMessage());
		}
		
		s = null;
		System.gc();
	}
}
 