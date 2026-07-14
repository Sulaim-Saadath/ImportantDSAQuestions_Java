package com.practce.Recursion;

import java.util.Scanner;

public class Print1ToN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int n = scan.nextInt();
		scan.close();
		printOneToN(1, n);
	}
	
	public static void printOneToN(int i, int N) {
		if(i > N) {
			return;
		}
		System.out.println(i);
		printOneToN(i + 1, N);
	}
}
