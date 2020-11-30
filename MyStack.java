package com.stack;

import com.assignment.INode;
import com.assignment.MyLinkList;
import com.assignment.MyNode;

public class MyStack {
	public final MyLinkList myLinkList;

	public MyStack() {

		this.myLinkList = new MyLinkList();
	}

	public void push(INode myNode) {
		myLinkList.add(myNode);
	}

	public void printStack() {
		myLinkList.printMyNodes();
	}

	public INode peak() {
		return myLinkList.head;
	}

	public INode pop() {
		return myLinkList.pop();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem");
		MyStack myStack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		myStack.peak();
		while (myStack.peak().getNext() != null) {
			myStack.pop();
			System.out.println("head after pop-" + myStack.peak().getKey());
			myStack.printStack();
		}

	}
}
