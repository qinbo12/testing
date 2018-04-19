package com.l1.demo;
/**
 * 二分查找
 * @author dell
 *
 */
public class EFCZ {

	public static void main(String[] args) {
		int[] nums = new int[]{1, 4, 8, 9, 15, 17, 20, 21};
		int start = 0, end = nums.length - 1, middel;
		int data = 17;
		while(true) {
			middel = (start + end) / 2;
			if(data > nums[middel]) {
				start = middel + 1;
			} else if (data < nums[middel]) {
				end = middel - 1;
			} else {
				System.out.println("找到了：" + nums[middel] + "，位置：" + (middel + 1));
				break;
			}
			if(start > end) {
				System.out.println("没有这个数！");
				break;
			}
		} 
	}

}
