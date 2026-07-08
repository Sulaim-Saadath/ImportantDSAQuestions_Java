package com.practice.BasicMathProblems;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		scan.close();
		int reversedNumber = reverseNumber(num);
		System.out.println("The reverse of " + num + " is " +reversedNumber);
	}
	
	public static int reverseNumber(int num) {
		int revNum = 0;
		while(num > 0) {
			int lastDigit = num % 10;
			revNum = (revNum * 10) + lastDigit;
			num = num / 10;
		}
		return revNum;
	}
}
