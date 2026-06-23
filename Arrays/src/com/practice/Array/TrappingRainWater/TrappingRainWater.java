package com.practice.Array.TrappingRainWater;

import java.util.Arrays;
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
		rainWaterTrapped(arr);
	}

	public static void rainWaterTrapped(int[] arr) {
		int[] leftMax = new int[arr.length];
		int[] rightMax = new int[arr.length];
		leftMax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
		}
		rightMax[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
		}

		System.out.println(Arrays.toString(leftMax));
		System.out.println(Arrays.toString(rightMax));

		int trappedWater = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			trappedWater += Math.min(rightMax[i], leftMax[i]) - arr[i];
		}
		System.out.println(trappedWater);
	}

}
