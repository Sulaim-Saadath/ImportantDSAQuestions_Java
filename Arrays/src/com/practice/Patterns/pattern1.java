package com.practice.Patterns;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n = scan.nextInt();
		scan.close();
		print1(n);
	}
	
	public static void print1(int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
