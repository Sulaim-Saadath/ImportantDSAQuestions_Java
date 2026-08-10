package com.practice.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside array in: ");
		for(int i = 0; i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the target");
		int target = scan.nextInt();
		scan.close();
		int[] resArr = targetValues(arr, target);
		System.out.println(Arrays.toString(resArr));
	}
	
	public static int[] targetValues(int[] arr, int target) {
//		Two Pointer Approach
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum == target) {
				return new int[] {arr[i], arr[j]};
			} else if(sum < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] {};
	}
}
