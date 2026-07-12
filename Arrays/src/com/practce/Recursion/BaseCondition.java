package com.practce.Recursion;

public class BaseCondition {
	static int count = 0;
	public static void main(String[] args) {
		function();
	}
	
	static void function() {
		if(count == 4) {
			return;
		}
		System.out.println(count++);
		function();
	}
}
