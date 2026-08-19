package com.practice.leetcode.TwoPointer;

import java.util.Scanner;

public class RemoveElement {
	public static int removeElement(int[] arr, int val) {
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != val) {
				arr[k] = arr[i];
				k++;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Enter array size
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		// Enter array elements
		int[] nums = new int[n];
		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		// Enter value to remove
		System.out.print("Enter value to remove: ");
		int val = sc.nextInt();
		// Call your method
		int k = removeElement(nums, val);
		// Display result
		System.out.println("k = " + k);
		System.out.print("Remaining elements: ");
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
		sc.close();
	}
}
