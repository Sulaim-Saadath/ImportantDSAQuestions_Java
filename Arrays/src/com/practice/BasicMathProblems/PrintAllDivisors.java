package com.practice.BasicMathProblems;

import java.util.Scanner;

public class PrintAllDivisors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scan.nextInt();
		scan.close();
		printAllDivisors(num);
	}
	
	public static void printAllDivisors(int num) {
		for(int i = 1;i <= num;i++) {
			if(num % i == 0) {
				if(i == num) {
					System.out.print(i + " ");	
				} else {
					System.out.print(i + ", ");
				}
			}
		}
	}
}
