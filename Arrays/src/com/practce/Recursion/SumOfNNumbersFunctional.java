package com.practce.Recursion;

import java.util.Scanner;

public class SumOfNNumbersFunctional {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = scan.nextInt();
		scan.close();
		int sum = sumOfNNaturalNumbers(n);
		System.out.println(sum);
	}
	
	public static int sumOfNNaturalNumbers(int n) {
		if(n == 0) {
			return n;
		}
		return n + sumOfNNaturalNumbers(n - 1);
	}
}
