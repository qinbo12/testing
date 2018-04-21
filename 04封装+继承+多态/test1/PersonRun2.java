package com.l05.test6;

import com.l05.test6.Person;

public class PersonRun2 {

	public static void main(String[] args) {
		Person pj = null;
		pj = new Person("ÆÕ¾©", 45);
		pj.showMe();
		
		Person obm = null;
		obm = new Person("°Â°ÍÂí", 50);
		obm.showMe();
		
		PersonTest2 pt = new PersonTest2();
		pt.test(pj, obm);
		pj.showMe();
		obm.showMe();
	}
 
}
  