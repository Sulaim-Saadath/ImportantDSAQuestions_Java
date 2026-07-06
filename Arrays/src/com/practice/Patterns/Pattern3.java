package com.practice.Patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
