package com.practice.Patterns;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 0;i < n;i++) {
			char ch = 'A';
			for(int j = 0;j <= i;j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
