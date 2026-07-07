package com.practice.Patterns;

import java.util.Scanner;

//1             1
//1 2         2 1
//1 2 3     3 2 1
//1 2 3 4 4 3 2 1
public class Pattern12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		scan.close();
		int space = 2*(n-1);
		for(int i = 0;i < n;i++) {
			// number
			for(int j = 0;j <= i;j++) {
				System.out.print(j + 1 + " ");
			}
			// space
			for(int k = 0;k < space;k++) {
				System.out.print("  ");
			}
			// number
			for(int l = i; l >= 0;l--) {
				System.out.print(l + 1 + " ");
			}
			System.out.println();
			space = space - 2;
		}
		
				
	}
}
