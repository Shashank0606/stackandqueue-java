package com.bridgelabz.stackandqueue;

public class Stackandqueue {
	Node top;
	Node next;

	public class Node {
		int data;
		Node next;
	}

	public void Node() {
		this.top = null;
	}

	public void push(int number) {
		Node node = new Node();
		node.data = number;
		node.next = top;
		top = node;
	}

	public void printStack() {
		Node node = top;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;

		}
	}

	public static void main(String[] args) {
		Stackandqueue stackoperation = new Stackandqueue();
		stackoperation.push(70);
		stackoperation.push(30);
		stackoperation.push(56);
		stackoperation.printStack();

	}

}