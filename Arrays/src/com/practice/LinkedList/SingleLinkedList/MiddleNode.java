package com.practice.LinkedList.SingleLinkedList;

import java.util.Scanner;

public class MiddleNode {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int size = scan.nextInt();
		System.out.println("Enter the elements inside the list: ");
		for (int i = 0; i < size; i++) {
			list.addNode(scan.nextInt());
		}
		scan.close();
		Node resNode = middleNode(list.head);
		System.out.println("Middle Node: "+ resNode.data);
	}
	public static Node middleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
}
