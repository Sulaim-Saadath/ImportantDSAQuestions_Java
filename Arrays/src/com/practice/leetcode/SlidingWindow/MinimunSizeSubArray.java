package com.practice.leetcode.SlidingWindow;

import java.util.Scanner;

public class MinimunSizeSubArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		scan.close();
		int result = minSubArrayLen(arr, target);
		System.out.println("Minimum subarray that reaches the target is: " + result);
	}
	
	public static int minSubArrayLen(int[] arr, int target) {
		int result = Integer.MAX_VALUE;
		int sum = 0;
		int low = 0;
		int high = 0;
		while(high <= arr.length - 1) {
			sum = sum + arr[high];
			while(sum >= target) {
				int len = (high - low) + 1;
				result = Math.min(result, len);
				sum = sum - arr[low];
				low++;
			}
			high++;
		}
		if(result == Integer.MAX_VALUE) {
			return 0;
		}
		return result;
	}
}
