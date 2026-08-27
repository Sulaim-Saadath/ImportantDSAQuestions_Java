package com.practice.leetcode.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 1 0 -1 0 -2 2
public class FourSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		scan.close();
		Arrays.sort(arr);
		System.out.println("The sorted array: " + Arrays.toString(arr));
		List<List<Integer>> resultList = fourSum(arr, target);
		System.out.println(resultList);
	}

	public static List<List<Integer>> fourSum(int[] arr, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i <= arr.length - 4; i++) {
			if (i > 0 && arr[i - 1] == arr[i]) {
				continue;
			}
			for (int j = i + 1; j <= arr.length - 3; j++) {
				if (j > i + 1 && arr[j - 1] == arr[j]) {
					continue;
				}
				int left = j + 1;
				int right = arr.length - 1;
				while (left < right) {
					long sum = (long) (arr[i] + arr[j] + arr[left] + arr[right]);
					if (sum == target) {
						List<Integer> addList = new ArrayList<Integer>();
						addList.add(arr[i]);
						addList.add(arr[j]);
						addList.add(arr[left]);
						addList.add(arr[right]);
						list.add(addList);
						left++;
						right--;
						while (left < right && arr[left - 1] == arr[left])
							left++;
						while (right > left && arr[right + 1] == arr[right])
							right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}
		return list;
	}
}
