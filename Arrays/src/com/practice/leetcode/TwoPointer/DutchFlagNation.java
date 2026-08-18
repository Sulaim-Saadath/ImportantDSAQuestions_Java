package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class DutchFlagNation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements in array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int[] resultArray = sortedArray(arr);
		System.out.println(Arrays.toString(resultArray));
	}
	
	public static int[] sortedArray(int[] arr) {
		int zero = 0;
		int one = 0;
		int two = 0;
		for(int i = 0;i <= arr.length - 1;i++) {
			if(arr[i] == 0) {
				zero++;
			} else if(arr[i] == 1) {
				one++;
			} else {
				two++;
			}
		}
		int idx = 0;
		for(int i = 0;i <= zero - 1;i++) {
			arr[idx++] = 0;
		}
		for(int i = 0;i <= one - 1;i++) {
			arr[idx++] = 1;
		}
		for(int i = 0;i <= two - 1;i++) {
			arr[idx++] = 2;
		}
		return arr;
	}
}
