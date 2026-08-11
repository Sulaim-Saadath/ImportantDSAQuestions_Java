package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;
// [0,0,1,1,1,2,2,3,3,4]
// 0 0 1 1 1 2 2 3 3 4
public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements in array in sorted order");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int res = removeDuplicates(arr);
		System.out.println("Unique Elements in the array " + Arrays.toString(arr) + " is " + res);
		
	}
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int unique = 1;
		int j = 0;
		int k = 1;
		while (k <= nums.length - 1) {
			if(nums[k] == nums[k - 1]) {
				k++;
				continue;
			}
			unique++;
			j++;
			nums[j] = nums[k];
			k++;
		}
		System.out.print("[");
		for(int i = 0;i < unique;i++) {
			if (i != unique - 1) {
				System.out.print(nums[i] + ", ");
			} else {
				System.out.print(nums[i]);
			}
		}
		System.out.println("]");
		return unique;
	}
}
