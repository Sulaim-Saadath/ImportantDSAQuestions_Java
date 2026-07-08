package com.practice.BasicMathProblems;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		scan.close();
		int res = countDigits(num);
		int result = (int) Math.log10(num) + 1;
		System.out.println("\n" + result);
		System.out.println("\nNo of digits inside a number " + num + " is " + res);
	}

	public static int countDigits(int num) {
		if (num == 0) {
			return 0;
		}
		int number = num;
		int count = 0;
		while (number > 0) {
			int lastDigit = number % 10;
			count++;
			System.out.print(lastDigit + " ");
			number /= 10;
		}
		return count;

	}
}
