package com.practice.Array.ArrayProductExceptItself;

import java.util.Scanner;

/*Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Note that the product of an array with a single element is the value of that element.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/

public class MaximumProductSubArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the " + arr.length + " elements inside array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(maximumProductArray(arr));
	}

	static int maximumProductArray(int[] arr) {
		int prefix = 1;
		int suffix = 1;
		int max = Integer.MIN_VALUE;
		for(int i = 0;i <= arr.length - 1;i++) {
			if(prefix == 0) prefix = 1;
			if(suffix == 0) suffix = 1;
			prefix = prefix * arr[i];
			suffix = suffix * arr[arr.length - i - 1];
			max = Math.max(max, Math.max(suffix, prefix));
		}
		return max;
	}
}
