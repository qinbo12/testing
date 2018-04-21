package com.l07.test2;

public class Test1 {

	public static void main(String[] args) {
		String s1 = null;
		s1 = "abc";
		
		String s2 = null;
		s2 = new String("adc");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.startsWith("bb"));
		 
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		String s3 = "abcdafg";
		System.out.println(s3.indexOf("abce"));
		
		System.out.println(s3.charAt(0));
		
		System.out.println(s3.substring(2, 5));
		
		System.out.println(s3.replace("a", "?"));
	}

}
