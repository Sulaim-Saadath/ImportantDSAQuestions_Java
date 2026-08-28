package com.practice.leetcode.SlidingWindow;

import java.util.Scanner;

public class LongestRepeatingCharacterReplacement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scan.next();
		System.out.println("Enter the number of times the charcter need to be replaced: ");
		int k = scan.nextInt();
		System.out.println("The Longest substring containing the same character is: " + characterReplacement(s, k));
		scan.close();
	}

	public static int characterReplacement(String s, int k) {
		int low = 0;
		int[] f = new int[256];
		int res = Integer.MIN_VALUE;
		for (int high = 0; high <= s.length() - 1; high++) {
//			Include the right side of window
			f[s.charAt(high)] = f[s.charAt(high)] + 1;
			int maxCount = maximumCount(f);
			int diff = (high - low + 1) - maxCount;

//			We need to shift the window as long as the no of the replaceable characters is less than the dif
//			Here difference is diff = number of characters that need to be replaced to make the entire window contain the same
			while (diff > k) {
				f[s.charAt(low)] = f[s.charAt(low)] - 1;
				low++;
				maxCount = maximumCount(f);
				diff = (high - low + 1) - maxCount;
			}

			int len = high - low + 1;
			res = Math.max(len, res);
		}
		return res;
	}

	public static int maximumCount(int[] arr) {
		int maxCount = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			maxCount = Math.max(maxCount, arr[i]);
		}
		return maxCount;
	}
}
