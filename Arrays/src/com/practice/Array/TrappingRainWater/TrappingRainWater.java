package com.practice.Array.TrappingRainWater;

import java.util.Scanner;

public class TrappingRainWater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(rainWaterTrapped(arr));
	}

	public static int rainWaterTrapped(int[] arr) {
		int leftMax = 0;
		int rightMax = 0;
		int trappedWater = 0;
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] < arr[right]) {
				if (arr[left] >= leftMax) {
					leftMax = arr[left];
				} else {
					trappedWater += leftMax - arr[left];
				}
				left++;
			} else {
				if (rightMax <= arr[right]) {
					rightMax = arr[right];
				} else {
					trappedWater += rightMax - arr[right];
				}
				right--;
			}
		}
		return trappedWater;
	}

}
