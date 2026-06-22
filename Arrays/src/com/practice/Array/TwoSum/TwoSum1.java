package com.practice.Array.TwoSum;

import java.util.HashMap;
import java.util.Scanner;

// Given an array arr[] of n integers and a target value, 
// check if there exists a pair whose sum equals the target. 
// This is a variation of the 2-Sum problem.

/*
Example: 
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
*/

public class TwoSum1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array: ");
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();
		line1 = line1.replace("[", "");
		line1 = line1.replace("]", "");
		scan.close();
		String[] num = line1.split(", ");
		int[] arr = new int[num.length];
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		int target = Integer.parseInt(line2);

		boolean result = twoSum(arr, target);
		System.out.println(result);
	}

	public static boolean twoSum(int[] arr, int target) {
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = arr.length - 1; j > i; j--) {
//				if (arr[i] + arr[j] == target) {
//					System.out.println("[" + arr[i] + ", " + arr[j] + "]");
//					return true;
//				}
//			}
//		}
//		return false;

	    // Stores numbers already seen while traversing
	    HashMap<Integer, Integer> hashMap = new HashMap<>();

	    for (int i = 0; i <= arr.length - 1; i++) {

	        // Number needed to complete the target sum
	        // Example:
	        // target = 10
	        // current = 3
	        // need = 7
	        int required = target - arr[i];

	        // If required number already exists,
	        // we found a valid pair
	        if (hashMap.containsKey(required)) {
	            return true;
	        }

	        // Store current element for future lookups
	        hashMap.put(arr[i], i);
	    }

	    // No valid pair found
	    return false;
	}
		

}
