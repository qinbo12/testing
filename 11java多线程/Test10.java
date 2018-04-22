package com.l17.test1;

public class Test10 {

	public static void main(String[] args) {
		Test8 test8 = new Test8();
		Test9 test9 = new Test9();
		test8.setPriority(1);
		test9.setPriority(10);
		test8.start();
		test9.start();
	}

}
 