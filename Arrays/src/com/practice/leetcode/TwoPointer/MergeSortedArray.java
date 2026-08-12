package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of even sorted array: ");
		int[] evenArray = new int[scan.nextInt()];
		System.out.println("Enter the size of odd sorted array: ");
		int[] oddArray = new int[scan.nextInt()];
		System.out.println("Enter the " + evenArray.length + " inside even array: ");

		for (int i = 0; i <= evenArray.length - 1; i++) {
			evenArray[i] = scan.nextInt();
		}

		System.out.println("Enter the " + oddArray.length + " inside even array: ");
		for (int i = 0; i <= oddArray.length - 1; i++) {

			oddArray[i] = scan.nextInt();
		}
		scan.close();
		int[] mergedArray = mergedAndSortedArray(evenArray, oddArray);
		System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
	}

	public static int[] mergedAndSortedArray(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int idx = 0;
		while (i <= arr1.length - 1 && j <= arr2.length - 1) {
			if (arr1[i] <= arr2[j]) {
				res[idx++] = arr1[i++];
			} else {
				res[idx++] = arr2[j++];
			}
		}
		while (i <= arr1.length - 1) {
			res[idx++] = arr1[i++];
		}
		while (j <= arr2.length - 1) {
			res[idx++] = arr2[j++];
		}
		return res;
	}
}
