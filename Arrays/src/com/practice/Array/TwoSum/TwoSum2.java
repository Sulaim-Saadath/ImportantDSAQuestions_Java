package com.practice.Array.TwoSum;

import java.util.HashMap;
import java.util.Scanner;

/*Given an array arr[] of n integers and a target value k,
 check if there exists a pair whose difference equals k.
 */
public class TwoSum2 {
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

	    // Stores elements already seen while traversing
	    HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

	    for (int i = 0; i <= arr.length - 1; i++) {

	        /*
	         * PATTERN: Difference Lookup
	         *
	         * We need to check whether there exists a number whose
	         * difference with the current element equals target.
	         *
	         * Example:
	         * current = 80, target = 78
	         *
	         * 80 - 78 = 2
	         * If 2 was seen before, pair exists.
	         *
	         * Example:
	         * current = 2, target = 78
	         *
	         * 2 + 78 = 80
	         * If 80 was seen before, pair exists.
	         *
	         * We check both because:
	         *
	         * current - previous = target
	         * OR
	         * previous - current = target
	         *
	         * Since we don't know which number appears first,
	         * both possibilities must be checked.
	         */
	        if (hashMap.containsKey(arr[i] - target)
	                || hashMap.containsKey(arr[i] + target)) {

	            return true;
	        }

	        // Store current element for future lookups
	        hashMap.put(arr[i], i);
	    }

	    // No valid pair found
	    return false;
	}
}
