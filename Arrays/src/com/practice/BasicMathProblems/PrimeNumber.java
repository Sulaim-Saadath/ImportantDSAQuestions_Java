package com.practice.BasicMathProblems;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = scan.nextInt();
		scan.close();
		checkPrime(n);
	}
	
	public static void checkPrime(int n) {
		int count = 0;
		for(int i = 1; i <= n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
