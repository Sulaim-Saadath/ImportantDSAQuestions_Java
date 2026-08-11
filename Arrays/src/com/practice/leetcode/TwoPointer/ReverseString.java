package com.practice.leetcode.TwoPointer;

import java.util.Scanner;

// A man, a plan, a canal: Panama
public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scan.nextLine();
		scan.close();
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s = s.toLowerCase();
		
		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		boolean flag = true;
		while(left <= right) {
			if(ch[left] != ch[right]) {
				flag =  false;
				return flag;
			} 
			left++;
			right--;
		}
		return true;
	}
}
