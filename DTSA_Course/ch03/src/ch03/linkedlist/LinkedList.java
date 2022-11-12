/**
 * 
 */
package ch03.linkedlist;

/**
 * @author ultimate
 * A representation of a linked list
 */
public class LinkedList {

	/***
	 * Inner class Node To represent the logical Node -> [element,link]
	 * @author ultimate
	 */
	class Node {

		private int element;
		private Node link;

		/**
		 * Default constructor
		 * 
		 * @param element
		 * @param link
		 */
		public Node(int element, Node link) {
			this.element = element;
			this.link = link;
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
		 * @return the link
		 */
		public Node getLink() {
			return link;
		}

		/**
		 * @param link the link to set
		 */
		public void setLink(Node link) {
			this.link = link;
		}

	}

	//the head of the list or the first element
	private Node head;
	
	//the tail of the list or the last element
	private Node tail;
	
	//keep track of the nodes in the link list
	private int size;
	
	/***
	 * Default constructor to initialize/create a linkedlist
	 * @param none takes no parameters
	 */
	public LinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}

	/**
	 * @return the size of the linked list
	 */
	public int getSize() { return size; }

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) { this.head = head; }

	/***
	 * @return true if list is empty and false otherwise
	 */
	public boolean isEmpty() { return getSize()==0; }
	
	/***
	 * A method to insert an element into the linked list
	 * Inserts an element at the end of the list
	 * sets the element as the head if the list is empty
	 * the newly inserted element becomes the tail of the linkedlist
	 * @param e he element to be inserted
	 */
	public void addLast(int e) {
		Node newestNode = new Node(e,null);
		
		if (isEmpty())
			this.setHead(newestNode);
		else
			tail.link=newestNode;//inserting at the last position
		
		tail=newestNode;//setting the tail
		size++;
		
	}
	
	/***
	 * A method to insert an element at the beggining of the link list
	 * @param e the element to iinsert
	 */
	public void addFirst(int e) {
		Node newNode = new Node(e, null);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
		}else {
			newNode.link=head; //set link of new node as head
			this.setHead(newNode); //set the new node to head
		}
		size++;
	}
	
	/***
	 * A method to display the contents of the linked list
	 */
	public void display() {
		
		System.out.println("Size : "+this.getSize());
		
		Node currNode = head;
		
		while (currNode != null) {
			System.out.print("["+currNode.getElement()+"]:->");
			currNode=currNode.link;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(33);
		System.out.println("Original list");
		list.display();
		
		list.addFirst(0);
		System.out.println("After inserting 0 at the beggining");
		list.display();
		
		list.addFirst(-1);
		System.out.println("After inserting -1 at the beggining");
		list.display();
	}
}