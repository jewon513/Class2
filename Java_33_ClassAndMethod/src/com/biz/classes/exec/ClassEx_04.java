package com.biz.classes.exec;


public class ClassEx_04 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 40;
		
		int[] nums = new int[]{30,40};
		
		System.out.println(nums[0] +"\t" + nums[1]);
		
		swap(nums);
		
		System.out.println(nums[0] +"\t" + nums[1]);		
	}
	
	public static void swap(int num1, int num2) {
		int _temp = num1;
		num1= num2;
		num2= _temp;
	}
	
	public static void swap(int[] nums) {
		int _temp = nums[0];
		nums[0]= nums[1];
		nums[1]= _temp;
	}

}
