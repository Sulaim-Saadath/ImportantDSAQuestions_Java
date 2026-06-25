package com.practice.Array.TrappingRainWater;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " elements in the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int result = trappedWater(arr);
		System.out.println(result);
	}

	public static int trappedWater(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int waterTrapped = 0;
		while (left < right) {
			if (arr[left] < arr[right]) {
				if (arr[left] >= leftMax) {
					leftMax = arr[left];
				} else {
					waterTrapped += leftMax - arr[left];
				}
				left++;
			} else {
				if (arr[right] >= rightMax) {
					rightMax = arr[right];
				} else {
					waterTrapped += rightMax - arr[right];
				}
				right--;
			}
		}
		return waterTrapped;
	}
}
