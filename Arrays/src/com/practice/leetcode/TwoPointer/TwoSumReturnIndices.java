package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumReturnIndices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elemnts inside the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		scan.close();
		System.out.println("Given array: " + Arrays.toString(arr));
		int[] indicesArray = twoSumReturnIndicesPair(arr, target);
		System.out.println(Arrays.toString(indicesArray));
	}

	public static int[] twoSumReturnIndicesPair(int[] nums, int target) {
		int[] arr = new int[nums.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = nums[i];
		}
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				break;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		int idx1 = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == arr[left]) {
				idx1 = i;
				break;
			}
		}
		int idx2 = 0;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == arr[right] && i != idx2) {
				idx2 = i;
				break;
			}
		}
		return new int[] { idx1, idx2 };
	}
}
