/**
 * 
 */
package ch05;

/**
 * @author ultimate
 *
 */
public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	/**
	 * @param head
	 * @param tail
	 */
	public DoublyLinkedList() {
		this.head =null;
		this.tail = null;
		this.size=0;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	/***
	 * A function to add an node to the list
	 * @param e the element to be stored in the node
	 */
	public void addlast(int e) {
		
		Node newNode = new Node(e, null, null);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		}
		
		//linking new node to the list
		tail.setNext(newNode);
		newNode.setPrev(tail);
		
		tail=newNode;//assigning tail to new node
		
		
		size++;
	}
	
	/***
	 * A method to insert a node at the begginning of the list
	 * @param e the element to be stored in  the node to be inserted
	 */
	public void addFirst(int e) {
		Node newNode = new Node(e, null, null);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		}else {
			
			/**
			 * link new node and the head of the list
			 */
			newNode.setNext(head);
			head.setPrev(newNode);
			
			head = newNode;//set new node as head
			
		}
		size++;
	}
	
	/***
	 * A method to insert a node any where in the list
	 * given a position
	 * @param e the element to be stored in the node to be inserted
	 * @param position the position to insert the node
	 * <h1>Note : <code>Counting starts from 1 <i>not 0</i></code></h1>
	 */
	public void insertAny(int e, int position) {
		
		
		if(isEmpty() || position<= 0 || position >=size) {
			System.err.println("Invalid position");
			return;
		}
		
		Node newNode = new Node(e, null, null);
		
		Node currNode = head;
		int i=1;
		
		while(i<position-1) {
			currNode=currNode.getNext();
			i++;
		}
		
		newNode.setNext(currNode.getNext());
		currNode.getNext().setPrev(newNode);
		currNode.setNext(newNode);
		newNode.setPrev(currNode);
		
		size++;
	}
	
	/***
	 * @return el the deleted element
	 */
	public int deleteFirst() {
		
		if(isEmpty()) {
			System.err.println("The list is empty");
			return -1;
		}
		
		int el = head.getElement();
		
		//making the link to the head the head
		head = head.getNext();
		size--;
		
		// checking if the list only had one element
		if(isEmpty())
			tail = null;
		else 
			head.setPrev(null);
		
		return el;
	}
	
	/***
	 * A function to display the contents of a list
	 */
	public void display() {
		System.out.println("Size is : "+size);
		if(isEmpty()) {
			System.err.println("List is empty");
			return;
		}
		
		Node currNode = head;
		
		while (currNode != null) {
			System.out.print("["+currNode.getElement()+"] -> ");
			currNode=currNode.getNext();
		}
		System.out.println();
	}
	
	
}
