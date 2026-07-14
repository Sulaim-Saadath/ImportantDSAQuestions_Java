package com.practce.Recursion;

import java.util.Scanner;

public class Print1ToNBackTrack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		print1ToNBackTrack(n, n);
	}
	
	public static void print1ToNBackTrack(int i, int N) {
		if(i < 1) {
			return;
		}
		print1ToNBackTrack(i - 1, N);
		System.out.println(i);
	}
}
