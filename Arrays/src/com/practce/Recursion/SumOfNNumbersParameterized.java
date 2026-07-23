package com.practce.Recursion;

import java.util.Scanner;

public class SumOfNNumbersParameterized {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int n = scan.nextInt();
		scan.close();
		System.out.print("The Sum of " + n + " numbers is: ");
		sumOfFirstNNumbers(n, 0);
	}
	
	public static void sumOfFirstNNumbers(int i, int sum) {
		if(i < 1) {
			System.out.println(sum);
			return;
		}
		sumOfFirstNNumbers(i - 1, sum + i);
	}
}
