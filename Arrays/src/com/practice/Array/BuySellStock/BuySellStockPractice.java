package com.practice.Array.BuySellStock;

import java.util.Scanner;

public class BuySellStockPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of prices array: ");
		int[] prices = new int[scan.nextInt()];
		System.out.println("Enter the prices at each day: ");
		for(int i = 0;i <= prices.length - 1;i++) {
			prices[i] = scan.nextInt();
		}
		scan.close();
		maximumProfit(prices);
	}
	
	public static void maximumProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		for(int i = 0;i <= prices.length - 1;i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
		}
		System.out.println("Maximum profit after buying and selling the stock is: " + maxProfit);
	}
}
