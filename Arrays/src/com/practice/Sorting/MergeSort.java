package com.practice.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// O(Nlog2 n)
public class MergeSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(Arrays.toString(arr));
		int low = 0;
		int high = arr.length - 1;
		mergeSort(arr, low, high);
		System.out.println(Arrays.toString(arr));
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void merge(int[] arr, int low, int mid, int high) {
		List<Integer> list = new ArrayList<Integer>();
		int i = low;
		int j = mid + 1;
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				list.add(arr[i]);
				i++;
			} else {
				list.add(arr[j]);
				j++;
			}
		}
		while(i <= mid) {
			list.add(arr[i]);
			i++;
		}
		while(j <= high) {
			list.add(arr[i]);
			j++;
		}
		for(int k = low;k <= high;k++) {
			arr[k] = list.get(k - low);
		}
	}
}
