package com.l1.demo;

import java.util.Scanner;
/**
 * ·´ÐòÊý
 * @author dell
 *
 */
public class FXS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while(num != 0) {
			System.out.print(num % 10);
			num = num / 10;
		}
	}
 
}
