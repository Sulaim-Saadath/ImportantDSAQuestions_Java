package com.practice.Array.MaximumSubArray;

import java.util.Scanner;


/*Given an integer array arr[], 
  find the subarray (containing at least one element) which has the maximum possible sum, 
  and return that sum.
Note: A subarray is a continuous part of an array.
Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
*/



public class MaximumSubArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " elements inside array");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int result = maxSubArraySum(arr);
		System.out.println(result);
	}
	
	static int maxSubArraySum(int[] arr) {
//  					BRUTE FORCE
//		int maxSum = Integer.MIN_VALUE;
//		for(int i = 0;i <= arr.length - 1;i++) {
//			int left = i;
//			int right = i;
//			int sum = 0;
//			for(int j = left;j <= arr.length - 1;j++) {
//				sum = sum + arr[j];
//				maxSum = Math.max(sum, maxSum);
//				right++;
//			}
//		}
//		return maxSum;
		int maxSum = arr[0];
		int curSum = arr[0];
		for(int right = 1;right <= arr.length - 1;right++) {
			curSum = Math.max(arr[right], curSum + arr[right]);
			maxSum = Math.max(maxSum, curSum);
		}
		return maxSum;
	}
}
