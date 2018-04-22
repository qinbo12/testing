package com.l10.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test6 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		Date d1 = gc.getTime();

		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy&MM&dd");
		
		String gcStr = dateFormat.format(d1);
		System.out.println(gcStr);
		
		try {
			String str = "1997/07/01";
			Date d2 = dateFormat.parse(str);
			System.out.println(d2.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
	}

}
