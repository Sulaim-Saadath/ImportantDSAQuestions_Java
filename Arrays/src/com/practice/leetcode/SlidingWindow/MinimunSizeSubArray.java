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
		int low = 0;
		int res = Integer.MAX_VALUE;
		int sum = 0;
		for(int high = 0;high <= arr.length - 1;high++) {
			sum = sum + arr[high];
			while(sum >= target) {
				int len = high - low + 1;
				res = Math.min(len, res);
				sum = sum - arr[low];
				low++;
			}
		}
		return res;
	}
}
