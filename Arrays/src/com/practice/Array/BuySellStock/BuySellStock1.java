package com.practice.Array.BuySellStock;

import java.util.Scanner;

/*
Given an array prices[] of non-negative integers, representing the prices of the stocks on different days, find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Examples:

Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: Buy for price 1 and sell for price 9. 

Input: prices[] = [7, 6, 4, 3, 1]
Output: 0
Explanation: Since the array is sorted in decreasing order, 0 profit can be made without making any transaction.*/


public class BuySellStock1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the prices of stock on each day: ");
		String line = scan.nextLine();
		scan.close();
		line = line.replace("[", "");
		line = line.replace("]", "");
		String[] nums = line.split(", ");
		int[] prices = new int[nums.length];
		for (int i = 0; i <= prices.length - 1; i++) {
			prices[i] = Integer.parseInt(nums[i]);
		}
		System.out.println(maximumProfit(prices));
	}

	public static int maximumProfit(int[] prices) {
		int maxProfit = 0;
		for(int i = 0;i <= prices.length - 1;i++) {
			int minPrice = Integer.MAX_VALUE;
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		return maxProfit;
	}
}
