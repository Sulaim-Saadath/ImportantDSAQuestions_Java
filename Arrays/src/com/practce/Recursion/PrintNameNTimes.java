package com.practce.Recursion;

import java.util.Scanner;

public class PrintNameNTimes {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		scan.close();
		print1ToN(1, n);
	}
	
	public static void print1ToN(int i, int N) {
		if(i > N) {
			return;
		}
		System.out.println("Sulaim");
		print1ToN(i + 1, N);
	}
}
