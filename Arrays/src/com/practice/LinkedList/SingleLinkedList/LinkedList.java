package com.practice.LinkedList.SingleLinkedList;

public class LinkedList {
	Node head = null;
	public void addNode(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void addNodeAtFront(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
	}
}
