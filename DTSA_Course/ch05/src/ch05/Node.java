package ch05;
/***
 * Typical representation of a node of a doubly linkedlist
 * @author ultimate
 *
 */
public class Node {
	
	private int element;
	private Node next;
	private Node prev;
	
	/**
	 * @param element the element to be stored in the node
	 * @param next the reference to the next node 
	 * @param prev the reference to the previous node 
	 */
	public Node(int element, Node next, Node prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}

	/**
	 * @return the element
	 */
	public int getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(int element) {
		this.element = element;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the prev
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * @param prev the prev to set
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
	
}
