package com.practice.leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestRepeatingCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scan.next();
		System.out.println("The Longest substring with the repeating characters is: " + longestRepeatingCharacter(s));
		scan.close();
	}

	public static int longestRepeatingCharacter(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int low = 0;
		int res = 0;
		for (int high = 0; high <= s.length() - 1; high++) {
			map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
			while (map.size() > 1) {
				map.put(s.charAt(low), map.getOrDefault(s.charAt(low), 0) - 1);
				if (map.get(s.charAt(low)) == 0) {
					map.remove(s.charAt(low));
				}
				low++;
			}
			int len = high - low + 1;
			res = Math.max(res, len);
		}
		return res;
	}
}
