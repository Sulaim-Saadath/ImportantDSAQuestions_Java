package com.practice.LinkedList.SingleLinkedList;

import java.util.Scanner;

public class DeleteNodeAtEnd {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int size = scan.nextInt();
		System.out.println("Enter the elements inside the list: ");
		for(int i = 0; i< size;i++) {
			list.addNode(scan.nextInt());
		}
		scan.close();
		list.displayList(list.head);
		System.out.println();
		list.deleteNodeAtEnd(list.head);
		list.displayList(list.head);
	}
}
