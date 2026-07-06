package com.practice.Patterns;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 0;i < n;i++) {
			int start = 0;
			if(i % 2 == 0) {
				start = 1;
			}
			for(int j = 0;j <= i;j++) {
				System.out.print(start+" ");
				start = 1 - start;
			}
			System.out.println();
		}
	}
}
