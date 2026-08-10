package com.practice.Hashing;

import java.util.*;

public class ArrayFrequency {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int[] arr = new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements inside array: ");
		for(int i = 0;i <= arr.length - 1;i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		numberFreqiency(arr);
	}
	public static void numberFreqiency(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num:arr) {
			if (map.containsKey(num)) {
				int count = map.get(num);
				map.put(num, count + 1);
			} else {
				map.put(num, 1);
			}
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			res.add(Arrays.asList(entry.getKey(), entry.getValue()));
		}
		System.out.println(res);
	}
}
