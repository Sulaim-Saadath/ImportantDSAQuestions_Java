package com.practice.Patterns;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 0;i < n;i++) {
			for(int j = 1;j <= n - i;j++) {
				System.out.print("*");
			}
			for(int j = 1;j <= 2 * i;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j <= n - i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int space = (2 * n) - 2;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print("*");
			}
			for(int j = 0;j < space;j++) {
				System.out.print(" ");
			}
			for(int j = 0;j <= i;j++) {
				System.out.print("*");
			}
			space -= 2;
			System.out.println();
		}
		
//		for(int i = 0;i < n - 1;i++) {
//			for(int j = 0;j <= i + 1;j++) {
//				System.out.print("*");
//			}
//			for(int j = 0;j < (n + 1) - (2*i);j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0;j <= i + 1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
