package com.practice.Patterns;

import java.util.Scanner;

//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *

public class Pattern8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = n; i > 0;i--) {
			for(int j = 1; j <= n - i;j++) {
				System.out.print(" ");
			}
			for(int k = 1;k <= (2 * i) - 1;k++) {
				System.out.print("*");
			}
			for(int l = 1; l <= n - i;l++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
