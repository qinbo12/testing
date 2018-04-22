package com.l10.test1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test4 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		int theMonth = gc.get(Calendar.MONTH);
		int today = gc.get(Calendar.DATE);
		
		gc.set(Calendar.DATE, 1);
		
		System.out.println("Sun Mon Tue Wen Thu Fri Sat");
		for(int i = Calendar.SUNDAY; i < gc.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("    ");
		}
		while(theMonth == gc.get(Calendar.MONTH)) {
			int day = gc.get(Calendar.DATE);
			if(day < 10) {
				System.out.print(" ");
			}
			System.out.print(" " + day);
			if(day == today) { 
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			if(gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
				System.out.println();
			}
			gc.add(Calendar.DATE, 1);
		}
	}

}
