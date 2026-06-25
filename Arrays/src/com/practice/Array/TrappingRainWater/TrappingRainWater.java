package com.practice.Array.TrappingRainWater;

import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {

		// Used to take input from the keyboard
		Scanner scan = new Scanner(System.in);

		// Ask the user for the array size
		System.out.println("Enter the size of the array: ");

		// Create the array with the given size
		int[] arr = new int[scan.nextInt()];

		// Ask the user to enter array elements
		System.out.println("Enter the elements inside array: ");

		// Read all elements into the array
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}

		// Close the scanner to free system resources
		scan.close();

		// Call the function and print the total trapped water
		System.out.println(rainWaterTrapped(arr));
	}

	public static int rainWaterTrapped(int[] arr) {

		// Highest bar seen so far from the left side
		int leftMax = 0;

		// Highest bar seen so far from the right side
		int rightMax = 0;

		// Stores the total amount of trapped water
		int trappedWater = 0;

		// Pointer starting from the beginning of the array
		int left = 0;

		// Pointer starting from the end of the array
		int right = arr.length - 1;

		// Continue until both pointers meet
		while (left < right) {

			/*
			 * Compare both end heights. The smaller side decides the water level because
			 * water cannot rise above the shorter boundary.
			 */
			if (arr[left] < arr[right]) {

				/*
				 * If the current left bar is taller than every previous left bar, update
				 * leftMax.
				 */
				if (arr[left] >= leftMax) {
					leftMax = arr[left];
				}

				/*
				 * Otherwise, water can be trapped. Water = leftMax - current height
				 */
				else {
					trappedWater += leftMax - arr[left];
				}

				// Move the left pointer towards the center
				left++;
			}

			// Right side is smaller (or both are equal)
			else {

				/*
				 * If the current right bar is taller than every previous right bar, update
				 * rightMax.
				 */
				if (rightMax <= arr[right]) {
					rightMax = arr[right];
				}

				/*
				 * Otherwise, water can be trapped. Water = rightMax - current height
				 */
				else {
					trappedWater += rightMax - arr[right];
				}

				// Move the right pointer towards the center
				right--;
			}
		}

		// Return the total trapped water
		return trappedWater;
	}
}