package com.practice.leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.next();
		scan.close();
		int result = longestSubString(str);
		System.out.println("The length of longest substring with no repeating characters is " + result);
	}

	public static int longestSubString(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int low = 0;
		int res = -1;
		for (int high = 0; high <= str.length() - 1; high++) {
			map.put(str.charAt(high), map.getOrDefault(map, 0) + 1);
			int windowSize = high - low + 1;
			// It means the window should not repeat characters
			// If the window size is more than the size of map then there is duplicate 
			while (map.size() < windowSize) {
				map.put(str.charAt(low), map.getOrDefault(str.charAt(low), 0) - 1);
				if (map.get(str.charAt(low)) == 0) {
					map.remove(str.charAt(low));
				}
				low++;
				windowSize = high - low + 1;
			}
			int len = high - low + 1;
			res = Math.max(res, len);
		}
		return res;
	}
}
