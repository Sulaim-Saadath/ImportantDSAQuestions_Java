package com.practice.Patterns;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		char ch = 'A';
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
}
