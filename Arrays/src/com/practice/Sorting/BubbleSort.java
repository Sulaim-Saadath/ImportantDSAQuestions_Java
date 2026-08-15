package com.practice.Sorting;

import java.util.Arrays;
import java.util.Scanner;

// 12 45 7 19 2
// itr 1 -> 
//     12 < 45
//     45 < 7(swap)  
//     45 < 19(swap)
//     45 < 2(swap)
// 12 7 19 2 45
// itr 2 -> 
//     12 < 7 (swap)
//     12 < 19
//     19 < 2 (swap)
// 7 12 2 19 45
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter the elements inside the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		bubbleSort(arr);
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		int didSwap = 0;
		for(int i = 0;i <= arr.length - 1;i++) {
			for(int j = 0;j <= arr.length - i - 2;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					didSwap = 1;
				}
			}
			if(didSwap == 0) {
				System.out.println("Array already sorted");
				break;
			}
		}
	}
}
