package com.practce.Recursion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = scan.nextInt();
		scan.close();
		int factorial = factorial(n);
		System.out.println(factorial);
	}
	
	public static int factorial(int n) {
		if(n == 1) {
			return n;
		}
		return n * factorial(n - 1);
	}
}
