/**
 * 
 */
package ch06.stacks;

import javax.crypto.interfaces.DHPublicKey;

/**
 * @author ultimate
 *
 */
public class StackLinkedList {

	/***
	 * Typical representation  of the node object
	 * @author ultimate
	 *
	 */
	class Node{
		private int element;
		private Node next;
		
		public Node(int element, Node next) {
			// TODO Auto-generated constructor stub
			this.element=element;
			this.next=next;
		}
	}
	/**
	 * To keep track of the number of nodes in the stack
	 */
	private int size;

	/**
	 * To keep track of the newely inserted node
	 */
	private Node top;
	
	/***
	 * Default constructor
	 * initializes the top value and the size of the stack
	 */
	public StackLinkedList() {
		// TODO Auto-generated constructor stub
		size=0;
		top=null;
	}

	/***
	 * function to return the length of the stack
	 * does by counting the number of nodes in the stack
	 * @return
	 */
	public int length() {
		return size;
	}
	/***
	 * Function to check if stack has any element
	 * @return true/false
	 */
	public boolean isEmpty() {
		return size==0;
	}
	
	/***
	 * Function to insert an element at the begginning of the list/top of the stack
	 * @param e the value to be stored at the node
	 */
	public void push(int e) {
		
		Node newNode = new Node(e, null);
		
		if (isEmpty()) {
			newNode=top;
		}
		else {
			newNode.next = top;
			top= newNode;
		}
		size++;
	}
	
	/***
	 * Method to delete top node of the stack
	 * @return e the element that was deleted
	 */
	public int pop() {
		if(isEmpty()) {
			System.err.println("Stack is empty");
			return -1;
		}
		
		int el=top.element;
		
		top = top.next;

		size--;
		
		return el;
	}
	
	/***
	 * Method to retrieve the top element of the stack
	 * @return
	 */
	public int peek() {
		if(isEmpty()) {
			System.err.println("Empty Stack");
			return -1;
		}
		
		return top.element;
	}
	
	/***
	 * Function to display the contents of the stack
	 */
	public void display() {
		Node currNode = top;
		
		while(currNode != null) {
			System.out.print(currNode.element+"--");
			currNode=currNode.next;
		}
		System.out.println();
	}
}
