package com.practice.Array.InertAndMergeInterval;

import java.util.Scanner;

public class InsertAndMergeInterval1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of intervals: ");
		int[][] intervals = new int[scan.nextInt()][2];
		System.out.println("Enter the intervals: ");
		for (int i = 0; i <= intervals.length - 1; i++) {
			for (int j = 0; j <= intervals[i].length - 1; j++) {
				intervals[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter the new Interval to insert: ");
		int[] newInterval = new int[2];
		newInterval[0] = scan.nextInt();
		newInterval[1] = scan.nextInt();
		scan.close();

		int[][] mergedIntervals = mergedIntervals(intervals, newInterval);
		for (int i = 0; i <= mergedIntervals.length - 1; i++) {
			System.out.print("[" + mergedIntervals[i][0] + ", " + mergedIntervals[i][1] + "] ");
		}
	}

	public static int[][] mergedIntervals(int[][] intervals, int[] newInterval) {

		/*
		 * The maximum possible number of intervals after insertion is original
		 * intervals + 1.
		 *
		 * Example: Existing : 3 intervals New : 1 interval Maximum : 4 intervals
		 */
		int[][] result = new int[intervals.length + 1][2];

		/*
		 * 'k' always points to the next free position in the result array.
		 */
		int k = 0;

		/*
		 * Traverse every existing interval exactly once.
		 */
		for (int i = 0; i < intervals.length; i++) {

			/*
			 * ------------------------------------------------------- CASE 1 Current
			 * interval lies completely BEFORE newInterval.
			 *
			 * Example: Current : [1,3] New Interval: [5,7]
			 *
			 * Since there is no overlap, simply copy it to the result.
			 * -------------------------------------------------------
			 */
			if (intervals[i][1] < newInterval[0]) {

				result[k][0] = intervals[i][0];
				result[k][1] = intervals[i][1];
				k++;
			}

			/*
			 * ------------------------------------------------------- CASE 2 Current
			 * interval lies completely AFTER newInterval.
			 *
			 * Example: New Interval: [2,4] Current : [7,9]
			 *
			 * Since the array is sorted, newInterval can no longer overlap with any future
			 * interval.
			 *
			 * So: 1. Store newInterval in the result. 2. Treat the current interval as the
			 * new interval. -------------------------------------------------------
			 */
			else if (intervals[i][0] > newInterval[1]) {

				// Store the completed merged interval
				result[k][0] = newInterval[0];
				result[k][1] = newInterval[1];
				k++;

				/*
				 * Carry the current interval forward.
				 *
				 * We have already stored the previous newInterval, so now this interval becomes
				 * the interval that will be compared with the remaining intervals.
				 */
				newInterval = intervals[i];
			}

			/*
			 * ------------------------------------------------------- CASE 3 Current
			 * interval overlaps with newInterval.
			 *
			 * Example: Current : [3,5] New Interval: [4,8]
			 *
			 * Merge them by: - Taking the smaller starting point. - Taking the larger
			 * ending point. -------------------------------------------------------
			 */
			else {

				/*
				 * Expand the start towards the left.
				 */
				newInterval[0] = Math.min(newInterval[0], intervals[i][0]);

				/*
				 * Expand the end towards the right.
				 */
				newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			}
		}

		/*
		 * After the loop finishes, one interval is still being carried inside
		 * newInterval.
		 *
		 * It has not yet been copied into the result, so add it now.
		 */
		result[k][0] = newInterval[0];
		result[k][1] = newInterval[1];
		k++;

		/*
		 * The result array may contain unused rows.
		 *
		 * Create another array having exactly 'k' intervals.
		 */
		int[][] answer = new int[k][2];

		/*
		 * Copy only the valid merged intervals.
		 */
		for (int i = 0; i < k; i++) {

			answer[i][0] = result[i][0];
			answer[i][1] = result[i][1];
		}

		/*
		 * Return the final merged intervals.
		 */
		return answer;
	}
}
