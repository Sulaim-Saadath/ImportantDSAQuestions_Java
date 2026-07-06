package com.practice.Patterns;

import java.util.Scanner;

public class Patteren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 0;i < n;i++) {
			for(int j = 0;j <= i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
