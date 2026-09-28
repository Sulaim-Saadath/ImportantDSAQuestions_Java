package com.practice.LinkedList.SingleLinkedList;

public class LinkedList {
	Node head = null;

	public void addNode(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public void addNodeAtFront(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		node.next = head;
		head = node;
	}

	public void addNodeInKthPosition(int k, int data) {
		Node temp = head;
		Node node = new Node(data);
		int i = 1;
		while (i < k) {
			temp = temp.next;
			i++;
		}
		node.next = temp.next;
		temp.next = node;
	}
	
	public void displayList(Node head) {
		Node temp = head;
		if(temp == null) {
			System.out.println(head);
			return;
		}
		while(temp != null) {
			if(temp.next == null)
				System.out.print(temp.data);
			else
				System.out.print(temp.data+"->");
			temp = temp.next;
		}
	}
	
	public void deleteNodeAtEnd(Node head) {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	public Node deleteNodeAtFirst(Node head) {
		if(head == null) {
			return head;
		}
		head = head.next;
		return head;
	}
}
