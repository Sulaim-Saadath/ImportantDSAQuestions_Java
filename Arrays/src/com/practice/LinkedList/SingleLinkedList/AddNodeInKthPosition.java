package com.practice.LinkedList.SingleLinkedList;

import java.util.Scanner;

public class AddNodeInKthPosition {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the list: ");
		int size = scan.nextInt();
		System.out.println("Enter the elements inside the list: ");
		for(int i = 0; i< size;i++) {
			list.addNode(scan.nextInt());
		}
		System.out.println("Enter the kth position to enter the list: ");
		int k = scan.nextInt();
		list.displayList(list.head);
		
		list.addNodeInKthPosition(k, scan.nextInt());
		list.displayList(list.head);
		scan.close();
	}
}
