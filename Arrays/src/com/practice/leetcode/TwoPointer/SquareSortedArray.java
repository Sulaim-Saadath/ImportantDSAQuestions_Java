package com.practice.leetcode.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class SquareSortedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the " + arr.length + " elemnts iniside either postive or negative");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int[] resultArray = squaredSortedArray(arr);
		System.out.println("The Square sorted array: " + Arrays.toString(resultArray));
	}

	public static int[] squaredSortedArray(int[] arr) {
//		The counters to determine how many numbers are positive and negative
		int positive = 0;
		int negative = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < 0) 
				negative++;
		    else 
				positive++;
		}
		// Creating the arrays to store positive and negative number in seperate arrays
		int[] negativeArray = new int[negative];
		int[] positiveArray = new int[positive];
		
//		Condition to check if all the numbers are negative then square each elements inside array 
//		and reverse it get a sorted array 
		if (positive == 0) {
			squareArray(arr);
			int left = 0;
			int right = arr.length - 1;
			while (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			return arr;
		}
		
//		Condition to check if all the elements are positive then just square each element and return
		if (negative == 0) {
			squareArray(arr);
			return arr;
		}
		
//		Filter all the negative and positive and store in number in particular array
		int negIdx = 0;
		int posIdx = 0;
		for(int i = 0;i <= arr.length - 1;i++) {
			if(arr[i] < 0) {
				negativeArray[negIdx++] = arr[i]; 
			} else {
				positiveArray[posIdx++] = arr[i];			
			}
		}
		
//		Main Logic Starts here.
//		Reverse the negative array
		int left = 0;
		int right = negativeArray.length - 1;
		while (left < right) {
			int temp = negativeArray[left];
			negativeArray[left] = negativeArray[right];
			negativeArray[right] = temp;
			left++;
			right--;
		}
//      Square the negative array
		squareArray(negativeArray);
		System.out.println(Arrays.toString(negativeArray));
//		Square the positive array
		squareArray(positiveArray);
		System.out.println(Arrays.toString(positiveArray));
		
		int[] res = new int[arr.length];
		int idx = 0;
		int i = 0;
		int j = 0;
//		As long as the i, j values don't reach their respective array length
		while (i <= negativeArray.length - 1 && j <= positiveArray.length - 1) {
//			If array of negative element is less than array of positive element 
//			then assign the negative sqaured element in the the final array
			if (negativeArray[i] <= positiveArray[j]) {
				res[idx] = negativeArray[i];
				idx++;
				i++;
//				Else assign positive square array in final array
			} else {
				res[idx] = positiveArray[j];
				idx++;
				j++;
			}
		}
//		If negative array is not finihed yet assign all the elements in final array 
//		until the it reaches end of the array 
		while (i <= negativeArray.length - 1) {
			res[idx] = negativeArray[i];
			idx++;
			i++;
		}
		
//		If positive array is not finihed yet assign all the elements in final array 
//		until the it reaches end of the array
		while (j <= positiveArray.length - 1) {
			res[idx] = positiveArray[j];
			idx++;
			j++;
		}
		
		return res;
	}

	public static void squareArray(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = arr[i] * arr[i];
		}
	}
}
