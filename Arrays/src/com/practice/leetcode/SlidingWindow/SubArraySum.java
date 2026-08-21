package com.practice.leetcode.SlidingWindow;

import java.util.Scanner;

public class SubArraySum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the size of the subarray: ");
		int k = scan.nextInt();
		int maxSum = maxSubArray(arr, k);
		System.out.println("The max sub array is: "+maxSum);
		scan.close();
	}
	public static int maxSubArray(int[] arr, int k) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int low = 0;
		int high = k - 1;
		for(int i = low;i <= high;i++) {
			sum = sum + arr[i];
		}
		low++;
		high++;
		maxSum = sum;
		while(high <= arr.length - 1) {
			sum = sum - arr[low - 1] + arr[high];
			maxSum = Math.max(maxSum, sum);
			low++;
			high++;
		}
		return maxSum;
	}
}
