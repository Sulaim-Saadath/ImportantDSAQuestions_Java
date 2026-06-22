package com.practice.Array.ContainerWithMostWater;

import java.util.Scanner;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of height array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter " + arr.length + " elements inside array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		containerWithMostWater(arr);
	}

	public static void containerWithMostWater(int[] arr) {

		// Left pointer starts from the beginning of the array
		int left = 0;

		// Right pointer starts from the end of the array
		int right = arr.length - 1;

		// Stores the maximum water area found so far
		int maximumWater = 0;

		// Continue until both pointers meet
		while (left < right) {

			// Water height is determined by the shorter wall
			int height = Math.min(arr[left], arr[right]);

			// Width is the distance between the two walls
			int width = right - left;

			// Calculate the area of water contained
			int area = height * width;

			// Update maximum area if current area is greater
			maximumWater = Math.max(maximumWater, area);

			/*
			 * Move the pointer pointing to the smaller height. Because the shorter wall
			 * limits the container's capacity. Moving the taller wall cannot increase the
			 * height, but moving the shorter wall may find a taller wall and potentially
			 * produce a larger area.
			 */
			if (arr[left] < arr[right]) {
				left++;
			} else {
				right--;
			}
		}

		// Print the maximum water area possible
		System.out.println(maximumWater);
	}

//	2, 1, 8, 6, 4, 6, 5, 5
//										BRUTE FORCE
//	public static void containerWithMostWater(int[] arr) {
//		int maxWaterTrapped = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//
//				int width = j - i;
//				int height = Math.min(arr[i], arr[j]);
//				int area = width * height;
//
//				maxWaterTrapped = Math.max(maxWaterTrapped, area);
//			}
//		}
//
//		System.out.println(maxWaterTrapped);
//	}
}
