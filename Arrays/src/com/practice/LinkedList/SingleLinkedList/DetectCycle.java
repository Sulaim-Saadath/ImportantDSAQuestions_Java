package com.practice.LinkedList.SingleLinkedList;

import java.util.Scanner;

public class DetectCycle {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int size = scan.nextInt();
		System.out.println("Enter the elements inside the list: ");
		for(int i = 0; i< size;i++) {
			list.addNode(scan.nextInt());
		}
		Node temp = list.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		Node lastNode = temp;
		lastNode.next = list.head;
		scan.close();
		boolean result = cycleDetection(list);
		if(result) {
			System.out.println("Cycle detected");
		} else {
			System.out.println("Cycle not detected");
		}
	}
	
	public static boolean cycleDetection(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
