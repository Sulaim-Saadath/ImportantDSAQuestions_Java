package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class MergesSortedArray1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array1: ");
		int m = scan.nextInt();
		System.out.println("Enter the size of the array2: ");
		int n = scan.nextInt();
		int[] arr1 = new int[m + n];
		int[] arr2 = new int[n];
		System.out.println("Enter the elements inside the array1: ");
		for(int i = 0;i <= arr1.length - 1;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter the elements inside the array2: ");
		for(int i = 0;i <= arr2.length - 1;i++) {
			arr2[i] = scan.nextInt();
		}
		scan.close();
		mergeSortedArray(arr1, m, arr2, n);
		System.out.println(Arrays.toString(arr1));
	}
	public static void mergeSortedArray(int[] arr1, int m, int[] arr2, int n) {
		int[] temp = new int[m + n];
		int i = 0;
		int j = 0;
		int idx = 0;
		while(i < m && j < n) {
			if(arr1[i] <= arr2[j]) {
				temp[idx++] = arr1[i];
				i++;
			} else {
				temp[idx++] = arr2[j];
				j++;
			}
		}
		while(i < m) {
			temp[idx++] = arr1[i];
			i++;
		}
		while(j < n) {
			temp[idx++] = arr2[j];
			j++;
		}
		for (int k = 0;k <= temp.length - 1;k++) {
			arr1[k] = temp[k];
		}
	}
	
}
