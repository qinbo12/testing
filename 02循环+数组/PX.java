package com.l1.demo;
/**
 * ц╟ещеепР
 * @author dell
 *
 */
public class PX {

	public static void main(String[] args) {
		int[] nums = new int[]{8, 3, 1, 10, 9, 6};
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = 0; j < nums.length - i - 1; j++) {
				if(nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
 
}
