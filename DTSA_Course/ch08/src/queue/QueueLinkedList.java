package queue;
/**
 * 
 */


/**
 * @author ultimate
 *
 */
public class QueueLinkedList {

	class Node{
		private Object data;
		private Node next;
		
		public Node(Object data, Node next) {
			// TODO Auto-generated constructor stub
			this.data=data;
			this.next=next;
		}
		
	}
	
	private Node front;
	private Node rear;
	
	private int size;
	
	public QueueLinkedList() {
		// TODO Auto-generated constructor stub
		front=null;
		rear = null;
		size=0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enqueue(Object e) {
		Node newNode = new Node(e, null);
		
		if(isEmpty()) {
			front=newNode;
		}else {
			
			rear.next = newNode;
		}
		
		rear=newNode;
		size++;
	}
	
	public Object dequeue() {
		
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		
		Object el = front.data;
		
		front=	front.next;
		size--;
		
		if(isEmpty()) {
			rear = null;
		}
		
		return el;
	}
	
	public void display() {
		
		if(isEmpty())
			return;
		
		Node currNode= front;
		
		while(currNode != null) {
			System.out.print(currNode.data+"-");
			currNode=currNode.next;
		}
		System.out.println();
	}

	public Object front() {
		// TODO Auto-generated method stub
		return front.data;
	}

	public Object rear() {
		// TODO Auto-generated method stub
		return rear.data;
	}
}
