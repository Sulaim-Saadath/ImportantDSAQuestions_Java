package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSmallerSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements in array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		scan.close();
		int result = tripleSmallerSum(arr, target);
		System.out.println("Tripets sum smaller than " +target+" is: " + result);
	}
	
	public static int tripleSmallerSum(int[] arr, int target) {
		Arrays.sort(arr);
		int ans = 0;
		for(int i = 0;i <= arr.length - 3;i++) {
			int left = i + 1;
			int right = arr.length - 1;
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				if(sum >= target) {
					right--;
				} else {
					ans = ans + (right - left);
					left++;
				}
			}
		}
		return ans;
	}
	
}
