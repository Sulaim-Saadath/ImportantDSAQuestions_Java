package com.practice.BasicMathProblems;

import java.util.Scanner;

public class CheckPalndrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		scan.close();
		boolean res = checkPalindrome(num);
		if(res == true) {
			System.out.println(num + " is a Palindrome");
		} else {
			System.out.println(num + " is not a Palindrome");
		}
	}
	
	public static boolean checkPalindrome(int num) {
		int revNum = 0;
		int original = num;
		while(original > 0) {
			int lastDigit = original % 10;
			revNum = (revNum * 10) + lastDigit;
			original = original / 10;
		}
		if(num == revNum) {
			return true;
		}
		return false;
	}
}
