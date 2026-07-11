package com.practice.BasicMathProblems;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		scan.close();
		boolean result = checkArmstrong(num);
		if(result == true) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}
	}
	
	public static boolean checkArmstrong(int num) {
		int sum = 0;
		int duplicate = num;
		while(num > 0) {
			int lastDigit = num % 10;
			sum = sum + (lastDigit * lastDigit * lastDigit);
			num = num / 10;
		}
		if(sum == duplicate) {
			return true;
		}
		return false;
	}
}
