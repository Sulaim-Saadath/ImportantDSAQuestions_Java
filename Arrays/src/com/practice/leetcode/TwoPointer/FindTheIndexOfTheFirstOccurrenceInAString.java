package com.practice.leetcode.TwoPointer;

import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrenceInAString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Haystack String: ");
		String haystack = scan.next();
		System.out.println("Enter the needle String: ");
		String needle = scan.next();
		scan.close();
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		for (int i = 0; i <= haystack.length() - 1; i++) {
			int j = 0;
			if (haystack.charAt(i) == needle.charAt(j)) {
				int k = i;
				while (j <= needle.length() - 1 && k <= haystack.length() - 1
						&& haystack.charAt(k++) == needle.charAt(j++))
				if (j == needle.length())
					return i;
			}
		}
		return -1;
	}
}
