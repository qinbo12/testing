package com.l10.test1;

import java.util.GregorianCalendar;

public class Test5 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		for(int i = 1900; i <= 2000; i++) {
			if(gc.isLeapYear(i)) {
				System.out.println(i);
			}
		}
	}

}
 