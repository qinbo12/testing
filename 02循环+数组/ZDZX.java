package com.l1.demo;
/**
 * �����ֵ����Сֵ��ƽ��ֵ
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
		System.out.println("���ֵ��" + max);
		System.out.println("��Сֵ��" + min);
		System.out.println("��ƽ��ֵ��" + avg);
	}

}
