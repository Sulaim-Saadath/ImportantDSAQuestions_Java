package com.practice.leetcode.TwoPointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwoSumUnsortedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements in array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = scan.nextInt();
		scan.close();
		System.out.println("The pairs of indexes or values whose sum is equal to "+target+" is: " + twoSum(arr, target));
	}
	
	public static List<List<Integer>> twoSum(int[] arr, int target) {
		List<List<Integer>> finalList = new ArrayList<List<Integer>>();
		
//		When actual value pairs needed
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int i = 0;i <= arr.length - 1;i++) {
//			int needed = target - arr[i];
//			if(map.containsKey(needed)) {
//				List<Integer> addList = new ArrayList<Integer>();
//				addList.add(needed);
//				addList.add(arr[i]);
//				finalList.add(addList);
//			} else {
//				map.put(arr[i], 0);
//			}
//		}
		
//		When indexes needed
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0;i <= arr.length - 1;i++) {
			int needed = target - arr[i];
			if(map.containsKey(needed)) {
				List<Integer> addList = new ArrayList<Integer>();
				addList.add(map.get(needed) + 1);
				addList.add(i + 1);
				finalList.add(addList);
			} else {
				map.put(arr[i], i);
			}
		}
		return finalList;
	}
}
