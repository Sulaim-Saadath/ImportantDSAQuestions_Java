package com.practce.Recursion;

import java.util.Scanner;

public class PrintNtoOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		scan.close();
		printNtoOne(n, 1);
	}

	public static void printNtoOne(int n, int i) {
		if (n < i) {
			return;
		}
		System.out.println(n);
		printNtoOne(n - 1, i);
	}
}
