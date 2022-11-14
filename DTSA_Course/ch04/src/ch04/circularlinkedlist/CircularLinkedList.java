package ch04.circularlinkedlist;


/***
 * 
 * @author ultimate
 * Implementation of the circular linkedlist
 * 
 *  <p>Just like a <em>Linear Linked List</em> a circular linkedlist has a series of nodes connected
 *  by links.</p>
 *  <h3>The only difference is that the last node of a circular linkedlist points to the first node of the list</h3> 
 */
public class CircularLinkedList {

	/***
	 * Representation of a typical Node
	 * Containing an element and a reference to the next Node
	 * @author ultimate
	 *
	 */
	private class Node{
		private int element;
		private Node link;
		/**
		 * @param element
		 * @param link
		 */
		public Node(int element, Node link) {
			this.element = element;
			this.link = link;
		}
		
	}
	/***
	 * The entry point of the list
	 */
	private Node head;
	/***
	 * The exit point of the list
	 */
	private Node tail;
	/***
	 * The number of nodes int the list list
	 */
	private int size;
	
	
	/**
	 * Default constructor for the linked list
	 * @param takes no parameters
	 * @return returns nothing
	 * Initializes the head and tail variables also the size to 0
	 */
	public CircularLinkedList() {
		head=null;
		tail=null;
		size=0;
	}


	/***
	 * 
	 * @return size the size of the linked list
	 */
	public int getSize() {
		return size;
	}
	
	/***
	 * A method to check if the lis is empty
	 * @return true/false if the size is equal to 0
	 */
	public boolean isEmpty() {
		return getSize() == 0 ;
	}
	
	/***
	 * A method to insert the node into the list
	 * @param e
	 */
	public void addLast(int e) {
		
		Node newNode = new Node(e, null);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			newNode.link=newNode;//make the node make a reference to itself
		}else {
			newNode.link=tail.link;//linking the new node to the head of the list
			tail.link=newNode;//linking the tail node to the new node
		}
		
		tail=newNode;
		size++;
	}
	
	/***
	 * A method to insert an element at the beggining of a list 
	 * @param e the value of the element to be stored in the node
	 */
	public void addFirst(int e) {
		
		Node newNode = new Node(e, null);
		
		if(isEmpty()) {
			newNode.link=newNode;
			newNode=head;
			newNode=tail;
		}else {
			tail.link=newNode;//breaks link between head and tail and links tail with new node
			newNode.link=head;//links the prev head with the new node
			head=newNode;//makes the new node the head
		}
		
		size++;
		
	}
	
	/***
	 * a method to insert a node at a given position in the list
	 * @param e the value to be stored in the node
	 * @param position the position to insert the node
	 * <br>
	 * <b>Note</b> : <h2>The counting of nodes starts at 1 not 0</h2>
	 */
	public void addAny(int e,int position) {

		//checking if the position is valid
		if(position<=0 || position>=size) {
			System.err.println("Invalid position");
			return;
		}
		
		Node newNode = new Node(e, null);
		int i=1;
		Node currNode = head;
		
		while(i<position-1) {
			currNode=currNode.link; //traversing the list
			i+=1;
		}
		/**
		 * breaks link between current node and next and assigns the new nodes link to the next node link
		 * the link to the current node points to the new node
		 * 
		 */
		newNode.link = currNode.link; 
		currNode.link = newNode;
		size++;
	}
	
	/***
	 * A method to delete a node at the {@link #head} of the list
	 * @return e the element that has been removed
	 */
	private int removeFirst() {
		
		if (isEmpty()) {
			System.err.println("List is empty");
			return -1;
		}
		int el =head.element;
		
		tail.link=head.link;
		head=head.link;
		size--;
		
		// if the list had only one element
		if(isEmpty())
			tail=head=null;
		
		
		return el;
		
	}
	
	
	/***
	 * a method to remove an element from the last position/end of a linkedlist
	 * @return e the element that has beeen deleted
	 */
	public int pop() {
		
		if (isEmpty()) {
			System.err.println("List is empty");
			return -1;
		}
		
		Node currNode = head;
		int i=1;
		
		while(i<getSize()-1) {
			currNode=currNode.link;
			i++;
		}
		
		int el= currNode.link.element;
		
		tail=currNode;
		tail.link=head;
		size--;
		
		return el;
	}
	
	/***
	 * method to delete a node at an arbitrary position in the list
	 * @param position the position of the node to delete
	 * @return the deleted nodes element
	 */
	public int deleteAny(int position) {
		
		if(isEmpty() || position>getSize() || position<= 0) {
			System.err.println("Invalid position");
			return -1;
		}
		
		Node currNode=head;
		int i=1;
		
		while(i<position-1) {
			currNode=currNode.link;
			i++;
		}
		
		int el = currNode.link.element;
		
		currNode.link=currNode.link.link;
		size--;
		
		return el;
	}
	
	/***
	 * A method to display the contents of a circular linked list
	 */
	public void display() {
		System.out.println("Size of list is : "+size);
		int i =0 ;
		Node p=head;
		
		while(i<getSize()) {
			
			if(i==getSize()-1) {
				System.out.print("["+p.element+"]-->"+"["+p.link.element);
				break;
			}
			
			System.out.print("["+p.element+"]-->");
			p=p.link;//moving cursor to next Node
			i++;
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(-1);
		list.addLast(50);
		list.addFirst(0);
		list.addAny(40,4);
		
		System.out.println("After inserting 40 at position 4");
		list.display();
		
		System.out.println("Removed element : "+list.removeFirst());
		list.display();
		
		System.out.println("Removed element : "+list.pop());
		list.display();
		
		System.out.println("Removed element : "+list.deleteAny(3)+" at position 3");
		list.display();
	}
}
