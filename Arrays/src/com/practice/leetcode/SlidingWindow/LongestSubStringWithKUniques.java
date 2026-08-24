package com.practice.leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// aabacbebebe
public class LongestSubStringWithKUniques {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter the string: ");
		String str = scan.next();
		System.out.println("Enter the" + " k value: ");
		int k = scan.nextInt();
		scan.close();
		int result = longestKSubString(str, k);
		System.out.println("The longest substring with " + k + " distinct characters are: " + result);
	}

	public static int longestKSubString(String str, int k) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int low = 0;
		int res = Integer.MIN_VALUE;
		char[] chr = str.toCharArray();
		for (int high = 0; high < chr.length; high++) {
			char ch = chr[high];
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			while (map.size() > k) {
				char leftChar = chr[low];
				map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);
				if (map.get(leftChar) <= 0) {
					map.remove(leftChar);
				}
				low++;
			}
			if (map.size() == k) {
				int len = high - low + 1;
				res = Math.max(len, res);
			}
		}
		return res;
	}
}
