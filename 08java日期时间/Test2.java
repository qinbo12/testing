package com.l10.test1;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.toString());
		
		System.out.println("½ñÌìÊÇ" + c1.get(Calendar.DAY_OF_MONTH));
		
		c1.add(Calendar.DATE, 10);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	}

}
 