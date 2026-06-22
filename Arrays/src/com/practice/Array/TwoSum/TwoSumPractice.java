package com.practice.Array.TwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the target element: ");
		int target = scan.nextInt();
		scan.close();
		twoSumSets(arr, target);
	}
	
	public static void twoSumSets(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int i = 0;
		for(int x:arr) {
			int compliment = target - x;
			if(map.containsKey(compliment)) {
				System.out.print("("+x+","+compliment+")"+ " ");
			}
			map.put(x, i);
			i++;
		}
	}
}
