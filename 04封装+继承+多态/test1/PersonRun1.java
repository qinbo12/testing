package com.l05.test6;

import com.l05.test6.Person;

public class PersonRun1 {

	public static void main(String[] args) {
		Person pj = null;
		pj = new Person("ÆÕ¾©", 45);
		
		int[] n = new int[]{1, 2, 3};
		
		int num = 10;
		
		PersonTest1 pt = new PersonTest1();
		pt.test(pj, n, num);
		
		pj.showMe();
		System.out.println(n[0]);
		System.out.println(num);
	}

}  
 