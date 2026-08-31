package com.practice.leetcode.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IntersectionOfTwoArrays_II {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array1: ");
		int[] arr1 = new int[scan.nextInt()];
		System.out.println("Enter the size of the array2: ");
		int[] arr2 = new int[scan.nextInt()];
		System.out.println("Enter the elements inside array1: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = scan.nextInt();
		}
		Arrays.sort(arr1);
		System.out.println("Enter the elements isnide the array2: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = scan.nextInt();
		}
		Arrays.sort(arr2);
		scan.close();
		System.out.println(Arrays.toString(intersect(arr1, arr2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j])
				i++;
			else
				j++;
		}
		int res[] = new int[list.size()];
		int idx = 0;
		for (int n : list) {
			res[idx] = n;
			idx++;
		}
		return res;
	}
}
