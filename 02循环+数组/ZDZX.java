package com.l1.demo;
/**
 * 求最大值、最小值、平均值
 * @author dell
 *
 */
public class ZDZX {

	public static void main(String[] args) {
		int[] nums = new int[]{10, 4, 2, 8, 9};
		int max, min, avg, sum = 0;
		max = nums[0];
		min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
			sum = sum + nums[i]; 
		} 
		avg = sum / nums.length;
		System.out.println("最大值：" + max);
		System.out.println("最小值：" + min);
		System.out.println("最平均值：" + avg);
	}

}
