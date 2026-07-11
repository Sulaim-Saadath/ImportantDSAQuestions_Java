package com.practice.BasicMathProblems;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of a and b: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		highestCommonFactor(a, b);
	}

	public static void highestCommonFactor(int a, int b) {
//		int hcf = 0;
//		for(int i = 1;i <= Math.min(a, b);i++) {
//			if(a % i == 0 && b % i == 0) {
//				hcf = i;
//			}
//		}
//		System.out.println("Highest Common Factor of " + a + " and " + b +" is " + hcf);
		int firstNum = a;
		int secondNum = b;
		while (a > 0 && b > 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a == 0) {
			System.out.println("Highest Common Factor of " + firstNum + " and " + secondNum + " is " + b);
		} else {
			System.out.println("Highest Common Factor of " + firstNum + " and " + secondNum + " is " + a);
		}
	}
}
