package com.practice.leetcode.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the s string: ");
        String s = scan.next();
        System.out.println("Enter the t string: ");
        String t = scan.next();
        System.out.println(
            "The minimum substring of s containing all characters of t is: "
            + minWindow(s, t)
        );
        scan.close();
    }

    public static String minWindow(String s, String t) {

        // If s is smaller than t, it cannot contain all characters of t
        if (s.length() < t.length()) {
            return "";
        }

        // Stores the frequency of characters currently present in the window
        Map<Character, Integer> have = new HashMap<>();

        // Stores the frequency of characters required from t
        Map<Character, Integer> needed = new HashMap<>();

        // Count how many times each character occurs in t
        for (char ch : t.toCharArray()) {
            needed.put(ch, needed.getOrDefault(ch, 0) + 1);
        }

        // Left pointer of the sliding window
        int low = 0;

        // Stores the length of the smallest valid window found
        int res = Integer.MAX_VALUE;

        // Stores the starting index of the smallest valid window
        int start = -1;

        // Move the right pointer to expand the window
        for (int high = 0; high < s.length(); high++) {

            // Add the current right-side character to the window
            char rightChar = s.charAt(high);
            have.put(rightChar, have.getOrDefault(rightChar, 0) + 1);

            /*
             * If the current window contains all required characters,
             * try shrinking it from the left to find a smaller valid window.
             */
            while (isValid(have, needed)) {

                // Calculate the current window length
                int length = high - low + 1;

                // Update the answer if this window is smaller
                if (length < res) {
                    res = length;
                    start = low;
                }

                /*
                 * Remove the leftmost character because we want
                 * to shrink the current valid window.
                 */
                char leftChar = s.charAt(low);
                have.put(leftChar, have.get(leftChar) - 1);

                // Move the left pointer forward
                low++;
            }
        }

        // No valid window was found
        if (start == -1) {
            return "";
        }

        // substring(start, endIndex), where endIndex is exclusive
        return s.substring(start, start + res);
    }

    /*
     * Checks whether the current window contains every character
     * required in t with the required frequency.
     */
    public static boolean isValid(
            Map<Character, Integer> have,
            Map<Character, Integer> needed) {

        // Check every character required by t
        for (char ch : needed.keySet()) {

            /*
             * If the current window has fewer occurrences than required,
             * the window is not valid.
             */
            if (have.getOrDefault(ch, 0) < needed.get(ch)) {
                return false;
            }
        }

        // All required characters are present with sufficient frequency
        return true;
    }
}

