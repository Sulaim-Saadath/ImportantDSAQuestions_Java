package com.practice.Array.InertAndMergeInterval;

import java.util.Scanner;

public class InsertAndMergeInterval {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of intervals: ");
		int[][] intervals = new int[scan.nextInt()][2];
		System.out.println("Enter the intervals: ");
		for(int i = 0;i <= intervals.length - 1;i++) {
			for(int j = 0;j <= intervals[i].length - 1;j++) {
				intervals[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter the new Interval to insert: ");
		int[] newInterval = new int[2];
		newInterval[0] = scan.nextInt();
		newInterval[1] = scan.nextInt();
		scan.close();
		
		int index = intervals.length;
		for(int i = 0;i <= intervals.length - 1;i++) {
			if(newInterval[0] < intervals[i][0]) {
				index = i;
				break;
			}
		}
		
		int[][] changedIntervals = new int[intervals.length + 1][2];
		for(int i = 0;i < index;i++) {
			changedIntervals[i][0] = intervals[i][0];
			changedIntervals[i][1] = intervals[i][1];
		}
		
		changedIntervals[index][0] = newInterval[0];
		changedIntervals[index][1] = newInterval[1];
		
		for(int i = index;i <= intervals.length - 1;i++) {
			changedIntervals[i + 1][0] = intervals[i][0];
			changedIntervals[i + 1][1] = intervals[i][1];
		}
		
		int[][] merged = new int[changedIntervals.length][2];
		merged[0][0] = changedIntervals[0][0];
		merged[0][1] = changedIntervals[0][1];
		
		int k  = 0;
		for(int i = 1; i < changedIntervals.length;i++) {
			if(changedIntervals[i][0] <= merged[k][1]) {
				merged[k][1] = Math.max(merged[k][1], changedIntervals[i][1]);
			} else {
				k++;
				merged[k][0] = changedIntervals[i][0];
				merged[k][1] = changedIntervals[i][1];
			}
		}
		
		for(int i = 0;i <= k;i++) {
			System.out.println("["+merged[i][0]+", " + merged[i][1] + "]");
		}
	}
}
