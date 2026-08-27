package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToTheEnd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("Before moving zeros to end: " + Arrays.toString(arr));
		moveZeroToEnd(arr);
		System.out.println("After moving zeros to end: " + Arrays.toString(arr));
	}
	
	public static void moveZeroToEnd(int[] arr) {
//		int count = 0;
//		for(int i = 0;i <= arr.length - 1;i++) {
//			if(arr[i] == 0) {
//				count++;
//			}
//		}
//		while(count > 0) {
//			for(int i = 0;i <= arr.length - 2;i++) {
//				if(arr[i] == 0) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//			}
//			count--;
//		}
//		 Optimised
		int j = 0; // position that holds the non zero value
		for(int i = 0;i <= arr.length - 1;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
	}
}
