package com.practice.Patterns;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = scan.nextInt();
		scan.close();
		System.out.println(n);
	}
}
