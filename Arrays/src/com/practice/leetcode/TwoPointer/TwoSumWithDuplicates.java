package com.practice.leetcode.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoSumWithDuplicates {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the targets: ");
		int target = scan.nextInt();
		scan.close();
		List<List<Integer>> list = twoSumPairs(arr, target);
		System.out.println(list);
	}

	public static List<List<Integer>> twoSumPairs(int[] arr, int target) {
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		int left = 0;
		int right = arr.length - 1;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				List<Integer> addList = new ArrayList<Integer>();
				addList.add(arr[left]);
				addList.add(arr[right]);
				list.add(addList);
				left++;
				right--;
				while (left < arr.length && arr[left] == arr[left - 1]) {
					left++;
				}
				while (right >= 0 && arr[right] == arr[right + 1]) {
					right--;
				}
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return list;
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] >= arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
