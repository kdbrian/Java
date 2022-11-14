/**
 * 
 */
package ch07.queue;

/**
 * @author ultimate
 *
 */
public class DoubleQueue {
	

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
	private Node front;
	
	/***
	 * the tail of the list or the last element
	 * this is the exit point of the list
	 */
	private Node rear;
	
	/***
	 * keep track of the number of nodes in the linkedlist
	 */
	private int size;
	
	/***
	 * Default constructor to initialize/create a linkedlist
	 * @param none takes no parameters
	 */
	public DoubleQueue() {
		this.front=null;
		this.rear=null;
		this.size=0;
	}

	/**
	 * @return the size of the linked list
	 */
	public int getSize() { return size; }

	/**
	 * @param head the {@link #front} to set
	 * 
	 */
	public void setHead(Node front) { this.front = front; }

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
			rear.link=newestNode;//inserting at the last position
		
		rear=newestNode;//setting the tail
		size++;
		
	}
	
	/***
	 * A method to insert an element at the beggining of the linkedlist
	 * @param e the element to insert
	 */
	public void addFirst(int e) {
		Node newNode = new Node(e, null);
		
		if(isEmpty()) {
			front=newNode;
			rear=newNode;
		}else {
			newNode.link=front; //set link of new node as head
			this.setHead(newNode); //set the new node to head
		}
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
			
			int el =front.element;
			
			front = front.link;
			
			size --;
		
		if (isEmpty()) 
			rear=null;
		
		return el;
		
	}
	
	/***
	 * Method to delete the last element of the linked list or the {@link #tail}
	 * @return the deleted element  if found and -1 if the list {@link #isEmpty()}
	 */
	public int removeLast() {
		
		if(isEmpty()) {
			System.err.println("Empty list");
			return -1;
		}
		
		Node currNode = front;
		int i=1;
		
		while (i<size -1) {
			currNode = currNode.link;
			i++;
		}
		rear=currNode;
		
		currNode = currNode.link;
		
		int el = currNode.element;
		
		rear.link=null;
		
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
		
		Node currNode = front;
		int i=0;//keeps track of the index
		
		while (currNode != null && i<size) {
			
			if( currNode.element == key)
				return i;
			
			currNode = currNode.link;
			i++;
		}
		return -1;
	}
	
	public int first() {
		if (isEmpty()) {
			System.err.println("Queue is empty");
			return -1;
		}
		
		return front.element;
	}
	
	public int last() {
		if (isEmpty()) {
			System.err.println("Queue is empty");
			return -1;
		}
		
		return rear.element;
	}
	
	/***
	 * A method to display the contents of the linked list
	 */
	public void display() {
		
		System.out.println("Size : "+this.getSize());
		
		Node currNode = front;
		
		while (currNode != null) {
			System.out.print("["+currNode.getElement()+"]:->");
			currNode=currNode.link;
		}
		System.out.println();
	}
	
}
