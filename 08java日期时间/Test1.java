package com.l10.test1;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.toString());
		System.out.println("½ñÌìÊÇ£º" + d1.getMonth());
		
		Date d2 = new Date(999999999);
		System.out.println(d2.toString());
		
		Date d3 = new Date(2007, 6, 1);
		System.out.println(d3.toString());
		
		System.out.println(d2.before(d1));
	}

}
 