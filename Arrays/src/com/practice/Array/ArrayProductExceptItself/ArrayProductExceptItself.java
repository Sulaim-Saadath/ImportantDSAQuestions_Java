package com.practice.Array.ArrayProductExceptItself;

import java.util.Arrays;
import java.util.Scanner;
/*Given an array arr[] of n integers,
 *  construct a product array res[] (of the same size) 
 *  such that res[i] is equal to the product of all the elements of arr[] except arr[i].
 *   Input: arr[] = [10, 3, 5, 6, 2]
Output: [180, 600, 360, 300, 900]
Explanation: 
For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.

Input: arr[] = [12, 0]
Output: [0, 12]
Explanation: 
For i = 0, res[i] = 0.
For i = 1, res[i] = 12.
 *   */

public class ArrayProductExceptItself {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the " + arr.length + " elements inside array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		productArrayExceptItself(arr);
	}

	public static void productArrayExceptItself(int[] arr) {
//								BRUTE FORCE
//		int totalProduct = 1;
//		for(int i = 0;i <= arr.length - 1;i++) {
//			totalProduct *= arr[i];
//		}
//		int[] resultArray = new int[arr.length];
//		for(int i = 0;i <= resultArray.length - 1;i++) {
//			resultArray[i] = totalProduct/arr[i];
//		}
//		for(int x:resultArray) {
//			System.out.print(x + " ");
//		}
		
		int[] resultArray = new int[arr.length];
		resultArray[0] = 1;
		for(int i = 1;i <= arr.length - 1;i++) {
			resultArray[i] = resultArray[i - 1] * arr[i - 1];
		}
		int rightProduct = 1;
		for(int i = arr.length - 1; i >= 0;i--) {
			resultArray[i] *= rightProduct;
			rightProduct *= arr[i];
		}
		
		System.out.println(Arrays.toString(resultArray));
	}
}
