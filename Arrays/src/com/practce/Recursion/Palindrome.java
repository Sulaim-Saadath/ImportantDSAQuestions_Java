package com.practce.Recursion;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scan.next();
		scan.close();
		char[] ch = str.toCharArray();
		reverseString(0, ch, ch.length);
		String reversed = new String(ch);
		if (reversed.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void reverseString(int i, char[] ch, int n) {
		if(i >= n/2) {
			return;
		}
		swap(i, n - i - 1, ch);
		reverseString(i + 1, ch, n);
	}
	
	public static void swap(int l, int r, char[] ch) {
		char temp = ch[l];
		ch[l] = ch[r];
		ch[r] = temp;
	}
}
