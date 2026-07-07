package com.practice.Patterns;

import java.util.Scanner;

//1
//2 3
//4 5 6 
//7  8  9  10
//11 12 13 14 15


public class Pattern13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		int count = 1;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}
