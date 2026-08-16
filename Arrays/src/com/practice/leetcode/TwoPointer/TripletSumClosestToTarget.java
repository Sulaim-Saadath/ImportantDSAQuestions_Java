package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSumClosestToTarget {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		scan.close();
		int resultSum = threeSumClosest(arr, target);
		System.out.println(resultSum);
	}
//	-4 -1 1 2 
    public static int threeSumClosest(int[] arr, int target) {
    	Arrays.sort(arr);
    	int maxDiff = Integer.MAX_VALUE;
    	int resSum = 0;
    	for(int i = 0;i <= arr.length - 3;i++) {
    		int left = i + 1;
    		int right = arr.length - 1;
    		while(left < right) {
    			int sum = arr[i] + arr[left] + arr[right];
    			if(sum == target) {
    				return sum;
    			} else if(sum < target) {
    				int diff = Math.abs(sum - target);
    				if(diff < maxDiff) {
    					maxDiff = diff;
    					resSum = sum;
    				}
    				left++;
    			} else {
    				int diff = Math.abs(sum - target);
    				if(diff < maxDiff) {
    					maxDiff = diff;
    					resSum = sum;
    				}
    				right--;
    			}
    		}
    	}
    	return resSum;
    }
}
