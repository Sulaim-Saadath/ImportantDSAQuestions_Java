package com.practice.Array.ArrayProductExceptItself;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProductExceptItselfPractice {
	public static void main(String[] args) {
		System.out.println("Enter the size of the array: ");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the " + arr.length + " elements inside array");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int[] resultArray = productOfArrayExceptSelf(arr);
		System.out.println(Arrays.toString(resultArray));
	}
	
	static int[] productOfArrayExceptSelf(int[] array) {
		int[] productArray = new int[array.length];
		productArray[0] = 1; // left product of first element is always 1
		for(int i = 1;i <= array.length - 1;i++) {
			productArray[i] = productArray[i - 1] * array[i - 1]; // calculate the left product of every element
		}
		int rightProduct = 1; // the right product of last element is always 1
		for(int i = array.length - 1;i >= 0;i--) {
			productArray[i] *= rightProduct; // multiply the left product with right product at every current element
			rightProduct *= array[i];
		}
		return productArray;
	}
}
