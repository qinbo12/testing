package com.l1.demo;
/**
 * 百钱买百鸡
 * @author dell
 *
 */
public class BJ {

	public static void main(String[] args) {
		//母鸡5元一只，公鸡3元一只，小鸡一元三只，问一百元买一百只鸡的组合
		int m, g, x;
		//母鸡最多只能达到20只
		for(m = 0; m <= 20; m++) {
			//公鸡最多只能达到33只
			for(g = 0; g <= 33; g++) {
				x = 100 - m - g;
				if((m * 5 + g * 3 + x/3) == 100 && x % 3 == 0) {
					System.out.println("母鸡：" + m + "，公鸡：" + g + "，小鸡：" + x );
				}
			}
		}
	}

}
