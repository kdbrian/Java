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

		/***
		 * The entity to be stored in the list
		 */
		private int element;
		/***
		 * The link to the next node
		 */
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

	/***
	 * the head of the list or the first element
	 * this is the entry point of the list
	 */
	private Node head;
	
	/***
	 * the tail of the list or the last element
	 * this is the exit point of the list
	 */
	private Node tail;
	
	/***
	 * keep track of the number of nodes in the linkedlist
	 */
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
	 * @param head the {@link #head} to set
	 * 
	 */
	public void setHead(Node head) { this.head = head; }

	/***
	 * @return true if list is empty and false otherwise
	 */
	public boolean isEmpty() { return getSize()==0; }
	
	/***
	 * A method to insert an element into the linked list
	 * Inserts an element at the end of the list
	 * sets the element as the {@link #head} if the list is empty
	 * the newly inserted element becomes the {@link #tail} of the linkedlist
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
	 * A method to insert an element at the beggining of the linkedlist
	 * @param e the element to insert
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
	 * A method to insert an element at a specified position in the linked list
	 * @param e the element to be inserted
	 * @param position the position to insert the element
	 * Complexity = O(n)
	 */
	public void insertAt(int e,int position) {
		//if the position is invalid
		if (position<=0 || position>=size) {
			System.err.println("Invalid position");
			return;
		}
		
		Node newNode = new Node(e, null);
		
		Node currNode = head; //for traversing
		
		int i=1;
		
		while (i<position-1) {
			currNode  = currNode.link;
			i++;
		}
		
		newNode.link=currNode.link;
		currNode.link=newNode;
		size++;
	}
	
	/***
	 * Function to remove the first element from the list
	 * @return value of the removed node or -1 if the list {@link #isEmpty()}
	 */
	public int removeFirst() {
		
		if (isEmpty()) {
			System.err.println("Empty list");
			return -1;
		}
			
			int el =head.element;
			
			head = head.link;
			
			size --;
		
		if (isEmpty()) 
			tail=null;
		
		return el;
		
	}
	
	/***
	 * Method to delete the last element of the linked list or the {@link #tail}
	 * @return the deleted element  if found and -1 if the list {@link #isEmpty()}
	 */
	public int pop() {
		
		if(isEmpty()) {
			System.err.println("Empty list");
			return -1;
		}
		
		Node currNode = head;
		int i=1;
		
		while (i<size -1) {
			currNode = currNode.link;
			i++;
		}
		tail=currNode;
		
		currNode = currNode.link;
		
		int el = currNode.element;
		
		tail.link=null;
		
		size--;
		
		return el;
		
	}
	
	/***
	 * A method to delete any element in the linked list provided the position of the element
	 * @param position
	 * @return -1 if the position is invalid or list {@link #isEmpty()}
	 * 			otherwise the deleted element is returne
	 */
	public int deleteAny(int position) {
		
		if ( isEmpty() || position <= 0 || position> size-1) {
			System.err.println("Invalid position");
			return -1;
		}
		
		int i=1;
		Node currNode = head;
		
		
		while (i< position -1) {
			currNode=currNode.link;
			i++;
		}
		
		int el = currNode.link.element;
		
		currNode.link = currNode.link.link;
		size--;
		return el;
		
	}
	
	
	
	/***
	 * A method to traverse a linked list and search for a key
	 * @param key the element to search for
	 * @return the index of the element if found 
	 * and -1 otherwise
	 */
	public int search(int key) {
		
		if (isEmpty())
			return -1;
		
		Node currNode = head;
		int i=0;//keeps track of the index
		
		while (currNode != null && i<size) {
			
			if( currNode.element == key)
				return i;
			
			currNode = currNode.link;
			i++;
		}
		return -1;
	}
	
	/***
	 * Function to insert a node to its sorted position in
	 * the linkedlist
	 * @param e the element to be inserted
	 */
	public void insertSorted(int e) {
		
		Node newNode = new Node(e, null);
		
		if(isEmpty())
			head=newNode;
		else {
			
			Node currNode = head;
			Node currNode2 = head;
			
			while (currNode != null && currNode.element < e) {
				currNode2 = currNode;
				currNode = currNode.link;
			}
			
			//if element is smaller than all others
			if (currNode == head) {
				newNode.link = head;
				head = newNode;
			}else {
				
				newNode.link = currNode2.link;
				currNode2.link = newNode;
			}
		}
		size+=1;
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
		
		// insertion operation
		list.insertSorted(100);
		list.insertSorted(10);
		list.insertSorted(20);
		list.insertSorted(30);
		list.insertSorted(33);
		list.insertSorted(32);
		list.insertSorted(0);
		list.insertSorted(101);
		System.out.println("Original list");
		list.display();
		
//		list.addFirst(0);
//		System.out.println("After inserting 0 at the beggining");
//		list.display();
		
//		list.addFirst(-1);
//		System.out.println("After inserting -1 at the beggining");
//		list.display();
		
		
//		list.insertAt(222, 3);
//		System.out.println("After inserting 222 at the position 3");
//		list.display();
		
//		list.insertAt(90, 5);
//		list.display();
		
		// deletion operation
//		System.out.println("Deleted "+list.removeFirst());
//		list.display();
//		System.out.println("Deleted "+list.pop());
//		list.display();
//		System.out.println("After deleting : "+list.deleteAny(3));
//		list.display();
//		System.out.println("Found 20 at index : "+ list.search(200));
	}
}
