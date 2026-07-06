package com.practice.Patterns;

import java.util.Scanner;

/*
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
 * */


public class Pattern1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
