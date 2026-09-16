package com.practice.LinkedList.SingleLinkedList;

import java.util.Scanner;

public class StartPointOfCycleNode {
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
		System.out.println("Enter the index of node to which node to connect: ");
		int idx = scan.nextInt();
		Node temp1 = list.head;
		for(int i = 0;i <= idx;i++) {
			temp1 = temp1.next;
		}
		lastNode.next = temp1;
		Node resNode = findStartOfCycleNode(list.head);
		System.out.println(resNode.data);
		scan.close();
	}
	public static Node findStartOfCycleNode(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				slow = head;
				while(slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
