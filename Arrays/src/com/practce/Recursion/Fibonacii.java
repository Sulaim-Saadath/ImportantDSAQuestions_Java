package com.practce.Recursion;

import java.util.Scanner;

public class Fibonacii {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		scan.close();
		fib(n);
	}
	
	public static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		
		int flast = fib(n - 1);
		int slast = fib(n - 2);
		System.out.print(flast + " " + slast + " "); 
		return flast + slast;
	}
}
