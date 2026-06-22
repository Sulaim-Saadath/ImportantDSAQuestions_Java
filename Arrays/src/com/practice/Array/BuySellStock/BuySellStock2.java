package com.practice.Array.BuySellStock;

import java.util.Scanner;

public class BuySellStock2 {
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

	public static String maximumProfit(int[] prices) {
		int maxProfit = 0;
		int currentBuyDay = 0;
		int bestBuyDay = 0;
		int sellDay = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0;i <= prices.length - 1;i++) {
			if(Math.min(minPrice, prices[i]) == prices[i]) {
				minPrice = prices[i];
				currentBuyDay = i;
			}
			int profit = prices[i] - minPrice;
			if(Math.max(maxProfit, profit) == profit) {
				maxProfit = profit;
				bestBuyDay = currentBuyDay;
				sellDay = i;
			}
		}
		return "Maximum Profit: " + maxProfit + ", bestBuyDay: " + bestBuyDay + ", bestSellDay: " + sellDay;
	}
}
