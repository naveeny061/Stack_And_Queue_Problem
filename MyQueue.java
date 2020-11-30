package com.stack;

import com.assignment.INode;
import com.assignment.MyLinkList;
import com.assignment.MyNode;

public class MyQueue {
	public final MyLinkList myLinkList;

	public MyQueue() {

		this.myLinkList = new MyLinkList();
	}

	public void enqueu(INode myNode) {
		myLinkList.append(myNode);
	}

	public void printQueue() {
		myLinkList.printMyNodes();
	}

	public INode deQueue() {
		return myLinkList.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue myQueue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		myQueue.enqueu(myFirstNode);
		myQueue.enqueu(mySecondNode);
		myQueue.enqueu(myThirdNode);
		myQueue.printQueue();

		myQueue.deQueue();
		myQueue.printQueue();
		myQueue.deQueue();
		myQueue.printQueue();
		myQueue.deQueue();

	}

}
