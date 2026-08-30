package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array 1: ");
		int[] arr1 = new int[scan.nextInt()];
		System.out.println("Enter the size of array 2: ");
		int[] arr2 = new int[scan.nextInt()];
		System.out.println("Enter " + arr1.length + " elements inside the array 1: ");
		for(int i = 0;i <= arr1.length - 1;i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter " + arr2.length + " elements inside the array 1: ");
		for(int i = 0;i <= arr2.length - 1;i++) {
			arr2[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("The Intersection of the two arrays is: " + Arrays.toString(intersection(arr1, arr2)));
//	intersection(arr1, arr2);
	}
	
	public static int[] intersection(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<Integer>();
		for(int n:arr1) {
			set1.add(n);
		}
		for(int n:arr2) {
			set2.add(n);
		}
		System.out.println(set1);
		System.out.println(set2);
		if(set1.size() > set2.size()) {
			for(int n: set2) {
				if(set1.contains(n)) {
					set3.add(n);
				}
			}
		} else {
			for(int n: set1) {
				if(set2.contains(n)) {
					set3.add(n);
				}
			}
		}
		
		int[] res = new int[set3.size()];
		int i = 0;
		for(int n: set3)
			res[i++] = n;
		return res;
	}
}
