package com.practice.Patterns;

import java.util.Scanner;

//    A     
//   ABA    
//  ABCBA   
// ABCDCBA  
//ABCDEDCBA 


public class Pattern17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 0; i< n;i++) {
			// Space
			for(int j = 1;j <= n - i;j++) {
				System.out.print(" ");
			}
			
			// Characters
			char ch = 'A';
			int breakpoint = (2*i + 1)/2;
			for(int j = 1; j <= (2 * i) + 1;j++) {
				System.out.print(ch);
				if(j <= breakpoint) ch++;
				else ch--;
			}
			
			// Space
			for(int j = 1;j <= n - i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
