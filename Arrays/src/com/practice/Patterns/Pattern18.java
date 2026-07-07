package com.practice.Patterns;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 0;i < n;i++) {
			for(char ch = (char) ('E' - i);ch <= 'E';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
