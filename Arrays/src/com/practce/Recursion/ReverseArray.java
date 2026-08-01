package com.practce.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter elements inside array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		reverseArrayy(0, arr, arr.length);
		System.out.println(Arrays.toString(arr));
		scan.close();
	}

	public static void reverseArrayy(int i, int[] arr, int n) {
		if (i >= n / 2) {
			return;
		}
		swap(i, n - i - 1, arr);
		reverseArrayy(i + 1, arr, n);
	}

	public static void swap(int l, int r, int[] arr) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

}
